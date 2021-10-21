package com.koreait.first.ch10;

import static com.koreait.first.Utils.getNumberComma;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;

import android.widget.TextView;

import com.koreait.first.R;
import com.koreait.first.Utils;

import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DailyBoxofficeActivity extends AppCompatActivity {

    private DatePicker dpTargetDt;
    private RecyclerView rvList;

    private BoxofficeAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_boxoffice);
        adapter = new BoxofficeAdapter();

        rvList = findViewById(R.id.rvList);
        dpTargetDt = findViewById(R.id.dpTargetDt);
        rvList.setAdapter(adapter);
    }

    private void network(String targetDt) {
        Retrofit rf = new Retrofit.Builder()
                .baseUrl("https://www.kobis.or.kr/kobisopenapi/webservice/rest/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        KobisService service = rf.create(KobisService.class);
        final String KEY = "1a0a7ecf96ad3364d8de70e91560767a";
        Call<BoxOfficeResultBodyVO> call = service.boxofficeSearchDailyBoxOfficeList(KEY, targetDt);

        call.enqueue(new Callback<BoxOfficeResultBodyVO>() {
            @Override
            public void onResponse(Call<BoxOfficeResultBodyVO> call, Response<BoxOfficeResultBodyVO> res) {
                if(res.isSuccessful()) {
                    BoxOfficeResultBodyVO vo = res.body();
                    BoxOfficeResultVO resultVo = vo.getBoxOfficeResult();
                    List<BoxOfficeVO> list = resultVo.getDailyBoxOfficeList();
                    //List<DailyBoxOfficeVO> list2 = vo.gtBoxOfficeResult().getDailyBoxOfficeList(); 위에 거와 같다. 체일링 으로 같이 기억한다.

                    adapter.setList(list);
                    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<BoxOfficeResultBodyVO> call, Throwable t) {

            }
        });
    }

    public void clkSearch(View v) {
        int day = dpTargetDt.getDayOfMonth();
        int mon = dpTargetDt.getMonth() + 1;
        int year = dpTargetDt.getYear();

        String date = String.format("%s%02d%02d", year, mon, day);
        network(date);

        Log.i("myLog", date);

    }
}


        /*
        Calendar c = Calendar.getInstance();
        c.set(year, mon, day);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");


        String date = sdf.format("yyyy-MM-");
        Log.i("myLog", date);
         */

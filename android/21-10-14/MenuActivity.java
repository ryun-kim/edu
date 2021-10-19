
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void call(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("tel:010-1111-2222"));
        startActivity(intent);
    }

    public void moveToActivity(View v){
        int id = v.getId();
        Class c = null;

        if(id == R.id.menuBtn1){
            c = MainActivity.class;
        }else if (id == R.id.menuBtn2){
            c = LinearActivity2.class;
        }else if (id == R.id.menuBtn3){
            c = ConstraintActivity.class;
        }else if(id == R.id.menuBtn4) {
            c = WriteActivity.class;
        } else if(id == R.id.menuBtn5) {
            c = BookPersonActivity.class;
        } else if(id == R.id.menuBtn6) {
            c = ImageViewActivity.class;
        } else if(id == R.id.menuBtn7) {
            c = PicsumActivity.class;
        }
        //분기
        Intent intent = new Intent(this,c);
        startActivity(intent);
    }

    public void moveToActivityWithText(View v){
        TextView tv = (TextView)v;
        String text = (String)tv.getText();
        Log.i("mylog",text);
        //gettext를 이용하여 구한 소스
        // 로그를 활용하여 버튼에 따라 값을 구분한다
        Class c= null;
        // null부분만 바뀌게 몰아주기를 해서 중복된 소스를 줄인다.
        /* 이제 text에 메인 ,리니어레이아웃,제약레이아웃 값을 받게 되면
        거기에 맞게끔 소스를 넘겨준다.
        c = MainActivity.class;

        c = LinearActivity2.class;

        c = ConstraintActivity.class;
         */
        switch (text) {
            case "메인":
                c = MainActivity.class;
                break;
            case "리니어레이아웃" :
                c = LinearActivity2.class;
                break;
            case "제약레이아웃":
                c = ConstraintActivity.class;
                break;
        }

        Intent intent = new Intent(this,c);
        startActivity(intent);

    }
    /*
    public void moveToMain(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void moveToLinear(View V){
        Intent intent = new Intent(this, LinearActivity2.class);
        startActivity(intent);
    }

    public void moveToConstraint(View v){
        Intent intent = new Intent(this, ConstraintActivity.class);
        startActivity(intent);
    }
    */
}

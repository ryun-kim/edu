package com.koreait.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;
import com.koreait.first.ch07.BookPersonActivity;
import com.koreait.first.ch10.DailyBoxofficeActivity;
import com.koreait.first.ch10.WeeklyBoxOfficeActivity;
import com.koreait.first.picsum.PicsumActivity;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        int result = Utils.parseStringToInt("11az",1);
        Log.i("myLog", ""+ result);


    }

    public void call(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW
                , Uri.parse("tel:010-1111-2222"));
        startActivity(intent);
    }

    public void moveToActivity(View v) {
        int id = v.getId();

        Class c = null;
        if(id == R.id.menuBtn1) {
            c = MainActivity.class;
        } else if(id == R.id.menuBtn2) {
            c = LinearActivity.class;
        } else if(id == R.id.menuBtn3) {
            c = ConstraintActivity.class;
        } else if(id == R.id.menuBtn4) {
            c = WriteActivity.class;
        } else if(id == R.id.menuBtn5) {
            c = BookPersonActivity.class;
        } else if(id == R.id.menuBtn6) {
            c = ImageViewActivity.class;
        } else if(id == R.id.menuBtn7) {
            c = PicsumActivity.class;
        } else if(id == R.id.menuBtn8) {
            c = DailyBoxofficeActivity.class;
        }else if(id == R.id.menuBtn9) {
            c = WeeklyBoxOfficeActivity.class;
        }

        if(c == null){
            //에러메시지 띄우고
            Snackbar.make(v,"준비중입니다.",Snackbar.LENGTH_SHORT).show();
            //Toast.makeText(this,"준비중",Toast.LENGTH_SHORT).show();
            return;
        }

        Intent intent = new Intent(this, c);
        startActivity(intent);
    }

    public void moveToActivityWithText(View v) {
        TextView tv = (TextView)v;
        String text = (String)tv.getText();
        Log.i("myLog", text);

        Class c = null;
        switch(text) {
            case "메인":
                c = MainActivity.class;
                break;
            case "리니어레이아웃":
                c = LinearActivity.class;
                break;
            case "제약레이아웃":
                c = ConstraintActivity.class;
                break;
        }

        Intent intent = new Intent(this, c);
        startActivity(intent);
    }
}
        /*
         분기

    public void moveToMain(View v) {
        Class c = MainActivity.class;
        Intent intent = new Intent(this, c);
        startActivity(intent);
    }
}
    }

    public void moveToLinear(View v) {
        Intent intent = new Intent(this, LinearActivity.class);
        startActivity(intent);
    }

    public void moveToConstraint(View v) {
        Intent intent = new Intent(this, ConstraintActivity2.class);
        startActivity(intent);
    }
}
         */

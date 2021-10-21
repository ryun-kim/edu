package com.koreait.first.ch10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.DatePicker;

import com.koreait.first.R;

public class WeeklyBoxOfficeActivity extends AppCompatActivity {

    private DatePicker dpTargetDt;
    private RecyclerView  rvList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weekly);
    }
}

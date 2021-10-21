package com.koreait.first.ch10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.koreait.first.R;
import com.koreait.first.Utils;

import java.util.List;

public class BoxofficeAdapter extends RecyclerView.Adapter<BoxofficeAdapter.MyViewHolder> {

    private List<BoxOfficeVO> list;
    public void setList(List<BoxOfficeVO> list) {this.list = list;}


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.item_daily_boxoffice, parent, false);
        return new BoxofficeAdapter.MyViewHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull BoxofficeAdapter.MyViewHolder holder, int position) {
        BoxOfficeVO vo = list.get(position);
        holder.setItem(vo);;
    }


    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView tvTitle;
        private TextView tvAudienceCnt;
        private TextView tvaudiAcc;

        public MyViewHolder(View v){
            super(v);
            tvTitle = v.findViewById(R.id.tvTitle);
            tvAudienceCnt = v.findViewById(R.id.tvAudienceCnt);
            tvaudiAcc = v.findViewById(R.id.tvaudiAcc);
        }

        public void setItem(BoxOfficeVO vo){
            tvTitle.setText(vo.getMovieNm());
            String comma = Utils.getNumberComma(vo.getAudiCnt());
            tvAudienceCnt.setText(comma+"명");
            tvaudiAcc.setText(Utils.getNumberComma(vo.getAudiAcc())+"명");
        }


    }
}

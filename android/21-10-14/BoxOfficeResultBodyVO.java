package com.koreait.first.ch10;

public class BoxOfficeVO {
    private String rank; // 순위
    private String movieNm; // 영화명
    private String openDt; // 개봉일
    private String audiCnt; // 해당 관람객수
    private String audiAcc; // 총 관람객수

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getMovieNm() {
        return movieNm;
    }

    public void setMovieNm(String movieNm) {
        this.movieNm = movieNm;
    }

    public String getOpenDt() {
        return openDt;
    }

    public void setOpenDt(String openDt) {
        this.openDt = openDt;
    }

    public String getAudiAcc() {
        return audiAcc;
    }

    public void setAudiAcc(String audiAcc) {
        this.audiAcc = audiAcc;
    }

    public String getAudiCnt() { return audiCnt; }

    public void setAudiCnt(String audiCnt) { this.audiCnt = audiCnt; }
}

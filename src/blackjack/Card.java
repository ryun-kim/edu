package blackjack;

public class Card {
    private String pattern;    //무늬
    private String denomination;    //숫자,값

    public Card(String pattern, String denomination){
        this.pattern = pattern;
        this.denomination = denomination;
    }

    public String getPattern() {
        return this.pattern;
    }
    public String getDenomination() {
        return this.denomination;
    }
    public int getPoint() {
        switch(denomination){
            case "A":
                return 1;
            case "J": case"Q": case"K":
                return 10;
            default: //"2"~"10" > 문자열 정수형으로 parsing (파싱)
                return Integer.parseInt(denomination);
        }
        //denomination값이 "A" >1
        // "2" > 2
        // "3" > 3
        // ...
        // "10" > 10
        // "j", "Q", "K" > 10
    }

    @Override
    public String toString() {
        return String.format("%s - %s", this.pattern, this.denomination);
    }
}

package Exam_01;

public class Card {
    private String shape;
    private String value;

    public Card(String shape, String value ){
        this.shape = shape;
        this.value = value;
    }

    public String getShape() {return this.shape;}
    public String getValue() {return this.value;}




    @Override
    public String toString() {return String.format("%s (%s)", this.shape, this.value); }
}

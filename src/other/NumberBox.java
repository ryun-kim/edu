package other;

public class NumberBox {
    private int val;

    public NumberBox(int val){
        this.val = val;
    }

    public int getVal() {
        return this.val;
    }

    @Override
    public boolean equals(Object obj){
        NumberBox temp = (NumberBox)obj;
        return temp.val ==this.val;
    }

    @Override
    public String toString(){
        //return this.val + " "; 초보코드
        //return String.valueOf(this.val); 가장 유연한 코드
        return Integer.toString(this.val);
    }
}

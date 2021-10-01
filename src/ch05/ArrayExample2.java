package ch05;

public class ArrayExample2 {
    public static void main(String[] args){
        int[] arr = new int[5];

        //0:100 1:200 2:300 3:400 4:500




        for(int i=0; i<arr.length; i++){
            arr[i] = 100 * (i + 1);
        }


        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}

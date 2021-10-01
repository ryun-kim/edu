package ch05;

public class ArrayInArrayExample {
    public static void main(String[] args){
        int[][] arr = new int[2][3];

        System.out.println(arr.length); //arr을 가르키는건 층을 가리키고
        System.out.println(arr[0].length); //arr0번을 가리키는 건 1층의 호수
        System.out.println(arr[1].length); //arr1번을 가리키는 건 2층의 호수 라고 생각하면 편하다.
        //                2
        for(int i=0; i<arr.length; i++){
            //                   3
            for(int z=0; z<arr[i].length; z++){
                System.out.printf("(%d, %d) : %d\t", i, z, arr[i][z]);
            }
            System.out.println();
        }

    }
}

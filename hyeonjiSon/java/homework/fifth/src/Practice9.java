import java.sql.SQLOutput;

public class Practice9 {
    public static void main(String[] args) {
        //문제 9. 문제은행[2]의 3번을 배열화하여 풀어보자!
        //       1, 1, 1, 2, 3, 4, 6, 9, 13, 19, 28, 41, 60, 88, 129, ...
        //      이와 같은 숫자의 규칙을 찾아 25번째 항을 구하도록 프로그램 해보자!

        final int MAX = 100;
        final int START = 3;
        final int END = 25;

        int[] arr = new int[MAX];

        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 1;

        int num = 0;

        for(int i = START; i < END; i++){
            arr[i] = arr[i-3] + arr[i-1]; //3개 앞배열 + 1개 앞배열을 더한다는 뜻?
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }

    }
}

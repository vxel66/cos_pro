package cos_1_1;

import java.util.ArrayList;
import java.util.Scanner;

public class 문제01 {

    public static int solution(int x){
        ArrayList<Integer> array = new ArrayList<>();
        int y = x+1;
        int result = 0;
        while (y > 0){
            array.add((y%10));
            y /=10;
        }
        int i=1;
        for(Integer temp : array){
            if(temp==0){
                temp=temp+1;
            }
            result += i*temp;
            i = i*10;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println("자연수 입력");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int result = solution(x);
        System.out.println(result);
    }
}

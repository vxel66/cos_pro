package cos_1_1;//import java.util.*;

class Solution {
    public int solution(int n) {
        // Write code here.
        int plus = 1;
        int a = n;
        int answer = 1;
            for(int i =2; i<n+1 ; i++){
                plus= plus+ (a-1)*2;
                System.out.println("plus:"+plus);
                answer +=plus;
                if(i%2==1&&i!=1){
                    a=a-2;
                    System.out.println("a:"+a);
                }
            }
        return answer;
    }

//        1  2  3  4        6
//        12 13 14 5        2
//        11 16 15 6
//        10 9  8  7

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n1 = 3;
        int ret1 = sol.solution(n1);

        
        // Press Run button to receive output. 
        System.out.println("이민욱_1차_1급.Solution: return value of the method is " + ret1 + " .");
        
        int n2 = 5;
        int ret2 = sol.solution(n2);
        
        // Press Run button to receive output. 
        System.out.println("이민욱_1차_1급.Solution: return value of the method is " + ret2 + " .");
    }
}
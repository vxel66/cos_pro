package cos_1_1;

import java.util.ArrayList;

class Solution3 {
    public int solution(String pos) {
        // Write code here.
        char a = (pos.split("")[0]).charAt(0);
        int b = Integer.parseInt(pos.split("")[1]);
        int answer = 0;
        ArrayList<String> list = new ArrayList<String>();

            for(char y='A'; y<'A'+8; y++ ){
                for(int i=1; i<9; i++){
                    list.add(y+"."+i);
                }
            }
        for(String temp : list){

            if(((char)(a-2)+"."+(b+1)).equals(temp)){
                System.out.println(temp);
                answer += 1;
            }
            if(((char)(a-1)+"."+(b+2)).equals(temp)){
                System.out.println(temp);
                answer += 1;
            }
            if(((char)(a+1)+"."+(b+2)).equals(temp)){
                System.out.println(temp);
                answer += 1;
            }
            if(((char)(a+2)+"."+(b+1)).equals(temp)){
                System.out.println(temp);
                answer += 1;
            }
            if(((char)(a-2)+"."+(b-1)).equals(temp)){
                System.out.println(temp);
                answer += 1;
            }
            if(((char)(a-1)+"."+(b-2)).equals(temp)){
                System.out.println(temp);
                answer += 1;
            }
            if(((char)(a+2)+"."+(b-1)).equals(temp)){
                System.out.println(temp);
                answer += 1;
            }
            if(((char)(a+1)+"."+(b-2)).equals(temp)){
                System.out.println(temp);
                answer += 1;
            }
        }



        return answer;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        String pos = "A7";
        int ret = sol.solution(pos);

        // Press Run button to receive output. 
        System.out.println("이민욱_1차_1급.Solution: return value of the method is " + ret + " .");
    }
}
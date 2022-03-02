package cos_1_1;

class Solution7{
    int solution(int[] prices){
        int INF = 1000000001;
        int tmp = INF;
        int answer = -INF;
        int i =0;
        for(int price : prices){
            if(tmp != INF){
                System.out.println(tmp +"-"+ price);
                answer = Math.max(answer, price - tmp);
                System.out.println("answer :"+answer);
            }
            tmp = Math.min(tmp, price);
            System.out.println("tmp :"+tmp);
        }
        return answer;
    }

    // The following is main method to output testcase. The main method is correct and you shall correct solution method.
    public static void main(String[] args) {
        Solution7 sol = new Solution7();
        int[] prices1 = {1, 2, 3};
        int ret1 = sol.solution(prices1);
        
        // Press Run button to receive output. 
        System.out.println("이민욱_1차_1급.Solution: return value of the method is " + ret1 + " .");
        
        int[] prices2 = {3, 1};
        int ret2 = sol.solution(prices2);
        
        // Press Run button to receive output. 
        System.out.println("이민욱_1차_1급.Solution: return value of the method is " + ret2 + " .");
    }
}
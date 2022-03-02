package cos_1_1;

import java.util.*;

class Solution4 {
    public int[] solution(int[] arrA, int[] arrB) {

        int arrA_idx = 0, arrB_idx = 0;
        int arrA_len = arrA.length;
        int arrB_len = arrB.length;
        int answer[] = new int[arrA_len + arrB_len];
        int answer_idx = 0;
//        while(@@@){
//            if(arrA[arrA_idx] < arrB[arrB_idx])
//                answer[answer_idx++] = arrA[arrA_idx++];
//            else
//                answer[answer_idx++] = arrB[arrB_idx++];
//        }

//        while(@@@)
//            answer[answer_idx++] = arrA[arrA_idx++];
//        while(@@@)
//            answer[answer_idx++] = arrB[arrB_idx++];
        return answer;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution4 sol = new Solution4();
        int[] arrA = {-2, 3, 5, 9};
        int[] arrB = {0, 1, 5};
        int[] ret = sol.solution(arrA, arrB);

        // Press Run button to receive output.
        System.out.println("이민욱_1차_1급.Solution: return value of the method is " + Arrays.toString(ret) + " .");
    }
}
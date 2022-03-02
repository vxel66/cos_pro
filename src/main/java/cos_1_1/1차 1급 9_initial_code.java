package cos_1_1;

class Solution9 {
    public String func_a(String str, int len){
        //110
        String padZero = "";
        int padSize = len-str.length();
        for(int i = 0; i < padSize; i++)
            padZero += "0";
        return padZero + str;
    }
    
    public int solution(String binaryA, String binaryB) {
        //길이가 더 긴 2진수 문자열의 길이를 구합니다.
        int maxLength = Math.max(binaryA.length(), binaryB.length());
        binaryA = func_a(binaryA, maxLength);
        binaryB = func_a(binaryB, maxLength);
        System.out.println(binaryA);
        System.out.println(binaryB);
        int hammingDistance = 0;
        for(int i = 0; i < maxLength; i++){
            System.out.print(binaryA.substring(i,i+1));
            System.out.print(binaryB.substring(i,i+1));
            System.out.println();
            if(!binaryA.substring(i,i+1).equals(binaryB.substring(i,i+1))){
                hammingDistance += 1;
            }
        }
        return hammingDistance;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution9 sol = new Solution9();
        String binaryA = "10010";
        String binaryB = "110";
        int ret = sol.solution(binaryA, binaryB);
        
        // Press Run button to receive output. 
        System.out.println("이민욱_1차_1급.Solution: return value of the method is " + ret + " .");
    }
}
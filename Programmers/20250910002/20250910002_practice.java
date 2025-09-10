class Solution {
    public int[] solution(int n, int k) {
        int[] answer = {};
        int[] data = new int[n];
        
        int i=0;
        for(; k * (i+1)<=n; i++) {
            data[i] = k * (i+1);
        }
        
        answer = new int[i];
        System.arraycopy(data, 0, answer, 0, i);
        
        return answer;
    }
}

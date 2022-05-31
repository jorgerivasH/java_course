package prediktestSolution;

public class TestNew {
    public static int[] funcDistance(int[] inputDist, int start, int end){
        int[] answer = new int[inputDist.length];
        for(int i = 0; i<inputDist.length; i++){
            if(inputDist[i]>=start&&inputDist[i]<=end){
                answer[i]=inputDist[i];
            }
        }
        return answer;
    }
    public static void main(String[] args) {

    }
}

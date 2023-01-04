package Quiz;

public class spair {
    public static void main(String[] args){
        int[] S = {1,3,4,8,13,17,20};
        int def = S[1]-S[0]; //이웃하는 점의 거리
        
        int s1=0;
        int s2=0;
        for (int i = 0; i < S.length-1; i++) {
            
            if(def >= S[i+1]-S[i])
            {
                def = S[i+1]-S[i];
                s1=S[i+1];
                s2=S[i];
            }
            
        } System.out.printf("%d, %d",s2,s1);

    }
}

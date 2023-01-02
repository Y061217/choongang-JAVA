public class ArrayTest {
    public static void main(String[] args) {
    int[][] arr01 = new int[3][3];
    int x,y;
    for (int i = 0; i < 10; i++) {
        x = (int)((Math.random()*3));
        y = (int)((Math.random()*3));
        if(arr01[x][y]==0){
            arr01[x][y]=i;
            System.out.println(x+"열"+y+"행에 입력");
        }else{
            i--;
            System.out.println("중복으로 다시 실행");
        }
        
    }

    System.out.println("완료");
    for (int[] is : arr01) {
        for (int is2 : is) {
            System.out.print(is2);
        }System.out.println();
    }
    }
       
 }



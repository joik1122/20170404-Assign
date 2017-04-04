package asdf;
import java.util.*; 

public class ddgfq {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      Random r = new Random();
      int me = r.nextInt(6) + 1;
      int com = r.nextInt(6) + 1;
     
      
      if(me > com)
         System.out.println("빙고!!!! 돈을 땄습니다.");
      else if(me < com)   
         System.out.println("이런,돈을 모두 잃었습니다.");
      else
         System.out.println("비겼습니다.");
      
      
      Scanner s = new Scanner(System.in);
      
      System.out.println("가위=1,바위=2,보=3 라고 가정한다.");
   
      int a = s.nextInt();
      int b = r.nextInt(3) + 1;
      
      if((a==1)&&(b==1)){
         System.out.println("나는 가위 컴퓨터는 가위를 냈습니다");
         System.out.println("비겼습니다");
      }
      else if((a==1)&&(b==2)){
         System.out.println("나는 가위 컴퓨터는 바위를 냈습니다");
         System.out.println("컴퓨터가 이겼습니다");
      }
      else if((a==1)&&(b==3)){
         System.out.println("나는 가위 컴퓨터는 보를 냈습니다");
         System.out.println("내가 이겼습니다");
      }
      else if((a==2)&&(b==1)){
         System.out.println("나는 바위 컴퓨터는 가위를 냈습니다");
         System.out.println("내가 이겼습니다");
      }   
      else if((a==2)&&(b==2)){
         System.out.println("나는 바위 컴퓨터는 바위를 냈습니다");
         System.out.println("비겼습니다");
      }
      else if((a==2)&&(b==3)){
         System.out.println("나는 바위 컴퓨터는 보를 냈습니다");
         System.out.println("컴퓨터가 이겼습니다");
      }
      else if((a==3)&&(b==1)){
         System.out.println("나는 보 컴퓨터는 가위를 냈습니다");
         System.out.println("컴퓨터가 이겼습니다");
      }   
      else if((a==3)&&(b==2)){
         System.out.println("나는 보 컴퓨터는 바위를 냈습니다");
         System.out.println("내가 이겼습니다");
      }
      else if((a==3)&&(b==3)){
         System.out.println("나는 보 컴퓨터는 보를 냈습니다");
         System.out.println("비겼습니다");
      }   

   }   

}
package asdf;
import java.util.*; 

public class ddgfq {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      Random r = new Random();
      int me = r.nextInt(6) + 1;
      int com = r.nextInt(6) + 1;
     
      
      if(me > com)
         System.out.println("����!!!! ���� �����ϴ�.");
      else if(me < com)   
         System.out.println("�̷�,���� ��� �Ҿ����ϴ�.");
      else
         System.out.println("�����ϴ�.");
      
      
      Scanner s = new Scanner(System.in);
      
      System.out.println("����=1,����=2,��=3 ��� �����Ѵ�.");
   
      int a = s.nextInt();
      int b = r.nextInt(3) + 1;
      
      if((a==1)&&(b==1)){
         System.out.println("���� ���� ��ǻ�ʹ� ������ �½��ϴ�");
         System.out.println("�����ϴ�");
      }
      else if((a==1)&&(b==2)){
         System.out.println("���� ���� ��ǻ�ʹ� ������ �½��ϴ�");
         System.out.println("��ǻ�Ͱ� �̰���ϴ�");
      }
      else if((a==1)&&(b==3)){
         System.out.println("���� ���� ��ǻ�ʹ� ���� �½��ϴ�");
         System.out.println("���� �̰���ϴ�");
      }
      else if((a==2)&&(b==1)){
         System.out.println("���� ���� ��ǻ�ʹ� ������ �½��ϴ�");
         System.out.println("���� �̰���ϴ�");
      }   
      else if((a==2)&&(b==2)){
         System.out.println("���� ���� ��ǻ�ʹ� ������ �½��ϴ�");
         System.out.println("�����ϴ�");
      }
      else if((a==2)&&(b==3)){
         System.out.println("���� ���� ��ǻ�ʹ� ���� �½��ϴ�");
         System.out.println("��ǻ�Ͱ� �̰���ϴ�");
      }
      else if((a==3)&&(b==1)){
         System.out.println("���� �� ��ǻ�ʹ� ������ �½��ϴ�");
         System.out.println("��ǻ�Ͱ� �̰���ϴ�");
      }   
      else if((a==3)&&(b==2)){
         System.out.println("���� �� ��ǻ�ʹ� ������ �½��ϴ�");
         System.out.println("���� �̰���ϴ�");
      }
      else if((a==3)&&(b==3)){
         System.out.println("���� �� ��ǻ�ʹ� ���� �½��ϴ�");
         System.out.println("�����ϴ�");
      }   

   }   

}
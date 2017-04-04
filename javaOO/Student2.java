package asdf;

public class Student {

	private String dclass;
	private int num;
	
	public void getclass(String cla, int num){
		this.dclass = cla;
		this.num = num;
	}
	
	public void setclass(){
		System.out.println("학과 = "+dclass+", 학번 = "+num);
	}
	
 public static void main(String[] args){
		 
		 Student st = new Student();
		
		 st.getclass("컴퓨터 정보학과",20132752);
		 st.setclass();
		
 }
}

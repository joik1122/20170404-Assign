package asdf;

public class SalaryMan {
	int salary = 1000000;
	
	public SalaryMan(){
		int salry = 1000000;
	}
	
	public SalaryMan(int money){
		this.salary = money;
	}
	
	public int getAnnualGross(){
		salary *= 5;
		return salary;
		
	}
	
	public static void main(String [] args){
		
		System.out.println(new SalaryMan().getAnnualGross());
		System.out.println(new SalaryMan(2000000).getAnnualGross());
	}

}

package asdf;

public class Account {
	
	private String owner;
	private long balance;
	
	public Account(){
		owner = "";
		balance = 0L;
	}
	
	public Account(String owner){
		this.owner = owner;
	}
	public Account(long balance){
		this.balance = balance;
	}
	public Account(String owner,long balance){
		this.owner = owner;
		this.balance = balance;
		
		System.out.println("Owner : "+owner);
		System.out.println("Balance : "+balance);
	}
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public long getBalance() {
		
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	

}

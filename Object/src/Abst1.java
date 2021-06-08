
abstract class abs {
	String name;
	int age;
	String bloodGrp;
	public abstract void read();
	protected void display() {
		System.out.println("|concrete Method|");
	}
}
public class Abst1 extends abs{

	public void read() {
		System.out.println("|Abstract Method is Running|");
		super.display();
	}
	
	public static void main(String[] args) {
	  abs A1 = new Abst1();
	  System.out.println(A1);
	  A1.read();
	  A1.display();
	  
	}

}

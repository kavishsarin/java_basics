
public class objectDemo {

	int num1;
	int num2;
	int res;
	
	public void perform() {
		res= num1+num2;
	} 
	
	public static void main(String[] args) {
		objectDemo obj= new objectDemo();
		obj.num1=3;
		obj.num2=5;
		obj.perform();
		
		System.out.println(obj.res);
}
}


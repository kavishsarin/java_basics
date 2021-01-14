package firstpck;

 public class calculator() {
	public int add(int i, int j) {
		return i+j;
	}
}

public class inheritance {
	
	
	
	public static void main(String[] args) {
		calculator c1= new calculator();
		int res1= c1.add(3,2);
		int res2= c1.add(5,6);
		System.out.print(res1);
	}

}

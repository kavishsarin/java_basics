
class Car {
	long plateNum;
	String color;
	String owner;
	boolean isExclusive;
	
	public Car(long num,String color,String owner,boolean is) {
		plateNum=num;
		this.color= color;
		this.owner=owner;
		isExclusive=is;
	}
	
	public float getSpeed() {
		float speed;
		if(isExclusive)
			speed=50;
		else 
			speed=40;
		
		return speed;
	}
}
public class Abst {

	public static void main(String[] args) {
		Car Maruti = new Car(3733,"white","Dad",false);
		System.out.println(Maruti+"Object Representing Maruti");
		System.out.println(Maruti.getSpeed());
		Car Zen = new Car(2718,"white","Dad",true);
		System.out.println(Zen);
		System.out.println(Maruti+"Object Representing Zen");
		System.out.println(Zen.getSpeed());
	}

}

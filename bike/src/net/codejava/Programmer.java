package net.codejava;

/* class sur {
      String surN= "sareen";
}
public class fullName extends sur(){
	
	public static main(String[] args) {
		fullName fN= new fullName();
		String name;
		System.out.print(name+fN.surN);
	}
}*/

class Employee{  
	 float salary=40000;  
	}  
	class Programmer extends Employee{  
	 int bonus=10000;  
	 public static void main(String args[]){  
	   Programmer p=new Programmer();  
	   System.out.println("Programmer salary is:"+p.salary);  
	   System.out.println("Bonus of Programmer is:"+p.bonus);  
	}  
	}  

package TestJava.June2023;

abstract class myClass {
	
	private void disp1() {
		
		System.out.println("Parent Class");
		
	}
	
	abstract public void disp2();	
	abstract void disp3();	
	abstract protected void disp4();

}

public class myChildClass extends myClass {
	
public void disp2(){
		
		System.out.println("In 2");
		
	}public void disp3(){
		
		System.out.println("In 3");
		
	}public void disp4(){
		
		System.out.println("In 4");
		
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		
		myChildClass mcc = new myChildClass();
		mcc.disp2();
		
	}
	
}
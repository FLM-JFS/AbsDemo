
public class Child extends Parent {
	
	

	public static void main(String[] args) {
		// Parent class ref var can hold child Object
		Parent p = new Child();
		p.m1();

	}

	@Override
	void m1() {
		System.out.println("Child M1 method");
	}

	void m4() {
		System.out.println("M4 of child");
	}

	void m5() {
		System.out.println("M5 of child");
	}

}

package Day13;

public class StaticDemo {
	
	
	static int a =10;
	int b =20;
	
	static void m1()
	{
		System.out.println("this is m1 static method...");
		
	}
	
	void m2()
	
	{
		System.out.println("this is m2 non-static method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(a);
	m1();
	//System.out.println(b); We can not access bcz b is no static
	//m2(); We can not access bcz m2 is no static method
	
	StaticDemo sd = new StaticDemo();
	System.out.println(sd.b);
	sd.m2();
	
		

	}

}

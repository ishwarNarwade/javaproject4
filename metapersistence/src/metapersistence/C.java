package metapersistence;

public class C extends B{
	public int operation()
	{
		return a1*b1;
	}
	public static void main(String[] args) {
		C c=new C();
		c.setvalue();
		System.out.println(c.operation());
	}

}

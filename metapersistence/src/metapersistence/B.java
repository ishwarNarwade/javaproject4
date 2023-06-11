package metapersistence;

public class B extends A{
	int a1,b1;
	
	public void setvalue()
	{
		A a=new A();
		a.setNo1(12);
		a.setNo2(24);
		
		a1=a.getNo1();
		b1=a.getNo2();
		
	}

}

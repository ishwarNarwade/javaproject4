package metapersistence;

public class Email_valid {
	public static void main(String[] args) {
		String email="ishwarnarwadejererfidhfhafa01@gmail.com";
		
		String s="@gmail.com";
		String ee=email.substring(email.length()-10);
		System.out.println(ee);
		
		if(ee.equals(s))
		{
			System.out.println("valid");
		}else
		{
			System.out.println("not valid");
		}
	}	


}

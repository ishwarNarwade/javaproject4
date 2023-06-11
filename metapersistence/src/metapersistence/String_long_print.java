package metapersistence;

public class String_long_print {
	public static void main(String[] args) {
		String s= "dummy text of printing typesetting industry";

		String w[]=s.split(" ");
		int len=0;
		for(int i=0;i<w.length;i++)
		{
			if(len<w[i].length())
			{
				len=w[i].length();
			}
		}
		for(int i=0;i<w.length;i++)
		{
			if(len==w[i].length())
			{
				System.out.println(len+"=  "+w[i]);
			}
		}
		
		
	
	
	}

}

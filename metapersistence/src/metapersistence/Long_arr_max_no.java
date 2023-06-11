package metapersistence;

public class Long_arr_max_no {
	public static void main(String[] args) {
		int c[]= {100,99};
		int b[][]= {{12,4,c[0],c[1],4},{3,2,99}};
		int a[]= {2,4,10,b[0][0],b[0][1],b[0][2],b[0][3],b[0][4],b[1][0],b[1][1],b[1][2],0};
		
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		int longno=0;
		for(int i=0;i<a.length;i++)
		{
			if(longno<a[i])
			{
				longno=a[i];
			}
		}
		System.out.println("long no="+longno);
		
		System.out.println("99="+b[0][3]);

	}


}

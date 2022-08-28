class Test
{
	public static void main(String[] arg)
	{
		int x=10;
		int sum=0;
		int i;
		for(i=0;i<=x;i++)
		{
			if(i%2==0)
			
				System.out.print("Sum no : "+i+", ");
			
			
			if(i%2!=0)
				System.out.println("Odd no : "+i+", ");
		}
		for(i=1;i<=x;i++)
		{
			sum=sum+i;
		}
		System.out.println("Total Sum : "+sum);
		
	}
}
class gcd
{
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter two number");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("Gcd of two numbers is"+gcd(a,b));
	}
	static int gcd(int a, int b)
	{
		if(b==0)
		{
			return a;
		}	
		else
		{
			return gcd(b,a%b);
		}
	}
}
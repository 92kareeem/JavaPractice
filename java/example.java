class example{
static int multiply(int a,int b)
{
	return a*b;
}
static double multiply(double a,double b)
{
	return a*b;
}
static int multiply(int p,int q,int r)
{
	return p*q*r;
}
}
class Main
{
public static void main(String args[])
{
	System.out.println(example.multiply(5,4));
	System.out.println(example.multiply(6,4,5));
	System.out.println(example.multiply(5.5,6.5));

}
}


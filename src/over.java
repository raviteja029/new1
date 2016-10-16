package new1;

public class over
{
int a = 10;

public void testMethod(int b)
{
	int t;
	t=a;
	System.out.println("this is ravi  " + a);
this.a = b;
System.out.println("this is one "+ t + " " +a);
}

public void testmethod1(int c){
	
	this.a=c;
	System.out.println("this is two "+ a);
	
}

public static void main(String args[]){
	
	System.out.println("this is main ");
	over bunty = new over();
	System.out.println(" this is basic "+ bunty.a);
	bunty.testMethod(5);
	System.out.println("this is muct be fve "+ bunty.a);
	bunty.testmethod1(2);
	System.out.println("this is muct be fve "+ bunty.a);
}
}


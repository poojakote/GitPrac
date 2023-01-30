package prac1;

public class Prac1 {
	public static void main(String[] args){
		int n=54321,a=0,b;
		while(n>0)
		{
		b=n%10;
		a=a*10+b;
		n=n/10;
		}
		System.out.println(a);
		
		}
}
	


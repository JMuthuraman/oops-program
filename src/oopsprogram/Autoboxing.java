package oopsprogram;

public class Autoboxing //convert int to corresponding wrapper class
{
	public static void main(String args[])
	{  
		//Converting int into Integer  
		int a=20;
		Integer i=Integer.valueOf(a);//converting int into Integer explicitly  
		Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally   
		System.out.println(a+" "+i+" "+j);  
		}
}

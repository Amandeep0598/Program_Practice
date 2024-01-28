package Java_Homework;

import java.util.Scanner;

public class PrintStringWithoutSpaces {
	
	public void stringWithoutSpace() {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter your string: ");
	String a=sc.nextLine();
	String b="";
	
	for(int i=0;i<=a.length()-1;i++)
	{
		char c=a.charAt(i);
		if(c!=' ')
		{
			b=b+c;
		}
		
	}
	System.out.println(b);
	int cg=b.length();
	System.out.println(cg);
	}
	public static void main(String[] args) {
		
		PrintStringWithoutSpaces obj= new PrintStringWithoutSpaces();
		obj.stringWithoutSpace();
		
	}

}

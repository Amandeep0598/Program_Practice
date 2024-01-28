package Java_Homework;

import java.util.Scanner;

public class Array_HW1 {
	public void Reverse_Array() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your array size");
		int arr_size= sc.nextInt();
		int arr[]= new int[ arr_size];
		if(arr_size!=0) {
			System.out.println("Enter your array elements");
			for(int i=0;i<=arr_size-1;i++) {
				System.out.println(arr[i]);
		}
		
			
		}
		
		
	}
	public static void main(String [] args) {
		Array_HW1 obj=new Array_HW1();
		obj.Reverse_Array();
		
	}

}

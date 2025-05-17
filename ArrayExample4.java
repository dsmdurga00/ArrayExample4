// WAP to print only that index which index user want to print

package practice;

import java.util.*;

public class ArrayExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Your Array Size: ");
		int size = sc.nextInt();
		int number[] = new int[size];
		
		for(int i=0; i<size; i++) {
			
			System.out.print("Enter Your" + i + " " +"Element:");
			
			 number[i] = sc.nextInt();
		}
		
		System.out.print("Enter your Index number which element have you print from 0 to " + (size-1));
		
		int index = sc.nextInt();
		
		if(index >0 && index <size) {
			
			System.out.println("The Element of Index" + index + " " + "is: " + number[index]);
		}

	}

}

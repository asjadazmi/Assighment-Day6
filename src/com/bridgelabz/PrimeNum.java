package com.bridgelabz;
import java.util.*;

public class PrimeNum {
	public static void main(String args[]) {
		int n,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
		for(int i=1;i<=n;i++){
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("prime number");
			
		}
		else {
			System.out.println("not prime");
		}
		
			
		
		}
		
		
	}



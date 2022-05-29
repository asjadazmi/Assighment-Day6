package com.bridgelabz;
import java.util.Scanner;
public class perfectNum {
	public static void main(String[] args) {
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number");
		n=sc.nextInt();
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(sum==n) {
			System.out.print("perfect number");
			
		}
		else {
			System.out.print("not perfect number");
		}
		}
	}

	
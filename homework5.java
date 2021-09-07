package com.runoob.text;
import java.util.Scanner;
public class homework5 {
		public static void main(String[] args) {
			try (Scanner sc = new Scanner(System.in)) {
				int a = sc.nextInt();
				int[] arr=new int[a];                  
				int sum = 0;
				for (int i = 0; i < arr.length; i++) {
					arr[i]=sc.nextInt();	             
				}for(int i:arr) {                     
					sum+=i;                           
				}int pj;                              
				pj=sum/a;	                            

				if(a>pj) {                                
					System.out.println(a);               
				}
			}
	}
}
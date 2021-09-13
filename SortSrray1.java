package com.runoob.text;

public class SortSrray1 {
	public static void main(String[] args) {
		int[] array = {5,6,2,7,3};
		int i,j,temp;
		for(i = 1 ;i < array.length;i++) {
			temp = array[i];
			for(j = i-1;j>=0;j--) {
				if(temp>=array[j]) {
					break;
				}
				else {
					array[j+1] = array[j];
				}
			}
			array[j+1] = temp;
		}
		System.out.println(args.toString());
	}
}

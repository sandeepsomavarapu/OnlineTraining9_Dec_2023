package com.ot9.basics;

public class ArrayEx {

	public void printEven(int array[])
	{
		for (int i : array) {
			if(i%2==0)
				System.out.println(i);
		}	
	}
		
	public static void main(String[] args) {
		int arr[] = { 32, 43, 56, 66, 23, 11, 221 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("****************");
		ArrayEx obj=new ArrayEx();
		obj.printEven(arr);
		int array[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

}

package com.ot9.fileio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ProductClient {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		Product product = new Product(123, "laptop", 23000, "electronics");
//
//		FileOutputStream fos = new FileOutputStream("products.txt");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
////Serialization
//		oos.writeObject(product);
//		System.out.println("Product Saved  Successfully");

		FileInputStream fos = new FileInputStream("products.txt");
		ObjectInputStream oos = new ObjectInputStream(fos);
//De-Serialization
		Product product =  (Product) oos.readObject();
		System.out.println(product);

	}
}

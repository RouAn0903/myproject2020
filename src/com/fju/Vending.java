package com.fju;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.io.FileInputStream;

public class Vending {

	public static void main(String[] args) {
       	
 
		
		try {
			FileInputStream fis = new FileInputStream("data.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			String s = br.readLine();
			System.out.println(s);
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			System.out.println("erro reading");
		}
			
		
			 /* 
			   int n = fis.read();
			 
			 
			System.out.println(n);
			while(n != 0 ) {
				System.out.println((char)n);
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			System.out.println("erro reading");
		}
	*/
		
		
		
		
		/*
		try {
			FileReader reader = new FileReader("data.txt");
			System.out.println("File opened");
		}catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		System.out.println("End");
		*/
	}
}



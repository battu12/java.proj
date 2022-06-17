package binaryconverter;

import java.util.Scanner;

public class Converter {
	
	    public static String toBinary(int num){
	        String binary="";
	       
			while(num > 0) {
	        binary = (num%2)+binary;
	        num /= 2;
	        }
			return binary;
	}
}
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter a nuber to convert to binary: ");
        int x = sc.nextInt();
        System.out.println(Converter.toBinary(x));
	}

}



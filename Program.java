package binaryconverter;
import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter a nuber to convert to binary: ");
        int x = sc.nextInt();
        System.out.println(Converter.toBinary(x));
	}

}



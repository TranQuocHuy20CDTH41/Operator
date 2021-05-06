package basic.dev;
/**
 * lab05
 * @author TranQuocHuy
 *
 */
import java.util.Scanner;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, T, H;
		float X, C;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap gia tri cho a: ");
		a = sc.nextInt();
		System.out.println("Nhap gia tri cho b: ");
		b = sc.nextInt();
		T = a + b;
		H = a - b;
		X = a * b;
		C = (float) a / b;
		System.out.println("Tong a va b la T = " +T);
		System.out.println("Hieu a va b la H = " +H);
		System.out.println("Tich a va b la X = " +X);
		System.out.println("Thuong a va b la C = " +C);
		/**
		 * 
		 */
		
	}

}

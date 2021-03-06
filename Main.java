package note2;

public class Main {
	public static void main(String args[]){
		System.out.println("Note 2: 變數");
		System.out.println("int 可用十進位、八進位(0開頭)、十六進位(0x開頭)表示");
		int i = 2;
		int j = 077; //0開頭表示八進位
		int k = 0xBAAC; // 0x開頭表示十六進位
		System.out.println("i = 2 = " + i);
		System.out.println("j = 077 = " + j);
		System.out.println("k = 0xBAAC = " + k);
		
		System.out.println();
		
		System.out.println("long 需要在數字最後加個L表示");
		long l = 300L;
		System.out.println("l = 300L = " + l);
		
		System.out.println();
		
		System.out.println("double 可加入指數表示精確度");
		double m = 4.02E23;
		double n = 123.4E+306D;
		System.out.println("m = 4.02E23 = " + m);
		System.out.println("n = 123.4E+306D = " + n);
	}
}

package note2;

public class Main {
	public static void main(String args[]){
		System.out.println("Note 2: �ܼ�");
		System.out.println("int �i�ΤQ�i��B�K�i��(0�}�Y)�B�Q���i��(0x�}�Y)���");
		int i = 2;
		int j = 077; //0�}�Y��ܤK�i��
		int k = 0xBAAC; // 0x�}�Y��ܤQ���i��
		System.out.println("i = 2 = " + i);
		System.out.println("j = 077 = " + j);
		System.out.println("k = 0xBAAC = " + k);
		
		System.out.println();
		
		System.out.println("long �ݭn�b�Ʀr�̫�[��L���");
		long l = 300L;
		System.out.println("l = 300L = " + l);
		
		System.out.println();
		
		System.out.println("double �i�[�J���ƪ�ܺ�T��");
		double m = 4.02E23;
		double n = 123.4E+306D;
		System.out.println("m = 4.02E23 = " + m);
		System.out.println("n = 123.4E+306D = " + n);
	}
}

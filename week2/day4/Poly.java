package week2.day4;

public class Poly {

	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
	public void add(int a,int c,int b) {
		System.out.println(a+c+b);
	}
	
	public float add(float a,float b) {
		return a+b;
		
	}
	public int add(int a) {
		return a;
		
	}
	
	public static void main(String[] args) {
		Poly boj= new Poly();
		
		 int add = boj.add(5);
		 System.out.println(add);
		
		 float add2 = boj.add(6.45f, 7.89f);
		 System.out.println(add2);
		
		boj.add(5, 8);
		boj.add(4, 6, 9);
	}
}

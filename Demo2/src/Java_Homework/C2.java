package Java_Homework;

public class C2 extends P2{

	public void sub(int a, int b) {
		System.out.println(b-a);
		super.add(10, 20);
	}
	public static void main(String[] args) {
		C2 object=new C2();
		object.sub(30, 50);
	}
}

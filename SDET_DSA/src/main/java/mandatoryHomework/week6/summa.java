package mandatoryHomework.week6;

public class summa {
	static int a=10;
	static int b=5;
	String s;
	summa(){
		System.out.println("elavenil");
	}
	
	static {
		System.out.println("tamil");
		
	}
	static {
		System.out.println("fiyaz");
		
	}

	public static void main(String[] args) {
		int b=10,c=5;
		//summa q = new summa(10,"tamil");
//		System.out.println(q.a);
//		System.out.println(q.s);
		summa q = new summa();
//		b=10;//1
//		
//		summa.b =20; //2
		
	//	q.b =30;//3
		System.out.println(a+b);
	}

}

package tugas.besar.kakas.perangkat.lunak;

public class MainApp{

	public static void main(String[] args) {
		C c = new C();
		D d = new D();
		E e = new E();
		
		System.out.println("");
		System.out.println(c.toString());
		System.out.println("Mod (11, 3) = "+c.mod(11, 3));
		System.out.println("Sqrt 9 = "+c.sqrt(9));
		System.out.println(c.add());
		System.out.println(c.sub());
		System.out.println(c.mul());
		System.out.println(c.div());
		
		System.out.println("");
		System.out.println(d.toString());
		
		System.out.println("");
		System.out.println(e.toString());
		System.out.println(e.contains("C"));
		System.out.println(e.getDataList());
		
	}

}
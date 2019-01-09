package tugas.besar.kakas.perangkat.lunak;

public class A implements AddAndSubInterface {
	public A() {
		System.out.println("Ctor di kelas " + this.getClass().getSimpleName());
	}
	
	@Override
	public int add(int n1, int n2) {
		return n1+n2;
	}

	@Override
	public int sub(int n1, int n2) {
		return n1-n2;
	}

	public String toString() {
		return "toString di kelas " + this.getClass().getSimpleName();
	}

}

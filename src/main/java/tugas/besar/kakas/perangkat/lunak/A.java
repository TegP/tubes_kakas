package tugas.besar.kakas.perangkat.lunak;

public class A {
	public A() {
		System.out.println("Ctor di kelas " + this.getClass().getSimpleName());
	}

	@Override
	public String toString() {
		return "toString di kelas " + this.getClass().getSimpleName();
	}

}

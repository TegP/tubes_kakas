package tugas.besar.kakas.perangkat.lunak;

public class C {
	private double n1, n2;

	public C() {
		System.out.println("Ctor di kelas " + this.getClass().getSimpleName());
	}

	public int add() {
		return (int) n1 + (int) n2;
	}

	public int sub() {
		return (int) n1 - (int) n2;
	}

	public double mul() {
		return n1 * n2;
	}

	public double div() {
		return n1 / n2;
	}

	@Override
	public String toString() {
		return "toString di kelas " + this.getClass().getSimpleName();
	}

}

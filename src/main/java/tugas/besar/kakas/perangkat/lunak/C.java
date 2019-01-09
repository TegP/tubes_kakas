package tugas.besar.kakas.perangkat.lunak;

public class C extends Math {
	private double n1, n2;
	private A a;
	private B b;

	public C() {
		System.out.println("Ctor di kelas " + this.getClass().getSimpleName());
		this.n1 = 0;
		this.n2 = 0;
		a = new A();
		b = new B();
	}

	public int add() {
		a.toString();
		return a.add((int) n1, (int) n2);
//		return (int) n1 + (int) n2;
	}

	public int sub() {
		a.toString();
		return a.sub((int) n1, (int) n2);
//		return (int) n1 - (int) n2;
	}

	public double mul() {
		b.toString();
		return b.mul(n1, n2);
//		return n1 * n2;
	}

	public double div() {
		b.toString();
		return n1 / n2;
	}
	
	@Override
	public int mod(int n1, int n2) {
		return super.mod(n1, n2);
	}

	@Override
	public double sqrt(double n) {
		return super.sqrt(n);
	}

	public String toString() {
		return "toString di kelas " + this.getClass().getSimpleName();
	}

}

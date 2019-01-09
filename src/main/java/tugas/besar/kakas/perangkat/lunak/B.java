package tugas.besar.kakas.perangkat.lunak;

public class B implements MulAndDivInterface {

	public B() {
		System.out.println("Ctor di kelas " + this.getClass().getSimpleName());
	}
	
	@Override
	public double pow(double n1, double n2) {
		return java.lang.Math.pow(n1, n2);
	}

	@Override
	public double mul(double n1, double n2) {
		return n1*n2;
	}

	@Override
	public double div(double n1, double n2) {
		return n1/n2;
	}

	public String toString() {
		return "toString di kelas " + this.getClass().getSimpleName();
	}

}

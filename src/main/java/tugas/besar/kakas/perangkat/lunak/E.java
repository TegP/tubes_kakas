package tugas.besar.kakas.perangkat.lunak;

import java.util.ArrayList;
import java.util.List;

public class E {

	private List dataList = new ArrayList();

	public E() {
		System.out.println("Ctor di kelas " + this.getClass().getSimpleName());
	}

	public boolean contains(String n) {
		return true;
	}

	public List getDataList() {
		return dataList;
	}

	public void setDataList(List dataList) {
		this.dataList = dataList;
	}

	@Override
	public String toString() {
		return "toString di kelas " + this.getClass().getSimpleName();
	}

}

package tugas.besar.kakas.perangkat.lunak;

import java.util.ArrayList;
import java.util.List;

public class E {

	private List dataList = new ArrayList();

	public E() {
		System.out.println("Ctor di kelas " + this.getClass().getSimpleName());
	}

	public boolean contains(String n) {
		return dataList.contains(n);
	}

	public List<String> getDataList() {
		return dataList;
	}

	public void setDataList(List<String> dataList) {
		this.dataList = dataList;
	}

	public String toString() {
		return "toString di kelas " + this.getClass().getSimpleName();
	}

}

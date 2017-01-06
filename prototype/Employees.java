package prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

  List<String> empList;

  public Employees() {
    empList = new ArrayList<String>();
  }

  public Employees(List<String> list) {
    empList = list;
  }

  public void loadData() {
    //read all employees from database and put into the list
		empList.add("Nafseer");
		empList.add("Rohan");
		empList.add("Rahul");
		empList.add("Harry");
  }

  public List<String> getEmpList() {
    return empList;
  }

  @Override
	public Object clone() throws CloneNotSupportedException{
			List<String> temp = new ArrayList<String>();
			for(String s : this.getEmpList()){
				temp.add(s);
			}
			return new Employees(temp);
	}
}

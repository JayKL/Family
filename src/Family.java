import java.util.ArrayList;
import java.util.List;

public class Family {
	String parentsarry[] = { "test" };
	String childrenarray[] = { "test" };
	List<String> listofpeople = new ArrayList<String>();

	int numberofpeopleinfamily = 0;

	public boolean male(String name) {
		if (listofpeople.stream().filter(x -> x==name).findFirst().isPresent()) {
			listofpeople.add("female");
		} else {
			listofpeople.add(name);
			listofpeople.add("male");
		}
		System.out.println(listofpeople.get(0));
		System.out.println(listofpeople.get(1));
		return true;
	}

	public boolean female(String name) {

		return true;
	}

	public boolean isMale(String name) {

		return true;
	}

	public boolean isFemale(String name) {

		return true;
	}

	public boolean setParent(String childname, String parentname) {

		return false;
	}

	public String[] getParents(String name) {
		return parentsarry;
	}

	public String[] getChildren(String name) {
		return childrenarray;
	}
}
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class Family {
	String parentsarry[] = { "test" };
	String childrenarray[] = { "test" };
	List<String> listofpeople = new ArrayList<String>();

	int numberofpeopleinfamily = 0;

	public boolean male(String name) {
		if (listofpeople.stream().filter(x -> x == name).findFirst().isPresent()) {
			int positionofname = IntStream.range(0, listofpeople.size()).filter(x -> listofpeople.get(x) == name)
					.findFirst().getAsInt();
			int positionofnamesgender = positionofname +  1;
			if (listofpeople.get(positionofnamesgender)=="female" || listofpeople.get(positionofnamesgender)=="male") {
				return false;
			}
			listofpeople.set(positionofnamesgender, "male");
		} else {
			listofpeople.add(name);
			listofpeople.add("male");
		}
		return true;
	}

	public boolean female(String name) {
		if (listofpeople.stream().filter(x -> x == name).findFirst().isPresent()) {
			int positionofname = IntStream.range(0, listofpeople.size()).filter(x -> listofpeople.get(x) == name)
					.findFirst().getAsInt();
			int positionofnamesgender = positionofname +  1;
			if (listofpeople.get(positionofnamesgender)=="male" || listofpeople.get(positionofnamesgender)=="female") {
				return false;
			}
			listofpeople.set(positionofnamesgender, "female");
		} else {
			listofpeople.add(name);
			listofpeople.add("female");
		}
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
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class Family {
	String parentsarry[] = { "test" };
	String childrenarray[] = { "test" };
	List<String> listofpeople = new ArrayList<String>();
	List<String> parentsassignments = new ArrayList<String>();

	int numberofpeopleinfamily = 0;

	public boolean male(String name) {
		if (listofpeople.stream().filter(x -> x == name).findFirst().isPresent()) {
			int positionofname = IntStream.range(0, listofpeople.size()).filter(x -> listofpeople.get(x) == name)
					.findFirst().getAsInt();
			int positionofnamesgender = positionofname + 1;
			if (listofpeople.get(positionofnamesgender) == "female"
					|| listofpeople.get(positionofnamesgender) == "male") {
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
			int positionofnamesgender = positionofname + 1;
			if (listofpeople.get(positionofnamesgender) == "male"
					|| listofpeople.get(positionofnamesgender) == "female") {
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
		if (listofpeople.stream().filter(x -> x == name).findFirst().isPresent()) {
			int positionofname = IntStream.range(0, listofpeople.size()).filter(x -> listofpeople.get(x) == name)
					.findFirst().getAsInt();
			int positionofnamesgender = positionofname + 1;
			if (listofpeople.get(positionofnamesgender) == "male") {
				return true;
			} else {
				return false;
			}
		} else {
			listofpeople.add(name);
			listofpeople.add("gender");
			return false;
		}
	}

	public boolean isFemale(String name) {
		if (listofpeople.stream().filter(x -> x == name).findFirst().isPresent()) {
			int positionofname = IntStream.range(0, listofpeople.size()).filter(x -> listofpeople.get(x) == name)
					.findFirst().getAsInt();
			int positionofnamesgender = positionofname + 1;
			if (listofpeople.get(positionofnamesgender) == "female") {
				return true;
			} else {
				return false;
			}

		} else {
			listofpeople.add(name);
			listofpeople.add("gender");
			return false;
		}
	}

	public boolean setParent(String childname, String parentname) {
		if (listofpeople.stream().filter(x -> x == parentname).findFirst().isPresent()) {
		} else {
			listofpeople.add(parentname);
			listofpeople.add("gender");
		}
		if (listofpeople.stream().filter(x -> x == childname).findFirst().isPresent()) {
		} else {
			listofpeople.add(childname);
			listofpeople.add("gender");
		}
		
		parentsassignments.add(parentname);
		parentsassignments.add(childname);
		return true;
	}

	public String[] getParents(String name) {
		return parentsarry;
	}

	public String[] getChildren(String name) {
		return childrenarray;
	}
}
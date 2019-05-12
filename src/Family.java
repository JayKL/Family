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

		if (IntStream.range(0, parentsassignments.size()).filter(x -> !(x % 2 == 0))
				.filter(x -> parentsassignments.get(x) == childname).count() < 2) {
			if (IntStream.range(0, parentsassignments.size()).filter(x -> !(x % 2 == 0))
					.filter(x -> parentsassignments.get(x) == childname).count() < 1) {
				parentsassignments.add(parentname);
				parentsassignments.add(childname);
				return true;
			} else {
				int positionofchild=IntStream.range(0, parentsassignments.size()).filter(x -> !(x % 2 == 0))
				.filter(x -> parentsassignments.get(x) == childname).findFirst().getAsInt();
				int positionofparent=positionofchild-1;
				String nameofexistingparent=parentsassignments.get(positionofparent);
				if(isMale(nameofexistingparent)) {
					if (isMale(parentname)) {
						return false;
					} else {
						parentsassignments.add(parentname);
						parentsassignments.add(childname);
						female(parentname);
						return true;
					}
				} else if (isFemale(nameofexistingparent)) {
					if (isFemale(parentname)) {
						return false;
					} else {
						parentsassignments.add(parentname);
						parentsassignments.add(childname);
						male(parentname);
						return true;
					}
				} else {
					if (isMale(parentname)) {
						parentsassignments.add(parentname);
						parentsassignments.add(childname);
						female(nameofexistingparent);
						return true;
					} else if (isFemale(parentname)) {
						parentsassignments.add(parentname);
						parentsassignments.add(childname);
						male(nameofexistingparent);
						return true;
					} else {
						System.out.println("assign a gender to a parent first, cannot determine gender");
						return false;
					}
				}
			}
		} else {
			System.out.println("cannot have more than two parents");
			return false;
		}
	}

	public String[] getParents(String name) {
		return parentsarry;
	}

	public String[] getChildren(String name) {
		return childrenarray;
	}
}
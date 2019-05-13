package Test.Family;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Family {
	private List<String> listofpeople = new ArrayList<String>();
	private List<String> parentsassignments = new ArrayList<String>();
	private List<String> ancestorlist = new ArrayList<String>();

	public boolean male(String name) {
		if (getListofpeople().stream().filter(x -> x.equals(name)).findFirst().isPresent()) {
			int positionofname = IntStream.range(0, getListofpeople().size())
					.filter(x -> (getListofpeople().get(x)).equals(name)).findFirst().getAsInt();
			int positionofnamesgender = positionofname + 1;
			if ((getListofpeople().get(positionofnamesgender)).equals("female")
					|| (getListofpeople().get(positionofnamesgender)).equals("male")) {
				return false;
			}
			getListofpeople().set(positionofnamesgender, "male");
		} else {
			getListofpeople().add(name);
			getListofpeople().add("male");
		}
		return true;
	}

	public boolean female(String name) {
		if (getListofpeople().stream().filter(x -> x.equals(name)).findFirst().isPresent()) {
			int positionofname = IntStream.range(0, getListofpeople().size())
					.filter(x -> (getListofpeople().get(x)).equals(name)).findFirst().getAsInt();
			int positionofnamesgender = positionofname + 1;
			if ((getListofpeople().get(positionofnamesgender)).equals("male")
					|| (getListofpeople().get(positionofnamesgender)).equals("female")) {
				return false;
			}
			getListofpeople().set(positionofnamesgender, "female");
		} else {
			getListofpeople().add(name);
			getListofpeople().add("female");
		}
		return true;
	}

	public boolean isMale(String name) {
		if (getListofpeople().stream().filter(x -> x.equals(name)).findFirst().isPresent()) {
			int positionofname = IntStream.range(0, getListofpeople().size())
					.filter(x -> (getListofpeople().get(x)).equals(name)).findFirst().getAsInt();
			int positionofnamesgender = positionofname + 1;
			if ((getListofpeople().get(positionofnamesgender)).equals("male")) {
				return true;
			} else {
				return false;
			}
		} else {
			getListofpeople().add(name);
			getListofpeople().add("gender");
			return false;
		}
	}

	public boolean isFemale(String name) {
		if (getListofpeople().stream().filter(x -> x.equals(name)).findFirst().isPresent()) {
			int positionofname = IntStream.range(0, getListofpeople().size())
					.filter(x -> (getListofpeople().get(x)).equals(name)).findFirst().getAsInt();
			int positionofnamesgender = positionofname + 1;
			if ((getListofpeople().get(positionofnamesgender)).equals("female")) {
				return true;
			} else {
				return false;
			}

		} else {
			getListofpeople().add(name);
			getListofpeople().add("gender");
			return false;
		}
	}

	public boolean setParent(String childname, String parentname) {
		if (getListofpeople().stream().filter(x -> x.equals(parentname)).findFirst().isPresent()) {
			// System.out.println("parent exists");
		} else {
			getListofpeople().add(parentname);
			getListofpeople().add("gender");
		}
		if (getListofpeople().stream().filter(x -> x.equals(childname)).findFirst().isPresent()) {
		} else {
			getListofpeople().add(childname);
			getListofpeople().add("gender");
		}

		if (childname.equals(parentname)) {
			// System.out.println("cannot be own parent");
			return false;

		} else {
			checkAncestor(parentname);
			if (ancestorlist.stream().filter(x -> x.equals(parentname)).findFirst().isPresent()) {
				// System.out.println("cannot be your own ancestor");
				ancestorlist = new ArrayList<String>();
				return false;
			} else {
				ancestorlist = new ArrayList<String>();

				if (IntStream.range(0, parentsassignments.size()).filter(x -> !(x % 2 == 0))
						.filter(x -> (parentsassignments.get(x)).equals(childname)).count() < 2) {
					if (IntStream.range(0, parentsassignments.size()).filter(x -> !(x % 2 == 0))
							.filter(x -> (parentsassignments.get(x)).equals(childname)).count() < 1) {
						parentsassignments.add(parentname);
						parentsassignments.add(childname);
						return true;
					} else {
						int positionofchild = IntStream.range(0, parentsassignments.size()).filter(x -> !(x % 2 == 0))
								.filter(x -> (parentsassignments.get(x)).equals(childname)).findFirst().getAsInt();
						int positionofparent = positionofchild - 1;
						String nameofexistingparent = parentsassignments.get(positionofparent);
						if (isMale(nameofexistingparent)) {
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
								// System.out.println("assign a gender to a parent first, cannot determine
								// gender");
								return false;
							}
						}
					}
				} else {
					// System.out.println("cannot have more than two parents");
					return false;
				}

			}

		}
	}

	public String[] getParents(String name) {
		if (getListofpeople().stream().filter(x -> x.equals(name)).findFirst().isPresent()) {
		} else {
			getListofpeople().add(name);
			getListofpeople().add("gender");
		}
		List<String> parentlist = IntStream.range(0, parentsassignments.size()).filter(x -> !(x % 2 == 0))
				.filter(x -> (parentsassignments.get(x)).equals(name)).mapToObj(x -> parentsassignments.get(x - 1))
				.collect(Collectors.toList());
		Collections.sort(parentlist);
		String parentarray2[] = new String[parentlist.size()];
		parentarray2 = parentlist.toArray(new String[parentlist.size()]);
		return parentarray2;
	}

	public String[] getChildren(String name) {
		if (getListofpeople().stream().filter(x -> x.equals(name)).findFirst().isPresent()) {
		} else {
			getListofpeople().add(name);
			getListofpeople().add("gender");
		}
		List<String> childrenlist = IntStream.range(0, parentsassignments.size()).filter(x -> x % 2 == 0)
				.filter(x -> (parentsassignments.get(x)).equals(name)).mapToObj(x -> parentsassignments.get(x + 1))
				.collect(Collectors.toList());
		Collections.sort(childrenlist);
		String childrenarray[] = new String[childrenlist.size()];
		childrenarray = childrenlist.toArray(new String[childrenlist.size()]);
		return childrenarray;
	}

	private String[] checkAncestor(String getparentsof) {

		String returnarray[] = new String[2];

		Optional<String[]> getparentsoptional = Optional.of(getParents(getparentsof));

		if (getparentsoptional.isPresent()) {
			Stream<String> addcurrentparents = Arrays.stream(getParents(getparentsof));
			Stream<String> runsrecursion = Arrays.stream(getParents(getparentsof));
			List<String> ancestorlisttemp = addcurrentparents.collect(Collectors.toList());
			runsrecursion.map(x -> checkAncestor(x)).filter(x -> x == (null)).forEach(x -> System.out.println(x));
			ancestorlist.addAll(ancestorlisttemp);
			return returnarray;
		} else {
			return returnarray;
		}
	}

	public List<String> getListofpeople() {
		return this.listofpeople;
	}

	public void setListofpeople(List<String> listofpeople) {
		this.listofpeople = listofpeople;
	}
}
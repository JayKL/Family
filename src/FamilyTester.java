import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FamilyTester {
	String adult = "Henry";
	String child = "child";
	String testarray[] = { "test" };
	Family fam = new Family();

	@Test
	void testMale() {
		fam.listofpeople.add("Barry");
		fam.listofpeople.add("female");
		fam.listofpeople.add("Henryz");
		fam.listofpeople.add("female");

		assertTrue(fam.male(adult));

		System.out.println(fam.listofpeople.get(0));
		System.out.println(fam.listofpeople.get(1));
		System.out.println(fam.listofpeople.get(2));
		System.out.println(fam.listofpeople.get(3));
		System.out.println(fam.listofpeople.get(4));
		System.out.println(fam.listofpeople.get(5));
	}

	@Test
	void testFemale() {

		assertTrue(fam.female(adult));
	}

	@Test
	void testisMale() {

		assertTrue(fam.isMale(adult));
	}

	@Test
	void testisFemale() {

		assertTrue(fam.isFemale(adult));
	}

	@Test
	void testsetParents() {

		assertFalse(fam.setParent(child, adult));
	}

	@Test
	void testgetParents() {

		assertArrayEquals(testarray, fam.getParents("hi"));
	}

	@Test
	void testgetChildren() {

		assertArrayEquals(testarray, fam.getChildren("hi"));
	}

}

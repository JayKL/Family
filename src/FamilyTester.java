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
		fam.listofpeople.add("male");
		fam.listofpeople.add("Henry");
		fam.listofpeople.add("female");
		fam.listofpeople.add("Joy");
		fam.listofpeople.add("gender");

		assertFalse(fam.male("Henry"));
	}

	@Test
	void testMale2() {
		fam.listofpeople.add("Barry");
		fam.listofpeople.add("male");
		fam.listofpeople.add("Henry");
		fam.listofpeople.add("female");
		fam.listofpeople.add("Joy");
		fam.listofpeople.add("gender");

		assertTrue(fam.male("Joy"));
	}

	@Test
	void testMale3() {
		fam.listofpeople.add("Barry");
		fam.listofpeople.add("male");
		fam.listofpeople.add("Henry");
		fam.listofpeople.add("female");
		fam.listofpeople.add("Joy");
		fam.listofpeople.add("gender");

		assertTrue(fam.male("Harold"));

	}

	@Test
	void testMale4() {
		fam.listofpeople.add("Barry");
		fam.listofpeople.add("male");
		fam.listofpeople.add("Henry");
		fam.listofpeople.add("female");
		fam.listofpeople.add("Joy");
		fam.listofpeople.add("gender");

		assertFalse(fam.male("Barry"));
	}

	@Test
	void testFemale() {
		fam.listofpeople.add("Barry");
		fam.listofpeople.add("male");
		fam.listofpeople.add("Henry");
		fam.listofpeople.add("female");
		fam.listofpeople.add("Joy");
		fam.listofpeople.add("gender");

		assertTrue(fam.female("Pingu"));

	}

	@Test
	void testFemale2() {
		fam.listofpeople.add("Barry");
		fam.listofpeople.add("male");
		fam.listofpeople.add("Henry");
		fam.listofpeople.add("female");
		fam.listofpeople.add("Joy");
		fam.listofpeople.add("gender");

		assertFalse(fam.female("Henry"));
	}

	@Test
	void testFemale3() {
		fam.listofpeople.add("Barry");
		fam.listofpeople.add("male");
		fam.listofpeople.add("Henry");
		fam.listofpeople.add("female");
		fam.listofpeople.add("Joy");
		fam.listofpeople.add("gender");

		assertTrue(fam.female("Joy"));
	}

	@Test
	void testFemale4() {
		fam.listofpeople.add("Barry");
		fam.listofpeople.add("male");
		fam.listofpeople.add("Henry");
		fam.listofpeople.add("female");
		fam.listofpeople.add("Joy");
		fam.listofpeople.add("gender");

		assertFalse(fam.female("Barry"));
	}

	@Test
	void testisMale() {
		fam.listofpeople.add("Barry");
		fam.listofpeople.add("male");
		fam.listofpeople.add("Henry");
		fam.listofpeople.add("female");
		fam.listofpeople.add("Joy");
		fam.listofpeople.add("gender");

		assertTrue(fam.isMale("Barry"));
	}

	@Test
	void testisMale2() {
		fam.listofpeople.add("Barry");
		fam.listofpeople.add("male");
		fam.listofpeople.add("Henry");
		fam.listofpeople.add("female");
		fam.listofpeople.add("Joy");
		fam.listofpeople.add("gender");

		assertFalse(fam.isMale("Henry"));
	}

	@Test
	void testisMale3() {
		fam.listofpeople.add("Barry");
		fam.listofpeople.add("male");
		fam.listofpeople.add("Henry");
		fam.listofpeople.add("female");
		fam.listofpeople.add("Joy");
		fam.listofpeople.add("gender");

		assertFalse(fam.isMale("Joy"));
	}

	@Test
	void testisMale4() {
		fam.listofpeople.add("Barry");
		fam.listofpeople.add("male");
		fam.listofpeople.add("Henry");
		fam.listofpeople.add("female");
		fam.listofpeople.add("Joy");
		fam.listofpeople.add("gender");

		assertFalse(fam.isMale("Pingu"));
	}
	@Test
	void testisFemale() {
		fam.listofpeople.add("Barry");
		fam.listofpeople.add("male");
		fam.listofpeople.add("Henry");
		fam.listofpeople.add("female");
		fam.listofpeople.add("Joy");
		fam.listofpeople.add("gender");

		assertTrue(fam.isFemale("Henry"));
	}
	@Test
	void testisFemale2() {
		fam.listofpeople.add("Barry");
		fam.listofpeople.add("male");
		fam.listofpeople.add("Henry");
		fam.listofpeople.add("female");
		fam.listofpeople.add("Joy");
		fam.listofpeople.add("gender");

		assertFalse(fam.isFemale("Barry"));
	}
	@Test
	void testisFemale3() {
		fam.listofpeople.add("Barry");
		fam.listofpeople.add("male");
		fam.listofpeople.add("Henry");
		fam.listofpeople.add("female");
		fam.listofpeople.add("Joy");
		fam.listofpeople.add("gender");

		assertFalse(fam.isFemale("Joy"));
	}
	@Test
	void testisFemale4() {
		fam.listofpeople.add("Barry");
		fam.listofpeople.add("male");
		fam.listofpeople.add("Henry");
		fam.listofpeople.add("female");
		fam.listofpeople.add("Joy");
		fam.listofpeople.add("gender");

		assertFalse(fam.isFemale("Pingu"));
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

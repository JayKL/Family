import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FamilyTester {
	String adult = "Henry";
	String child = "child";
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
		System.out.println("SetParenttestprint1");
		fam.setParent("Charles", "Penny");
		fam.female("Penny");
		fam.setParent("Harold", "Charles");
		fam.setParent("Jane", "Harold");
		fam.setParent("Charles", "Kane");
		assertFalse(fam.setParent("Charles", "Pingu"));
	}

	
	@Test
	void testsetParents2() {
		fam.setParent("Charles", "Penny");
		fam.setParent("Harold", "Charles");
		fam.male("Charles");

		fam.setParent("Harold", "Jane");
		assertTrue(fam.isFemale("Jane"));
	}
	
	@Test
	void testsetParents3() {
		fam.setParent("Charles", "Penny");
		fam.setParent("Harold", "Charles");
		fam.female("Charles");

		fam.setParent("Harold", "Jane");
		assertTrue(fam.isMale("Jane"));
	}
	
	
	@Test
	void testsetParents4() {
		System.out.println("SetParenttestprint2");
		fam.setParent("Charles", "Penny");
		fam.setParent("Harold", "Charles");
		assertFalse(fam.setParent("Harold", "Jane"));
	}
	
	@Test
	void testgetParents() {
		System.out.println("getparents");
		fam.setParent("Charles", "Penny");
		fam.female("Penny");
		fam.setParent("Harold", "Charles");
		fam.setParent("Jane", "Harold");
		fam.setParent("Charles", "Kane");
		String pararray[] = {"Penny","Kane"};
		assertArrayEquals(pararray, fam.getParents("Charles"));
	}

	@Test
	void testgetChildren() {
		System.out.println("getChildren");
		fam.setParent("Charles", "Penny");
		fam.female("Penny");
		fam.setParent("Harold", "Charles");
		fam.setParent("Jane", "Harold");
		fam.setParent("Charles", "Kane");
		fam.setParent("Jake", "Charles");
		fam.setParent("Pingu", "Charles");

		String childarray[] = {"Harold","Jake","Pingu"};
		assertArrayEquals(childarray, fam.getChildren("Charles"));
		
	}

}

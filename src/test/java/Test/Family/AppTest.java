package Test.Family;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	Family fam = new Family();

	@Test
	public void testMale() {
		fam.listofpeople.add("Barry");
		fam.listofpeople.add("male");
		fam.listofpeople.add("Henry");
		fam.listofpeople.add("female");
		fam.listofpeople.add("Joy");
		fam.listofpeople.add("gender");

		assertFalse(fam.male("Henry"));
	}

	@Test
	public void testMale2() {
		fam.listofpeople.add("Barry");
		fam.listofpeople.add("male");
		fam.listofpeople.add("Henry");
		fam.listofpeople.add("female");
		fam.listofpeople.add("Joy");
		fam.listofpeople.add("gender");

		assertTrue(fam.male("Joy"));
	}

	@Test
	public void testMale3() {
		fam.listofpeople.add("Barry");
		fam.listofpeople.add("male");
		fam.listofpeople.add("Henry");
		fam.listofpeople.add("female");
		fam.listofpeople.add("Joy");
		fam.listofpeople.add("gender");

		assertTrue(fam.male("Harold"));

	}

	@Test
	public void testMale4() {
		fam.listofpeople.add("Barry");
		fam.listofpeople.add("male");
		fam.listofpeople.add("Henry");
		fam.listofpeople.add("female");
		fam.listofpeople.add("Joy");
		fam.listofpeople.add("gender");

		assertFalse(fam.male("Barry"));
	}

	@Test
	public void testFemale() {
		fam.listofpeople.add("Barry");
		fam.listofpeople.add("male");
		fam.listofpeople.add("Henry");
		fam.listofpeople.add("female");
		fam.listofpeople.add("Joy");
		fam.listofpeople.add("gender");

		assertTrue(fam.female("Pingu"));

	}

	@Test
	public void testFemale2() {
		fam.listofpeople.add("Barry");
		fam.listofpeople.add("male");
		fam.listofpeople.add("Henry");
		fam.listofpeople.add("female");
		fam.listofpeople.add("Joy");
		fam.listofpeople.add("gender");

		assertFalse(fam.female("Henry"));
	}

	@Test
	public void testFemale3() {
		fam.listofpeople.add("Barry");
		fam.listofpeople.add("male");
		fam.listofpeople.add("Henry");
		fam.listofpeople.add("female");
		fam.listofpeople.add("Joy");
		fam.listofpeople.add("gender");

		assertTrue(fam.female("Joy"));
	}

	@Test
	public void testFemale4() {
		fam.listofpeople.add("Barry");
		fam.listofpeople.add("male");
		fam.listofpeople.add("Henry");
		fam.listofpeople.add("female");
		fam.listofpeople.add("Joy");
		fam.listofpeople.add("gender");

		assertFalse(fam.female("Barry"));
	}

	@Test
	public void testisMale() {
		fam.listofpeople.add("Barry");
		fam.listofpeople.add("male");
		fam.listofpeople.add("Henry");
		fam.listofpeople.add("female");
		fam.listofpeople.add("Joy");
		fam.listofpeople.add("gender");

		assertTrue(fam.isMale("Barry"));
	}

	@Test
	public void testisMale2() {
		fam.listofpeople.add("Barry");
		fam.listofpeople.add("male");
		fam.listofpeople.add("Henry");
		fam.listofpeople.add("female");
		fam.listofpeople.add("Joy");
		fam.listofpeople.add("gender");

		assertFalse(fam.isMale("Henry"));
	}

	@Test
	public void testisMale3() {
		fam.listofpeople.add("Barry");
		fam.listofpeople.add("male");
		fam.listofpeople.add("Henry");
		fam.listofpeople.add("female");
		fam.listofpeople.add("Joy");
		fam.listofpeople.add("gender");

		assertFalse(fam.isMale("Joy"));
	}

	@Test
	public void testisMale4() {
		fam.listofpeople.add("Barry");
		fam.listofpeople.add("male");
		fam.listofpeople.add("Henry");
		fam.listofpeople.add("female");
		fam.listofpeople.add("Joy");
		fam.listofpeople.add("gender");

		assertFalse(fam.isMale("Pingu"));
	}

	@Test
	public void testisFemale() {
		fam.listofpeople.add("Barry");
		fam.listofpeople.add("male");
		fam.listofpeople.add("Henry");
		fam.listofpeople.add("female");
		fam.listofpeople.add("Joy");
		fam.listofpeople.add("gender");

		assertTrue(fam.isFemale("Henry"));
	}

	@Test
	public void testisFemale2() {
		fam.listofpeople.add("Barry");
		fam.listofpeople.add("male");
		fam.listofpeople.add("Henry");
		fam.listofpeople.add("female");
		fam.listofpeople.add("Joy");
		fam.listofpeople.add("gender");

		assertFalse(fam.isFemale("Barry"));
	}

	@Test
	public void testisFemale3() {
		fam.listofpeople.add("Barry");
		fam.listofpeople.add("male");
		fam.listofpeople.add("Henry");
		fam.listofpeople.add("female");
		fam.listofpeople.add("Joy");
		fam.listofpeople.add("gender");

		assertFalse(fam.isFemale("Joy"));
	}

	@Test
	public void testisFemale4() {
		fam.listofpeople.add("Barry");
		fam.listofpeople.add("male");
		fam.listofpeople.add("Henry");
		fam.listofpeople.add("female");
		fam.listofpeople.add("Joy");
		fam.listofpeople.add("gender");

		assertFalse(fam.isFemale("Pingu"));
	}

	@Test
	public void testsetParents() {
		System.out.println("SetParenttestprint1");
		fam.setParent("Charles", "Penny");
		fam.female("Penny");
		fam.setParent("Harold", "Charles");
		fam.setParent("Jane", "Harold");
		fam.setParent("Charles", "Kane");
		assertFalse(fam.setParent("Charles", "Pingu"));
	}

	@Test
	public void testsetParents2() {
		fam.setParent("Charles", "Penny");
		fam.setParent("Harold", "Charles");
		fam.male("Charles");

		fam.setParent("Harold", "Jane");
		assertTrue(fam.isFemale("Jane"));
	}

	@Test
	public void testsetParents3() {
		fam.setParent("Charles", "Penny");
		fam.setParent("Harold", "Charles");
		fam.female("Charles");

		fam.setParent("Harold", "Jane");
		assertTrue(fam.isMale("Jane"));
	}

	@Test
	public void testsetParents4() {
		System.out.println("SetParenttestprint2");
		fam.setParent("Charles", "Penny");
		fam.setParent("Harold", "Charles");
		assertFalse(fam.setParent("Harold", "Jane"));
	}

	@Test
	public void testgetParents() {
		System.out.println("getparents");
		fam.setParent("Charles", "Penny");
		fam.female("Penny");
		fam.setParent("Harold", "Charles");
		fam.setParent("Jane", "Harold");
		fam.setParent("Charles", "Kane");
		String pararray[] = { "Kane", "Penny" };
		assertArrayEquals(pararray, fam.getParents("Charles"));
	}

	@Test
	public void testgetParents2() {
		String emptyarry[]= {};
		assertArrayEquals(emptyarry,fam.getParents("Harry"));
	}
	
	@Test
	public void testgetChildren() {
		System.out.println("getChildren");
		fam.setParent("Charles", "Penny");
		fam.female("Penny");
		fam.setParent("Pingu", "Charles");
		fam.setParent("Jane", "Harold");
		fam.setParent("Charles", "Kane");
		fam.setParent("Harold", "Charles");
		fam.setParent("Jake", "Charles");

		String childarray[] = { "Harold", "Jake", "Pingu" };
		assertArrayEquals(childarray, fam.getChildren("Charles"));

	}
	
	@Test
	public void testgetChildren2() {
		String emptyarry[]= {};
		assertArrayEquals(emptyarry,fam.getChildren("Harry"));
	}

	@Test
	public void testingAncestorChecker() {
		System.out.println("Ancestor Check start");
		fam.female("Penny");

		fam.setParent("Penny", "a");
		fam.setParent("a", "b");

		fam.setParent("Charles", "Penny");
		fam.setParent("Pingu", "Charles");
		fam.setParent("Charles", "Kane");
		fam.male("Charles");

		fam.setParent("Pingu", "Harry");
		fam.setParent("Harry", "Foster");
		fam.setParent("Foster", "Howard");
		fam.setParent("Howard", "e");
		fam.male("e");
		fam.setParent("Howard", "f");

		fam.setParent("j", "x");

		fam.setParent("Leslie", "Pingu");


		assertFalse(fam.setParent("Penny", "Foster"));

		System.out.println("Ancestor Check end");

	}

}
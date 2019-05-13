package Test.Family;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AppTest {

	Family fam = new Family();
	
	@Before
	public void init() {
		fam.getListofpeople().add("Barry");
		fam.getListofpeople().add("male");
		fam.getListofpeople().add("Henry");
		fam.getListofpeople().add("female");
		fam.getListofpeople().add("Joy");
		fam.getListofpeople().add("gender");
	}
	
	@After
	public void tearDown() {
		 this.fam = new Family();
	}
		
	@Test
	public void testMale() {
		assertFalse(fam.male("Henry"));
	}

	@Test
	public void testMale2() {
		assertTrue(fam.male("Joy"));
	}

	@Test
	public void testMale3() {
		assertTrue(fam.male("Harold"));

	}

	@Test
	public void testMale4() {
		assertFalse(fam.male("Barry"));
	}

	@Test
	public void testFemale() {
		assertTrue(fam.female("Pingu"));
	}

	@Test
	public void testFemale2() {
		assertFalse(fam.female("Henry"));
	}

	@Test
	public void testFemale3() {
		assertTrue(fam.female("Joy"));
	}

	@Test
	public void testFemale4() {
		assertFalse(fam.female("Barry"));
	}

	@Test
	public void testisMale() {
		assertTrue(fam.isMale("Barry"));
	}

	@Test
	public void testisMale2() {
		assertFalse(fam.isMale("Henry"));
	}

	@Test
	public void testisMale3() {
		assertFalse(fam.isMale("Joy"));
	}

	@Test
	public void testisMale4() {
		assertFalse(fam.isMale("Pingu"));
	}

	@Test
	public void testisFemale() {
		assertTrue(fam.isFemale("Henry"));
	}

	@Test
	public void testisFemale2() {
		assertFalse(fam.isFemale("Barry"));
	}

	@Test
	public void testisFemale3() {
		assertFalse(fam.isFemale("Joy"));
	}

	@Test
	public void testisFemale4() {
		assertFalse(fam.isFemale("Pingu"));
	}

	@Test
	public void testsetParents() {
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
		fam.setParent("Charles", "Penny");
		fam.setParent("Harold", "Charles");
		assertFalse(fam.setParent("Harold", "Jane"));
	}

	@Test
	public void testgetParents() {
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
		String emptyarry[] = {};
		assertArrayEquals(emptyarry, fam.getParents("Harry"));
	}

	@Test
	public void testgetChildren() {
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
		String emptyarry[] = {};
		assertArrayEquals(emptyarry, fam.getChildren("Harry"));
	}

	@Test
	public void testingAncestorChecker() {
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
	}

}
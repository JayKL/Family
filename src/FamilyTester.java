import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FamilyTester {
	String adult="Henry";
	String child="child";
	String testarray[]= {"test"};
	Family fam=new Family();
	@Test
	void testMale() {
	
	assertTrue(fam.male(adult));
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
	
	assertFalse(fam.setParent(child,adult));
	}
	@Test
	void testgetParents() {
	
	assertArrayEquals(testarray,fam.getParents("hi"));
	}
	@Test
	void testgetChildren() {
	
		assertArrayEquals(testarray,fam.getChildren("hi"));
	}

	
	

}

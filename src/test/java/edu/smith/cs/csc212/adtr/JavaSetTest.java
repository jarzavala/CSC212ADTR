package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaSet;

public class JavaSetTest {
	
	@Test
	public void testEmpty() {
		SetADT<String> empty = new JavaSet<>();
		assertEquals(empty.size(), 0);
	}
	
	//insert, contains, replace 2 cases
	@Test
	public void testInsertOnce() {
		//impossible to test size fully without also calling insert
		SetADT<String> one = new JavaSet<>();
		one.insert("A");
		assertEquals(one.size(), 1);
	}
	
	@Test
	public void testRepeatedInsert() {
		SetADT<String> ab = new JavaSet<>();
		//for (int i = 0; i < 1000; i++) {
			//ab.insert("C");
		//}
		ab.insert("A");
		ab.insert("B");
		ab.insert("B");
		ab.insert("B");
		assertEquals(ab.size(), 2);
		//assertEquals(ab.contains("A"), true);
		//assertEquals(ab.contains("B"), true);
	}
	
	@Test
	public void testSize() {
		SetADT<String> sizeset = new JavaSet<>();
		sizeset.insert("A");
		//assertEquals(sizeset.size(), sizeset.size());
		assertEquals(sizeset.size(), 1);
	}
	
	@Test
	public void testContainsOnce() {
		SetADT<String> containsset = new JavaSet<>();
		containsset.insert("A");
		assertEquals(containsset.contains("A"), true);
	}
	
	@Test
	public void testContainsRepeated() {
		SetADT<String> containsset = new JavaSet<>();
		containsset.insert("A");
		containsset.insert("B");
		assertEquals(containsset.contains("A"), true);
		assertEquals(containsset.contains("B"), true);
	}
	
	@Test
	public void testRemove() {
		SetADT<String> removeset = new JavaSet<>();
		removeset.insert("A");
		removeset.remove("A");
		assertEquals(removeset.size(), 0);
	}
	
}

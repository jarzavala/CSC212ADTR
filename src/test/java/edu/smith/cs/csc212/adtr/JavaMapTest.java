package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaMap;

public class JavaMapTest {
	
	// You might want this; if you're using Map<String, Integer> anywhere...
	// JUnit has an assertEquals(Object, Object) and an assertEquals(int, int).
	// When you give it assertEquals(Integer, int) it doesn't know which to use (but both would be OK!)
	// This method gets around that by forcing the (int, int) version.
	void assertIntEq(int x, int y) {
		assertEquals(x, y);
	}

	@Test
	public void testEmpty() {
		MapADT<String, String> empty = new JavaMap<>();
		assertEquals(empty.size(), 0);
		//Assert.assert
	}
	
	@Test
	public void testPut() {
		MapADT<Integer, String> putset = new JavaMap<>();
		putset.put(1, "A");
		assertEquals(putset.size(), 1);
	}
	
	@Test
	public void testGet() {
		MapADT<Integer, String> getset = new JavaMap<>();
		getset.put(1, "A");
		getset.get(1);
		assertEquals(getset.get(1) == "A", true);
	}
	
	@Test
	public void testSize() {
		MapADT<Integer, String> sizeset = new JavaMap<>();
		sizeset.put(1, "A");
		assertEquals(sizeset.size(), 1);
	}
	
	@Test
	public void testRemove() {
		MapADT<Integer, String> removeset = new JavaMap<>();
		removeset.put(1, "A");
		removeset.remove(1);
		assertEquals(removeset.size(), 0);
	}	
	
}

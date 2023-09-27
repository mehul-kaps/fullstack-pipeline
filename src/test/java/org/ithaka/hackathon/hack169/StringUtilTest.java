package org.ithaka.hackathon.hack169;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class StringUtilTest {

	@Test
	public void testLen() {
		assertEquals(7, StringUtils.len("hack169"));
		assertNotEquals(1384, StringUtils.len("hack169"));
	}
	
	@Test
	public void testMerge() {
		assertEquals("hack169abc", StringUtils.merge("hack169", "abc"));
		assertEquals("awesomehack", StringUtils.merge("awesome", "hack"));
		assertNotEquals("Mehul", StringUtils.merge("hack169", "abc"));
	}
}

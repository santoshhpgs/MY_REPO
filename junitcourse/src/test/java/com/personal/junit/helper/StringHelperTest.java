package com.personal.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {
	
	StringHelper sh = new StringHelper();

	@Test
	public void testTruncateAInFirst2Positions_Firsttwo() {
		assertEquals("CD", sh.truncateAInFirst2Positions("AACD"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_Firstone() {
		assertEquals("CD", sh.truncateAInFirst2Positions("ACD"));
	}

}

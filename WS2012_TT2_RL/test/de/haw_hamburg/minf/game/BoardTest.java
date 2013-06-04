package de.haw_hamburg.minf.game;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoardTest {

	@Test
	public void testSetCross() {
		Board b = new Board();
		b.setCross(1);
		int[] expected = {1,0,0,0,0,0,0,0,0};
		assertArrayEquals(expected, b.getBoardState());
	}

	@Test
	public void testSetCircle() {
		Board b = new Board();
		b.setCircle(1);
		int[] expected = {2,0,0,0,0,0,0,0,0};
		assertArrayEquals(expected, b.getBoardState());
	}

}

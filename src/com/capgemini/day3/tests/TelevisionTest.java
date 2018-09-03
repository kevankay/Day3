package com.capgemini.day3.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.day3.Television;

class TelevisionTest {

	
	Television television;
	@BeforeEach
	void setUp() {
	television =new Television(true,8,8,9);
	}
@Test
void testStae()
{
assertEquals(true,television.state());
}
@Test
void testIncreaseVolume()
{
assertEquals(9,television.increaseVolume());
}
@Test
void testDecreaseVolume()
{
assertEquals(7,television.decreaseVolume());
}
@Test
void testChangeChannel()
{
assertEquals(9,television.changeChannel());
}
}



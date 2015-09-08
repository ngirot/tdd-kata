package com.ngirot;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

public class AppTest {
	
	private App app = new App();
	
	@Test
	public void test() {
		assertThat(app.app()).isTrue();
	}
}

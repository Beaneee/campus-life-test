package com.newbie.ajou.service;

import com.newbie.ajou.domain.Traits;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UtilTest {

	@Test
	public void TraitPointsGetterTest() {
		//given
		int[] choices = new int[]{0, 1, 2, 3, 4, 3, 2, 1, 2, 3, 4, 3, 2};

		//when
		Traits trait = new Traits(choices);

		//then
		assertThat(trait.getEI()).isLessThan(0);
		assertThat(trait.getSN()).isGreaterThan(0);
		assertThat(trait.getTF()).isLessThan(0);
		assertThat(trait.getJP()).isGreaterThan(0);
	}
}

package com.ngirot;

import static org.fest.assertions.Assertions.assertThat;
import org.junit.Test;

public class NumerationRomaineTest {

	private NumerationRomaine	service	= new NumerationRomaine();

	@Test
	public void le_chiffre_arabe_1_vaut_I_en_chiffre_romain() {
		assertThat(service.romain(1)).isEqualTo("I");
	}

	@Test
	public void le_chiffre_arabe_2_vaut_II_car_deux_chiffres_romain_qui_se_suivent_s_additionnent() {
		assertThat(service.romain(2)).isEqualTo("II");
	}

	@Test
	public void le_chiffre_arabe_5_vaut_V_en_chiffre_romain() {
		assertThat(service.romain(5)).isEqualTo("V");
	}

	@Test
	public void le_chiffre_arabe_10_vaut_en_chiffre_romain() {
		assertThat(service.romain(10)).isEqualTo("X");
	}
}

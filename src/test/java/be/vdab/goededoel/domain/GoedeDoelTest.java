package be.vdab.goededoel.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import be.vdab.goededoel.domain.GoedeDoel;

import java.math.BigDecimal;


public class GoedeDoelTest {
	private static final String NAAM = "CliniClowns";
	private GoedeDoel doel;

	@Before
	public void before() {
		doel = new GoedeDoel(NAAM);
	}

	@Test
	public void getNaam() {
		assertEquals(NAAM, doel.getNaam());
	}

	@Test
	void doelenMetDezelfdeNaamZijnGelijk() { assertThat(doel).isEqualTo(new GoedeDoel("CLINICLOWNS"));
	}
	@Test
	void doelenMetVerschillendeNaamZijnVerschillend() { assertThat(doel).isNotEqualTo(new GoedeDoel("WWF"));
	}

	@Test
	void doelVerschiltVanEenObjectMetEenAnderType() { assertThat(doel).isNotEqualTo(BigDecimal.ZERO);
	}

	@Test
	void gelijkeDoelGevenHebbenDezelfdeHashCode() { assertThat(doel).hasSameHashCodeAs(new GoedeDoel("CliniClowns"));
	}
}

package com.bbonnet.example.junitparams;

import static org.fest.assertions.Assertions.assertThat;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.converters.ConvertParam;
import junitparams.converters.ParamConverter;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class CoordinatesTest {

	@Test
	@FileParameters("src/test/resources/coordinates_xDiff.csv")
	public void xDiffTest(	@ConvertParam(value = StringToCoordinatesConverter.class) final Coordinates c1,
							@ConvertParam(value = StringToCoordinatesConverter.class) final Coordinates c2,
							final int expectedXDiff) {
		assertThat(c1.xDiff(c2)).isEqualTo(expectedXDiff);
	}

	public static class StringToCoordinatesConverter implements ParamConverter<Coordinates> {
		@Override
		public Coordinates convert(final Object param, final String options) {
			final String coordinatesString = param.toString();
			final int x = Integer.parseInt(coordinatesString.substring(1, 2));
			final int y = Integer.parseInt(coordinatesString.substring(3, 4));
			return new Coordinates(x, y);
		}

	}

}

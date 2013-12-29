package com.bbonnet.example.junitparams;

/**
 * A class representing coordinates in a Cartesian 2D environment
 */
public class Coordinates {
	private final int x;
	private final int y;

	/**
	 * Builds new Coordinates based on abscissa and ordinate
	 *
	 * @param x
	 *            the abscissa
	 * @param y
	 *            the ordinate
	 */
	public Coordinates(final int x, final int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Builds new Coordinates based equal to given Coordinates. The given
	 * Coordinates is not modified.
	 *
	 * @param coordinates
	 *            the Coordinates to be copied
	 */
	public Coordinates(final Coordinates coordinates) {
		this.x = coordinates.getX();
		this.y = coordinates.getY();
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int xDiff(final Coordinates other) {
		// TODO 5 Write implementation by replacing the following line
		throw new UnsupportedOperationException();
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Coordinates)) {
			return false;
		}
		final Coordinates other = (Coordinates) obj;
		if (x != other.x) {
			return false;
		}
		if (y != other.y) {
			return false;
		}
		return true;
	}

}

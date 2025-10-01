package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		double[] j = { 0, 0, 1 };
		double[] k = { 1, 0, 1 };

		StdDraw.setPenColor(36, 255, 36);
		StdDraw.filledPolygon(j, k);

		double[] x = { 0, 1, 1 };
		double[] y = { 0, 0, 1 };

		StdDraw.setPenColor(109, 182, 255);
		StdDraw.filledPolygon(x, y);

		StdDraw.filledEllipse(.2, .8, .1, .1);
		StdDraw.setPenColor(36, 255, 36);
		StdDraw.filledEllipse(.8, .2, .1, .1);
	}
}
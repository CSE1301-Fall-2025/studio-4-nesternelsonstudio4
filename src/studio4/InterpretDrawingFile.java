package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); // making Scanner with a File

		String shapeType = in.next();
		int colorRed = in.nextInt();
		int colorGreen = in.nextInt();
		int colorBlue = in.nextInt();
		boolean fill = in.nextBoolean();
		double x = in.nextDouble();
		double y = in.nextDouble();
		double halfWidth = in.nextDouble();
		double halfHeight = in.nextDouble();
		double d1 = in.nextDouble();
		double d2 = in.nextDouble();

		double[] j = { x, y, halfWidth };
		double[] k = { halfHeight, d1, d2 };

		StdDraw.setPenColor(colorRed, colorGreen, colorBlue);
		StdDraw.filledPolygon(j, k);

	}
}

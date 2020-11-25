package yoshikihigo.tinypdg.scorpio.bellon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Gapped {

	public static void main(final String[] args) {

		if (2 != args.length) {
			System.err.println("the number of command opetions must be one.");
			System.err.println("the first one is an output file of SCORPIO.");
			System.err
					.println("the second one is a file for storing intertwined clones.");
			System.exit(0);
		}

		final String input = args[0];
		final String output = args[1];

		try {
			final BufferedReader reader = new BufferedReader(new FileReader(
					input));
			final BufferedWriter writer = new BufferedWriter(new FileWriter(
					output));

			while (reader.ready()) {
				final String line = reader.readLine();
				final StringTokenizer tokenizer = new StringTokenizer(line);
				final String leftPath = tokenizer.nextToken();
				final String leftStartLine = tokenizer.nextToken();
				final String leftEndLine = tokenizer.nextToken();
				final String rightPath = tokenizer.nextToken();
				final String rightStartLine = tokenizer.nextToken();
				final String rightEndLine = tokenizer.nextToken();
				final String leftGap = tokenizer.nextToken();
				final String rightGap = tokenizer.nextToken();

				if (!leftGap.equals("-") || !rightGap.equals("-")) {
					writer.write(line);
					writer.newLine();
				}
			}
			reader.close();
			writer.close();

		} catch (final IOException e) {
			e.printStackTrace();
		}
	}
}

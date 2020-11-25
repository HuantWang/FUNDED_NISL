package test003;

public class Test003 {
	String concatinate(final String[] texts) {
		final StringBuilder text = new StringBuilder();
		for (int i = 0; i < texts.length; i++) {
			text.append(texts[i]);
		}
		return text.toString();
	}
}

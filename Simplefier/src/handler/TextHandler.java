package handler;

public class TextHandler {
	
	public String simplify(String self){
		String iter = self.replaceAll("cc+", "kc");
		iter = iter.replaceAll("ce", "se");
		iter = iter.replaceAll("ci", "si");
		iter = iter.replaceAll("ck", "k");
		iter = iter.replaceAll("c", "k");
		iter = iter.replaceAll("ee", "i");
		iter = iter.replaceAll("oo", "u");
		iter = iter.replaceAll("([a-z])\\1", "$1");
		iter = iter.replaceAll("(\\b.+)(e\\b)", "$1");
		iter = iter.replaceAll("(\\sa|an|th)(\\s)", "$2");
		return iter;
	}

}

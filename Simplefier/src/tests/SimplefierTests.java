package tests;

import java.util.regex.Pattern;

import org.junit.Assert;
import org.junit.Test;

import handler.TextHandler;

public class SimplefierTests {
	
	@Test
	public void TextHandler_success(){
		boolean test = false;
		TextHandler th = new TextHandler();
		String testString = "success";
		test = Pattern.matches("sukses", th.simplify(testString));
		Assert.assertTrue(test);
	}

}

package base;

import org.apache.commons.lang3.StringUtils;

public class TestStringUtilsMaven {

	public static void main(String[] args) {
		
		String s1 = "1234";
		String s2 = "23h4";
		String s3 = "AFJU343KH32JH4AAAA";
		String s4 = "IKEA";
		System.out.println(StringUtils.isNumeric(s1));
		System.out.println(StringUtils.isNumeric(s2));
		System.out.println(StringUtils.countMatches(s3, 'A'));
		System.out.println(StringUtils.rotate(s4, 1));
		System.out.println(StringUtils.rotate(s4, 2));
		System.out.println(StringUtils.reverse(s4));
	}

}

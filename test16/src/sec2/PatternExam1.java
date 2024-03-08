package sec2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExam1 {
//Pattern : Æ¯Á¤ µ¥ÀÌÅÍ°¡  Çü½ÄÀÌ ¸Â´ÂÁö ºñ±³ÇÏ·Á°í ÇÒ °æ¿ì Æ¯Á¤ µ¥ÀÌÅÍ Çü½ÄÀ» ÁöÁ¤ÇÏ´Â Å¬·¡½º
//Matcher : Æ¯Á¤ ÆĞÅÏÀÇ ÇüÅÂ°¡ ¸Â´ÂÁö ºñ±³ÇÏ´Â Å¬·¡½º
//Á¤±Ô½Ä :  
	public static void main(String[] args) {
		String[] dt = {"bag", "kim1004", "9to6", "8to5", "single", "Mom", "ABC", " ±è¹Î¾Æ", "^_^"};
//		Pattern p = Pattern.compile("[a-z]*");    //¿µ¹® ¼Ò¹®ÀÚ·Î¸¸ ±¸¼ºµÈ µ¥ÀÌÅÍ
//		Pattern p = Pattern.compile("[0-9a-z]*");  	//¼ıÀÚ¿Í ¿µ¹® ¼Ò¹®ÀÚ·Î¸¸ ±¸¼ºµÈ µ¥ÀÌÅÍ
//		Pattern p = Pattern.compile("[0-9a-z]*");   //¿µ¹® ´ë¹®ÀÚ ¶Ç´Â ¼Ò¹®ÀÚ·Î¸¸ ±¸¼ºµÈ µ¥ÀÌÅÍ
//		Pattern p = Pattern.compile("s[A-Za-z]*");   //s·Î ½ÃÀÛÇÏ¸é¼­ ¿µ¹® ´ë¹®ÀÚ ¶Ç´Â ¼Ò¹®ÀÚ·Î¸¸ ±¸¼ºµÈ µ¥ÀÌÅÍ
//		Pattern p = Pattern.compile("[°¡-ÆR]*");   	 //ÇÑ±Û·Î¸¸ ±¸¼ºµÈ µ¥ÀÌÅÍ
//		Pattern p = Pattern.compile("e$*");   	 //Æ¯Á¤¹®ÀÚ·Î ³¡³ª´Â µ¥ÀÌÅÍ
//		Pattern p = Pattern.compile("^b");   	 //Æ¯Á¤¹®ÀÚ·Î ½ÃÀÛÇÏ´Â µ¥ÀÌÅÍ
		Pattern p = Pattern.compile("[0-9]*");   		 //¸ğµç °ªÀÌ ¼ıÀÚÀÎ µ¥ÀÌÅÍ   //°ªÀÌ ¾È³ª¿À´Â°Ô Á¤»óÀÌ¶ó´Âµ¥ ¿Ö ¾È³ª¿À´Âµğ
		
		for (int i=0; i<dt.length; i++) {			
			Matcher m = p.matcher(dt[i]);
			if(m.matches()) {
				System.out.println("Çü½Ä ÀÏÄ¡ : "+dt[i]);
			}
		}
	}

}

package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Task {
	
	
	DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	LocalDate d1 = LocalDate.parse("2021/8/10", f);
	LocalDate d2 = LocalDate.parse("2021/9/15", f);
	LocalDate d3 = LocalDate.parse("2021/10/21", f);
	LocalDate d4 = LocalDate.parse("2021/11/09", f);
	LocalDate d5 = LocalDate.parse("2021/12/04", f);
	
	String str1 = d1.format(f);
	String str2 = d2.format(f);
	String str3 = d3.format(f);
	String str4 = d4.format(f);
	String str5 = d5.format(f);
	
	
	String s1 = "散髪に行く。";
	String s2 = "○○社面談";
	String s3 = "牛乳を買う。";
	String s4 = "スクールの課題を解く。";
	String s5 = "手帳を買う。";

	

	
     
}

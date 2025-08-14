package practice;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;


public class Chapter5 extends Task {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		
		Map<LocalDate, String> tasks = new LinkedHashMap<>();
		
		
		
		tasks.put(str1, s1);
		tasks.put(str2, s2);
		tasks.put(str3, s3);
		tasks.put(str4, s4);
		tasks.put(str5, s5);
		
		for (Map.Entry<LocalDate, String> task : tasks.entrySet()) {
			  System.out.println(task.getkey() + ":"  + task.getvalue()); 
			}


	}

}

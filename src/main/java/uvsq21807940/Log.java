package uvsq21807940;

import java.time.LocalDateTime;

public class Log implements LogInter {
	

		public void write(String ch) {
			System.out.println(LocalDateTime.now()+" "+ch);
		}

	}



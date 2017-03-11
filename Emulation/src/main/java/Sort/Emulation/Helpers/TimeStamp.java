package Sort.Emulation.Helpers;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeStamp {
	
	public static String getTimeStamp(){
		SimpleDateFormat ft = 
			      new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss,SSS" + "+02:00");	
		return ft.format(new Date());
	}

}

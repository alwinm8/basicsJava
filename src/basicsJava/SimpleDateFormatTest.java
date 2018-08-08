//Alwin Mathew
/*
Letter	Date or Time Component	Presentation	Examples
G	Era designator	Text	AD
y	Year	Year	1996; 96
Y	Week year	Year	2009; 09
M	Month in year	Month	July; Jul; 07
w	Week in year	Number	27
W	Week in month	Number	2
D	Day in year	Number	189
d	Day in month	Number	10
F	Day of week in month	Number	2
E	Day name in week	Text	Tuesday; Tue
u	Day number of week (1 = Monday, ..., 7 = Sunday)	Number	1
a	Am/pm marker	Text	PM
H	Hour in day (0-23)	Number	0
k	Hour in day (1-24)	Number	24
K	Hour in am/pm (0-11)	Number	0
h	Hour in am/pm (1-12)	Number	12
m	Minute in hour	Number	30
s	Second in minute	Number	55
S	Millisecond	Number	978
z	Time zone	General time zone	Pacific Standard Time; PST; GMT-08:00
Z	Time zone	RFC 822 time zone	-0800
X	Time zone	ISO 8601 time zone	-08; -0800; -08:00
*/

package basicsJava;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {

	public static void main(String[] args) 
	{
		//1
		// Tue Nov 04 20:14:11 EST 2003
		SimpleDateFormat text1 = new SimpleDateFormat("E MMM hh:mm:s z YYYY");
		Date date1 = new Date();
		System.out.println(text1.format(date1));
		
		//2
		// 11/4/03 8:14 PM
		text1 = new SimpleDateFormat("MM/d/YY h:mm a");
		System.out.println(text1.format(date1));
		
		//3
		// 8:14:11 PM
		text1 = new SimpleDateFormat("h:mm:s a");
		System.out.println(text1.format(date1));

		
		//4
		// Nov 4, 2003 8:14:11 PM
		text1 = new SimpleDateFormat("MMM d, YYYY h:mm:s a");
		System.out.println(text1.format(date1));
		
		//5
		// 8:14 PM
		text1 = new SimpleDateFormat("h:mm a");
		System.out.println(text1.format(date1));
		
		//6
		// 8:14:11 PM
		text1 = new SimpleDateFormat("h:mm:s a");
		System.out.println(text1.format(date1));
		
		//7
		// 8:14:11 PM EST
		text1 = new SimpleDateFormat("h:mm:s z");
		System.out.println(text1.format(date1));
		
		//8 
		// 11/4/03 8:14 PM
		text1 = new SimpleDateFormat("MM/d/YY h:mm a");
		System.out.println(text1.format(date1));
		
		//9
		// Nov 4, 2003 8:14 PM
		text1 = new SimpleDateFormat("MMM d, YYYY h:mm a");
		System.out.println(text1.format(date1));
		
		//10
		// November 4, 2003 8:14:11 PM EST
		text1 = new SimpleDateFormat("MMM d, YYYY h:mm:s a z");
		System.out.println(text1.format(date1));

	}

}

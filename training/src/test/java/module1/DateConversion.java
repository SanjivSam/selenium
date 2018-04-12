package module1;

import java.io.*;
import java.util.*;

public class DateConversion {
	static String[] reformatDate(String[] dates) {
		for (int i = 0; i < dates.length - 1; i++) {
			dates[i] = dates[i].substring(dates[i].length() - 4, 4) + "-" + monpic(dates[i]) + "-" + datpic(dates[i]);
		}
		return dates;
	}

	static String datpic(String date) {
		String[] dat = null;
		if (date.contains("th")) {
			dat = date.split("th");
		} else if (date.contains("st")) {
			dat = date.split("st");
		} else if (date.contains("nd")) {
			dat = date.split("nd");
		} else if (date.contains("rd")) {
			dat = date.split("rd");
		}
		if (dat[0].length() < 2) {
			dat[0] = "0" + dat[0];
		}
		return dat[0];
	}

	static String monpic(String mon) {
		if (mon.contentEquals("Jan") || mon.contentEquals("JAN") || mon.contentEquals("jan")) {
			mon = "01";
		} else if (mon.contentEquals("Feb") || mon.contentEquals("FEB") || mon.contentEquals("feb")) {
			mon = "02";
		} else if (mon.contentEquals("Mar") || mon.contentEquals("MAR") || mon.contentEquals("mar")) {
			mon = "03";
		} else if (mon.contentEquals("Apr") || mon.contentEquals("APR") || mon.contentEquals("apr")) {
			mon = "04";
		} else if (mon.contentEquals("May") || mon.contentEquals("MAY") || mon.contentEquals("may")) {
			mon = "05";
		} else if (mon.contentEquals("Jun") || mon.contentEquals("JUN") || mon.contentEquals("jun")) {
			mon = "06";
		} else if (mon.contentEquals("Jul") || mon.contentEquals("JUL") || mon.contentEquals("jul")) {
			mon = "07";
		} else if (mon.contentEquals("Aug") || mon.contentEquals("AUG") || mon.contentEquals("aug")) {
			mon = "08";
		} else if (mon.contentEquals("Sep") || mon.contentEquals("SEP") || mon.contentEquals("sep")) {
			mon = "09";
		} else if (mon.contentEquals("Oct") || mon.contentEquals("OCT") || mon.contentEquals("oct")) {
			mon = "10";
		} else if (mon.contentEquals("Nov") || mon.contentEquals("NOV") || mon.contentEquals("nov")) {
			mon = "11";
		} else if (mon.contentEquals("Dec") || mon.contentEquals("DEC") || mon.contentEquals("dec")) {
			mon = "12";
		}
		return mon;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int datesCount = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

		String[] dates = new String[datesCount];

		for (int datesItr = 0; datesItr < datesCount; datesItr++) {
			String datesItem = scanner.nextLine();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");
			dates[datesItr] = datesItem;
		}

		String[] res = reformatDate(dates);

		for (int resItr = 0; resItr < res.length; resItr++) {
			bufferedWriter.write(res[resItr]);

			if (resItr != res.length - 1) {
				bufferedWriter.write("\n");
			}
		}

		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}

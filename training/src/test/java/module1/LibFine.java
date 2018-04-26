package module1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class LibFine {

	public static void main(String[] args) throws ParseException {
		Scanner in = new Scanner(System.in);
		String edt = in.next();
		String adt = in.nextLine();
		edt=edt.replaceAll(" ", "/");
		adt=adt.replaceAll(" ", "/");
		Date ed = new SimpleDateFormat("dd/MM/YYYY").parse(edt);
		Date ad = new SimpleDateFormat("dd/MM/YYYY").parse(adt);
	}
}

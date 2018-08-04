

	// Program to find the age and difference between age of two years.

	import java.time.LocalDate;
	import java.time.Period;

	public class CheckPerson {

		private String name;
		private LocalDate dob;

		public CheckPerson(String n, int d, int m, int y) {
			name = n;
			dob = LocalDate.of(y, m, d);
		}

		// Find the age.
		public static Period age(CheckPerson p) {

			LocalDate now = LocalDate.now();
			Period age = Period.between(p.dob, now);

			return age;

		}

		// Find the difference between age of two persons.
		public static Period olderOne(CheckPerson p1, CheckPerson p2) {
			Period diff;
			if (p1.dob.isAfter(p2.dob)) {
				diff = Period.between(p2.dob, p1.dob);
				return diff;
			} else {
				diff = Period.between(p1.dob, p2.dob);
				return diff;
			}
		}

		// Print the Object values.
		@Override
		public String toString() {
			return "Name= " + name + ", Dob=" + dob + "";
		}

	}


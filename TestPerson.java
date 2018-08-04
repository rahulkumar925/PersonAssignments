
//Program to Test the Person class.

import java.time.Period;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckPerson person1 = new CheckPerson("Ram", 12, 3, 1982);
		CheckPerson person2 = new CheckPerson("Shyam", 7, 5, 1987);

		Period period;
		period = CheckPerson.age(person1);
		System.out.println(person1 + "\n Age:  " + period.getYears() + " years " + period.getMonths() + " months "
				+ period.getDays() + " days.");

		Period period2;
		period2 = CheckPerson.age(person2);
		System.out.println(person2 + "\n Age:  " + period2.getYears() + " years " + period2.getMonths() + " months "
				+ period2.getDays() + " days.");

		Period period3;
		period3 = CheckPerson.olderOne(person1, person2);
		System.out.printf("Difference is %d years, %d months and %d days old", period3.getYears(), period3.getMonths(),
				period3.getDays());

	}

}


package telran.datesort.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Comparator;

import org.junit.jupiter.api.Test;

class DateSortTest {

	@Test
	void test() {
		String[] dates = { "07-05-1990", "28-01-2010", "11-08-1990", "15-01-2010", "16/06/1970", "17/05/1970" };
		String[] expected = { "17/05/1970", "16/06/1970", "07-05-1990", "11-08-1990", "15-01-2010", "28-01-2010" };

		System.out.println("Test DateSort before");
		for (int i = 0; i < dates.length; i++) {
			System.out.println(dates[i]);
		}
		System.out.println("======================");

		// Make comparator
		Comparator<String> comp = (d1, d2) -> {
			if (d1.substring(6).compareTo(d2.substring(6)) == 0) {
				if (d1.substring(3, 6).compareToIgnoreCase(d2.substring(3, 6)) == 0) {
					if (d1.substring(0, 2).compareTo(d2.substring(0, 2)) > 0) {
						return 1;
					} else if (d1.substring(0, 2).compareTo(d2.substring(0, 2)) < 0) {
						return -1;
					} else {
						return 0;
					}
				} else if (d1.substring(3, 6).compareToIgnoreCase(d2.substring(3, 6)) > 0) {
					return 1;
				} else if (d1.substring(3, 6).compareToIgnoreCase(d2.substring(3, 6)) < 0) {
					return -1;
				}
			} else if (d1.substring(6).compareTo(d2.substring(6)) > 0) {
				return 1;
			} else {
				return -1;
			}
			return 0;
		};

		Arrays.sort(dates, comp);
		assertArrayEquals(expected, dates);

		System.out.println("Test DateSort after");
		for (int i = 0; i < dates.length; i++) {
			System.out.println(dates[i]);
		}

	}
}

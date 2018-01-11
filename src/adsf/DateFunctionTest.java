package adsf;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DateFunctionTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetCurrentDate() {
		System.out.println(DateFunction.getCurrentDate());
	}

	@Test
	public void testGetCurrentShortDate() {
		System.out.println(DateFunction.getCurrentShortDate());
	}

	@Test
	public void testGetCurrentDateTime() {
		System.out.println(DateFunction.getCurrentDateTime());
	}

	@Test
	public void testGetCurrentChineseDate() {
		System.out.println(DateFunction.getCurrentChineseDate());
	}

	@Test
	public void testConvertToDate() throws Exception {
		System.out.println(DateFunction.convertToDate("2012-12-12 12:22:33"));
	}

	@Test
	public void testConvertToLongDate() throws Exception {
		System.out.println(DateFunction.convertToDate("2012-12-12 12:22:33"));
	}

	@Test
	public void testConvertToDateString() {
		System.out.println(DateFunction.convertToDateString(new java.sql.Date(System.currentTimeMillis())));
	}

	@Test
	public void testConvertToDateTimeString() {
		System.out.println(DateFunction.convertToDateTimeString(new java.sql.Date(System.currentTimeMillis())));
	}

}

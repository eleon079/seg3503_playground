import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTest {

  @Test
  void nextDate_tc01() {
    Date today = new Date(1700, 6, 20);
    Date expectedTomorrow = new Date(1700, 6, 21);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc02() {
    Date today = new Date(2005, 4, 15);
    Date expectedTomorrow = new Date(2005, 4, 16);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc03() {
    Date today = new Date(1901, 7, 20);
    Date expectedTomorrow = new Date(1901, 7, 21);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc04() {
    Date today = new Date(3456, 3, 27);
    Date expectedTomorrow = new Date(3456, 3, 28);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc05() {
    Date today = new Date(1500, 2, 17);
    Date expectedTomorrow = new Date(1500, 2, 18);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc06() {
    Date today = new Date(1700, 6, 29);
    Date expectedTomorrow = new Date(1700, 6, 30);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc07() {
    Date today = new Date(1800, 11, 29);
    Date expectedTomorrow = new Date(1800, 11, 30);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc08() {
    Date today = new Date(3453, 1, 29);
    Date expectedTomorrow = new Date(3453, 1, 30);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc09() {
    Date today = new Date(444, 2, 29);
    Date expectedTomorrow = new Date(444, 3, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc10() {
    Date today = new Date(2005, 4, 30);
    Date expectedTomorrow = new Date(2005, 5, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc11() {
    Date today = new Date(3453, 1, 30);
    Date expectedTomorrow = new Date(3453, 1, 31);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc12() {
    Date today = new Date(3456, 3, 30);
    Date expectedTomorrow = new Date(3456, 3, 31);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc13() {
    Date today = new Date(1901, 7, 31);
    Date expectedTomorrow = new Date(1901, 8, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc14() {
    Date today = new Date(3453, 1, 31);
    Date expectedTomorrow = new Date(3453, 2, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc15() {
    Date today = new Date(3456, 12, 31);
    Date expectedTomorrow = new Date(3457, 1, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_invalid_tc16() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1500, 2, 31)
    );
  }

  @Test
  void nextDate_invalid_tc17() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1500, 2, 29)
    );
  }

  @Test
  void nextDate_invalid_tc18() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(-1, 10, 20)
    );
  }

  @Test
  void nextDate_invalid_tc19() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1458, 15, 12)
    );
  }

  @Test
  void nextDate_invalid_tc20() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1975, 6, -50)
    );
  }
  //////////////////LAB3//////////////////////////////
  @Test
  void nextDate_Invaliddate() {
    Date today = new Date(2022, 06, 14);
    Object obj = new Object();
    assertEquals(false, today.equals(obj));
  }
  @Test

  void nextDate_Invalidstting() {
    Date today = new Date(2028, 06, 14);
    assertEquals("2028/June/14", today.toString());
  }
  @Test

  void nextDate_notsameyear() {
    Date today = new Date(2022, 6, 14);
    Date alsoToday = new Date(2021, 6, 14);
    assertEquals(false, today.equals(alsoToday));
  }
  @Test
  void nextDate_month() {
    Date today = new Date(1915, 9, 20);
    assertEquals(today.getMonth(), 9);
  }
  @Test
  void nextDate_notsamemonth() {
    Date today = new Date(2024, 7, 14);
    Date alsoToday = new Date(2024, 6, 14);
    assertEquals(false, today.equals(alsoToday));
  }
  @Test
  void nextDate_notsameday() {
    Date today = new Date(2016, 8, 8);
    Date alsoToday = new Date(2016, 8, 7);
    assertEquals(false, today.equals(alsoToday));
  }
  @Test
  void nextDate_samedate() {
    Date today = new Date(2020, 6, 14);
    Date alsoToday = new Date(2020, 6, 14);
    assertEquals(true, today.equals(alsoToday));
  }
  @Test
  void nextDate_leapyear() {
    Date today = new Date(2400, 01, 05);
    assertEquals(true, today.isLeapYear());
  }
  @Test
  void nextDate_28() {
    Date today = new Date(2009, 2, 28);
    Date expectedTomorrow = new Date(2009, 3, 1);
    assertEquals(expectedTomorrow, today.nextDate());

  }
  @Test
  void nextDate_29() {
    Date today = new Date(2008, 2, 28);
    Date expectedTomorrow = new Date(2008, 2, 29);
    assertEquals(expectedTomorrow, today.nextDate());
  }
  @Test
  void nextDateequl() {
    Date today = new Date(2002, 8, 22);
    assertTrue((today.equals(new Date(2002, 8, 22))));
  }

  @Test
  void nextDateequl2() {
    Date today = new Date(2002, 8, 22);
    assertTrue(!(today.equals(new Date(2002, 8, 21))));
  }
  @Test
  void nextDateequl1() {
    Date today = new Date(2002, 8, 30);
    assertTrue(!(today.equals(new Date(2000, 7, 21))));
  }
  @Test
  void nextDate_invalidDay() {
    assertThrows(
            IllegalArgumentException.class,
            () -> new Date(2010, 4, 31)
    );
  }
  @Test
  void nextDate_equals(){
    Date date = new Date(2000,8,27);
    Date date2 = new Date(2000,8,26);
    assertFalse(date.equals(date2));
  }

}
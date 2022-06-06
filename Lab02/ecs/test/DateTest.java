import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTest {

  @Test
  void nextDate_sample() {
    Date d = new Date(2020,5,3);
    assertEquals(new Date(2020,5,4), d.nextDate());
  }

  @Test
  void nextDate_sample() {
    Date d = new Date(1700,06,20);
    assertEquals(new Date(1700,06,21), d.nextDate());
  }

  @Test
  void nextDate_sample() {
    Date d = new Date(2005,04,15);
    assertEquals(new Date(2005,04,16), d.nextDate());
  }

  @Test
  void nextDate_sample() {
    Date d = new Date(1901,07,20);
    assertEquals(new Date(1901,07,21), d.nextDate());
  }

  @Test
  void nextDate_sample() {
    Date d = new Date(3456,03,27);
    assertEquals(new Date(3456,03,28), d.nextDate());
  }

  @Test
  void nextDate_sample() {
    Date d = new Date(1500,02,17);
    assertEquals(new Date(1500,02,18), d.nextDate());
  }

  @Test
  void nextDate_sample() {
    Date d = new Date(1700,06,29);
    assertEquals(new Date(1700,06,30), d.nextDate());
  }

  @Test
  void nextDate_sample() {
    Date d = new Date(1800,11,29);
    assertEquals(new Date(1800,11,30), d.nextDate());
  }

  @Test
  void nextDate_sample() {
    Date d = new Date(3453,01,29);
    assertEquals(new Date(3453,01,30), d.nextDate());
  }

  @Test
  void nextDate_sample() {
    Date d = new Date(444,02,29);
    assertEquals(new Date(444,03,01), d.nextDate());
  }

  @Test
  void nextDate_sample() {
    Date d = new Date(2005,04,30);
    assertEquals(new Date(2005,05,01), d.nextDate());
  }

  @Test
  void nextDate_sample() {
    Date d = new Date(3453,01,30);
    assertEquals(new Date(3453,01,31), d.nextDate());
  }

  @Test
  void nextDate_sample() {
    Date d = new Date(3456,03,30);
    assertEquals(new Date(3456,03,31), d.nextDate());
  }

  @Test
  void nextDate_sample() {
    Date d = new Date(1500,02,31);
    assertEquals(new Date(IllegalArgumentException), d.nextDate());
  }

  @Test
  void nextDate_sample() {
    Date d = new Date(1500,02,29);
    assertEquals(new Date(IllegalArgumentException), d.nextDate());
  }

  @Test
  void nextDate_sample() {
    Date d = new Date(-1,10,20);
    assertEquals(new Date(IllegalArgumentException), d.nextDate());
  }

  @Test
  void nextDate_sample() {
    Date d = new Date(1458,15,12);
    assertEquals(new Date(IllegalArgumentException), d.nextDate());
  }

  @Test
  void nextDate_sample() {
    Date d = new Date(1975,6,-50);
    assertEquals(new Date(IllegalArgumentException), d.nextDate());
  }

}
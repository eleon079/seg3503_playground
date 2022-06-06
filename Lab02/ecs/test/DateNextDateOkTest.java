import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DateNextDateOkTest{

    private int yearStart;
    private int monthStart;
    private int dayStart;
    private int yearExpect;
    private int monthExpect;
    private int dayExpect;

    
    public DateNextDateOkTest(int year, int month, int days, int year1, int month1, int day1){
        this.yearStart = year;
        this. monthStart = month;
        this.dayStart = days;
        this.yearExpect = year1;
        this.monthExpect = month1;
        this.dayExpect = day1;

    }
    
    @Parameters
    public static List<Integer[]> data(){
        List<Integer[]> parameters = new LinkedList<Integer[]>();
        parameters.add(new Integer[] {1700,06,20,1700,06,21});
        parameters.add(new Integer[] {2005,4,15,2005,4,16}); 
        parameters.add(new Integer[] {1901,7,20,1901,7,21}); 
        parameters.add(new Integer[] {3456,3,27,3456,3,28}); 
        parameters.add(new Integer[] {1500,2,17,1500,2,18}); 
        parameters.add(new Integer[] {1700,6,29,1700,6,30}); 
        parameters.add(new Integer[] {1800,11,29,1800,11,30}); 
        parameters.add(new Integer[] {3453,1,29,3453,1,30}); 
        parameters.add(new Integer[] {444,2,29,444,3,1}); 
        parameters.add(new Integer[] {2005,4,30,2005,5,1}); 
        parameters.add(new Integer[] {3453,1,30,3453,1,31}); 
        parameters.add(new Integer[] {3456,3,30,3456,3,31}); 
        parameters.add(new Integer[] {1901,7,31,1901,8,1}); 
        parameters.add(new Integer[] {3453,1,31,3453,2,1}); 
        parameters.add(new Integer[] {3456,12,31,3457,1,1}); 
		return parameters;
    }

    @Test
    public void NextDateOkTest(){
	Date date = new Date(yearOrigin, monthOrigin, dayOrigin);
        Date newDate = date.nextDate();
        Assert.assertEquals(yearNext, newDate.getYear());
        Assert.assertEquals(monthNext, newDate.getMonth());
        Assert.assertEquals(dayNext, newDate.getDay());
    }

}

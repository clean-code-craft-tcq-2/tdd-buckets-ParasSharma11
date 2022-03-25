package tdd-buckets-ParasSharma11;
import java.util.*; 
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class testRangeChecker 
{
  @Test
    public void testNumbeOfReadingsFromGivenRange()
    {
      List<Integer> listOfvalues = new ArrayList<Integer>(); 
      Collections.addAll(list, 10, 20, 30, 40); 
      assertTrue(RangeChecker.get_no_of_readings_from_given_range(listOfvalues,4,5) == 2));
    }
}

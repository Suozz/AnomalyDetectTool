package Tool;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.platform.commons.logging.Logger;

/**
 * @program: MathToolTest
 * @description: To test some useful calculations
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018-05-03 14:52
 **/
public class MathToolTest {

  private double[] testArray;
  private static final double DELTA = 0.000001;

  @Before
  public void setUp() throws Exception {
    testArray = new double[5];
    testArray[0] = 0.0;
    testArray[1] = 1.0;
    testArray[2] = 2.0;
    testArray[3] = 3.0;
    testArray[4] = 4.0;
  }

  @Test
  public void getAverageFromArray() throws Exception {
    Assert.assertEquals(MathTool.getAverageFromArray(testArray), 2.0, 0.0);
  }

  @Test
  public void getStdDeviation() throws Exception {
    Assert.assertEquals(MathTool.getStdDeviation(testArray), 1.581138, DELTA);
  }

}
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jaymilnamow on 6/9/16.
 */
public class NumberToTextSpec {

    @Before
    public void init() {};
    NumberToText testNumber = new NumberToText();

    @Test
    public void normalNumberDecoder(){
        String beforeNormalNumberDecoder = "3";
        String expectedString = "Three";
        String actualString = testNumber.normalNumberDecoder(beforeNormalNumberDecoder);
        assertEquals(expectedString,actualString);
    }

    @Test
    public void teensNumberDecoderTest(){
        String beforeTeensNumberDecoder = "11";
        String expectedString = "Eleven";
        String actualString = testNumber.teensNumberDecoder(beforeTeensNumberDecoder);
        assertEquals(expectedString,actualString);
        }
    }

    @Test
    public void

}

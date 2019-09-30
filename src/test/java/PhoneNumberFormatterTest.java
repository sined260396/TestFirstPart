import org.junit.Test;
import com.sinelnikov.PhoneNumberFormatter;

import static org.junit.Assert.*;

public class PhoneNumberFormatterTest {
    @Test
    public void tests() {
        assertEquals("(123) 456-7890", PhoneNumberFormatter.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
}

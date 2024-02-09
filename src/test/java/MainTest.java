import com.smu.mscda.Main;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void capitalizeString() {
        assertEquals("Smu", Main.capitalizeString("smu"));
    }

    @Test
    public void generateMD5Hex() {
        assertEquals("3773300c2f413cc7136f8d74b305519c", Main.generateMD5Hex("smu"));
    }
}
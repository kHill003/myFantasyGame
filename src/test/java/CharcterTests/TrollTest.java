package CharcterTests;

import Players.Barbarian;
import Players.Troll;
import com.sun.xml.internal.ws.api.pipe.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrollTest {
    Troll troll;

    @Before
    public void before() {
      troll = new Troll("Boris");
    }
    @Test
    public void getNameWorks(){
        assertEquals("Boris", troll.getName());
    }
}

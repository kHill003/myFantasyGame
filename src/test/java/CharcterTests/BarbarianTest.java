package CharcterTests;

import Players.Barbarian;
import Players.Dwarf;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {
  Barbarian barbarian;

    @Before
    public void before() {
        barbarian = new Barbarian("Harry");
    }
    @Test
    public void getNameWorks(){
        assertEquals("Harry", barbarian.getName());
    }
}


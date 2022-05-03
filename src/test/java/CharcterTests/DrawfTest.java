package CharcterTests;

import Players.Barbarian;
import Players.Dwarf;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrawfTest
{
    Dwarf dwarf;

    @Before
    public void before() {
        dwarf = new Dwarf("Tim");
    }
    @Test
    public void getNameWorks(){
        assertEquals("Tim", dwarf.getName());
    }
    }


import org.junit.*;
import static org.junit.Assert.*;

public class EventPlanningTest {

@Test
public void EventPlanning_instantiatesCorrectly() {
  EventPlanning testEventPlanning = new EventPlanning(25,"dinner", "limebeer", "Rock", "Magic Shoes");
  assertEquals(true, testEventPlanning instanceof EventPlanning);
}

@Test
    public void EventPlanning_getEventSize_25() {
      EventPlanning testEventPlanning = new EventPlanning(25, "dinner", "limebeer", "Rock", "Magic Shoes");
      assertEquals(25, testEventPlanning.getEventSize());
    }


@Test
    public void EventPlanning_getFoodTypes_String() {
      EventPlanning testEventPlanning = new EventPlanning(25,"dinner", "Limebeer", "Rock", "Magic Shoes");
      assertEquals("dinner", testEventPlanning.getFoodTypes());
    }


@Test
    public void EventPlanning_getBeverageTypes_String() {
      EventPlanning testEventPlanning = new EventPlanning(25,"dinner", "limebeer", "Rock", "Magic Shoes");
      assertEquals("limebeer", testEventPlanning.getBeverageTypes());
    }

@Test
    public void EventPlanning_getBeverageTypes_String() {
      EventPlanning testEventPlanning = new EventPlanning(25,"dinner", "limebeer", "Rock", "Magic Shoes");
      assertEquals("limebeer", testEventPlanning.getBeverageTypes());
    }
}

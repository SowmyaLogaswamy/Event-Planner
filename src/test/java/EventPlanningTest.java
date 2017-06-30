import org.junit.*;
import static org.junit.Assert.*;

public class EventPlanningTest {

  @Test
  public void EventPlanning_instantiatesCorrectly() {
    EventPlanning testEventPlanning = new EventPlanning(25,"grand", "soft drinks", "Rock", "Magic Shoes");
    assertEquals(true, testEventPlanning instanceof EventPlanning);
  }

  @Test
      public void EventPlanning_getEventSize_25() {
        EventPlanning testEventPlanning = new EventPlanning(25, "grand", "soft drinks", "Rock", "Magic Shoes");
        assertEquals(25, testEventPlanning.getEventSize());
      }


  @Test
      public void EventPlanning_getFoodTypes_String() {
        EventPlanning testEventPlanning = new EventPlanning(25,"grand", "soft drinks", "Rock", "Magic Shoes");
        assertEquals("grand", testEventPlanning.getFoodTypes());
      }


  @Test
      public void EventPlanning_getBeverageTypes_String() {
        EventPlanning testEventPlanning = new EventPlanning(25,"grand", "soft drinks", "Rock", "Magic Shoes");
        assertEquals("soft drinks", testEventPlanning.getBeverageTypes());
      }

  @Test
      public void EventPlanning_getMusicBandTypes_String() {
        EventPlanning testEventPlanning = new EventPlanning(25,"grand", "soft drinks", "Rock", "Magic Shoes");
        assertEquals("Rock", testEventPlanning.getMusicBandTypes());
      }

  @Test
        public void EventPlanning_getAccessoriesAvailable_String() {
          EventPlanning testEventPlanning = new EventPlanning(25,"grand", "soft drinks", "Rock", "Magic Shoes");
          assertEquals("Magic Shoes", testEventPlanning.getAccessoriesAvailable());
        }

  @Test
          public void EventPlanning_calculateFoodPrice_10() {
            EventPlanning testEventPlanning = new EventPlanning(10,"grand", "soft drinks", "Rock", "Magic Shoes");
            assertEquals(500, testEventPlanning.calculateFoodPrice());
          }

  @Test
          public void EventPlanning_calculateFoodPrice_4500() {
            EventPlanning testEventPlanning = new EventPlanning(100,"grand", "soft drinks", "Rock", "Magic Shoes");
            assertEquals(4500, testEventPlanning.calculateFoodPrice());
          }


  @Test
          public void EventPlanning_calculateFoodPrice_10500() {
            EventPlanning testEventPlanning = new EventPlanning(300,"grand", "soft drinks", "Rock", "Magic Shoes");
            assertEquals(10500, testEventPlanning.calculateFoodPrice());
          }


  @Test
      public void EventPlanning_calculateFoodPrice_15000() {
        EventPlanning testEventPlanning = new EventPlanning(600,"grand", "soft drinks", "Rock", "Magic Shoes");
        assertEquals(15000, testEventPlanning.calculateFoodPrice());
      }

  @Test
          public void EventPlanning_calculateFoodPrice_1000() {
            EventPlanning testEventPlanning = new EventPlanning(50,"simple", "soft drinks", "Rock", "Magic Shoes");
            assertEquals(1000, testEventPlanning.calculateFoodPrice());
          }

  @Test
  public void EventPlanning_calculateBeveragePrice_1200() {
    EventPlanning testEventPlanning = new EventPlanning(200,"simple", "hot drinks", "Rock", "Magic Shoes");
    assertEquals(800, testEventPlanning.calculateBeveragePrice());
  }

  @Test
  public void EventPlanning_calculateMusicBandPrice_cost() {
    EventPlanning testEventPlanning = new EventPlanning(50,"simple", "hot drinks", "Rock", "Magic Shoes");
    assertEquals(100, testEventPlanning.calculateMusicBandPrice());
  }

  @Test
  public void EventPlanning_calculateAccessoriesPrice_cost() {
    EventPlanning testEventPlanning = new EventPlanning(100,"simple", "hot drinks", "Rock", "Magic Shoes");
    assertEquals(100, testEventPlanning.calculateAccessoriesPrice());
  }

  @Test
  public void totalCost() {
    EventPlanning testEventPlanning = new EventPlanning(100,"simple", "hot drinks", "Rock", "Magic Shoes");
    assertEquals(2500, testEventPlanning.totalCost());
  }



}

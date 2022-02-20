package cleancode.naming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EventTest {

  @Test
  public void
  Should_return_true_when_the_event_occoured_is_during_working_hours() {
    Time t = new Time(10);
    Event e= new Event(4, t);

    assertTrue(e.canApply());
  }

  @Test public void
  Should_return_false_when_the_event_occoured_after_working_hours() {
    Time t = new Time(20);
    Event e = new Event(4, t);

    assertFalse(e.canApply());
  }

  @Test public void
  Should_return_false_when_the_event_occoured_during_working_hours_in_non_working_day() {
    Time t = new Time(20);
    Event e = new Event(6, t);

    assertFalse(e.canApply());
  }
}
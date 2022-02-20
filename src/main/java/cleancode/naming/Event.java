package cleancode.naming;

class Event {
  private final int day;
  private final Time time;

  public Event(int day, Time time) {
    this.day= day;
    this.time = time;
  }
  public int getDay() {
    return day;
  }

  public Time getTime() {
    return time;
  }

  public boolean canApply() {
    if (this.getDay() == 6 || this.getDay() == 0) {
      return false;
    } else {
      return (this.getTime().getHour() >= 8 && this.getTime().getHour() < 18);
    }
  }
}

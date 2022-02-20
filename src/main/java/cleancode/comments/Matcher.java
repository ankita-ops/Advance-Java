package cleancode.comments;

public class Matcher {
  public Matcher() {}

  public boolean match(int[] expected, int[] actual,
                       int clipLimit, int delta) {
// Clip "too-large" values
// (actual, clipLimit);
// Check for length differences
    if (lengthDifference(expected, actual))
      return false;
// Check that each entry is within expected +/- delta
    return checkEntry(expected, actual, delta);
  }

  

  private boolean checkEntry(int[] expected, int[] actual, int delta) {
    for (int i = 0; i < actual.length; i++)
      if (Math.abs(expected[i] - actual[i]) > delta)
        return false;
    return true;
  }

  private static boolean lengthDifference(int[] expected, int[] actual) {
    return actual.length != expected.length;
  }

}

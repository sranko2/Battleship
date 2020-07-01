package view;

public class Pair {
  private int first;
  private int second;


  public Pair(int first, int second) {
    this.first = first;
    this.second = second;
  }


  public void updateFirst(int x) {
    first = x;
  }

  public void updateSecond(int y) {
    second = y;
  }

  public int getFirst() {
    return first;
  }

  public int getSecond() {
    return second;
  }

}

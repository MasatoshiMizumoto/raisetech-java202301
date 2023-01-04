package src;

public class Lecture03Exception {

  public static void main(String[] args) {
    try {
      int[] myArray = {1, 2, 3};
      System.out.println(myArray[10]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("指定された要素番号がリスト外です。要素番号を見直してください。");
    }
  }
}

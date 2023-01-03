package src;

public class HelloWorld { // クラス宣言。クラス名はファイル名と同じにする

  public static void main(String[] args) { // メインメソッド。プログラムの開始地点。引数はString型の配列
    System.out.println("#####1回#####"); // stdoutに文字列を出力
    System.out.println("Hello, World");
    System.out.println("#####20回#####"); // stdoutに文字列を出力
    for (int i = 0; i < 20; i++) {
      if (i <= 9) {
        System.out.println("Hello, World");
      } else {
        System.out.println("Hello");
      }
    }
  }
}

package src;

import java.util.Random;

public class Main {

  public static void main(String[] args) {
    Monster enemy = new Monster("スライム", new Random().nextInt(10 - 1) + 1);
    System.out.printf("""
        +--------------------+
        %s　が　あらわれた！
        体力: %d
        +--------------------+
        """, enemy.getName(), enemy.getHealth());

    // enemyの体力が0になるまで攻撃を繰り返す
    for (int i = 0; enemy.getHealth() > 0; i++) {
      int damage = new Random().nextInt(5);
      System.out.println((i + 1) + "回目のこうげき！");
      if (damage == 0) {
        System.out.println("ミス！　" + enemy.getName() + "　にダメージを与えられない！" + "\n");
      } else {
        System.out.println(damage + "のダメージ！");
        enemy.takeDamage(damage);
      }
      if (enemy.getHealth() <= 0) {
        System.out.println("\n" + enemy.getName() + "　を倒した！");
      } else {
        System.out.println("\nまだ　" + enemy.getName() + "　は健在だ！");
        System.out.println(enemy.getName() + "　の体力：" + enemy.getHealth() + "\n");
      }
    }
  }
}

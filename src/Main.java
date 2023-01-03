package src;

import java.util.Random;

public class Main {

  public static void main(String[] args) {
    Monster enemy = new Monster("スライム", new Random().nextInt(10 - 1) + 1);
    System.out.println(
        "+--------------------+\n" + enemy.getName() + "があらわれた！" + "\n体力:" + enemy.getHealth()
            + "\n+--------------------+\n");

    // enemyの体力が0になるまで攻撃を繰り返す
    for (int i = 0; enemy.getHealth() > 0; i++) {
      int damage = new Random().nextInt(5);
      System.out.println((i + 1) + "回目のこうげき！");
      if (damage == 0) {
        System.out.println("ミス！敵にダメージを与えられない！" + "\n");
      } else {
        System.out.println(damage + "のダメージ！");
        enemy.makeDamage(damage);
      }
      if (enemy.getHealth() <= 0) {
        System.out.println("\nスライムを倒した！");
      } else {
        System.out.println("\nまだ敵は健在だ！");
        System.out.println("スライムの体力：" + enemy.getHealth() + "\n");
      }
    }
  }
}

package src;

public class Monster {

  final String name;
  private int health;

  public Monster(String name, int health) {
    this.name = name;
    this.health = health;
  }


  //name management
  public String getName() {
    return name;
  }


  //health management
  public int getHealth() {
    return health;
  }

  //damage logic
  public void takeDamage(int damage) {
    this.health -= damage;
  }
}

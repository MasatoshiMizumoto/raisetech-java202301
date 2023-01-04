package src;

public class Lecture02Monster {

  final String name;
  private int health;

  public Lecture02Monster(String name, int health) {
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

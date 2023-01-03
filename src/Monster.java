package src;

public class Monster {

  private String name;
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

  public void setHealth(int health) {
    this.health = health;
  }
}

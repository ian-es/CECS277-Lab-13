/*
Group 11
Ian Escalante
Julio Calderon

CECS 277 Lab 13
5/3/2022
*/

class Main {
  /**Program that simulates the state changes of a puppy that can be asleep, playing, or eating 
  */
  public static void main(String[] args) {
    Puppy p = new Puppy();
    int choice = 1;
    System.out.println("Congratulations on your new puppy!");
    while (choice != 3){
      System.out.println("What would you like to do?\n1. Feed\n2. Play\n3. Quit");
      choice = CheckInput.getIntRange(1,3);
      if (choice == 1){
        System.out.println(p.giveFood());
      }
      else if (choice ==2){
        System.out.println(p.throwBall());
      }
    }
  }
}
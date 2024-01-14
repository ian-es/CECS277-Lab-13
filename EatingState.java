public class EatingState implements PuppyState{

  /** Returns a string for the state change from eating to playing
  @param puppy to perform the action
  @return String detailing the actions the puppy takes
  */
  @Override
  public String play(Puppy p){
    p.incPlays();
    p.setState(new PlayState());
    return "The puppy looks up from its food and chases the ball you threw.";
  }

  /** Returns a string for the state repetition of eating
  @param puppy to perform the action
  @return String detailing the actions the puppy takes
  */
  @Override
  public String feed(Puppy p){
    int feeds = p.incFeeds();
    String action = "The puppy continues to eat as you add another scoop of kibble to its bowl.";
    if (feeds ==2){
      p.reset();
      p.setState(new AsleepState());
      action += "\nThe puppy ate so much it fell asleep.";
    }
    return action;
  }
}
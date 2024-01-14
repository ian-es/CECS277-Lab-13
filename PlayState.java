public class PlayState implements PuppyState{

  /** Returns a string for the state repetition of playing
  @param puppy to perform the action
  @return String detailing the actions the puppy takes
  */
  @Override
  public String play(Puppy p){
    int plays = p.incPlays();
    String action = "You throw the ball again and the puppy excitedly chases it.";
    if (plays ==3){
      p.reset();
      action += "\nThe puppy played so much it fell asleep.";
      p.setState(new AsleepState());
    }
    return action;
  }

  /** Returns a string for the state (non) change from playing to eating
  @param puppy to perform the action
  @return String detailing the actions the puppy takes
  */
  @Override
  public String feed(Puppy p){
    return "The puppy is playing. It would not like to eat right now.";
  }
}
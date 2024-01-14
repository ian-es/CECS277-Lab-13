public class AsleepState implements PuppyState{

  /** Returns a string for the state (non) change from sleeping to playing
  @param puppy to perform the action
  @return String detailing the actions the puppy takes
  */
  @Override
  public String play(Puppy p){
    return "The puppy is asleep. It doesn't want to play right now.";
  }

  /** Returns a string for the state change from sleeping to eating
  @param puppy to perform the action
  @return String detailing the actions the puppy takes
  */
  @Override
  public String feed(Puppy p){
    p.incFeeds();
    p.setState(new EatingState());
    return "The puppy wakes up and comes running to eat.";
  }
}
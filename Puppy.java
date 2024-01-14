public class Puppy{
  private PuppyState state;
  private int numFeeds;
  private int numPlays;

  public Puppy(){
    state = new AsleepState();
  }
  public void setState(PuppyState s){
    state = s;
  }
  public String throwBall(){
    return state.play(this);
  }
  public String giveFood(){
    return state.feed(this);
  }
  public int incFeeds(){
    numFeeds++;
    return numFeeds;
  } 
  public int incPlays(){
    numPlays++;
    return numPlays;
  }
  public void reset(){
    numPlays = 0;
    numFeeds = 0;
  }
}
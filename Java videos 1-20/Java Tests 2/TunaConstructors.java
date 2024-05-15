

public class TunaConstructors {
  private String girlName;
  public TunaConstructors(String name){
  girlName = name;
  }
  public void setName(String name){
    girlName = name;
  }
  public String getName(){
    return girlName;
  }
  public void saying(){
    System.out.printf("Your first gf was %s/n", getName());
  }
}

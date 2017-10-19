class Pig implements Animal
{
  private String myType;     
  private String mySound;      
  public Pig(String type, String sound, String sound2)     
  {         
    myType = type;         
    if ((Math.random()*1)<.5)
    mySound = sound; 
    else
    mySound = sound2;
  }     
  public Pig()     
  {         
    myType = "unknown";         
    mySound = "unknown";     
  }      
  public String getSound(){return mySound;}     
  public String getType(){return myType;} 
}
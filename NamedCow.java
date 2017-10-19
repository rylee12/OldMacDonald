class NamedCow extends Cow
{
  private String myName;
  private String mySound;
  private String myType;
  public NamedCow(String type, String name, String sound)
  {
    myType = type;
    myName = name;
    mySound = sound;
  }
  public String getName()
  {
    return myName;
  }
}
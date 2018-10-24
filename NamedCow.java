class NamedCow extends Cow
{
	protected String myName;  
  public NamedCow (String name, String type, String sound) 
    {  
      myType = type;         
      mySound = sound;
      myName = name;        
    }
    public String getName() 
  { 
  	return myName; 
  }

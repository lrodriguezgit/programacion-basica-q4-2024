package Characters.Skills;

public class Skill {
    private final String name;
    private final String description;
    private final String type; //Normal, Buff, SP attack


    //Constructor
    public Skill (String name, String description, String type){
        this.name = name;
        this.description = description;
        this.type = type;
    }
    //public abstract void Use();

    //Getter
    public String getName(){
        return this.name;
    }
    public String getDescription(){
        return this.description;
    }
    public String getType(){
        return this.type;
    }
}


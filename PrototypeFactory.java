import java.util.HashMap;


public class PrototypeFactory{

    private HashMap<String, Prototype> prototypes = new HashMap<>();


    public void addPrototype (String key, Prototype prototype){
        prototypes.put(key, prototype);
    }

    public Prototype getPrototype (String key){
        return prototypes.get(key).clone();
    }


}




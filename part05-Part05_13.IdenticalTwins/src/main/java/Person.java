
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    public boolean equals (Object compared) {
        if(this == compared) {
            return true;
        }        
        if(!(compared instanceof Person)) {
            return false;
        }
        
        Person person2 = (Person) compared;
        
        if(this.name.equals(person2.name) &&
           this.birthday.equals(person2.birthday) &&
           this.height == person2.height &&
           this.weight == person2.weight) {
           return true;
        }
            
        return false;
    }
}

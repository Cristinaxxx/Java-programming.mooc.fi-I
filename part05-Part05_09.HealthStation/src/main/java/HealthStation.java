
public class HealthStation {

    private int numberOfWeighings;
    
    public HealthStation() {
        this.numberOfWeighings = 0;
    }

    public int weigh(Person person) {
        this.numberOfWeighings++;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }
    
    public int weighings() {
        return numberOfWeighings;
    } 
    
}

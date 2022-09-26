//person class which will be used for passengers, cabin crew and pilot.
//this should be an abstract class, but there's no real downside from it, just that we don't want to accidentally create an instance of person.
public abstract class Person {
    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

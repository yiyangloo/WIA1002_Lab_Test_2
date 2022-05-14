import java.util.ArrayList;
import java.util.Arrays;

public class Person {
    String name;
    int age;
    String gender;
    String occupation;
    ArrayList<String> occupation_list = new ArrayList<>(Arrays.asList("doctor","nurse","teacher","police"));
    boolean frontliner;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.gender = null;
        this.occupation = "Not frontliner";
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.occupation = "Not frontliner";
    }

    public Person(String name, int age, String gender, String occupation) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.occupation = occupation;
        this.frontliner = setFrontliner(occupation);
    }

    public boolean setFrontliner(String occupation) {
        if (this.occupation_list.contains(occupation)){
            return true;
        }
        return false;
    }

}





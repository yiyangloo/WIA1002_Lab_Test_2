import java.text.MessageFormat;
import java.util.ArrayList;


public class Stack {

    private ArrayList<Person> list = new ArrayList<>();

    private String stack_name;

    public Stack(String stack_name) {
        this.stack_name = stack_name;
    }

    public void displayStack(){
        System.out.println("----" + stack_name + "----");
        for (int i = list.size()-1 ; i >= 0 ; i--) {
            Person target = list.get(i);
            String isFrontliner = target.frontliner ? "Frontliner" : "Not frontliner";
            System.out.println(MessageFormat.format("{0} {1} {2} {3} {4}", i, target.name, target.age, target.gender, isFrontliner));
        }
        if (list.isEmpty()){
            System.out.println("Empty stack");
        }
        System.out.println();
    }

    public int getSize() {
        return list.size();
    }

    public void push(String name, int age) {
        list.add(new Person(name, age));
    }

    public void push(String name, int age, String gender){
        list.add(new Person(name, age, gender));
    }

    public void push(String name, int age, String gender, String occupation){
        list.add(new Person(name, age, gender, occupation));
    }

    public void push(Person o) {
        list.add(o);
    }

    public Person pop() {
        Person o = (Person) list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public Person peek() {
        return (Person) list.get(getSize() - 1);
    }

    public boolean isEmpty() { return list.isEmpty();   }
}

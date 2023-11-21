class Person {
    String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
        public int getAge() {
        return this.age;
    }
}

public class PrettyGirl extends Person {
    PrettyGirl(String name, int age) {
        super(name, age);
    }

    public static void main(String args[]) {
        PrettyGirl me = new PrettyGirl("Toey", 19);
        System.out.println("Name: " + me.name);
        System.out.println("Age: " + me.getAge()); 
    }


}
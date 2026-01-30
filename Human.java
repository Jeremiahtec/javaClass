public class Human {
    String name;
    int age;
    
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        Human h1 = new Human("Alice", 30);
        Human h2 = new Human("Bob", 25);
        System.err.println(h1.name + " is " + h1.age + " years old.");
        System.err.println(h2.name + " is " + h2.age + " years old.");
    }
}

public class Main {
    public static void main(String[] args) {
        //todo Реализовать класс Утка и Собака по описанным в ТЗ правилам.
        Duck duck = new Duck(3.5, 2,"кряка");
        duck.walk();
        duck.move();

        Dog dog = new Dog(7, 3, "дик");
        dog.walk();
        dog.move();
    }
}

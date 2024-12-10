package hometasks;

public class Main {
    public static void main(String[] args) {

        GenericClass integerObject = new GenericClass<>(100);
        System.out.println(integerObject.get());

        GenericClass<String> stringObject = new GenericClass<>("Java");
        System.out.println(stringObject.get());

    }
}

package validation;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) throws Exception {
        if (name == null || name == "" || name.length() > 40){
            throw new IllegalArgumentException("Hello");
        } else {
            this.name = name;
        }

        if (age > 120 || age < 0) {
            throw new IllegalArgumentException("World");
        } else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

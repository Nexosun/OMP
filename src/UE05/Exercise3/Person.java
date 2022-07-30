package UE05.Exercise3;

public class Person<T> implements Older<T>{
private String name;
private int age;

Person(){};
Person(String name , int age){          // new constructor to instantly add name and age to object
    this.name = name;
    this.age = age;
}

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    @Override
    public boolean isOlder(T other) {
    Person otherOne = (Person) other;       // cast T to person
    if(this.getAge() > otherOne.getAge()){      // if this is older than given person = true
        return true;
    }
        return false;
    }
}

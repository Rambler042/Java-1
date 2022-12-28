public class Person {

    private String name;
    private int age;
    private int id;
    private static int counter;

    static{
        counter = 1;
    }
    {
        name = "noName";
        age = 18;
    }

    // Конструктор Person
    Person(){
        id = counter++;
    }
    Person(String name){
        this.name = name;
        id = counter++;
    }
    Person(String name, int age){
        this.name = name;
        this.age = age;
        id = counter++;
    }

    // Геттеры и сеттеры для name и age
    protected void setName(String name){
        this.name = name;
    }
    protected String getName(){
        return this.name;
    }
    protected void setAge(int age){
        if(age > 0 && age < 110){
            this.age = age;
        }
    }
    protected int getAge(){
        return this.age;
    }

    // Метод выводит информацию об объекте
    public void displayInfo(){
        System.out.printf("Name: %s, Age: %d, Id: %d \n", name, age, id);
    }


}
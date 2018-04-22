public class Dog {
    String name;
    String breed;
    int age;

    public Dog(String name, String breed, int age)
    {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return("hi my name is "+this.name+"\n My breed is "+this.breed+"\n And y have "+this.age+"years old");
    }
}
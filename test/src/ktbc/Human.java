package ktbc;


import java.io.Serializable;

public class Human implements Serializable{
    private String name;
    private int age;
    private String gender;
    private int phoneNumber;

    public Human(){ }

    public Human(String name, int age, String gender, int phoneNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    public String ghiFile() {
        return
                "name= " + name +
                ", " + "age=" + age +
                ", " + "gender= " + gender +
                ", " + "phoneNumber= " + phoneNumber;
    }
}

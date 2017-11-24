package SerializationExample;

import java.io.*;

class Dog implements Serializable{
    int age=10;
    String name = "Tommy";
    String color ="black";
    String wieght ="22 kg";

}

public class SerializationDemo {
    public static void main(String args[]) throws Exception {
        Dog dog1 = new Dog();
        FileOutputStream fos = new FileOutputStream("dog.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(dog1);

        FileInputStream  fis = new FileInputStream("dog.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
     //   ois.readObject();
        Dog dog2 = (Dog) ois.readObject();
        System.out.println(dog2.age +" "+dog2.color+" "+dog2.name+" "+dog2.wieght);

    }
}

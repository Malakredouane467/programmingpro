package ex3;
public class TestDog {
public static void main(String[] args) {
Dog dog = new Dog("Rex", 2);
System.out.println(dog.getName() + " : " + dog.getAge());
while (dog.getAge() < 7) {
dog.celebrateBirthday();
dog.bark();
System.out.print("w");
}
System.out.println();
dog.setName("Rex-the-Wise");
System.out.println(dog.getName());
for (int i = 0; i < 3; i++) {
dog.celebrateBirthday();
dog.bark();
System.out.print("w");
}
System.out.println();
System.out.println(dog.getName() + " : " + dog.getAge());
}
}
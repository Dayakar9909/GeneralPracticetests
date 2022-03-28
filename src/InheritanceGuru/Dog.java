package InheritanceGuru;

public class Dog {

    String breed;
    String size;
    int age;
    String color;

    public String getInfo(){
        return("Breed is:"+breed+"Size is:"+size+"Age is:"+age+"Color is:"+color);
    }

    public static void main(String[] args) {

        Dog maltese = new Dog();
        maltese.breed="Maltese";
        maltese.size="Small";
        maltese.age=3;
        maltese.color="White";

            System.out.print(maltese.getInfo());

        }
    }



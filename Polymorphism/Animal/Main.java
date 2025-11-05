class Animal {
    public void mySound(){
        System.out.println("Sound of the Animal");
    }
}
class Pig extends Animal{ //Subclass of Animal
    public void mySound(){
        System.out.println("Pew Pew!!");
    }
    
}
class Dog extends Animal{ //Subclass of Animal
    public void mySound(){
        System.out.println("Bhow Bhow!!");
    }
    
}
class Cat extends Animal{ //Subclass of Animal
    public void mySound(){
        System.out.println("Meow Meow!!");
    }
    
}
class Demo{
    public static void main(String[] args){
      //Type of variable is animal but the object it points to is Pig Dog etc
        Animal myAnimal = new Animal();
        Animal myPig= new Pig(); // Java looks at the actual object not the refrence type(Animal) So it runs the mySound() method of the Pig class.
        Animal myDog= new Dog();//The type of the variable is Animal, but the object it points to is a Pig or Dog. This is Dynamic Method despatch
        Animal myCat= new Cat();
        myAnimal.mySound();
        myPig.mySound();
        myDog.mySound();
        myCat.mySound();
    }
}

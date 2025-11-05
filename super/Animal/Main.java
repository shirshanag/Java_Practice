class Animal{
    public void animalVoice(){
        System.out.println("Sound of Dog!!");
    }
    
}
class Dog extends Animal{
    
    public void animalVoice(){
        super.animalVoice();//call parent method
        System.out.println("Bhow Bhow!!");
        
    }
}
class Main{
    public static void main(String[] args){
        Animal animal=new Dog();
        animal.animalVoice();
    }
}

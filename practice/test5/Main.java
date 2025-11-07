interface Player{
    void play();
}
class Child implements Player{
    public void play(){
        System.out.println("Child plays game!!");
    }
}
class Musician implements Player{
    public void play(){
        System.out.println("Musician plays Music!!");
    }
}
class Actor implements Player{
    public void play(){
        System.out.println("Actor plays art!");
        
    }
}
class UserPlayer{
    public static void main(String[] args){
    Child c=new Child();
    Musician m= new Musician();
    Actor a=new Actor();
    c.play();
    m.play();
    a.play();
    }
}

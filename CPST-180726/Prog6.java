abstract class Prog6{
    abstract public void show();

    public void display(){
        IO.println("DISPLAY");
    
  }
}

class Demo extends Prog6{
    public void show(){
        IO.println("i am show from meesho");
    }
    public static void main(String args[]){
        Demo x = new Demo();
        x.display();

    }
}

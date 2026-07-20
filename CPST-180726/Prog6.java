abstract class Prog6{
    abstract public void show();

    public void display(){
    IO.println("Display");
    
  }
}

class prog extends Prog6{
    public void show(){
        IO.println("i am show from meesho");
    }
    public static void main(String args[]){
        prog x = new prog();
        x.display();

    }
}

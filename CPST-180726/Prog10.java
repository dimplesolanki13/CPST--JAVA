 class   Arithematic{
     public int add(int x,int y){
        return x+y;

    }
    
}

class Adder extends Arithematic{
        
}
void main(){
               Adder a =new Adder();
               IO.println(a.getClass().getClass().getSuperclass().getName());
}


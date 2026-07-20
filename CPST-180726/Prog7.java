class Prog7 {
    public void myVehicle(){
        System.out.println("HONDA CRV");
    }
    
}
//SUN,DERIVED,CHILD
class Prog extends Prog7{
    @Override
    public void myVehicle(){
    //override
    System.out.println("toyata Rava4");
}
void main(){
    this.myVehicle(); //this -> current class
    super.myVehicle(); //this refers to parent class or base class or super class
}
}
abstract class Employee {
    abstract public double calculateSalary(double x);
    abstract public String displayInfo(String s);
    
}
class Manager extends Employee{
    @Override
        abstract public double calculateSalary(double a){
return a;
        }
    abstract public String displayInfo(String t){
return t;
    }

}
class Programmer extends Employee{
    @Override
      abstract public double calculateSalary(double a){
          return a;
        }
    abstract public String displayInfo(String t){
         return s;
    }
}
class MAinEmp{
    void main(){
        Manager m = new Manager();
        Programmer p = new Programmer();
        
    }
}

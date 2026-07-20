 class Animal{
    public void makeSound(){
        IO.println("Bark");

    }
}

class cat extends Animal{
    @Override
    public void makeSound(){
            IO.println("Meow");
            super.makeSound();
    }
}
void main()
    {
         cat c = new cat();
         c.makeSound();
    }

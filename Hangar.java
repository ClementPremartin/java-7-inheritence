//Vehicule superClass 
abstract class Vehicule{

    String brand;
    int kilometers;

    public Vehicule(String brand, int kilometers){
        this.brand = brand;
        this.kilometers = kilometers;
    }

    public abstract String noise();

    public String getBrand(){
        return this.brand;
    }

    public int getKilometers(){
        return this.kilometers;
    }

    public void setBrand(String newBrand){
        brand = newBrand;
    }

    public void setKilometers(int newKilometers){
        kilometers = newKilometers;
    }
}

// Subclass

class Car extends Vehicule {
    public Car(String brand, int kilometers){
        super(brand, kilometers);
    }

    @Override
    public String noise(){
        return "Vroooooom";
    }
}

class Boat extends Vehicule {
    public Boat(String brand, int kilometers){
        super(brand, kilometers);
    }

    @Override
    public String noise(){
        return "Glougloup";
    }
}

//main class

class Hangar {
    public static void main(String[] args){

        Car alpine = new Car("alpine", 2563);
        Boat feeling = new Boat("feeling 920", 3654);

        System.out.println("alpine kilometers before race: " + alpine.getKilometers());
        alpine.setKilometers(4658);
        System.out.println("alpine kilometers after race: " + alpine.getKilometers());

        System.out.println(alpine.getBrand() + " " + "do " + alpine.noise() + " during formula 1 race");
        System.out.println(feeling.getBrand() + " " + "do " + feeling.noise() + " when its goes out of port");

    }
}

// Abstract Product: Garment
interface Garment {
    void create();
}

// Products: Top, Pant, Shoe
class Top implements Garment {
    @Override
    public void create() {
        System.out.println("Creating Top");
    }
}

class Pant implements Garment {
    @Override
    public void create() {
        System.out.println("Creating Pant");
    }
}

class Shoe implements Garment {
    @Override
    public void create() {
        System.out.println("Creating Shoe");
    }
}

// Abstract Factory: GarmentFactory
interface GarmentFactory {
    Top createTop();
    Pant createPant();
    Shoe createShoe();
}

// Factories: Professional, Casual, Party
class ProfessionalGarmentFactory implements GarmentFactory {
    @Override
    public Top createTop() {
        return new Top();
    }

    @Override
    public Pant createPant() {
        return new Pant();
    }

    @Override
    public Shoe createShoe() {
        return new Shoe();
    }
}

class CasualGarmentFactory implements GarmentFactory {
    @Override
    public Top createTop() {
        return new Top();
    }

    @Override
    public Pant createPant() {
        return new Pant();
    }

    @Override
    public Shoe createShoe() {
        return new Shoe();
    }
}

class PartyGarmentFactory implements GarmentFactory {
    @Override
    public Top createTop() {
        return new Top();
    }

    @Override
    public Pant createPant() {
        return new Pant();
    }

    @Override
    public Shoe createShoe() {
        return new Shoe();
    }
}


public class GarmentSimulator {
    public static void main(String[] args) {
        // Factory for desired variant
        GarmentFactory factory = new ProfessionalGarmentFactory();

        // Creating separate garments
        Top top = factory.createTop();
        Pant pant = factory.createPant();
        Shoe shoe = factory.createShoe();

        // Testing of the created garments
        top.create();
        pant.create();
        shoe.create();
    }
}
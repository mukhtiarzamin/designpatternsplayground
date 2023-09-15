package grasp.creator.without;

public class SupplySystem {
    public void demonstrateWaterSupplyBeforeCovid(){

        System.out.println("Demonstrating Problem Solution without using Creator Principle ....");

        Water objWater = new Water(true);
        Human objHuman = new Human(objWater);
        objHuman.useWater();

        objWater = new Water(false);
        Animal objAnimal = new Animal(objWater);
        objAnimal.useWater();

        objWater = new Water(false);
        Tree objTree = new Tree(objWater);
        objTree.useWater();
    }
}

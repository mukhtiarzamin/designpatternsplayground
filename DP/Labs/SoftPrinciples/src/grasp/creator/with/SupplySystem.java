package grasp.creator.with;

public class SupplySystem {
    public void demonstrateWaterSupplyBeforeCovid(){
        System.out.println("\n\nDemonstrating Creator Principle ....");

        Human objHuman = Factory.getHumanInstance();
        objHuman.useWater();

        Animal objAnimal =  Factory.getAnimalInstance();
        objAnimal.useWater();

        Tree objTree = Factory.getTreeInstance();
        objTree.useWater();
    }
}

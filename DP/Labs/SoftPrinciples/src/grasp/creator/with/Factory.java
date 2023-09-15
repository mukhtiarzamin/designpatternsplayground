package grasp.creator.with;

public class Factory {
    public static Water getCleanWaterInstance() {
        return new Water(true);
    }

    public static Water getDirtyWaterInstance() {
        return new Water(false);
    }

    public static Human getHumanInstance() {
        return  new Human(Factory.getCleanWaterInstance());
    }

    public static Animal getAnimalInstance() {
        return new Animal(getDirtyWaterInstance());
    }

    public static Tree getTreeInstance() {
        return new Tree(getDirtyWaterInstance());
    }
}

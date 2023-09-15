package grasp.creator.without;

public class Human {
    Water objWater;
    public Human(Water cleanWater) {
        this.objWater = cleanWater;
    }

    public void useWater(){
        System.out.println("When human are thirsty they drink " + objWater.useWater());
    }
}

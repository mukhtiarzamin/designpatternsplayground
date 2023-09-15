package grasp.creator.without;

public class Animal {
    Water objWater;
    public Animal(Water mudyWater) {
        this.objWater = mudyWater;
    }
    public void useWater(){
        System.out.println("When animals are thirsty they drink " + objWater.useWater());
    }
}

package grasp.creator.without;

public class Tree {
    Water objWater;
    public Tree(Water dirtyWater) {
        this.objWater = dirtyWater;
    }

    public void useWater(){
        System.out.println("When tree has water, They can use  " + objWater.useWater());
    }
}

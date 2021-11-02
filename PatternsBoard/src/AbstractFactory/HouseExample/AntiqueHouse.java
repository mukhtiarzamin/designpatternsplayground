/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.HouseExample;

/**
 *
 * @author Mukhtiar
 */
public class AntiqueHouse  extends HouseComponent implements HouseFactory {

    @Override
    public Ceiling buildCeiling() {
        return new AntiqueCeiling();
    }

    @Override
    public Walls buildWalls() {
        return new AntiqueWalls();
    }

    @Override
    public Furniture buildFurniture() {
        return new AntiqueFurniture();
    }
    
}

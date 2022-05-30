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
public class HouseConstructionCompany {
    HouseFactory factory;
    public String buildModernHouse() {
        factory = new ModernHouse();
        StringBuilder sb=new StringBuilder();
        sb.append("Modern House Building");
        sb.append(buildHouse());
        return sb.toString();
    }

    private String buildHouse() {
        factory.buildWalls();
        factory.buildCeiling();
        factory.buildFurniture();
    }
    
}

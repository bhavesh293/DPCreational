package com.company.project.builder;

class WoodenHouseBuilder implements HouseBuilder
{
    private House house;
  
    public WoodenHouseBuilder() 
    {
        this.house = new House();
    }
  
    public void buildBasement() 
    {
        house.setBasement("Wooden Bars");
    }
  
    public void buildStructure() 
    {
        house.setStructure("Wooden Blocks");
    }
  
    public void buildInterior() 
    {
        house.setInterior("Wooden Carvings");
    }
  
    public void buildRoof() 
    {
        house.setRoof("Wooden Dome");
    }
  
    public House getHouse() 
    {
        return this.house;
    }
}

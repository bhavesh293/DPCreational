package com.company.project.builder;

class IglooHouseBuilder implements HouseBuilder
{
    private House house;
  
    public IglooHouseBuilder() 
    {
        this.house = new House();
    }
  
    public void buildBasement() 
    {
        System.out.println("building basement");
    	house.setBasement("Ice Bars");
    }
  
    public void buildStructure() 
    {
        house.setStructure("Ice Blocks");
    }
  
    public void buildInterior() 
    {
        house.setInterior("Ice Carvings");
    }
  
    public void buildRoof() 
    {
        house.setRoof("Ice Dome");
    }
  
    public House getHouse() 
    {
        return this.house;
    }
}

package com.company.project.builder;

class BuilderMain
{
    public static void main(String[] args)
    {
        HouseBuilder iglooBuilder = new IglooHouseBuilder();
        CivilEngineer engineer = new CivilEngineer(iglooBuilder);
  
        engineer.constructHouse(); // this will call build basement, wall etc.
  
        House house = engineer.getHouse();
  
        System.out.println("Builder constructed: "+ house);
    }
}
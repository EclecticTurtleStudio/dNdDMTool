package org.launchcode.dNdDMTool.models;

import java.util.ArrayList;

public class WorldDetails {

    private String name;
    private Integer population;

    private ArrayList<String> NameOptions = new ArrayList<>();

    public WorldDetails(){
        this.NameOptions = addNamesToOptions();
        randomizeWorldName();
    }

    public WorldDetails(String name, Integer population) {
        this.name = name;
        this.population = population;
    }

    public ArrayList<String> addNamesToOptions(){
        NameOptions.add("BobTown");
        NameOptions.add("Smiddler City");
        NameOptions.add("Hellsville");
        NameOptions.add("Doom");
        NameOptions.add("New World");
        NameOptions.add("Pizza Hut");
        NameOptions.add("Not Heaven");

        return NameOptions;
    }

    public void randomizeWorldName(){
        int nameLocation = (int)(Math.random() * NameOptions.size());
        this.setName(NameOptions.get(nameLocation));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public ArrayList<String> getNameOptions() {
        return NameOptions;
    }

    public void setNameOptions(ArrayList<String> nameOptions) {
        NameOptions = nameOptions;
    }

    @Override
    public String toString() {
        return "WorldDetails{" +
                "name='" + name + '\'' +
                '}';
    }
}

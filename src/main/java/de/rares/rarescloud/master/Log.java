package de.rares.rarescloud.master;

public enum Log {


    INFO("Info"), WARNING("Warnung"), ERROR("Error");
    private String name;

    Log(String info) {
        name = info;
    }


    public String getName() {
        return name;
    }
}

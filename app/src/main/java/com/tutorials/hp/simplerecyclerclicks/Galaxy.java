package com.tutorials.hp.simplerecyclerclicks;

/**
 * Created by Oclemy on 2017 for ProgrammingWizards TV Channel and http://www.camposha.info.
 - Our Galaxy class.
 - Our data object.
 - Each galaxy will have a name, description and image.
 */

public class Galaxy {

    private String name,description;
    private int image;

    public Galaxy(String name, String description, int image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }
}

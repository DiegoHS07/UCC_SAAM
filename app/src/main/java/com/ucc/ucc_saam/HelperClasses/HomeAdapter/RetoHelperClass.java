package com.ucc.ucc_saam.HelperClasses.HomeAdapter;

import java.io.Serializable;

public class RetoHelperClass implements Serializable {
    int image;
    String title, points, category, organitation, description;

    public RetoHelperClass(int image, String title, String points, String category, String organitation, String description) {
        this.image = image;
        this.title = title;
        this.points = points;
        this.category = category;
        this.organitation = organitation;
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getPoints() {
        return points;
    }

    public String getCategory() {
        return category;
    }

    public String getOrganitation() {
        return organitation;
    }

    public String getDescription() {
        return description;
    }
}

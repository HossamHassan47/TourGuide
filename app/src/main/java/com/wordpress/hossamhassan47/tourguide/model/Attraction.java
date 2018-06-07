package com.wordpress.hossamhassan47.tourguide.model;

/**
 * Model Class to hold location data i.e Top Attractions, Mosques, Parks, Streets
 *
 */
public class Attraction {
    private String title;
    private String description;
    private int imageResourceId;
    private String openHours;
    private String direction;

    public Attraction(String title, String description, int imageResourceId, String openHours, String direction){
        this.title = title;
        this.description = description;
        this.imageResourceId = imageResourceId;
        this.openHours = openHours;
        this.direction = direction;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public String getOpenHours() {
        return openHours;
    }

    public void setOpenHours(String openHours) {
        this.openHours = openHours;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}

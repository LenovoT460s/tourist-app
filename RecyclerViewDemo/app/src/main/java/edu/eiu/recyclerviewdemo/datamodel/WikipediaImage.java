package edu.eiu.recyclerviewdemo.datamodel;

import com.google.gson.annotations.SerializedName;

public class WikipediaImage {

    @SerializedName("source")
    private String source;

    @SerializedName("width")
    private int width;

    @SerializedName("height")
    private int height;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

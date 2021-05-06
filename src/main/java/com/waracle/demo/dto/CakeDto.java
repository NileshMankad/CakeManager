package com.waracle.demo.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nilesh
 */
public class CakeDto {
	
    Integer cakeId;
    String title;
    String description;
    String image;
    
    public CakeDto(Integer cakeId, String title, String description, String image) {
        this.cakeId = cakeId;
        this.title = title;
        this.description = description;
        this.image = image;
    }
    public CakeDto() {
    }
    public Integer getCakeId() {
        return cakeId;
    }
    public void setCakeId(Integer cakeId) {
        this.cakeId = cakeId;
    }
    public String getTitle() {
        return title;
    }
    public String getDescription() {
    	return description;
    }
    public String getImage() {
    	return image;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDescription(String description) {
    	this.description = description;
    }
    public void setImage(String image) {
    	this.image = image;
    }
}

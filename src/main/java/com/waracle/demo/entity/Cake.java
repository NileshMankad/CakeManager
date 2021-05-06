package com.waracle.demo.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Nilesh
 */
@Entity
@org.hibernate.annotations.Entity(dynamicUpdate = true)
@Table(name = "Cake", uniqueConstraints = {@UniqueConstraint(columnNames = "ID"), @UniqueConstraint(columnNames = "TITLE")})

public class Cake implements Serializable{

    private static final long serialVersionUID = 0x62A6DA99AABDA8A8L;
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private Integer cakeId;

    @Column(name = "TITLE", unique = true, nullable = false, length = 100)
    private String title;

    @Column(name = "DESCRIPTION", unique = false, nullable = false, length = 100)
    private String description;

    @Column(name = "IMAGE", unique = false, nullable = false, length = 300)
    private String image;

    public String getTitle() {
        return title;
    }
    public void setCakeId(Integer cakeId) {
    	this.cakeId = cakeId;
    }
    public Integer getCakeId() {
    	return cakeId;
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
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public Cake() {
    }
    public Cake(String title, String description, String image) {
           this.title = title;
           this.description = description;
           this.image = image;
    }
}

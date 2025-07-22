package com.Solera.APIRest.APIwithTDD.Models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VehiclesClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Model;
    private String Brand;
    private String VehicleYear;
    private String Color;
    private String Vin;

    @ManyToOne
    @JoinColumn (name = "Workshop_id" )
    private WorkshopClass Workshop;

    @OneToMany (mappedBy = "vehicle")
    private List <PartsClass> parts;

    public String getModel(){

        return this.Model;
    }

    //private models.VehiclesClass VehiclesClass;
    public Long getId(){
        return this.id;
    }
    public String getModel() {
        return this.Model;
    }
    public String getBrand() {
        return this.Brand;
    }
    public String getYear() {
        return this.VehicleYear;
    }
    public String getColor() {
        return this.Color;
    }
    public String getVin() {
        return this.Vin;
    }

}

package com.Solera.APIRest.APIwithTDD.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class PartsClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Name;
    private String Description;

    @ManyToOne
    @JoinColumn (name = "vehicle_id")
    private VehiclesClass vehicle;

    //private models.PartsClass PartClass;
    public Long getId (){
        return this.id;
    }
    public String getName() {
        return this.Name;
    }
    public String getDescription() {
        return this.Description;
    }
}

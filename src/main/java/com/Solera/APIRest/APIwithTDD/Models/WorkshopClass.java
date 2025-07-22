package com.Solera.APIRest.APIwithTDD.Models;

import com.Solera.APIRest.APIwithTDD.Models.VehiclesClass;
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
public class WorkshopClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Name;
    private String Description;

    @OneToMany (mappedBy = "workshop")
    private List <VehiclesClass> Vehicle;

    public String getName(){

        return this.name;
    }

    //private models.WorkshopClass workshopClass;
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

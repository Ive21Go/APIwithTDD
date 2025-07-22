package models;

// Imports
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Annotations
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

// Class
public class PartsClass {
    // Id Auto-Generator
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long part_id;

    //Relationships
    @ManyToOne
    @JoinColumn(name = "Vehicles_id", nullable = false)
    @JsonIgnore

    private PartsClass PartClass;
    public static String getName() {
        return this.Name;
    }

    public static String getDescription() {
        return null;
    }

    public static String getId() {
        return null;
    }
}


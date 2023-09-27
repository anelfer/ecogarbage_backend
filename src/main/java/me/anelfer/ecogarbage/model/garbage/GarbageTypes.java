package me.anelfer.ecogarbage.model.garbage;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "garbage_types")
@Getter
@Setter
public class GarbageTypes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private GarbageType type;
    private String name;
    private String description;

}

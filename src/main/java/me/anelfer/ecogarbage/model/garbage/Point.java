package me.anelfer.ecogarbage.model.garbage;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "garbage_points")
@Getter
@Setter
public class Point {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;
    @OneToMany(fetch = FetchType.EAGER)
    private Set<GarbageTypes> garbageType;
    private double lng;
    private double lat;

}

package de.hhu.propra.db.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data // Lombok - Generiert Getter, Setter, toString, ...
@Entity
public class Kunde {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String stadt;
    private Integer plz;

    @OneToMany(cascade = CascadeType.ALL)
	private List<Auto> autos;
    
}

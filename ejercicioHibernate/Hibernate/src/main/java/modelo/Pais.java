package modelo;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.UUID;

@Entity
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Pais implements Serializable {

    @Id
    private UUID id;

    private String nombre;

    public Pais(){
        id=UUID.randomUUID();
    }


}

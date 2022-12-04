package ma.ac.emi.ginfo.hg.emiflights.entities.embeddedIds;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import ma.ac.emi.ginfo.hg.emiflights.entities.Airport;
import ma.ac.emi.ginfo.hg.emiflights.entities.Plane;

import java.io.Serializable;

@NoArgsConstructor
@EqualsAndHashCode
public class FlightGenericPK implements Serializable {

    @ManyToOne
    @MapsId
    @JoinColumn(name = "plane_id")
    private Plane plane;
    @ManyToOne
    @MapsId
    private Airport departureAirport;
}

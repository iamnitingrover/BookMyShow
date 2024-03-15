package in.nitingrover.BookMyShow.model;

import in.nitingrover.BookMyShow.model.constant.AuditoriumFeature;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Auditorium extends BaseModel{
    private String name;
    private int capacity;
    @OneToMany
    private List<Show> shows;
    @OneToMany
    private List<Seat> seats;
    @ElementCollection // userd when Enum is in multuiple, iem a data structure eg - List, Set, etc.
    @Enumerated(EnumType.STRING)  // creates a relationship between the entitity and enum in DB.
    private List<AuditoriumFeature> auditoriumFeatures;
}

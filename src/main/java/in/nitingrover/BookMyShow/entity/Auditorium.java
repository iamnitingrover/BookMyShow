package in.nitingrover.BookMyShow.entity;

import in.nitingrover.BookMyShow.entity.constant.AuditoriumFeature;
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
    @ElementCollection // used when Enum is in multiple, ie a data structure eg - List, Set, etc.
    @Enumerated(EnumType.STRING)  // creates a relationship between the entity and enum in DB.
    private List<AuditoriumFeature> auditoriumFeatures;
}

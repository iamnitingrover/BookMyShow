package in.nitingrover.BookMyShow.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "BMS_User")
public class User extends BaseModel{
    private String name;
    private String email;
    private Long mobile;
    @OneToMany
    private List<Ticket> tickets;
}

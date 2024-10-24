package in.nitingrover.BookMyShow.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
public class BaseModel {
    @Id  //tells that the attribute is a primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int id;  //primary key
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String createdBy;
    private String updatedBy;
}

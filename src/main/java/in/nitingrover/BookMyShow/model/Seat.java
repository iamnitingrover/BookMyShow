package in.nitingrover.BookMyShow.model;

import in.nitingrover.BookMyShow.model.constant.SeatStatus;
import in.nitingrover.BookMyShow.model.constant.SeatType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel{
    private String seatNumber;
    @Enumerated(EnumType.STRING)
    private SeatType seatType;
    private int rows;
    private int columns;
    @Enumerated(EnumType.STRING)
    private SeatStatus seatStatus;
}

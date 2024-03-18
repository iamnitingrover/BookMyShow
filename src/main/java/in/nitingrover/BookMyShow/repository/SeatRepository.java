package in.nitingrover.BookMyShow.repository;

import in.nitingrover.BookMyShow.model.City;
import in.nitingrover.BookMyShow.model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatRepository extends JpaRepository <Seat, Integer> {
}

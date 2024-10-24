package in.nitingrover.BookMyShow.repository;

import in.nitingrover.BookMyShow.entity.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowSeatRepository extends JpaRepository <ShowSeat, Integer> {
}

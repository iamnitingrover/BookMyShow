package in.nitingrover.BookMyShow.repository;

import in.nitingrover.BookMyShow.model.Theater;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheaterRepository extends JpaRepository <Theater, Integer> {
}
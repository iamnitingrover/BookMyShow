package in.nitingrover.BookMyShow.repository;

import in.nitingrover.BookMyShow.model.City;
import in.nitingrover.BookMyShow.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository <Movie, Integer> {
}

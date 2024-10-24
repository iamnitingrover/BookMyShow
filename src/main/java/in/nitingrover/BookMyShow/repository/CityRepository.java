package in.nitingrover.BookMyShow.repository;

import in.nitingrover.BookMyShow.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository <City, Integer> {
}

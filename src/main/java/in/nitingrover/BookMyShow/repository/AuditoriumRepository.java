package in.nitingrover.BookMyShow.repository;

import in.nitingrover.BookMyShow.entity.Auditorium;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditoriumRepository extends JpaRepository <Auditorium, Integer> {
}

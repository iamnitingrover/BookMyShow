package in.nitingrover.BookMyShow.repository;

import in.nitingrover.BookMyShow.entity.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends JpaRepository <Actor, Integer> {
}

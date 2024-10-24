package in.nitingrover.BookMyShow.repository;

import in.nitingrover.BookMyShow.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository <Payment, Integer> {
}

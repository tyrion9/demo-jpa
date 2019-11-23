package demo.demojpa.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DemoInRepository extends JpaRepository<Customer, Long> {

    @Query ("select c from Customer c where c.address in (:address)")
    List<Customer> queryDemoIn (List<String> address);
}

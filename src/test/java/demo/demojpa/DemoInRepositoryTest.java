package demo.demojpa;

import demo.demojpa.domain.Customer;
import demo.demojpa.domain.DemoInRepository;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@Slf4j
public class DemoInRepositoryTest {
    @Autowired
    DemoInRepository demoInRepository;

    @Test
    @Transactional
    public void testDemoIn() {
        Customer customer = Customer.builder()
                .customerName("Pham Ngoc Hoai").address("Kim Van Kim Lu").age(34)
                .build();

        Customer customer2 = Customer.builder()
                .customerName("Ronaldo").address("Juventus").age(34)
                .build();

        Customer customer3 = Customer.builder()
                .customerName("Matthijs de Ligt").address("Juventus").age(20)
                .build();

        demoInRepository.save(customer);
        demoInRepository.save(customer2);
        demoInRepository.save(customer3);

        List<Customer> customers = demoInRepository.queryDemoIn(Lists.newArrayList("Juventus"));

        log.info("Found: {} ", customers.stream().map(x -> x.getCustomerName()).collect(Collectors.joining(", ")));
    }
}

package ro.fasttrackit.travel;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.fasttrackit.travel.domain.ImageUrl;
import ro.fasttrackit.travel.domain.Vacation;
import ro.fasttrackit.travel.persistence.VacationRepository;

import java.util.List;

@SpringBootApplication
public class TravelAgencyApplication {

    public static void main(String[] args) {
        SpringApplication.run(TravelAgencyApplication.class, args);
    }

    @Bean
    CommandLineRunner atStartup(VacationRepository repository) {
        return args -> repository.saveAll(List.of(
                new Vacation("Phoenicia Royal Hotel", 5, "Mamaia", 8.2, 12200, 7, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque pulvinar lacinia venenatis. Vestibulum tristique congue velit, vitae tincidunt elit tempor sed. Quisque laoreet, eros sed hendrerit maximus, sapien mi consectetur sapien, ut tincidunt leo risus et erat. Fusce ornare iaculis imperdiet. Sed in accumsan quam, eu dapibus ex. In facilisis, turpis in placerat accumsan, leo mi euismod odio, non blandit elit urna nec justo.", List.of(
                        new ImageUrl("https://r-cf.bstatic.com/images/hotel/max1280x900/222/222833986.jpg"),
                        new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1280x900/106/106854072.jpg"),
                        new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1280x900/104/104687960.jpg"))),
                new Vacation("Mera Onix", 4, "Jupiter", 8.9, 7350, 7, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque pulvinar lacinia venenatis. Vestibulum tristique congue velit, vitae tincidunt elit tempor sed. Quisque laoreet, eros sed hendrerit maximus, sapien mi consectetur sapien, ut tincidunt leo risus et erat. Fusce ornare iaculis imperdiet. Sed in accumsan quam, eu dapibus ex. In facilisis, turpis in placerat accumsan, leo mi euismod odio, non blandit elit urna nec justo.", List.of(
                        new ImageUrl("https://r-cf.bstatic.com/images/hotel/max1280x900/152/152301994.jpg"),
                        new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1280x900/189/189292151.jpg"),
                        new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1280x900/152/152301917.jpg"))),
                new Vacation("Hotel Saturn", 5, "Saturn", 7.7, 6200, 7, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque pulvinar lacinia venenatis. Vestibulum tristique congue velit, vitae tincidunt elit tempor sed. Quisque laoreet, eros sed hendrerit maximus, sapien mi consectetur sapien, ut tincidunt leo risus et erat. Fusce ornare iaculis imperdiet. Sed in accumsan quam, eu dapibus ex. In facilisis, turpis in placerat accumsan, leo mi euismod odio, non blandit elit urna nec justo.", List.of(
                        new ImageUrl("https://r-cf.bstatic.com/images/hotel/max1280x900/475/47586817.jpg"),
                        new ImageUrl("https://r-cf.bstatic.com/images/hotel/max1280x900/130/130387577.jpg"),
                        new ImageUrl("https://r-cf.bstatic.com/images/hotel/max1280x900/106/106214056.jpg"))),
                new Vacation("Vega Hotel", 5, "Mamaia", 8.9, 9000, 7, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque pulvinar lacinia venenatis. Vestibulum tristique congue velit, vitae tincidunt elit tempor sed. Quisque laoreet, eros sed hendrerit maximus, sapien mi consectetur sapien, ut tincidunt leo risus et erat. Fusce ornare iaculis imperdiet. Sed in accumsan quam, eu dapibus ex. In facilisis, turpis in placerat accumsan, leo mi euismod odio, non blandit elit urna nec justo.", List.of(
                        new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1280x900/188/18857678.jpg"),
                        new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1280x900/155/155914768.jpg"),
                        new ImageUrl("https://r-cf.bstatic.com/images/hotel/max1280x900/188/18856351.jpg"))),
                new Vacation("Hotel Inter", 5, "Venus", 8.2, 4800, 7, "", List.of(
                        new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1280x900/197/19784961.jpg"),
                        new ImageUrl("https://r-cf.bstatic.com/images/hotel/max1280x900/110/110622131.jpg"),
                        new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1280x900/695/69569648.jpg"))),
                new Vacation("Hotel Golden Palace", 4, "Mamaia", 9.1, 4800, 7, "", List.of(
                        new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1280x900/285/28580968.jpg"),
                        new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1280x900/286/28628095.jpg"),
                        new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1280x900/977/97723021.jpg"))),
                new Vacation("Almar Luxury", 4, "Mamaia", 9.1, 5100, 7, "", List.of(
                        new ImageUrl("https://r-cf.bstatic.com/images/hotel/max1280x900/105/105877887.jpg"),
                        new ImageUrl("https://r-cf.bstatic.com/images/hotel/max1280x900/105/105877818.jpg"),
                        new ImageUrl("https://r-cf.bstatic.com/images/hotel/max1280x900/105/105588185.jpg"))),
                new Vacation("Hotel Opera Mamaia", 4, "Mamaia", 9.1, 9850, 7, "", List.of(
                        new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1280x900/148/148026950.jpg"),
                        new ImageUrl("https://r-cf.bstatic.com/images/hotel/max1280x900/205/205765626.jpg"),
                        new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1280x900/205/205765781.jpg")
                ))
        ));
    }
}

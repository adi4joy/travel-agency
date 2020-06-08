package ro.fasttrackit.travel;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.fasttrackit.travel.domain.ImageUrl;
import ro.fasttrackit.travel.domain.Vacation;
import ro.fasttrackit.travel.domain.VacationCategory;
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
                new Vacation(VacationCategory.SPECIAL, "Phoenicia Royal Hotel", 5, "Mamaia", 8.2, 12200, 7, "Phoenicia Royal Hotel is located on the beach in Mamaia and offers a private beach and a seasonal swimming pool. All rooms at this hotel are air conditioned and feature a flat-screen TV with cable channels. Some rooms enjoy sea or lake views. Phoenicia Royal Hotel offers a wide range of seasonal services, including a children’s playground, an indoor play area, a swimming pool, children's pool and water park.", List.of(
                        new ImageUrl("https://r-cf.bstatic.com/images/hotel/max1280x900/222/222833986.jpg"),
                        new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1280x900/106/106854072.jpg"),
                        new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1280x900/104/104687960.jpg"))),
                new Vacation(VacationCategory.SPECIAL, "Mera Onix", 4, "Jupiter", 8.9, 7350, 7, "Located in Jupiter, 50 meters from Jupiter Beach, Mera Onix features a restaurant, bar, seasonal outdoor pool and free private parking. This 4-star hotel offers a shared lounge and air-conditioned rooms with free WiFi and a private bathroom. All hotel units have a wardrobe and a flat-screen TV. Mera Onix offers a daily continental breakfast. The property has a children's playground.", List.of(
                        new ImageUrl("https://r-cf.bstatic.com/images/hotel/max1280x900/152/152301994.jpg"),
                        new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1280x900/189/189292151.jpg"),
                        new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1280x900/152/152301917.jpg"))),
                new Vacation(VacationCategory.EXOTIC, "Saturn Hotel", 5, "Saturn", 7.7, 6200, 7, "Located in Mangalia, just 150 meters from the beach, Saturn Hotel offers air-conditioned accommodation with free WiFi and free access to an outdoor pool and fitness room. The hotel is the first in Romania to obtain the ecological certificate for tourist accommodation units. Saturn has a restaurant, café and lobby bar, which serves a wide variety of drinks. Guests can also dine on the hotel’s terrace.", List.of(
                        new ImageUrl("https://r-cf.bstatic.com/images/hotel/max1280x900/475/47586817.jpg"),
                        new ImageUrl("https://r-cf.bstatic.com/images/hotel/max1280x900/130/130387577.jpg"),
                        new ImageUrl("https://r-cf.bstatic.com/images/hotel/max1280x900/106/106214056.jpg"))),
                new Vacation(VacationCategory.CITY, "Vega Hotel", 5, "Mamaia", 8.9, 9000, 7, "Vega Hotel is located in the popular resort of Mamaia and offers a certified blue flag beach. It offers elegantly decorated rooms with sea views. Rooms include air conditioning, free wired internet, a safety deposit box and a flat-screen TV. The hotel has an outdoor pool with children’s area, indoor kindergarten, beauty center, fitness area, fashion boutique and secure parking.", List.of(
                        new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1280x900/188/18857678.jpg"),
                        new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1280x900/155/155914768.jpg"),
                        new ImageUrl("https://r-cf.bstatic.com/images/hotel/max1280x900/188/18856351.jpg"))),
                new Vacation(VacationCategory.SEASIDE, "Inter Hotel", 5, "Venus", 8.2, 4800, 7, "Centrally located in Venus, right on the beach, Inter Hotel offers elegant and comfortable rooms with partial or total sea views. Guests have free access to an outdoor pool, sauna and fitness center. The Inter Hotel’s 2 restaurants have a terrace and can host romantic dinners and family or business events. Wine tastings, cruises and traditional grilled meals can be arranged upon request.", List.of(
                        new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1280x900/197/19784961.jpg"),
                        new ImageUrl("https://r-cf.bstatic.com/images/hotel/max1280x900/110/110622131.jpg"),
                        new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1280x900/695/69569648.jpg"))),
                new Vacation(VacationCategory.MOUNTAINS, "Golden Palace Hotel", 4, "Mamaia", 9.1, 4800, 7, "Just a 2-minute walk from Aqua Magic Water Park, Golden Palace Hotel offers a private beach area. Rooms come with air conditioning and a flat-screen TV with satellite channels. Extras include a minibar, DVD player and CD player. In summer, the hotel offers a self-service restaurant with international and Romanian dishes. You can also enjoy your favorite drink at the bar.", List.of(
                        new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1280x900/285/28580968.jpg"),
                        new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1280x900/286/28628095.jpg"),
                        new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1280x900/977/97723021.jpg"))),
                new Vacation(VacationCategory.SEASIDE, "Almar Luxury", 4, "Mamaia", 9.1, 5100, 7, "Located in Mamaia, 300 meters from the beach, Almar Luxury is a 4-star hotel with an outdoor pool. All hotel rooms have air conditioning and a flat-screen TV, and some rooms also have sea views. All rooms have a work desk, for guests who want to combine leisure and business travel. Sun loungers and parasols are available at the pool, and guests can relax in the hot tub.", List.of(
                        new ImageUrl("https://r-cf.bstatic.com/images/hotel/max1280x900/105/105877887.jpg"),
                        new ImageUrl("https://r-cf.bstatic.com/images/hotel/max1280x900/105/105877818.jpg"),
                        new ImageUrl("https://r-cf.bstatic.com/images/hotel/max1280x900/105/105588185.jpg"))),
                new Vacation(VacationCategory.DESERT, "Opera Mamaia Hotel", 4, "Mamaia", 9.1, 9850, 7, "Opera Mamaia Hotel is located in Mamaia, a short walk from the main nightclubs. It offers a heated outdoor pool and a private beach. Rooms include free Wifi, air conditioning, a flat-screen TV with cable channels, a minibar, a desk and a private bathroom. A safety deposit box is available. The property can facilitate airport transfers upon request and at an additional cost. This hotel offers free private parking.", List.of(
                        new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1280x900/148/148026950.jpg"),
                        new ImageUrl("https://r-cf.bstatic.com/images/hotel/max1280x900/205/205765626.jpg"),
                        new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1280x900/205/205765781.jpg")
                ))
        ));
    }
}

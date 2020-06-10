package ro.fasttrackit.travel;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.fasttrackit.travel.domain.Booking;
import ro.fasttrackit.travel.domain.ImageUrl;
import ro.fasttrackit.travel.domain.Vacation;
import ro.fasttrackit.travel.domain.VacationCategory;
import ro.fasttrackit.travel.persistence.BookingRepository;
import ro.fasttrackit.travel.persistence.VacationRepository;

import java.time.LocalDate;
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
                new Vacation(VacationCategory.SEASIDE, "Saturn Hotel", 5, "Saturn", 7.7, 6200, 7, "Located in Mangalia, just 150 meters from the beach, Saturn Hotel offers air-conditioned accommodation with free WiFi and free access to an outdoor pool and fitness room. The hotel is the first in Romania to obtain the ecological certificate for tourist accommodation units. Saturn has a restaurant, café and lobby bar, which serves a wide variety of drinks. Guests can also dine on the hotel’s terrace.", List.of(
                        new ImageUrl("https://r-cf.bstatic.com/images/hotel/max1280x900/475/47586817.jpg"),
                        new ImageUrl("https://r-cf.bstatic.com/images/hotel/max1280x900/130/130387577.jpg"),
                        new ImageUrl("https://r-cf.bstatic.com/images/hotel/max1280x900/106/106214056.jpg"))),
                new Vacation(VacationCategory.SPECIAL, "Vega Hotel", 5, "Mamaia", 8.9, 9000, 7, "Vega Hotel is located in the popular resort of Mamaia and offers a certified blue flag beach. It offers elegantly decorated rooms with sea views. Rooms include air conditioning, free wired internet, a safety deposit box and a flat-screen TV. The hotel has an outdoor pool with children’s area, indoor kindergarten, beauty center, fitness area, fashion boutique and secure parking.", List.of(
                        new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1280x900/188/18857678.jpg"),
                        new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1280x900/155/155914768.jpg"),
                        new ImageUrl("https://r-cf.bstatic.com/images/hotel/max1280x900/188/18856351.jpg"))),
                new Vacation(VacationCategory.SPECIAL, "Inter Hotel", 5, "Venus", 8.2, 4800, 7, "Centrally located in Venus, right on the beach, Inter Hotel offers elegant and comfortable rooms with partial or total sea views. Guests have free access to an outdoor pool, sauna and fitness center. The Inter Hotel’s 2 restaurants have a terrace and can host romantic dinners and family or business events. Wine tastings, cruises and traditional grilled meals can be arranged upon request.", List.of(
                        new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1280x900/197/19784961.jpg"),
                        new ImageUrl("https://r-cf.bstatic.com/images/hotel/max1280x900/110/110622131.jpg"),
                        new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1280x900/695/69569648.jpg"))),
                new Vacation(VacationCategory.SEASIDE, "Golden Palace Hotel", 4, "Mamaia", 9.1, 4800, 7, "Just a 2-minute walk from Aqua Magic Water Park, Golden Palace Hotel offers a private beach area. Rooms come with air conditioning and a flat-screen TV with satellite channels. Extras include a minibar, DVD player and CD player. In summer, the hotel offers a self-service restaurant with international and Romanian dishes. You can also enjoy your favorite drink at the bar.", List.of(
                        new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1280x900/285/28580968.jpg"),
                        new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1280x900/286/28628095.jpg"),
                        new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1280x900/977/97723021.jpg"))),
                new Vacation(VacationCategory.SEASIDE, "Almar Luxury", 4, "Mamaia", 9.1, 5100, 7, "Located in Mamaia, 300 meters from the beach, Almar Luxury is a 4-star hotel with an outdoor pool. All hotel rooms have air conditioning and a flat-screen TV, and some rooms also have sea views. All rooms have a work desk, for guests who want to combine leisure and business travel. Sun loungers and parasols are available at the pool, and guests can relax in the hot tub.", List.of(
                        new ImageUrl("https://r-cf.bstatic.com/images/hotel/max1280x900/105/105877887.jpg"),
                        new ImageUrl("https://r-cf.bstatic.com/images/hotel/max1280x900/105/105877818.jpg"),
                        new ImageUrl("https://r-cf.bstatic.com/images/hotel/max1280x900/105/105588185.jpg"))),
                new Vacation(VacationCategory.EXOTIC, "Grand Hyatt Dubai", 5, "Dubai", 9.0, 16000, 7, "Situated next to the lively Sheikh Zayed Road, Grand Hyatt Dubai is set in landscaped gardens with indoor and outdoor pools and offers 13 dining and entertainment options. It also offers spa treatments and facilities. All accommodation at Grand Hyatt Dubai is decorated with traditional Arabic features. The luxurious bathroom with marble finishes includes a spa bath, bathrobes and exclusive toiletries. Guests at Grand Hyatt have restaurants serving Indian, Japanese and Singapore dishes.", List.of(
                        new ImageUrl("https://r-cf.bstatic.com/images/hotel/max1280x900/132/132877207.jpg"),
                        new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1280x900/163/163916468.jpg"),
                        new ImageUrl("https://r-cf.bstatic.com/images/hotel/max1280x900/132/132124847.jpg"))),
                new Vacation(VacationCategory.DESERT, "Bab Al Shams Desert Resort and Spa", 5, "Dubai", 9.0, 26000, 7, "Set amidst the dunes around Dubai, this 5-star resort offers an infinity pool overlooking the desert. Satori spa provides a variety of treatments, including rejuvenating massages. Bab Al Shams Desert Resort and Spa is built in the style of a traditional Arabian fort. The courtyards with fountains, gardens and paved alleys lead to the Arabic-style rooms. Guests can explore the surrounding desert by Jeep, horse or camel.", List.of(
                        new ImageUrl("https://r-cf.bstatic.com/images/hotel/max1280x900/131/131270677.jpg"),
                        new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1280x900/211/211864459.jpg"),
                        new ImageUrl("https://r-cf.bstatic.com/images/hotel/max1280x900/131/131043610.jpg"))),
                new Vacation(VacationCategory.EXOTIC, "Majestic Colonial Punta Cana", 5, "Dominican Republic", 9.1, 5500, 7, "Located on Cana Beach, overlooking the Caribbean Sea, this oceanfront resort features tennis courts, a luxury spa, 7 restaurants and access to a private beach. All suites have a bathroom with a spa bath. The elegant and spacious suites have tiled floors and four-poster beds. Majestic Colonial has 11 bars, including one by the pool and one on the beach, most of which offer live music. The 7 restaurants offer casual and fine dining. Guests can enjoy both local Caribbean and international cuisine.", List.of(
                        new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1280x900/895/89586362.jpg"),
                        new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1280x900/175/175233144.jpg"),
                        new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1280x900/175/175233171.jpg"))),
                new Vacation(VacationCategory.EXOTIC, "Mangata Villas", 5, "Belize", 10, 7000, 7, "Located in San Pedro, 1.2 km from Playa Blanca, Mangata Villas provides accommodation with free bikes, free private parking, an outdoor swimming pool and a private beach area. All rooms feature a kitchen and a private bathroom. Every room is fitted with a patio. All units are equipped with air conditioning, a flat-screen TV with satellite channels, a microwave, a kettle, a shower, a hairdryer and a wardrobe.", List.of(
                        new ImageUrl("https://r-cf.bstatic.com/images/hotel/max1280x900/237/237179020.jpg"),
                        new ImageUrl("https://r-cf.bstatic.com/images/hotel/max1280x900/237/237621956.jpg"),
                        new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1280x900/237/237621215.jpg"))),
                new Vacation(VacationCategory.SEASIDE, "Opera Mamaia Hotel", 4, "Mamaia", 9.1, 9850, 7, "Opera Mamaia Hotel is located in Mamaia, a short walk from the main nightclubs. It offers a heated outdoor pool and a private beach. Rooms include free Wifi, air conditioning, a flat-screen TV with cable channels, a minibar, a desk and a private bathroom. A safety deposit box is available. The property can facilitate airport transfers upon request and at an additional cost. This hotel offers free private parking.", List.of(
                        new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1280x900/148/148026950.jpg"),
                        new ImageUrl("https://r-cf.bstatic.com/images/hotel/max1280x900/205/205765626.jpg"),
                        new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1280x900/205/205765781.jpg")
                ))
        ));
    }


    @Bean
    CommandLineRunner afterStartup(BookingRepository bookingRepository) {
        return args -> bookingRepository.saveAll(List.of(
                new Booking("Peter Stanbridge", LocalDate.of(2020, 07, 05),
                        new Vacation(VacationCategory.CITY, "City Living Apartments", 5, "London", 9.7, 4500, 2, "Located in the Tower Hamlets district in London, City Living Apartments provides an equipped accommodation with a balcony and free WiFi. This apartment is a 10-minute walk from Tower of London and 15 minutes from Sky Garden. The apartment is fitted with 3 bedrooms, a fully fitted kitchen with a dishwasher and a microwave, 2 bathrooms with a hot tub, bath and shower.", List.of(
                                new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1024x768/177/177620986.jpg"),
                                new ImageUrl("https://r-cf.bstatic.com/images/hotel/max1024x768/172/172166858.jpg"),
                                new ImageUrl("https://r-cf.bstatic.com/images/hotel/max1024x768/172/172168520.jpg")
                        ))),
                new Booking("John Stone", LocalDate.of(2020, 07, 12),
                        new Vacation(VacationCategory.CITY, "Dorsett City London", 4, "London", 8.8, 3500, 3, "Dorsett City London is a 4-star hotel with a garden and city views, located in London, an 8-minute walk from Sky Garden. Facilities include a 24-hour front desk, a business center and free WiFi throughout the property. The hotel’s restaurant serves Chinese dishes. All units are air conditioned and feature a wardrobe, a desk, a flat-screen TV with satellite channels, a refrigerator and a coffee machine.", List.of(
                                new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1024x768/137/137943835.jpg"),
                                new ImageUrl("https://r-cf.bstatic.com/images/hotel/max1024x768/159/159727840.jpg"),
                                new ImageUrl("https://r-cf.bstatic.com/images/hotel/max1024x768/155/155966663.jpg")
                        ))),
                new Booking("Jane Meldrum", LocalDate.of(2020, 06, 12),
                        new Vacation(VacationCategory.CITY, "Hotel Sans Souci Wien", 5, "Vienna", 9.4, 3000, 2, "Hotel Sans Souci is the favorite place for tourists in Vienna. It houses a bar and Veranda Restaurant, where guests can enjoy Austrian and international cuisine. Guests have free access to the Sans Souci Spa’s sauna, steam bath and seating area. There is also a modern fitness center with personal trainer services. The spacious rooms have an elegant interior design and are decorated with works by various well-known artists.", List.of(
                                new ImageUrl("https://r-cf.bstatic.com/images/hotel/max1280x900/109/109945099.jpg"),
                                new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1280x900/987/98789464.jpg"),
                                new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1280x900/894/89476115.jpg")
                        ))),
                new Booking("Mia Wong", LocalDate.of(2020, 07, 19),
                        new Vacation(VacationCategory.MOUNTAINS, "Hotel Piz Buin Klosters", 4, "Switzerland", 9.5, 8500, 3, "Located next to the Gotschna cable car in the center of Klosters, Hotel Piz Buin offers a spa area and free Wi-Fi. All rooms at the Piz Buin Hotel are Alpine-style and feature a balcony, cable TV, and a bathroom with hairdryer. Spa facilities include a swimming pool, hot tub, 2 saunas, a steam bath, a massage shower, a foot bath, 2 treatment rooms and a fitness area with Technogym equipment.", List.of(
                                new ImageUrl("https://r-cf.bstatic.com/images/hotel/max1280x900/151/151328800.jpg"),
                                new ImageUrl("https://r-cf.bstatic.com/images/hotel/max1280x900/152/152511220.jpg"),
                                new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1280x900/138/138676134.jpg")
                        ))),
                new Booking("Andrew Kazantzis", LocalDate.of(2020, 07, 19),
                        new Vacation(VacationCategory.MOUNTAINS, "Deltapark Vitalresort", 4, "Switzerland", 9.2, 12500, 6, "Deltapark Vitalresort is a new spa and wellness resort at the shores of Lake Thun in the Bernese Oberland. It offers 3 restaurants, a 2,000m² spa area, and conference facilities. Deltapark Vitalresort has rooms in 3 separate buildings and offering different comfort levels. All rooms are very quiet and feature views to the garden, the lake or the mountains.", List.of(
                                new ImageUrl("https://r-cf.bstatic.com/images/hotel/max1280x900/188/188387976.jpg"),
                                new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1280x900/100/100982929.jpg"),
                                new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1280x900/100/100986255.jpg")
                        ))),
                new Booking("Desiree Burch", LocalDate.of(2020, 07, 19),
                        new Vacation(VacationCategory.DESERT, "Al Maha Luxury Collection Desert Resort & Spa", 5, "Dubai", 9.3, 36000, 7, "This exclusive desert resort has wildlife in the wild, stunning desert views and 42 private suites. Guests benefit from free WiFi throughout the property. Bedouin-style tents offer typical Arabic luxury. All tents have a private temperature-controlled pool, private sun terrace, large bedroom with relaxation facilities, large bathroom with large bathtub, separate rain shower, luxury toiletries, Nespresso® coffee machine and sherry carafe.", List.of(
                                new ImageUrl("https://r-cf.bstatic.com/images/hotel/max1280x900/177/177036865.jpg"),
                                new ImageUrl("https://r-cf.bstatic.com/images/hotel/max1280x900/177/177036802.jpg"),
                                new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1280x900/145/14530764.jpg")
                        ))),
                new Booking("Verona Blair", LocalDate.of(2020, 07, 19),
                        new Vacation(VacationCategory.DESERT, "Al Badayer Retreat", 5, "Dubai", 8.8, 7200, 7, "Al Badayer Retreat features a garden. Among the facilities of this property are a restaurant, a 24-hour front desk and room service, along with free WiFi. All rooms are fitted with air conditioning, a flat-screen TV with satellite channels, a kettle, a bidet, a hairdryer and a desk. At the hotel the rooms come with a wardrobe and a private bathroom.", List.of(
                                new ImageUrl("https://r-cf.bstatic.com/images/hotel/max1280x900/250/250710972.jpg"),
                                new ImageUrl("https://r-cf.bstatic.com/images/hotel/max1280x900/219/219204022.jpg"),
                                new ImageUrl("https://r-cf.bstatic.com/images/hotel/max1280x900/219/219213828.jpg")
                        ))),
                new Booking("Natalie Walsh", LocalDate.of(2020, 07, 26),
                        new Vacation(VacationCategory.CITY, "Waldorf Astoria Amsterdam", 5, "Amsterdam", 9.4, 15000, 4, "Waldorf Astoria Amsterdam offers accommodation in 6 monumental 17th-century palaces. This 5-star hotel is located in the heart of the city, only 150 meters from the vibrant Rembrandtplein and 1.5 km from the PC Hooftstraat shopping street. Waldorf Astoria Amsterdam has the luxurious Guerlain Spa with indoor pool, sauna, fitness center and 3 treatment rooms, ideal for relaxation and massages.", List.of(
                                new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1280x900/300/30065400.jpg"),
                                new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1280x900/174/174195656.jpg"),
                                new ImageUrl("https://q-cf.bstatic.com/images/hotel/max1280x900/312/31231166.jpg")
                        ))
                )
        ));
    }
}

//package com.demo.Holidays;
//
//@SpringBootTest
//public class HolidayServiceTest {
//    @Autowired
//    private HolidayService holidayService;
//
//    @MockBean
//    private HolidayRepository holidayRepository;
//
//    @Test
//    public void testAddHoliday() {
//        Holiday holiday = new Holiday();
//        holiday.setName("Test Holiday");
//        holiday.setCountry("USA");
//        holiday.setDate(LocalDate.of(2024, 7, 4));
//
//        Mockito.when(holidayRepository.save(holiday)).thenReturn(holiday);
//
//        Holiday created = holidayService.addHoliday(holiday);
//
//        assertThat(created.getName()).isSameAs(holiday.getName());
//    }
//
//    // More tests for update and get methods
//}

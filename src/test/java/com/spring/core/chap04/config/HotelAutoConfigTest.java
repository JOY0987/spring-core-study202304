package com.spring.core.chap04.config;

import com.spring.core.chap04.Hotel;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


class HotelAutoConfigTest {
    AnnotationConfigApplicationContext ac =
    new AnnotationConfigApplicationContext(HotelAutoConfig.class);

    @Test
    void autoDITest() {
        Hotel hotel = ac.getBean(Hotel.class);
        hotel.inform();
    }

}
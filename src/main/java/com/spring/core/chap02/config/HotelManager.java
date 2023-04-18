package com.spring.core.chap02.config;

import com.spring.core.chap02.*;

// 호텔을 운영하기 위한 객체들을 만들어서
// 호텔에 주입해주는 클래스
// Spring Container : Bean Factory
public class HotelManager {
    
    // 쉐프 객체를 생성
    public Chef chef() {
        return new KimuraChef();
    }
    // 코스 객체를 생성
    public Course course() {
        return new SushiCourse();
    }
    // 레스토랑 객체를 생성
    public Restaurant restaurant() {
        return new EasternRestaurant(chef(), course());
    }
    // 호텔 객체를 생성
    public Hotel hotel() {
        // 생성자 주입
//        return new Hotel(restaurant(), chef());

        // 수정자 주입 => 자제하기 (원할 때마다 바꿀 수 있기 때문에 위험)
        Hotel hotel = new Hotel();
        hotel.setRestaurant(restaurant());
        hotel.setHeadChef(chef());

        return hotel;
    }


}

package com.spring.core.chap04;

import org.springframework.stereotype.Component;

@Component("kc") // 빈의 이름을 kc 로 (작성하지 않으면 클래스명을 카멜케이스로 자동변경해서 이름으로 가짐)
public class KimuraChef implements Chef {

    public void cook() {
        System.out.println("일식 요리의 대가 키무라입니다.");
    }
}

package com.spring.core.person;

import lombok.*;

@Setter @Getter
@ToString @EqualsAndHashCode
@NoArgsConstructor  // 기본 생성자
@AllArgsConstructor // 모든 파라미터 생성자
//@Data // 위에 있는 것들을 한 번에 다 해줌! But 실무에서는 다양한 상황이 있으니 사용 X
public class Person {

    private String nickName;
    private String address;
    private int age;

}

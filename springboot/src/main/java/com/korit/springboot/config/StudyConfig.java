package com.korit.springboot.config;

import com.korit.springboot.IoC.BeanStudy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudyConfig {

    @Bean
    /*
    @Bean
    개발자가 직접 생성한 객체
    보통 @Configuration이 붙은 클래스 안에서 사용된다.

        BeanStudy 클래스에
        @Component 어노테이션을 생성해도 상관없음
        스스로 만든 코딩에는 클래스에 @Component 어노테이션만 사용해도 상관없지만
        외부라이브러리는 수정이 불가하므로 @Bean 어노테이션을 사용해야한다.

        사용하는 이유
        외부에 있는 라이브러리를 가져와 사용하려고

        두 개 이상의 @Bean을 생성할 수 있다.
        설정객체이기 때문.
     */
    public BeanStudy beanStudy() {
        System.out.println("bean 생성");
        return new BeanStudy();
    }

//    @Bean
//    public Criteria criteria() {
//        return new Criteria();
//    }

}

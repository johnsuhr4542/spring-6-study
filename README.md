1. [서론](#서론)
2. [사용 모듈](#사용-모듈)
3. [학습](#학습)  
  3-1. [Spring Web MVC](#Spring-Web-MVC)  
  3-2. [Spring Security](#Spring-Security)  
  3-3. [Spring Data JPA](#Spring-Data-JPA)  

# 목적
* `Spring Framework 6`(`Springboot 3`) 및 관련 모듈을 사용하여 스프링 프레임워크의 사용법을 익힌다.

# 사용 모듈
* `Spring Web MVC`
* `Spring Security`
* `Spring Data JPA`

# 학습
## Spring Web MVC
### 요청 매핑
<details>
<summary>요청 매핑 펼치기/접기</summary>

* TODO
</details>

### 요청 파라미터 파싱
<details>
<summary>요청 파라미터 파싱 펼치기/접기</summary>

* TODO
</details>

### 오류 처리
<details>
<summary>오류 처리 펼치기/접기</summary>

* TODO

</details>

## Spring Security
### 스프링 시큐리티 구조
<details>
<summary>스프링 시큐리티 구조 펼치기/접기</summary>
  <p align="center">
    <img width="400" src="https://user-images.githubusercontent.com/48673909/208333830-26cb6bbb-e220-450f-8f79-e08b8995e8f3.png" alt="filterchainproxy">
  </p>
  
  * 위 그림은 스프링 시큐리티의 구조를 간단히 나타낸 것이다.
  * `HTTP` 요청이 발생하게 되면 서블릿 컨테이너(톰캣, 언더토 등)는 `HttpServletRequest`의 구현체로 변환한 뒤 등록된 필터를 거쳐 최종적으로 서블릿(스프링의 `DispatcherServlet`)에 전달하게 된다.
  * 스프링 시큐리티는 서블릿에 도달하기 전, 필터를 등록하여 일괄적으로 요청에 대한 인증/인가 처리를 하게 된다.
  * 서블릿 필터에서 스프링 빈을 참조하기 위해서 `DelegatingFilterProxy`를 사용하게 된다.
  * 시큐리티 필터 목록은 [여기](https://docs.spring.io/spring-security/reference/servlet/architecture.html#servlet-security-filters)를 참고한다.
  * `SecurityContextPersistenceFilter`
    * 현재 요청의 `SecurityContext`를 불러와서 `SecurityContextHolder`라는 쓰레드간 공유 가능한 저장소에 저장하여 이후 어디서든 참조 가능하게 해 준다.
    * 현재 요청의 `SecurityContext`가 변경되는 경우(로그인, 로그아웃 등), 변경 사항을 `SecurityContextRepository`에 저장한다.
</details>

### 인증(Authentication)
<details>
<summary>인증(Authentication) 펼치기/접기</summary>

* 인증이란, 접근하는 사람이 식별 가능한지 판단하기 위해 사용하는 것이다.
</details>

### 인가(Authorization)
<details>
<summary>인가(Authorization) 펼치기/접기</summary>

* 인가란, 접근하는 인증 식별자가 해당 리소스에 대한 권한을 가지고 있는지 확인하는 절차이다.
</details>

## Spring Data JPA
* TODO


//WEB-INF -> spring-servlet.xml 파일생성 기본설정

<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:aop="http://www.springframework.org/schema/aop" xmlns="http://www.springframework.org/schema/beans"
	xmlns:p="http://www.springframework.org/schema/p" xmlns:context="http://www.springframework.org/schema/context"
	xsi:schemaLocation="http://www.springframework.org/schema/mvc http://www.springframework.org/schema/mvc/spring-mvc-3.1.xsd
	http://www.springframework.org/schema/aop http://www.springframework.org/schema/aop/spring-aop.xsd
	http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.1.xsd
	http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context-3.1.xsd"
	xmlns:mvc="http://www.springframework.org/schema/mvc">

	<!-- annotation 설정을 하겠다. -->
	<context:annotation-config />
	
	<!-- 
	com.javaex.controller 패키지 밑에 있는 클래스 중에
	@Controller를 달고 있는 클래스의 객체를 생성 하겠다. (new 하겠다)
	 -->
	<context:component-scan base-package="com.javaex.controller" />

</beans>


////////////////////추가
//html css 적용  매핑정보 중에서 스프링이 처리할 수 없는 요청은 서블릿 컨테이너(톰캣)이 제공하는 
//               디폴트 서블릿에게 위임 시키기. ( servlet.xml )

<!-- 서블릿 컨테이너의 디폴트 서블릿 위임 핸들러 -->
<mvc:default-servlet-handler />
<mvc:annotation-driven />






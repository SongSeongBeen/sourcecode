
spring-servlet.xml 에 CommonMultipartResolver 설정을 해준다

<!-- 멀티파트 리졸버 -->
<bean id="multipartResolver" class="org.springframework.web.multipart.commons.CommonsMultipartResolver">

	<!-- 최대업로드 가능한 바이트크기 -->
	<property name="maxUploadSize" value="52428800" />

	<!-- 디스크에 임시 파일을 생성하기 전에 메모리에 보관할수있는 최대 바이트 크기 -->
	<property name="maxInMemorySize" value="52428800" />
		
	<!-- defaultEncoding -->
	<property name="defaultEncoding" value="utf-8" />

</bean>




spring-servlet.xml 에 url 과 resource 매핑 하기


<!-- url매핑-->
<mvc:resources mapping="/upload/**" location="file:C:/javaStudy/upload/" />

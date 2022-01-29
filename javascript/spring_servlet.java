
MappingJacksonHttpMessageConverter : 
spring-servlet.xml 추가

<mvc:annotation-driven>
	<mvc:message-converters>
		<bean class="org.springframework.http.converter.json.MappingJackson2HttpMessageConverter">
			<property name="supportedMediaTypes">
				<list>
					<value>application/json; charset=UTF-8</value>
				</list>
			</property>
		</bean>
	</mvc:message-converters>
</mvc:annotation-driven>

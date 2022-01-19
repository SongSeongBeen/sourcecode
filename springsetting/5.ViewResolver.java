spring-servlet.xml

<!-- 기본 뷰 리졸버 --> 
<bean id="viewResolver" class="org.springframework.web.servlet.view.InternalResourceViewResolver"> 
               <property name="viewClass" value="org.springframework.web.servlet.view.JstlView" /> 
               <property name="prefix" value="/WEB-INF/views/" /> 
               <property name="suffix" value=".jsp" /> 
               <property name="order" value="1" /> 
</bean>

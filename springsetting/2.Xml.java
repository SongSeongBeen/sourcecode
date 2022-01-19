
// web.xml : DispatcherServlet 정의 
//</welcome-file-list>  밑에 붙여넣기

<!-- DispatChServlet Mapping : Front Controller 등록 -->
<servlet>
	<servlet-name>spring</servlet-name>
	<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
</servlet>

<servlet-mapping>
	<servlet-name>spring</servlet-name>
	<url-pattern>/</url-pattern>
</servlet-mapping>


///////////////////////////////////////////////////////////////////////////////////////
<!-- 한글처리 -->
<filter>
        <filter-name>encodingFilter</filter-name>
        <filter-class>org.springframework.web.filter.CharacterEncodingFilter</filter-class>
        <init-param>
            <param-name>encoding</param-name>
            <param-value>UTF-8</param-value>
        </init-param>

        <init-param>
<param-name>forceEncoding</param-name>
<param-value>true</param-value>
        </init-param>
</filter>

<filter-mapping>
        <filter-name>encodingFilter</filter-name>
        <url-pattern>/*</url-pattern>
</filter-mapping>




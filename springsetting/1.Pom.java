// 1. 생성파일 Dynamic Web project->(src\main\java, src\main\resources)두개 생성 -> content directory는 (webapp) 생성   
// -> 파일만들때 Generate web.xml deployment.descriptor[체크!!!] -> 파일생성 WEB-INF-> web.xml 경로 -

// 2.new configure -> convert to Maven project 생성

// [pom.xml 설정 : Spring Library 의존성 추가]

//<packaging>war</packaging> pom.xml 밑에 붙여 넣기

<properties>
	<org.springframework-version>4.3.3.RELEASE</org.springframework-version>
</properties>


<dependencies>

	<!-- spring container(core) -->
	<dependency>
		<groupId>org.springframework</groupId>
		<artifactId>spring-context</artifactId>
		<version>${org.springframework-version}</version>
	</dependency>

	<!-- Spring Web -->
	<dependency>
		<groupId>org.springframework</groupId>
		<artifactId>spring-web</artifactId>
		<version>${org.springframework-version}</version>
	</dependency>

	<!-- Spring MVC -->
	<dependency>
		<groupId>org.springframework</groupId>
		<artifactId>spring-webmvc</artifactId>
		<version>${org.springframework-version}</version>
	</dependency>

</dependencies>


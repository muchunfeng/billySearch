1 跑tomcat的时候用vMWare那个，外部tomcat有可能找不到src/main/java下的类文件。这些文件用Maven
	管理，有可能找不到。
2 billySearch-servlet是由spring MVC自己去找的，寻找原则：web.xml文件中的<Servlet>的名字。
3 .do中要加上前缀/billySearch，主要是为了区分各个项目。因为.do是需要在浏览器的输入栏中显示的。
4 遇到${变量}没法显示的时候，查看web.xml，是否是2.4以上。
5 ibatis中写sql.< > 分别写为&lt; &gt;
6 spring-security处理的时候
Unable to locate Spring NamespaceHandler for XML schema namespace [http://www.springframework.org/s
原来是找不到jar包啊

7 xml中的namespace是和jar包版本相关连的，犹如一个hash的key值。

8 <!DOCTYPE beans PUBLIC "-//SPRING//DTD BEAN 2.0//EN" "http://www.springframework.org/dtd/spring-beans-2.0.dtd">



2.4
<web-app version="2.4" xmlns="http://java.sun.com/xml/ns/j2ee" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		xsi:schemaLocation="http://java.sun.com/xml/ns/j2ee http://java.sun.com/xml/ns/j2ee/web-app_2_4.xsd">
		
2.5
<web-app version="2.5" xmlns="http://java.sun.com/xml/ns/javaee"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd">

好的：
<beans:beans xmlns="http://www.springframework.org/schema/security"
	xmlns:beans="http://www.springframework.org/schema/beans" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd
                        http://www.springframework.org/schema/security http://www.springframework.org/schema/security/spring-security-3.1.xsd">

不好的：
<beans:beans xmlns="http://www.springframework.org/schema/security"
    xmlns:beans="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.springframework.org/schema/beans 
                    http://www.springframework.org/schema/beans/spring-beans-3.0.xsd
                    http://www.springframework.org/schema/security 
                    http://www.springframework.org/schema/security/spring-security-3.1.xsd">

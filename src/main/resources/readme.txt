1 ��tomcat��ʱ����vMWare�Ǹ����ⲿtomcat�п����Ҳ���src/main/java�µ����ļ�����Щ�ļ���Maven
	�����п����Ҳ�����
2 billySearch-servlet����spring MVC�Լ�ȥ�ҵģ�Ѱ��ԭ��web.xml�ļ��е�<Servlet>�����֡�
3 .do��Ҫ����ǰ׺/billySearch����Ҫ��Ϊ�����ָ�����Ŀ����Ϊ.do����Ҫ�������������������ʾ�ġ�
4 ����${����}û����ʾ��ʱ�򣬲鿴web.xml���Ƿ���2.4���ϡ�
5 ibatis��дsql.< > �ֱ�дΪ&lt; &gt;
6 spring-security�����ʱ��
Unable to locate Spring NamespaceHandler for XML schema namespace [http://www.springframework.org/s
ԭ�����Ҳ���jar����

7 xml�е�namespace�Ǻ�jar���汾������ģ�����һ��hash��keyֵ��

8 <!DOCTYPE beans PUBLIC "-//SPRING//DTD BEAN 2.0//EN" "http://www.springframework.org/dtd/spring-beans-2.0.dtd">



2.4
<web-app version="2.4" xmlns="http://java.sun.com/xml/ns/j2ee" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		xsi:schemaLocation="http://java.sun.com/xml/ns/j2ee http://java.sun.com/xml/ns/j2ee/web-app_2_4.xsd">
		
2.5
<web-app version="2.5" xmlns="http://java.sun.com/xml/ns/javaee"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd">

�õģ�
<beans:beans xmlns="http://www.springframework.org/schema/security"
	xmlns:beans="http://www.springframework.org/schema/beans" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd
                        http://www.springframework.org/schema/security http://www.springframework.org/schema/security/spring-security-3.1.xsd">

���õģ�
<beans:beans xmlns="http://www.springframework.org/schema/security"
    xmlns:beans="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.springframework.org/schema/beans 
                    http://www.springframework.org/schema/beans/spring-beans-3.0.xsd
                    http://www.springframework.org/schema/security 
                    http://www.springframework.org/schema/security/spring-security-3.1.xsd">

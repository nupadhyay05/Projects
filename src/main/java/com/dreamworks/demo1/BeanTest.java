package com.dreamworks.demo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

public class BeanTest {
	private String datasource;
	private PropertySourcesPlaceholderConfigurer source;
	@Value("${jdbc.password}")
	private String url;
	public BeanTest() {
		super();
	}
	public String getDatasource() {
		return datasource;
	}
	public void setDatasource(String datasource) {
		this.datasource = datasource;
	}
	public PropertySourcesPlaceholderConfigurer getSource() {
		return source;
	}
	public void setSource(PropertySourcesPlaceholderConfigurer source) {
		this.source = source;
	}
	public void display(){
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");
	BeanTest prop1 = (BeanTest)context.getBean("prop");
	//System.out.println(prop.getAppliedPropertySources().get("localProperties").getProperty("jdbc.username"));
	System.out.println(prop1.getDatasource());
	System.out.println(url);
    context.close();
	}

}

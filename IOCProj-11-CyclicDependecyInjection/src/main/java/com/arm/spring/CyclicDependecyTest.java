package com.arm.spring;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.arm.spring.beans.Egg;
import com.arm.spring.beans.Egg2;
import com.arm.spring.beans.Hen;

/**
 * Hello world!
 *
 */
public class CyclicDependecyTest {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("applicationContext.xml");
		Hen hen = factory.getBean("hen", Hen.class);
		System.out.println(hen);

		System.out.println();

		Egg egg = factory.getBean("egg", Egg.class);
		System.out.println(egg);

		System.out.println();

//		Hen1 hen1 = factory.getBean("hen1", Hen1.class); //org.springframework.beans.factory.BeanCreationException
//		System.out.println(hen1);

		System.out.println();

//		Egg1 egg1 = factory.getBean("egg1", Egg1.class); //org.springframework.beans.factory.BeanCreationException
//		System.out.println(egg1);

		System.out.println();
		
//		Hen2 hen2 = factory.getBean("hen2", Hen2.class); //org.springframework.beans.factory.BeanCreationException
//		System.out.println(hen2);

		System.out.println();
		
		Egg2 egg2 = factory.getBean("egg2", Egg2.class);
		System.out.println(egg2);

	}
}

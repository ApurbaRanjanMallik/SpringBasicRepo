package com.arm.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arm.spring.beans.VotingEligibilityCheck;

/**
 * Hello world!
 *
 */
public class BeanLifeCycleTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		VotingEligibilityCheck votingEligibilityCheck = context.getBean("voting", VotingEligibilityCheck.class);
		// Invoke the business method
		System.out.println(votingEligibilityCheck.checkVotingCriteria());
		context.close();
	}
}

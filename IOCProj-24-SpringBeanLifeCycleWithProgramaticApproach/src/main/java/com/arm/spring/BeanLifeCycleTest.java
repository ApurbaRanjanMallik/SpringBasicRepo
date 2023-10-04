package com.arm.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arm.spring.beans.VotingEligibilityTest;

public class BeanLifeCycleTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		VotingEligibilityTest votingEligibilityTest = context.getBean("voting", VotingEligibilityTest.class);
		String checkVotingCriteria = votingEligibilityTest.checkVotingCriteria();
		System.out.println(checkVotingCriteria);
		context.close();
	}

}

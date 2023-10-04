package com.arm.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arm.spring.bean.VotingEligibilityCheck;

public class BeanLifeCycleTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		VotingEligibilityCheck votingEligibilityCheck = context.getBean("voting", VotingEligibilityCheck.class);
		String checkVotingCriteria = votingEligibilityCheck.checkVotingCriteria();
		System.out.println(checkVotingCriteria);
		context.close();
	}
}

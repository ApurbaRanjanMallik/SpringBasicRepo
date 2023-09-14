package com.arm.spring;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arm.controller.TravellerController;
import com.arm.vo.TravellerVO;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws Exception {
		System.out.println("App.main()");
		Scanner sc = new Scanner(System.in);
		TravellerVO vo = new TravellerVO();
		System.out.print("Please enter your name : ");
		vo.setName(sc.nextLine());
		System.out.print("Please enter your Mobile No. : ");
		vo.setPhNo(sc.nextLine());
		System.out.print("Please enter your current location : ");
		vo.setSource(sc.nextLine());
		System.out.print("Please enter your destination location : ");
		vo.setDestination(sc.nextLine());
		System.out.print("Please enter distance between source and destination (In KM): ");
		vo.setDistance(sc.nextLine());
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		TravellerController controller = context.getBean("travellerController", TravellerController.class);
		String result = controller.processTravellerDetails(vo);
		System.out.println(result);
		context.close();
		sc.close();
	}
}

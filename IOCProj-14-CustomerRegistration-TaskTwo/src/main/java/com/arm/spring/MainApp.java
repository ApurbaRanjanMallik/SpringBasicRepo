package com.arm.spring;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arm.controller.CustomerController;
import com.arm.vo.CustomerVO;

/**
 * Hello world!
 *
 */
public class MainApp {
	public static void main(String[] args) {
		System.out.println("MainApp.main()");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerController controller = context.getBean("controller", CustomerController.class);
		CustomerVO vo = new CustomerVO();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name : ");
		vo.setName(sc.nextLine());
		System.out.print("Enter your principal amount : ");
		vo.setPrincipalAmount(Float.toString(sc.nextFloat()));
		System.out.print("Enter your given time : ");
		vo.setTime(Float.toString(sc.nextFloat()));
		System.out.print("Enter your given percentage rate : ");
		vo.setRate(Float.toString(sc.nextFloat()));
		String message;
		try {
			message = controller.processCustomerData(vo);
			System.out.println(message);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}

	}
}

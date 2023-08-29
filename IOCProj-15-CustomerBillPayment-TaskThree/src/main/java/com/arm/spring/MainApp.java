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
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerController customerController = context.getBean("controller", CustomerController.class);
		CustomerVO vo = new CustomerVO();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter customer name : ");
		vo.setCustomerName(sc.nextLine());
		System.out.print("Enter electric bill : ");
		vo.setElectricBill(Float.toString(sc.nextFloat()));
		System.out.print("Enter LPG-Bill : ");
		vo.setLPGBill(Float.toString(sc.nextFloat()));
		System.out.print("Enter water bill : ");
		vo.setWaterBill(Float.toString(sc.nextFloat()));
		System.out.print("Enter discount on bill : ");
		vo.setDiscount(Float.toString(sc.nextFloat()));
		try {
			String message = customerController.processBillDetails(vo);
			System.out.println(message);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sc.close();
		}
	}
}

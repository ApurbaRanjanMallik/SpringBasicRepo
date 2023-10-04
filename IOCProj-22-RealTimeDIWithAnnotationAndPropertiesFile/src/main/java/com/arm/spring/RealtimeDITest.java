package com.arm.spring;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arm.controller.MainController;
import com.arm.vo.EmployeeVO;

/**
 * Hello world!
 *
 */
public class RealtimeDITest {
	public static void main(String[] args) {
		System.out.println("RealtimeDITest.main()");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		MainController controller = context.getBean("controller", MainController.class);
		// Read inputs as string values and store them in EmployeeVO class
		Scanner sc = new Scanner(System.in);
		EmployeeVO vo = new EmployeeVO();
		System.out.print("Enter Employee Name : ");
		String name = sc.next();
		vo.seteName(name);
		System.out.print("Enter Employee Designation : ");
		String desg = sc.next();
		vo.setDesg(desg);
		System.out.print("Enter Employee Basic Salary : ");
		String basicSalary = sc.next();
		vo.setBasicSalary(basicSalary);
		try {
			String message = controller.processEmployee(vo);
			System.out.println(message);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
			context.close();
		}

	}

}

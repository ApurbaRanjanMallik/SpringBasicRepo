package com.arm.spring;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arm.controller.StudentController;
import com.arm.vo.StudentVO;

/**
 * Hello world!
 *
 */
public class MainApp {
	public static void main(String[] args) {
		System.out.println("MainApp.main()");
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentController controller = factory.getBean("studentController", StudentController.class);
		Scanner scanner = new Scanner(System.in);
		StudentVO vo = new StudentVO();
		System.out.print("Enter Studnet's name : ");
		vo.setName(scanner.nextLine());
		System.out.print("Enter Student's total mark: ");
		vo.setTotalMark(Float.toString(scanner.nextFloat()));
		System.out.print("Enter no of subject : ");
		vo.setNoOfSubjects(Integer.toString(scanner.nextInt()));
		try {
			String message = controller.processStudentData(vo);
			System.out.println(message);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}

	}
}

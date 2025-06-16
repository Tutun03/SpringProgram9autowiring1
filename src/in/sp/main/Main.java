package in.sp.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.student;
import in.sp.resource.SpringConfigFile;

public class Main {
public static void main(String[] args) {
	AnnotationConfigApplicationContext contect=new AnnotationConfigApplicationContext(SpringConfigFile.class);
	student std1=(student)contect.getBean("Studentobj");
	std1.display();
}
}

package in.sp.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.student;


@Configuration
public class SpringConfigFile {
@Bean
public Address creeateaddressobj()
{
	Address add=new Address();
	add.setCity("kolkata");
	add.setHouseno(29);
	add.setPincode(700061);
	return add;
}

@Bean
public Address createaddress2()
{
	Address add1=new Address();
	add1.setCity("hyd");
	add1.setHouseno(32);
	add1.setPincode(500032);
	return add1;
}
@Bean
public student Studentobj()
{
	student std=new student();
//	std.setAddress(creeateaddressobj()); 
//	no need to do it explicitly.
	
	std.setName("aniket");
	std.setRollno(10);
	return std;
	
}


}

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pack1.DemoBean;


public class Main 
{
	public static void main(String r[])
	{
		@SuppressWarnings("resource")
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		Object o=ctx.getBean("db");
		DemoBean demoBean=(DemoBean)o;
		demoBean.printTheSet();
		System.out.println("==========");
		demoBean.printTheMap();
		
		
		
	}

}

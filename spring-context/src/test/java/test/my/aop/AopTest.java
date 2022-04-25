package test.my.aop;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author zzr
 * @date 2022/4/25 0025
 */
public class AopTest {

	@Test
	public void test1() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("test.my.aop");
		PersonService personService = context.getBean("personService", PersonService.class);
		int personCount = personService.getPersonCount();
		System.out.println("personCount = " + personCount);
	}

	@Test
	public void test2() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.registerBean(PersonService.class);
		context.refresh();
		PersonService personService = context.getBean("personService", PersonService.class);
		int personCount = personService.getPersonCount();
		System.out.println("personCount = " + personCount);
	}

	@Test
	public void test3() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(MyConfig.class);
		context.refresh();
		PersonService personService = context.getBean("personService", PersonService.class);
		int personCount = personService.getPersonCount();
		System.out.println("personCount = " + personCount);
	}

	@Test
	public void test4() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		PersonService personService = context.getBean("personService", PersonService.class);
		int personCount = personService.getPersonCount();
		System.out.println("personCount = " + personCount);
	}

	@Test
	public void test5() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		PersonService personService = context.getBean("personService", PersonService.class);
		int personCount = personService.getPersonCount();
		assertThat(personCount).isEqualTo(100);
	}

	@Test
	public void test6() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		PermissionService permissionService = context.getBean(PermissionService.class);
		List permission = permissionService.getPermission("admin");
		assertThat(permission).isNotNull().isEmpty();
	}

}


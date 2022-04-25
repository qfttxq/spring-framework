package test.my.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import javax.inject.Named;

/**
 * @author zzr
 * @date 2022/4/25 0025
 */
@Aspect
@Component
public class MyAspect {
	@Around("execution( int getPersonCount())")
	public Object handleAround(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("这里是环绕通知-开始");
		Object object = joinPoint.proceed(joinPoint.getArgs());
		System.out.println("这里是环绕通知-结束");
		return object;
	}

	@Before("execution( int getPersonCount())")
	public void handleBefore(JoinPoint joinPoint) {
		System.out.println("这里是前置通知-开始");

	}
}

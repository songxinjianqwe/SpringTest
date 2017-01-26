package aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 日志切面
 * 
 * @author Sinjin Song
 *
 * 1、将该类放入到IOC容器中 
 * 2、将类声明为一个切面 
 * 3、将方法声明为前置通知
 */
@Component
@Aspect
@Order(1)
public class LoggingAspect {

	//定义一个方法用于声明切入点表达式，这个方法不需要加入其它代码
	@Pointcut("execution(public int aop.ArithmaticCalculator.*(..))")
	public void declareJoinPointExpression(){}
	
	// Before是一个前置通知，表示在方法执行之前执行这段代码 //这个表示作用于该类的add方法 //
	// @Before("execution(public int aop.ArithmaticCalculator.add(int , int ))")
	// 这个表示作用于该类的所有方法

	@Before("declareJoinPointExpression()")
	public void beforeMethod(JoinPoint joinPoint) {// 连接点
		String methodName = joinPoint.getSignature().getName();// 取得方法名
		Object[] args = joinPoint.getArgs();// 取得方法参数
		System.out.println("The method " + methodName + " begins with " + Arrays.toString(args));
	}

	@After("declareJoinPointExpression()")
	public void afterMethod(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();// 取得方法名
		System.out.println("The method " + methodName + " ends");
	}

	@AfterReturning(value = "declareJoinPointExpression()", returning = "result")
	public void afterMethodReturn(JoinPoint joinPoint, Object result) {
		String methodName = joinPoint.getSignature().getName();// 取得方法名
		System.out.println("The method " + methodName + " ends with " + result);
	}

	// 这个方法会在抛出所有的异常之后执行
	@AfterThrowing(value = "declareJoinPointExpression()", throwing = "e")

	public void afterMethodThrowsException(JoinPoint joinPoint, Exception e) {
		String methodName = joinPoint.getSignature().getName();// 取得方法名
		System.out.println("The method " + methodName + " throws an exception " + e);
	} 
	
	// 这个方法会在抛出空指针异常之后执行
	@AfterThrowing(value = "declareJoinPointExpression()", throwing = "e")
	public void afterMethodThrowsNullPointerException(JoinPoint joinPoint, NullPointerException e) {
		String methodName = joinPoint.getSignature().getName();// 取得方法名
		System.out.println("The method " + methodName + " throws a nullpointerexception " + e);
	}
/*
	// 环绕通知类似于动态代理的全过程
	// 带有一个ProceedingJoinPoint参数，可以决定此方法是否执行
	// 环绕通知必须有返回值，返回值即为目标方法的返回值
	@Around(value = "execution(public int aop.ArithmaticCalculator.*(..))")
	public Object aroundMethod(ProceedingJoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();// 取得方法名
		Object[] args = joinPoint.getArgs();// 取得方法参数
		// 前置通知
		System.out.println("The method " + methodName + " begins with " + Arrays.toString(args));
		Object result = null;
		try {
			result = joinPoint.proceed();// 表示方法执行,相当于动态代理的method.invoke
		} catch (Throwable e) {
			e.printStackTrace();
			// 异常通知
			System.out.println("The method " + methodName + " throws an exception " + e);
			throw new RuntimeException(e);
		} finally {
			// 后置通知
			System.out.println("The method " + methodName + " ends");
		}
		// 返回通知，当抛出异常时这段不会执行
		System.out.println("The method " + methodName + " ends with " + result);
		return result;
	}
*/
}

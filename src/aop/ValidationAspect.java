package aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 参数检验切面
 * 
 * @author Sinjin Song
 *
 */
@Component
@Aspect
@Order(2)
public class ValidationAspect {

	// 定义一个方法用于声明切入点表达式，这个方法不需要加入其它代码
	@Pointcut("execution(public int aop.ArithmaticCalculator.*(..))")
	public void declareJoinPointExpression() {
	}

	@Before("declareJoinPointExpression()")
	public void validate(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();// 取得方法名
		Object[] args = joinPoint.getArgs();// 取得方法参数
		System.out.println("Validate " + methodName + " with parameters:" + Arrays.toString(args));
	}

}

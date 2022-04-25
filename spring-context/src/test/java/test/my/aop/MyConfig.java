package test.my.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author zzr
 * @date 2022/4/25 0025
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("test.my.aop")
public class MyConfig {

}

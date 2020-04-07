package com.github.silverlight7.log.annotation;


import com.github.silverlight7.log.config.RuntimeLoggerConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author wbw
 * @version 1.0
 * @date 2020/4/2 6:35 上午
 */

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({RuntimeLoggerConfiguration.class})
public @interface EnableRuntimeLogger {
}
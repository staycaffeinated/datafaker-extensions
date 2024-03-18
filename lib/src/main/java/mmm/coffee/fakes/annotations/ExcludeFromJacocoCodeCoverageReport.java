package mmm.coffee.fakes.annotations;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * This annotation allows us to mark classes that Jacoco should
 * ignore in code coverage reports.
 */
@Documented
@Retention(RUNTIME)
@Target({TYPE, METHOD})
public @interface ExcludeFromCodeCoverageReport {}

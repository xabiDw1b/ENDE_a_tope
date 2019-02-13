package testeadoresJunit5;


import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SuiteDisplayName("JUnit 4 Suite Demo")
//@SelectClasses(CalculadoraTest.class)
@SelectPackages("ender.dw1.com")
public class AllTests {

}

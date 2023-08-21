import org.testng.annotations.*;

public class TestNGBasics {

    //PreCondition Annotations
    @BeforeSuite
    public void setUp(){
        System.out.println("Open the required browser");
    }

    @BeforeTest
    public void launchBrowser(){
        System.out.println("Launch the browser");
    }

    @BeforeClass
    public void openWebPage(){
        System.out.println("Open the webpage");
    }

    @BeforeMethod
    public void login(){
        System.out.println("Login to App");
    }

    //Writing a test case using Test NG
    @Test
    public void checkPageTitle(){
        System.out.println("Page Title should be:");
    }

    @Test
    public void checkSearc(){
        System.out.println("Perform sratch");
    }
    @Test
    public void TestCase3(){
        System.out.println("Third Test Case ");
    }


    //PostCondition Annotations
    @AfterMethod
    public void logout(){
        System.out.println("Log out from the app");
    }

    @AfterClass
    public void closeBrowser(){
        System.out.println("Close the browser");
    }

    @AfterTest
    public void deleteAllCookies(){
        System.out.println("Delete all browser cookied");
    }

    @AfterSuite
    public void generateReport(){
        System.out.println("Generate Test Report");
    }
}

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlBackgroundSound;
import com.gargoylesoftware.htmlunit.html.HtmlButton;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlTextArea;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class HeadlessFactory
{
    int testRuns = 20;
    @Factory
    public Object[] headlessTestFactory()
    {
        Object[] tests = new Object[testRuns];
        for(int i = 0; i < testRuns; i++)
        {
           tests[i] = new HeadlessTest();
        }
        return tests;
    }
}

class HeadlessTest
{
    @Test
    public void HeadlessTest() throws Exception
    {
        WebClient webClient = new WebClient();
        HtmlPage googleHome = webClient.getPage("www.google.com");
        HtmlTextArea searchBox = (HtmlTextArea) googleHome.getElementById("lst-ib");
        searchBox.setText("WebDriver");
        HtmlButton searchButton = (HtmlButton) googleHome
    }
}

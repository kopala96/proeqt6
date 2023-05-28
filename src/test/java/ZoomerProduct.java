import StepObject.ZoomerProductSteps;
import Utills.ChromeRunner;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class ZoomerProduct extends ChromeRunner {
    ZoomerProductSteps zoomerProductSteps = new ZoomerProductSteps();


    @Test
    @Description("ფასი ზრდადობით შემოწმება")
    @Severity(SeverityLevel.CRITICAL)
    public void product() {
        zoomerProductSteps.MobileBtn()
                .GamoshBtn()
                .SortBtn()
                .checkfilter();

    }


    @Test
    @Description("ფასი კლებადობით შემოწმება")
    @Severity(SeverityLevel.CRITICAL)
    public void sortP() {
        zoomerProductSteps.MobileBtn()
                .GamoshBtn()
                .SortBtnK()
                .checkfilterN();
    }


    @Test
    @Description("რაოდენობის შემოწმება")
    @Severity(SeverityLevel.CRITICAL)
    public void checkCountS() {
        zoomerProductSteps.MobileBtn()
                .GamoshBtn()
                .checkCount();
    }
}



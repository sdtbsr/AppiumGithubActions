package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CreateTaskPage extends PageBase {
    public CreateTaskPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(id = "editTextTitre")
    MobileElement taskNameTxt;

    @AndroidFindBy(id = "editTextNote")
    MobileElement taskDesc;

    @AndroidFindBy(id = "action_save")
    MobileElement saveBtn;

    public void enterTaskName(String taskName) {
        clear(taskNameTxt);
        sendText(taskNameTxt, taskName);
    }

    public void enterTaskDesc(String DescText) {
        clear(taskDesc);
        sendText(taskDesc, DescText);
    }

    public void clickSaveBtn() {
        saveBtn.click();
    }
}

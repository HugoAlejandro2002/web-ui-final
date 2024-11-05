package testSuiteTodoly;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.todoly.MenuSection;
import pages.todoly.SettingsSection;

public class UpdateFullNameTest extends BaseTestTodoLy {

    MenuSection menuSection = new MenuSection();
    SettingsSection settingsSection = new SettingsSection();

    @Test
    public void verifyUpdateFullName() throws InterruptedException {
        mainPage.loginButton.click();
        loginSection.login("apazahuaychohugoalejandro@gmail.com","Holasoyyo2002");
        String name = "Hugo Test 1234";
        menuSection.settingsButton.click();
        settingsSection.fullNameTextbox.clearSetText(name);
        Thread.sleep(1000);
        settingsSection.okButton.click();
        Thread.sleep(1000);
        menuSection.settingsButton.click();
        Thread.sleep(1000);
        String actualResult = settingsSection.fullNameTextbox.getValue();
        Thread.sleep(1000);

        Assertions.assertEquals(name,actualResult,
                "ERROR the Full Name was not updated");
    }
}


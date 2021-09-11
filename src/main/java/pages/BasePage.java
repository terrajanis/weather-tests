package pages;

import static com.codeborne.selenide.Selenide.*;

public class BasePage {

    public void openMainPage(String url) {
        open(url);
        clearBrowserCookies();
        clearBrowserLocalStorage();
        refresh();
    }
}

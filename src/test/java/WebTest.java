import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;


public class WebTest {

    @Test
    public void testMenuStartTitle() throws InterruptedException {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\filin\\Documents\\Помошник\\Java\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "Welcome to 99 Bottles of Beer";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement menuBrowseLanguages = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']/li/a[@href='/abc.html']")
        );
        menuBrowseLanguages.click();
        //sleep(2000);

        WebElement menuStart = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']/li/a[@href='/']")
        );
        menuStart.click();
        //sleep(2000);

        WebElement h2 = driver.findElement(By.xpath("//body/div[@id='wrap']/div[@id='main']/h2"));
        String actualResult = h2.getText();
        //sleep(2000);

        Assert.assertEquals(actualResult, expectedResult);

        driver.quit();
    }

    // TC_11_01 Подтвердите, что на странице по базовой ссылке в правом верхнем углу
    // пользователь видит заголовок "99 Bottles of Beer"
    // Шаги:
    // 1. Открыть вебсайт на базовой странице
    // 2. Считать заголовок в правом верхнем углу
    // 3. Подтвердить, что текст заголовка соответствует ожидаемому
    // 4. Закрыть браузер

    @Test
    public void testMenuTopRightCornerTitle() throws InterruptedException {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\filin\\Documents\\Помошник\\Java\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "99 Bottles of Beer";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement h1 = driver.findElement(By.xpath("//body/div[@id='wrap']/div[@id='header']/h1"));
        String actualResult = h1.getText();

        Assert.assertEquals(actualResult, expectedResult);

        driver.quit();
    }

    // TC_11_02 Подтвердите, что на странице по базовой ссылке последний пункт меню называется
    // Submit new Language
    //
    // Шаги:
    // 1. Открыть вебсайт на базовой странице
    // 2. Считать название последнего пункта меню
    // 3. Подтвердить, что название последнего пункта меню соответствует ожидаемому
    // 4. Закрыть браузер

    @Test
    public void testLastMenuItem() throws InterruptedException {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\filin\\Documents\\Помошник\\Java\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "SUBMIT NEW LANGUAGE";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement submitNewLanguage = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']/" +
                        "li/a[@href='/submitnewlanguage.html']")
        );
        String actualResult = submitNewLanguage.getText();

        Assert.assertEquals(actualResult, expectedResult);

        driver.quit();
    }

    // TC_11_03 Подтвердите, что на странице по базовой ссылке последний пункт меню имеет
    // подзаголовок Submit new Language
    //
    // Шаги:
    // 1. Открыть вебсайт на базовой странице
    // 2. Нажать на пункт меню Submit new Language
    // 3. Считать название подзаголовка последнего пункта меню
    // 4. Подтвердить, что название подзаголовка последнего пункта меню соответствует ожидаемому
    // 5. Закрыть браузер

    @Test
    public void testTheLastMenuItemIsSubtitledSubmitNewLanguage() throws InterruptedException {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\filin\\Documents\\Помошник\\Java\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "Submit New Language";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement menuSubmitNewLanguage = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']/" +
                        "li/a[@href='/submitnewlanguage.html']")
        );
        menuSubmitNewLanguage.click();

        WebElement submitNewLanguage = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/" +
                        "ul[@id='submenu']/li/a[@href='./submitnewlanguage.html']")
        );
        String actualResult = submitNewLanguage.getText();

        Assert.assertEquals(actualResult, expectedResult);

        driver.quit();
    }

    // TC_11_04 Подтвердите, что на странице по ссылке http://www.99-bottles-of-beer.net/abc.html ,
    // первый пункт подменю называется 0-9
    //
    // Шаги:
    // 1. Открыть вебсайт на странице
    // 2. Считать название первого подзаголовка
    // 3. Подтвердить, что название подменю соответствует ожидаемому
    // 4. Закрыть браузер

    @Test
    public void testTheFirstSubmenuItemIsCalled0_9() throws InterruptedException {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\filin\\Documents\\Помошник\\Java\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/abc.html";
        String expectedResult = "0-9";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement firstSubtitle = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/" +
                        "ul[@id='submenu']/li/a[@href='0.html']")
        );
        String actualResult = firstSubtitle.getText();

        Assert.assertEquals(actualResult, expectedResult);

        driver.quit();
    }

    // TC_11_06 Подтвердите, что имена создателей сайта:
    //Oliver Schade
    //Gregor Scheithauer
    //Stefan Scheler
    //
    // Шаги:
    // Напишите самостоятельно (найдите информацию о создателях на сайте,
    // и опишите шаги для навигации и исполнения тест кейса)
    // Шаги:
    // 1. Открыть вебсайт на базовой странице "http://www.99-bottles-of-beer.net/"
    // 2. Нажать на пункт подменю Team
    // 3. Считать имена создателей
    // 4. Подтвердить, что имена создателей сайта совподают
    // 5. Закрыть браузер

    @Test
    public void testTheNamesOfTheCreatorsOfTheSite() throws InterruptedException {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\filin\\Documents\\Помошник\\Java\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult1 = "Oliver Schade";
        String expectedResult2 = "Gregor Scheithauer";
        String expectedResult3 = "Stefan Scheler";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement submenuTeam = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/" +
                        "ul[@id='submenu']/li/a[@href='team.html']")
        );
        submenuTeam.click();

        WebElement oliverSchade = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/h3[1]")
        );
        String actualResult1 = oliverSchade.getText();

        Assert.assertEquals(actualResult1, expectedResult1);

        WebElement gregorScheithauer = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/h3[2]")
        );
        String actualResult2 = gregorScheithauer.getText();

        Assert.assertEquals(actualResult2, expectedResult2);

        WebElement stefanScheler = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/h3[3]")
        );
        String actualResult3 = stefanScheler.getText();

        Assert.assertEquals(actualResult3, expectedResult3);

        driver.quit();
    }

    // TC_11_11 Подтвердите, что если на странице по ссылке
    // http://www.99-bottles-of-beer.net/submitnewlanguage.html ,
    // пользователь нажмет кнопку Submit Language,  не заполнив информацию в обязательных полях,
    // будет показана ошибка
    // Error: Precondition failed - Incomplete Input.
    //
    // Шаги:
    // 1. Открыть вебсайт на странице
    // 2. Нажать на кнопку Submit Language
    // 3. Подтвердить, что на странице показана ошибка
    // 4. Подтвердить, что текст ошибки соответствует ожидаемому
    // 5. Закрыть браузер

    @Test
    public void testWillClickSubmitLanguageError() throws InterruptedException {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\filin\\Documents\\Помошник\\Java\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/submitnewlanguage.html";
        String expectedResult = "Error: Precondition failed - Incomplete Input.";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement submitLanguage = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/" +
                        "form[@id='addlanguage']/p/input[@type='submit']")
        );
        submitLanguage.click();

        WebElement error = driver.findElement(By.xpath("//body/div[@id='wrap']/div[@id='main']/p"));
        String actualResult = error.getText();

        Assert.assertEquals(actualResult, expectedResult);

        driver.quit();
    }

    // TC_11_12 Precondition: Если на странице по ссылке
    // http://www.99-bottles-of-beer.net/submitnewlanguage.html ,
    // пользователь нажмет кнопку Submit Language,  не заполнив информацию в обязательных полях,
    // будет показана ошибка с текстом
    // Error: Precondition failed - Incomplete Input.
    //
    // Подтвертите, что в тексте ошибки слова Error, Precondition, Incomplete и Input написаны с большой буквы,
    // а слово failed  написано  с маленькой буквы.
    // Так же подтвердите, что в тексте ошибки содержатся знаки :, -  и .
    //
    // Шаги:
    // 1. Открыть вебсайт на странице
    // 2. Нажать на кнопку Submit Language
    // 3. Считать текст ошибки
    // 4. Подтвердить requirenments
    // 5. Закрыть браузер

    @Test
    public void testWordCheckError() throws InterruptedException {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\filin\\Documents\\Помошник\\Java\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/submitnewlanguage.html";
        //String expectedResult = "Error: Precondition failed - Incomplete Input.";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement submitLanguage = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/" +
                        "form[@id='addlanguage']/p/input[@type='submit']")
        );
        submitLanguage.click();

        WebElement error = driver.findElement(By.xpath("//body/div[@id='wrap']/div[@id='main']/p"));
        String actualResult = error.getText();

        Assert.assertTrue(actualResult.contains(":")); // Если есть там ":" то ТРУ и тест прошёл
        Assert.assertTrue(actualResult.contains("-"));
        Assert.assertTrue(actualResult.contains("."));
        Assert.assertTrue(actualResult.contains("Error"));
        Assert.assertTrue(actualResult.contains("Precondition"));
        Assert.assertTrue(actualResult.contains("failed"));
        Assert.assertTrue(actualResult.contains("Incomplete"));
        Assert.assertTrue(actualResult.contains("Input"));

        driver.quit();
    }

    // TC_11_13 Подтвердите, что на странице по ссылке http://www.99-bottles-of-beer.net/submitnewlanguage.html
    // в первом пункте списка пользователь видит текст
    //
    // IMPORTANT: Take your time! The more carefully you fill out this form
    // (especially the language name and description),
    // the easier it will be for us and the faster your language will show up on this page. We don't have the
    // time to mess around with fixing your descriptions etc. Thanks for your understanding.
    //
    // Шаги:
    // 1. Открыть вебсайт на странице
    // 2. Считать текст
    // 3. Подтвердить, что текст соответствует ожидаемому
    // 4. Закрыть браузер

    @Test
    public void testTheTextOfTheFirstItemInTheList() throws InterruptedException {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\filin\\Documents\\Помошник\\Java\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/submitnewlanguage.html";
        String expectedResult = "IMPORTANT: Take your time! The more carefully you fill out this form " +
                "(especially the language name and description), the easier it will be for us and " +
                "the faster your language will show up on this page. We don't have the time to mess " +
                "around with fixing your descriptions etc. Thanks for your understanding.";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement text = driver.findElement(By.xpath("//body/div[@id='wrap']/div[@id='main']/ul/li[1]"));
        String actualResult = text.getText();

        Assert.assertEquals(actualResult, expectedResult);

        driver.quit();
    }

    // TC_11_14 Подтвердите, что нажав на пункт меню Browse Languages, пользователь увидит таблицу
    // со следующими названиями для первого и второго столбцов:
    // Language
    // Author
    //
    // Шаги:
    // 1. Открыть вебсайт на базовой странице
    // 2. Нажать на пункт меню Browse Languages
    // 3. Считать названия первого и второго столбцов таблицы
    // 3. Подтвердить, что названия соответствует ожидаемым
    // 4. Закрыть браузер

    @Test
    public void testMenuBrowseLanguagesColumnNames() throws InterruptedException {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\filin\\Documents\\Помошник\\Java\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult1 = "Language";
        String expectedResult2 = "Author";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement menuBrowseLanguages = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']/li/a[@href='/abc.html']")
        );
        menuBrowseLanguages.click();

        WebElement language = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/table[@id='category']/" +
                        "tbody/tr[1]/th[@style='width: 40%;']")
        );
        String actualResult1 = language.getText();

        Assert.assertEquals(actualResult1, expectedResult1);

        WebElement author = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/table[@id='category']/" +
                        "tbody/tr[1]/th[@style='width: 30%;']")
        );
        String actualResult2 = author.getText();

        Assert.assertEquals(actualResult2, expectedResult2);

        driver.quit();
    }

    // TC_11_15 Подтвердите, что на странице по базовой ссылке  пользователь НЕ увидит новые комментарии,
    // если нажмет на пункты меню Top List → New Comments
    //
    // Шаги:
    // 1. Открыть вебсайт на базовой странице
    // 2. Нажать на пункт меню Top List
    // 3. Нажать на пункт подменю New Comments
    // 4. Считать "пустату"
    // 5. Подтвердить что му увидели желаемое
    // 6. Закрыть браузер

    @Test
    public void testMenuTopListSubMenuNewCommentsEmpty() throws InterruptedException {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\filin\\Documents\\Помошник\\Java\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement menuTopList = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']/" +
                        "li/a[@href='/toplist.html']")
        );
        menuTopList.click();

        WebElement subMenuNewComments = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='submenu']/" +
                        "li/a[@href='./newcomments.html']")
        );
        subMenuNewComments.click();

        WebElement comments = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/p")
        );
        String actualResult = comments.getText();

        Assert.assertEquals(actualResult, expectedResult);

        driver.quit();
    }

    // TC_11_21 Подтвердите, что на странице по ссылке http://www.99-bottles-of-beer.net/submitnewlanguage.html
    // пользователь видит предупреждение IMPORTANT:, написанное белыми буквами bold шрифтом на красном фоне,
    // и что все буквы - capital
    //
    // Шаги:
    // 1. Открыть вебсайт на странице
    // 2. Считать слово IMPORTANT: из списка
    // 3. Подтвердить requirenments
    // 4. Закрыть браузер

    @Test
    public void testWordFontBackground() throws InterruptedException {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\filin\\Documents\\Помошник\\Java\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/submitnewlanguage.html";
        String expectedResult = "IMPORTANT:";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement important = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/ul/li/" +
                        "span[@style='background-color:red; color: white']")
        );
        String actualResult = important.getText();
        String backgroundColor = important.getCssValue("background-color");
        String color = important.getCssValue("color");
        String fontWeight = important.getCssValue("font-weight");

//        System.out.println(important.getCssValue("background-color"));
//        System.out.println(important.getCssValue("color"));
//        System.out.println(important.getCssValue("font-weight"));

        Assert.assertEquals(actualResult, expectedResult);

        Assert.assertEquals(fontWeight, "400");
        Assert.assertEquals(backgroundColor, "rgba(255, 0, 0, 1)");
        Assert.assertEquals(color, "rgba(255, 255, 255, 1)");

        driver.quit();
    }
}

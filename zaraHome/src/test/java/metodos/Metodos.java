package metodos;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Metodos {

	WebDriver driver;

	public void abrirNavegador(String string) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(string);
		driver.manage().window().maximize();
	}

	public void fecharNavegador() {
		driver.quit();
	}

	public void apertarButton(By el) {
		driver.findElement(el).click();
	}

	public void mandarMsg(By el, String texto) {
		driver.findElement(el).sendKeys(texto);
	}

	public void submit(By el) {
		driver.findElement(el).submit();
	}

	public void screenShot(String string, String string2) throws IOException {
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./src/evidencias/" + string + "/" + string2 + ".png");
		FileUtils.copyFile(srcFile, destFile);
	}

	public void scroll(By el) throws InterruptedException {
		WebElement element = driver.findElement(el);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(500);
	}

	public void aguardarElemento(int tempo, By elemento) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(tempo));
			wait.until(ExpectedConditions.elementToBeClickable(elemento));
	}
}

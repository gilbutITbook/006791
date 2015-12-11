import org.openqa.selenium.firefox.FirefoxDriver

waiting {
	timeout = 3
}

environments {
	firefox {
		driver = { new FirefoxDriver() }
	}
}


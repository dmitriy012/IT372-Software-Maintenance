Selenium Web Driver using InteliJ IDEA


Go to this site to get the maven dependency for the chrome driver
https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-chrome-driver

copy the dependency and paste it into your projects pom.xml file

Go to this site and download the appropriate chrome driver for your operating system
https://sites.google.com/a/chromium.org/chromedriver/downloads

Download the driver to a location you will remember

In the code you will need to specify the location of the driver
Example: System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

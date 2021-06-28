# MitigramIntergrationTest
This is a basic test framework to write tests in Java and Cucumber for a web application driven by Selenium (https://www.selenium.dev/). 
Test cases are in features files which are driven by Cucumber (https://cucumber.io).
Junit is also used to write methods.

Project structure:
In directory "src/features", there are subdirectories, "career" and "login", where feature files are stored. 
You can find test cases there, e.g. src/features/login/login.feature contains all the test cases regarding testing the Mitigram login page.
Under the package name "web.inittest.objects", there are sub packages such as "career" and "login", which contains Java classes used by the feature files.
For example, you can see LoginPage class which contains web elements locations of the Mitigram Login page. While all the methods driven by login.feature are written
in LoginSteps class.
There are other sub packages such as "lib" containing classes that can be used by others.

How to run a test:
1. By default, the test framework will use Chrome webdriver to drive the Mitigram web application. If you want to use FireFox as a web browser, you need to config System.setProperty in HomePage class
   under "webconfig" subpackage and download a FireFox web driver for your FireFox web browser.
2. There are two ways to start a test. You can either run a test from TestManagement class located in "testrunner" sub package or run it from a feature file. 
   You can see "play" icons in both TestManagement and a feature file if you use Intellij, click on them to start running a test.
3. Once, you start running a test, you can see the test result printed out from the terminal output of your IDE.
4. You are also able to collect test cases from different feature files for your testing. Check this out from TestManagement Java class.

Before you write a new test, you can have a look at login.feature file to know how the test framework works.
How to write a new test:
1. Create a feature file in Cucumber and add new test cases there.
2. Click on the "play" icon in the feature file to perform a dryrun
3. Your IDE will suggest to add undefined methods that is missing, copy them and paste them in a Java class.
   Note that you also need to have a constructor for the Java class to pass a "driver" (working with web elements) to it.
4. Create another Java class to store web elements regarding the page you want to test on. It also needs a "driver".
5. Now you can finish up writing all the methods in Step 3 and try to run your new test,


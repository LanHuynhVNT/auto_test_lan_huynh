#helloPay exercise

## Implement automation test case

1. Create new helloPay account: I used mailinator.com mail box for creating new account. However, no mail is sent to the test mail (not sure if is is a bug) so I can’t go further. The checkpoint is checking the browser title in the page where user enter the code from mail.

2. Forgotten password: Got the same issue above. I can’t register a new account so I can’t check this feature. Just automate the simple case, entering the email address and click the Reset button. The checkpoint is checking the message is displayed after clicking the button.

### Execute the test case

Pre-condition: Copy the geckodriver.exe file to D: drive

Open Java IDE with TestNG plug-in and run test with the helloPay.xml file
or, run on Command line with the command
`java org.testng.TestNG helloPay.xml`

## Answer the question

1. What is the benefit of automation test and why? Please provide some of you examples to explain that.

In my opinion, the most benefit of automation test is support engineer to execute the Regression test, to avoid human mistake while doing this test type. As we know, the Regression test is too boring, it repeats the test steps over and over, that make manual tester miss some checkpoints sometimes. This makes the test result is more reliability and stable.

The next benefit is Automation test can use the power of machine, it can be executed 24/7, on many PCs with different configuration (hardware), different OS, different Browser, different test data, etc. This makes we save testing time, get the test report and make the decision base on the report quickly.

And, one other thing, automation test can do the test that difficult for manual test, like Performance Test - simulate a lot of user/transition to work with the application/system under test.

2. What makes a good automation test tool, and what is the bad one? Why?

As my experience, the good automation test tool need to have following properties:
* Support the technical used in the UAT. If UAT is desktop based application, the Selenium - which support web test only - cannot be a good test tool. It not about the technical insides UAT only, it also includes the OS and Browser.
* Support connecting with almose data sources. In automation test, we cannot ignore the Data-driven test. So, if the test tool doesn’t support connect to database, it’s not good.
* Support multiple programming languages. Automation test tools support at least one programming language. But, if it supports more than one, user can choose which language is best for him.
* Have feature that generate report in multiple format, from general to details. The test report is not only read by automation engineer, but also manager and other stakeholders. So, each level in project, we need a specific report.


# T120M023 #

----------

## Laboratory work 1: Automatic tests generation ##

### Prerequisites ###

1. Eclipse [https://eclipse.org/downloads/eclipse-packages/](https://eclipse.org/downloads/eclipse-packages/). Select Eclipse IDE for Java Developers
2. Install PITclipse plugin for mutation testing [https://marketplace.eclipse.org/content/pitclipse](https://marketplace.eclipse.org/content/pitclipse)
3. EclEmma for code coverage [https://marketplace.eclipse.org/content/eclemma-java-code-coverage](https://marketplace.eclipse.org/content/eclemma-java-code-coverage)

### Exercise ###

1. Checkout project from GIT 
2. Import project from *sources\lab1\lab1*
2. Run *DivisionTest* test
3. Check code coverage
4. Write additional tests if needed
5. Run mutation testing
6. Write additional tests if needed
7. Write tests for *Calculator* and *PasswordGenerator* classes and repeat 3-6 steps

### Task ###

1. Generate/Write unit tests for 2 selected classes which has at least 2 non get/set methods.
2. Run mutation testing
3. Update tests
4. Run mutation testing
5. Compare results, how mutation detection improved

####Your report should contain####

1. Introduction: short summary of classes under test, including what they do and lines of code
2. Work results:
	1. Iteration 1:
		1. Source code of the initially created unit tests
		1. Code coverage and mutation testing results of the initial unit tests
	1. Iteration 2:
		1. Updated tests source code
		1. Code coverage and mutation testing results after step 4
6. Conclusions of the results, including comparison of results between iteration 1 and 2, which mutants were killed, how much code coverage has improved



### Candidates for testing ###

- [https://github.com/JodaOrg/joda-time](https://github.com/JodaOrg/joda-time) (could require to change junit version in pom.xml to 4.12)
- [https://github.com/jwtk/jjwt](https://github.com/jwtk/jjwt)
- [https://github.com/jsvazic/GAHelloWorld](https://github.com/jsvazic/GAHelloWorld)
- [https://github.com/apache/commons-math](https://github.com/apache/commons-math)

Getting started with tests:

- Clone code using git
- Eclipse: Import Maven project by clicking File->Import->Mavem->Existing Maven Projects


### Further reading ###
- [http://junit.sourceforge.net/doc/testinfected/testing.htm](http://junit.sourceforge.net/doc/testinfected/testing.htm "http://junit.sourceforge.net/doc/testinfected/testing.htm")
- [http://crestweb.cs.ucl.ac.uk/resources/mutation_testing_repository/](http://crestweb.cs.ucl.ac.uk/resources/mutation_testing_repository/)
- [http://martinfowler.com/articles/mocksArentStubs.html](http://martinfowler.com/articles/mocksArentStubs.html "Martin Fowler - Mocks Aren't Stubs")
- [https://www.feabhas.com/sites/default/files/uploads/News/Feabhas_Infographic_FINAL.pdf](https://www.feabhas.com/sites/default/files/uploads/News/Feabhas_Infographic_FINAL.pdf)
- [https://raygun.com/blog/2014/05/10-costly-software-errors-history/](https://raygun.com/blog/2014/05/10-costly-software-errors-history/)


## Laboratory work 2: Web application testing ##

### Prerequisites ###
1. Firefox browser
2. Selenium IDE plugin for Firefox [https://addons.mozilla.org/en-us/firefox/addon/selenium-ide/](https://addons.mozilla.org/en-us/firefox/addon/selenium-ide/)
3. HP Loadrunner [http://www8.hp.com/us/en/software-solutions/loadrunner-load-testing/](http://www8.hp.com/us/en/software-solutions/loadrunner-load-testing/)
4. Visual Studio [https://www.visualstudio.com/vs/community/](https://www.visualstudio.com/vs/community/ "https://www.visualstudio.com/vs/community/")

### Exercise ###

1. Checkout project from GIT 
2. Go to *sources\lab2\src*
2. Open *lab2.sln* file
3. Record a selenium scenario for registration form page
4. Record a performance test for registration form page

### Task ###

 1. Record 2 selenium tests for the selected application
 2. Record performance 2 user scripts using Loadrunner for the selected application
 3. Create a scenario using user scripts
 4. Run scenario 3 times for 15 minutes
 5. Analyze results

####Your report should contain####

1. Introduction: short summary application under test
2. Work results:
	1. Selenium:
		1. Scripts
		2. Execution results
	2. Loadrunner:
		1. 2 virtual user scripts
		2. Created scenario (screenshot)
		2. Execution results, at least 2 times each run of 15 minutes
3. Conclusions of the results, including average response times, if any found performance problems


### Candidates for testing ###
 - MusicStore [https://github.com/aspnet/MusicStore](https://github.com/aspnet/MusicStore/ "https://github.com/aspnet/MusicStore")
 - SocialGoal [https://github.com/MarlabsInc/SocialGoal](https://github.com/MarlabsInc/SocialGoal "https://github.com/MarlabsInc/SocialGoal")
 - LimeSurvey [https://www.limesurvey.org/](https://www.limesurvey.org/ "https://www.limesurvey.org/")

### Further reading ###
- [http://www.agileload.com/agileload/blog/2012/11/09/application-performance-testing-basics](http://www.agileload.com/agileload/blog/2012/11/09/application-performance-testing-basics "http://www.agileload.com/agileload/blog/2012/11/09/application-performance-testing-basics")
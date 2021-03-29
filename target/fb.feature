Feature: Fb login page
@smoke
Scenario Outline: check login
Given launch url
 When put "<email>" and "<password>"
 Then I quit the browser

    Examples: 
      | email  |password |
      | name1 |\nl\xcn\ln|
      | name2 |mzxnzds7| 
      |ajaskkja|shdhsdgghs|
      |ssvsdvsv|sdvsdvsd|
      |shgshgshg|shgshdgh|
      |sshgshg|sjsjgsg|
      |ashdjaj|ahjs|

#Author:chanchal.soni@pratian.com

@tag
Feature: Login to ROS Application

  @tag1
  Scenario: Login with valid credentials 
    Given user is on welcome to ROS screen
    When user clicks on login button 
    Then user navigates to the azure login page 
    Given user enters the valid email and password
    And user clicks on sign in 
    Then user logs in successfuly
    And lands on the cashup sheets


      

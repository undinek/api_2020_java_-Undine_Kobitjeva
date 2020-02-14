Feature: Folders

#  Scenario: Add folder
#    When  User creates new folder in space with id "2572551"
#    And Verify that folder is created
#    Then Delete folder

#  @NewFolder
#  Scenario: Add folder and list
#    When User creates new folder in space with id "2572551" and name "New folder"
#    And Verify that folder is created
#    And Create list in folder with name "List name"
#    Then Verify that list is created


#  @NewFolder
#  @SpaceNameChanged
#  Scenario: Update space name
#    When User updates space with id "2572551" name to "New space name"
#    And User creates new folder with name "My new folder"
#    And Verify that folder is created
#    And Create list in folder with name "List name"
#    And Verify that list is created
#    Then Verify Space Id and Name

  @NewFolder
  Scenario: Add folder and list
    When User creates new folder in space with id "2572551" and name "Folder name"
    And Verify that folder is created
    And Create list in folder with name "List name"
    And Create 5 tasks
    Then Verify that all necessary tasks are created
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/folder.feature");
formatter.feature({
  "name": "Folders",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add folder",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User creates new folder in space with id \"2572551\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.userCreatesNewFolder(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that folder is created",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.verifyThatFolderIsCreated()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Delete folder",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.deleteFolder()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add folder and list",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@NewFolder"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User creates new folder in space with id \"2572551\" and name \"New folder name\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.userCreatesNewFolderInSpaceWithIdAndName(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that folder is created",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.verifyThatFolderIsCreated()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Create list in folder with name \"New list name\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.createListInFolderWithName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that list is created",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.verifyThatListIsCreated()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Update space name",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@NewFolder"
    },
    {
      "name": "@SpaceNameChanged"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User updates space with id \"2572551\" name to \"New space name\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.userUpdatesSpaceWithIdNameTo(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User creates new folder with name \"My new folder name\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.userCreatesNewFolderWithName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that folder is created",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.verifyThatFolderIsCreated()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Create list in folder with name \"My list name\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.createListInFolderWithName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that list is created",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.verifyThatListIsCreated()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Space Id and Name",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.verifySpaceIdAndName()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Add folder and list",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@NewFolder"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User creates new folder in space with id \"2572551\" and name \"Folder name\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.userCreatesNewFolderInSpaceWithIdAndName(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that folder is created",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.verifyThatFolderIsCreated()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Create list in folder with name \"List name\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.createListInFolderWithName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Create 5 tasks",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.createTasks(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that all necessary tasks are created",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.verifyThatAllNecessaryTasksAreCreated()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[5]\u003e but was:\u003c[0]\u003e\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat stepdefinitions.StepDefinition.verifyThatAllNecessaryTasksAreCreated(StepDefinition.java:109)\n\tat ✽.Verify that all necessary tasks are created(src/test/resources/features/folder.feature:32)\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/addFolder.feature");
formatter.feature({
  "name": "Folders",
  "description": "",
  "keyword": "Feature"
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
  "error_message": "java.lang.ClassCastException: java.util.HashMap cannot be cast to java.util.List\n\tat io.restassured.path.json.JsonPath.getList(JsonPath.java:390)\n\tat helpers.ClickupTaskHelper.getClickupTasks(ClickupTaskHelper.java:22)\n\tat stepdefinitions.StepDefinition.verifyThatAllNecessaryTasksAreCreated(StepDefinition.java:103)\n\tat ✽.Verify that all necessary tasks are created(src/test/resources/features/addFolder.feature:32)\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});
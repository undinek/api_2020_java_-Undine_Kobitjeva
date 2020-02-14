package stepdefinitions;

import clients.ClickupClient;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import domain.ClickupFolder;
import domain.ClickupList;
import domain.ClickupSpace;
import domain.ClickupTask;
import helpers.*;
import io.restassured.response.ValidatableResponse;
import org.assertj.core.api.AbstractBooleanAssert;

import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

public class StepDefinition {

    private final ClickupClient CLICKUP_CLIENT = new ClickupClient();


    @When("User creates new folder in space with id {string}")
    public void userCreatesNewFolder(String spaceId) {
        String name = RandomString.getRandomString();
        TestCaseContext.get().setClickupFolder(ClickupFolderHelper.createClickupFolder(spaceId, name));
        TestCaseContext.get().setClickupSpace(ClickupSpaceHelper.getClickupSpace(spaceId));
    }

    @And("Verify that folder is created")
    public void verifyThatFolderIsCreated() {
        String id = TestCaseContext.get().getClickupFolder().getId();
        ClickupFolder fetchedClickupFolder = ClickupFolderHelper.getClickupFolder(TestCaseContext.get().getClickupFolder().getId());
        assertThat(fetchedClickupFolder.getId()).isEqualTo(id);
        assertThat(fetchedClickupFolder.getName()).isEqualTo(TestCaseContext.get().getClickupFolder().getName());

    }

    @Then("Delete folder")
    public void deleteFolder() {
        CLICKUP_CLIENT.deleteFolder(TestCaseContext.get().getClickupFolder().getId());
    }

    @When("User creates new folder in space with id {string} and name {string}")
    public void userCreatesNewFolderInSpaceWithIdAndName(String spaceId, String folderName) {
        TestCaseContext.get().setClickupFolder(ClickupFolderHelper.createClickupFolder(spaceId, folderName));
        TestCaseContext.get().setClickupSpace(ClickupSpaceHelper.getClickupSpace(spaceId));

    }

    @And("Create list in folder with name {string}")
    public void createListInFolderWithName(String listName) {
        ClickupList clickupList = ClickupListHelper.createClickupList(TestCaseContext.get().getClickupFolder().getId(), listName);
        TestCaseContext.get().setClickupList(clickupList);
    }

    @Then("Verify that list is created")
    public void verifyThatListIsCreated() {
        String listId = TestCaseContext.get().getClickupList().getId();
        ClickupList fetchedClickupList = ClickupListHelper.getClickupList(listId);
        assertThat(fetchedClickupList.getId()).isEqualTo(listId);
        assertThat(fetchedClickupList.getName()).isEqualTo(TestCaseContext.get().getClickupList().getName());
    }

    @When("User updates space with id {string} name to {string}")
    public void userUpdatesSpaceWithIdNameTo(String spaceId, String spaceName) {
        ClickupSpaceHelper.updateClickupSpace(spaceId, spaceName);
        ClickupSpace fetchedClickupSpace = ClickupSpaceHelper.getClickupSpace(spaceId);
        TestCaseContext.get().setClickupSpace(fetchedClickupSpace);
    }

    @Then("Verify Space Id and Name")
    public void verifySpaceIdAndName() {
        String spaceId = TestCaseContext.get().getClickupSpace().getId();
        ClickupSpace fetchedClickupSpace = ClickupSpaceHelper.getClickupSpace(spaceId);
        assertThat(fetchedClickupSpace.getId()).isEqualTo(spaceId);
        assertThat(fetchedClickupSpace.getName()).isEqualTo(TestCaseContext.get().getClickupSpace().getName());
    }


    @And("User creates new folder with name {string}")
    public void userCreatesNewFolderWithName(String folderName) {
        ClickupFolder fetchedClickupFolder = ClickupFolderHelper.createClickupFolder(TestCaseContext.get().getClickupSpace().getId(), folderName);
        TestCaseContext.get().setClickupFolder(fetchedClickupFolder);
    }

    @And("Create {int} tasks")
    public void createTasks(int taskCount) {
        ClickupTask clickupTask;
        ArrayList list = new ArrayList();
        for (int i = 0; i < taskCount; i++){
            String name = RandomString.getRandomString();
            clickupTask = ClickupTaskHelper.createClickupTask(TestCaseContext.get().getClickupList().getId(), name);
            list.add(clickupTask);
        }
        TestCaseContext.get().setTasks(list);
    }

    @Then("Verify that all necessary tasks are created")
    public void verifyThatAllNecessaryTasksAreCreated() {
        List<ClickupTask>  fetchedClickupTasks = ClickupTaskHelper.getClickupTasks(TestCaseContext.get().getClickupList().getId());

        Integer i1 = fetchedClickupTasks.size();
        Integer i2 = TestCaseContext.get().getTasks().size();
        assertThat(i1).isEqualTo(i2);
    }

    }

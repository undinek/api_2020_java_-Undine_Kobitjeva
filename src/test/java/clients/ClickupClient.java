package clients;

import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;

import javax.ws.rs.core.Response;

import static io.restassured.RestAssured.given;

public class ClickupClient {

    private static final String API_TOKEN = "pk_4532458_OAKS37LL4L7S9FJKAJJ8JQ3FGHFGTZ4F";
    private static final String CLICKUP_BASE_URL = "https://api.clickup.com/api/v2";
    private static final String CLICKUP_CREATE_FOLDER_URL = "%s/space/%s/folder";
    private static final String CLICKUP_GET_FOLDER_URL = "%s/folder/%s";
    private static final String CLICKUP_CREATE_LIST_URL = "%s/folder/%s/list";
    private static final String CLICKUP_GET_LIST_URL = "%s/list/%s";
    private static final String CLICKUP_GET_SPACE_URL = "%s/space/%s";
    private static final String CLICKUP_CREATE_TASK_URL = "%s/list/%s/task";
    private static final String CLICKUP_GET_ALL_TASKS_URL = "%s/list/%s/task?archived=false";



    public ValidatableResponse createFolder(String spaceId, String name) {
        //https://api.clickup.com/api/v2/space/789/folder
        return given().
                header("Authorization", API_TOKEN).
                body("{\"name\": \"" + name + "\"}").
                contentType(ContentType.JSON).
                when().
                post(String.format(CLICKUP_CREATE_FOLDER_URL, CLICKUP_BASE_URL, spaceId)).
                then().
                log().
                ifValidationFails().
                statusCode(Response.Status.OK.getStatusCode());
    }

    public ValidatableResponse fetchFolder(String folderId) {
        //https://api.clickup.com/api/v2/folder/457
        return given().
                header("Authorization", API_TOKEN).
                when().
                get(String.format(CLICKUP_GET_FOLDER_URL, CLICKUP_BASE_URL, folderId)).
                then().
                log().
                ifValidationFails().
                statusCode(Response.Status.OK.getStatusCode());
    }

    public void deleteFolder(String folderId) {
        //https://api.clickup.com/api/v2/folder/457
         given().
                header("Authorization", API_TOKEN).
                when().
                delete(String.format(CLICKUP_GET_FOLDER_URL, CLICKUP_BASE_URL, folderId)).
                then().
                log().
                ifValidationFails().
                statusCode(Response.Status.OK.getStatusCode());
    }

    public ValidatableResponse createList(String folderId, String listName){
        //https://api.clickup.com/api/v2/folder/456/list
        return given().
                header("Authorization", API_TOKEN).
                body("{\"name\": \"" + listName + "\"}").
                contentType(ContentType.JSON).
                when().
                post(String.format(CLICKUP_CREATE_LIST_URL, CLICKUP_BASE_URL, folderId)).
                then().
                log().
                ifValidationFails().
                statusCode(Response.Status.OK.getStatusCode());
    }

    public ValidatableResponse fetchList (String listId){
        //https://api.clickup.com/api/v2/list/124
        return given().
                header("Authorization", API_TOKEN).
                contentType(ContentType.JSON).
                when().
                get(String.format(CLICKUP_GET_LIST_URL, CLICKUP_BASE_URL, listId)).
                then().
                log().
                ifValidationFails().
                statusCode(Response.Status.OK.getStatusCode());
    }

    public ValidatableResponse updateSpaceName(String spaceId, String spaceName){
        //https://api.clickup.com/api/v2/space/2572551
        return given().
                body("{\"name\": \""+ spaceName +"\"}").
                header("Authorization", API_TOKEN).
                when().
                put(String.format(CLICKUP_GET_SPACE_URL, CLICKUP_BASE_URL, spaceId)).
                then().
                log().
                ifValidationFails().
                statusCode(Response.Status.OK.getStatusCode());
    }

    public ValidatableResponse fetchSpace(String spaceId){
        //https://api.clickup.com/api/v2/space/790
        return given().
                header("Authorization", API_TOKEN).
                when().
                get(String.format(CLICKUP_GET_SPACE_URL, CLICKUP_BASE_URL, spaceId)).
                then().
                log().
                ifValidationFails().
                statusCode(Response.Status.OK.getStatusCode());
    }

    public ValidatableResponse createTask(String listId, String taskName){
        //https://api.clickup.com/api/v2/list/123/task
        return given().
                header("Authorization", API_TOKEN).
                body("{\"name\": \"" + taskName + "\"}").
                contentType(ContentType.JSON).
                when().
                post(String.format(CLICKUP_CREATE_TASK_URL, CLICKUP_BASE_URL, listId)).
                then().
                log().
                ifValidationFails().
                statusCode(Response.Status.OK.getStatusCode());
    }

    public ValidatableResponse getAllTasks(String listId){
        //https://api.clickup.com/api/v2/list/123/task?archived=false
        return given().
                header("Authorization", API_TOKEN).
                contentType(ContentType.JSON).
                when().
                get(String.format(CLICKUP_GET_ALL_TASKS_URL, CLICKUP_BASE_URL, listId)).
                then().
                log().
                ifValidationFails().
                statusCode(Response.Status.OK.getStatusCode());
    }

}

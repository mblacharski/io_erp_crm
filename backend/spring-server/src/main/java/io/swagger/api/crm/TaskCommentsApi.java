/**
 * NOTE: This class is auto generated by the swagger code generator program (2.2.3).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api.crm;

import io.swagger.model.Error;
import io.swagger.model.crm.TaskComment;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-15T00:41:28.115Z")

@Api(value = "taskComments", description = "the task comments API")
public interface TaskCommentsApi {
    @ApiOperation(value = "Create new TaskComment for given task", notes = "", response = Integer.class, authorizations = {
            @Authorization(value = "Authorization")
    }, tags={ "CRM - task comments", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "", response = Integer.class),
            @ApiResponse(code = 401, message = "Unauthorized - API key is missing or invalid", response = Error.class),
            @ApiResponse(code = 500, message = "Server error", response = Error.class) })

    @RequestMapping(value = "/crm/tasks/{taskId}/comments",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.POST)
    ResponseEntity<Integer> createTaskComments(@ApiParam(value = "",required=true ) @PathVariable("taskId") Integer taskId,
                                               @ApiParam(value = "TaskComment to create"  )  @Valid @RequestBody TaskComment order);

    @ApiOperation(value = "Delete TaskComment", notes = "", response = Void.class, authorizations = {
            @Authorization(value = "Authorization")
    }, tags={ "CRM - task comments", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Deleted", response = Void.class),
            @ApiResponse(code = 401, message = "Unauthorized - API key is missing or invalid", response = Error.class),
            @ApiResponse(code = 500, message = "Server error", response = Error.class) })

    @RequestMapping(value = "/crm/tasks/{taskId}/comments/{TaskCommentId}",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteTaskComment(@ApiParam(value = "",required=true ) @PathVariable("taskId") Integer taskId,
                                           @ApiParam(value = "",required=true ) @PathVariable("TaskCommentId") Integer taskCommentId);

    @ApiOperation(value = "Returns comment belonging to given task", notes = "", response = TaskComment.class, authorizations = {
            @Authorization(value = "Authorization")
    }, tags={ "CRM - task comments", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "", response = TaskComment.class),
            @ApiResponse(code = 401, message = "Unauthorized - API key is missing or invalid", response = Error.class),
            @ApiResponse(code = 500, message = "Server error", response = Error.class) })

    @RequestMapping(value = "/crm/tasks/{taskId}/comments/{TaskCommentId}",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<TaskComment> getTaskComment(@ApiParam(value = "",required=true ) @PathVariable("taskId") Integer taskId,
                                               @ApiParam(value = "",required=true ) @PathVariable("TaskCommentId") Integer taskCommentId);

    @ApiOperation(value = "Returns comments belonging to given task", notes = "", response = TaskComment.class, responseContainer = "List", authorizations = {
            @Authorization(value = "Authorization")
    }, tags={ "CRM - task comments", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "", response = TaskComment.class, responseContainer = "List"),
            @ApiResponse(code = 401, message = "Unauthorized - API key is missing or invalid", response = Error.class),
            @ApiResponse(code = 500, message = "Server error", response = Error.class) })

    @RequestMapping(value = "/crm/tasks/{taskId}/comments",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<List<TaskComment>> getTaskComments(@ApiParam(value = "",required=true ) @PathVariable("taskId") Integer taskId);

    @ApiOperation(value = "Update existing TaskComment", notes = "", response = Void.class, authorizations = {
            @Authorization(value = "Authorization")
    }, tags={ "CRM - task comments", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Updated", response = Void.class),
            @ApiResponse(code = 401, message = "Unauthorized - API key is missing or invalid", response = Error.class),
            @ApiResponse(code = 500, message = "Server error", response = Error.class) })

    @RequestMapping(value = "/crm/tasks/{taskId}/comments/{TaskCommentId}",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.PUT)
    ResponseEntity<Void> updateTaskComment(@ApiParam(value = "",required=true ) @PathVariable("taskId") Integer taskId,
                                           @ApiParam(value = "",required=true ) @PathVariable("TaskCommentId") Integer taskCommentId,
                                           @ApiParam(value = "TaskComment to update"  )  @Valid @RequestBody TaskComment taskComment);

}

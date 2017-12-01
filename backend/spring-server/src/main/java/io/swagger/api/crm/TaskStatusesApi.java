/**
 * NOTE: This class is auto generated by the swagger code generator program (2.2.3).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api.crm;

import io.swagger.model.Error;
import io.swagger.model.crm.TaskStatus;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-15T00:41:28.115Z")

@Api(value = "taskStatuses", description = "the taskStatuses API")
public interface TaskStatusesApi {

    @ApiOperation(value = "Create new taskStatus", notes = "", response = Integer.class, authorizations = {
        @Authorization(value = "Authorization")
    }, tags={ "CRM - taskStatuses", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Integer.class),
        @ApiResponse(code = 401, message = "Unauthorized - API key is missing or invalid", response = Error.class),
        @ApiResponse(code = 500, message = "Server error", response = Error.class) })
    
    @RequestMapping(value = "/crm/taskStatuses",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Integer> createTaskStatus(@ApiParam(value = "TaskStatus to create"  )  @Valid @RequestBody TaskStatus taskStatus);


    @ApiOperation(value = "Delete taskStatus", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "Authorization")
    }, tags={ "CRM - taskStatuses", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Deleted", response = Void.class),
        @ApiResponse(code = 401, message = "Unauthorized - API key is missing or invalid", response = Error.class),
        @ApiResponse(code = 500, message = "Server error", response = Error.class) })
    
    @RequestMapping(value = "/crm/taskStatuses/{taskStatusId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteTaskStatus(@ApiParam(value = "",required=true ) @PathVariable("taskStatusId") Integer taskStatusId);


    @ApiOperation(value = "Returns TaskStatus", notes = "", response = TaskStatus.class, authorizations = {
        @Authorization(value = "Authorization")
    }, tags={ "CRM - taskStatuses", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = TaskStatus.class),
        @ApiResponse(code = 401, message = "Unauthorized - API key is missing or invalid", response = Error.class),
        @ApiResponse(code = 500, message = "Server error", response = Error.class) })
    
    @RequestMapping(value = "/crm/taskStatuses/{taskStatusId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<TaskStatus> getTaskStatus(@ApiParam(value = "",required=true ) @PathVariable("taskStatusId") Integer taskStatusId);


    @ApiOperation(value = "Returns list of TaskStatuses", notes = "", response = TaskStatus.class, responseContainer = "List", authorizations = {
        @Authorization(value = "Authorization")
    }, tags={ "CRM - taskStatuses", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = TaskStatus.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized - API key is missing or invalid", response = Error.class),
        @ApiResponse(code = 500, message = "Server error", response = Error.class) })
    
    @RequestMapping(value = "/crm/taskStatuses",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<TaskStatus>> getTaskStatuses();


    @ApiOperation(value = "Update existing taskStatus", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "Authorization")
    }, tags={ "CRM - taskStatuses", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Updated", response = Void.class),
        @ApiResponse(code = 401, message = "Unauthorized - API key is missing or invalid", response = Error.class),
        @ApiResponse(code = 500, message = "Server error", response = Error.class) })
    
    @RequestMapping(value = "/crm/taskStatuses/{taskStatusId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateTaskStatus(@ApiParam(value = "",required=true ) @PathVariable("taskStatusId") Integer taskStatusId,@ApiParam(value = "TaskStatus to create"  )  @Valid @RequestBody TaskStatus taskStatus);

}

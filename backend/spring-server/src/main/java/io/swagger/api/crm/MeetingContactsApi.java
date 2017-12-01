///**
// * NOTE: This class is auto generated by the swagger code generator program (2.2.3).
// * https://github.com/swagger-api/swagger-codegen
// * Do not edit the class manually.
// */
//package io.swagger.api.crm;
//
//import io.swagger.model.Error;
//import io.swagger.model.crm.Meeting;
//import io.swagger.model.crm.Contact;
//import io.swagger.model.crm.MeetingNote;
//
//import io.swagger.annotations.*;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import java.util.List;
//import javax.validation.Valid;
//@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-15T00:41:28.115Z")
//
//@Api(value = "meetingContacts", description = "the meeting contacts API")
//public interface MeetingContactsApi {
//    @ApiOperation(value = "Create new Contact for given meeting", notes = "", response = Integer.class, authorizations = {
//            @Authorization(value = "APIKeyHeader")
//    }, tags={ "CRM - meeting contacts", })
//    @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "", response = Integer.class),
//            @ApiResponse(code = 401, message = "Unauthorized - API key is missing or invalid", response = Error.class),
//            @ApiResponse(code = 500, message = "Server error", response = Error.class) })
//
//    @RequestMapping(value = "/crm/meetings/{meetingId}/contacts",
//            produces = { "application/json" },
//            consumes = { "application/json" },
//            method = RequestMethod.POST)
//    ResponseEntity<Integer> createMeetingContacts(@ApiParam(value = "",required=true ) @PathVariable("meetingId") Integer meetingId,
//                                                  @ApiParam(value = "Contact to create"  )  @Valid @RequestBody Contact order);
//
//
//    @ApiOperation(value = "Delete Contact", notes = "", response = Void.class, authorizations = {
//            @Authorization(value = "APIKeyHeader")
//    }, tags={ "CRM - meeting contacts", })
//    @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "Deleted", response = Void.class),
//            @ApiResponse(code = 401, message = "Unauthorized - API key is missing or invalid", response = Error.class),
//            @ApiResponse(code = 500, message = "Server error", response = Error.class) })
//
//    @RequestMapping(value = "/crm/meetings/{meetingId}/contacts/{ContactId}",
//            produces = { "application/json" },
//            consumes = { "application/json" },
//            method = RequestMethod.DELETE)
//    ResponseEntity<Void> deleteContact(@ApiParam(value = "",required=true ) @PathVariable("meetingId") Integer meetingId,
//                                              @ApiParam(value = "",required=true ) @PathVariable("ContactId") Integer contactId);
//
//    @ApiOperation(value = "Returns contact belonging to given meeting", notes = "", response = Contact.class, authorizations = {
//            @Authorization(value = "APIKeyHeader")
//    }, tags={ "CRM - meeting contacts", })
//    @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "", response = Contact.class),
//            @ApiResponse(code = 401, message = "Unauthorized - API key is missing or invalid", response = Error.class),
//            @ApiResponse(code = 500, message = "Server error", response = Error.class) })
//
//    @RequestMapping(value = "/crm/meetings/{meetingId}/contacts/{ContactId}",
//            produces = { "application/json" },
//            consumes = { "application/json" },
//            method = RequestMethod.GET)
//    ResponseEntity<Contact> getContact(@ApiParam(value = "",required=true ) @PathVariable("meetingId") Integer meetingId,
//                                                     @ApiParam(value = "",required=true ) @PathVariable("ContactId") Integer contactId);
//
//    @ApiOperation(value = "Returns contacts belonging to given meeting", notes = "", response = Contact.class, responseContainer = "List",
//            authorizations = {@Authorization(value = "APIKeyHeader")
//    }, tags={ "CRM - meeting contacts", })
//    @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "", response = Contact.class, responseContainer = "List"),
//            @ApiResponse(code = 401, message = "Unauthorized - API key is missing or invalid", response = Error.class),
//            @ApiResponse(code = 500, message = "Server error", response = Error.class) })
//
//    @RequestMapping(value = "/crm/meetings/{meetingId}/contacts",
//            produces = { "application/json" },
//            consumes = { "application/json" },
//            method = RequestMethod.GET)
//    ResponseEntity<List<Contact>> getContacts(@ApiParam(value = "",required=true ) @PathVariable("meetingId") Integer meetingId);
//
//    @ApiOperation(value = "Update existing Contact", notes = "", response = Void.class, authorizations = {
//            @Authorization(value = "APIKeyHeader")
//    }, tags={ "CRM - meeting contacts", })
//    @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "Updated", response = Void.class),
//            @ApiResponse(code = 401, message = "Unauthorized - API key is missing or invalid", response = Error.class),
//            @ApiResponse(code = 500, message = "Server error", response = Error.class) })
//
//    @RequestMapping(value = "/crm/meetings/{meetingId}/contacts/{ContactId}",
//            produces = { "application/json" },
//            consumes = { "application/json" },
//            method = RequestMethod.PUT)
//    ResponseEntity<Void> updateContact(@ApiParam(value = "",required=true ) @PathVariable("meetingId") Integer meetingId,
//                                              @ApiParam(value = "",required=true ) @PathVariable("ContactId") Integer contactId,
//                                              @ApiParam(value = "Contact to update"  )  @Valid @RequestBody Contact meetingContact);
//
//
//}
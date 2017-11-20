/**
 * NOTE: This class is auto generated by the swagger code generator program (2.2.3).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api.erp;

import java.math.BigDecimal;
import io.swagger.model.Error;
import io.swagger.model.erp.Order_;
import io.swagger.model.erp.OrderedArticle;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-15T00:41:28.115Z")

@Api(value = "orders", description = "the orders API")
public interface OrderedArticlesApi {


    @ApiOperation(value = "Create new OrderedArticle for given order", notes = "", response = Integer.class, authorizations = {
            @Authorization(value = "APIKeyHeader")
    }, tags={ "ERP - orderedArticles", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "", response = Integer.class),
            @ApiResponse(code = 401, message = "Unauthorized - API key is missing or invalid", response = Error.class),
            @ApiResponse(code = 500, message = "Server error", response = Error.class) })

    @RequestMapping(value = "/orders/{orderId}/articles",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.POST)
    ResponseEntity<Integer> createOrderedArticle(@ApiParam(value = "",required=true ) @PathVariable("orderId") Integer orderId,@ApiParam(value = "OrderedArticle to create"  )  @Valid @RequestBody OrderedArticle order);


    @ApiOperation(value = "Delete OrderedArticle", notes = "", response = Void.class, authorizations = {
            @Authorization(value = "APIKeyHeader")
    }, tags={ "ERP - orderedArticles", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Deleted", response = Void.class),
            @ApiResponse(code = 401, message = "Unauthorized - API key is missing or invalid", response = Error.class),
            @ApiResponse(code = 500, message = "Server error", response = Error.class) })

    @RequestMapping(value = "/orders/{orderId}/articles/{OrderedArticleId}",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteOrderedArticle(@ApiParam(value = "",required=true ) @PathVariable("orderId") Integer orderId,@ApiParam(value = "",required=true ) @PathVariable("OrderedArticleId") Integer orderedArticleId);


    @ApiOperation(value = "Returns article belonging to given order", notes = "", response = OrderedArticle.class, authorizations = {
            @Authorization(value = "APIKeyHeader")
    }, tags={ "ERP - orderedArticles", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "", response = OrderedArticle.class),
            @ApiResponse(code = 401, message = "Unauthorized - API key is missing or invalid", response = Error.class),
            @ApiResponse(code = 500, message = "Server error", response = Error.class) })

    @RequestMapping(value = "/orders/{orderId}/articles/{OrderedArticleId}",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<OrderedArticle> getOrderedArticle(@ApiParam(value = "",required=true ) @PathVariable("orderId") Integer orderId,@ApiParam(value = "",required=true ) @PathVariable("OrderedArticleId") Integer orderedArticleId);


    @ApiOperation(value = "Returns order's article net price", notes = "", response = BigDecimal.class, authorizations = {
            @Authorization(value = "APIKeyHeader")
    }, tags={ "ERP - orderedArticles", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Compute net price of order's article", response = BigDecimal.class),
            @ApiResponse(code = 401, message = "Unauthorized - API key is missing or invalid", response = Error.class),
            @ApiResponse(code = 500, message = "Server error", response = Error.class) })

    @RequestMapping(value = "/orders/{orderId}/articles/{OrderedArticleId}/netPrice",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<BigDecimal> getOrderedArticleNetPrice(@ApiParam(value = "",required=true ) @PathVariable("orderId") Integer orderId,@ApiParam(value = "",required=true ) @PathVariable("OrderedArticleId") Integer orderedArticleId);

    @ApiOperation(value = "Returns order's article weight", notes = "", response = BigDecimal.class, authorizations = {
            @Authorization(value = "APIKeyHeader")
    }, tags={ "ERP - orderedArticles", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Compute weight of order's article", response = BigDecimal.class),
            @ApiResponse(code = 401, message = "Unauthorized - API key is missing or invalid", response = Error.class),
            @ApiResponse(code = 500, message = "Server error", response = Error.class) })

    @RequestMapping(value = "/orders/{orderId}/articles/{OrderedArticleId}/weight",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<Float> getOrderedArticleWeight(@ApiParam(value = "",required=true ) @PathVariable("orderId") Integer orderId,@ApiParam(value = "",required=true ) @PathVariable("OrderedArticleId") Integer orderedArticleId);


    @ApiOperation(value = "Returns articles belonging to given order", notes = "", response = OrderedArticle.class, responseContainer = "List", authorizations = {
            @Authorization(value = "APIKeyHeader")
    }, tags={ "ERP - orderedArticles", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "", response = OrderedArticle.class, responseContainer = "List"),
            @ApiResponse(code = 401, message = "Unauthorized - API key is missing or invalid", response = Error.class),
            @ApiResponse(code = 500, message = "Server error", response = Error.class) })

    @RequestMapping(value = "/orders/{orderId}/articles",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<List<OrderedArticle>> getOrderedArticles(@ApiParam(value = "",required=true ) @PathVariable("orderId") Integer orderId);



    @ApiOperation(value = "Update existing OrderedArticle", notes = "", response = Void.class, authorizations = {
            @Authorization(value = "APIKeyHeader")
    }, tags={ "ERP - orderedArticles", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Updated", response = Void.class),
            @ApiResponse(code = 401, message = "Unauthorized - API key is missing or invalid", response = Error.class),
            @ApiResponse(code = 500, message = "Server error", response = Error.class) })

    @RequestMapping(value = "/orders/{orderId}/articles/{OrderedArticleId}",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.PUT)
    ResponseEntity<Void> updateOrderedArticle(@ApiParam(value = "",required=true ) @PathVariable("orderId") Integer orderId,@ApiParam(value = "",required=true ) @PathVariable("OrderedArticleId") Integer orderedArticleId,@ApiParam(value = "OrderedArticle to create"  )  @Valid @RequestBody OrderedArticle orderedArticle);

}

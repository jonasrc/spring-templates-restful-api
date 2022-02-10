package com.templates.restfulapi.api.v1;

import com.templates.restfulapi.domain.data.BeverageDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * The API for performing beverage-related operations.
 *
 * @author Jonas Castanheira
 */
@Tag(name = "Beverages")
@RequestMapping("/api/v1/beverages")
public interface BeverageApi {

    @GetMapping
    @Operation(summary = "List beverages.", description = "Retrieves a list of beverages. Filterable by whether they are available to be purchased or not. Responds with following info:"
            + "<ul>"
            + "<li>Name;</li>"
            + "<li>Available sizes;</li>"
            + "<li>Price;</li>"
            + "<li>Status;</li>"
            + "<li>Ingredients.</li>"
            + "</ul>")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Beverages found successfully.", content = @Content)
    })
    default ResponseEntity<List<BeverageDto>> list(
            @Parameter(description = "Choose whether or not to list only purchasable beverages.")
            @RequestParam(required = false) Boolean purchasable) {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }

    @PostMapping
    @Operation(summary = "Create a beverage.", description = "Creates a beverage by passing following info:"
            + "<ul>"
            + "<li>Name;</li>"
            + "<li>Price;</li>"
            + "<li>Status (<b>can be either \"purchasable\" or \"unavailable\"</b>);</li>"
            + "</ul>")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Beverage created successfully.", content = @Content),
            @ApiResponse(responseCode = "400", description = "Invalid request.", content = @Content)
    })
    @RequestBody(
            description = "Examples of beverage creation requests.",
            required = true,
            content = @Content(
                    schema = @Schema(implementation = BeverageDto.class),
                    mediaType = MediaType.APPLICATION_JSON_VALUE,
                    examples = {
                            @ExampleObject(
                                    name = "An example request with the minimum required fields to create a purchasable beverage.",
                                    value = "{\"name\": \"Nice Coffee\"," +
                                            "\"price\": 1000," +
                                            "\"status\": \"purchasable\"}",
                                    summary = "Create a purchasable beverage."),
                            @ExampleObject(
                                    name = "An example request with the minimum required fields to create an unavailable beverage.",
                                    value = "{\"name\": \"Good Espresso\"," +
                                            "\"price\": 1400," +
                                            "\"status\": \"unavailable\"}",
                                    summary = "Create an unavailable beverage.")
                    }))
    default ResponseEntity<String> create(BeverageDto beverageDto) {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }
}

package com.example.demo;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.jobrunr.scheduling.JobScheduler;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("test")
public class ProductController {

	private final JobScheduler jobScheduler;
	private final ProductService productService;

	@Operation(summary = "Get Products")
	@ApiResponses(value = {@ApiResponse(responseCode = "200", description = "get Products"),
			@ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(schema = @Schema(hidden = true))),
			@ApiResponse(responseCode = "404", description = "product not found", content = @Content(schema = @Schema(hidden = true))),
			@ApiResponse(responseCode = "500", description = "error while getting the products", content = @Content(schema = @Schema(hidden = true)))})
	@GetMapping
	@Transactional
	public void getProductById() {
		jobScheduler.enqueue(() -> productService.getProducts());
	}
}

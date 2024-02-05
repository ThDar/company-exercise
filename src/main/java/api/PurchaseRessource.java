/*
 * Copyright (C) by Courtanet, All Rights Reserved.
 */
package api;

import java.util.logging.Level;
import java.util.logging.Logger;

import model.Purchase;
import service.PurchaseService;

@Path(StaticPaths.BO_API_INTRANET_ARGUMENTAIRE_FORMULE)
@Produces(APPLICATION_JSON)
public class PurchaseRessource {

    private static final Logger LOG = null;

    private final PurchaseService purchaseService;

    @PATCH
    @Operation(summary = "Update purchase",
            responses = { @ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json",
                    array = @ArraySchema(schema = @Schema(implementation = Purchase.class))),
                    description = "Successful operation") })
    @Consumes(APPLICATION_JSON)
    public Response approvePurchase(Purchase purchase) {
        try {
            if (purchase != null) {
                purchaseService.updatePurchaseStatus(purchase);
                return Response.ok().entity(response).build();
            } else {
                LOG.log(Level.INFO, "Trying to update non-existent purchase : " + purchase.getId());
                return Response.status(NOT_FOUND.getStatusCode(),
                        "purchase not found : " + purchase.getId()).build();
            }
        } catch (Exception e) {
            LOG.log(Level.INFO, e.getMessage());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), e.getMessage()).build();
        }

    }

    @PATCH
    @Operation(summary = "Update purchase",
            responses = { @ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json",
                    array = @ArraySchema(schema = @Schema(implementation = Purchase.class))),
                    description = "Successful operation") })
    @Consumes(APPLICATION_JSON)
    public Response declinePurchase(Purchase purchase) {
        try {
            if (purchase != null) {
                purchaseService.updatePurchaseStatus(purchase);
                return Response.ok().entity(response).build();
            } else {
                LOG.log(Level.INFO, "Trying to update non-existent purchase : " + purchase.getId());
                return Response.status(NOT_FOUND.getStatusCode(),
                        "purchase not found : " + purchase.getId()).build();
            }
        } catch (Exception e) {
            LOG.log(Level.INFO, e.getMessage());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), e.getMessage()).build();
        }

    }

    @POST
    @Operation(summary = "Insert purchase",
            responses = { @ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json",
                    array = @ArraySchema(schema = @Schema(implementation = Purchase.class))),
                    description = "Successful operation") })
    @Consumes(APPLICATION_JSON)
    public Response addNewPurchase(Purchase purchase) {
        try {
            purchaseService.addPurchase(purchase);
            return Response.ok().entity(response).build();
        } catch (Exception e) {
            LOG.log(Level.INFO, e.getMessage());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), e.getMessage()).build();
        }

    }

}

package com.customers.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.servlet.*;
import javax.servlet.http.*;

import com.customers.impl.*;
import com.customers.models.*;
import com.customers.services.*;

import com.customers.models.spacecrafts.*;
@Path("spacecrafts")
public class SpacecraftsResource {

  @Context
  private ServletConfig servletConfig;

  @Context
  private ServletContext servletContext;

  @Context
  private HttpServletRequest servletRequest;

  @Context
  private HttpServletResponse servletResponse;

  @Context
  private UriInfo uriInfo;

  private SpacecraftsService delegate;

  public SpacecraftsResource() {
    this.delegate = new SpacecraftsImplementation();
  }

  /**
   * Read a spacecraft
   *
   * @param spacecraftId The unique identifier of the spacecraft
   */
  @GET
  @Path("/{spacecraftId}")
                        
  @Produces("application/json")
  public Response GetSpacecraftId(@PathParam("spacecraftId") String spacecraftId
) {
    GetSpacecraftIdParams params = new GetSpacecraftIdParams();
    params.setSpacecraftId(spacecraftId);

    return delegate.GetSpacecraftId(params);
  }
}    
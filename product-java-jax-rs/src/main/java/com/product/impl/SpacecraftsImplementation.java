package com.product.impl;


import javax.ws.rs.core.Response;
import com.product.models.*;
import com.product.resources.SpacecraftsResource;
import com.product.services.SpacecraftsService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

    import com.product.models.spacecrafts.*;
public class SpacecraftsImplementation implements SpacecraftsService {
// Implement your logic here

    
  /**
   * Read a spacecraft
   *
   * @param spacecraftId The unique identifier of the spacecraft
   */
  @Override
  public Response GetSpacecraftId(GetSpacecraftIdParams params) {
    // Your code here


    return Response.status(200).build();                                                                 
  }        }




    
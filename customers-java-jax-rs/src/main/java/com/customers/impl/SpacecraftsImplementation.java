package com.customers.impl;


import javax.ws.rs.core.Response;
import com.customers.models.*;
import com.customers.resources.SpacecraftsResource;
import com.customers.services.SpacecraftsService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

    import com.customers.models.spacecrafts.*;
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




    
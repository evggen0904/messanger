package com.mycompany.exception;


import com.mycompany.model.ErrorMessage;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFountException>{

    @Override
    public Response toResponse(DataNotFountException e) {

        ErrorMessage errorMessage = new ErrorMessage(e.getMessage(),404, "http://ffffff.com");
        return Response.status(Response.Status.NOT_FOUND)
                .entity(errorMessage)
                .build();
    }
}

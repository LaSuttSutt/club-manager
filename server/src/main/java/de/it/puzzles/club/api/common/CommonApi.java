package de.it.puzzles.club.api.common;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("common")
public class CommonApi {

    //region #Public Methods
    @GET
    @Path("/{text}")
    public String apiTest(@PathParam("text") String text) {

        return "API: " + text;
    }
    //endregion #Public Methods
}

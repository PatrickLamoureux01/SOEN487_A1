package com.example.a1.Service;
import com.example.a1.Core.Artists;
import com.example.a1.Implementation.Artist;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;


@Path("artists")
public class ArtistsREST {

    private static Artists artists = new Artists();

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public ArrayList<Artist> getArtists() {return artists; }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("{nick}")
    public Artist getArtists(@PathParam("nick") String nick) {
        return artists.stream().filter(artist1 -> artist1.getNickname().equals(nick)).findFirst().orElse(null);
    }

    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    public void createArtist(Artist artist) {
        artists.add(new Artist(artist));
    }

}

package com.mok.maven.mega;

/**
 * from http://www.baeldung.com/spark-framework-rest-api
 *
 */
import static spark.Spark.*;

import com.google.gson.Gson;
public class App 
{
    public static void main(String[] args) {
    	post("/hash", (request, response) -> {
    	    response.type("application/json");
    	    Hash hash = new Gson().fromJson(request.body(), Hash.class);
    	    return {"hash":hash.getCodedHash()};
    	});  
    }	
}

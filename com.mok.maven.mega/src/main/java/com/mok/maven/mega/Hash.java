package com.mok.maven.mega;

public class Hash {
	private String hash;
	
    public Hash(String hash) {
        super();
        this.hash = hash;
    }
    
    public void setHash(String hash) {
        this.hash = hash;
    }


    public String getHash() {
        return this.hash;
    }
	     
    public String getCodedHash() {
    	return new Hashing.sha256()
    			  .hashString(this.hash, StandardCharsets.UTF_8)
    			  .toString();
    	const crypto = require('crypto');
    	var hash = crypto.createHash('sha256');
    }
    	
    }
	    
	
}

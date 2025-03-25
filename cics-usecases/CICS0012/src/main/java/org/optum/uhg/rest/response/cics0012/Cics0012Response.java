package org.optum.uhg.rest.response.cics0012;

import java.util.List;
import java.util.ArrayList;

import com.cloudframe.app.rest.Metadata;
import org.optum.uhg.rest.cics0012.Dfhcommarea;

public class Cics0012Response {
	
	private Metadata metadata;

    private Dfhcommarea responseCommarea ;
    private String responseCommareaAsBlob;
	/**
     * @return the metadata
     */
    public Metadata getMetadata() {
    	return metadata;
    }

    /**
     * @param metadata the metadata to set
     */
    public void setMetadata(Metadata metadata) {
    	this.metadata = metadata;
    }
    /**
     * @return the responseCommarea
     */
    public Dfhcommarea getResponseCommarea() {
       return responseCommarea;
    }

    /**
     * @param responseCommarea the responseCommarea to set
     */
    public void setResponseCommarea(Dfhcommarea responseCommarea) {
       this.responseCommarea = responseCommarea;
    }

    /**
     * @return the requestCommareaAsBlob
     */
    public String getResponseCommareaAsBlob() {
        return responseCommareaAsBlob;
    }

    /**
     * @param responseCommareaAsBlob the responseCommareaAsBlob to set
     */
    public void setResponseCommareaAsBlob(String responseCommareaAsBlob) {
       this.responseCommareaAsBlob = responseCommareaAsBlob;
    }
}

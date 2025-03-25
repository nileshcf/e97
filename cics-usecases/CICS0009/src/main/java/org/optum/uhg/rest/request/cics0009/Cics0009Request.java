package org.optum.uhg.rest.request.cics0009;

import java.util.List;
import java.util.ArrayList;
import io.swagger.v3.oas.annotations.media.Schema;


import com.cloudframe.app.rest.Metadata;


public class Cics0009Request {
	
	private Metadata metadata ;


	private LsDfhcommarea lsDfhcommarea = new LsDfhcommarea();
	@Schema(description = "Default value is empty", defaultValue = " ")
	private String lsDfhcommareaAsBlob;

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
	 * @return the lsDfhcommarea
	 */
	public LsDfhcommarea getLsDfhcommarea() {
		return lsDfhcommarea;
	}

	/**
	 * @param lsDfhcommarea the lsDfhcommarea to set
	 */
	public void setLsDfhcommarea(LsDfhcommarea lsDfhcommarea) {
		this.lsDfhcommarea = lsDfhcommarea;
	}

	/**
     * @return the lsDfhcommareaAsBlob
     */
    public String getLsDfhcommareaAsBlob() {
         return lsDfhcommareaAsBlob;
    }

	/**
     * @param lsDfhcommareaAsBlob the lsDfhcommareaAsBlob to set
     */
    public void setLsDfhcommareaAsBlob(String lsDfhcommareaAsBlob) {
    	 this.lsDfhcommareaAsBlob = lsDfhcommareaAsBlob;
    }

}


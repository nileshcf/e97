package org.optum.uhg.rest.request.d5427dt1;

import java.util.List;
import java.util.ArrayList;
import io.swagger.v3.oas.annotations.media.Schema;


import com.cloudframe.app.rest.Metadata;


public class D5427dt1Request {
	
	private Metadata metadata ;


	private Dt1ReqContainer dt1ReqContainer = new Dt1ReqContainer();
	@Schema(description = "Default value is empty", defaultValue = " ")
	private String dt1ReqContainerAsBlob;

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
	 * @return the dt1ReqContainer
	 */
	public Dt1ReqContainer getDt1ReqContainer() {
		return dt1ReqContainer;
	}

	/**
	 * @param dt1ReqContainer the dt1ReqContainer to set
	 */
	public void setDt1ReqContainer(Dt1ReqContainer dt1ReqContainer) {
		this.dt1ReqContainer = dt1ReqContainer;
	}

	/**
     * @return the dt1ReqContainerAsBlob
     */
    public String getDt1ReqContainerAsBlob() {
         return dt1ReqContainerAsBlob;
    }

	/**
     * @param dt1ReqContainerAsBlob the dt1ReqContainerAsBlob to set
     */
    public void setDt1ReqContainerAsBlob(String dt1ReqContainerAsBlob) {
    	 this.dt1ReqContainerAsBlob = dt1ReqContainerAsBlob;
    }

}


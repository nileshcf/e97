package org.optum.uhg.rest.request.cics0010;

import java.util.List;
import java.util.ArrayList;
import io.swagger.v3.oas.annotations.media.Schema;


import com.cloudframe.app.rest.Metadata;


public class Cics0010Request {
	
	private Metadata metadata ;


	private LsDfhcommarea lsDfhcommarea = new LsDfhcommarea();
	@Schema(description = "Default value is empty", defaultValue = " ")
	private String lsDfhcommareaAsBlob;
    private String requestData002;
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String requestData002AsBlob;
    private String ls003RequestData;
    @Schema(description = "Default value is empty", defaultValue = " ")
    private String ls003RequestDataAsBlob;

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
	/**
	 * @return the requestData002
	 */
	public String getRequestData002() {
		return requestData002;
	}

	/**
	 * @param requestData002 the requestData002 to set
	 */
	public void setRequestData002(String requestData002) {
		this.requestData002 = requestData002;
	}

	/**
     * @return the requestData002AsBlob
     */
    public String getRequestData002AsBlob() {
        return requestData002AsBlob;
    }

    /**
     * @param requestData002AsBlob the requestData002AsBlob to set
     */
    public void setRequestData002AsBlob(String requestData002AsBlob) {
       this.requestData002AsBlob = requestData002AsBlob;
    }
	/**
	 * @return the ls003RequestData
	 */
	public String getLs003RequestData() {
		return ls003RequestData;
	}

	/**
	 * @param ls003RequestData the ls003RequestData to set
	 */
	public void setLs003RequestData(String ls003RequestData) {
		this.ls003RequestData = ls003RequestData;
	}

	/**
     * @return the ls003RequestDataAsBlob
     */
    public String getLs003RequestDataAsBlob() {
        return ls003RequestDataAsBlob;
    }

    /**
     * @param ls003RequestDataAsBlob the ls003RequestDataAsBlob to set
     */
    public void setLs003RequestDataAsBlob(String ls003RequestDataAsBlob) {
       this.ls003RequestDataAsBlob = ls003RequestDataAsBlob;
    }

}


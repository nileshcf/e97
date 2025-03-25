package org.optum.uhg.rest.response.cics0009;

import java.util.List;
import java.util.ArrayList;


import com.cloudframe.app.rest.Metadata;


public class Cics0009Response {
	
	private Metadata metadata;


	private LsDfhcommarea lsDfhcommarea;
	private String lsDfhcommareaAsBlob;
	private String lsRequestData;
	private String lsRequestDataAsBlob;
	private String requestData002;
	private String requestData002AsBlob;
	private String ls003RequestData;
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
	 * @return the lsRequestData
	 */
	public String getLsRequestData() {
		return lsRequestData;
	}

	/**
	 * @param lsRequestData the lsRequestData to set
	 */
	public void setLsRequestData(String lsRequestData) {
		this.lsRequestData = lsRequestData;
	}

	/**
     * @return the lsRequestDataAsBlob
     */
    public String getLsRequestDataAsBlob() {
        return lsRequestDataAsBlob;
    }

    /**
     * @param lsRequestDataAsBlob the lsRequestDataAsBlob to set
    */
    public void setLsRequestDataAsBlob(String lsRequestDataAsBlob) {
        this.lsRequestDataAsBlob = lsRequestDataAsBlob;
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

package org.optum.uhg.rest.response.d5427dt1;

import java.util.List;
import java.util.ArrayList;


import com.cloudframe.app.rest.Metadata;


public class D5427dt1Response {
	
	private Metadata metadata;


	private Dt1SrtContainer dt1SrtContainer;
	private String dt1SrtContainerAsBlob;
	private Dt1ClmContainer dt1ClmContainer;
	private String dt1ClmContainerAsBlob;
	private Dt1RspContainer dt1RspContainer;
	private String dt1RspContainerAsBlob;
	private StsContainer stsContainer;
	private String stsContainerAsBlob;

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
	 * @return the dt1SrtContainer
	 */
	public Dt1SrtContainer getDt1SrtContainer() {
		return dt1SrtContainer;
	}

	/**
	 * @param dt1SrtContainer the dt1SrtContainer to set
	 */
	public void setDt1SrtContainer(Dt1SrtContainer dt1SrtContainer) {
		this.dt1SrtContainer = dt1SrtContainer;
	}

	/**
     * @return the dt1SrtContainerAsBlob
     */
    public String getDt1SrtContainerAsBlob() {
        return dt1SrtContainerAsBlob;
    }

    /**
     * @param dt1SrtContainerAsBlob the dt1SrtContainerAsBlob to set
     */
    public void setDt1SrtContainerAsBlob(String dt1SrtContainerAsBlob) {
        this.dt1SrtContainerAsBlob = dt1SrtContainerAsBlob;
    }
	/**
	 * @return the dt1ClmContainer
	 */
	public Dt1ClmContainer getDt1ClmContainer() {
		return dt1ClmContainer;
	}

	/**
	 * @param dt1ClmContainer the dt1ClmContainer to set
	 */
	public void setDt1ClmContainer(Dt1ClmContainer dt1ClmContainer) {
		this.dt1ClmContainer = dt1ClmContainer;
	}

	/**
     * @return the dt1ClmContainerAsBlob
     */
    public String getDt1ClmContainerAsBlob() {
        return dt1ClmContainerAsBlob;
    }

    /**
     * @param dt1ClmContainerAsBlob the dt1ClmContainerAsBlob to set
     */
    public void setDt1ClmContainerAsBlob(String dt1ClmContainerAsBlob) {
        this.dt1ClmContainerAsBlob = dt1ClmContainerAsBlob;
    }
	/**
	 * @return the dt1RspContainer
	 */
	public Dt1RspContainer getDt1RspContainer() {
		return dt1RspContainer;
	}

	/**
	 * @param dt1RspContainer the dt1RspContainer to set
	 */
	public void setDt1RspContainer(Dt1RspContainer dt1RspContainer) {
		this.dt1RspContainer = dt1RspContainer;
	}

	/**
     * @return the dt1RspContainerAsBlob
     */
    public String getDt1RspContainerAsBlob() {
        return dt1RspContainerAsBlob;
    }

    /**
     * @param dt1RspContainerAsBlob the dt1RspContainerAsBlob to set
     */
    public void setDt1RspContainerAsBlob(String dt1RspContainerAsBlob) {
        this.dt1RspContainerAsBlob = dt1RspContainerAsBlob;
    }
	/**
	 * @return the stsContainer
	 */
	public StsContainer getStsContainer() {
		return stsContainer;
	}

	/**
	 * @param stsContainer the stsContainer to set
	 */
	public void setStsContainer(StsContainer stsContainer) {
		this.stsContainer = stsContainer;
	}

	/**
     * @return the stsContainerAsBlob
     */
    public String getStsContainerAsBlob() {
        return stsContainerAsBlob;
    }

    /**
     * @param stsContainerAsBlob the stsContainerAsBlob to set
     */
    public void setStsContainerAsBlob(String stsContainerAsBlob) {
        this.stsContainerAsBlob = stsContainerAsBlob;
    }
}

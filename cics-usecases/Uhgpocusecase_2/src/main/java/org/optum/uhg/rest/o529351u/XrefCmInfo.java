package org.optum.uhg.rest.o529351u;

/**
 *  The class XrefCmInfo is used to handle fields declared in it
 *  @author CloudFrame Inc.
 *  created on 2024-11-20 at 23:06.
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Size;

public class XrefCmInfo {

    protected Logger logger = LoggerFactory.getLogger(XrefCmInfo.class);

    /*  Child Field declaration */
    @JsonProperty("xrfCmInfo")
    private XrfCmInfo xrfCmInfo = new XrfCmInfo();

    /*  End of Field declaration */
    /**
     * 	Returns the value of xrfCmInfo
     * 	@return xrfCmInfo
     */
    public XrfCmInfo getXrfCmInfo() {
        return xrfCmInfo;
    }

    // *** setGroup.txt starts
    /**
     *  	Update XrfCmInfo with the passed value
     * 	@param value
     */
    @JsonIgnore
public void setXrfCmInfo(org.optum.uhg.dto.o529351u.XrfCmInfo value) throws CFException {
        xrfCmInfo.populateFrom(value);
    }

    /**
     *  	Update XrfCmInfo with the passed value
     * 	@param value
     */
    public void setXrfCmInfo(XrfCmInfo value) {
        xrfCmInfo = value;
    }

    // *** setGroup.txt ends
    @JsonIgnore
public void setXrefCmInfo(org.optum.uhg.dto.o529351u.XrefCmInfo xrefCmInfo) throws CFException {
        xrfCmInfo.setXrfCmInfo(xrefCmInfo.getXrfCmInfo());
    }

    @JsonIgnore
public void populateFrom(org.optum.uhg.dto.o529351u.XrefCmInfo xrefCmInfo) throws CFException {
        xrfCmInfo.populateFrom(xrefCmInfo.getXrfCmInfo());
    }
}

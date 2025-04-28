package com.cloudframe.app.o529351u.rest;

/**
*  The class XrfRpData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:54.
**/
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;

public class XrfRpData { 	
   protected Logger logger = LoggerFactory.getLogger(XrfRpData.class);

   /*  Child Field declaration */
                  private String xrfPlcyRp = "";
                          private short xrfDivRp;
                          private short xrfClsRp;
                  private String xrfSuffRp = "";
   /*  End of Field declaration */
	
	
   
	/**
	 *	Returns the value of xrfPlcyRp
	 *	@return xrfPlcyRp
	 */
   public String getXrfPlcyRp() {           
   		return xrfPlcyRp;
   }

  
	/**
	*  set variable xrfPlcyRp
	*  @param value
	**/
   public void setXrfPlcyRp(String value) {
	xrfPlcyRp = value.trim(); 
   }   
	/**
	 *	Returns the value of xrfDivRp
	 *	@return xrfDivRp
	 */
	public short getXrfDivRp() {               
   		return xrfDivRp;
	}
	
	/**
	 * 	Updates XrfDivRp with the value
	 *	@param number
	 */
	public void setXrfDivRp(short number) {
	    xrfDivRp = number; 
    }
	/**
	 *	Returns the value of xrfClsRp
	 *	@return xrfClsRp
	 */
	public short getXrfClsRp() {               
   		return xrfClsRp;
	}
	
	/**
	 * 	Updates XrfClsRp with the value
	 *	@param number
	 */
	public void setXrfClsRp(short number) {
	    xrfClsRp = number; 
    }
	/**
	 *	Returns the value of xrfSuffRp
	 *	@return xrfSuffRp
	 */
   public String getXrfSuffRp() {           
   		return xrfSuffRp;
   }

  
	/**
	*  set variable xrfSuffRp
	*  @param value
	**/
   public void setXrfSuffRp(String value) {
	xrfSuffRp = value.trim(); 
   }   
 @JsonIgnore
 public void setXrfRpData(com.cloudframe.app.o529351u.dto.XrfRpData xrfRpData)  throws CFException{
            if (xrfPlcyRp != null && !xrfPlcyRp.isEmpty()) {
                xrfRpData.setXrfPlcyRp(xrfPlcyRp.toCharArray());
            }
	xrfRpData.setXrfDivRp(xrfDivRp);
	xrfRpData.setXrfClsRp(xrfClsRp);
            if (xrfSuffRp != null && !xrfSuffRp.isEmpty()) {
                xrfRpData.setXrfSuffRp(xrfSuffRp.toCharArray());
            }
 }
 
 @JsonIgnore
  public void populateFrom(com.cloudframe.app.o529351u.dto.XrfRpData xrfRpData)  throws CFException {
            setXrfPlcyRp(String.valueOf(xrfRpData.getXrfPlcyRp()));
         setXrfDivRp(xrfRpData.getXrfDivRp());
         setXrfClsRp(xrfRpData.getXrfClsRp());
            setXrfSuffRp(String.valueOf(xrfRpData.getXrfSuffRp()));
  }

}
  

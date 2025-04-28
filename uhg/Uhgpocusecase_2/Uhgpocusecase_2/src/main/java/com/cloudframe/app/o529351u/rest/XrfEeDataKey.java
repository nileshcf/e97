package com.cloudframe.app.o529351u.rest;

/**
*  The class XrfEeDataKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:58.
**/
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;

public class XrfEeDataKey { 	
   protected Logger logger = LoggerFactory.getLogger(XrfEeDataKey.class);

   /*  Child Field declaration */
                          private int xrfMvdEe;
                  private String xrfPlcyEe = "";
                          private short xrfDivEe;
                          private short xrfClsEe;
   /*  End of Field declaration */
	
	
   
	/**
	 *	Returns the value of xrfMvdEe
	 *	@return xrfMvdEe
	 */
	public int getXrfMvdEe() {
   		return xrfMvdEe;
	} 
	/**
	 * 	Updates XrfMvdEe with the value
	 *	@param number
	 */
	public void setXrfMvdEe(int number) {
	    xrfMvdEe = number; 
    }
	/**
	 *	Returns the value of xrfPlcyEe
	 *	@return xrfPlcyEe
	 */
   public String getXrfPlcyEe() {           
   		return xrfPlcyEe;
   }

  
	/**
	*  set variable xrfPlcyEe
	*  @param value
	**/
   public void setXrfPlcyEe(String value) {
	xrfPlcyEe = value.trim(); 
   }   
	/**
	 *	Returns the value of xrfDivEe
	 *	@return xrfDivEe
	 */
	public short getXrfDivEe() {               
   		return xrfDivEe;
	}
	
	/**
	 * 	Updates XrfDivEe with the value
	 *	@param number
	 */
	public void setXrfDivEe(short number) {
	    xrfDivEe = number; 
    }
	/**
	 *	Returns the value of xrfClsEe
	 *	@return xrfClsEe
	 */
	public short getXrfClsEe() {               
   		return xrfClsEe;
	}
	
	/**
	 * 	Updates XrfClsEe with the value
	 *	@param number
	 */
	public void setXrfClsEe(short number) {
	    xrfClsEe = number; 
    }
 @JsonIgnore
 public void setXrfEeDataKey(com.cloudframe.app.o529351u.dto.XrfEeDataKey xrfEeDataKey)  throws CFException{
	xrfEeDataKey.setXrfMvdEe(xrfMvdEe);
            if (xrfPlcyEe != null && !xrfPlcyEe.isEmpty()) {
                xrfEeDataKey.setXrfPlcyEe(xrfPlcyEe.toCharArray());
            }
	xrfEeDataKey.setXrfDivEe(xrfDivEe);
	xrfEeDataKey.setXrfClsEe(xrfClsEe);
 }
 
 @JsonIgnore
  public void populateFrom(com.cloudframe.app.o529351u.dto.XrfEeDataKey xrfEeDataKey)  throws CFException {
         setXrfMvdEe(xrfEeDataKey.getXrfMvdEe());
            setXrfPlcyEe(String.valueOf(xrfEeDataKey.getXrfPlcyEe()));
         setXrfDivEe(xrfEeDataKey.getXrfDivEe());
         setXrfClsEe(xrfEeDataKey.getXrfClsEe());
  }

}
  

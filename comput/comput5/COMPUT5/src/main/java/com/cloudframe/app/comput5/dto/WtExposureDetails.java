package com.cloudframe.app.comput5.dto;

/**
*  The class WtExposureDetails is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:09. using version 5.0.0.254
**/


import com.cloudframe.app.comput5.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class WtExposureDetails extends WtExposureDetailsSerialized { 
   

								private BigDecimal wtExposure = BigDecimal.ZERO;
	
	/**
	* Constructor for WtExposureDetails
	**/
    public WtExposureDetails() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WtExposureDetails. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WtExposureDetails(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	public BigDecimal getWtExposure() throws CFException {
        if (isWtExposureModified()) { 
           wtExposure = refreshWtExposure();
        }
   		return wtExposure;
	}

    public char[] getWtExposureString() {
          return  wtExposureString();
    }
	
	/**
	 * 	Update WtExposure with the passed number
	 *  Corresponding COBOL Variable is WT-EXPOSURE
	 *	@param number
	 */
	public void setWtExposure(BigDecimal number) {	
     wtExposure = checkWtExposureMaxLimit(number);
	    serializeWtExposure(wtExposure);
   }

	
	
	

		public static int getWtExposureDetailsFieldLength() {
			return WT_EXPOSURE_DETAILS_LENGTH;
		}

}
  

package com.cloudframe.app.init1.dto;

/**
*  The class WvExtrRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:13. using version 5.0.0.257
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WvExtrRecord extends WvExtrRecordSerialized {
   
				private WvExtrDetails wvExtrDetails = new WvExtrDetails();
	
	/**
	* Constructor for WvExtrRecord
	**/
    public WvExtrRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wvExtrDetails.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wvExtrDetails
	 *	@return wvExtrDetails
	 */   
	 public WvExtrDetails getWvExtrDetails() {
   	return wvExtrDetails;
   }
   /**
	* 	Update WvExtrDetails with the passed value
	*   Corresponding COBOL Variable is WV-EXTR-DETAILS
	*	@param value
	*/
   public void setWvExtrDetails(char[] value) {
      wvExtrDetails.setString(value); 
   }   
    
     /**
	 * 	Update WvExtrDetails 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWvExtrDetails(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrDetails.begin,wvExtrDetails.length());
   }
   
     /**
	 * 	Update WvExtrDetails 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrDetails(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrDetails.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WvExtrDetails with another Field
	 *	@param value
	 */
   public void setWvExtrDetails(Field source) {
   	replace(source,0,source.length(),wvExtrDetails.begin,wvExtrDetails.length());
   }  
   
     /**
	 * 	Update WvExtrDetails 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWvExtrDetails(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrDetails.begin,wvExtrDetails.length());
   }
   
     /**
	 * 	Update WvExtrDetails 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrDetails(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrDetails.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes WvExtrRecord
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          wvExtrDetails.initialize();
     
   }

		public static int getWvExtrRecordFieldLength() {
			return WV_EXTR_RECORD_LENGTH;
		}

}
  

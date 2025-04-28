package com.cloudframe.app.ip829010.dto;

/**
*  The class FnsPayloadFacDataKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:02. using version 5.0.0.256
**/


import com.cloudframe.app.ip829010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class FnsPayloadFacDataKey extends FnsPayloadFacDataKeySerialized { 
   

						private char[] fnsPayloadPrimaryAcctNbr = Field.fillLowValue(19);
				private FnsPayloadExpirationDate fnsPayloadExpirationDate = new FnsPayloadExpirationDate();
	
	/**
	* Constructor for FnsPayloadFacDataKey
	**/
    public FnsPayloadFacDataKey() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for FnsPayloadFacDataKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FnsPayloadFacDataKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			fnsPayloadExpirationDate.setParent(this,getStartOffset() + 19);
    } 

	/**
	 *	Returns the value of fnsPayloadPrimaryAcctNbr
	 *	@return fnsPayloadPrimaryAcctNbr
	 */
   public char[] getFnsPayloadPrimaryAcctNbr() throws CFException{
     if (isFnsPayloadPrimaryAcctNbrModified()) { 
        fnsPayloadPrimaryAcctNbr = refreshFnsPayloadPrimaryAcctNbr();
     }
   		return fnsPayloadPrimaryAcctNbr;
   }

  
	/**
	*  set variable fnsPayloadPrimaryAcctNbr
	*  Corresponding COBOL Variable is FNS-PAYLOAD-PRIMARY-ACCT-NBR
	*  @param value
	**/
   public void setFnsPayloadPrimaryAcctNbr(char[] value) {
      fnsPayloadPrimaryAcctNbr = checkFnsPayloadPrimaryAcctNbrConstraints(value);
      serializeFnsPayloadPrimaryAcctNbr(fnsPayloadPrimaryAcctNbr);
   } 

     /**
	 * 	Update FnsPayloadPrimaryAcctNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPayloadPrimaryAcctNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFnsPayloadPrimaryAcctNbr,fnsPayloadPrimaryAcctNbr.length);
   	
   }
   
   public void setFnsPayloadPrimaryAcctNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadPrimaryAcctNbr,fnsPayloadPrimaryAcctNbr.length);
   	
   }
   
     /**
	 * 	Update FnsPayloadPrimaryAcctNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadPrimaryAcctNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadPrimaryAcctNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FnsPayloadPrimaryAcctNbr with another Field
	 *	@param value
	 */
   public void setFnsPayloadPrimaryAcctNbr(Field source) {
       replace(source,0,source.length(),beginFnsPayloadPrimaryAcctNbr,FNS_PAYLOAD_PRIMARY_ACCT_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update FnsPayloadPrimaryAcctNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPayloadPrimaryAcctNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFnsPayloadPrimaryAcctNbr,FNS_PAYLOAD_PRIMARY_ACCT_NBR_LEN);
   	
   }
   
     /**
	 * 	Update FnsPayloadPrimaryAcctNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadPrimaryAcctNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadPrimaryAcctNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fnsPayloadExpirationDate
	 *	@return fnsPayloadExpirationDate
	 */   
	 public FnsPayloadExpirationDate getFnsPayloadExpirationDate() {
   	return fnsPayloadExpirationDate;
   }
   /**
	* 	Update FnsPayloadExpirationDate with the passed value
	*   Corresponding COBOL Variable is FNS-PAYLOAD-EXPIRATION-DATE
	*	@param value
	*/
   public void setFnsPayloadExpirationDate(char[] value) {
      fnsPayloadExpirationDate.setString(value); 
   }   
    
     /**
	 * 	Update FnsPayloadExpirationDate 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setFnsPayloadExpirationDate(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,fnsPayloadExpirationDate.begin,fnsPayloadExpirationDate.length());
   }
   
     /**
	 * 	Update FnsPayloadExpirationDate 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadExpirationDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,fnsPayloadExpirationDate.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update FnsPayloadExpirationDate with another Field
	 *	@param value
	 */
   public void setFnsPayloadExpirationDate(Field source) {
   	replace(source,0,source.length(),fnsPayloadExpirationDate.begin,fnsPayloadExpirationDate.length());
   }  
   
     /**
	 * 	Update FnsPayloadExpirationDate 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setFnsPayloadExpirationDate(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,fnsPayloadExpirationDate.begin,fnsPayloadExpirationDate.length());
   }
   
     /**
	 * 	Update FnsPayloadExpirationDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadExpirationDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,fnsPayloadExpirationDate.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes FnsPayloadFacDataKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFnsPayloadPrimaryAcctNbr(CONSTANTS.SPACE_19);
          fnsPayloadExpirationDate.initialize();
     
   }

		public static int getFnsPayloadFacDataKeyFieldLength() {
			return FNS_PAYLOAD_FAC_DATA_KEY_LENGTH;
		}

}
  

package com.cloudframe.app.ip829010.dto;

/**
*  The class Ip82921FacDataKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:07. using version 5.0.0.254
**/


import com.cloudframe.app.ip829010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip82921FacDataKey extends Ip82921FacDataKeySerialized { 
   

						private char[] ip82921PrimaryAcctNbr = Field.fillLowValue(19);
				private Ip82921ExpirationDate ip82921ExpirationDate = new Ip82921ExpirationDate();
	
	/**
	* Constructor for Ip82921FacDataKey
	**/
    public Ip82921FacDataKey() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip82921FacDataKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip82921FacDataKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip82921ExpirationDate.setParent(this,getStartOffset() + 19);
    } 

	/**
	 *	Returns the value of ip82921PrimaryAcctNbr
	 *	@return ip82921PrimaryAcctNbr
	 */
   public char[] getIp82921PrimaryAcctNbr() throws CFException{
     if (isIp82921PrimaryAcctNbrModified()) { 
        ip82921PrimaryAcctNbr = refreshIp82921PrimaryAcctNbr();
     }
   		return ip82921PrimaryAcctNbr;
   }

  
	/**
	*  set variable ip82921PrimaryAcctNbr
	*  Corresponding COBOL Variable is IP82921-PRIMARY-ACCT-NBR
	*  @param value
	**/
   public void setIp82921PrimaryAcctNbr(char[] value) {
      ip82921PrimaryAcctNbr = checkIp82921PrimaryAcctNbrConstraints(value);
      serializeIp82921PrimaryAcctNbr(ip82921PrimaryAcctNbr);
   } 

     /**
	 * 	Update Ip82921PrimaryAcctNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp82921PrimaryAcctNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp82921PrimaryAcctNbr,ip82921PrimaryAcctNbr.length);
   	
   }
   
   public void setIp82921PrimaryAcctNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921PrimaryAcctNbr,ip82921PrimaryAcctNbr.length);
   	
   }
   
     /**
	 * 	Update Ip82921PrimaryAcctNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp82921PrimaryAcctNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921PrimaryAcctNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip82921PrimaryAcctNbr with another Field
	 *	@param value
	 */
   public void setIp82921PrimaryAcctNbr(Field source) {
       replace(source,0,source.length(),beginIp82921PrimaryAcctNbr,IP_82921_PRIMARY_ACCT_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Ip82921PrimaryAcctNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp82921PrimaryAcctNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp82921PrimaryAcctNbr,IP_82921_PRIMARY_ACCT_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Ip82921PrimaryAcctNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp82921PrimaryAcctNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921PrimaryAcctNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip82921ExpirationDate
	 *	@return ip82921ExpirationDate
	 */   
	 public Ip82921ExpirationDate getIp82921ExpirationDate() {
   	return ip82921ExpirationDate;
   }
   /**
	* 	Update Ip82921ExpirationDate with the passed value
	*   Corresponding COBOL Variable is IP82921-EXPIRATION-DATE
	*	@param value
	*/
   public void setIp82921ExpirationDate(char[] value) {
      ip82921ExpirationDate.setString(value); 
   }   
    
     /**
	 * 	Update Ip82921ExpirationDate 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp82921ExpirationDate(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip82921ExpirationDate.begin,ip82921ExpirationDate.length());
   }
   
     /**
	 * 	Update Ip82921ExpirationDate 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp82921ExpirationDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip82921ExpirationDate.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip82921ExpirationDate with another Field
	 *	@param value
	 */
   public void setIp82921ExpirationDate(Field source) {
   	replace(source,0,source.length(),ip82921ExpirationDate.begin,ip82921ExpirationDate.length());
   }  
   
     /**
	 * 	Update Ip82921ExpirationDate 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp82921ExpirationDate(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip82921ExpirationDate.begin,ip82921ExpirationDate.length());
   }
   
     /**
	 * 	Update Ip82921ExpirationDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp82921ExpirationDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip82921ExpirationDate.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip82921FacDataKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp82921PrimaryAcctNbr(CONSTANTS.SPACE_19);
          ip82921ExpirationDate.initialize();
     
   }

		public static int getIp82921FacDataKeyFieldLength() {
			return IP_82921_FAC_DATA_KEY_LENGTH;
		}

}
  

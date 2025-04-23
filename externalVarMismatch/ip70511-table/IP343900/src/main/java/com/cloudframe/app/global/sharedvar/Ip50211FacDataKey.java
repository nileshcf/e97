package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50211FacDataKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:07. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip50211FacDataKey extends Ip50211FacDataKeySerialized { 
   

						private char[] ip50211PrimaryAcctNbr = Field.fillLowValue(19);
				private Ip50211ExpirationDate ip50211ExpirationDate = new Ip50211ExpirationDate();
	
	/**
	* Constructor for Ip50211FacDataKey
	**/
    public Ip50211FacDataKey() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip50211FacDataKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50211FacDataKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip50211ExpirationDate.setParent(this,getStartOffset() + 19);
    } 

	/**
	 *	Returns the value of ip50211PrimaryAcctNbr
	 *	@return ip50211PrimaryAcctNbr
	 */
   public char[] getIp50211PrimaryAcctNbr() throws CFException{
     if (isIp50211PrimaryAcctNbrModified()) { 
        ip50211PrimaryAcctNbr = refreshIp50211PrimaryAcctNbr();
     }
   		return ip50211PrimaryAcctNbr;
   }

  
	/**
	*  set variable ip50211PrimaryAcctNbr
	*  Corresponding COBOL Variable is IP50211-PRIMARY-ACCT-NBR
	*  @param value
	**/
   public void setIp50211PrimaryAcctNbr(char[] value) {
      ip50211PrimaryAcctNbr = checkIp50211PrimaryAcctNbrConstraints(value);
      serializeIp50211PrimaryAcctNbr(ip50211PrimaryAcctNbr);
   } 

     /**
	 * 	Update Ip50211PrimaryAcctNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50211PrimaryAcctNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50211PrimaryAcctNbr,ip50211PrimaryAcctNbr.length);
   	
   }
   
   public void setIp50211PrimaryAcctNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211PrimaryAcctNbr,ip50211PrimaryAcctNbr.length);
   	
   }
   
     /**
	 * 	Update Ip50211PrimaryAcctNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50211PrimaryAcctNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211PrimaryAcctNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50211PrimaryAcctNbr with another Field
	 *	@param value
	 */
   public void setIp50211PrimaryAcctNbr(Field source) {
       replace(source,0,source.length(),beginIp50211PrimaryAcctNbr,IP_50211_PRIMARY_ACCT_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50211PrimaryAcctNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50211PrimaryAcctNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50211PrimaryAcctNbr,IP_50211_PRIMARY_ACCT_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Ip50211PrimaryAcctNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50211PrimaryAcctNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211PrimaryAcctNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip50211ExpirationDate
	 *	@return ip50211ExpirationDate
	 */   
	 public Ip50211ExpirationDate getIp50211ExpirationDate() {
   	return ip50211ExpirationDate;
   }
   /**
	* 	Update Ip50211ExpirationDate with the passed value
	*   Corresponding COBOL Variable is IP50211-EXPIRATION-DATE
	*	@param value
	*/
   public void setIp50211ExpirationDate(char[] value) {
      ip50211ExpirationDate.setString(value); 
   }   
    
     /**
	 * 	Update Ip50211ExpirationDate 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp50211ExpirationDate(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip50211ExpirationDate.begin,ip50211ExpirationDate.length());
   }
   
     /**
	 * 	Update Ip50211ExpirationDate 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50211ExpirationDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip50211ExpirationDate.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip50211ExpirationDate with another Field
	 *	@param value
	 */
   public void setIp50211ExpirationDate(Field source) {
   	replace(source,0,source.length(),ip50211ExpirationDate.begin,ip50211ExpirationDate.length());
   }  
   
     /**
	 * 	Update Ip50211ExpirationDate 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp50211ExpirationDate(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip50211ExpirationDate.begin,ip50211ExpirationDate.length());
   }
   
     /**
	 * 	Update Ip50211ExpirationDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50211ExpirationDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip50211ExpirationDate.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip50211FacDataKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp50211PrimaryAcctNbr(CONSTANTS.SPACE_19);
          ip50211ExpirationDate.initialize();
     
   }

		public static int getIp50211FacDataKeyFieldLength() {
			return IP_50211_FAC_DATA_KEY_LENGTH;
		}

}
  

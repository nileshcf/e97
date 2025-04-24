package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip08151PassedParms is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:40. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@GlobalDto
public class Ip08151PassedParms extends Ip08151PassedParmsSerialized { 
   

						private char[] ip08151PassedAcctNbr = Field.fillLowValue(19);
	
	/**
	* Constructor for Ip08151PassedParms
	**/
    public Ip08151PassedParms() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip08151PassedAcctNbr
	 *	@return ip08151PassedAcctNbr
	 */
   public char[] getIp08151PassedAcctNbr() throws CFException{
     if (isIp08151PassedAcctNbrModified()) { 
        ip08151PassedAcctNbr = refreshIp08151PassedAcctNbr();
     }
   		return ip08151PassedAcctNbr;
   }

  
	/**
	*  set variable ip08151PassedAcctNbr
	*  Corresponding COBOL Variable is IP08151-PASSED-ACCT-NBR
	*  @param value
	**/
   public void setIp08151PassedAcctNbr(char[] value) {
      ip08151PassedAcctNbr = checkIp08151PassedAcctNbrConstraints(value);
      serializeIp08151PassedAcctNbr(ip08151PassedAcctNbr);
   } 

     /**
	 * 	Update Ip08151PassedAcctNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp08151PassedAcctNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp08151PassedAcctNbr,ip08151PassedAcctNbr.length);
   	
   }
   
   public void setIp08151PassedAcctNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp08151PassedAcctNbr,ip08151PassedAcctNbr.length);
   	
   }
   
     /**
	 * 	Update Ip08151PassedAcctNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp08151PassedAcctNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08151PassedAcctNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip08151PassedAcctNbr with another Field
	 *	@param value
	 */
   public void setIp08151PassedAcctNbr(Field source) {
       replace(source,0,source.length(),beginIp08151PassedAcctNbr,IP_08151_PASSED_ACCT_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Ip08151PassedAcctNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp08151PassedAcctNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp08151PassedAcctNbr,IP_08151_PASSED_ACCT_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Ip08151PassedAcctNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp08151PassedAcctNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08151PassedAcctNbr+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip08151PassedParms
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp08151PassedAcctNbr(CONSTANTS.SPACE_19);
   }

		public static int getIp08151PassedParmsFieldLength() {
			return IP_08151_PASSED_PARMS_LENGTH;
		}

}
  

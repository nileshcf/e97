package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip08151ReturnParms is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip08151ReturnParms")

public class Ip08151ReturnParms extends Ip08151ReturnParmsSerialized  implements InitializingBean {
   

						private char[] ip08151ReturnPrtnNbr = Field.fillLowValue(3);

								private short ip08151ReturnAcctNbrL;
	
	/**
	* Constructor for Ip08151ReturnParms
	**/
    public Ip08151ReturnParms() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip08151ReturnPrtnNbr
	 *	@return ip08151ReturnPrtnNbr
	 */
   public char[] getIp08151ReturnPrtnNbr() throws CFException{
     if (isIp08151ReturnPrtnNbrModified()) { 
        ip08151ReturnPrtnNbr = refreshIp08151ReturnPrtnNbr();
     }
   		return ip08151ReturnPrtnNbr;
   }

  
	/**
	*  set variable ip08151ReturnPrtnNbr
	*  Corresponding COBOL Variable is IP08151-RETURN-PRTN-NBR
	*  @param value
	**/
   public void setIp08151ReturnPrtnNbr(char[] value) {
      ip08151ReturnPrtnNbr = checkIp08151ReturnPrtnNbrConstraints(value);
      serializeIp08151ReturnPrtnNbr(ip08151ReturnPrtnNbr);
   } 

     /**
	 * 	Update Ip08151ReturnPrtnNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp08151ReturnPrtnNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp08151ReturnPrtnNbr,ip08151ReturnPrtnNbr.length);
   	
   }
   
   public void setIp08151ReturnPrtnNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp08151ReturnPrtnNbr,ip08151ReturnPrtnNbr.length);
   	
   }
   
     /**
	 * 	Update Ip08151ReturnPrtnNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp08151ReturnPrtnNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08151ReturnPrtnNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip08151ReturnPrtnNbr with another Field
	 *	@param value
	 */
   public void setIp08151ReturnPrtnNbr(Field source) {
       replace(source,0,source.length(),beginIp08151ReturnPrtnNbr,IP_08151_RETURN_PRTN_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Ip08151ReturnPrtnNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp08151ReturnPrtnNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp08151ReturnPrtnNbr,IP_08151_RETURN_PRTN_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Ip08151ReturnPrtnNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp08151ReturnPrtnNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08151ReturnPrtnNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip08151ReturnAcctNbrL
	 *	@return ip08151ReturnAcctNbrL
	 */
	public short getIp08151ReturnAcctNbrL() throws CFException {
        if (isIp08151ReturnAcctNbrLModified()) { 
           ip08151ReturnAcctNbrL = refreshIp08151ReturnAcctNbrL();
        }
   		return ip08151ReturnAcctNbrL;
	}
	
	/**
	 * 	Update Ip08151ReturnAcctNbrL with the passed value
	 *  Corresponding COBOL Variable is IP08151-RETURN-ACCT-NBR-L
	 *	@param number
	 */
	public void setIp08151ReturnAcctNbrL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip08151ReturnAcctNbrL = checkIp08151ReturnAcctNbrLMaxLimit(number); 
		serializeIp08151ReturnAcctNbrL(ip08151ReturnAcctNbrL);
	}

	public void setIp08151ReturnAcctNbrL(int number) {
	    number = checkIp08151ReturnAcctNbrLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp08151ReturnAcctNbrL((short)number);
	}
	public void setIp08151ReturnAcctNbrL(long number) {
	    number = checkIp08151ReturnAcctNbrLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp08151ReturnAcctNbrL((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip08151ReturnParms
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp08151ReturnPrtnNbr(CONSTANTS.SPACE_3);
         	setIp08151ReturnAcctNbrL((short)0);
   }

		public static int getIp08151ReturnParmsFieldLength() {
			return IP_08151_RETURN_PARMS_LENGTH;
		}

}
  

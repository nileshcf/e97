package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip7052pmrProcDelay is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip7052pmrProcDelay extends Ip7052pmrProcDelaySerialized { 
   

								private long ip7052pmrNoOfTrans;

						private char[] ip7052pmrTimeDelay = Field.fillLowValue(8);
	
	/**
	* Constructor for Ip7052pmrProcDelay
	**/
    public Ip7052pmrProcDelay() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip7052pmrProcDelay. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip7052pmrProcDelay(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip7052pmrNoOfTrans
	 *	@return ip7052pmrNoOfTrans
	 */
	public long getIp7052pmrNoOfTrans() throws CFException {
       if (isIp7052pmrNoOfTransModified()) { 
           ip7052pmrNoOfTrans = refreshIp7052pmrNoOfTrans();
        }
   		return ip7052pmrNoOfTrans;
	}
	

	
	   
	/**
	 * 	Update Ip7052pmrNoOfTrans with the passed value
	 *  Corresponding COBOL Variable is IP7052PMR-NO-OF-TRANS
	 *	@param number
	 */
	public void setIp7052pmrNoOfTrans(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip7052pmrNoOfTrans = checkIp7052pmrNoOfTransMaxLimit(number); 
		serializeIp7052pmrNoOfTrans(ip7052pmrNoOfTrans);
	}
	

	/**
	 * 	Update Ip7052pmrNoOfTrans with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp7052pmrNoOfTrans(char[] value) throws CFException {
		 ip7052pmrNoOfTrans = serializeIp7052pmrNoOfTrans(value);
	}
	/**
	 * 	Update Ip7052pmrNoOfTrans with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp7052pmrNoOfTransString(char[] value) throws CFException {
		 setIp7052pmrNoOfTrans(value);
	}
	/**
	 *	Returns the value of ip7052pmrTimeDelay
	 *	@return ip7052pmrTimeDelay
	 */
   public char[] getIp7052pmrTimeDelay() throws CFException{
     if (isIp7052pmrTimeDelayModified()) { 
        ip7052pmrTimeDelay = refreshIp7052pmrTimeDelay();
     }
   		return ip7052pmrTimeDelay;
   }

  
	/**
	*  set variable ip7052pmrTimeDelay
	*  Corresponding COBOL Variable is IP7052PMR-TIME-DELAY
	*  @param value
	**/
   public void setIp7052pmrTimeDelay(char[] value) {
      ip7052pmrTimeDelay = checkIp7052pmrTimeDelayConstraints(value);
      serializeIp7052pmrTimeDelay(ip7052pmrTimeDelay);
   } 

     /**
	 * 	Update Ip7052pmrTimeDelay 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7052pmrTimeDelay(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7052pmrTimeDelay,ip7052pmrTimeDelay.length);
   	
   }
   
   public void setIp7052pmrTimeDelay(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pmrTimeDelay,ip7052pmrTimeDelay.length);
   	
   }
   
     /**
	 * 	Update Ip7052pmrTimeDelay 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7052pmrTimeDelay(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pmrTimeDelay+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7052pmrTimeDelay with another Field
	 *	@param value
	 */
   public void setIp7052pmrTimeDelay(Field source) {
       replace(source,0,source.length(),beginIp7052pmrTimeDelay,IP_7052PMR_TIME_DELAY_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7052pmrTimeDelay 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7052pmrTimeDelay(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7052pmrTimeDelay,IP_7052PMR_TIME_DELAY_LEN);
   	
   }
   
     /**
	 * 	Update Ip7052pmrTimeDelay 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7052pmrTimeDelay(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pmrTimeDelay+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip7052pmrProcDelay
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp7052pmrNoOfTrans(0);
         setIp7052pmrTimeDelay(CONSTANTS.SPACE_8);
   }

		public static int getIp7052pmrProcDelayFieldLength() {
			return IP_7052PMR_PROC_DELAY_LENGTH;
		}

}
  

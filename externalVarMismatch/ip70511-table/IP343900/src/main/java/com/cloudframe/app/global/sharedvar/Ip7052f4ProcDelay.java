package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip7052f4ProcDelay is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip7052f4ProcDelay extends Ip7052f4ProcDelaySerialized { 
   

								private long ip7052f4NoOfTrans;

						private char[] ip7052f4TimeDelay = Field.fillLowValue(8);
	
	/**
	* Constructor for Ip7052f4ProcDelay
	**/
    public Ip7052f4ProcDelay() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip7052f4ProcDelay. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip7052f4ProcDelay(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip7052f4NoOfTrans
	 *	@return ip7052f4NoOfTrans
	 */
	public long getIp7052f4NoOfTrans() throws CFException {
       if (isIp7052f4NoOfTransModified()) { 
           ip7052f4NoOfTrans = refreshIp7052f4NoOfTrans();
        }
   		return ip7052f4NoOfTrans;
	}
	

	
	   
	/**
	 * 	Update Ip7052f4NoOfTrans with the passed value
	 *  Corresponding COBOL Variable is IP7052F4-NO-OF-TRANS
	 *	@param number
	 */
	public void setIp7052f4NoOfTrans(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip7052f4NoOfTrans = checkIp7052f4NoOfTransMaxLimit(number); 
		serializeIp7052f4NoOfTrans(ip7052f4NoOfTrans);
	}
	

	/**
	 * 	Update Ip7052f4NoOfTrans with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp7052f4NoOfTrans(char[] value) throws CFException {
		 ip7052f4NoOfTrans = serializeIp7052f4NoOfTrans(value);
	}
	/**
	 * 	Update Ip7052f4NoOfTrans with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp7052f4NoOfTransString(char[] value) throws CFException {
		 setIp7052f4NoOfTrans(value);
	}
	/**
	 *	Returns the value of ip7052f4TimeDelay
	 *	@return ip7052f4TimeDelay
	 */
   public char[] getIp7052f4TimeDelay() throws CFException{
     if (isIp7052f4TimeDelayModified()) { 
        ip7052f4TimeDelay = refreshIp7052f4TimeDelay();
     }
   		return ip7052f4TimeDelay;
   }

  
	/**
	*  set variable ip7052f4TimeDelay
	*  Corresponding COBOL Variable is IP7052F4-TIME-DELAY
	*  @param value
	**/
   public void setIp7052f4TimeDelay(char[] value) {
      ip7052f4TimeDelay = checkIp7052f4TimeDelayConstraints(value);
      serializeIp7052f4TimeDelay(ip7052f4TimeDelay);
   } 

     /**
	 * 	Update Ip7052f4TimeDelay 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7052f4TimeDelay(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7052f4TimeDelay,ip7052f4TimeDelay.length);
   	
   }
   
   public void setIp7052f4TimeDelay(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052f4TimeDelay,ip7052f4TimeDelay.length);
   	
   }
   
     /**
	 * 	Update Ip7052f4TimeDelay 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7052f4TimeDelay(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052f4TimeDelay+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7052f4TimeDelay with another Field
	 *	@param value
	 */
   public void setIp7052f4TimeDelay(Field source) {
       replace(source,0,source.length(),beginIp7052f4TimeDelay,IP_7052F_4_TIME_DELAY_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7052f4TimeDelay 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7052f4TimeDelay(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7052f4TimeDelay,IP_7052F_4_TIME_DELAY_LEN);
   	
   }
   
     /**
	 * 	Update Ip7052f4TimeDelay 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7052f4TimeDelay(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052f4TimeDelay+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip7052f4ProcDelay
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp7052f4NoOfTrans(0);
         setIp7052f4TimeDelay(CONSTANTS.SPACE_8);
   }

		public static int getIp7052f4ProcDelayFieldLength() {
			return IP_7052F_4_PROC_DELAY_LENGTH;
		}

}
  

package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70521ProcDelay is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:25. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip70521ProcDelay extends Ip70521ProcDelaySerialized { 
   

								private long ip70521NoOfTrans;

						private char[] ip70521TimeDelay = Field.fillLowValue(8);
	
	/**
	* Constructor for Ip70521ProcDelay
	**/
    public Ip70521ProcDelay() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip70521ProcDelay. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip70521ProcDelay(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip70521NoOfTrans
	 *	@return ip70521NoOfTrans
	 */
	public long getIp70521NoOfTrans() throws CFException {
       if (isIp70521NoOfTransModified()) { 
           ip70521NoOfTrans = refreshIp70521NoOfTrans();
        }
   		return ip70521NoOfTrans;
	}
	

	
	   
	/**
	 * 	Update Ip70521NoOfTrans with the passed value
	 *  Corresponding COBOL Variable is IP70521-NO-OF-TRANS
	 *	@param number
	 */
	public void setIp70521NoOfTrans(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip70521NoOfTrans = checkIp70521NoOfTransMaxLimit(number); 
		serializeIp70521NoOfTrans(ip70521NoOfTrans);
	}
	

	/**
	 * 	Update Ip70521NoOfTrans with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp70521NoOfTrans(char[] value) throws CFException {
		 ip70521NoOfTrans = serializeIp70521NoOfTrans(value);
	}
	/**
	 * 	Update Ip70521NoOfTrans with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp70521NoOfTransString(char[] value) throws CFException {
		 setIp70521NoOfTrans(value);
	}
	/**
	 *	Returns the value of ip70521TimeDelay
	 *	@return ip70521TimeDelay
	 */
   public char[] getIp70521TimeDelay() throws CFException{
     if (isIp70521TimeDelayModified()) { 
        ip70521TimeDelay = refreshIp70521TimeDelay();
     }
   		return ip70521TimeDelay;
   }

  
	/**
	*  set variable ip70521TimeDelay
	*  Corresponding COBOL Variable is IP70521-TIME-DELAY
	*  @param value
	**/
   public void setIp70521TimeDelay(char[] value) {
      ip70521TimeDelay = checkIp70521TimeDelayConstraints(value);
      serializeIp70521TimeDelay(ip70521TimeDelay);
   } 

     /**
	 * 	Update Ip70521TimeDelay 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70521TimeDelay(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp70521TimeDelay,ip70521TimeDelay.length);
   	
   }
   
   public void setIp70521TimeDelay(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp70521TimeDelay,ip70521TimeDelay.length);
   	
   }
   
     /**
	 * 	Update Ip70521TimeDelay 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70521TimeDelay(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70521TimeDelay+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip70521TimeDelay with another Field
	 *	@param value
	 */
   public void setIp70521TimeDelay(Field source) {
       replace(source,0,source.length(),beginIp70521TimeDelay,IP_70521_TIME_DELAY_LEN);
   	
   }  
   
     /**
	 * 	Update Ip70521TimeDelay 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70521TimeDelay(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp70521TimeDelay,IP_70521_TIME_DELAY_LEN);
   	
   }
   
     /**
	 * 	Update Ip70521TimeDelay 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70521TimeDelay(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp70521TimeDelay+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip70521ProcDelay
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp70521NoOfTrans(0);
         setIp70521TimeDelay(CONSTANTS.SPACE_8);
   }

		public static int getIp70521ProcDelayFieldLength() {
			return IP_70521_PROC_DELAY_LENGTH;
		}

}
  

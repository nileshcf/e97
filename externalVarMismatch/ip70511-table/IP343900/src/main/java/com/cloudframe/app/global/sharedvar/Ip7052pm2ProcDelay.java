package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip7052pm2ProcDelay is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:15. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip7052pm2ProcDelay extends Ip7052pm2ProcDelaySerialized { 
   

								private long ip7052pm2NoOfTrans;

						private char[] ip7052pm2TimeDelay = Field.fillLowValue(8);
	
	/**
	* Constructor for Ip7052pm2ProcDelay
	**/
    public Ip7052pm2ProcDelay() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip7052pm2ProcDelay. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip7052pm2ProcDelay(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip7052pm2NoOfTrans
	 *	@return ip7052pm2NoOfTrans
	 */
	public long getIp7052pm2NoOfTrans() throws CFException {
       if (isIp7052pm2NoOfTransModified()) { 
           ip7052pm2NoOfTrans = refreshIp7052pm2NoOfTrans();
        }
   		return ip7052pm2NoOfTrans;
	}
	

	
	   
	/**
	 * 	Update Ip7052pm2NoOfTrans with the passed value
	 *  Corresponding COBOL Variable is IP7052PM2-NO-OF-TRANS
	 *	@param number
	 */
	public void setIp7052pm2NoOfTrans(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip7052pm2NoOfTrans = checkIp7052pm2NoOfTransMaxLimit(number); 
		serializeIp7052pm2NoOfTrans(ip7052pm2NoOfTrans);
	}
	

	/**
	 * 	Update Ip7052pm2NoOfTrans with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp7052pm2NoOfTrans(char[] value) throws CFException {
		 ip7052pm2NoOfTrans = serializeIp7052pm2NoOfTrans(value);
	}
	/**
	 * 	Update Ip7052pm2NoOfTrans with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp7052pm2NoOfTransString(char[] value) throws CFException {
		 setIp7052pm2NoOfTrans(value);
	}
	/**
	 *	Returns the value of ip7052pm2TimeDelay
	 *	@return ip7052pm2TimeDelay
	 */
   public char[] getIp7052pm2TimeDelay() throws CFException{
     if (isIp7052pm2TimeDelayModified()) { 
        ip7052pm2TimeDelay = refreshIp7052pm2TimeDelay();
     }
   		return ip7052pm2TimeDelay;
   }

  
	/**
	*  set variable ip7052pm2TimeDelay
	*  Corresponding COBOL Variable is IP7052PM2-TIME-DELAY
	*  @param value
	**/
   public void setIp7052pm2TimeDelay(char[] value) {
      ip7052pm2TimeDelay = checkIp7052pm2TimeDelayConstraints(value);
      serializeIp7052pm2TimeDelay(ip7052pm2TimeDelay);
   } 

     /**
	 * 	Update Ip7052pm2TimeDelay 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7052pm2TimeDelay(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7052pm2TimeDelay,ip7052pm2TimeDelay.length);
   	
   }
   
   public void setIp7052pm2TimeDelay(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pm2TimeDelay,ip7052pm2TimeDelay.length);
   	
   }
   
     /**
	 * 	Update Ip7052pm2TimeDelay 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7052pm2TimeDelay(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pm2TimeDelay+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7052pm2TimeDelay with another Field
	 *	@param value
	 */
   public void setIp7052pm2TimeDelay(Field source) {
       replace(source,0,source.length(),beginIp7052pm2TimeDelay,IP_7052PM_2_TIME_DELAY_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7052pm2TimeDelay 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7052pm2TimeDelay(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7052pm2TimeDelay,IP_7052PM_2_TIME_DELAY_LEN);
   	
   }
   
     /**
	 * 	Update Ip7052pm2TimeDelay 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7052pm2TimeDelay(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7052pm2TimeDelay+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip7052pm2ProcDelay
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp7052pm2NoOfTrans(0);
         setIp7052pm2TimeDelay(CONSTANTS.SPACE_8);
   }

		public static int getIp7052pm2ProcDelayFieldLength() {
			return IP_7052PM_2_PROC_DELAY_LENGTH;
		}

}
  

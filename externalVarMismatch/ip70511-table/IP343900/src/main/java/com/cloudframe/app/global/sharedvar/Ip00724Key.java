package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00724Key is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip00724Key extends Ip00724KeySerialized { 
   

								private long ip00724Ica;

						private char[] ip00724IcaRedX = Field.fillLowValue(11);
	
	/**
	* Constructor for Ip00724Key
	**/
    public Ip00724Key() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip00724Key. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00724Key(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip00724Ica
	 *	@return ip00724Ica
	 */
	public long getIp00724Ica() throws CFException {
       if (isIp00724IcaModified()) { 
           ip00724Ica = refreshIp00724Ica();
        }
   		return ip00724Ica;
	}
	

	
	   
	/**
	 * 	Update Ip00724Ica with the passed value
	 *  Corresponding COBOL Variable is IP00724-ICA
	 *	@param number
	 */
	public void setIp00724Ica(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip00724Ica = checkIp00724IcaMaxLimit(number); 
		serializeIp00724Ica(ip00724Ica);
	}
	

	/**
	 * 	Update Ip00724Ica with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00724Ica(char[] value) throws CFException {
		 ip00724Ica = serializeIp00724Ica(value);
	}
	/**
	 * 	Update Ip00724Ica with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00724IcaString(char[] value) throws CFException {
		 setIp00724Ica(value);
	}
	/**
	 *	Returns the value of ip00724IcaRedX
	 *	@return ip00724IcaRedX
	 */
   public char[] getIp00724IcaRedX() throws CFException{
     if (isIp00724IcaRedXModified()) { 
        ip00724IcaRedX = refreshIp00724IcaRedX();
     }
   		return ip00724IcaRedX;
   }

  
	/**
	*  set variable ip00724IcaRedX
	*  Corresponding COBOL Variable is IP00724-ICA-RED-X
	*  @param value
	**/
   public void setIp00724IcaRedX(char[] value) {
      ip00724IcaRedX = checkIp00724IcaRedXConstraints(value);
      serializeIp00724IcaRedX(ip00724IcaRedX);
   } 

     /**
	 * 	Update Ip00724IcaRedX 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00724IcaRedX(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00724IcaRedX,ip00724IcaRedX.length);
   	
   }
   
   public void setIp00724IcaRedX(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724IcaRedX,ip00724IcaRedX.length);
   	
   }
   
     /**
	 * 	Update Ip00724IcaRedX 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724IcaRedX(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724IcaRedX+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00724IcaRedX with another Field
	 *	@param value
	 */
   public void setIp00724IcaRedX(Field source) {
       replace(source,0,source.length(),beginIp00724IcaRedX,IP_00724_ICA_RED_X_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00724IcaRedX 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00724IcaRedX(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00724IcaRedX,IP_00724_ICA_RED_X_LEN);
   	
   }
   
     /**
	 * 	Update Ip00724IcaRedX 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724IcaRedX(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724IcaRedX+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip00724Key
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp00724Ica(0);
   }

		public static int getIp00724KeyFieldLength() {
			return IP_00724_KEY_LENGTH;
		}

}
  

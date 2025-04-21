package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip34631CreateUpdateTs is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:10. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip34631CreateUpdateTs extends Ip34631CreateUpdateTsSerialized { 
   
				private Ip34631CreateDate ip34631CreateDate = new Ip34631CreateDate();

						private char[] ip34631CreateTime = Field.fillLowValue(16);
	
	/**
	* Constructor for Ip34631CreateUpdateTs
	**/
    public Ip34631CreateUpdateTs() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip34631CreateUpdateTs. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip34631CreateUpdateTs(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip34631CreateDate.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of ip34631CreateDate
	 *	@return ip34631CreateDate
	 */   
	 public Ip34631CreateDate getIp34631CreateDate() {
   	return ip34631CreateDate;
   }
   /**
	* 	Update Ip34631CreateDate with the passed value
	*   Corresponding COBOL Variable is IP34631-CREATE-DATE
	*	@param value
	*/
   public void setIp34631CreateDate(char[] value) {
      ip34631CreateDate.setString(value); 
   }   
    
     /**
	 * 	Update Ip34631CreateDate 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp34631CreateDate(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip34631CreateDate.begin,ip34631CreateDate.length());
   }
   
     /**
	 * 	Update Ip34631CreateDate 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp34631CreateDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip34631CreateDate.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip34631CreateDate with another Field
	 *	@param value
	 */
   public void setIp34631CreateDate(Field source) {
   	replace(source,0,source.length(),ip34631CreateDate.begin,ip34631CreateDate.length());
   }  
   
     /**
	 * 	Update Ip34631CreateDate 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp34631CreateDate(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip34631CreateDate.begin,ip34631CreateDate.length());
   }
   
     /**
	 * 	Update Ip34631CreateDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp34631CreateDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip34631CreateDate.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip34631CreateTime
	 *	@return ip34631CreateTime
	 */
   public char[] getIp34631CreateTime() throws CFException{
     if (isIp34631CreateTimeModified()) { 
        ip34631CreateTime = refreshIp34631CreateTime();
     }
   		return ip34631CreateTime;
   }

  
	/**
	*  set variable ip34631CreateTime
	*  Corresponding COBOL Variable is IP34631-CREATE-TIME
	*  @param value
	**/
   public void setIp34631CreateTime(char[] value) {
      ip34631CreateTime = checkIp34631CreateTimeConstraints(value);
      serializeIp34631CreateTime(ip34631CreateTime);
   } 

     /**
	 * 	Update Ip34631CreateTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp34631CreateTime(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp34631CreateTime,ip34631CreateTime.length);
   	
   }
   
   public void setIp34631CreateTime(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp34631CreateTime,ip34631CreateTime.length);
   	
   }
   
     /**
	 * 	Update Ip34631CreateTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp34631CreateTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp34631CreateTime+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip34631CreateTime with another Field
	 *	@param value
	 */
   public void setIp34631CreateTime(Field source) {
       replace(source,0,source.length(),beginIp34631CreateTime,IP_34631_CREATE_TIME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip34631CreateTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp34631CreateTime(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp34631CreateTime,IP_34631_CREATE_TIME_LEN);
   	
   }
   
     /**
	 * 	Update Ip34631CreateTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp34631CreateTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp34631CreateTime+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip34631CreateUpdateTs
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip34631CreateDate.initialize();
     
         setIp34631CreateTime(CONSTANTS.SPACE_16);
   }

		public static int getIp34631CreateUpdateTsFieldLength() {
			return IP_34631_CREATE_UPDATE_TS_LENGTH;
		}

}
  

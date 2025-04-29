package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip58041CreateUpdateTs is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:25. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip58041CreateUpdateTs extends Ip58041CreateUpdateTsSerialized { 
   
				private Ip58041CreateDate ip58041CreateDate = new Ip58041CreateDate();

						private char[] ip58041CreateTime = Field.fillLowValue(16);
	
	/**
	* Constructor for Ip58041CreateUpdateTs
	**/
    public Ip58041CreateUpdateTs() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip58041CreateUpdateTs. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip58041CreateUpdateTs(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip58041CreateDate.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of ip58041CreateDate
	 *	@return ip58041CreateDate
	 */   
	 public Ip58041CreateDate getIp58041CreateDate() {
   	return ip58041CreateDate;
   }
   /**
	* 	Update Ip58041CreateDate with the passed value
	*   Corresponding COBOL Variable is IP58041-CREATE-DATE
	*	@param value
	*/
   public void setIp58041CreateDate(char[] value) {
      ip58041CreateDate.setString(value); 
   }   
    
     /**
	 * 	Update Ip58041CreateDate 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp58041CreateDate(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip58041CreateDate.begin,ip58041CreateDate.length());
   }
   
     /**
	 * 	Update Ip58041CreateDate 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp58041CreateDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip58041CreateDate.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip58041CreateDate with another Field
	 *	@param value
	 */
   public void setIp58041CreateDate(Field source) {
   	replace(source,0,source.length(),ip58041CreateDate.begin,ip58041CreateDate.length());
   }  
   
     /**
	 * 	Update Ip58041CreateDate 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp58041CreateDate(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip58041CreateDate.begin,ip58041CreateDate.length());
   }
   
     /**
	 * 	Update Ip58041CreateDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp58041CreateDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip58041CreateDate.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip58041CreateTime
	 *	@return ip58041CreateTime
	 */
   public char[] getIp58041CreateTime() throws CFException{
     if (isIp58041CreateTimeModified()) { 
        ip58041CreateTime = refreshIp58041CreateTime();
     }
   		return ip58041CreateTime;
   }

  
	/**
	*  set variable ip58041CreateTime
	*  Corresponding COBOL Variable is IP58041-CREATE-TIME
	*  @param value
	**/
   public void setIp58041CreateTime(char[] value) {
      ip58041CreateTime = checkIp58041CreateTimeConstraints(value);
      serializeIp58041CreateTime(ip58041CreateTime);
   } 

     /**
	 * 	Update Ip58041CreateTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp58041CreateTime(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp58041CreateTime,ip58041CreateTime.length);
   	
   }
   
   public void setIp58041CreateTime(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041CreateTime,ip58041CreateTime.length);
   	
   }
   
     /**
	 * 	Update Ip58041CreateTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp58041CreateTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041CreateTime+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip58041CreateTime with another Field
	 *	@param value
	 */
   public void setIp58041CreateTime(Field source) {
       replace(source,0,source.length(),beginIp58041CreateTime,IP_58041_CREATE_TIME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip58041CreateTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp58041CreateTime(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp58041CreateTime,IP_58041_CREATE_TIME_LEN);
   	
   }
   
     /**
	 * 	Update Ip58041CreateTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp58041CreateTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041CreateTime+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip58041CreateUpdateTs
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip58041CreateDate.initialize();
     
         setIp58041CreateTime(CONSTANTS.SPACE_16);
   }

		public static int getIp58041CreateUpdateTsFieldLength() {
			return IP_58041_CREATE_UPDATE_TS_LENGTH;
		}

}
  

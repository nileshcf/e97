package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50004iTableKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:05. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip50004iTableKey extends Ip50004iTableKeySerialized { 
   
				private Ip50004iTableId ip50004iTableId = new Ip50004iTableId();

						private char[] ip50004iEffDate = Field.fillLowValue(10);
	
	/**
	* Constructor for Ip50004iTableKey
	**/
    public Ip50004iTableKey() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip50004iTableKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50004iTableKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip50004iTableId.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of ip50004iTableId
	 *	@return ip50004iTableId
	 */   
	 public Ip50004iTableId getIp50004iTableId() {
   	return ip50004iTableId;
   }
   /**
	* 	Update Ip50004iTableId with the passed value
	*   Corresponding COBOL Variable is IP50004I-TABLE-ID
	*	@param value
	*/
   public void setIp50004iTableId(char[] value) {
      ip50004iTableId.setString(value); 
   }   
    
     /**
	 * 	Update Ip50004iTableId 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp50004iTableId(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip50004iTableId.begin,ip50004iTableId.length());
   }
   
     /**
	 * 	Update Ip50004iTableId 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50004iTableId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip50004iTableId.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip50004iTableId with another Field
	 *	@param value
	 */
   public void setIp50004iTableId(Field source) {
   	replace(source,0,source.length(),ip50004iTableId.begin,ip50004iTableId.length());
   }  
   
     /**
	 * 	Update Ip50004iTableId 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp50004iTableId(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip50004iTableId.begin,ip50004iTableId.length());
   }
   
     /**
	 * 	Update Ip50004iTableId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50004iTableId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip50004iTableId.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip50004iEffDate
	 *	@return ip50004iEffDate
	 */
   public char[] getIp50004iEffDate() throws CFException{
     if (isIp50004iEffDateModified()) { 
        ip50004iEffDate = refreshIp50004iEffDate();
     }
   		return ip50004iEffDate;
   }

  
	/**
	*  set variable ip50004iEffDate
	*  Corresponding COBOL Variable is IP50004I-EFF-DATE
	*  @param value
	**/
   public void setIp50004iEffDate(char[] value) {
      ip50004iEffDate = checkIp50004iEffDateConstraints(value);
      serializeIp50004iEffDate(ip50004iEffDate);
   } 

     /**
	 * 	Update Ip50004iEffDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50004iEffDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50004iEffDate,ip50004iEffDate.length);
   	
   }
   
   public void setIp50004iEffDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50004iEffDate,ip50004iEffDate.length);
   	
   }
   
     /**
	 * 	Update Ip50004iEffDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50004iEffDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50004iEffDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50004iEffDate with another Field
	 *	@param value
	 */
   public void setIp50004iEffDate(Field source) {
       replace(source,0,source.length(),beginIp50004iEffDate,IP_50004I_EFF_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50004iEffDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50004iEffDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50004iEffDate,IP_50004I_EFF_DATE_LEN);
   	
   }
   
     /**
	 * 	Update Ip50004iEffDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50004iEffDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50004iEffDate+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip50004iTableKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip50004iTableId.initialize();
     
         setIp50004iEffDate(CONSTANTS.SPACE_10);
   }

		public static int getIp50004iTableKeyFieldLength() {
			return IP_50004I_TABLE_KEY_LENGTH;
		}

}
  

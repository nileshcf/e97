package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip500041TableKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:56. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip500041TableKey extends Ip500041TableKeySerialized { 
   
				private Ip500041TableId ip500041TableId = new Ip500041TableId();

						private char[] ip500041EffDate = Field.fillLowValue(10);
	
	/**
	* Constructor for Ip500041TableKey
	**/
    public Ip500041TableKey() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip500041TableKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip500041TableKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip500041TableId.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of ip500041TableId
	 *	@return ip500041TableId
	 */   
	 public Ip500041TableId getIp500041TableId() {
   	return ip500041TableId;
   }
   /**
	* 	Update Ip500041TableId with the passed value
	*   Corresponding COBOL Variable is IP500041-TABLE-ID
	*	@param value
	*/
   public void setIp500041TableId(char[] value) {
      ip500041TableId.setString(value); 
   }   
    
     /**
	 * 	Update Ip500041TableId 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp500041TableId(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip500041TableId.begin,ip500041TableId.length());
   }
   
     /**
	 * 	Update Ip500041TableId 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp500041TableId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip500041TableId.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip500041TableId with another Field
	 *	@param value
	 */
   public void setIp500041TableId(Field source) {
   	replace(source,0,source.length(),ip500041TableId.begin,ip500041TableId.length());
   }  
   
     /**
	 * 	Update Ip500041TableId 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp500041TableId(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip500041TableId.begin,ip500041TableId.length());
   }
   
     /**
	 * 	Update Ip500041TableId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp500041TableId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip500041TableId.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip500041EffDate
	 *	@return ip500041EffDate
	 */
   public char[] getIp500041EffDate() throws CFException{
     if (isIp500041EffDateModified()) { 
        ip500041EffDate = refreshIp500041EffDate();
     }
   		return ip500041EffDate;
   }

  
	/**
	*  set variable ip500041EffDate
	*  Corresponding COBOL Variable is IP500041-EFF-DATE
	*  @param value
	**/
   public void setIp500041EffDate(char[] value) {
      ip500041EffDate = checkIp500041EffDateConstraints(value);
      serializeIp500041EffDate(ip500041EffDate);
   } 

     /**
	 * 	Update Ip500041EffDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp500041EffDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp500041EffDate,ip500041EffDate.length);
   	
   }
   
   public void setIp500041EffDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp500041EffDate,ip500041EffDate.length);
   	
   }
   
     /**
	 * 	Update Ip500041EffDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp500041EffDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp500041EffDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip500041EffDate with another Field
	 *	@param value
	 */
   public void setIp500041EffDate(Field source) {
       replace(source,0,source.length(),beginIp500041EffDate,IP_500041_EFF_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip500041EffDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp500041EffDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp500041EffDate,IP_500041_EFF_DATE_LEN);
   	
   }
   
     /**
	 * 	Update Ip500041EffDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp500041EffDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp500041EffDate+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip500041TableKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip500041TableId.initialize();
     
         setIp500041EffDate(CONSTANTS.SPACE_10);
   }

		public static int getIp500041TableKeyFieldLength() {
			return IP_500041_TABLE_KEY_LENGTH;
		}

}
  

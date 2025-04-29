package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip500041OneDayRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:22. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip500041OneDayRec")

public class Ip500041OneDayRec extends Ip500041OneDayRecSerialized  implements InitializingBean {
   
				private Ip500041TableKey ip500041TableKey = new Ip500041TableKey();

						private char[] ip500041TableData = Field.fillLowValue(27973);
	
	/**
	* Constructor for Ip500041OneDayRec
	**/
    public Ip500041OneDayRec() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			ip500041TableKey.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip500041TableKey
	 *	@return ip500041TableKey
	 */   
	 public Ip500041TableKey getIp500041TableKey() {
   	return ip500041TableKey;
   }
   /**
	* 	Update Ip500041TableKey with the passed value
	*   Corresponding COBOL Variable is IP500041-TABLE-KEY
	*	@param value
	*/
   public void setIp500041TableKey(char[] value) {
      ip500041TableKey.setString(value); 
   }   
    
     /**
	 * 	Update Ip500041TableKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp500041TableKey(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip500041TableKey.begin,ip500041TableKey.length());
   }
   
     /**
	 * 	Update Ip500041TableKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp500041TableKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip500041TableKey.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip500041TableKey with another Field
	 *	@param value
	 */
   public void setIp500041TableKey(Field source) {
   	replace(source,0,source.length(),ip500041TableKey.begin,ip500041TableKey.length());
   }  
   
     /**
	 * 	Update Ip500041TableKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp500041TableKey(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip500041TableKey.begin,ip500041TableKey.length());
   }
   
     /**
	 * 	Update Ip500041TableKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp500041TableKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip500041TableKey.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip500041TableData
	 *	@return ip500041TableData
	 */
   public char[] getIp500041TableData() throws CFException{
     if (isIp500041TableDataModified()) { 
        ip500041TableData = refreshIp500041TableData();
     }
   		return ip500041TableData;
   }

  
	/**
	*  set variable ip500041TableData
	*  Corresponding COBOL Variable is IP500041-TABLE-DATA
	*  @param value
	**/
   public void setIp500041TableData(char[] value) {
      ip500041TableData = checkIp500041TableDataConstraints(value);
      serializeIp500041TableData(ip500041TableData);
   } 

     /**
	 * 	Update Ip500041TableData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp500041TableData(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp500041TableData,ip500041TableData.length);
   	
   }
   
   public void setIp500041TableData(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp500041TableData,ip500041TableData.length);
   	
   }
   
     /**
	 * 	Update Ip500041TableData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp500041TableData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp500041TableData+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip500041TableData with another Field
	 *	@param value
	 */
   public void setIp500041TableData(Field source) {
       replace(source,0,source.length(),beginIp500041TableData,IP_500041_TABLE_DATA_LEN);
   	
   }  
   
     /**
	 * 	Update Ip500041TableData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp500041TableData(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp500041TableData,IP_500041_TABLE_DATA_LEN);
   	
   }
   
     /**
	 * 	Update Ip500041TableData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp500041TableData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp500041TableData+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip500041OneDayRec
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip500041TableKey.initialize();
     
         setIp500041TableData(CONSTANTS.SPACE_27973);
   }

		public static int getIp500041OneDayRecFieldLength() {
			return IP_500041_ONE_DAY_REC_LENGTH;
		}

}
  

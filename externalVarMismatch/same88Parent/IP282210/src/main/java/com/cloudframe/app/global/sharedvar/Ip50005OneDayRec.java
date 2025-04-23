package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50005OneDayRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:30. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip50005OneDayRec")

public class Ip50005OneDayRec extends Ip50005OneDayRecSerialized  implements InitializingBean {
   
				private Ip50005TableKeyAll ip50005TableKeyAll = new Ip50005TableKeyAll();

						private char[] ip50005TableData = Field.fillLowValue(32730);
	
	/**
	* Constructor for Ip50005OneDayRec
	**/
    public Ip50005OneDayRec() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			ip50005TableKeyAll.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip50005TableKeyAll
	 *	@return ip50005TableKeyAll
	 */   
	 public Ip50005TableKeyAll getIp50005TableKeyAll() {
   	return ip50005TableKeyAll;
   }
   /**
	* 	Update Ip50005TableKeyAll with the passed value
	*   Corresponding COBOL Variable is IP50005-TABLE-KEY-ALL
	*	@param value
	*/
   public void setIp50005TableKeyAll(char[] value) {
      ip50005TableKeyAll.setString(value); 
   }   
    
     /**
	 * 	Update Ip50005TableKeyAll 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp50005TableKeyAll(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip50005TableKeyAll.begin,ip50005TableKeyAll.length());
   }
   
     /**
	 * 	Update Ip50005TableKeyAll 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50005TableKeyAll(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip50005TableKeyAll.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip50005TableKeyAll with another Field
	 *	@param value
	 */
   public void setIp50005TableKeyAll(Field source) {
   	replace(source,0,source.length(),ip50005TableKeyAll.begin,ip50005TableKeyAll.length());
   }  
   
     /**
	 * 	Update Ip50005TableKeyAll 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp50005TableKeyAll(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip50005TableKeyAll.begin,ip50005TableKeyAll.length());
   }
   
     /**
	 * 	Update Ip50005TableKeyAll 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50005TableKeyAll(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip50005TableKeyAll.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip50005TableData
	 *	@return ip50005TableData
	 */
   public char[] getIp50005TableData() throws CFException{
     if (isIp50005TableDataModified()) { 
        ip50005TableData = refreshIp50005TableData();
     }
   		return ip50005TableData;
   }

  
	/**
	*  set variable ip50005TableData
	*  Corresponding COBOL Variable is IP50005-TABLE-DATA
	*  @param value
	**/
   public void setIp50005TableData(char[] value) {
      ip50005TableData = checkIp50005TableDataConstraints(value);
      serializeIp50005TableData(ip50005TableData);
   } 

     /**
	 * 	Update Ip50005TableData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50005TableData(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50005TableData,ip50005TableData.length);
   	
   }
   
   public void setIp50005TableData(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50005TableData,ip50005TableData.length);
   	
   }
   
     /**
	 * 	Update Ip50005TableData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50005TableData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50005TableData+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50005TableData with another Field
	 *	@param value
	 */
   public void setIp50005TableData(Field source) {
       replace(source,0,source.length(),beginIp50005TableData,IP_50005_TABLE_DATA_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50005TableData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50005TableData(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50005TableData,IP_50005_TABLE_DATA_LEN);
   	
   }
   
     /**
	 * 	Update Ip50005TableData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50005TableData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50005TableData+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip50005OneDayRec
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip50005TableKeyAll.initialize();
     
         setIp50005TableData(CONSTANTS.SPACE_32730);
   }

		public static int getIp50005OneDayRecFieldLength() {
			return IP_50005_ONE_DAY_REC_LENGTH;
		}

}
  

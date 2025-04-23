package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50004iOneDayRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:09. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip50004iOneDayRec")

public class Ip50004iOneDayRec extends Ip50004iOneDayRecSerialized  implements InitializingBean {
   
				private Ip50004iTableKey ip50004iTableKey = new Ip50004iTableKey();

						private char[] ip50004iTableData = Field.fillLowValue(27973);
	
	/**
	* Constructor for Ip50004iOneDayRec
	**/
    public Ip50004iOneDayRec() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			ip50004iTableKey.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip50004iTableKey
	 *	@return ip50004iTableKey
	 */   
	 public Ip50004iTableKey getIp50004iTableKey() {
   	return ip50004iTableKey;
   }
   /**
	* 	Update Ip50004iTableKey with the passed value
	*   Corresponding COBOL Variable is IP50004I-TABLE-KEY
	*	@param value
	*/
   public void setIp50004iTableKey(char[] value) {
      ip50004iTableKey.setString(value); 
   }   
    
     /**
	 * 	Update Ip50004iTableKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp50004iTableKey(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip50004iTableKey.begin,ip50004iTableKey.length());
   }
   
     /**
	 * 	Update Ip50004iTableKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50004iTableKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip50004iTableKey.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip50004iTableKey with another Field
	 *	@param value
	 */
   public void setIp50004iTableKey(Field source) {
   	replace(source,0,source.length(),ip50004iTableKey.begin,ip50004iTableKey.length());
   }  
   
     /**
	 * 	Update Ip50004iTableKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp50004iTableKey(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip50004iTableKey.begin,ip50004iTableKey.length());
   }
   
     /**
	 * 	Update Ip50004iTableKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50004iTableKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip50004iTableKey.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip50004iTableData
	 *	@return ip50004iTableData
	 */
   public char[] getIp50004iTableData() throws CFException{
     if (isIp50004iTableDataModified()) { 
        ip50004iTableData = refreshIp50004iTableData();
     }
   		return ip50004iTableData;
   }

  
	/**
	*  set variable ip50004iTableData
	*  Corresponding COBOL Variable is IP50004I-TABLE-DATA
	*  @param value
	**/
   public void setIp50004iTableData(char[] value) {
      ip50004iTableData = checkIp50004iTableDataConstraints(value);
      serializeIp50004iTableData(ip50004iTableData);
   } 

     /**
	 * 	Update Ip50004iTableData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50004iTableData(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50004iTableData,ip50004iTableData.length);
   	
   }
   
   public void setIp50004iTableData(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50004iTableData,ip50004iTableData.length);
   	
   }
   
     /**
	 * 	Update Ip50004iTableData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50004iTableData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50004iTableData+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50004iTableData with another Field
	 *	@param value
	 */
   public void setIp50004iTableData(Field source) {
       replace(source,0,source.length(),beginIp50004iTableData,IP_50004I_TABLE_DATA_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50004iTableData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50004iTableData(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50004iTableData,IP_50004I_TABLE_DATA_LEN);
   	
   }
   
     /**
	 * 	Update Ip50004iTableData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50004iTableData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50004iTableData+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip50004iOneDayRec
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip50004iTableKey.initialize();
     
         setIp50004iTableData(CONSTANTS.SPACE_27973);
   }

		public static int getIp50004iOneDayRecFieldLength() {
			return IP_50004I_ONE_DAY_REC_LENGTH;
		}

}
  

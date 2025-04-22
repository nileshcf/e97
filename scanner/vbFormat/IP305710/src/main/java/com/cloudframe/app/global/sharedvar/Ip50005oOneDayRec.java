package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50005oOneDayRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:18. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip50005oOneDayRec")

public class Ip50005oOneDayRec extends Ip50005oOneDayRecSerialized  implements InitializingBean {
   
				private Ip50005oTableKeyAll ip50005oTableKeyAll = new Ip50005oTableKeyAll();

						private char[] ip50005oTableData = Field.fillLowValue(32730);
	
	/**
	* Constructor for Ip50005oOneDayRec
	**/
    public Ip50005oOneDayRec() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			ip50005oTableKeyAll.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip50005oTableKeyAll
	 *	@return ip50005oTableKeyAll
	 */   
	 public Ip50005oTableKeyAll getIp50005oTableKeyAll() {
   	return ip50005oTableKeyAll;
   }
   /**
	* 	Update Ip50005oTableKeyAll with the passed value
	*   Corresponding COBOL Variable is IP50005O-TABLE-KEY-ALL
	*	@param value
	*/
   public void setIp50005oTableKeyAll(char[] value) {
      ip50005oTableKeyAll.setString(value); 
   }   
    
     /**
	 * 	Update Ip50005oTableKeyAll 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp50005oTableKeyAll(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip50005oTableKeyAll.begin,ip50005oTableKeyAll.length());
   }
   
     /**
	 * 	Update Ip50005oTableKeyAll 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50005oTableKeyAll(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip50005oTableKeyAll.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip50005oTableKeyAll with another Field
	 *	@param value
	 */
   public void setIp50005oTableKeyAll(Field source) {
   	replace(source,0,source.length(),ip50005oTableKeyAll.begin,ip50005oTableKeyAll.length());
   }  
   
     /**
	 * 	Update Ip50005oTableKeyAll 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp50005oTableKeyAll(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip50005oTableKeyAll.begin,ip50005oTableKeyAll.length());
   }
   
     /**
	 * 	Update Ip50005oTableKeyAll 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50005oTableKeyAll(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip50005oTableKeyAll.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip50005oTableData
	 *	@return ip50005oTableData
	 */
   public char[] getIp50005oTableData() throws CFException{
     if (isIp50005oTableDataModified()) { 
        ip50005oTableData = refreshIp50005oTableData();
     }
   		return ip50005oTableData;
   }

  
	/**
	*  set variable ip50005oTableData
	*  Corresponding COBOL Variable is IP50005O-TABLE-DATA
	*  @param value
	**/
   public void setIp50005oTableData(char[] value) {
      ip50005oTableData = checkIp50005oTableDataConstraints(value);
      serializeIp50005oTableData(ip50005oTableData);
   } 

     /**
	 * 	Update Ip50005oTableData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50005oTableData(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50005oTableData,ip50005oTableData.length);
   	
   }
   
   public void setIp50005oTableData(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50005oTableData,ip50005oTableData.length);
   	
   }
   
     /**
	 * 	Update Ip50005oTableData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50005oTableData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50005oTableData+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50005oTableData with another Field
	 *	@param value
	 */
   public void setIp50005oTableData(Field source) {
       replace(source,0,source.length(),beginIp50005oTableData,IP_50005O_TABLE_DATA_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50005oTableData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50005oTableData(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50005oTableData,IP_50005O_TABLE_DATA_LEN);
   	
   }
   
     /**
	 * 	Update Ip50005oTableData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50005oTableData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50005oTableData+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip50005oOneDayRec
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip50005oTableKeyAll.initialize();
     
         setIp50005oTableData(CONSTANTS.SPACE_32730);
   }

		public static int getIp50005oOneDayRecFieldLength() {
			return IP_50005O_ONE_DAY_REC_LENGTH;
		}

}
  

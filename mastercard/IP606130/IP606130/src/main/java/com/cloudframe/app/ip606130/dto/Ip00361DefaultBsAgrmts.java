package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip00361DefaultBsAgrmts is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:17. using version 5.0.0.257
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip00361DefaultBsAgrmts extends Ip00361DefaultBsAgrmtsSerialized {
   

						private char[] ip00361TableData = Field.fillLowValue(17);
	
	/**
	* Constructor for Ip00361DefaultBsAgrmts
	**/
    public Ip00361DefaultBsAgrmts() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip00361TableData
	 *	@return ip00361TableData
	 */
   public char[] getIp00361TableData() throws CFException{
     if (isIp00361TableDataModified()) { 
        ip00361TableData = refreshIp00361TableData();
     }
   		return ip00361TableData;
   }

  
	/**
	*  set variable ip00361TableData
	*  Corresponding COBOL Variable is IP00361-TABLE-DATA
	*  @param value
	**/
   public void setIp00361TableData(char[] value) {
      ip00361TableData = checkIp00361TableDataConstraints(value);
      serializeIp00361TableData(ip00361TableData);
   } 

     /**
	 * 	Update Ip00361TableData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00361TableData(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00361TableData,ip00361TableData.length);
   	
   }
   
   public void setIp00361TableData(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00361TableData,ip00361TableData.length);
   	
   }
   
     /**
	 * 	Update Ip00361TableData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00361TableData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00361TableData+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00361TableData with another Field
	 *	@param value
	 */
   public void setIp00361TableData(Field source) {
       replace(source,0,source.length(),beginIp00361TableData,IP_00361_TABLE_DATA_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00361TableData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00361TableData(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00361TableData,IP_00361_TABLE_DATA_LEN);
   	
   }
   
     /**
	 * 	Update Ip00361TableData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00361TableData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00361TableData+targetIndex,targetLen);
    
   }

	
	
	

		public static int getIp00361DefaultBsAgrmtsFieldLength() {
			return IP_00361_DEFAULT_BS_AGRMTS_LENGTH;
		}

}
  

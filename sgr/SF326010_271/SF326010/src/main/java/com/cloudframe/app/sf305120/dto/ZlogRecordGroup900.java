package com.cloudframe.app.sf305120.dto;

/**
*  The class ZlogRecordGroup900 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:21. using version 5.0.0.257
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ZlogRecordGroup900 extends ZlogRecordGroup900Serialized {
   

						private char[] zlogRecord900 = Field.fillLowValue(8197);
	
	/**
	* Constructor for ZlogRecordGroup900
	**/
    public ZlogRecordGroup900() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of zlogRecord900
	 *	@return zlogRecord900
	 */
   public char[] getZlogRecord900() throws CFException{
     if (isZlogRecord900Modified()) { 
        zlogRecord900 = refreshZlogRecord900();
     }
   		return zlogRecord900;
   }

  
	/**
	*  set variable zlogRecord900
	*  Corresponding COBOL Variable is 900-ZLOG-RECORD
	*  @param value
	**/
   public void setZlogRecord900(char[] value) {
      zlogRecord900 = checkZlogRecord900Constraints(value);
      serializeZlogRecord900(zlogRecord900);
   } 

     /**
	 * 	Update ZlogRecord900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setZlogRecord900(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginZlogRecord900,zlogRecord900.length);
   	
   }
   
   public void setZlogRecord900(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginZlogRecord900,zlogRecord900.length);
   	
   }
   
     /**
	 * 	Update ZlogRecord900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setZlogRecord900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginZlogRecord900+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ZlogRecord900 with another Field
	 *	@param value
	 */
   public void setZlogRecord900(Field source) {
       replace(source,0,source.length(),beginZlogRecord900,ZLOG_RECORD_900_LEN);
   	
   }  
   
     /**
	 * 	Update ZlogRecord900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setZlogRecord900(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginZlogRecord900,ZLOG_RECORD_900_LEN);
   	
   }
   
     /**
	 * 	Update ZlogRecord900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setZlogRecord900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginZlogRecord900+targetIndex,targetLen);
    
   }

	
	
	

		public static int getZlogRecordGroup900FieldLength() {
			return ZLOG_RECORD_GROUP_900_LENGTH;
		}

}
  

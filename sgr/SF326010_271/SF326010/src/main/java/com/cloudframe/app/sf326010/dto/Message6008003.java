package com.cloudframe.app.sf326010.dto;

/**
*  The class Message6008003 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/


import com.cloudframe.app.sf326010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Message6008003 extends Message6008003Serialized { 
   


								private char[] sys201ZLogCnt6008003 = Field.fillLowValue(11);
	
	/**
	* Constructor for Message6008003
	**/
    public Message6008003() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("SF326010-8003  TOTAL Z-LOG REPORT RECORDS WRITTEN =   ").toCharArray()
             , getStartOffset() + 0
             ,54
             );
    }


 

	/**
	 *	Returns the value of sys201ZLogCnt6008003
	 *	@return sys201ZLogCnt6008003
	 */
   public char[] getSys201ZLogCnt6008003() throws CFException{
     if (isSys201ZLogCnt6008003Modified()) { 
        sys201ZLogCnt6008003 = refreshSys201ZLogCnt6008003();
     }
   		return sys201ZLogCnt6008003;
   }

  
	/**
	*  set variable sys201ZLogCnt6008003
	*  Corresponding COBOL Variable is 600-8003-SYS201-Z-LOG-CNT
	*  @param value
	**/
   public void setSys201ZLogCnt6008003(char[] value) {
      sys201ZLogCnt6008003 = checkSys201ZLogCnt6008003Constraints(value);
      serializeSys201ZLogCnt6008003(sys201ZLogCnt6008003);
   } 

     /**
	 * 	Update Sys201ZLogCnt6008003 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys201ZLogCnt6008003(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys201ZLogCnt6008003,sys201ZLogCnt6008003.length);
   	
   }
   
   public void setSys201ZLogCnt6008003(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys201ZLogCnt6008003,sys201ZLogCnt6008003.length);
   	
   }
   
     /**
	 * 	Update Sys201ZLogCnt6008003 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys201ZLogCnt6008003(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys201ZLogCnt6008003+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys201ZLogCnt6008003 with another Field
	 *	@param value
	 */
   public void setSys201ZLogCnt6008003(Field source) {
       replace(source,0,source.length(),beginSys201ZLogCnt6008003,SYS_201_ZLOG_CNT_6008003_LEN);
   	
   }  
   
     /**
	 * 	Update Sys201ZLogCnt6008003 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys201ZLogCnt6008003(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys201ZLogCnt6008003,SYS_201_ZLOG_CNT_6008003_LEN);
   	
   }
   
     /**
	 * 	Update Sys201ZLogCnt6008003 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys201ZLogCnt6008003(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys201ZLogCnt6008003+targetIndex,targetLen);
    
   }

	
	
	

		public static int getMessage6008003FieldLength() {
			return MESSAGE_6008003_LENGTH;
		}

}
  

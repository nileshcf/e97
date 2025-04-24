package com.cloudframe.app.sf326010.dto;

/**
*  The class Message6008002 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/


import com.cloudframe.app.sf326010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Message6008002 extends Message6008002Serialized { 
   


								private char[] sys201ZLogCnt6008002 = Field.fillLowValue(11);
	
	/**
	* Constructor for Message6008002
	**/
    public Message6008002() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("SF326010-8002  TOTAL Z-LOG BYPASSED (ZA,ZB,ZN)    =   ").toCharArray()
             , getStartOffset() + 0
             ,54
             );
    }


 

	/**
	 *	Returns the value of sys201ZLogCnt6008002
	 *	@return sys201ZLogCnt6008002
	 */
   public char[] getSys201ZLogCnt6008002() throws CFException{
     if (isSys201ZLogCnt6008002Modified()) { 
        sys201ZLogCnt6008002 = refreshSys201ZLogCnt6008002();
     }
   		return sys201ZLogCnt6008002;
   }

  
	/**
	*  set variable sys201ZLogCnt6008002
	*  Corresponding COBOL Variable is 600-8002-SYS201-Z-LOG-CNT
	*  @param value
	**/
   public void setSys201ZLogCnt6008002(char[] value) {
      sys201ZLogCnt6008002 = checkSys201ZLogCnt6008002Constraints(value);
      serializeSys201ZLogCnt6008002(sys201ZLogCnt6008002);
   } 

     /**
	 * 	Update Sys201ZLogCnt6008002 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys201ZLogCnt6008002(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys201ZLogCnt6008002,sys201ZLogCnt6008002.length);
   	
   }
   
   public void setSys201ZLogCnt6008002(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys201ZLogCnt6008002,sys201ZLogCnt6008002.length);
   	
   }
   
     /**
	 * 	Update Sys201ZLogCnt6008002 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys201ZLogCnt6008002(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys201ZLogCnt6008002+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys201ZLogCnt6008002 with another Field
	 *	@param value
	 */
   public void setSys201ZLogCnt6008002(Field source) {
       replace(source,0,source.length(),beginSys201ZLogCnt6008002,SYS_201_ZLOG_CNT_6008002_LEN);
   	
   }  
   
     /**
	 * 	Update Sys201ZLogCnt6008002 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys201ZLogCnt6008002(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys201ZLogCnt6008002,SYS_201_ZLOG_CNT_6008002_LEN);
   	
   }
   
     /**
	 * 	Update Sys201ZLogCnt6008002 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys201ZLogCnt6008002(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys201ZLogCnt6008002+targetIndex,targetLen);
    
   }

	
	
	

		public static int getMessage6008002FieldLength() {
			return MESSAGE_6008002_LENGTH;
		}

}
  

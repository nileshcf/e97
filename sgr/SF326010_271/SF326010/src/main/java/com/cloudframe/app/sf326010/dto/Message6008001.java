package com.cloudframe.app.sf326010.dto;

/**
*  The class Message6008001 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/


import com.cloudframe.app.sf326010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Message6008001 extends Message6008001Serialized { 
   


								private char[] sys001MipLogCnt6008001 = Field.fillLowValue(11);
	
	/**
	* Constructor for Message6008001
	**/
    public Message6008001() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("SF326010-8001  TOTAL MIP-LOG  FILE RECORDS READ   =   ").toCharArray()
             , getStartOffset() + 0
             ,54
             );
    }


 

	/**
	 *	Returns the value of sys001MipLogCnt6008001
	 *	@return sys001MipLogCnt6008001
	 */
   public char[] getSys001MipLogCnt6008001() throws CFException{
     if (isSys001MipLogCnt6008001Modified()) { 
        sys001MipLogCnt6008001 = refreshSys001MipLogCnt6008001();
     }
   		return sys001MipLogCnt6008001;
   }

  
	/**
	*  set variable sys001MipLogCnt6008001
	*  Corresponding COBOL Variable is 600-8001-SYS001-MIP-LOG-CNT
	*  @param value
	**/
   public void setSys001MipLogCnt6008001(char[] value) {
      sys001MipLogCnt6008001 = checkSys001MipLogCnt6008001Constraints(value);
      serializeSys001MipLogCnt6008001(sys001MipLogCnt6008001);
   } 

     /**
	 * 	Update Sys001MipLogCnt6008001 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001MipLogCnt6008001(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys001MipLogCnt6008001,sys001MipLogCnt6008001.length);
   	
   }
   
   public void setSys001MipLogCnt6008001(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys001MipLogCnt6008001,sys001MipLogCnt6008001.length);
   	
   }
   
     /**
	 * 	Update Sys001MipLogCnt6008001 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001MipLogCnt6008001(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001MipLogCnt6008001+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys001MipLogCnt6008001 with another Field
	 *	@param value
	 */
   public void setSys001MipLogCnt6008001(Field source) {
       replace(source,0,source.length(),beginSys001MipLogCnt6008001,SYS_001_MIP_LOG_CNT_6008001_LEN);
   	
   }  
   
     /**
	 * 	Update Sys001MipLogCnt6008001 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001MipLogCnt6008001(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys001MipLogCnt6008001,SYS_001_MIP_LOG_CNT_6008001_LEN);
   	
   }
   
     /**
	 * 	Update Sys001MipLogCnt6008001 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001MipLogCnt6008001(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001MipLogCnt6008001+targetIndex,targetLen);
    
   }

	
	
	

		public static int getMessage6008001FieldLength() {
			return MESSAGE_6008001_LENGTH;
		}

}
  

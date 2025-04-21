package com.cloudframe.app.ip088030.dto;

/**
*  The class MsgsRead600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:11. using version 5.0.0.256
**/


import com.cloudframe.app.ip088030.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MsgsRead600 extends MsgsRead600Serialized {
   


								private char[] readCnt600 = Field.fillLowValue(11);
	
	/**
	* Constructor for MsgsRead600
	**/
    public MsgsRead600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("IP088030-NO. OF RECS READ    =  ").toCharArray()
             , getStartOffset() + 0
             ,32
             );
    }


 

	/**
	 *	Returns the value of readCnt600
	 *	@return readCnt600
	 */
   public char[] getReadCnt600() throws CFException{
     if (isReadCnt600Modified()) { 
        readCnt600 = refreshReadCnt600();
     }
   		return readCnt600;
   }

  
	/**
	*  set variable readCnt600
	*  Corresponding COBOL Variable is 600-READ-CNT
	*  @param value
	**/
   public void setReadCnt600(char[] value) {
      readCnt600 = checkReadCnt600Constraints(value);
      serializeReadCnt600(readCnt600);
   } 

     /**
	 * 	Update ReadCnt600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setReadCnt600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginReadCnt600,readCnt600.length);
   	
   }
   
   public void setReadCnt600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginReadCnt600,readCnt600.length);
   	
   }
   
     /**
	 * 	Update ReadCnt600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setReadCnt600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginReadCnt600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ReadCnt600 with another Field
	 *	@param value
	 */
   public void setReadCnt600(Field source) {
       replace(source,0,source.length(),beginReadCnt600,READ_CNT_600_LEN);
   	
   }  
   
     /**
	 * 	Update ReadCnt600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setReadCnt600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginReadCnt600,READ_CNT_600_LEN);
   	
   }
   
     /**
	 * 	Update ReadCnt600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setReadCnt600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginReadCnt600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getMsgsRead600FieldLength() {
			return MSGS_READ_600_LENGTH;
		}

}
  

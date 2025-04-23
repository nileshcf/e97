package com.cloudframe.app.ip088030.dto;

/**
*  The class MsgsWrite600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:08. using version 5.0.0.254
**/


import com.cloudframe.app.ip088030.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MsgsWrite600 extends MsgsWrite600Serialized {
   


								private char[] writeCnt600 = Field.fillLowValue(11);
	
	/**
	* Constructor for MsgsWrite600
	**/
    public MsgsWrite600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("IP088030-NO. OF RECS WRITTEN =  ").toCharArray()
             , getStartOffset() + 0
             ,32
             );
    }


 

	/**
	 *	Returns the value of writeCnt600
	 *	@return writeCnt600
	 */
   public char[] getWriteCnt600() throws CFException{
     if (isWriteCnt600Modified()) { 
        writeCnt600 = refreshWriteCnt600();
     }
   		return writeCnt600;
   }

  
	/**
	*  set variable writeCnt600
	*  Corresponding COBOL Variable is 600-WRITE-CNT
	*  @param value
	**/
   public void setWriteCnt600(char[] value) {
      writeCnt600 = checkWriteCnt600Constraints(value);
      serializeWriteCnt600(writeCnt600);
   } 

     /**
	 * 	Update WriteCnt600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWriteCnt600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWriteCnt600,writeCnt600.length);
   	
   }
   
   public void setWriteCnt600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWriteCnt600,writeCnt600.length);
   	
   }
   
     /**
	 * 	Update WriteCnt600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWriteCnt600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWriteCnt600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WriteCnt600 with another Field
	 *	@param value
	 */
   public void setWriteCnt600(Field source) {
       replace(source,0,source.length(),beginWriteCnt600,WRITE_CNT_600_LEN);
   	
   }  
   
     /**
	 * 	Update WriteCnt600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWriteCnt600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWriteCnt600,WRITE_CNT_600_LEN);
   	
   }
   
     /**
	 * 	Update WriteCnt600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWriteCnt600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWriteCnt600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getMsgsWrite600FieldLength() {
			return MSGS_WRITE_600_LENGTH;
		}

}
  

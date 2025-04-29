package com.cloudframe.app.ip606130.dto;

/**
*  The class Tbl91OriginalTrlrMsg600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:24. using version 5.0.0.254
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.data.Field;


public class Tbl91OriginalTrlrMsg600 extends Tbl91OriginalTrlrMsg600Serialized {
   


								private char[] table91OriginalCount600 = new char[10];
							
	
	/**
	* Constructor for Tbl91OriginalTrlrMsg600
	**/
    public Tbl91OriginalTrlrMsg600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("ORIGINAL TABLE91 TRAILER RECORD COUNT      :").toCharArray()
             , getStartOffset() + 0
             ,44
             );
								setTable91OriginalCount600(CFUtil.cobolNumberFormatter("ZZ,ZZZ,ZZ9".toCharArray(),"0".toCharArray()));
    }


 

	/**
	 *	Returns the value of table91OriginalCount600
	 *	@return table91OriginalCount600
	 */
   public char[] getTable91OriginalCount600() throws CFException{
     if (isTable91OriginalCount600Modified()) { 
        table91OriginalCount600 = refreshTable91OriginalCount600();
     }
   		return table91OriginalCount600;
   }

  
	/**
	*  set variable table91OriginalCount600
	*  Corresponding COBOL Variable is 600-TABLE91-ORIGINAL-COUNT
	*  @param value
	**/
   public void setTable91OriginalCount600(char[] value) {
      table91OriginalCount600 = checkTable91OriginalCount600Constraints(value);
      serializeTable91OriginalCount600(table91OriginalCount600);
   } 

     /**
	 * 	Update Table91OriginalCount600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTable91OriginalCount600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTable91OriginalCount600,table91OriginalCount600.length);
   	
   }
   
   public void setTable91OriginalCount600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTable91OriginalCount600,table91OriginalCount600.length);
   	
   }
   
     /**
	 * 	Update Table91OriginalCount600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTable91OriginalCount600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTable91OriginalCount600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Table91OriginalCount600 with another Field
	 *	@param value
	 */
   public void setTable91OriginalCount600(Field source) {
       replace(source,0,source.length(),beginTable91OriginalCount600,TABLE_91_ORIGINAL_COUNT_600_LEN);
   	
   }  
   
     /**
	 * 	Update Table91OriginalCount600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTable91OriginalCount600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTable91OriginalCount600,TABLE_91_ORIGINAL_COUNT_600_LEN);
   	
   }
   
     /**
	 * 	Update Table91OriginalCount600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTable91OriginalCount600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTable91OriginalCount600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTbl91OriginalTrlrMsg600FieldLength() {
			return TBL_91_ORIGINAL_TRLR_MSG_600_LENGTH;
		}

}
  

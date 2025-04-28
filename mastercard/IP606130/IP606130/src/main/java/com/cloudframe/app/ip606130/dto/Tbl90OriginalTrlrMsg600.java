package com.cloudframe.app.ip606130.dto;

/**
*  The class Tbl90OriginalTrlrMsg600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:54. using version 5.0.0.256
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.data.Field;


public class Tbl90OriginalTrlrMsg600 extends Tbl90OriginalTrlrMsg600Serialized {
   


								private char[] table90OriginalCount600 = new char[10];
							
	
	/**
	* Constructor for Tbl90OriginalTrlrMsg600
	**/
    public Tbl90OriginalTrlrMsg600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("ORIGINAL TABLE90 TRAILER RECORD COUNT      :").toCharArray()
             , getStartOffset() + 0
             ,44
             );
								setTable90OriginalCount600(CFUtil.cobolNumberFormatter("ZZ,ZZZ,ZZ9".toCharArray(),"0".toCharArray()));
    }


 

	/**
	 *	Returns the value of table90OriginalCount600
	 *	@return table90OriginalCount600
	 */
   public char[] getTable90OriginalCount600() throws CFException{
     if (isTable90OriginalCount600Modified()) { 
        table90OriginalCount600 = refreshTable90OriginalCount600();
     }
   		return table90OriginalCount600;
   }

  
	/**
	*  set variable table90OriginalCount600
	*  Corresponding COBOL Variable is 600-TABLE90-ORIGINAL-COUNT
	*  @param value
	**/
   public void setTable90OriginalCount600(char[] value) {
      table90OriginalCount600 = checkTable90OriginalCount600Constraints(value);
      serializeTable90OriginalCount600(table90OriginalCount600);
   } 

     /**
	 * 	Update Table90OriginalCount600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTable90OriginalCount600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTable90OriginalCount600,table90OriginalCount600.length);
   	
   }
   
   public void setTable90OriginalCount600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTable90OriginalCount600,table90OriginalCount600.length);
   	
   }
   
     /**
	 * 	Update Table90OriginalCount600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTable90OriginalCount600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTable90OriginalCount600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Table90OriginalCount600 with another Field
	 *	@param value
	 */
   public void setTable90OriginalCount600(Field source) {
       replace(source,0,source.length(),beginTable90OriginalCount600,TABLE_90_ORIGINAL_COUNT_600_LEN);
   	
   }  
   
     /**
	 * 	Update Table90OriginalCount600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTable90OriginalCount600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTable90OriginalCount600,TABLE_90_ORIGINAL_COUNT_600_LEN);
   	
   }
   
     /**
	 * 	Update Table90OriginalCount600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTable90OriginalCount600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTable90OriginalCount600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTbl90OriginalTrlrMsg600FieldLength() {
			return TBL_90_ORIGINAL_TRLR_MSG_600_LENGTH;
		}

}
  

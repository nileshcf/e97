package com.cloudframe.app.ip606130.dto;

/**
*  The class Tbl91UpdatedTrlrMsg600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:57. using version 5.0.0.256
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.data.Field;


public class Tbl91UpdatedTrlrMsg600 extends Tbl91UpdatedTrlrMsg600Serialized { 
   


								private char[] table91UpdateCount600 = new char[10];
							
	
	/**
	* Constructor for Tbl91UpdatedTrlrMsg600
	**/
    public Tbl91UpdatedTrlrMsg600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("UPDATED  TABLE91 TRAILER RECORD COUNT      :").toCharArray()
             , getStartOffset() + 0
             ,44
             );
								setTable91UpdateCount600(CFUtil.cobolNumberFormatter("ZZ,ZZZ,ZZ9".toCharArray(),"0".toCharArray()));
    }


 

	/**
	 *	Returns the value of table91UpdateCount600
	 *	@return table91UpdateCount600
	 */
   public char[] getTable91UpdateCount600() throws CFException{
     if (isTable91UpdateCount600Modified()) { 
        table91UpdateCount600 = refreshTable91UpdateCount600();
     }
   		return table91UpdateCount600;
   }

  
	/**
	*  set variable table91UpdateCount600
	*  Corresponding COBOL Variable is 600-TABLE91-UPDATE-COUNT
	*  @param value
	**/
   public void setTable91UpdateCount600(char[] value) {
      table91UpdateCount600 = checkTable91UpdateCount600Constraints(value);
      serializeTable91UpdateCount600(table91UpdateCount600);
   } 

     /**
	 * 	Update Table91UpdateCount600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTable91UpdateCount600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTable91UpdateCount600,table91UpdateCount600.length);
   	
   }
   
   public void setTable91UpdateCount600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTable91UpdateCount600,table91UpdateCount600.length);
   	
   }
   
     /**
	 * 	Update Table91UpdateCount600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTable91UpdateCount600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTable91UpdateCount600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Table91UpdateCount600 with another Field
	 *	@param value
	 */
   public void setTable91UpdateCount600(Field source) {
       replace(source,0,source.length(),beginTable91UpdateCount600,TABLE_91_UPDATE_COUNT_600_LEN);
   	
   }  
   
     /**
	 * 	Update Table91UpdateCount600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTable91UpdateCount600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTable91UpdateCount600,TABLE_91_UPDATE_COUNT_600_LEN);
   	
   }
   
     /**
	 * 	Update Table91UpdateCount600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTable91UpdateCount600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTable91UpdateCount600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTbl91UpdatedTrlrMsg600FieldLength() {
			return TBL_91_UPDATED_TRLR_MSG_600_LENGTH;
		}

}
  

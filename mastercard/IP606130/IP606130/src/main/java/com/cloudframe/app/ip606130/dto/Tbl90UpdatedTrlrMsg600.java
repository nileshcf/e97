package com.cloudframe.app.ip606130.dto;

/**
*  The class Tbl90UpdatedTrlrMsg600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:55. using version 5.0.0.256
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.data.Field;


public class Tbl90UpdatedTrlrMsg600 extends Tbl90UpdatedTrlrMsg600Serialized {
   


								private char[] table90UpdateCount600 = new char[10];
							
	
	/**
	* Constructor for Tbl90UpdatedTrlrMsg600
	**/
    public Tbl90UpdatedTrlrMsg600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("UPDATED  TABLE90 TRAILER RECORD COUNT      :").toCharArray()
             , getStartOffset() + 0
             ,44
             );
								setTable90UpdateCount600(CFUtil.cobolNumberFormatter("ZZ,ZZZ,ZZ9".toCharArray(),"0".toCharArray()));
    }


 

	/**
	 *	Returns the value of table90UpdateCount600
	 *	@return table90UpdateCount600
	 */
   public char[] getTable90UpdateCount600() throws CFException{
     if (isTable90UpdateCount600Modified()) { 
        table90UpdateCount600 = refreshTable90UpdateCount600();
     }
   		return table90UpdateCount600;
   }

  
	/**
	*  set variable table90UpdateCount600
	*  Corresponding COBOL Variable is 600-TABLE90-UPDATE-COUNT
	*  @param value
	**/
   public void setTable90UpdateCount600(char[] value) {
      table90UpdateCount600 = checkTable90UpdateCount600Constraints(value);
      serializeTable90UpdateCount600(table90UpdateCount600);
   } 

     /**
	 * 	Update Table90UpdateCount600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTable90UpdateCount600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTable90UpdateCount600,table90UpdateCount600.length);
   	
   }
   
   public void setTable90UpdateCount600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTable90UpdateCount600,table90UpdateCount600.length);
   	
   }
   
     /**
	 * 	Update Table90UpdateCount600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTable90UpdateCount600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTable90UpdateCount600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Table90UpdateCount600 with another Field
	 *	@param value
	 */
   public void setTable90UpdateCount600(Field source) {
       replace(source,0,source.length(),beginTable90UpdateCount600,TABLE_90_UPDATE_COUNT_600_LEN);
   	
   }  
   
     /**
	 * 	Update Table90UpdateCount600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTable90UpdateCount600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTable90UpdateCount600,TABLE_90_UPDATE_COUNT_600_LEN);
   	
   }
   
     /**
	 * 	Update Table90UpdateCount600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTable90UpdateCount600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTable90UpdateCount600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTbl90UpdatedTrlrMsg600FieldLength() {
			return TBL_90_UPDATED_TRLR_MSG_600_LENGTH;
		}

}
  

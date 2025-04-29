package com.cloudframe.app.ip299010.dto;

/**
*  The class Table5Key1800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:16. using version 5.0.0.257
**/


import com.cloudframe.app.ip299010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Table5Key1800 extends Table5Key1800Serialized {
   

						private char[] tableId800 = new char[8];

	
	/**
	* Constructor for Table5Key1800
	**/
    public Table5Key1800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setTableId800(fillSpace(8));
       replaceValue( // serialize and save the value
             getBinaryString((long)0L,4)
             , getStartOffset() + 8
             ,4
             );
    }


 

	/**
	 *	Returns the value of tableId800
	 *	@return tableId800
	 */
   public char[] getTableId800() throws CFException{
     if (isTableId800Modified()) { 
        tableId800 = refreshTableId800();
     }
   		return tableId800;
   }

  
	/**
	*  set variable tableId800
	*  Corresponding COBOL Variable is 800-TABLE-ID
	*  @param value
	**/
   public void setTableId800(char[] value) {
      tableId800 = checkTableId800Constraints(value);
      serializeTableId800(tableId800);
   } 

     /**
	 * 	Update TableId800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTableId800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTableId800,tableId800.length);
   	
   }
   
   public void setTableId800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTableId800,tableId800.length);
   	
   }
   
     /**
	 * 	Update TableId800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTableId800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTableId800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TableId800 with another Field
	 *	@param value
	 */
   public void setTableId800(Field source) {
       replace(source,0,source.length(),beginTableId800,TABLE_ID_800_LEN);
   	
   }  
   
     /**
	 * 	Update TableId800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTableId800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTableId800,TABLE_ID_800_LEN);
   	
   }
   
     /**
	 * 	Update TableId800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTableId800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTableId800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTable5Key1800FieldLength() {
			return TABLE_5_KEY_1800_LENGTH;
		}

}
  

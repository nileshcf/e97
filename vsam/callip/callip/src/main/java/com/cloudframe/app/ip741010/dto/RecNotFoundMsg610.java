package com.cloudframe.app.ip741010.dto;

/**
*  The class RecNotFoundMsg610 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:08. using version 5.0.0.254
**/


import com.cloudframe.app.ip741010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RecNotFoundMsg610 extends RecNotFoundMsg610Serialized {
   


						private char[] tableId610 = new char[8];

	
	/**
	* Constructor for RecNotFoundMsg610
	**/
    public RecNotFoundMsg610() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("NO TABLE ").toCharArray()
             , getStartOffset() + 0
             ,9
             );
								setTableId610(fillSpace(8));
       replaceValue( // serialize and save the value
             (" RECORDS FOUND IN ONE-DAY-FILE ").toCharArray()
             , getStartOffset() + 17
             ,31
             );
    }


 

	/**
	 *	Returns the value of tableId610
	 *	@return tableId610
	 */
   public char[] getTableId610() throws CFException{
     if (isTableId610Modified()) { 
        tableId610 = refreshTableId610();
     }
   		return tableId610;
   }

  
	/**
	*  set variable tableId610
	*  Corresponding COBOL Variable is 610-TABLE-ID
	*  @param value
	**/
   public void setTableId610(char[] value) {
      tableId610 = checkTableId610Constraints(value);
      serializeTableId610(tableId610);
   } 

     /**
	 * 	Update TableId610 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTableId610(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTableId610,tableId610.length);
   	
   }
   
   public void setTableId610(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTableId610,tableId610.length);
   	
   }
   
     /**
	 * 	Update TableId610 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTableId610(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTableId610+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TableId610 with another Field
	 *	@param value
	 */
   public void setTableId610(Field source) {
       replace(source,0,source.length(),beginTableId610,TABLE_ID_610_LEN);
   	
   }  
   
     /**
	 * 	Update TableId610 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTableId610(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTableId610,TABLE_ID_610_LEN);
   	
   }
   
     /**
	 * 	Update TableId610 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTableId610(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTableId610+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRecNotFoundMsg610FieldLength() {
			return REC_NOT_FOUND_MSG_610_LENGTH;
		}

}
  

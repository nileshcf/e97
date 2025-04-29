package com.cloudframe.app.ip299010.dto;

/**
*  The class TblEntryNotFoundMsg650 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:16. using version 5.0.0.257
**/


import com.cloudframe.app.ip299010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class TblEntryNotFoundMsg650 extends TblEntryNotFoundMsg650Serialized {
   


						private char[] tableId650 = new char[8];


						private char[] effDtTm650 = new char[10];

	
	/**
	* Constructor for TblEntryNotFoundMsg650
	**/
    public TblEntryNotFoundMsg650() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("NO TABLE ").toCharArray()
             , getStartOffset() + 0
             ,9
             );
								setTableId650(fillSpace(8));
       replaceValue( // serialize and save the value
             (" RECORDS FOUND ON TABLE 5 FOR ").toCharArray()
             , getStartOffset() + 17
             ,30
             );
								setEffDtTm650(fillSpace(10));
       replaceValue( // serialize and save the value
             (" EFFECTIVE DATE AND TIME.").toCharArray()
             , getStartOffset() + 57
             ,25
             );
    }


 

	/**
	 *	Returns the value of tableId650
	 *	@return tableId650
	 */
   public char[] getTableId650() throws CFException{
     if (isTableId650Modified()) { 
        tableId650 = refreshTableId650();
     }
   		return tableId650;
   }

  
	/**
	*  set variable tableId650
	*  Corresponding COBOL Variable is 650-TABLE-ID
	*  @param value
	**/
   public void setTableId650(char[] value) {
      tableId650 = checkTableId650Constraints(value);
      serializeTableId650(tableId650);
   } 

     /**
	 * 	Update TableId650 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTableId650(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTableId650,tableId650.length);
   	
   }
   
   public void setTableId650(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTableId650,tableId650.length);
   	
   }
   
     /**
	 * 	Update TableId650 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTableId650(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTableId650+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TableId650 with another Field
	 *	@param value
	 */
   public void setTableId650(Field source) {
       replace(source,0,source.length(),beginTableId650,TABLE_ID_650_LEN);
   	
   }  
   
     /**
	 * 	Update TableId650 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTableId650(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTableId650,TABLE_ID_650_LEN);
   	
   }
   
     /**
	 * 	Update TableId650 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTableId650(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTableId650+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of effDtTm650
	 *	@return effDtTm650
	 */
   public char[] getEffDtTm650() throws CFException{
     if (isEffDtTm650Modified()) { 
        effDtTm650 = refreshEffDtTm650();
     }
   		return effDtTm650;
   }

  
	/**
	*  set variable effDtTm650
	*  Corresponding COBOL Variable is 650-EFF-DT-TM
	*  @param value
	**/
   public void setEffDtTm650(char[] value) {
      effDtTm650 = checkEffDtTm650Constraints(value);
      serializeEffDtTm650(effDtTm650);
   } 

     /**
	 * 	Update EffDtTm650 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEffDtTm650(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEffDtTm650,effDtTm650.length);
   	
   }
   
   public void setEffDtTm650(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEffDtTm650,effDtTm650.length);
   	
   }
   
     /**
	 * 	Update EffDtTm650 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEffDtTm650(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEffDtTm650+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EffDtTm650 with another Field
	 *	@param value
	 */
   public void setEffDtTm650(Field source) {
       replace(source,0,source.length(),beginEffDtTm650,EFF_DT_TM_650_LEN);
   	
   }  
   
     /**
	 * 	Update EffDtTm650 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEffDtTm650(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEffDtTm650,EFF_DT_TM_650_LEN);
   	
   }
   
     /**
	 * 	Update EffDtTm650 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEffDtTm650(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEffDtTm650+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTblEntryNotFoundMsg650FieldLength() {
			return TBL_ENTRY_NOT_FOUND_MSG_650_LENGTH;
		}

}
  

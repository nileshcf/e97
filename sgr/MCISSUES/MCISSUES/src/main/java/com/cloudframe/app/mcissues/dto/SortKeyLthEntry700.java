package com.cloudframe.app.mcissues.dto;

/**
*  The class SortKeyLthEntry700 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/


import com.cloudframe.app.mcissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SortKeyLthEntry700 extends SortKeyLthEntry700Serialized { 
   

						private char[] tableId700 = Field.fillLowValue(8);
	
	/**
	* Constructor for SortKeyLthEntry700
	**/
    public SortKeyLthEntry700() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SortKeyLthEntry700. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SortKeyLthEntry700(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of tableId700
	 *	@return tableId700
	 */
   public char[] getTableId700() throws CFException{
     if (isTableId700Modified()) { 
        tableId700 = refreshTableId700();
     }
   		return tableId700;
   }

  
	/**
	*  set variable tableId700
	*  Corresponding COBOL Variable is 700-TABLE-ID
	*  @param value
	**/
   public void setTableId700(char[] value) {
      tableId700 = checkTableId700Constraints(value);
      serializeTableId700(tableId700);
   } 

     /**
	 * 	Update TableId700 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTableId700(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTableId700,tableId700.length);
   	
   }
   
   public void setTableId700(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTableId700,tableId700.length);
   	
   }
   
     /**
	 * 	Update TableId700 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTableId700(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTableId700+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TableId700 with another Field
	 *	@param value
	 */
   public void setTableId700(Field source) {
       replace(source,0,source.length(),beginTableId700,TABLE_ID_700_LEN);
   	
   }  
   
     /**
	 * 	Update TableId700 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTableId700(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTableId700,TABLE_ID_700_LEN);
   	
   }
   
     /**
	 * 	Update TableId700 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTableId700(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTableId700+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSortKeyLthEntry700FieldLength() {
			return SORT_KEY_LTH_ENTRY_700_LENGTH;
		}

}
  

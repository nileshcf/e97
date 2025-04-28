package com.cloudframe.app.o529351u.dto;

/**
*  The class TableItem is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:58. using version 5.0.0.256
**/


import com.cloudframe.app.o529351u.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class TableItem extends TableItemSerialized { 
   

								private long genericTransl;
	
	/**
	* Constructor for TableItem
	**/
    public TableItem() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for TableItem. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TableItem(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of genericTransl
	 *	@return genericTransl
	 */
	public long getGenericTransl() throws CFException {
       if (isGenericTranslModified()) { 
           genericTransl = refreshGenericTransl();
        }
   		return genericTransl;
	}
	

	
	   
	/**
	 * 	Update GenericTransl with the passed value
	 *  Corresponding COBOL Variable is WS-GENERIC-TRANSL
	 *	@param number
	 */
	public void setGenericTransl(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    genericTransl = checkGenericTranslMaxLimit(number); 
		serializeGenericTransl(genericTransl);
	}
	

	/**
	 * 	Update GenericTransl with the passed value
	 *	@param value (String or char[])
	 */
	public void setGenericTransl(char[] value) throws CFException {
		 genericTransl = serializeGenericTransl(value);
	}
	/**
	 * 	Update GenericTransl with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setGenericTranslString(char[] value) throws CFException {
		 setGenericTransl(value);
	}

	
	
	

		public static int getTableItemFieldLength() {
			return TABLE_ITEM_LENGTH;
		}

}
  

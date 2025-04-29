package com.cloudframe.app.mcsort01.dto;

/**
*  The class SortKeyLthEntry700 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:22. using version 5.0.0.257
**/


import com.cloudframe.app.mcsort01.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SortKeyLthEntry700 extends SortKeyLthEntry700Serialized { 
   

								private long tableLt700;
	
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
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setTableLt700(0L);
    } 

	/**
	 *	Returns the value of tableLt700
	 *	@return tableLt700
	 */
	public long getTableLt700() throws CFException {
       if (isTableLt700Modified()) { 
           tableLt700 = refreshTableLt700();
        }
   		return tableLt700;
	}
	

	
	   
	/**
	 * 	Update TableLt700 with the passed value
	 *  Corresponding COBOL Variable is 700-TABLE-LT
	 *	@param number
	 */
	public void setTableLt700(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    tableLt700 = checkTableLt700MaxLimit(number); 
		serializeTableLt700(tableLt700);
	}
	

	/**
	 * 	Update TableLt700 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTableLt700(char[] value) throws CFException {
		 tableLt700 = serializeTableLt700(value);
	}
	/**
	 * 	Update TableLt700 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTableLt700String(char[] value) throws CFException {
		 setTableLt700(value);
	}

	
	
	

		public static int getSortKeyLthEntry700FieldLength() {
			return SORT_KEY_LTH_ENTRY_700_LENGTH;
		}

}
  

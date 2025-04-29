package com.cloudframe.app.ip200090.dto;

/**
*  The class EditType23InfoTable500Redefined01 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:31. using version 5.0.0.254
**/


import com.cloudframe.app.ip200090.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;


public class EditType23InfoTable500Redefined01 extends EditType23InfoTable500Redefined01Serialized { 
   
			private List<SyntaxEditInfoEntry500> syntaxEditInfoEntry500 = new ArrayList<>();
    	
	
	/**
	* Constructor for EditType23InfoTable500Redefined01
	**/
    public EditType23InfoTable500Redefined01() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for EditType23InfoTable500Redefined01. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public EditType23InfoTable500Redefined01(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of syntaxEditInfoEntry500
	 *  Corresponding COBOL Variable is 500-SYNTAX-EDIT-INFO-ENTRY
	 *	@return syntaxEditInfoEntry500
	 */
   public List<SyntaxEditInfoEntry500> getSyntaxEditInfoEntry500() {
       return syntaxEditInfoEntry500;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return syntaxEditInfoEntry500
	 */
	public SyntaxEditInfoEntry500 getSyntaxEditInfoEntry500(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getSyntaxEditInfoEntry500(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= SYNTAX_EDIT_INFO_ENTRY_500_SIZE) {
             	index = SYNTAX_EDIT_INFO_ENTRY_500_SIZE -1; // can't exceed max array size
             	logger.trace("syntaxEditInfoEntry500 - Array index exceeded max Size {}, resetting it to max allowed",SYNTAX_EDIT_INFO_ENTRY_500_SIZE); 
	    }
		if (index >= syntaxEditInfoEntry500.size()) {
       		for (int fillIndex =  syntaxEditInfoEntry500.size() -1; fillIndex < index;fillIndex++) {
		       syntaxEditInfoEntry500.add(null);
		    }
			syntaxEditInfoEntry500.set(index,
			   	   	new SyntaxEditInfoEntry500(this,beginSyntaxEditInfoEntry500 + index * SyntaxEditInfoEntry500.getSyntaxEditInfoEntry500FieldLength()) 
				                        ); 	
		} 
   	   SyntaxEditInfoEntry500 value = syntaxEditInfoEntry500.get(index);
   	   if (value == null) {
   	      syntaxEditInfoEntry500.set(index,
			   	   	new SyntaxEditInfoEntry500(this,beginSyntaxEditInfoEntry500 + index * SyntaxEditInfoEntry500.getSyntaxEditInfoEntry500FieldLength()) 
				                        ); 
		  value = syntaxEditInfoEntry500.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update SyntaxEditInfoEntry500 at index with the passed value
	 *  Corresponding COBOL Variable is 500-SYNTAX-EDIT-INFO-ENTRY
	 *  @param index
	 *	@param value
	 */
  public void setSyntaxEditInfoEntry500(int index,char[] value) {
   	getSyntaxEditInfoEntry500(index).setString(value);
   }
   
	

	
	
	

		public static int getEditType23InfoTable500Redefined01FieldLength() {
			return EDIT_TYPE_23_INFO_TABLE_500_REDEFINED_01_LENGTH;
		}

}
  

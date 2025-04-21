package com.cloudframe.app.ip200090.dto;

/**
*  The class SyntaxPgmRedTable500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:08. using version 5.0.0.256
**/


import com.cloudframe.app.ip200090.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;


public class SyntaxPgmRedTable500 extends SyntaxPgmRedTable500Serialized { 
   
			private List<SyntaxPgmTableEntry500> syntaxPgmTableEntry500 = new ArrayList<>();
    	
	
	/**
	* Constructor for SyntaxPgmRedTable500
	**/
    public SyntaxPgmRedTable500() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SyntaxPgmRedTable500. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SyntaxPgmRedTable500(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of syntaxPgmTableEntry500
	 *  Corresponding COBOL Variable is 500-SYNTAX-PGM-TABLE-ENTRY
	 *	@return syntaxPgmTableEntry500
	 */
   public List<SyntaxPgmTableEntry500> getSyntaxPgmTableEntry500() {
       return syntaxPgmTableEntry500;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return syntaxPgmTableEntry500
	 */
	public SyntaxPgmTableEntry500 getSyntaxPgmTableEntry500(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getSyntaxPgmTableEntry500(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= SYNTAX_PGM_TABLE_ENTRY_500_SIZE) {
             	index = SYNTAX_PGM_TABLE_ENTRY_500_SIZE -1; // can't exceed max array size
             	logger.trace("syntaxPgmTableEntry500 - Array index exceeded max Size {}, resetting it to max allowed",SYNTAX_PGM_TABLE_ENTRY_500_SIZE); 
	    }
		if (index >= syntaxPgmTableEntry500.size()) {
       		for (int fillIndex =  syntaxPgmTableEntry500.size() -1; fillIndex < index;fillIndex++) {
		       syntaxPgmTableEntry500.add(null);
		    }
			syntaxPgmTableEntry500.set(index,
			   	   	new SyntaxPgmTableEntry500(this,beginSyntaxPgmTableEntry500 + index * SyntaxPgmTableEntry500.getSyntaxPgmTableEntry500FieldLength()) 
				                        ); 	
		} 
   	   SyntaxPgmTableEntry500 value = syntaxPgmTableEntry500.get(index);
   	   if (value == null) {
   	      syntaxPgmTableEntry500.set(index,
			   	   	new SyntaxPgmTableEntry500(this,beginSyntaxPgmTableEntry500 + index * SyntaxPgmTableEntry500.getSyntaxPgmTableEntry500FieldLength()) 
				                        ); 
		  value = syntaxPgmTableEntry500.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update SyntaxPgmTableEntry500 at index with the passed value
	 *  Corresponding COBOL Variable is 500-SYNTAX-PGM-TABLE-ENTRY
	 *  @param index
	 *	@param value
	 */
  public void setSyntaxPgmTableEntry500(int index,char[] value) {
   	getSyntaxPgmTableEntry500(index).setString(value);
   }
   
	

	
	
	

		public static int getSyntaxPgmRedTable500FieldLength() {
			return SYNTAX_PGM_RED_TABLE_500_LENGTH;
		}

}
  

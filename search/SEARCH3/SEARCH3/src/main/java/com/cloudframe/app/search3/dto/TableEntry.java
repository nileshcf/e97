package com.cloudframe.app.search3.dto;

/**
*  The class TableEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:05. using version 5.0.0.256
**/


import com.cloudframe.app.search3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class TableEntry extends TableEntrySerialized { 
   

						private char[] var1 = Field.fillLowValue(2);

								private int var2;
	
	/**
	* Constructor for TableEntry
	**/
    public TableEntry() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for TableEntry. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TableEntry(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of var1
	 *	@return var1
	 */
   public char[] getVar1() throws CFException{
     if (isVar1Modified()) { 
        var1 = refreshVar1();
     }
   		return var1;
   }

  
	/**
	*  set variable var1
	*  Corresponding COBOL Variable is WS-VAR-1
	*  @param value
	**/
   public void setVar1(char[] value) {
      var1 = checkVar1Constraints(value);
      serializeVar1(var1);
   } 

     /**
	 * 	Update Var1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setVar1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginVar1,var1.length);
   	
   }
   
   public void setVar1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginVar1,var1.length);
   	
   }
   
     /**
	 * 	Update Var1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVar1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginVar1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Var1 with another Field
	 *	@param value
	 */
   public void setVar1(Field source) {
       replace(source,0,source.length(),beginVar1,VAR_1_LEN);
   	
   }  
   
     /**
	 * 	Update Var1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setVar1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginVar1,VAR_1_LEN);
   	
   }
   
     /**
	 * 	Update Var1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVar1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginVar1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of var2
	 *	@return var2
	 */
	public int getVar2() throws CFException {
       if (isVar2Modified()) { 
           var2 = refreshVar2();
        }
   		return var2;
	}
	

	
	   
	/**
	 * 	Update Var2 with the passed value
	 *  Corresponding COBOL Variable is WS-VAR-2
	 *	@param number
	 */
	public void setVar2(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    var2 = checkVar2MaxLimit(number); 
		serializeVar2(var2);
	}
	

	public void setVar2(long number) {
	    number = checkVar2MaxLimit(number); // Truncate if value is beyond +/- Max range
		setVar2((int)number);
	}
	
	/**
	 * 	Update Var2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setVar2(char[] value) throws CFException {
		 var2 = serializeVar2(value);
	}
	/**
	 * 	Update Var2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setVar2String(char[] value) throws CFException {
		 setVar2(value);
	}

	
	
	

		public static int getTableEntryFieldLength() {
			return TABLE_ENTRY_LENGTH;
		}

}
  

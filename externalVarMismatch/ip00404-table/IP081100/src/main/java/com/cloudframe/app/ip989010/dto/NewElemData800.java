package com.cloudframe.app.ip989010.dto;

/**
*  The class NewElemData800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:08. using version 5.0.0.254
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class NewElemData800 extends NewElemData800Serialized { 
   

								private int newElemLen800;

						private char[] newElemValue800 = Field.fillLowValue(999);
	
	/**
	* Constructor for NewElemData800
	**/
    public NewElemData800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for NewElemData800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public NewElemData800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of newElemLen800
	 *	@return newElemLen800
	 */
	public int getNewElemLen800() throws CFException {
       if (isNewElemLen800Modified()) { 
           newElemLen800 = refreshNewElemLen800();
        }
   		return newElemLen800;
	}
	

	
	   
	/**
	 * 	Update NewElemLen800 with the passed value
	 *  Corresponding COBOL Variable is 800-NEW-ELEM-LEN
	 *	@param number
	 */
	public void setNewElemLen800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    newElemLen800 = checkNewElemLen800MaxLimit(number); 
		serializeNewElemLen800(newElemLen800);
	}
	

	public void setNewElemLen800(long number) {
	    number = checkNewElemLen800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setNewElemLen800((int)number);
	}
	
	/**
	 * 	Update NewElemLen800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNewElemLen800(char[] value) throws CFException {
		 newElemLen800 = serializeNewElemLen800(value);
	}
	/**
	 * 	Update NewElemLen800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNewElemLen800String(char[] value) throws CFException {
		 setNewElemLen800(value);
	}
	/**
	 *	Returns the value of newElemValue800
	 *	@return newElemValue800
	 */
   public char[] getNewElemValue800() throws CFException{
     if (isNewElemValue800Modified()) { 
        newElemValue800 = refreshNewElemValue800();
     }
   		return newElemValue800;
   }

  
	/**
	*  set variable newElemValue800
	*  Corresponding COBOL Variable is 800-NEW-ELEM-VALUE
	*  @param value
	**/
   public void setNewElemValue800(char[] value) {
      newElemValue800 = checkNewElemValue800Constraints(value);
      serializeNewElemValue800(newElemValue800);
   } 

     /**
	 * 	Update NewElemValue800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setNewElemValue800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginNewElemValue800,newElemValue800.length);
   	
   }
   
   public void setNewElemValue800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginNewElemValue800,newElemValue800.length);
   	
   }
   
     /**
	 * 	Update NewElemValue800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setNewElemValue800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNewElemValue800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update NewElemValue800 with another Field
	 *	@param value
	 */
   public void setNewElemValue800(Field source) {
       replace(source,0,source.length(),beginNewElemValue800,NEW_ELEM_VALUE_800_LEN);
   	
   }  
   
     /**
	 * 	Update NewElemValue800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setNewElemValue800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginNewElemValue800,NEW_ELEM_VALUE_800_LEN);
   	
   }
   
     /**
	 * 	Update NewElemValue800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setNewElemValue800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNewElemValue800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getNewElemData800FieldLength() {
			return NEW_ELEM_DATA_800_LENGTH;
		}

}
  

package com.cloudframe.app.ip200090.dto;

/**
*  The class EditNumGroup800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:37. using version 5.0.0.254
**/


import com.cloudframe.app.ip200090.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class EditNumGroup800 extends EditNumGroup800Serialized { 
   

								private long editNum800;
					private EditNumR800 editNumR800 = new EditNumR800();
	
	/**
	* Constructor for EditNumGroup800
	**/
    public EditNumGroup800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			editNumR800.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setEditNum800(0L);
    }


 

	/**
	 *	Returns the value of editNum800
	 *	@return editNum800
	 */
	public long getEditNum800() throws CFException {
       if (isEditNum800Modified()) { 
           editNum800 = refreshEditNum800();
        }
   		return editNum800;
	}
	

	
	   
	/**
	 * 	Update EditNum800 with the passed value
	 *  Corresponding COBOL Variable is 800-EDIT-NUM
	 *	@param number
	 */
	public void setEditNum800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    editNum800 = checkEditNum800MaxLimit(number); 
		serializeEditNum800(editNum800);
	}
	

	/**
	 * 	Update EditNum800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setEditNum800(char[] value) throws CFException {
		 editNum800 = serializeEditNum800(value);
	}
	/**
	 * 	Update EditNum800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setEditNum800String(char[] value) throws CFException {
		 setEditNum800(value);
	}
	/**
	 *	Returns the value of editNumR800
	 *	@return editNumR800
	 */   
	 public EditNumR800 getEditNumR800() {
   	return editNumR800;
   }
   /**
	* 	Update EditNumR800 with the passed value
	*   Corresponding COBOL Variable is 800-EDIT-NUM-R
	*	@param value
	*/
   public void setEditNumR800(char[] value) {
      editNumR800.setString(value); 
   }   
    
     /**
	 * 	Update EditNumR800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setEditNumR800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,editNumR800.begin,editNumR800.length());
   }
   
     /**
	 * 	Update EditNumR800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEditNumR800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,editNumR800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update EditNumR800 with another Field
	 *	@param value
	 */
   public void setEditNumR800(Field source) {
   	replace(source,0,source.length(),editNumR800.begin,editNumR800.length());
   }  
   
     /**
	 * 	Update EditNumR800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setEditNumR800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,editNumR800.begin,editNumR800.length());
   }
   
     /**
	 * 	Update EditNumR800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEditNumR800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,editNumR800.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getEditNumGroup800FieldLength() {
			return EDIT_NUM_GROUP_800_LENGTH;
		}

}
  

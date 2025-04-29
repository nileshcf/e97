package com.cloudframe.app.mcissues.dto;

/**
*  The class PreEditVersionGroup300 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:36. using version 5.0.0.254
**/


import com.cloudframe.app.mcissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class PreEditVersionGroup300 extends PreEditVersionGroup300Serialized {
   

						private char[] preEditVersion300 = new char[7];
					private PreEditVersion300Redefined preEditVersion300Redefined = new PreEditVersion300Redefined();
	
	/**
	* Constructor for PreEditVersionGroup300
	**/
    public PreEditVersionGroup300() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			preEditVersion300Redefined.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setPreEditVersion300(("21.2.00").toCharArray());
    }


 

	/**
	 *	Returns the value of preEditVersion300
	 *	@return preEditVersion300
	 */
   public char[] getPreEditVersion300() throws CFException{
     if (isPreEditVersion300Modified()) { 
        preEditVersion300 = refreshPreEditVersion300();
     }
   		return preEditVersion300;
   }

  
	/**
	*  set variable preEditVersion300
	*  Corresponding COBOL Variable is 300-PRE-EDIT-VERSION
	*  @param value
	**/
   public void setPreEditVersion300(char[] value) {
      preEditVersion300 = checkPreEditVersion300Constraints(value);
      serializePreEditVersion300(preEditVersion300);
   } 

     /**
	 * 	Update PreEditVersion300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPreEditVersion300(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPreEditVersion300,preEditVersion300.length);
   	
   }
   
   public void setPreEditVersion300(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPreEditVersion300,preEditVersion300.length);
   	
   }
   
     /**
	 * 	Update PreEditVersion300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPreEditVersion300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPreEditVersion300+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PreEditVersion300 with another Field
	 *	@param value
	 */
   public void setPreEditVersion300(Field source) {
       replace(source,0,source.length(),beginPreEditVersion300,PRE_EDIT_VERSION_300_LEN);
   	
   }  
   
     /**
	 * 	Update PreEditVersion300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPreEditVersion300(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPreEditVersion300,PRE_EDIT_VERSION_300_LEN);
   	
   }
   
     /**
	 * 	Update PreEditVersion300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPreEditVersion300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPreEditVersion300+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of preEditVersion300Redefined
	 *	@return preEditVersion300Redefined
	 */   
	 public PreEditVersion300Redefined getPreEditVersion300Redefined() {
   	return preEditVersion300Redefined;
   }
   /**
	* 	Update PreEditVersion300Redefined with the passed value
	*   Corresponding COBOL Variable is 300-PRE-EDIT-VERSION-REDEFINED
	*	@param value
	*/
   public void setPreEditVersion300Redefined(char[] value) {
      preEditVersion300Redefined.setString(value); 
   }   
    
     /**
	 * 	Update PreEditVersion300Redefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setPreEditVersion300Redefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,preEditVersion300Redefined.begin,preEditVersion300Redefined.length());
   }
   
     /**
	 * 	Update PreEditVersion300Redefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPreEditVersion300Redefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,preEditVersion300Redefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update PreEditVersion300Redefined with another Field
	 *	@param value
	 */
   public void setPreEditVersion300Redefined(Field source) {
   	replace(source,0,source.length(),preEditVersion300Redefined.begin,preEditVersion300Redefined.length());
   }  
   
     /**
	 * 	Update PreEditVersion300Redefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setPreEditVersion300Redefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,preEditVersion300Redefined.begin,preEditVersion300Redefined.length());
   }
   
     /**
	 * 	Update PreEditVersion300Redefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPreEditVersion300Redefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,preEditVersion300Redefined.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getPreEditVersionGroup300FieldLength() {
			return PRE_EDIT_VERSION_GROUP_300_LENGTH;
		}

}
  

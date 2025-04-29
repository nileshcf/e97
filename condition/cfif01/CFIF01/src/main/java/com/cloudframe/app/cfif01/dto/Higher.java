package com.cloudframe.app.cfif01.dto;

/**
*  The class Higher is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:21. using version 5.0.0.254
**/


import com.cloudframe.app.cfif01.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Higher extends HigherSerialized {
   
				private Init init = new Init();
				private Array array = new Array();
	
	/**
	* Constructor for Higher
	**/
    public Higher() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			init.setParent(this,getStartOffset() + 0);
	       			array.setParent(this,getStartOffset() + 14);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of init
	 *	@return init
	 */   
	 public Init getInit() {
   	return init;
   }
   /**
	* 	Update Init with the passed value
	*   Corresponding COBOL Variable is WS-INIT
	*	@param value
	*/
   public void setInit(char[] value) {
      init.setString(value); 
   }   
    
     /**
	 * 	Update Init 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setInit(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,init.begin,init.length());
   }
   
     /**
	 * 	Update Init 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInit(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,init.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Init with another Field
	 *	@param value
	 */
   public void setInit(Field source) {
   	replace(source,0,source.length(),init.begin,init.length());
   }  
   
     /**
	 * 	Update Init 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setInit(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,init.begin,init.length());
   }
   
     /**
	 * 	Update Init 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInit(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,init.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of array
	 *	@return array
	 */   
	 public Array getArray() {
   	return array;
   }
   /**
	* 	Update Array with the passed value
	*   Corresponding COBOL Variable is WS-ARRAY
	*	@param value
	*/
   public void setArray(char[] value) {
      array.setString(value); 
   }   
    
     /**
	 * 	Update Array 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setArray(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,array.begin,array.length());
   }
   
     /**
	 * 	Update Array 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setArray(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,array.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Array with another Field
	 *	@param value
	 */
   public void setArray(Field source) {
   	replace(source,0,source.length(),array.begin,array.length());
   }  
   
     /**
	 * 	Update Array 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setArray(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,array.begin,array.length());
   }
   
     /**
	 * 	Update Array 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setArray(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,array.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getHigherFieldLength() {
			return HIGHER_LENGTH;
		}

}
  

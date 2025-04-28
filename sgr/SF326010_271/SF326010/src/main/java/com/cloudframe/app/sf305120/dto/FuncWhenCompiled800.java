package com.cloudframe.app.sf305120.dto;

/**
*  The class FuncWhenCompiled800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FuncWhenCompiled800 extends FuncWhenCompiled800Serialized { 
   
				private WhenCompDate800 whenCompDate800 = new WhenCompDate800();
				private WhenCompTime800 whenCompTime800 = new WhenCompTime800();

	
	/**
	* Constructor for FuncWhenCompiled800
	**/
    public FuncWhenCompiled800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			whenCompDate800.setParent(this,getStartOffset() + 0);
	       			whenCompTime800.setParent(this,getStartOffset() + 8);
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(7)
             , getStartOffset() + 14
             ,7
             );
    }


 

	/**
	 *	Returns the value of whenCompDate800
	 *	@return whenCompDate800
	 */   
	 public WhenCompDate800 getWhenCompDate800() {
   	return whenCompDate800;
   }
   /**
	* 	Update WhenCompDate800 with the passed value
	*   Corresponding COBOL Variable is 800-WHEN-COMP-DATE
	*	@param value
	*/
   public void setWhenCompDate800(char[] value) {
      whenCompDate800.setString(value); 
   }   
    
     /**
	 * 	Update WhenCompDate800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWhenCompDate800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,whenCompDate800.begin,whenCompDate800.length());
   }
   
     /**
	 * 	Update WhenCompDate800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWhenCompDate800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,whenCompDate800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WhenCompDate800 with another Field
	 *	@param value
	 */
   public void setWhenCompDate800(Field source) {
   	replace(source,0,source.length(),whenCompDate800.begin,whenCompDate800.length());
   }  
   
     /**
	 * 	Update WhenCompDate800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWhenCompDate800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,whenCompDate800.begin,whenCompDate800.length());
   }
   
     /**
	 * 	Update WhenCompDate800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWhenCompDate800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,whenCompDate800.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of whenCompTime800
	 *	@return whenCompTime800
	 */   
	 public WhenCompTime800 getWhenCompTime800() {
   	return whenCompTime800;
   }
   /**
	* 	Update WhenCompTime800 with the passed value
	*   Corresponding COBOL Variable is 800-WHEN-COMP-TIME
	*	@param value
	*/
   public void setWhenCompTime800(char[] value) {
      whenCompTime800.setString(value); 
   }   
    
     /**
	 * 	Update WhenCompTime800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWhenCompTime800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,whenCompTime800.begin,whenCompTime800.length());
   }
   
     /**
	 * 	Update WhenCompTime800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWhenCompTime800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,whenCompTime800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WhenCompTime800 with another Field
	 *	@param value
	 */
   public void setWhenCompTime800(Field source) {
   	replace(source,0,source.length(),whenCompTime800.begin,whenCompTime800.length());
   }  
   
     /**
	 * 	Update WhenCompTime800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWhenCompTime800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,whenCompTime800.begin,whenCompTime800.length());
   }
   
     /**
	 * 	Update WhenCompTime800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWhenCompTime800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,whenCompTime800.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getFuncWhenCompiled800FieldLength() {
			return FUNC_WHEN_COMPILED_800_LENGTH;
		}

}
  

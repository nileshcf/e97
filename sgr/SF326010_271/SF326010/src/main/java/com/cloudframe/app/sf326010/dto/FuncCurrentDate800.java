package com.cloudframe.app.sf326010.dto;

/**
*  The class FuncCurrentDate800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/


import com.cloudframe.app.sf326010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FuncCurrentDate800 extends FuncCurrentDate800Serialized { 
   
				private FuncCurrDate800 funcCurrDate800 = new FuncCurrDate800();
				private FuncCurrTime800 funcCurrTime800 = new FuncCurrTime800();

	
	/**
	* Constructor for FuncCurrentDate800
	**/
    public FuncCurrentDate800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			funcCurrDate800.setParent(this,getStartOffset() + 0);
	       			funcCurrTime800.setParent(this,getStartOffset() + 8);
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(7)
             , getStartOffset() + 14
             ,7
             );
    }


 

	/**
	 *	Returns the value of funcCurrDate800
	 *	@return funcCurrDate800
	 */   
	 public FuncCurrDate800 getFuncCurrDate800() {
   	return funcCurrDate800;
   }
   /**
	* 	Update FuncCurrDate800 with the passed value
	*   Corresponding COBOL Variable is 800-FUNC-CURR-DATE
	*	@param value
	*/
   public void setFuncCurrDate800(char[] value) {
      funcCurrDate800.setString(value); 
   }   
    
     /**
	 * 	Update FuncCurrDate800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setFuncCurrDate800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,funcCurrDate800.begin,funcCurrDate800.length());
   }
   
     /**
	 * 	Update FuncCurrDate800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFuncCurrDate800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,funcCurrDate800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update FuncCurrDate800 with another Field
	 *	@param value
	 */
   public void setFuncCurrDate800(Field source) {
   	replace(source,0,source.length(),funcCurrDate800.begin,funcCurrDate800.length());
   }  
   
     /**
	 * 	Update FuncCurrDate800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setFuncCurrDate800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,funcCurrDate800.begin,funcCurrDate800.length());
   }
   
     /**
	 * 	Update FuncCurrDate800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFuncCurrDate800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,funcCurrDate800.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of funcCurrTime800
	 *	@return funcCurrTime800
	 */   
	 public FuncCurrTime800 getFuncCurrTime800() {
   	return funcCurrTime800;
   }
   /**
	* 	Update FuncCurrTime800 with the passed value
	*   Corresponding COBOL Variable is 800-FUNC-CURR-TIME
	*	@param value
	*/
   public void setFuncCurrTime800(char[] value) {
      funcCurrTime800.setString(value); 
   }   
    
     /**
	 * 	Update FuncCurrTime800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setFuncCurrTime800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,funcCurrTime800.begin,funcCurrTime800.length());
   }
   
     /**
	 * 	Update FuncCurrTime800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFuncCurrTime800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,funcCurrTime800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update FuncCurrTime800 with another Field
	 *	@param value
	 */
   public void setFuncCurrTime800(Field source) {
   	replace(source,0,source.length(),funcCurrTime800.begin,funcCurrTime800.length());
   }  
   
     /**
	 * 	Update FuncCurrTime800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setFuncCurrTime800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,funcCurrTime800.begin,funcCurrTime800.length());
   }
   
     /**
	 * 	Update FuncCurrTime800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFuncCurrTime800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,funcCurrTime800.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getFuncCurrentDate800FieldLength() {
			return FUNC_CURRENT_DATE_800_LENGTH;
		}

}
  

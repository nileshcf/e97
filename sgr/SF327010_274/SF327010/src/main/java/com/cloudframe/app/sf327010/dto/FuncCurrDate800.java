package com.cloudframe.app.sf327010.dto;

/**
*  The class FuncCurrDate800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:20. using version 5.0.0.257
**/


import com.cloudframe.app.sf327010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FuncCurrDate800 extends FuncCurrDate800Serialized { 
   

						private char[] currDateYyyy800 = new char[4];

						private char[] currDateMm800 = new char[2];

						private char[] currDateDd800 = new char[2];
	
	/**
	* Constructor for FuncCurrDate800
	**/
    public FuncCurrDate800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for FuncCurrDate800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FuncCurrDate800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setCurrDateYyyy800(fillSpace(4));
								setCurrDateMm800(fillSpace(2));
								setCurrDateDd800(fillSpace(2));
    } 

	/**
	 *	Returns the value of currDateYyyy800
	 *	@return currDateYyyy800
	 */
   public char[] getCurrDateYyyy800() throws CFException{
     if (isCurrDateYyyy800Modified()) { 
        currDateYyyy800 = refreshCurrDateYyyy800();
     }
   		return currDateYyyy800;
   }

  
	/**
	*  set variable currDateYyyy800
	*  Corresponding COBOL Variable is 800-CURR-DATE-YYYY
	*  @param value
	**/
   public void setCurrDateYyyy800(char[] value) {
      currDateYyyy800 = checkCurrDateYyyy800Constraints(value);
      serializeCurrDateYyyy800(currDateYyyy800);
   } 

     /**
	 * 	Update CurrDateYyyy800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrDateYyyy800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurrDateYyyy800,currDateYyyy800.length);
   	
   }
   
   public void setCurrDateYyyy800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurrDateYyyy800,currDateYyyy800.length);
   	
   }
   
     /**
	 * 	Update CurrDateYyyy800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrDateYyyy800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrDateYyyy800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurrDateYyyy800 with another Field
	 *	@param value
	 */
   public void setCurrDateYyyy800(Field source) {
       replace(source,0,source.length(),beginCurrDateYyyy800,CURR_DATE_YYYY_800_LEN);
   	
   }  
   
     /**
	 * 	Update CurrDateYyyy800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrDateYyyy800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurrDateYyyy800,CURR_DATE_YYYY_800_LEN);
   	
   }
   
     /**
	 * 	Update CurrDateYyyy800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrDateYyyy800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrDateYyyy800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of currDateMm800
	 *	@return currDateMm800
	 */
   public char[] getCurrDateMm800() throws CFException{
     if (isCurrDateMm800Modified()) { 
        currDateMm800 = refreshCurrDateMm800();
     }
   		return currDateMm800;
   }

  
	/**
	*  set variable currDateMm800
	*  Corresponding COBOL Variable is 800-CURR-DATE-MM
	*  @param value
	**/
   public void setCurrDateMm800(char[] value) {
      currDateMm800 = checkCurrDateMm800Constraints(value);
      serializeCurrDateMm800(currDateMm800);
   } 

     /**
	 * 	Update CurrDateMm800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrDateMm800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurrDateMm800,currDateMm800.length);
   	
   }
   
   public void setCurrDateMm800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurrDateMm800,currDateMm800.length);
   	
   }
   
     /**
	 * 	Update CurrDateMm800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrDateMm800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrDateMm800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurrDateMm800 with another Field
	 *	@param value
	 */
   public void setCurrDateMm800(Field source) {
       replace(source,0,source.length(),beginCurrDateMm800,CURR_DATE_MM_800_LEN);
   	
   }  
   
     /**
	 * 	Update CurrDateMm800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrDateMm800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurrDateMm800,CURR_DATE_MM_800_LEN);
   	
   }
   
     /**
	 * 	Update CurrDateMm800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrDateMm800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrDateMm800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of currDateDd800
	 *	@return currDateDd800
	 */
   public char[] getCurrDateDd800() throws CFException{
     if (isCurrDateDd800Modified()) { 
        currDateDd800 = refreshCurrDateDd800();
     }
   		return currDateDd800;
   }

  
	/**
	*  set variable currDateDd800
	*  Corresponding COBOL Variable is 800-CURR-DATE-DD
	*  @param value
	**/
   public void setCurrDateDd800(char[] value) {
      currDateDd800 = checkCurrDateDd800Constraints(value);
      serializeCurrDateDd800(currDateDd800);
   } 

     /**
	 * 	Update CurrDateDd800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrDateDd800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurrDateDd800,currDateDd800.length);
   	
   }
   
   public void setCurrDateDd800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurrDateDd800,currDateDd800.length);
   	
   }
   
     /**
	 * 	Update CurrDateDd800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrDateDd800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrDateDd800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurrDateDd800 with another Field
	 *	@param value
	 */
   public void setCurrDateDd800(Field source) {
       replace(source,0,source.length(),beginCurrDateDd800,CURR_DATE_DD_800_LEN);
   	
   }  
   
     /**
	 * 	Update CurrDateDd800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrDateDd800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurrDateDd800,CURR_DATE_DD_800_LEN);
   	
   }
   
     /**
	 * 	Update CurrDateDd800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrDateDd800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrDateDd800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getFuncCurrDate800FieldLength() {
			return FUNC_CURR_DATE_800_LENGTH;
		}

}
  

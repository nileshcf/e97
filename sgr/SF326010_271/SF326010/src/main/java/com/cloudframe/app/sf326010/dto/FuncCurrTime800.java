package com.cloudframe.app.sf326010.dto;

/**
*  The class FuncCurrTime800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:05. using version 5.0.0.256
**/


import com.cloudframe.app.sf326010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FuncCurrTime800 extends FuncCurrTime800Serialized { 
   

						private char[] currTimeHh800 = new char[2];

						private char[] currTimeMm800 = new char[2];

						private char[] currTimeSs800 = new char[2];
	
	/**
	* Constructor for FuncCurrTime800
	**/
    public FuncCurrTime800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for FuncCurrTime800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FuncCurrTime800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setCurrTimeHh800(fillSpace(2));
								setCurrTimeMm800(fillSpace(2));
								setCurrTimeSs800(fillSpace(2));
    } 

	/**
	 *	Returns the value of currTimeHh800
	 *	@return currTimeHh800
	 */
   public char[] getCurrTimeHh800() throws CFException{
     if (isCurrTimeHh800Modified()) { 
        currTimeHh800 = refreshCurrTimeHh800();
     }
   		return currTimeHh800;
   }

  
	/**
	*  set variable currTimeHh800
	*  Corresponding COBOL Variable is 800-CURR-TIME-HH
	*  @param value
	**/
   public void setCurrTimeHh800(char[] value) {
      currTimeHh800 = checkCurrTimeHh800Constraints(value);
      serializeCurrTimeHh800(currTimeHh800);
   } 

     /**
	 * 	Update CurrTimeHh800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrTimeHh800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurrTimeHh800,currTimeHh800.length);
   	
   }
   
   public void setCurrTimeHh800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurrTimeHh800,currTimeHh800.length);
   	
   }
   
     /**
	 * 	Update CurrTimeHh800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrTimeHh800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrTimeHh800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurrTimeHh800 with another Field
	 *	@param value
	 */
   public void setCurrTimeHh800(Field source) {
       replace(source,0,source.length(),beginCurrTimeHh800,CURR_TIME_HH_800_LEN);
   	
   }  
   
     /**
	 * 	Update CurrTimeHh800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrTimeHh800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurrTimeHh800,CURR_TIME_HH_800_LEN);
   	
   }
   
     /**
	 * 	Update CurrTimeHh800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrTimeHh800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrTimeHh800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of currTimeMm800
	 *	@return currTimeMm800
	 */
   public char[] getCurrTimeMm800() throws CFException{
     if (isCurrTimeMm800Modified()) { 
        currTimeMm800 = refreshCurrTimeMm800();
     }
   		return currTimeMm800;
   }

  
	/**
	*  set variable currTimeMm800
	*  Corresponding COBOL Variable is 800-CURR-TIME-MM
	*  @param value
	**/
   public void setCurrTimeMm800(char[] value) {
      currTimeMm800 = checkCurrTimeMm800Constraints(value);
      serializeCurrTimeMm800(currTimeMm800);
   } 

     /**
	 * 	Update CurrTimeMm800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrTimeMm800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurrTimeMm800,currTimeMm800.length);
   	
   }
   
   public void setCurrTimeMm800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurrTimeMm800,currTimeMm800.length);
   	
   }
   
     /**
	 * 	Update CurrTimeMm800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrTimeMm800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrTimeMm800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurrTimeMm800 with another Field
	 *	@param value
	 */
   public void setCurrTimeMm800(Field source) {
       replace(source,0,source.length(),beginCurrTimeMm800,CURR_TIME_MM_800_LEN);
   	
   }  
   
     /**
	 * 	Update CurrTimeMm800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrTimeMm800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurrTimeMm800,CURR_TIME_MM_800_LEN);
   	
   }
   
     /**
	 * 	Update CurrTimeMm800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrTimeMm800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrTimeMm800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of currTimeSs800
	 *	@return currTimeSs800
	 */
   public char[] getCurrTimeSs800() throws CFException{
     if (isCurrTimeSs800Modified()) { 
        currTimeSs800 = refreshCurrTimeSs800();
     }
   		return currTimeSs800;
   }

  
	/**
	*  set variable currTimeSs800
	*  Corresponding COBOL Variable is 800-CURR-TIME-SS
	*  @param value
	**/
   public void setCurrTimeSs800(char[] value) {
      currTimeSs800 = checkCurrTimeSs800Constraints(value);
      serializeCurrTimeSs800(currTimeSs800);
   } 

     /**
	 * 	Update CurrTimeSs800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrTimeSs800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurrTimeSs800,currTimeSs800.length);
   	
   }
   
   public void setCurrTimeSs800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurrTimeSs800,currTimeSs800.length);
   	
   }
   
     /**
	 * 	Update CurrTimeSs800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrTimeSs800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrTimeSs800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurrTimeSs800 with another Field
	 *	@param value
	 */
   public void setCurrTimeSs800(Field source) {
       replace(source,0,source.length(),beginCurrTimeSs800,CURR_TIME_SS_800_LEN);
   	
   }  
   
     /**
	 * 	Update CurrTimeSs800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrTimeSs800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurrTimeSs800,CURR_TIME_SS_800_LEN);
   	
   }
   
     /**
	 * 	Update CurrTimeSs800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrTimeSs800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrTimeSs800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getFuncCurrTime800FieldLength() {
			return FUNC_CURR_TIME_800_LENGTH;
		}

}
  

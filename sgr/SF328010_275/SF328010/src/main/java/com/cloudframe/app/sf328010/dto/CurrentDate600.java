package com.cloudframe.app.sf328010.dto;

/**
*  The class CurrentDate600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:35. using version 5.0.0.254
**/


import com.cloudframe.app.sf328010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CurrentDate600 extends CurrentDate600Serialized { 
   

						private char[] currDateYyyy600 = new char[4];


						private char[] currDateMm600 = new char[2];


						private char[] currDateDd600 = new char[2];
	
	/**
	* Constructor for CurrentDate600
	**/
    public CurrentDate600() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CurrentDate600. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CurrentDate600(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setCurrDateYyyy600(fillSpace(4));
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 4
             ,1
             );
								setCurrDateMm600(fillSpace(2));
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 7
             ,1
             );
								setCurrDateDd600(fillSpace(2));
    } 

	/**
	 *	Returns the value of currDateYyyy600
	 *	@return currDateYyyy600
	 */
   public char[] getCurrDateYyyy600() throws CFException{
     if (isCurrDateYyyy600Modified()) { 
        currDateYyyy600 = refreshCurrDateYyyy600();
     }
   		return currDateYyyy600;
   }

  
	/**
	*  set variable currDateYyyy600
	*  Corresponding COBOL Variable is 600-CURR-DATE-YYYY
	*  @param value
	**/
   public void setCurrDateYyyy600(char[] value) {
      currDateYyyy600 = checkCurrDateYyyy600Constraints(value);
      serializeCurrDateYyyy600(currDateYyyy600);
   } 

     /**
	 * 	Update CurrDateYyyy600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrDateYyyy600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurrDateYyyy600,currDateYyyy600.length);
   	
   }
   
   public void setCurrDateYyyy600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurrDateYyyy600,currDateYyyy600.length);
   	
   }
   
     /**
	 * 	Update CurrDateYyyy600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrDateYyyy600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrDateYyyy600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurrDateYyyy600 with another Field
	 *	@param value
	 */
   public void setCurrDateYyyy600(Field source) {
       replace(source,0,source.length(),beginCurrDateYyyy600,CURR_DATE_YYYY_600_LEN);
   	
   }  
   
     /**
	 * 	Update CurrDateYyyy600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrDateYyyy600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurrDateYyyy600,CURR_DATE_YYYY_600_LEN);
   	
   }
   
     /**
	 * 	Update CurrDateYyyy600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrDateYyyy600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrDateYyyy600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of currDateMm600
	 *	@return currDateMm600
	 */
   public char[] getCurrDateMm600() throws CFException{
     if (isCurrDateMm600Modified()) { 
        currDateMm600 = refreshCurrDateMm600();
     }
   		return currDateMm600;
   }

  
	/**
	*  set variable currDateMm600
	*  Corresponding COBOL Variable is 600-CURR-DATE-MM
	*  @param value
	**/
   public void setCurrDateMm600(char[] value) {
      currDateMm600 = checkCurrDateMm600Constraints(value);
      serializeCurrDateMm600(currDateMm600);
   } 

     /**
	 * 	Update CurrDateMm600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrDateMm600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurrDateMm600,currDateMm600.length);
   	
   }
   
   public void setCurrDateMm600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurrDateMm600,currDateMm600.length);
   	
   }
   
     /**
	 * 	Update CurrDateMm600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrDateMm600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrDateMm600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurrDateMm600 with another Field
	 *	@param value
	 */
   public void setCurrDateMm600(Field source) {
       replace(source,0,source.length(),beginCurrDateMm600,CURR_DATE_MM_600_LEN);
   	
   }  
   
     /**
	 * 	Update CurrDateMm600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrDateMm600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurrDateMm600,CURR_DATE_MM_600_LEN);
   	
   }
   
     /**
	 * 	Update CurrDateMm600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrDateMm600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrDateMm600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of currDateDd600
	 *	@return currDateDd600
	 */
   public char[] getCurrDateDd600() throws CFException{
     if (isCurrDateDd600Modified()) { 
        currDateDd600 = refreshCurrDateDd600();
     }
   		return currDateDd600;
   }

  
	/**
	*  set variable currDateDd600
	*  Corresponding COBOL Variable is 600-CURR-DATE-DD
	*  @param value
	**/
   public void setCurrDateDd600(char[] value) {
      currDateDd600 = checkCurrDateDd600Constraints(value);
      serializeCurrDateDd600(currDateDd600);
   } 

     /**
	 * 	Update CurrDateDd600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrDateDd600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurrDateDd600,currDateDd600.length);
   	
   }
   
   public void setCurrDateDd600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurrDateDd600,currDateDd600.length);
   	
   }
   
     /**
	 * 	Update CurrDateDd600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrDateDd600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrDateDd600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurrDateDd600 with another Field
	 *	@param value
	 */
   public void setCurrDateDd600(Field source) {
       replace(source,0,source.length(),beginCurrDateDd600,CURR_DATE_DD_600_LEN);
   	
   }  
   
     /**
	 * 	Update CurrDateDd600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrDateDd600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurrDateDd600,CURR_DATE_DD_600_LEN);
   	
   }
   
     /**
	 * 	Update CurrDateDd600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrDateDd600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrDateDd600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getCurrentDate600FieldLength() {
			return CURRENT_DATE_600_LENGTH;
		}

}
  

package com.cloudframe.app.sf328010.dto;

/**
*  The class CurrentTime600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:04. using version 5.0.0.256
**/


import com.cloudframe.app.sf328010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CurrentTime600 extends CurrentTime600Serialized { 
   

						private char[] currTimeHh600 = new char[2];


						private char[] currTimeMm600 = new char[2];


						private char[] currTimeSs600 = new char[2];
	
	/**
	* Constructor for CurrentTime600
	**/
    public CurrentTime600() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CurrentTime600. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CurrentTime600(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setCurrTimeHh600(fillSpace(2));
       replaceValue( // serialize and save the value
             (":").toCharArray()
             , getStartOffset() + 2
             ,1
             );
								setCurrTimeMm600(fillSpace(2));
       replaceValue( // serialize and save the value
             (":").toCharArray()
             , getStartOffset() + 5
             ,1
             );
								setCurrTimeSs600(fillSpace(2));
    } 

	/**
	 *	Returns the value of currTimeHh600
	 *	@return currTimeHh600
	 */
   public char[] getCurrTimeHh600() throws CFException{
     if (isCurrTimeHh600Modified()) { 
        currTimeHh600 = refreshCurrTimeHh600();
     }
   		return currTimeHh600;
   }

  
	/**
	*  set variable currTimeHh600
	*  Corresponding COBOL Variable is 600-CURR-TIME-HH
	*  @param value
	**/
   public void setCurrTimeHh600(char[] value) {
      currTimeHh600 = checkCurrTimeHh600Constraints(value);
      serializeCurrTimeHh600(currTimeHh600);
   } 

     /**
	 * 	Update CurrTimeHh600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrTimeHh600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurrTimeHh600,currTimeHh600.length);
   	
   }
   
   public void setCurrTimeHh600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurrTimeHh600,currTimeHh600.length);
   	
   }
   
     /**
	 * 	Update CurrTimeHh600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrTimeHh600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrTimeHh600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurrTimeHh600 with another Field
	 *	@param value
	 */
   public void setCurrTimeHh600(Field source) {
       replace(source,0,source.length(),beginCurrTimeHh600,CURR_TIME_HH_600_LEN);
   	
   }  
   
     /**
	 * 	Update CurrTimeHh600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrTimeHh600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurrTimeHh600,CURR_TIME_HH_600_LEN);
   	
   }
   
     /**
	 * 	Update CurrTimeHh600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrTimeHh600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrTimeHh600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of currTimeMm600
	 *	@return currTimeMm600
	 */
   public char[] getCurrTimeMm600() throws CFException{
     if (isCurrTimeMm600Modified()) { 
        currTimeMm600 = refreshCurrTimeMm600();
     }
   		return currTimeMm600;
   }

  
	/**
	*  set variable currTimeMm600
	*  Corresponding COBOL Variable is 600-CURR-TIME-MM
	*  @param value
	**/
   public void setCurrTimeMm600(char[] value) {
      currTimeMm600 = checkCurrTimeMm600Constraints(value);
      serializeCurrTimeMm600(currTimeMm600);
   } 

     /**
	 * 	Update CurrTimeMm600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrTimeMm600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurrTimeMm600,currTimeMm600.length);
   	
   }
   
   public void setCurrTimeMm600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurrTimeMm600,currTimeMm600.length);
   	
   }
   
     /**
	 * 	Update CurrTimeMm600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrTimeMm600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrTimeMm600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurrTimeMm600 with another Field
	 *	@param value
	 */
   public void setCurrTimeMm600(Field source) {
       replace(source,0,source.length(),beginCurrTimeMm600,CURR_TIME_MM_600_LEN);
   	
   }  
   
     /**
	 * 	Update CurrTimeMm600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrTimeMm600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurrTimeMm600,CURR_TIME_MM_600_LEN);
   	
   }
   
     /**
	 * 	Update CurrTimeMm600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrTimeMm600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrTimeMm600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of currTimeSs600
	 *	@return currTimeSs600
	 */
   public char[] getCurrTimeSs600() throws CFException{
     if (isCurrTimeSs600Modified()) { 
        currTimeSs600 = refreshCurrTimeSs600();
     }
   		return currTimeSs600;
   }

  
	/**
	*  set variable currTimeSs600
	*  Corresponding COBOL Variable is 600-CURR-TIME-SS
	*  @param value
	**/
   public void setCurrTimeSs600(char[] value) {
      currTimeSs600 = checkCurrTimeSs600Constraints(value);
      serializeCurrTimeSs600(currTimeSs600);
   } 

     /**
	 * 	Update CurrTimeSs600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrTimeSs600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurrTimeSs600,currTimeSs600.length);
   	
   }
   
   public void setCurrTimeSs600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurrTimeSs600,currTimeSs600.length);
   	
   }
   
     /**
	 * 	Update CurrTimeSs600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrTimeSs600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrTimeSs600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurrTimeSs600 with another Field
	 *	@param value
	 */
   public void setCurrTimeSs600(Field source) {
       replace(source,0,source.length(),beginCurrTimeSs600,CURR_TIME_SS_600_LEN);
   	
   }  
   
     /**
	 * 	Update CurrTimeSs600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrTimeSs600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurrTimeSs600,CURR_TIME_SS_600_LEN);
   	
   }
   
     /**
	 * 	Update CurrTimeSs600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrTimeSs600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrTimeSs600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getCurrentTime600FieldLength() {
			return CURRENT_TIME_600_LENGTH;
		}

}
  

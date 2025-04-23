package com.cloudframe.app.usbaeext.dto;

/**
*  The class TaMonthTableRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/


import com.cloudframe.app.usbaeext.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class TaMonthTableRedefined extends TaMonthTableRedefinedSerialized { 
   

						private char[] taMonth = Field.fillLowValue(3);
	
	/**
	* Constructor for TaMonthTableRedefined
	**/
    public TaMonthTableRedefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for TaMonthTableRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TaMonthTableRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of taMonth
	 *	@return taMonth
	 */
   public char[] getTaMonth() throws CFException{
     if (isTaMonthModified()) { 
        taMonth = refreshTaMonth();
     }
   		return taMonth;
   }

  
	/**
	*  set variable taMonth
	*  Corresponding COBOL Variable is TA-MONTH
	*  @param value
	**/
   public void setTaMonth(char[] value) {
      taMonth = checkTaMonthConstraints(value);
      serializeTaMonth(taMonth);
   } 

     /**
	 * 	Update TaMonth 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaMonth(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaMonth,taMonth.length);
   	
   }
   
   public void setTaMonth(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaMonth,taMonth.length);
   	
   }
   
     /**
	 * 	Update TaMonth 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaMonth(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaMonth+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaMonth with another Field
	 *	@param value
	 */
   public void setTaMonth(Field source) {
       replace(source,0,source.length(),beginTaMonth,TA_MONTH_LEN);
   	
   }  
   
     /**
	 * 	Update TaMonth 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaMonth(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaMonth,TA_MONTH_LEN);
   	
   }
   
     /**
	 * 	Update TaMonth 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaMonth(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaMonth+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTaMonthTableRedefinedFieldLength() {
			return TA_MONTH_TABLE_REDEFINED_LENGTH;
		}

}
  

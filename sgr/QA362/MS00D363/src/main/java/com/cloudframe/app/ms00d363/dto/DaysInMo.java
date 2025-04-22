package com.cloudframe.app.ms00d363.dto;

/**
*  The class DaysInMo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DaysInMo extends DaysInMoSerialized { 
   

						private char[] daysActive = Field.fillLowValue(1);
	
	/**
	* Constructor for DaysInMo
	**/
    public DaysInMo() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for DaysInMo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DaysInMo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of daysActive
	 *	@return daysActive
	 */
   public char[] getDaysActive() throws CFException{
     if (isDaysActiveModified()) { 
        daysActive = refreshDaysActive();
     }
   		return daysActive;
   }

  
	/**
	*  set variable daysActive
	*  Corresponding COBOL Variable is DAYS-ACTIVE
	*  @param value
	**/
   public void setDaysActive(char[] value) {
      daysActive = checkDaysActiveConstraints(value);
      serializeDaysActive(daysActive);
   } 

     /**
	 * 	Update DaysActive 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDaysActive(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDaysActive,daysActive.length);
   	
   }
   
   public void setDaysActive(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDaysActive,daysActive.length);
   	
   }
   
     /**
	 * 	Update DaysActive 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDaysActive(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDaysActive+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DaysActive with another Field
	 *	@param value
	 */
   public void setDaysActive(Field source) {
       replace(source,0,source.length(),beginDaysActive,DAYS_ACTIVE_LEN);
   	
   }  
   
     /**
	 * 	Update DaysActive 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDaysActive(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDaysActive,DAYS_ACTIVE_LEN);
   	
   }
   
     /**
	 * 	Update DaysActive 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDaysActive(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDaysActive+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDaysInMoFieldLength() {
			return DAYS_IN_MO_LENGTH;
		}

}
  

package com.cloudframe.app.ip343690.dto;

/**
*  The class SleepMessage600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:34. using version 5.0.0.254
**/


import com.cloudframe.app.ip343690.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SleepMessage600 extends SleepMessage600Serialized {
   


								private long sleepTime600;


						private char[] currTime600 = new char[8];
	
	/**
	* Constructor for SleepMessage600
	**/
    public SleepMessage600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("IP343690-SLEEPING (SHORT) FOR : HHMMSSMS : ").toCharArray()
             , getStartOffset() + 0
             ,43
             );
								setSleepTime600(0L);
       replaceValue( // serialize and save the value
             (" AT CURRENT TIME : ").toCharArray()
             , getStartOffset() + 51
             ,19
             );
								setCurrTime600(fillSpace(8));
    }


 

	/**
	 *	Returns the value of sleepTime600
	 *	@return sleepTime600
	 */
	public long getSleepTime600() throws CFException {
       if (isSleepTime600Modified()) { 
           sleepTime600 = refreshSleepTime600();
        }
   		return sleepTime600;
	}
	

	
	   
	/**
	 * 	Update SleepTime600 with the passed value
	 *  Corresponding COBOL Variable is 600-SLEEP-TIME
	 *	@param number
	 */
	public void setSleepTime600(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    sleepTime600 = checkSleepTime600MaxLimit(number); 
		serializeSleepTime600(sleepTime600);
	}
	

	/**
	 * 	Update SleepTime600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSleepTime600(char[] value) throws CFException {
		 sleepTime600 = serializeSleepTime600(value);
	}
	/**
	 * 	Update SleepTime600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSleepTime600String(char[] value) throws CFException {
		 setSleepTime600(value);
	}
	/**
	 *	Returns the value of currTime600
	 *	@return currTime600
	 */
   public char[] getCurrTime600() throws CFException{
     if (isCurrTime600Modified()) { 
        currTime600 = refreshCurrTime600();
     }
   		return currTime600;
   }

  
	/**
	*  set variable currTime600
	*  Corresponding COBOL Variable is 600-CURR-TIME
	*  @param value
	**/
   public void setCurrTime600(char[] value) {
      currTime600 = checkCurrTime600Constraints(value);
      serializeCurrTime600(currTime600);
   } 

     /**
	 * 	Update CurrTime600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrTime600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurrTime600,currTime600.length);
   	
   }
   
   public void setCurrTime600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurrTime600,currTime600.length);
   	
   }
   
     /**
	 * 	Update CurrTime600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrTime600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrTime600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurrTime600 with another Field
	 *	@param value
	 */
   public void setCurrTime600(Field source) {
       replace(source,0,source.length(),beginCurrTime600,CURR_TIME_600_LEN);
   	
   }  
   
     /**
	 * 	Update CurrTime600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrTime600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurrTime600,CURR_TIME_600_LEN);
   	
   }
   
     /**
	 * 	Update CurrTime600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrTime600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrTime600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSleepMessage600FieldLength() {
			return SLEEP_MESSAGE_600_LENGTH;
		}

}
  

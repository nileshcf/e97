package com.cloudframe.app.ip989010.dto;

/**
*  The class LuhnsWorkArea800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:34. using version 5.0.0.254
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class LuhnsWorkArea800 extends LuhnsWorkArea800Serialized { 
   

								private int evenValueDoubled800;
				private EvenValue800 evenValue800 = new EvenValue800();

								private int currentByte800;

								private int oddEvenTotal800;
	
	/**
	* Constructor for LuhnsWorkArea800
	**/
    public LuhnsWorkArea800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for LuhnsWorkArea800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public LuhnsWorkArea800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			evenValue800.setParent(this,getStartOffset() + 0);
								setEvenValueDoubled800(0);
								setCurrentByte800(0);
								setOddEvenTotal800(0);
    } 

	/**
	 *	Returns the value of evenValueDoubled800
	 *	@return evenValueDoubled800
	 */
	public int getEvenValueDoubled800() throws CFException {
       if (isEvenValueDoubled800Modified()) { 
           evenValueDoubled800 = refreshEvenValueDoubled800();
        }
   		return evenValueDoubled800;
	}
	

	
	   
	/**
	 * 	Update EvenValueDoubled800 with the passed value
	 *  Corresponding COBOL Variable is 800-EVEN-VALUE-DOUBLED
	 *	@param number
	 */
	public void setEvenValueDoubled800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    evenValueDoubled800 = checkEvenValueDoubled800MaxLimit(number); 
		serializeEvenValueDoubled800(evenValueDoubled800);
	}
	

	public void setEvenValueDoubled800(long number) {
	    number = checkEvenValueDoubled800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setEvenValueDoubled800((int)number);
	}
	
	/**
	 * 	Update EvenValueDoubled800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setEvenValueDoubled800(char[] value) throws CFException {
		 evenValueDoubled800 = serializeEvenValueDoubled800(value);
	}
	/**
	 * 	Update EvenValueDoubled800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setEvenValueDoubled800String(char[] value) throws CFException {
		 setEvenValueDoubled800(value);
	}
	/**
	 *	Returns the value of evenValue800
	 *	@return evenValue800
	 */   
	 public EvenValue800 getEvenValue800() {
   	return evenValue800;
   }
   /**
	* 	Update EvenValue800 with the passed value
	*   Corresponding COBOL Variable is 800-EVEN-VALUE
	*	@param value
	*/
   public void setEvenValue800(char[] value) {
      evenValue800.setString(value); 
   }   
    
     /**
	 * 	Update EvenValue800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setEvenValue800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,evenValue800.begin,evenValue800.length());
   }
   
     /**
	 * 	Update EvenValue800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEvenValue800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,evenValue800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update EvenValue800 with another Field
	 *	@param value
	 */
   public void setEvenValue800(Field source) {
   	replace(source,0,source.length(),evenValue800.begin,evenValue800.length());
   }  
   
     /**
	 * 	Update EvenValue800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setEvenValue800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,evenValue800.begin,evenValue800.length());
   }
   
     /**
	 * 	Update EvenValue800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEvenValue800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,evenValue800.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of currentByte800
	 *	@return currentByte800
	 */
	public int getCurrentByte800() throws CFException {
       if (isCurrentByte800Modified()) { 
           currentByte800 = refreshCurrentByte800();
        }
   		return currentByte800;
	}
	

	
	   
	/**
	 * 	Update CurrentByte800 with the passed value
	 *  Corresponding COBOL Variable is 800-CURRENT-BYTE
	 *	@param number
	 */
	public void setCurrentByte800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    currentByte800 = checkCurrentByte800MaxLimit(number); 
		serializeCurrentByte800(currentByte800);
	}
	

	public void setCurrentByte800(long number) {
	    number = checkCurrentByte800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setCurrentByte800((int)number);
	}
	
	/**
	 * 	Update CurrentByte800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCurrentByte800(char[] value) throws CFException {
		 currentByte800 = serializeCurrentByte800(value);
	}
	/**
	 * 	Update CurrentByte800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCurrentByte800String(char[] value) throws CFException {
		 setCurrentByte800(value);
	}
	/**
	 *	Returns the value of oddEvenTotal800
	 *	@return oddEvenTotal800
	 */
	public int getOddEvenTotal800() throws CFException {
       if (isOddEvenTotal800Modified()) { 
           oddEvenTotal800 = refreshOddEvenTotal800();
        }
   		return oddEvenTotal800;
	}
	

	
	   
	/**
	 * 	Update OddEvenTotal800 with the passed value
	 *  Corresponding COBOL Variable is 800-ODD-EVEN-TOTAL
	 *	@param number
	 */
	public void setOddEvenTotal800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    oddEvenTotal800 = checkOddEvenTotal800MaxLimit(number); 
		serializeOddEvenTotal800(oddEvenTotal800);
	}
	

	public void setOddEvenTotal800(long number) {
	    number = checkOddEvenTotal800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setOddEvenTotal800((int)number);
	}
	
	/**
	 * 	Update OddEvenTotal800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setOddEvenTotal800(char[] value) throws CFException {
		 oddEvenTotal800 = serializeOddEvenTotal800(value);
	}
	/**
	 * 	Update OddEvenTotal800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOddEvenTotal800String(char[] value) throws CFException {
		 setOddEvenTotal800(value);
	}

	
	
	

		public static int getLuhnsWorkArea800FieldLength() {
			return LUHNS_WORK_AREA_800_LENGTH;
		}

}
  

package com.cloudframe.app.ar640010.dto;

/**
*  The class FunctionTs800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FunctionTs800 extends FunctionTs800Serialized { 
   

								private long functionDate800;
				private FunctionDate800Redefined functionDate800Redefined = new FunctionDate800Redefined();

								private int functionHour800;

								private int functionMinute800;

								private int functionSecond800;

								private int functionHundredth800;

						private char[] functionGmtAdjust800 = new char[1];

						private char[] functionGmtHours800 = new char[2];

						private char[] functionGmtMinutes800 = new char[2];
	
	/**
	* Constructor for FunctionTs800
	**/
    public FunctionTs800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for FunctionTs800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FunctionTs800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			functionDate800Redefined.setParent(this,getStartOffset() + 0);
								functionDate800Redefined.setString(fillSpace(8));
								setFunctionGmtAdjust800(fillSpace(1));
								setFunctionGmtHours800(fillSpace(2));
								setFunctionGmtMinutes800(fillSpace(2));
    } 

	/**
	 *	Returns the value of functionDate800
	 *	@return functionDate800
	 */
	public long getFunctionDate800() throws CFException {
       if (isFunctionDate800Modified()) { 
           functionDate800 = refreshFunctionDate800();
        }
   		return functionDate800;
	}
	

	
	   
	/**
	 * 	Update FunctionDate800 with the passed value
	 *  Corresponding COBOL Variable is 800-FUNCTION-DATE
	 *	@param number
	 */
	public void setFunctionDate800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    functionDate800 = checkFunctionDate800MaxLimit(number); 
		serializeFunctionDate800(functionDate800);
	}
	

	/**
	 * 	Update FunctionDate800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setFunctionDate800(char[] value) throws CFException {
		 functionDate800 = serializeFunctionDate800(value);
	}
	/**
	 * 	Update FunctionDate800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFunctionDate800String(char[] value) throws CFException {
		 setFunctionDate800(value);
	}
	/**
	 *	Returns the value of functionDate800Redefined
	 *	@return functionDate800Redefined
	 */   
	 public FunctionDate800Redefined getFunctionDate800Redefined() {
   	return functionDate800Redefined;
   }
   /**
	* 	Update FunctionDate800Redefined with the passed value
	*   Corresponding COBOL Variable is 800-FUNCTION-DATE-REDEFINED
	*	@param value
	*/
   public void setFunctionDate800Redefined(char[] value) {
      functionDate800Redefined.setString(value); 
   }   
    
     /**
	 * 	Update FunctionDate800Redefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setFunctionDate800Redefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,functionDate800Redefined.begin,functionDate800Redefined.length());
   }
   
     /**
	 * 	Update FunctionDate800Redefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFunctionDate800Redefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,functionDate800Redefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update FunctionDate800Redefined with another Field
	 *	@param value
	 */
   public void setFunctionDate800Redefined(Field source) {
   	replace(source,0,source.length(),functionDate800Redefined.begin,functionDate800Redefined.length());
   }  
   
     /**
	 * 	Update FunctionDate800Redefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setFunctionDate800Redefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,functionDate800Redefined.begin,functionDate800Redefined.length());
   }
   
     /**
	 * 	Update FunctionDate800Redefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFunctionDate800Redefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,functionDate800Redefined.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of functionHour800
	 *	@return functionHour800
	 */
	public int getFunctionHour800() throws CFException {
       if (isFunctionHour800Modified()) { 
           functionHour800 = refreshFunctionHour800();
        }
   		return functionHour800;
	}
	

	
	   
	/**
	 * 	Update FunctionHour800 with the passed value
	 *  Corresponding COBOL Variable is 800-FUNCTION-HOUR
	 *	@param number
	 */
	public void setFunctionHour800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    functionHour800 = checkFunctionHour800MaxLimit(number); 
		serializeFunctionHour800(functionHour800);
	}
	

	public void setFunctionHour800(long number) {
	    number = checkFunctionHour800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setFunctionHour800((int)number);
	}
	
	/**
	 * 	Update FunctionHour800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setFunctionHour800(char[] value) throws CFException {
		 functionHour800 = serializeFunctionHour800(value);
	}
	/**
	 * 	Update FunctionHour800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFunctionHour800String(char[] value) throws CFException {
		 setFunctionHour800(value);
	}
	/**
	 *	Returns the value of functionMinute800
	 *	@return functionMinute800
	 */
	public int getFunctionMinute800() throws CFException {
       if (isFunctionMinute800Modified()) { 
           functionMinute800 = refreshFunctionMinute800();
        }
   		return functionMinute800;
	}
	

	
	   
	/**
	 * 	Update FunctionMinute800 with the passed value
	 *  Corresponding COBOL Variable is 800-FUNCTION-MINUTE
	 *	@param number
	 */
	public void setFunctionMinute800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    functionMinute800 = checkFunctionMinute800MaxLimit(number); 
		serializeFunctionMinute800(functionMinute800);
	}
	

	public void setFunctionMinute800(long number) {
	    number = checkFunctionMinute800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setFunctionMinute800((int)number);
	}
	
	/**
	 * 	Update FunctionMinute800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setFunctionMinute800(char[] value) throws CFException {
		 functionMinute800 = serializeFunctionMinute800(value);
	}
	/**
	 * 	Update FunctionMinute800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFunctionMinute800String(char[] value) throws CFException {
		 setFunctionMinute800(value);
	}
	/**
	 *	Returns the value of functionSecond800
	 *	@return functionSecond800
	 */
	public int getFunctionSecond800() throws CFException {
       if (isFunctionSecond800Modified()) { 
           functionSecond800 = refreshFunctionSecond800();
        }
   		return functionSecond800;
	}
	

	
	   
	/**
	 * 	Update FunctionSecond800 with the passed value
	 *  Corresponding COBOL Variable is 800-FUNCTION-SECOND
	 *	@param number
	 */
	public void setFunctionSecond800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    functionSecond800 = checkFunctionSecond800MaxLimit(number); 
		serializeFunctionSecond800(functionSecond800);
	}
	

	public void setFunctionSecond800(long number) {
	    number = checkFunctionSecond800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setFunctionSecond800((int)number);
	}
	
	/**
	 * 	Update FunctionSecond800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setFunctionSecond800(char[] value) throws CFException {
		 functionSecond800 = serializeFunctionSecond800(value);
	}
	/**
	 * 	Update FunctionSecond800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFunctionSecond800String(char[] value) throws CFException {
		 setFunctionSecond800(value);
	}
	/**
	 *	Returns the value of functionHundredth800
	 *	@return functionHundredth800
	 */
	public int getFunctionHundredth800() throws CFException {
       if (isFunctionHundredth800Modified()) { 
           functionHundredth800 = refreshFunctionHundredth800();
        }
   		return functionHundredth800;
	}
	

	
	   
	/**
	 * 	Update FunctionHundredth800 with the passed value
	 *  Corresponding COBOL Variable is 800-FUNCTION-HUNDREDTH
	 *	@param number
	 */
	public void setFunctionHundredth800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    functionHundredth800 = checkFunctionHundredth800MaxLimit(number); 
		serializeFunctionHundredth800(functionHundredth800);
	}
	

	public void setFunctionHundredth800(long number) {
	    number = checkFunctionHundredth800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setFunctionHundredth800((int)number);
	}
	
	/**
	 * 	Update FunctionHundredth800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setFunctionHundredth800(char[] value) throws CFException {
		 functionHundredth800 = serializeFunctionHundredth800(value);
	}
	/**
	 * 	Update FunctionHundredth800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFunctionHundredth800String(char[] value) throws CFException {
		 setFunctionHundredth800(value);
	}
	/**
	 *	Returns the value of functionGmtAdjust800
	 *	@return functionGmtAdjust800
	 */
   public char[] getFunctionGmtAdjust800() throws CFException{
     if (isFunctionGmtAdjust800Modified()) { 
        functionGmtAdjust800 = refreshFunctionGmtAdjust800();
     }
   		return functionGmtAdjust800;
   }

  
	/**
	*  set variable functionGmtAdjust800
	*  Corresponding COBOL Variable is 800-FUNCTION-GMT-ADJUST
	*  @param value
	**/
   public void setFunctionGmtAdjust800(char[] value) {
      functionGmtAdjust800 = checkFunctionGmtAdjust800Constraints(value);
      serializeFunctionGmtAdjust800(functionGmtAdjust800);
   } 

     /**
	 * 	Update FunctionGmtAdjust800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFunctionGmtAdjust800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFunctionGmtAdjust800,functionGmtAdjust800.length);
   	
   }
   
   public void setFunctionGmtAdjust800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFunctionGmtAdjust800,functionGmtAdjust800.length);
   	
   }
   
     /**
	 * 	Update FunctionGmtAdjust800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFunctionGmtAdjust800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFunctionGmtAdjust800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FunctionGmtAdjust800 with another Field
	 *	@param value
	 */
   public void setFunctionGmtAdjust800(Field source) {
       replace(source,0,source.length(),beginFunctionGmtAdjust800,FUNCTION_GMT_ADJUST_800_LEN);
   	
   }  
   
     /**
	 * 	Update FunctionGmtAdjust800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFunctionGmtAdjust800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFunctionGmtAdjust800,FUNCTION_GMT_ADJUST_800_LEN);
   	
   }
   
     /**
	 * 	Update FunctionGmtAdjust800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFunctionGmtAdjust800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFunctionGmtAdjust800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of functionGmtHours800
	 *	@return functionGmtHours800
	 */
   public char[] getFunctionGmtHours800() throws CFException{
     if (isFunctionGmtHours800Modified()) { 
        functionGmtHours800 = refreshFunctionGmtHours800();
     }
   		return functionGmtHours800;
   }

  
	/**
	*  set variable functionGmtHours800
	*  Corresponding COBOL Variable is 800-FUNCTION-GMT-HOURS
	*  @param value
	**/
   public void setFunctionGmtHours800(char[] value) {
      functionGmtHours800 = checkFunctionGmtHours800Constraints(value);
      serializeFunctionGmtHours800(functionGmtHours800);
   } 

     /**
	 * 	Update FunctionGmtHours800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFunctionGmtHours800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFunctionGmtHours800,functionGmtHours800.length);
   	
   }
   
   public void setFunctionGmtHours800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFunctionGmtHours800,functionGmtHours800.length);
   	
   }
   
     /**
	 * 	Update FunctionGmtHours800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFunctionGmtHours800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFunctionGmtHours800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FunctionGmtHours800 with another Field
	 *	@param value
	 */
   public void setFunctionGmtHours800(Field source) {
       replace(source,0,source.length(),beginFunctionGmtHours800,FUNCTION_GMT_HOURS_800_LEN);
   	
   }  
   
     /**
	 * 	Update FunctionGmtHours800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFunctionGmtHours800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFunctionGmtHours800,FUNCTION_GMT_HOURS_800_LEN);
   	
   }
   
     /**
	 * 	Update FunctionGmtHours800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFunctionGmtHours800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFunctionGmtHours800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of functionGmtMinutes800
	 *	@return functionGmtMinutes800
	 */
   public char[] getFunctionGmtMinutes800() throws CFException{
     if (isFunctionGmtMinutes800Modified()) { 
        functionGmtMinutes800 = refreshFunctionGmtMinutes800();
     }
   		return functionGmtMinutes800;
   }

  
	/**
	*  set variable functionGmtMinutes800
	*  Corresponding COBOL Variable is 800-FUNCTION-GMT-MINUTES
	*  @param value
	**/
   public void setFunctionGmtMinutes800(char[] value) {
      functionGmtMinutes800 = checkFunctionGmtMinutes800Constraints(value);
      serializeFunctionGmtMinutes800(functionGmtMinutes800);
   } 

     /**
	 * 	Update FunctionGmtMinutes800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFunctionGmtMinutes800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFunctionGmtMinutes800,functionGmtMinutes800.length);
   	
   }
   
   public void setFunctionGmtMinutes800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFunctionGmtMinutes800,functionGmtMinutes800.length);
   	
   }
   
     /**
	 * 	Update FunctionGmtMinutes800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFunctionGmtMinutes800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFunctionGmtMinutes800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FunctionGmtMinutes800 with another Field
	 *	@param value
	 */
   public void setFunctionGmtMinutes800(Field source) {
       replace(source,0,source.length(),beginFunctionGmtMinutes800,FUNCTION_GMT_MINUTES_800_LEN);
   	
   }  
   
     /**
	 * 	Update FunctionGmtMinutes800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFunctionGmtMinutes800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFunctionGmtMinutes800,FUNCTION_GMT_MINUTES_800_LEN);
   	
   }
   
     /**
	 * 	Update FunctionGmtMinutes800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFunctionGmtMinutes800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFunctionGmtMinutes800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getFunctionTs800FieldLength() {
			return FUNCTION_TS_800_LENGTH;
		}

}
  

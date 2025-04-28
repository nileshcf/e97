package com.cloudframe.app.init1.dto;

/**
*  The class Counters is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:55. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Counters extends CountersSerialized { 
   
				private ProgramCounters programCounters = new ProgramCounters();
	
	/**
	* Constructor for Counters
	**/
    public Counters() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			programCounters.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of programCounters
	 *	@return programCounters
	 */   
	 public ProgramCounters getProgramCounters() {
   	return programCounters;
   }
   /**
	* 	Update ProgramCounters with the passed value
	*   Corresponding COBOL Variable is WS-PROGRAM-COUNTERS
	*	@param value
	*/
   public void setProgramCounters(char[] value) {
      programCounters.setString(value); 
   }   
    
     /**
	 * 	Update ProgramCounters 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setProgramCounters(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,programCounters.begin,programCounters.length());
   }
   
     /**
	 * 	Update ProgramCounters 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setProgramCounters(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,programCounters.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ProgramCounters with another Field
	 *	@param value
	 */
   public void setProgramCounters(Field source) {
   	replace(source,0,source.length(),programCounters.begin,programCounters.length());
   }  
   
     /**
	 * 	Update ProgramCounters 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setProgramCounters(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,programCounters.begin,programCounters.length());
   }
   
     /**
	 * 	Update ProgramCounters 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setProgramCounters(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,programCounters.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Counters
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          programCounters.initialize();
     
   }

		public static int getCountersFieldLength() {
			return COUNTERS_LENGTH;
		}

}
  

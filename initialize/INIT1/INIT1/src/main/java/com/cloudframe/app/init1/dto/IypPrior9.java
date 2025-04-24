package com.cloudframe.app.init1.dto;

/**
*  The class IypPrior9 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class IypPrior9 extends IypPrior9Serialized { 
   

						private char[] ws9iypDatesPrior = new char[20];

								private int ws9iypDiscntIdPrior;
	
	/**
	* Constructor for IypPrior9
	**/
    public IypPrior9() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for IypPrior9. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IypPrior9(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setWs9iypDatesPrior(fillSpace(20));
								setWs9iypDiscntIdPrior(0);
    } 

	/**
	 *	Returns the value of ws9iypDatesPrior
	 *	@return ws9iypDatesPrior
	 */
   public char[] getWs9iypDatesPrior() throws CFException{
     if (isWs9iypDatesPriorModified()) { 
        ws9iypDatesPrior = refreshWs9iypDatesPrior();
     }
   		return ws9iypDatesPrior;
   }

  
	/**
	*  set variable ws9iypDatesPrior
	*  Corresponding COBOL Variable is WS9IYP-DATES-PRIOR
	*  @param value
	**/
   public void setWs9iypDatesPrior(char[] value) {
      ws9iypDatesPrior = checkWs9iypDatesPriorConstraints(value);
      serializeWs9iypDatesPrior(ws9iypDatesPrior);
   } 

     /**
	 * 	Update Ws9iypDatesPrior 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWs9iypDatesPrior(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWs9iypDatesPrior,ws9iypDatesPrior.length);
   	
   }
   
   public void setWs9iypDatesPrior(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWs9iypDatesPrior,ws9iypDatesPrior.length);
   	
   }
   
     /**
	 * 	Update Ws9iypDatesPrior 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWs9iypDatesPrior(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWs9iypDatesPrior+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ws9iypDatesPrior with another Field
	 *	@param value
	 */
   public void setWs9iypDatesPrior(Field source) {
       replace(source,0,source.length(),beginWs9iypDatesPrior,WS_9IYP_DATES_PRIOR_LEN);
   	
   }  
   
     /**
	 * 	Update Ws9iypDatesPrior 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWs9iypDatesPrior(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWs9iypDatesPrior,WS_9IYP_DATES_PRIOR_LEN);
   	
   }
   
     /**
	 * 	Update Ws9iypDatesPrior 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWs9iypDatesPrior(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWs9iypDatesPrior+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ws9iypDiscntIdPrior
	 *	@return ws9iypDiscntIdPrior
	 */
	public int getWs9iypDiscntIdPrior() throws CFException {
        if (isWs9iypDiscntIdPriorModified()) { 
           ws9iypDiscntIdPrior = refreshWs9iypDiscntIdPrior();
        }
   		return ws9iypDiscntIdPrior;
	}
	
	/**
	 * 	Update Ws9iypDiscntIdPrior with the passed value
	 *  Corresponding COBOL Variable is WS9IYP-DISCNT-ID-PRIOR
	 *	@param number
	 */
	public void setWs9iypDiscntIdPrior(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ws9iypDiscntIdPrior = checkWs9iypDiscntIdPriorMaxLimit(number); 
		serializeWs9iypDiscntIdPrior(ws9iypDiscntIdPrior);
	}


	public void setWs9iypDiscntIdPrior(long number) {
	    number = checkWs9iypDiscntIdPriorMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWs9iypDiscntIdPrior((int)number);
	}
	

	
	
	
	/**
	 * 	initializes IypPrior9
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWs9iypDatesPrior(CONSTANTS.SPACE_20);
                     setWs9iypDiscntIdPrior(0);
   }

		public static int getIypPrior9FieldLength() {
			return IYP_PRIOR_9_LENGTH;
		}

}
  

package com.cloudframe.app.init1.dto;

/**
*  The class IypPrior8 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class IypPrior8 extends IypPrior8Serialized { 
   

						private char[] ws8iypDatesPrior = new char[20];

								private int ws8iypDiscntIdPrior;
	
	/**
	* Constructor for IypPrior8
	**/
    public IypPrior8() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for IypPrior8. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IypPrior8(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setWs8iypDatesPrior(fillSpace(20));
								setWs8iypDiscntIdPrior(0);
    } 

	/**
	 *	Returns the value of ws8iypDatesPrior
	 *	@return ws8iypDatesPrior
	 */
   public char[] getWs8iypDatesPrior() throws CFException{
     if (isWs8iypDatesPriorModified()) { 
        ws8iypDatesPrior = refreshWs8iypDatesPrior();
     }
   		return ws8iypDatesPrior;
   }

  
	/**
	*  set variable ws8iypDatesPrior
	*  Corresponding COBOL Variable is WS8IYP-DATES-PRIOR
	*  @param value
	**/
   public void setWs8iypDatesPrior(char[] value) {
      ws8iypDatesPrior = checkWs8iypDatesPriorConstraints(value);
      serializeWs8iypDatesPrior(ws8iypDatesPrior);
   } 

     /**
	 * 	Update Ws8iypDatesPrior 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWs8iypDatesPrior(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWs8iypDatesPrior,ws8iypDatesPrior.length);
   	
   }
   
   public void setWs8iypDatesPrior(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWs8iypDatesPrior,ws8iypDatesPrior.length);
   	
   }
   
     /**
	 * 	Update Ws8iypDatesPrior 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWs8iypDatesPrior(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWs8iypDatesPrior+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ws8iypDatesPrior with another Field
	 *	@param value
	 */
   public void setWs8iypDatesPrior(Field source) {
       replace(source,0,source.length(),beginWs8iypDatesPrior,WS_8IYP_DATES_PRIOR_LEN);
   	
   }  
   
     /**
	 * 	Update Ws8iypDatesPrior 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWs8iypDatesPrior(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWs8iypDatesPrior,WS_8IYP_DATES_PRIOR_LEN);
   	
   }
   
     /**
	 * 	Update Ws8iypDatesPrior 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWs8iypDatesPrior(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWs8iypDatesPrior+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ws8iypDiscntIdPrior
	 *	@return ws8iypDiscntIdPrior
	 */
	public int getWs8iypDiscntIdPrior() throws CFException {
        if (isWs8iypDiscntIdPriorModified()) { 
           ws8iypDiscntIdPrior = refreshWs8iypDiscntIdPrior();
        }
   		return ws8iypDiscntIdPrior;
	}
	
	/**
	 * 	Update Ws8iypDiscntIdPrior with the passed value
	 *  Corresponding COBOL Variable is WS8IYP-DISCNT-ID-PRIOR
	 *	@param number
	 */
	public void setWs8iypDiscntIdPrior(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ws8iypDiscntIdPrior = checkWs8iypDiscntIdPriorMaxLimit(number); 
		serializeWs8iypDiscntIdPrior(ws8iypDiscntIdPrior);
	}


	public void setWs8iypDiscntIdPrior(long number) {
	    number = checkWs8iypDiscntIdPriorMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWs8iypDiscntIdPrior((int)number);
	}
	

	
	
	
	/**
	 * 	initializes IypPrior8
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWs8iypDatesPrior(CONSTANTS.SPACE_20);
                     setWs8iypDiscntIdPrior(0);
   }

		public static int getIypPrior8FieldLength() {
			return IYP_PRIOR_8_LENGTH;
		}

}
  

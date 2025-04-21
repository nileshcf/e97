package com.cloudframe.app.init1.dto;

/**
*  The class IypPrior7 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:59. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class IypPrior7 extends IypPrior7Serialized { 
   

						private char[] ws7iypDatesPrior = new char[20];

								private int ws7iypDiscntIdPrior;
	
	/**
	* Constructor for IypPrior7
	**/
    public IypPrior7() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for IypPrior7. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IypPrior7(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setWs7iypDatesPrior(fillSpace(20));
								setWs7iypDiscntIdPrior(0);
    } 

	/**
	 *	Returns the value of ws7iypDatesPrior
	 *	@return ws7iypDatesPrior
	 */
   public char[] getWs7iypDatesPrior() throws CFException{
     if (isWs7iypDatesPriorModified()) { 
        ws7iypDatesPrior = refreshWs7iypDatesPrior();
     }
   		return ws7iypDatesPrior;
   }

  
	/**
	*  set variable ws7iypDatesPrior
	*  Corresponding COBOL Variable is WS7IYP-DATES-PRIOR
	*  @param value
	**/
   public void setWs7iypDatesPrior(char[] value) {
      ws7iypDatesPrior = checkWs7iypDatesPriorConstraints(value);
      serializeWs7iypDatesPrior(ws7iypDatesPrior);
   } 

     /**
	 * 	Update Ws7iypDatesPrior 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWs7iypDatesPrior(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWs7iypDatesPrior,ws7iypDatesPrior.length);
   	
   }
   
   public void setWs7iypDatesPrior(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWs7iypDatesPrior,ws7iypDatesPrior.length);
   	
   }
   
     /**
	 * 	Update Ws7iypDatesPrior 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWs7iypDatesPrior(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWs7iypDatesPrior+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ws7iypDatesPrior with another Field
	 *	@param value
	 */
   public void setWs7iypDatesPrior(Field source) {
       replace(source,0,source.length(),beginWs7iypDatesPrior,WS_7IYP_DATES_PRIOR_LEN);
   	
   }  
   
     /**
	 * 	Update Ws7iypDatesPrior 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWs7iypDatesPrior(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWs7iypDatesPrior,WS_7IYP_DATES_PRIOR_LEN);
   	
   }
   
     /**
	 * 	Update Ws7iypDatesPrior 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWs7iypDatesPrior(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWs7iypDatesPrior+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ws7iypDiscntIdPrior
	 *	@return ws7iypDiscntIdPrior
	 */
	public int getWs7iypDiscntIdPrior() throws CFException {
        if (isWs7iypDiscntIdPriorModified()) { 
           ws7iypDiscntIdPrior = refreshWs7iypDiscntIdPrior();
        }
   		return ws7iypDiscntIdPrior;
	}
	
	/**
	 * 	Update Ws7iypDiscntIdPrior with the passed value
	 *  Corresponding COBOL Variable is WS7IYP-DISCNT-ID-PRIOR
	 *	@param number
	 */
	public void setWs7iypDiscntIdPrior(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ws7iypDiscntIdPrior = checkWs7iypDiscntIdPriorMaxLimit(number); 
		serializeWs7iypDiscntIdPrior(ws7iypDiscntIdPrior);
	}


	public void setWs7iypDiscntIdPrior(long number) {
	    number = checkWs7iypDiscntIdPriorMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWs7iypDiscntIdPrior((int)number);
	}
	

	
	
	
	/**
	 * 	initializes IypPrior7
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWs7iypDatesPrior(CONSTANTS.SPACE_20);
                     setWs7iypDiscntIdPrior(0);
   }

		public static int getIypPrior7FieldLength() {
			return IYP_PRIOR_7_LENGTH;
		}

}
  

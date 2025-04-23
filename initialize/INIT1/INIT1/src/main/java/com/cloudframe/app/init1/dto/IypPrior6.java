package com.cloudframe.app.init1.dto;

/**
*  The class IypPrior6 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:56. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class IypPrior6 extends IypPrior6Serialized { 
   

						private char[] ws6iypDatesPrior = new char[20];

								private int ws6iypDiscntIdPrior;
	
	/**
	* Constructor for IypPrior6
	**/
    public IypPrior6() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for IypPrior6. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IypPrior6(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setWs6iypDatesPrior(fillSpace(20));
								setWs6iypDiscntIdPrior(0);
    } 

	/**
	 *	Returns the value of ws6iypDatesPrior
	 *	@return ws6iypDatesPrior
	 */
   public char[] getWs6iypDatesPrior() throws CFException{
     if (isWs6iypDatesPriorModified()) { 
        ws6iypDatesPrior = refreshWs6iypDatesPrior();
     }
   		return ws6iypDatesPrior;
   }

  
	/**
	*  set variable ws6iypDatesPrior
	*  Corresponding COBOL Variable is WS6IYP-DATES-PRIOR
	*  @param value
	**/
   public void setWs6iypDatesPrior(char[] value) {
      ws6iypDatesPrior = checkWs6iypDatesPriorConstraints(value);
      serializeWs6iypDatesPrior(ws6iypDatesPrior);
   } 

     /**
	 * 	Update Ws6iypDatesPrior 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWs6iypDatesPrior(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWs6iypDatesPrior,ws6iypDatesPrior.length);
   	
   }
   
   public void setWs6iypDatesPrior(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWs6iypDatesPrior,ws6iypDatesPrior.length);
   	
   }
   
     /**
	 * 	Update Ws6iypDatesPrior 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWs6iypDatesPrior(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWs6iypDatesPrior+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ws6iypDatesPrior with another Field
	 *	@param value
	 */
   public void setWs6iypDatesPrior(Field source) {
       replace(source,0,source.length(),beginWs6iypDatesPrior,WS_6IYP_DATES_PRIOR_LEN);
   	
   }  
   
     /**
	 * 	Update Ws6iypDatesPrior 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWs6iypDatesPrior(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWs6iypDatesPrior,WS_6IYP_DATES_PRIOR_LEN);
   	
   }
   
     /**
	 * 	Update Ws6iypDatesPrior 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWs6iypDatesPrior(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWs6iypDatesPrior+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ws6iypDiscntIdPrior
	 *	@return ws6iypDiscntIdPrior
	 */
	public int getWs6iypDiscntIdPrior() throws CFException {
        if (isWs6iypDiscntIdPriorModified()) { 
           ws6iypDiscntIdPrior = refreshWs6iypDiscntIdPrior();
        }
   		return ws6iypDiscntIdPrior;
	}
	
	/**
	 * 	Update Ws6iypDiscntIdPrior with the passed value
	 *  Corresponding COBOL Variable is WS6IYP-DISCNT-ID-PRIOR
	 *	@param number
	 */
	public void setWs6iypDiscntIdPrior(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ws6iypDiscntIdPrior = checkWs6iypDiscntIdPriorMaxLimit(number); 
		serializeWs6iypDiscntIdPrior(ws6iypDiscntIdPrior);
	}


	public void setWs6iypDiscntIdPrior(long number) {
	    number = checkWs6iypDiscntIdPriorMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWs6iypDiscntIdPrior((int)number);
	}
	

	
	
	
	/**
	 * 	initializes IypPrior6
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWs6iypDatesPrior(CONSTANTS.SPACE_20);
                     setWs6iypDiscntIdPrior(0);
   }

		public static int getIypPrior6FieldLength() {
			return IYP_PRIOR_6_LENGTH;
		}

}
  

package com.cloudframe.app.init1.dto;

/**
*  The class AiypPrior is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:53. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AiypPrior extends AiypPriorSerialized { 
   

						private char[] wsaiypDatesPrior = new char[20];

								private int wsaiypDiscntIdPrior;
	
	/**
	* Constructor for AiypPrior
	**/
    public AiypPrior() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AiypPrior. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AiypPrior(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setWsaiypDatesPrior(fillSpace(20));
								setWsaiypDiscntIdPrior(0);
    } 

	/**
	 *	Returns the value of wsaiypDatesPrior
	 *	@return wsaiypDatesPrior
	 */
   public char[] getWsaiypDatesPrior() throws CFException{
     if (isWsaiypDatesPriorModified()) { 
        wsaiypDatesPrior = refreshWsaiypDatesPrior();
     }
   		return wsaiypDatesPrior;
   }

  
	/**
	*  set variable wsaiypDatesPrior
	*  Corresponding COBOL Variable is WSAIYP-DATES-PRIOR
	*  @param value
	**/
   public void setWsaiypDatesPrior(char[] value) {
      wsaiypDatesPrior = checkWsaiypDatesPriorConstraints(value);
      serializeWsaiypDatesPrior(wsaiypDatesPrior);
   } 

     /**
	 * 	Update WsaiypDatesPrior 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWsaiypDatesPrior(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWsaiypDatesPrior,wsaiypDatesPrior.length);
   	
   }
   
   public void setWsaiypDatesPrior(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWsaiypDatesPrior,wsaiypDatesPrior.length);
   	
   }
   
     /**
	 * 	Update WsaiypDatesPrior 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWsaiypDatesPrior(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWsaiypDatesPrior+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WsaiypDatesPrior with another Field
	 *	@param value
	 */
   public void setWsaiypDatesPrior(Field source) {
       replace(source,0,source.length(),beginWsaiypDatesPrior,WSAIYP_DATES_PRIOR_LEN);
   	
   }  
   
     /**
	 * 	Update WsaiypDatesPrior 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWsaiypDatesPrior(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWsaiypDatesPrior,WSAIYP_DATES_PRIOR_LEN);
   	
   }
   
     /**
	 * 	Update WsaiypDatesPrior 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWsaiypDatesPrior(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWsaiypDatesPrior+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wsaiypDiscntIdPrior
	 *	@return wsaiypDiscntIdPrior
	 */
	public int getWsaiypDiscntIdPrior() throws CFException {
        if (isWsaiypDiscntIdPriorModified()) { 
           wsaiypDiscntIdPrior = refreshWsaiypDiscntIdPrior();
        }
   		return wsaiypDiscntIdPrior;
	}
	
	/**
	 * 	Update WsaiypDiscntIdPrior with the passed value
	 *  Corresponding COBOL Variable is WSAIYP-DISCNT-ID-PRIOR
	 *	@param number
	 */
	public void setWsaiypDiscntIdPrior(int number) {
	     // Truncate if the number is beyond +/- Max range
	    wsaiypDiscntIdPrior = checkWsaiypDiscntIdPriorMaxLimit(number); 
		serializeWsaiypDiscntIdPrior(wsaiypDiscntIdPrior);
	}


	public void setWsaiypDiscntIdPrior(long number) {
	    number = checkWsaiypDiscntIdPriorMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWsaiypDiscntIdPrior((int)number);
	}
	

	
	
	
	/**
	 * 	initializes AiypPrior
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWsaiypDatesPrior(CONSTANTS.SPACE_20);
                     setWsaiypDiscntIdPrior(0);
   }

		public static int getAiypPriorFieldLength() {
			return AIYP_PRIOR_LENGTH;
		}

}
  

package com.cloudframe.app.init1.dto;

/**
*  The class AiypCurr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AiypCurr extends AiypCurrSerialized { 
   

						private char[] wsaiypDatesCurr = new char[20];

								private int wsaiypDiscntIdCurr;
	
	/**
	* Constructor for AiypCurr
	**/
    public AiypCurr() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AiypCurr. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AiypCurr(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setWsaiypDatesCurr(fillSpace(20));
								setWsaiypDiscntIdCurr(0);
    } 

	/**
	 *	Returns the value of wsaiypDatesCurr
	 *	@return wsaiypDatesCurr
	 */
   public char[] getWsaiypDatesCurr() throws CFException{
     if (isWsaiypDatesCurrModified()) { 
        wsaiypDatesCurr = refreshWsaiypDatesCurr();
     }
   		return wsaiypDatesCurr;
   }

  
	/**
	*  set variable wsaiypDatesCurr
	*  Corresponding COBOL Variable is WSAIYP-DATES-CURR
	*  @param value
	**/
   public void setWsaiypDatesCurr(char[] value) {
      wsaiypDatesCurr = checkWsaiypDatesCurrConstraints(value);
      serializeWsaiypDatesCurr(wsaiypDatesCurr);
   } 

     /**
	 * 	Update WsaiypDatesCurr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWsaiypDatesCurr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWsaiypDatesCurr,wsaiypDatesCurr.length);
   	
   }
   
   public void setWsaiypDatesCurr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWsaiypDatesCurr,wsaiypDatesCurr.length);
   	
   }
   
     /**
	 * 	Update WsaiypDatesCurr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWsaiypDatesCurr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWsaiypDatesCurr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WsaiypDatesCurr with another Field
	 *	@param value
	 */
   public void setWsaiypDatesCurr(Field source) {
       replace(source,0,source.length(),beginWsaiypDatesCurr,WSAIYP_DATES_CURR_LEN);
   	
   }  
   
     /**
	 * 	Update WsaiypDatesCurr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWsaiypDatesCurr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWsaiypDatesCurr,WSAIYP_DATES_CURR_LEN);
   	
   }
   
     /**
	 * 	Update WsaiypDatesCurr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWsaiypDatesCurr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWsaiypDatesCurr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wsaiypDiscntIdCurr
	 *	@return wsaiypDiscntIdCurr
	 */
	public int getWsaiypDiscntIdCurr() throws CFException {
        if (isWsaiypDiscntIdCurrModified()) { 
           wsaiypDiscntIdCurr = refreshWsaiypDiscntIdCurr();
        }
   		return wsaiypDiscntIdCurr;
	}
	
	/**
	 * 	Update WsaiypDiscntIdCurr with the passed value
	 *  Corresponding COBOL Variable is WSAIYP-DISCNT-ID-CURR
	 *	@param number
	 */
	public void setWsaiypDiscntIdCurr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    wsaiypDiscntIdCurr = checkWsaiypDiscntIdCurrMaxLimit(number); 
		serializeWsaiypDiscntIdCurr(wsaiypDiscntIdCurr);
	}


	public void setWsaiypDiscntIdCurr(long number) {
	    number = checkWsaiypDiscntIdCurrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWsaiypDiscntIdCurr((int)number);
	}
	

	
	
	
	/**
	 * 	initializes AiypCurr
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWsaiypDatesCurr(CONSTANTS.SPACE_20);
                     setWsaiypDiscntIdCurr(0);
   }

		public static int getAiypCurrFieldLength() {
			return AIYP_CURR_LENGTH;
		}

}
  

package com.cloudframe.app.init1.dto;

/**
*  The class IypCurr8 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:13. using version 5.0.0.257
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class IypCurr8 extends IypCurr8Serialized { 
   

						private char[] ws8iypDatesCurr = new char[20];

								private int ws8iypDiscntIdCurr;
	
	/**
	* Constructor for IypCurr8
	**/
    public IypCurr8() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for IypCurr8. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IypCurr8(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setWs8iypDatesCurr(fillSpace(20));
								setWs8iypDiscntIdCurr(0);
    } 

	/**
	 *	Returns the value of ws8iypDatesCurr
	 *	@return ws8iypDatesCurr
	 */
   public char[] getWs8iypDatesCurr() throws CFException{
     if (isWs8iypDatesCurrModified()) { 
        ws8iypDatesCurr = refreshWs8iypDatesCurr();
     }
   		return ws8iypDatesCurr;
   }

  
	/**
	*  set variable ws8iypDatesCurr
	*  Corresponding COBOL Variable is WS8IYP-DATES-CURR
	*  @param value
	**/
   public void setWs8iypDatesCurr(char[] value) {
      ws8iypDatesCurr = checkWs8iypDatesCurrConstraints(value);
      serializeWs8iypDatesCurr(ws8iypDatesCurr);
   } 

     /**
	 * 	Update Ws8iypDatesCurr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWs8iypDatesCurr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWs8iypDatesCurr,ws8iypDatesCurr.length);
   	
   }
   
   public void setWs8iypDatesCurr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWs8iypDatesCurr,ws8iypDatesCurr.length);
   	
   }
   
     /**
	 * 	Update Ws8iypDatesCurr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWs8iypDatesCurr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWs8iypDatesCurr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ws8iypDatesCurr with another Field
	 *	@param value
	 */
   public void setWs8iypDatesCurr(Field source) {
       replace(source,0,source.length(),beginWs8iypDatesCurr,WS_8IYP_DATES_CURR_LEN);
   	
   }  
   
     /**
	 * 	Update Ws8iypDatesCurr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWs8iypDatesCurr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWs8iypDatesCurr,WS_8IYP_DATES_CURR_LEN);
   	
   }
   
     /**
	 * 	Update Ws8iypDatesCurr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWs8iypDatesCurr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWs8iypDatesCurr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ws8iypDiscntIdCurr
	 *	@return ws8iypDiscntIdCurr
	 */
	public int getWs8iypDiscntIdCurr() throws CFException {
        if (isWs8iypDiscntIdCurrModified()) { 
           ws8iypDiscntIdCurr = refreshWs8iypDiscntIdCurr();
        }
   		return ws8iypDiscntIdCurr;
	}
	
	/**
	 * 	Update Ws8iypDiscntIdCurr with the passed value
	 *  Corresponding COBOL Variable is WS8IYP-DISCNT-ID-CURR
	 *	@param number
	 */
	public void setWs8iypDiscntIdCurr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ws8iypDiscntIdCurr = checkWs8iypDiscntIdCurrMaxLimit(number); 
		serializeWs8iypDiscntIdCurr(ws8iypDiscntIdCurr);
	}


	public void setWs8iypDiscntIdCurr(long number) {
	    number = checkWs8iypDiscntIdCurrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWs8iypDiscntIdCurr((int)number);
	}
	

	
	
	
	/**
	 * 	initializes IypCurr8
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWs8iypDatesCurr(CONSTANTS.SPACE_20);
                     setWs8iypDiscntIdCurr(0);
   }

		public static int getIypCurr8FieldLength() {
			return IYP_CURR_8_LENGTH;
		}

}
  

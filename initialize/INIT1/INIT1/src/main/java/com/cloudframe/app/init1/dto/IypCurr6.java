package com.cloudframe.app.init1.dto;

/**
*  The class IypCurr6 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:59. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class IypCurr6 extends IypCurr6Serialized { 
   

						private char[] ws6iypDatesCurr = new char[20];

								private int ws6iypDiscntIdCurr;
	
	/**
	* Constructor for IypCurr6
	**/
    public IypCurr6() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for IypCurr6. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IypCurr6(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setWs6iypDatesCurr(fillSpace(20));
								setWs6iypDiscntIdCurr(0);
    } 

	/**
	 *	Returns the value of ws6iypDatesCurr
	 *	@return ws6iypDatesCurr
	 */
   public char[] getWs6iypDatesCurr() throws CFException{
     if (isWs6iypDatesCurrModified()) { 
        ws6iypDatesCurr = refreshWs6iypDatesCurr();
     }
   		return ws6iypDatesCurr;
   }

  
	/**
	*  set variable ws6iypDatesCurr
	*  Corresponding COBOL Variable is WS6IYP-DATES-CURR
	*  @param value
	**/
   public void setWs6iypDatesCurr(char[] value) {
      ws6iypDatesCurr = checkWs6iypDatesCurrConstraints(value);
      serializeWs6iypDatesCurr(ws6iypDatesCurr);
   } 

     /**
	 * 	Update Ws6iypDatesCurr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWs6iypDatesCurr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWs6iypDatesCurr,ws6iypDatesCurr.length);
   	
   }
   
   public void setWs6iypDatesCurr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWs6iypDatesCurr,ws6iypDatesCurr.length);
   	
   }
   
     /**
	 * 	Update Ws6iypDatesCurr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWs6iypDatesCurr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWs6iypDatesCurr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ws6iypDatesCurr with another Field
	 *	@param value
	 */
   public void setWs6iypDatesCurr(Field source) {
       replace(source,0,source.length(),beginWs6iypDatesCurr,WS_6IYP_DATES_CURR_LEN);
   	
   }  
   
     /**
	 * 	Update Ws6iypDatesCurr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWs6iypDatesCurr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWs6iypDatesCurr,WS_6IYP_DATES_CURR_LEN);
   	
   }
   
     /**
	 * 	Update Ws6iypDatesCurr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWs6iypDatesCurr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWs6iypDatesCurr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ws6iypDiscntIdCurr
	 *	@return ws6iypDiscntIdCurr
	 */
	public int getWs6iypDiscntIdCurr() throws CFException {
        if (isWs6iypDiscntIdCurrModified()) { 
           ws6iypDiscntIdCurr = refreshWs6iypDiscntIdCurr();
        }
   		return ws6iypDiscntIdCurr;
	}
	
	/**
	 * 	Update Ws6iypDiscntIdCurr with the passed value
	 *  Corresponding COBOL Variable is WS6IYP-DISCNT-ID-CURR
	 *	@param number
	 */
	public void setWs6iypDiscntIdCurr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ws6iypDiscntIdCurr = checkWs6iypDiscntIdCurrMaxLimit(number); 
		serializeWs6iypDiscntIdCurr(ws6iypDiscntIdCurr);
	}


	public void setWs6iypDiscntIdCurr(long number) {
	    number = checkWs6iypDiscntIdCurrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWs6iypDiscntIdCurr((int)number);
	}
	

	
	
	
	/**
	 * 	initializes IypCurr6
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWs6iypDatesCurr(CONSTANTS.SPACE_20);
                     setWs6iypDiscntIdCurr(0);
   }

		public static int getIypCurr6FieldLength() {
			return IYP_CURR_6_LENGTH;
		}

}
  

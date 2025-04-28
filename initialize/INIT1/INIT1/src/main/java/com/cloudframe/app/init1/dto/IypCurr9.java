package com.cloudframe.app.init1.dto;

/**
*  The class IypCurr9 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:52. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class IypCurr9 extends IypCurr9Serialized { 
   

						private char[] ws9iypDatesCurr = new char[20];

								private int ws9iypDiscntIdCurr;
	
	/**
	* Constructor for IypCurr9
	**/
    public IypCurr9() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for IypCurr9. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IypCurr9(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setWs9iypDatesCurr(fillSpace(20));
								setWs9iypDiscntIdCurr(0);
    } 

	/**
	 *	Returns the value of ws9iypDatesCurr
	 *	@return ws9iypDatesCurr
	 */
   public char[] getWs9iypDatesCurr() throws CFException{
     if (isWs9iypDatesCurrModified()) { 
        ws9iypDatesCurr = refreshWs9iypDatesCurr();
     }
   		return ws9iypDatesCurr;
   }

  
	/**
	*  set variable ws9iypDatesCurr
	*  Corresponding COBOL Variable is WS9IYP-DATES-CURR
	*  @param value
	**/
   public void setWs9iypDatesCurr(char[] value) {
      ws9iypDatesCurr = checkWs9iypDatesCurrConstraints(value);
      serializeWs9iypDatesCurr(ws9iypDatesCurr);
   } 

     /**
	 * 	Update Ws9iypDatesCurr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWs9iypDatesCurr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWs9iypDatesCurr,ws9iypDatesCurr.length);
   	
   }
   
   public void setWs9iypDatesCurr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWs9iypDatesCurr,ws9iypDatesCurr.length);
   	
   }
   
     /**
	 * 	Update Ws9iypDatesCurr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWs9iypDatesCurr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWs9iypDatesCurr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ws9iypDatesCurr with another Field
	 *	@param value
	 */
   public void setWs9iypDatesCurr(Field source) {
       replace(source,0,source.length(),beginWs9iypDatesCurr,WS_9IYP_DATES_CURR_LEN);
   	
   }  
   
     /**
	 * 	Update Ws9iypDatesCurr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWs9iypDatesCurr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWs9iypDatesCurr,WS_9IYP_DATES_CURR_LEN);
   	
   }
   
     /**
	 * 	Update Ws9iypDatesCurr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWs9iypDatesCurr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWs9iypDatesCurr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ws9iypDiscntIdCurr
	 *	@return ws9iypDiscntIdCurr
	 */
	public int getWs9iypDiscntIdCurr() throws CFException {
        if (isWs9iypDiscntIdCurrModified()) { 
           ws9iypDiscntIdCurr = refreshWs9iypDiscntIdCurr();
        }
   		return ws9iypDiscntIdCurr;
	}
	
	/**
	 * 	Update Ws9iypDiscntIdCurr with the passed value
	 *  Corresponding COBOL Variable is WS9IYP-DISCNT-ID-CURR
	 *	@param number
	 */
	public void setWs9iypDiscntIdCurr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ws9iypDiscntIdCurr = checkWs9iypDiscntIdCurrMaxLimit(number); 
		serializeWs9iypDiscntIdCurr(ws9iypDiscntIdCurr);
	}


	public void setWs9iypDiscntIdCurr(long number) {
	    number = checkWs9iypDiscntIdCurrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWs9iypDiscntIdCurr((int)number);
	}
	

	
	
	
	/**
	 * 	initializes IypCurr9
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWs9iypDatesCurr(CONSTANTS.SPACE_20);
                     setWs9iypDiscntIdCurr(0);
   }

		public static int getIypCurr9FieldLength() {
			return IYP_CURR_9_LENGTH;
		}

}
  

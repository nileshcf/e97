package com.cloudframe.app.init1.dto;

/**
*  The class IypCurr7 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:13. using version 5.0.0.257
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class IypCurr7 extends IypCurr7Serialized { 
   

						private char[] ws7iypDatesCurr = new char[20];

								private int ws7iypDiscntIdCurr;
	
	/**
	* Constructor for IypCurr7
	**/
    public IypCurr7() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for IypCurr7. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IypCurr7(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setWs7iypDatesCurr(fillSpace(20));
								setWs7iypDiscntIdCurr(0);
    } 

	/**
	 *	Returns the value of ws7iypDatesCurr
	 *	@return ws7iypDatesCurr
	 */
   public char[] getWs7iypDatesCurr() throws CFException{
     if (isWs7iypDatesCurrModified()) { 
        ws7iypDatesCurr = refreshWs7iypDatesCurr();
     }
   		return ws7iypDatesCurr;
   }

  
	/**
	*  set variable ws7iypDatesCurr
	*  Corresponding COBOL Variable is WS7IYP-DATES-CURR
	*  @param value
	**/
   public void setWs7iypDatesCurr(char[] value) {
      ws7iypDatesCurr = checkWs7iypDatesCurrConstraints(value);
      serializeWs7iypDatesCurr(ws7iypDatesCurr);
   } 

     /**
	 * 	Update Ws7iypDatesCurr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWs7iypDatesCurr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWs7iypDatesCurr,ws7iypDatesCurr.length);
   	
   }
   
   public void setWs7iypDatesCurr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWs7iypDatesCurr,ws7iypDatesCurr.length);
   	
   }
   
     /**
	 * 	Update Ws7iypDatesCurr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWs7iypDatesCurr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWs7iypDatesCurr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ws7iypDatesCurr with another Field
	 *	@param value
	 */
   public void setWs7iypDatesCurr(Field source) {
       replace(source,0,source.length(),beginWs7iypDatesCurr,WS_7IYP_DATES_CURR_LEN);
   	
   }  
   
     /**
	 * 	Update Ws7iypDatesCurr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWs7iypDatesCurr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWs7iypDatesCurr,WS_7IYP_DATES_CURR_LEN);
   	
   }
   
     /**
	 * 	Update Ws7iypDatesCurr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWs7iypDatesCurr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWs7iypDatesCurr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ws7iypDiscntIdCurr
	 *	@return ws7iypDiscntIdCurr
	 */
	public int getWs7iypDiscntIdCurr() throws CFException {
        if (isWs7iypDiscntIdCurrModified()) { 
           ws7iypDiscntIdCurr = refreshWs7iypDiscntIdCurr();
        }
   		return ws7iypDiscntIdCurr;
	}
	
	/**
	 * 	Update Ws7iypDiscntIdCurr with the passed value
	 *  Corresponding COBOL Variable is WS7IYP-DISCNT-ID-CURR
	 *	@param number
	 */
	public void setWs7iypDiscntIdCurr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ws7iypDiscntIdCurr = checkWs7iypDiscntIdCurrMaxLimit(number); 
		serializeWs7iypDiscntIdCurr(ws7iypDiscntIdCurr);
	}


	public void setWs7iypDiscntIdCurr(long number) {
	    number = checkWs7iypDiscntIdCurrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWs7iypDiscntIdCurr((int)number);
	}
	

	
	
	
	/**
	 * 	initializes IypCurr7
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWs7iypDatesCurr(CONSTANTS.SPACE_20);
                     setWs7iypDiscntIdCurr(0);
   }

		public static int getIypCurr7FieldLength() {
			return IYP_CURR_7_LENGTH;
		}

}
  

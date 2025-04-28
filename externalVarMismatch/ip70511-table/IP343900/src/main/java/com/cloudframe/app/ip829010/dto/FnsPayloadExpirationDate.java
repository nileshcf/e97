package com.cloudframe.app.ip829010.dto;

/**
*  The class FnsPayloadExpirationDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:02. using version 5.0.0.256
**/


import com.cloudframe.app.ip829010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class FnsPayloadExpirationDate extends FnsPayloadExpirationDateSerialized { 
   

						private char[] fnsPayloadExprMonth = Field.fillLowValue(2);
				private FnsPayloadExprYear fnsPayloadExprYear = new FnsPayloadExprYear();
	
	/**
	* Constructor for FnsPayloadExpirationDate
	**/
    public FnsPayloadExpirationDate() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for FnsPayloadExpirationDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FnsPayloadExpirationDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			fnsPayloadExprYear.setParent(this,getStartOffset() + 2);
    } 

	/**
	 *	Returns the value of fnsPayloadExprMonth
	 *	@return fnsPayloadExprMonth
	 */
   public char[] getFnsPayloadExprMonth() throws CFException{
     if (isFnsPayloadExprMonthModified()) { 
        fnsPayloadExprMonth = refreshFnsPayloadExprMonth();
     }
   		return fnsPayloadExprMonth;
   }

  
	/**
	*  set variable fnsPayloadExprMonth
	*  Corresponding COBOL Variable is FNS-PAYLOAD-EXPR-MONTH
	*  @param value
	**/
   public void setFnsPayloadExprMonth(char[] value) {
      fnsPayloadExprMonth = checkFnsPayloadExprMonthConstraints(value);
      serializeFnsPayloadExprMonth(fnsPayloadExprMonth);
   } 

     /**
	 * 	Update FnsPayloadExprMonth 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPayloadExprMonth(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFnsPayloadExprMonth,fnsPayloadExprMonth.length);
   	
   }
   
   public void setFnsPayloadExprMonth(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadExprMonth,fnsPayloadExprMonth.length);
   	
   }
   
     /**
	 * 	Update FnsPayloadExprMonth 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadExprMonth(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadExprMonth+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FnsPayloadExprMonth with another Field
	 *	@param value
	 */
   public void setFnsPayloadExprMonth(Field source) {
       replace(source,0,source.length(),beginFnsPayloadExprMonth,FNS_PAYLOAD_EXPR_MONTH_LEN);
   	
   }  
   
     /**
	 * 	Update FnsPayloadExprMonth 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPayloadExprMonth(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFnsPayloadExprMonth,FNS_PAYLOAD_EXPR_MONTH_LEN);
   	
   }
   
     /**
	 * 	Update FnsPayloadExprMonth 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadExprMonth(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadExprMonth+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fnsPayloadExprYear
	 *	@return fnsPayloadExprYear
	 */   
	 public FnsPayloadExprYear getFnsPayloadExprYear() {
   	return fnsPayloadExprYear;
   }
   /**
	* 	Update FnsPayloadExprYear with the passed value
	*   Corresponding COBOL Variable is FNS-PAYLOAD-EXPR-YEAR
	*	@param value
	*/
   public void setFnsPayloadExprYear(char[] value) {
      fnsPayloadExprYear.setString(value); 
   }   
    
     /**
	 * 	Update FnsPayloadExprYear 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setFnsPayloadExprYear(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,fnsPayloadExprYear.begin,fnsPayloadExprYear.length());
   }
   
     /**
	 * 	Update FnsPayloadExprYear 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadExprYear(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,fnsPayloadExprYear.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update FnsPayloadExprYear with another Field
	 *	@param value
	 */
   public void setFnsPayloadExprYear(Field source) {
   	replace(source,0,source.length(),fnsPayloadExprYear.begin,fnsPayloadExprYear.length());
   }  
   
     /**
	 * 	Update FnsPayloadExprYear 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setFnsPayloadExprYear(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,fnsPayloadExprYear.begin,fnsPayloadExprYear.length());
   }
   
     /**
	 * 	Update FnsPayloadExprYear 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadExprYear(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,fnsPayloadExprYear.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes FnsPayloadExpirationDate
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFnsPayloadExprMonth(CONSTANTS.SPACE_2);
          fnsPayloadExprYear.initialize();
     
   }

		public static int getFnsPayloadExpirationDateFieldLength() {
			return FNS_PAYLOAD_EXPIRATION_DATE_LENGTH;
		}

}
  

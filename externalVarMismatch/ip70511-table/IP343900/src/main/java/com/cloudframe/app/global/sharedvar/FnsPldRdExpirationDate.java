package com.cloudframe.app.global.sharedvar;

/**
*  The class FnsPldRdExpirationDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class FnsPldRdExpirationDate extends FnsPldRdExpirationDateSerialized { 
   

						private char[] fnsPldRdExprMonth = Field.fillLowValue(2);
				private FnsPldRdExprYear fnsPldRdExprYear = new FnsPldRdExprYear();
	
	/**
	* Constructor for FnsPldRdExpirationDate
	**/
    public FnsPldRdExpirationDate() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for FnsPldRdExpirationDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FnsPldRdExpirationDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			fnsPldRdExprYear.setParent(this,getStartOffset() + 2);
    } 

	/**
	 *	Returns the value of fnsPldRdExprMonth
	 *	@return fnsPldRdExprMonth
	 */
   public char[] getFnsPldRdExprMonth() throws CFException{
     if (isFnsPldRdExprMonthModified()) { 
        fnsPldRdExprMonth = refreshFnsPldRdExprMonth();
     }
   		return fnsPldRdExprMonth;
   }

  
	/**
	*  set variable fnsPldRdExprMonth
	*  Corresponding COBOL Variable is FNS-PLD-RD-EXPR-MONTH
	*  @param value
	**/
   public void setFnsPldRdExprMonth(char[] value) {
      fnsPldRdExprMonth = checkFnsPldRdExprMonthConstraints(value);
      serializeFnsPldRdExprMonth(fnsPldRdExprMonth);
   } 

     /**
	 * 	Update FnsPldRdExprMonth 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdExprMonth(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFnsPldRdExprMonth,fnsPldRdExprMonth.length);
   	
   }
   
   public void setFnsPldRdExprMonth(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdExprMonth,fnsPldRdExprMonth.length);
   	
   }
   
     /**
	 * 	Update FnsPldRdExprMonth 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdExprMonth(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdExprMonth+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FnsPldRdExprMonth with another Field
	 *	@param value
	 */
   public void setFnsPldRdExprMonth(Field source) {
       replace(source,0,source.length(),beginFnsPldRdExprMonth,FNS_PLD_RD_EXPR_MONTH_LEN);
   	
   }  
   
     /**
	 * 	Update FnsPldRdExprMonth 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPldRdExprMonth(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFnsPldRdExprMonth,FNS_PLD_RD_EXPR_MONTH_LEN);
   	
   }
   
     /**
	 * 	Update FnsPldRdExprMonth 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdExprMonth(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdExprMonth+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fnsPldRdExprYear
	 *	@return fnsPldRdExprYear
	 */   
	 public FnsPldRdExprYear getFnsPldRdExprYear() {
   	return fnsPldRdExprYear;
   }
   /**
	* 	Update FnsPldRdExprYear with the passed value
	*   Corresponding COBOL Variable is FNS-PLD-RD-EXPR-YEAR
	*	@param value
	*/
   public void setFnsPldRdExprYear(char[] value) {
      fnsPldRdExprYear.setString(value); 
   }   
    
     /**
	 * 	Update FnsPldRdExprYear 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdExprYear(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,fnsPldRdExprYear.begin,fnsPldRdExprYear.length());
   }
   
     /**
	 * 	Update FnsPldRdExprYear 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdExprYear(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,fnsPldRdExprYear.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update FnsPldRdExprYear with another Field
	 *	@param value
	 */
   public void setFnsPldRdExprYear(Field source) {
   	replace(source,0,source.length(),fnsPldRdExprYear.begin,fnsPldRdExprYear.length());
   }  
   
     /**
	 * 	Update FnsPldRdExprYear 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdExprYear(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,fnsPldRdExprYear.begin,fnsPldRdExprYear.length());
   }
   
     /**
	 * 	Update FnsPldRdExprYear 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdExprYear(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,fnsPldRdExprYear.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes FnsPldRdExpirationDate
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFnsPldRdExprMonth(CONSTANTS.SPACE_2);
          fnsPldRdExprYear.initialize();
     
   }

		public static int getFnsPldRdExpirationDateFieldLength() {
			return FNS_PLD_RD_EXPIRATION_DATE_LENGTH;
		}

}
  

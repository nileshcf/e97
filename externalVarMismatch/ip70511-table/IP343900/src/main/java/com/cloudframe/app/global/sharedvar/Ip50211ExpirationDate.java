package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50211ExpirationDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip50211ExpirationDate extends Ip50211ExpirationDateSerialized { 
   

						private char[] ip50211ExprMonth = Field.fillLowValue(2);
				private Ip50211ExprYear ip50211ExprYear = new Ip50211ExprYear();
	
	/**
	* Constructor for Ip50211ExpirationDate
	**/
    public Ip50211ExpirationDate() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip50211ExpirationDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50211ExpirationDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip50211ExprYear.setParent(this,getStartOffset() + 2);
    } 

	/**
	 *	Returns the value of ip50211ExprMonth
	 *	@return ip50211ExprMonth
	 */
   public char[] getIp50211ExprMonth() throws CFException{
     if (isIp50211ExprMonthModified()) { 
        ip50211ExprMonth = refreshIp50211ExprMonth();
     }
   		return ip50211ExprMonth;
   }

  
	/**
	*  set variable ip50211ExprMonth
	*  Corresponding COBOL Variable is IP50211-EXPR-MONTH
	*  @param value
	**/
   public void setIp50211ExprMonth(char[] value) {
      ip50211ExprMonth = checkIp50211ExprMonthConstraints(value);
      serializeIp50211ExprMonth(ip50211ExprMonth);
   } 

     /**
	 * 	Update Ip50211ExprMonth 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50211ExprMonth(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50211ExprMonth,ip50211ExprMonth.length);
   	
   }
   
   public void setIp50211ExprMonth(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211ExprMonth,ip50211ExprMonth.length);
   	
   }
   
     /**
	 * 	Update Ip50211ExprMonth 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50211ExprMonth(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211ExprMonth+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50211ExprMonth with another Field
	 *	@param value
	 */
   public void setIp50211ExprMonth(Field source) {
       replace(source,0,source.length(),beginIp50211ExprMonth,IP_50211_EXPR_MONTH_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50211ExprMonth 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50211ExprMonth(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50211ExprMonth,IP_50211_EXPR_MONTH_LEN);
   	
   }
   
     /**
	 * 	Update Ip50211ExprMonth 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50211ExprMonth(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211ExprMonth+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip50211ExprYear
	 *	@return ip50211ExprYear
	 */   
	 public Ip50211ExprYear getIp50211ExprYear() {
   	return ip50211ExprYear;
   }
   /**
	* 	Update Ip50211ExprYear with the passed value
	*   Corresponding COBOL Variable is IP50211-EXPR-YEAR
	*	@param value
	*/
   public void setIp50211ExprYear(char[] value) {
      ip50211ExprYear.setString(value); 
   }   
    
     /**
	 * 	Update Ip50211ExprYear 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp50211ExprYear(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip50211ExprYear.begin,ip50211ExprYear.length());
   }
   
     /**
	 * 	Update Ip50211ExprYear 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50211ExprYear(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip50211ExprYear.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip50211ExprYear with another Field
	 *	@param value
	 */
   public void setIp50211ExprYear(Field source) {
   	replace(source,0,source.length(),ip50211ExprYear.begin,ip50211ExprYear.length());
   }  
   
     /**
	 * 	Update Ip50211ExprYear 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp50211ExprYear(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip50211ExprYear.begin,ip50211ExprYear.length());
   }
   
     /**
	 * 	Update Ip50211ExprYear 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50211ExprYear(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip50211ExprYear.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip50211ExpirationDate
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp50211ExprMonth(CONSTANTS.SPACE_2);
          ip50211ExprYear.initialize();
     
   }

		public static int getIp50211ExpirationDateFieldLength() {
			return IP_50211_EXPIRATION_DATE_LENGTH;
		}

}
  

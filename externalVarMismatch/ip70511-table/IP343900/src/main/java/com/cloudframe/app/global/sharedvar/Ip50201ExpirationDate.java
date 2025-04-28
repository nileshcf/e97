package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50201ExpirationDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip50201ExpirationDate extends Ip50201ExpirationDateSerialized { 
   

						private char[] ip50201ExprMonth = Field.fillLowValue(2);
				private Ip50201ExprYear ip50201ExprYear = new Ip50201ExprYear();
	
	/**
	* Constructor for Ip50201ExpirationDate
	**/
    public Ip50201ExpirationDate() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip50201ExpirationDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50201ExpirationDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip50201ExprYear.setParent(this,getStartOffset() + 2);
    } 

	/**
	 *	Returns the value of ip50201ExprMonth
	 *	@return ip50201ExprMonth
	 */
   public char[] getIp50201ExprMonth() throws CFException{
     if (isIp50201ExprMonthModified()) { 
        ip50201ExprMonth = refreshIp50201ExprMonth();
     }
   		return ip50201ExprMonth;
   }

  
	/**
	*  set variable ip50201ExprMonth
	*  Corresponding COBOL Variable is IP50201-EXPR-MONTH
	*  @param value
	**/
   public void setIp50201ExprMonth(char[] value) {
      ip50201ExprMonth = checkIp50201ExprMonthConstraints(value);
      serializeIp50201ExprMonth(ip50201ExprMonth);
   } 

     /**
	 * 	Update Ip50201ExprMonth 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50201ExprMonth(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50201ExprMonth,ip50201ExprMonth.length);
   	
   }
   
   public void setIp50201ExprMonth(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50201ExprMonth,ip50201ExprMonth.length);
   	
   }
   
     /**
	 * 	Update Ip50201ExprMonth 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50201ExprMonth(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50201ExprMonth+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50201ExprMonth with another Field
	 *	@param value
	 */
   public void setIp50201ExprMonth(Field source) {
       replace(source,0,source.length(),beginIp50201ExprMonth,IP_50201_EXPR_MONTH_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50201ExprMonth 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50201ExprMonth(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50201ExprMonth,IP_50201_EXPR_MONTH_LEN);
   	
   }
   
     /**
	 * 	Update Ip50201ExprMonth 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50201ExprMonth(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50201ExprMonth+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip50201ExprYear
	 *	@return ip50201ExprYear
	 */   
	 public Ip50201ExprYear getIp50201ExprYear() {
   	return ip50201ExprYear;
   }
   /**
	* 	Update Ip50201ExprYear with the passed value
	*   Corresponding COBOL Variable is IP50201-EXPR-YEAR
	*	@param value
	*/
   public void setIp50201ExprYear(char[] value) {
      ip50201ExprYear.setString(value); 
   }   
    
     /**
	 * 	Update Ip50201ExprYear 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp50201ExprYear(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip50201ExprYear.begin,ip50201ExprYear.length());
   }
   
     /**
	 * 	Update Ip50201ExprYear 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50201ExprYear(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip50201ExprYear.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip50201ExprYear with another Field
	 *	@param value
	 */
   public void setIp50201ExprYear(Field source) {
   	replace(source,0,source.length(),ip50201ExprYear.begin,ip50201ExprYear.length());
   }  
   
     /**
	 * 	Update Ip50201ExprYear 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp50201ExprYear(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip50201ExprYear.begin,ip50201ExprYear.length());
   }
   
     /**
	 * 	Update Ip50201ExprYear 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50201ExprYear(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip50201ExprYear.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip50201ExpirationDate
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp50201ExprMonth(CONSTANTS.SPACE_2);
          ip50201ExprYear.initialize();
     
   }

		public static int getIp50201ExpirationDateFieldLength() {
			return IP_50201_EXPIRATION_DATE_LENGTH;
		}

}
  

package com.cloudframe.app.ip829010.dto;

/**
*  The class Ip82921ExpirationDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/


import com.cloudframe.app.ip829010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip82921ExpirationDate extends Ip82921ExpirationDateSerialized { 
   

						private char[] ip82921ExprMonth = Field.fillLowValue(2);
				private Ip82921ExprYear ip82921ExprYear = new Ip82921ExprYear();
	
	/**
	* Constructor for Ip82921ExpirationDate
	**/
    public Ip82921ExpirationDate() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip82921ExpirationDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip82921ExpirationDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip82921ExprYear.setParent(this,getStartOffset() + 2);
    } 

	/**
	 *	Returns the value of ip82921ExprMonth
	 *	@return ip82921ExprMonth
	 */
   public char[] getIp82921ExprMonth() throws CFException{
     if (isIp82921ExprMonthModified()) { 
        ip82921ExprMonth = refreshIp82921ExprMonth();
     }
   		return ip82921ExprMonth;
   }

  
	/**
	*  set variable ip82921ExprMonth
	*  Corresponding COBOL Variable is IP82921-EXPR-MONTH
	*  @param value
	**/
   public void setIp82921ExprMonth(char[] value) {
      ip82921ExprMonth = checkIp82921ExprMonthConstraints(value);
      serializeIp82921ExprMonth(ip82921ExprMonth);
   } 

     /**
	 * 	Update Ip82921ExprMonth 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp82921ExprMonth(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp82921ExprMonth,ip82921ExprMonth.length);
   	
   }
   
   public void setIp82921ExprMonth(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921ExprMonth,ip82921ExprMonth.length);
   	
   }
   
     /**
	 * 	Update Ip82921ExprMonth 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp82921ExprMonth(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921ExprMonth+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip82921ExprMonth with another Field
	 *	@param value
	 */
   public void setIp82921ExprMonth(Field source) {
       replace(source,0,source.length(),beginIp82921ExprMonth,IP_82921_EXPR_MONTH_LEN);
   	
   }  
   
     /**
	 * 	Update Ip82921ExprMonth 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp82921ExprMonth(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp82921ExprMonth,IP_82921_EXPR_MONTH_LEN);
   	
   }
   
     /**
	 * 	Update Ip82921ExprMonth 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp82921ExprMonth(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921ExprMonth+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip82921ExprYear
	 *	@return ip82921ExprYear
	 */   
	 public Ip82921ExprYear getIp82921ExprYear() {
   	return ip82921ExprYear;
   }
   /**
	* 	Update Ip82921ExprYear with the passed value
	*   Corresponding COBOL Variable is IP82921-EXPR-YEAR
	*	@param value
	*/
   public void setIp82921ExprYear(char[] value) {
      ip82921ExprYear.setString(value); 
   }   
    
     /**
	 * 	Update Ip82921ExprYear 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp82921ExprYear(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip82921ExprYear.begin,ip82921ExprYear.length());
   }
   
     /**
	 * 	Update Ip82921ExprYear 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp82921ExprYear(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip82921ExprYear.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip82921ExprYear with another Field
	 *	@param value
	 */
   public void setIp82921ExprYear(Field source) {
   	replace(source,0,source.length(),ip82921ExprYear.begin,ip82921ExprYear.length());
   }  
   
     /**
	 * 	Update Ip82921ExprYear 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp82921ExprYear(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip82921ExprYear.begin,ip82921ExprYear.length());
   }
   
     /**
	 * 	Update Ip82921ExprYear 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp82921ExprYear(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip82921ExprYear.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip82921ExpirationDate
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp82921ExprMonth(CONSTANTS.SPACE_2);
          ip82921ExprYear.initialize();
     
   }

		public static int getIp82921ExpirationDateFieldLength() {
			return IP_82921_EXPIRATION_DATE_LENGTH;
		}

}
  

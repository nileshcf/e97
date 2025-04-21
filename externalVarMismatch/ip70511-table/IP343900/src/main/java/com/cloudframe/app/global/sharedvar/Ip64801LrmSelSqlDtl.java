package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip64801LrmSelSqlDtl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip64801LrmSelSqlDtl extends Ip64801LrmSelSqlDtlSerialized { 
   

								private int ip64801LrmSelSqlNum;

						private char[] ip64801LrmSelSqlMod = Field.fillLowValue(8);
	
	/**
	* Constructor for Ip64801LrmSelSqlDtl
	**/
    public Ip64801LrmSelSqlDtl() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip64801LrmSelSqlDtl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip64801LrmSelSqlDtl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip64801LrmSelSqlNum
	 *	@return ip64801LrmSelSqlNum
	 */
	public int getIp64801LrmSelSqlNum() throws CFException {
       if (isIp64801LrmSelSqlNumModified()) { 
           ip64801LrmSelSqlNum = refreshIp64801LrmSelSqlNum();
        }
   		return ip64801LrmSelSqlNum;
	}
	

	
	   
	/**
	 * 	Update Ip64801LrmSelSqlNum with the passed value
	 *  Corresponding COBOL Variable is IP64801-LRM-SEL-SQL-NUM
	 *	@param number
	 */
	public void setIp64801LrmSelSqlNum(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip64801LrmSelSqlNum = checkIp64801LrmSelSqlNumMaxLimit(number); 
		serializeIp64801LrmSelSqlNum(ip64801LrmSelSqlNum);
	}
	

	public void setIp64801LrmSelSqlNum(long number) {
	    number = checkIp64801LrmSelSqlNumMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp64801LrmSelSqlNum((int)number);
	}
	
	/**
	 * 	Update Ip64801LrmSelSqlNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp64801LrmSelSqlNum(char[] value) throws CFException {
		 ip64801LrmSelSqlNum = serializeIp64801LrmSelSqlNum(value);
	}
	/**
	 * 	Update Ip64801LrmSelSqlNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp64801LrmSelSqlNumString(char[] value) throws CFException {
		 setIp64801LrmSelSqlNum(value);
	}
	/**
	 *	Returns the value of ip64801LrmSelSqlMod
	 *	@return ip64801LrmSelSqlMod
	 */
   public char[] getIp64801LrmSelSqlMod() throws CFException{
     if (isIp64801LrmSelSqlModModified()) { 
        ip64801LrmSelSqlMod = refreshIp64801LrmSelSqlMod();
     }
   		return ip64801LrmSelSqlMod;
   }

  
	/**
	*  set variable ip64801LrmSelSqlMod
	*  Corresponding COBOL Variable is IP64801-LRM-SEL-SQL-MOD
	*  @param value
	**/
   public void setIp64801LrmSelSqlMod(char[] value) {
      ip64801LrmSelSqlMod = checkIp64801LrmSelSqlModConstraints(value);
      serializeIp64801LrmSelSqlMod(ip64801LrmSelSqlMod);
   } 

     /**
	 * 	Update Ip64801LrmSelSqlMod 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp64801LrmSelSqlMod(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp64801LrmSelSqlMod,ip64801LrmSelSqlMod.length);
   	
   }
   
   public void setIp64801LrmSelSqlMod(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp64801LrmSelSqlMod,ip64801LrmSelSqlMod.length);
   	
   }
   
     /**
	 * 	Update Ip64801LrmSelSqlMod 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp64801LrmSelSqlMod(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp64801LrmSelSqlMod+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip64801LrmSelSqlMod with another Field
	 *	@param value
	 */
   public void setIp64801LrmSelSqlMod(Field source) {
       replace(source,0,source.length(),beginIp64801LrmSelSqlMod,IP_64801_LRM_SEL_SQL_MOD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip64801LrmSelSqlMod 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp64801LrmSelSqlMod(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp64801LrmSelSqlMod,IP_64801_LRM_SEL_SQL_MOD_LEN);
   	
   }
   
     /**
	 * 	Update Ip64801LrmSelSqlMod 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp64801LrmSelSqlMod(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp64801LrmSelSqlMod+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip64801LrmSelSqlDtl
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp64801LrmSelSqlNum(0);
         setIp64801LrmSelSqlMod(CONSTANTS.SPACE_8);
   }

		public static int getIp64801LrmSelSqlDtlFieldLength() {
			return IP_64801_LRM_SEL_SQL_DTL_LENGTH;
		}

}
  

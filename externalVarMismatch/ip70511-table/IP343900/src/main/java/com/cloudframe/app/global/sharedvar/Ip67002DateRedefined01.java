package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip67002DateRedefined01 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip67002DateRedefined01 extends Ip67002DateRedefined01Serialized { 
   
				private Ip67002Ccyyddd ip67002Ccyyddd = new Ip67002Ccyyddd();

	
	/**
	* Constructor for Ip67002DateRedefined01
	**/
    public Ip67002DateRedefined01() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip67002DateRedefined01. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip67002DateRedefined01(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip67002Ccyyddd.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of ip67002Ccyyddd
	 *	@return ip67002Ccyyddd
	 */   
	 public Ip67002Ccyyddd getIp67002Ccyyddd() {
   	return ip67002Ccyyddd;
   }
   /**
	* 	Update Ip67002Ccyyddd with the passed value
	*   Corresponding COBOL Variable is IP67002-CCYYDDD
	*	@param value
	*/
   public void setIp67002Ccyyddd(char[] value) {
      ip67002Ccyyddd.setString(value); 
   }   
    
     /**
	 * 	Update Ip67002Ccyyddd 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp67002Ccyyddd(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip67002Ccyyddd.begin,ip67002Ccyyddd.length());
   }
   
     /**
	 * 	Update Ip67002Ccyyddd 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp67002Ccyyddd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip67002Ccyyddd.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip67002Ccyyddd with another Field
	 *	@param value
	 */
   public void setIp67002Ccyyddd(Field source) {
   	replace(source,0,source.length(),ip67002Ccyyddd.begin,ip67002Ccyyddd.length());
   }  
   
     /**
	 * 	Update Ip67002Ccyyddd 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp67002Ccyyddd(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip67002Ccyyddd.begin,ip67002Ccyyddd.length());
   }
   
     /**
	 * 	Update Ip67002Ccyyddd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp67002Ccyyddd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip67002Ccyyddd.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip67002DateRedefined01
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip67002Ccyyddd.initialize();
     
   }

		public static int getIp67002DateRedefined01FieldLength() {
			return IP_67002_DATE_REDEFINED_01_LENGTH;
		}

}
  

package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip67002Date2Redefined01 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:26. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip67002Date2Redefined01 extends Ip67002Date2Redefined01Serialized { 
   
				private Ip67002Hhmm ip67002Hhmm = new Ip67002Hhmm();
				private Ip67002UtcOffsetHhmm ip67002UtcOffsetHhmm = new Ip67002UtcOffsetHhmm();
	
	/**
	* Constructor for Ip67002Date2Redefined01
	**/
    public Ip67002Date2Redefined01() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip67002Date2Redefined01. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip67002Date2Redefined01(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip67002Hhmm.setParent(this,getStartOffset() + 0);
	       			ip67002UtcOffsetHhmm.setParent(this,getStartOffset() + 4);
    } 

	/**
	 *	Returns the value of ip67002Hhmm
	 *	@return ip67002Hhmm
	 */   
	 public Ip67002Hhmm getIp67002Hhmm() {
   	return ip67002Hhmm;
   }
   /**
	* 	Update Ip67002Hhmm with the passed value
	*   Corresponding COBOL Variable is IP67002-HHMM
	*	@param value
	*/
   public void setIp67002Hhmm(char[] value) {
      ip67002Hhmm.setString(value); 
   }   
    
     /**
	 * 	Update Ip67002Hhmm 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp67002Hhmm(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip67002Hhmm.begin,ip67002Hhmm.length());
   }
   
     /**
	 * 	Update Ip67002Hhmm 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp67002Hhmm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip67002Hhmm.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip67002Hhmm with another Field
	 *	@param value
	 */
   public void setIp67002Hhmm(Field source) {
   	replace(source,0,source.length(),ip67002Hhmm.begin,ip67002Hhmm.length());
   }  
   
     /**
	 * 	Update Ip67002Hhmm 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp67002Hhmm(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip67002Hhmm.begin,ip67002Hhmm.length());
   }
   
     /**
	 * 	Update Ip67002Hhmm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp67002Hhmm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip67002Hhmm.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip67002UtcOffsetHhmm
	 *	@return ip67002UtcOffsetHhmm
	 */   
	 public Ip67002UtcOffsetHhmm getIp67002UtcOffsetHhmm() {
   	return ip67002UtcOffsetHhmm;
   }
   /**
	* 	Update Ip67002UtcOffsetHhmm with the passed value
	*   Corresponding COBOL Variable is IP67002-UTC-OFFSET-HHMM
	*	@param value
	*/
   public void setIp67002UtcOffsetHhmm(char[] value) {
      ip67002UtcOffsetHhmm.setString(value); 
   }   
    
     /**
	 * 	Update Ip67002UtcOffsetHhmm 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp67002UtcOffsetHhmm(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip67002UtcOffsetHhmm.begin,ip67002UtcOffsetHhmm.length());
   }
   
     /**
	 * 	Update Ip67002UtcOffsetHhmm 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp67002UtcOffsetHhmm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip67002UtcOffsetHhmm.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip67002UtcOffsetHhmm with another Field
	 *	@param value
	 */
   public void setIp67002UtcOffsetHhmm(Field source) {
   	replace(source,0,source.length(),ip67002UtcOffsetHhmm.begin,ip67002UtcOffsetHhmm.length());
   }  
   
     /**
	 * 	Update Ip67002UtcOffsetHhmm 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp67002UtcOffsetHhmm(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip67002UtcOffsetHhmm.begin,ip67002UtcOffsetHhmm.length());
   }
   
     /**
	 * 	Update Ip67002UtcOffsetHhmm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp67002UtcOffsetHhmm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip67002UtcOffsetHhmm.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip67002Date2Redefined01
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip67002Hhmm.initialize();
     
          ip67002UtcOffsetHhmm.initialize();
     
   }

		public static int getIp67002Date2Redefined01FieldLength() {
			return IP_67002_DATE_2_REDEFINED_01_LENGTH;
		}

}
  

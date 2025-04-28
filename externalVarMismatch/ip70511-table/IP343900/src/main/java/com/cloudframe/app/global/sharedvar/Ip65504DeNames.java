package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504DeNames is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip65504DeNames extends Ip65504DeNamesSerialized { 
   
				private Ip65504DeNamesLargeGroup1 ip65504DeNamesLargeGroup1 = new Ip65504DeNamesLargeGroup1();
				private Ip65504DeNamesLargeGroup2 ip65504DeNamesLargeGroup2 = new Ip65504DeNamesLargeGroup2();
				private Ip65504DeNamesLargeGroup3 ip65504DeNamesLargeGroup3 = new Ip65504DeNamesLargeGroup3();
				private Ip65504DeNamesLargeGroup4 ip65504DeNamesLargeGroup4 = new Ip65504DeNamesLargeGroup4();
				private Ip65504DeNamesLargeGroup5 ip65504DeNamesLargeGroup5 = new Ip65504DeNamesLargeGroup5();
	
	/**
	* Constructor for Ip65504DeNames
	**/
    public Ip65504DeNames() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504DeNames. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504DeNames(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip65504DeNamesLargeGroup1.setParent(this,getStartOffset() + 0);
	       			ip65504DeNamesLargeGroup2.setParent(this,getStartOffset() + 244);
	       			ip65504DeNamesLargeGroup3.setParent(this,getStartOffset() + 492);
	       			ip65504DeNamesLargeGroup4.setParent(this,getStartOffset() + 740);
	       			ip65504DeNamesLargeGroup5.setParent(this,getStartOffset() + 988);
    } 

	/**
	 *	Returns the value of ip65504DeNamesLargeGroup1
	 *	@return ip65504DeNamesLargeGroup1
	 */   
	 public Ip65504DeNamesLargeGroup1 getIp65504DeNamesLargeGroup1() {
   	return ip65504DeNamesLargeGroup1;
   }
   /**
	* 	Update Ip65504DeNamesLargeGroup1 with the passed value
	*   Corresponding COBOL Variable is IP65504-DE-NAMES-LARGE-GROUP-1
	*	@param value
	*/
   public void setIp65504DeNamesLargeGroup1(char[] value) {
      ip65504DeNamesLargeGroup1.setString(value); 
   }   
    
     /**
	 * 	Update Ip65504DeNamesLargeGroup1 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp65504DeNamesLargeGroup1(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip65504DeNamesLargeGroup1.begin,ip65504DeNamesLargeGroup1.length());
   }
   
     /**
	 * 	Update Ip65504DeNamesLargeGroup1 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp65504DeNamesLargeGroup1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip65504DeNamesLargeGroup1.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip65504DeNamesLargeGroup1 with another Field
	 *	@param value
	 */
   public void setIp65504DeNamesLargeGroup1(Field source) {
   	replace(source,0,source.length(),ip65504DeNamesLargeGroup1.begin,ip65504DeNamesLargeGroup1.length());
   }  
   
     /**
	 * 	Update Ip65504DeNamesLargeGroup1 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp65504DeNamesLargeGroup1(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip65504DeNamesLargeGroup1.begin,ip65504DeNamesLargeGroup1.length());
   }
   
     /**
	 * 	Update Ip65504DeNamesLargeGroup1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp65504DeNamesLargeGroup1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip65504DeNamesLargeGroup1.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip65504DeNamesLargeGroup2
	 *	@return ip65504DeNamesLargeGroup2
	 */   
	 public Ip65504DeNamesLargeGroup2 getIp65504DeNamesLargeGroup2() {
   	return ip65504DeNamesLargeGroup2;
   }
   /**
	* 	Update Ip65504DeNamesLargeGroup2 with the passed value
	*   Corresponding COBOL Variable is IP65504-DE-NAMES-LARGE-GROUP-2
	*	@param value
	*/
   public void setIp65504DeNamesLargeGroup2(char[] value) {
      ip65504DeNamesLargeGroup2.setString(value); 
   }   
    
     /**
	 * 	Update Ip65504DeNamesLargeGroup2 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp65504DeNamesLargeGroup2(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip65504DeNamesLargeGroup2.begin,ip65504DeNamesLargeGroup2.length());
   }
   
     /**
	 * 	Update Ip65504DeNamesLargeGroup2 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp65504DeNamesLargeGroup2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip65504DeNamesLargeGroup2.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip65504DeNamesLargeGroup2 with another Field
	 *	@param value
	 */
   public void setIp65504DeNamesLargeGroup2(Field source) {
   	replace(source,0,source.length(),ip65504DeNamesLargeGroup2.begin,ip65504DeNamesLargeGroup2.length());
   }  
   
     /**
	 * 	Update Ip65504DeNamesLargeGroup2 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp65504DeNamesLargeGroup2(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip65504DeNamesLargeGroup2.begin,ip65504DeNamesLargeGroup2.length());
   }
   
     /**
	 * 	Update Ip65504DeNamesLargeGroup2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp65504DeNamesLargeGroup2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip65504DeNamesLargeGroup2.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip65504DeNamesLargeGroup3
	 *	@return ip65504DeNamesLargeGroup3
	 */   
	 public Ip65504DeNamesLargeGroup3 getIp65504DeNamesLargeGroup3() {
   	return ip65504DeNamesLargeGroup3;
   }
   /**
	* 	Update Ip65504DeNamesLargeGroup3 with the passed value
	*   Corresponding COBOL Variable is IP65504-DE-NAMES-LARGE-GROUP-3
	*	@param value
	*/
   public void setIp65504DeNamesLargeGroup3(char[] value) {
      ip65504DeNamesLargeGroup3.setString(value); 
   }   
    
     /**
	 * 	Update Ip65504DeNamesLargeGroup3 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp65504DeNamesLargeGroup3(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip65504DeNamesLargeGroup3.begin,ip65504DeNamesLargeGroup3.length());
   }
   
     /**
	 * 	Update Ip65504DeNamesLargeGroup3 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp65504DeNamesLargeGroup3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip65504DeNamesLargeGroup3.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip65504DeNamesLargeGroup3 with another Field
	 *	@param value
	 */
   public void setIp65504DeNamesLargeGroup3(Field source) {
   	replace(source,0,source.length(),ip65504DeNamesLargeGroup3.begin,ip65504DeNamesLargeGroup3.length());
   }  
   
     /**
	 * 	Update Ip65504DeNamesLargeGroup3 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp65504DeNamesLargeGroup3(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip65504DeNamesLargeGroup3.begin,ip65504DeNamesLargeGroup3.length());
   }
   
     /**
	 * 	Update Ip65504DeNamesLargeGroup3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp65504DeNamesLargeGroup3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip65504DeNamesLargeGroup3.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip65504DeNamesLargeGroup4
	 *	@return ip65504DeNamesLargeGroup4
	 */   
	 public Ip65504DeNamesLargeGroup4 getIp65504DeNamesLargeGroup4() {
   	return ip65504DeNamesLargeGroup4;
   }
   /**
	* 	Update Ip65504DeNamesLargeGroup4 with the passed value
	*   Corresponding COBOL Variable is IP65504-DE-NAMES-LARGE-GROUP-4
	*	@param value
	*/
   public void setIp65504DeNamesLargeGroup4(char[] value) {
      ip65504DeNamesLargeGroup4.setString(value); 
   }   
    
     /**
	 * 	Update Ip65504DeNamesLargeGroup4 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp65504DeNamesLargeGroup4(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip65504DeNamesLargeGroup4.begin,ip65504DeNamesLargeGroup4.length());
   }
   
     /**
	 * 	Update Ip65504DeNamesLargeGroup4 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp65504DeNamesLargeGroup4(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip65504DeNamesLargeGroup4.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip65504DeNamesLargeGroup4 with another Field
	 *	@param value
	 */
   public void setIp65504DeNamesLargeGroup4(Field source) {
   	replace(source,0,source.length(),ip65504DeNamesLargeGroup4.begin,ip65504DeNamesLargeGroup4.length());
   }  
   
     /**
	 * 	Update Ip65504DeNamesLargeGroup4 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp65504DeNamesLargeGroup4(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip65504DeNamesLargeGroup4.begin,ip65504DeNamesLargeGroup4.length());
   }
   
     /**
	 * 	Update Ip65504DeNamesLargeGroup4 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp65504DeNamesLargeGroup4(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip65504DeNamesLargeGroup4.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip65504DeNamesLargeGroup5
	 *	@return ip65504DeNamesLargeGroup5
	 */   
	 public Ip65504DeNamesLargeGroup5 getIp65504DeNamesLargeGroup5() {
   	return ip65504DeNamesLargeGroup5;
   }
   /**
	* 	Update Ip65504DeNamesLargeGroup5 with the passed value
	*   Corresponding COBOL Variable is IP65504-DE-NAMES-LARGE-GROUP-5
	*	@param value
	*/
   public void setIp65504DeNamesLargeGroup5(char[] value) {
      ip65504DeNamesLargeGroup5.setString(value); 
   }   
    
     /**
	 * 	Update Ip65504DeNamesLargeGroup5 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp65504DeNamesLargeGroup5(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip65504DeNamesLargeGroup5.begin,ip65504DeNamesLargeGroup5.length());
   }
   
     /**
	 * 	Update Ip65504DeNamesLargeGroup5 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp65504DeNamesLargeGroup5(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip65504DeNamesLargeGroup5.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip65504DeNamesLargeGroup5 with another Field
	 *	@param value
	 */
   public void setIp65504DeNamesLargeGroup5(Field source) {
   	replace(source,0,source.length(),ip65504DeNamesLargeGroup5.begin,ip65504DeNamesLargeGroup5.length());
   }  
   
     /**
	 * 	Update Ip65504DeNamesLargeGroup5 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp65504DeNamesLargeGroup5(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip65504DeNamesLargeGroup5.begin,ip65504DeNamesLargeGroup5.length());
   }
   
     /**
	 * 	Update Ip65504DeNamesLargeGroup5 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp65504DeNamesLargeGroup5(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip65504DeNamesLargeGroup5.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip65504DeNames
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip65504DeNamesLargeGroup1.initialize();
     
          ip65504DeNamesLargeGroup2.initialize();
     
          ip65504DeNamesLargeGroup3.initialize();
     
          ip65504DeNamesLargeGroup4.initialize();
     
          ip65504DeNamesLargeGroup5.initialize();
     
   }

		public static int getIp65504DeNamesFieldLength() {
			return IP_65504_DE_NAMES_LENGTH;
		}

}
  

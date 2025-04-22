package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip67002Ccyyddd is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:17. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip67002Ccyyddd extends Ip67002CcyydddSerialized { 
   

								private int ip67002CcJul;
				private Ip67002Yyddd ip67002Yyddd = new Ip67002Yyddd();
	
	/**
	* Constructor for Ip67002Ccyyddd
	**/
    public Ip67002Ccyyddd() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip67002Ccyyddd. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip67002Ccyyddd(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip67002Yyddd.setParent(this,getStartOffset() + 2);
    } 

	/**
	 *	Returns the value of ip67002CcJul
	 *	@return ip67002CcJul
	 */
	public int getIp67002CcJul() throws CFException {
       if (isIp67002CcJulModified()) { 
           ip67002CcJul = refreshIp67002CcJul();
        }
   		return ip67002CcJul;
	}
	

	
	   
	/**
	 * 	Update Ip67002CcJul with the passed value
	 *  Corresponding COBOL Variable is IP67002-CC-JUL
	 *	@param number
	 */
	public void setIp67002CcJul(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip67002CcJul = checkIp67002CcJulMaxLimit(number); 
		serializeIp67002CcJul(ip67002CcJul);
	}
	

	public void setIp67002CcJul(long number) {
	    number = checkIp67002CcJulMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp67002CcJul((int)number);
	}
	
	/**
	 * 	Update Ip67002CcJul with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002CcJul(char[] value) throws CFException {
		 ip67002CcJul = serializeIp67002CcJul(value);
	}
	/**
	 * 	Update Ip67002CcJul with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002CcJulString(char[] value) throws CFException {
		 setIp67002CcJul(value);
	}
	/**
	 *	Returns the value of ip67002Yyddd
	 *	@return ip67002Yyddd
	 */   
	 public Ip67002Yyddd getIp67002Yyddd() {
   	return ip67002Yyddd;
   }
   /**
	* 	Update Ip67002Yyddd with the passed value
	*   Corresponding COBOL Variable is IP67002-YYDDD
	*	@param value
	*/
   public void setIp67002Yyddd(char[] value) {
      ip67002Yyddd.setString(value); 
   }   
    
     /**
	 * 	Update Ip67002Yyddd 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp67002Yyddd(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip67002Yyddd.begin,ip67002Yyddd.length());
   }
   
     /**
	 * 	Update Ip67002Yyddd 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp67002Yyddd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip67002Yyddd.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip67002Yyddd with another Field
	 *	@param value
	 */
   public void setIp67002Yyddd(Field source) {
   	replace(source,0,source.length(),ip67002Yyddd.begin,ip67002Yyddd.length());
   }  
   
     /**
	 * 	Update Ip67002Yyddd 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp67002Yyddd(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip67002Yyddd.begin,ip67002Yyddd.length());
   }
   
     /**
	 * 	Update Ip67002Yyddd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp67002Yyddd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip67002Yyddd.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip67002Ccyyddd
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp67002CcJul(0);
          ip67002Yyddd.initialize();
     
   }

		public static int getIp67002CcyydddFieldLength() {
			return IP_67002_CCYYDDD_LENGTH;
		}

}
  

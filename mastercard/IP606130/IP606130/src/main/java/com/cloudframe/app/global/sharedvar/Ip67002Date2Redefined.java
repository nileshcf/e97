package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip67002Date2Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:17. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip67002Date2Redefined extends Ip67002Date2RedefinedSerialized { 
   

								private int ip67002Ccyy2;
				private Ip67002Ccyy2Redefined ip67002Ccyy2Redefined = new Ip67002Ccyy2Redefined();
				private Ip67002Mmdd2 ip67002Mmdd2 = new Ip67002Mmdd2();
				private Ip67002Jddd2 ip67002Jddd2 = new Ip67002Jddd2();
	
	/**
	* Constructor for Ip67002Date2Redefined
	**/
    public Ip67002Date2Redefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip67002Date2Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip67002Date2Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip67002Ccyy2Redefined.setParent(this,getStartOffset() + 0);
	       			ip67002Mmdd2.setParent(this,getStartOffset() + 4);
	       			ip67002Jddd2.setParent(this,getStartOffset() + 4);
    } 

	/**
	 *	Returns the value of ip67002Ccyy2
	 *	@return ip67002Ccyy2
	 */
	public int getIp67002Ccyy2() throws CFException {
       if (isIp67002Ccyy2Modified()) { 
           ip67002Ccyy2 = refreshIp67002Ccyy2();
        }
   		return ip67002Ccyy2;
	}
	

	
	   
	/**
	 * 	Update Ip67002Ccyy2 with the passed value
	 *  Corresponding COBOL Variable is IP67002-CCYY-2
	 *	@param number
	 */
	public void setIp67002Ccyy2(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip67002Ccyy2 = checkIp67002Ccyy2MaxLimit(number); 
		serializeIp67002Ccyy2(ip67002Ccyy2);
	}
	

	public void setIp67002Ccyy2(long number) {
	    number = checkIp67002Ccyy2MaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp67002Ccyy2((int)number);
	}
	
	/**
	 * 	Update Ip67002Ccyy2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Ccyy2(char[] value) throws CFException {
		 ip67002Ccyy2 = serializeIp67002Ccyy2(value);
	}
	/**
	 * 	Update Ip67002Ccyy2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002Ccyy2String(char[] value) throws CFException {
		 setIp67002Ccyy2(value);
	}
	/**
	 *	Returns the value of ip67002Ccyy2Redefined
	 *	@return ip67002Ccyy2Redefined
	 */   
	 public Ip67002Ccyy2Redefined getIp67002Ccyy2Redefined() {
   	return ip67002Ccyy2Redefined;
   }
   /**
	* 	Update Ip67002Ccyy2Redefined with the passed value
	*   Corresponding COBOL Variable is IP67002-CCYY-2-REDEFINED
	*	@param value
	*/
   public void setIp67002Ccyy2Redefined(char[] value) {
      ip67002Ccyy2Redefined.setString(value); 
   }   
    
     /**
	 * 	Update Ip67002Ccyy2Redefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp67002Ccyy2Redefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip67002Ccyy2Redefined.begin,ip67002Ccyy2Redefined.length());
   }
   
     /**
	 * 	Update Ip67002Ccyy2Redefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp67002Ccyy2Redefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip67002Ccyy2Redefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip67002Ccyy2Redefined with another Field
	 *	@param value
	 */
   public void setIp67002Ccyy2Redefined(Field source) {
   	replace(source,0,source.length(),ip67002Ccyy2Redefined.begin,ip67002Ccyy2Redefined.length());
   }  
   
     /**
	 * 	Update Ip67002Ccyy2Redefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp67002Ccyy2Redefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip67002Ccyy2Redefined.begin,ip67002Ccyy2Redefined.length());
   }
   
     /**
	 * 	Update Ip67002Ccyy2Redefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp67002Ccyy2Redefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip67002Ccyy2Redefined.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip67002Mmdd2
	 *	@return ip67002Mmdd2
	 */   
	 public Ip67002Mmdd2 getIp67002Mmdd2() {
   	return ip67002Mmdd2;
   }
   /**
	* 	Update Ip67002Mmdd2 with the passed value
	*   Corresponding COBOL Variable is IP67002-MMDD-2
	*	@param value
	*/
   public void setIp67002Mmdd2(char[] value) {
      ip67002Mmdd2.setString(value); 
   }   
    
     /**
	 * 	Update Ip67002Mmdd2 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp67002Mmdd2(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip67002Mmdd2.begin,ip67002Mmdd2.length());
   }
   
     /**
	 * 	Update Ip67002Mmdd2 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp67002Mmdd2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip67002Mmdd2.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip67002Mmdd2 with another Field
	 *	@param value
	 */
   public void setIp67002Mmdd2(Field source) {
   	replace(source,0,source.length(),ip67002Mmdd2.begin,ip67002Mmdd2.length());
   }  
   
     /**
	 * 	Update Ip67002Mmdd2 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp67002Mmdd2(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip67002Mmdd2.begin,ip67002Mmdd2.length());
   }
   
     /**
	 * 	Update Ip67002Mmdd2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp67002Mmdd2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip67002Mmdd2.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip67002Jddd2
	 *	@return ip67002Jddd2
	 */   
	 public Ip67002Jddd2 getIp67002Jddd2() {
   	return ip67002Jddd2;
   }
   /**
	* 	Update Ip67002Jddd2 with the passed value
	*   Corresponding COBOL Variable is IP67002-JDDD-2
	*	@param value
	*/
   public void setIp67002Jddd2(char[] value) {
      ip67002Jddd2.setString(value); 
   }   
    
     /**
	 * 	Update Ip67002Jddd2 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp67002Jddd2(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip67002Jddd2.begin,ip67002Jddd2.length());
   }
   
     /**
	 * 	Update Ip67002Jddd2 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp67002Jddd2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip67002Jddd2.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip67002Jddd2 with another Field
	 *	@param value
	 */
   public void setIp67002Jddd2(Field source) {
   	replace(source,0,source.length(),ip67002Jddd2.begin,ip67002Jddd2.length());
   }  
   
     /**
	 * 	Update Ip67002Jddd2 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp67002Jddd2(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip67002Jddd2.begin,ip67002Jddd2.length());
   }
   
     /**
	 * 	Update Ip67002Jddd2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp67002Jddd2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip67002Jddd2.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip67002Date2Redefined
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp67002Ccyy2(0);
          ip67002Mmdd2.initialize();
     
   }

		public static int getIp67002Date2RedefinedFieldLength() {
			return IP_67002_DATE_2_REDEFINED_LENGTH;
		}

}
  

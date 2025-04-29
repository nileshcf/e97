package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip67002DateRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip67002DateRedefined extends Ip67002DateRedefinedSerialized { 
   

								private int ip67002Ccyy;
				private Ip67002CcyyRedefined ip67002CcyyRedefined = new Ip67002CcyyRedefined();
				private Ip67002Mmdd ip67002Mmdd = new Ip67002Mmdd();
				private Ip67002Jddd ip67002Jddd = new Ip67002Jddd();
	
	/**
	* Constructor for Ip67002DateRedefined
	**/
    public Ip67002DateRedefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip67002DateRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip67002DateRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip67002CcyyRedefined.setParent(this,getStartOffset() + 0);
	       			ip67002Mmdd.setParent(this,getStartOffset() + 4);
	       			ip67002Jddd.setParent(this,getStartOffset() + 4);
    } 

	/**
	 *	Returns the value of ip67002Ccyy
	 *	@return ip67002Ccyy
	 */
	public int getIp67002Ccyy() throws CFException {
       if (isIp67002CcyyModified()) { 
           ip67002Ccyy = refreshIp67002Ccyy();
        }
   		return ip67002Ccyy;
	}
	

	
	   
	/**
	 * 	Update Ip67002Ccyy with the passed value
	 *  Corresponding COBOL Variable is IP67002-CCYY
	 *	@param number
	 */
	public void setIp67002Ccyy(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip67002Ccyy = checkIp67002CcyyMaxLimit(number); 
		serializeIp67002Ccyy(ip67002Ccyy);
	}
	

	public void setIp67002Ccyy(long number) {
	    number = checkIp67002CcyyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp67002Ccyy((int)number);
	}
	
	/**
	 * 	Update Ip67002Ccyy with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Ccyy(char[] value) throws CFException {
		 ip67002Ccyy = serializeIp67002Ccyy(value);
	}
	/**
	 * 	Update Ip67002Ccyy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002CcyyString(char[] value) throws CFException {
		 setIp67002Ccyy(value);
	}
	/**
	 *	Returns the value of ip67002CcyyRedefined
	 *	@return ip67002CcyyRedefined
	 */   
	 public Ip67002CcyyRedefined getIp67002CcyyRedefined() {
   	return ip67002CcyyRedefined;
   }
   /**
	* 	Update Ip67002CcyyRedefined with the passed value
	*   Corresponding COBOL Variable is IP67002-CCYY-REDEFINED
	*	@param value
	*/
   public void setIp67002CcyyRedefined(char[] value) {
      ip67002CcyyRedefined.setString(value); 
   }   
    
     /**
	 * 	Update Ip67002CcyyRedefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp67002CcyyRedefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip67002CcyyRedefined.begin,ip67002CcyyRedefined.length());
   }
   
     /**
	 * 	Update Ip67002CcyyRedefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp67002CcyyRedefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip67002CcyyRedefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip67002CcyyRedefined with another Field
	 *	@param value
	 */
   public void setIp67002CcyyRedefined(Field source) {
   	replace(source,0,source.length(),ip67002CcyyRedefined.begin,ip67002CcyyRedefined.length());
   }  
   
     /**
	 * 	Update Ip67002CcyyRedefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp67002CcyyRedefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip67002CcyyRedefined.begin,ip67002CcyyRedefined.length());
   }
   
     /**
	 * 	Update Ip67002CcyyRedefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp67002CcyyRedefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip67002CcyyRedefined.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip67002Mmdd
	 *	@return ip67002Mmdd
	 */   
	 public Ip67002Mmdd getIp67002Mmdd() {
   	return ip67002Mmdd;
   }
   /**
	* 	Update Ip67002Mmdd with the passed value
	*   Corresponding COBOL Variable is IP67002-MMDD
	*	@param value
	*/
   public void setIp67002Mmdd(char[] value) {
      ip67002Mmdd.setString(value); 
   }   
    
     /**
	 * 	Update Ip67002Mmdd 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp67002Mmdd(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip67002Mmdd.begin,ip67002Mmdd.length());
   }
   
     /**
	 * 	Update Ip67002Mmdd 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp67002Mmdd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip67002Mmdd.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip67002Mmdd with another Field
	 *	@param value
	 */
   public void setIp67002Mmdd(Field source) {
   	replace(source,0,source.length(),ip67002Mmdd.begin,ip67002Mmdd.length());
   }  
   
     /**
	 * 	Update Ip67002Mmdd 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp67002Mmdd(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip67002Mmdd.begin,ip67002Mmdd.length());
   }
   
     /**
	 * 	Update Ip67002Mmdd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp67002Mmdd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip67002Mmdd.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip67002Jddd
	 *	@return ip67002Jddd
	 */   
	 public Ip67002Jddd getIp67002Jddd() {
   	return ip67002Jddd;
   }
   /**
	* 	Update Ip67002Jddd with the passed value
	*   Corresponding COBOL Variable is IP67002-JDDD
	*	@param value
	*/
   public void setIp67002Jddd(char[] value) {
      ip67002Jddd.setString(value); 
   }   
    
     /**
	 * 	Update Ip67002Jddd 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp67002Jddd(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip67002Jddd.begin,ip67002Jddd.length());
   }
   
     /**
	 * 	Update Ip67002Jddd 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp67002Jddd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip67002Jddd.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip67002Jddd with another Field
	 *	@param value
	 */
   public void setIp67002Jddd(Field source) {
   	replace(source,0,source.length(),ip67002Jddd.begin,ip67002Jddd.length());
   }  
   
     /**
	 * 	Update Ip67002Jddd 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp67002Jddd(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip67002Jddd.begin,ip67002Jddd.length());
   }
   
     /**
	 * 	Update Ip67002Jddd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp67002Jddd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip67002Jddd.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip67002DateRedefined
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp67002Ccyy(0);
          ip67002Mmdd.initialize();
     
   }

		public static int getIp67002DateRedefinedFieldLength() {
			return IP_67002_DATE_REDEFINED_LENGTH;
		}

}
  

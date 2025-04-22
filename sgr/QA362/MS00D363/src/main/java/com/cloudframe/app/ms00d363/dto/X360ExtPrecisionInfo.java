package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360ExtPrecisionInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class X360ExtPrecisionInfo extends X360ExtPrecisionInfoSerialized { 
   

								private int x360FaAiEpImpDec;

								private int x360FaAiEpBaseImpDec;

								private long x360FPurchInterEp;

						private char[] x360FPurchInterIndEp = Field.fillLowValue(1);

								private long x360FCashbkInterEp;

						private char[] x360FCashbkInterIndEp = Field.fillLowValue(1);

								private long x360APurchInterEp;

						private char[] x360APurchInterIndEp = Field.fillLowValue(1);

								private long x360ACashbkInterEp;

						private char[] x360ACashbkInterIndEp = Field.fillLowValue(1);
	
	/**
	* Constructor for X360ExtPrecisionInfo
	**/
    public X360ExtPrecisionInfo() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for X360ExtPrecisionInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360ExtPrecisionInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of x360FaAiEpImpDec
	 *	@return x360FaAiEpImpDec
	 */
	public int getX360FaAiEpImpDec() throws CFException {
       if (isX360FaAiEpImpDecModified()) { 
           x360FaAiEpImpDec = refreshX360FaAiEpImpDec();
        }
   		return x360FaAiEpImpDec;
	}
	

	
	   
	/**
	 * 	Update X360FaAiEpImpDec with the passed value
	 *  Corresponding COBOL Variable is X360-FA-AI-EP-IMP-DEC
	 *	@param number
	 */
	public void setX360FaAiEpImpDec(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360FaAiEpImpDec = checkX360FaAiEpImpDecMaxLimit(number); 
		serializeX360FaAiEpImpDec(x360FaAiEpImpDec);
	}
	

	public void setX360FaAiEpImpDec(long number) {
	    number = checkX360FaAiEpImpDecMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FaAiEpImpDec((int)number);
	}
	
	/**
	 * 	Update X360FaAiEpImpDec with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360FaAiEpImpDec(char[] value) throws CFException {
		 x360FaAiEpImpDec = serializeX360FaAiEpImpDec(value);
	}
	/**
	 * 	Update X360FaAiEpImpDec with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360FaAiEpImpDecString(char[] value) throws CFException {
		 setX360FaAiEpImpDec(value);
	}
	/**
	 *	Returns the value of x360FaAiEpBaseImpDec
	 *	@return x360FaAiEpBaseImpDec
	 */
	public int getX360FaAiEpBaseImpDec() throws CFException {
       if (isX360FaAiEpBaseImpDecModified()) { 
           x360FaAiEpBaseImpDec = refreshX360FaAiEpBaseImpDec();
        }
   		return x360FaAiEpBaseImpDec;
	}
	

	
	   
	/**
	 * 	Update X360FaAiEpBaseImpDec with the passed value
	 *  Corresponding COBOL Variable is X360-FA-AI-EP-BASE-IMP-DEC
	 *	@param number
	 */
	public void setX360FaAiEpBaseImpDec(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360FaAiEpBaseImpDec = checkX360FaAiEpBaseImpDecMaxLimit(number); 
		serializeX360FaAiEpBaseImpDec(x360FaAiEpBaseImpDec);
	}
	

	public void setX360FaAiEpBaseImpDec(long number) {
	    number = checkX360FaAiEpBaseImpDecMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FaAiEpBaseImpDec((int)number);
	}
	
	/**
	 * 	Update X360FaAiEpBaseImpDec with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360FaAiEpBaseImpDec(char[] value) throws CFException {
		 x360FaAiEpBaseImpDec = serializeX360FaAiEpBaseImpDec(value);
	}
	/**
	 * 	Update X360FaAiEpBaseImpDec with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360FaAiEpBaseImpDecString(char[] value) throws CFException {
		 setX360FaAiEpBaseImpDec(value);
	}
	/**
	 *	Returns the value of x360FPurchInterEp
	 *	@return x360FPurchInterEp
	 */
	public long getX360FPurchInterEp() throws CFException {
       if (isX360FPurchInterEpModified()) { 
           x360FPurchInterEp = refreshX360FPurchInterEp();
        }
   		return x360FPurchInterEp;
	}
	

    /**
	 *	Returns the String value of x360FPurchInterEp
	 *	@return x360FPurchInterEp
	 */
	public char[]  getX360FPurchInterEpActualString() {
	    String value = String.valueOf(x360FPurchInterEp).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update X360FPurchInterEp with the passed value
	 *  Corresponding COBOL Variable is X360-F-PURCH-INTER-EP
	 *	@param number
	 */
	public void setX360FPurchInterEp(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360FPurchInterEp = checkX360FPurchInterEpMaxLimit(number); 
		serializeX360FPurchInterEp(x360FPurchInterEp);
	}
	

	/**
	 * 	Update X360FPurchInterEp with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360FPurchInterEp(char[] value) throws CFException {
		 x360FPurchInterEp = serializeX360FPurchInterEp(value);
	}
	/**
	 * 	Update X360FPurchInterEp with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360FPurchInterEpString(char[] value) throws CFException {
		 setX360FPurchInterEp(value);
	}
	/**
	 *	Returns the value of x360FPurchInterIndEp
	 *	@return x360FPurchInterIndEp
	 */
   public char[] getX360FPurchInterIndEp() throws CFException{
     if (isX360FPurchInterIndEpModified()) { 
        x360FPurchInterIndEp = refreshX360FPurchInterIndEp();
     }
   		return x360FPurchInterIndEp;
   }

  
	/**
	*  set variable x360FPurchInterIndEp
	*  Corresponding COBOL Variable is X360-F-PURCH-INTER-IND-EP
	*  @param value
	**/
   public void setX360FPurchInterIndEp(char[] value) {
      x360FPurchInterIndEp = checkX360FPurchInterIndEpConstraints(value);
      serializeX360FPurchInterIndEp(x360FPurchInterIndEp);
   } 

     /**
	 * 	Update X360FPurchInterIndEp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360FPurchInterIndEp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360FPurchInterIndEp,x360FPurchInterIndEp.length);
   	
   }
   
   public void setX360FPurchInterIndEp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360FPurchInterIndEp,x360FPurchInterIndEp.length);
   	
   }
   
     /**
	 * 	Update X360FPurchInterIndEp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360FPurchInterIndEp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360FPurchInterIndEp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360FPurchInterIndEp with another Field
	 *	@param value
	 */
   public void setX360FPurchInterIndEp(Field source) {
       replace(source,0,source.length(),beginX360FPurchInterIndEp,X_360_FPURCH_INTER_IND_EP_LEN);
   	
   }  
   
     /**
	 * 	Update X360FPurchInterIndEp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360FPurchInterIndEp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360FPurchInterIndEp,X_360_FPURCH_INTER_IND_EP_LEN);
   	
   }
   
     /**
	 * 	Update X360FPurchInterIndEp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360FPurchInterIndEp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360FPurchInterIndEp+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x360FCashbkInterEp
	 *	@return x360FCashbkInterEp
	 */
	public long getX360FCashbkInterEp() throws CFException {
       if (isX360FCashbkInterEpModified()) { 
           x360FCashbkInterEp = refreshX360FCashbkInterEp();
        }
   		return x360FCashbkInterEp;
	}
	

    /**
	 *	Returns the String value of x360FCashbkInterEp
	 *	@return x360FCashbkInterEp
	 */
	public char[]  getX360FCashbkInterEpActualString() {
	    String value = String.valueOf(x360FCashbkInterEp).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update X360FCashbkInterEp with the passed value
	 *  Corresponding COBOL Variable is X360-F-CASHBK-INTER-EP
	 *	@param number
	 */
	public void setX360FCashbkInterEp(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360FCashbkInterEp = checkX360FCashbkInterEpMaxLimit(number); 
		serializeX360FCashbkInterEp(x360FCashbkInterEp);
	}
	

	/**
	 * 	Update X360FCashbkInterEp with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360FCashbkInterEp(char[] value) throws CFException {
		 x360FCashbkInterEp = serializeX360FCashbkInterEp(value);
	}
	/**
	 * 	Update X360FCashbkInterEp with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360FCashbkInterEpString(char[] value) throws CFException {
		 setX360FCashbkInterEp(value);
	}
	/**
	 *	Returns the value of x360FCashbkInterIndEp
	 *	@return x360FCashbkInterIndEp
	 */
   public char[] getX360FCashbkInterIndEp() throws CFException{
     if (isX360FCashbkInterIndEpModified()) { 
        x360FCashbkInterIndEp = refreshX360FCashbkInterIndEp();
     }
   		return x360FCashbkInterIndEp;
   }

  
	/**
	*  set variable x360FCashbkInterIndEp
	*  Corresponding COBOL Variable is X360-F-CASHBK-INTER-IND-EP
	*  @param value
	**/
   public void setX360FCashbkInterIndEp(char[] value) {
      x360FCashbkInterIndEp = checkX360FCashbkInterIndEpConstraints(value);
      serializeX360FCashbkInterIndEp(x360FCashbkInterIndEp);
   } 

     /**
	 * 	Update X360FCashbkInterIndEp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360FCashbkInterIndEp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360FCashbkInterIndEp,x360FCashbkInterIndEp.length);
   	
   }
   
   public void setX360FCashbkInterIndEp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360FCashbkInterIndEp,x360FCashbkInterIndEp.length);
   	
   }
   
     /**
	 * 	Update X360FCashbkInterIndEp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360FCashbkInterIndEp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360FCashbkInterIndEp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360FCashbkInterIndEp with another Field
	 *	@param value
	 */
   public void setX360FCashbkInterIndEp(Field source) {
       replace(source,0,source.length(),beginX360FCashbkInterIndEp,X_360_FCASHBK_INTER_IND_EP_LEN);
   	
   }  
   
     /**
	 * 	Update X360FCashbkInterIndEp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360FCashbkInterIndEp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360FCashbkInterIndEp,X_360_FCASHBK_INTER_IND_EP_LEN);
   	
   }
   
     /**
	 * 	Update X360FCashbkInterIndEp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360FCashbkInterIndEp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360FCashbkInterIndEp+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x360APurchInterEp
	 *	@return x360APurchInterEp
	 */
	public long getX360APurchInterEp() throws CFException {
       if (isX360APurchInterEpModified()) { 
           x360APurchInterEp = refreshX360APurchInterEp();
        }
   		return x360APurchInterEp;
	}
	

    /**
	 *	Returns the String value of x360APurchInterEp
	 *	@return x360APurchInterEp
	 */
	public char[]  getX360APurchInterEpActualString() {
	    String value = String.valueOf(x360APurchInterEp).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update X360APurchInterEp with the passed value
	 *  Corresponding COBOL Variable is X360-A-PURCH-INTER-EP
	 *	@param number
	 */
	public void setX360APurchInterEp(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360APurchInterEp = checkX360APurchInterEpMaxLimit(number); 
		serializeX360APurchInterEp(x360APurchInterEp);
	}
	

	/**
	 * 	Update X360APurchInterEp with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360APurchInterEp(char[] value) throws CFException {
		 x360APurchInterEp = serializeX360APurchInterEp(value);
	}
	/**
	 * 	Update X360APurchInterEp with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360APurchInterEpString(char[] value) throws CFException {
		 setX360APurchInterEp(value);
	}
	/**
	 *	Returns the value of x360APurchInterIndEp
	 *	@return x360APurchInterIndEp
	 */
   public char[] getX360APurchInterIndEp() throws CFException{
     if (isX360APurchInterIndEpModified()) { 
        x360APurchInterIndEp = refreshX360APurchInterIndEp();
     }
   		return x360APurchInterIndEp;
   }

  
	/**
	*  set variable x360APurchInterIndEp
	*  Corresponding COBOL Variable is X360-A-PURCH-INTER-IND-EP
	*  @param value
	**/
   public void setX360APurchInterIndEp(char[] value) {
      x360APurchInterIndEp = checkX360APurchInterIndEpConstraints(value);
      serializeX360APurchInterIndEp(x360APurchInterIndEp);
   } 

     /**
	 * 	Update X360APurchInterIndEp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360APurchInterIndEp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360APurchInterIndEp,x360APurchInterIndEp.length);
   	
   }
   
   public void setX360APurchInterIndEp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360APurchInterIndEp,x360APurchInterIndEp.length);
   	
   }
   
     /**
	 * 	Update X360APurchInterIndEp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360APurchInterIndEp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360APurchInterIndEp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360APurchInterIndEp with another Field
	 *	@param value
	 */
   public void setX360APurchInterIndEp(Field source) {
       replace(source,0,source.length(),beginX360APurchInterIndEp,X_360_APURCH_INTER_IND_EP_LEN);
   	
   }  
   
     /**
	 * 	Update X360APurchInterIndEp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360APurchInterIndEp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360APurchInterIndEp,X_360_APURCH_INTER_IND_EP_LEN);
   	
   }
   
     /**
	 * 	Update X360APurchInterIndEp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360APurchInterIndEp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360APurchInterIndEp+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x360ACashbkInterEp
	 *	@return x360ACashbkInterEp
	 */
	public long getX360ACashbkInterEp() throws CFException {
       if (isX360ACashbkInterEpModified()) { 
           x360ACashbkInterEp = refreshX360ACashbkInterEp();
        }
   		return x360ACashbkInterEp;
	}
	

    /**
	 *	Returns the String value of x360ACashbkInterEp
	 *	@return x360ACashbkInterEp
	 */
	public char[]  getX360ACashbkInterEpActualString() {
	    String value = String.valueOf(x360ACashbkInterEp).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update X360ACashbkInterEp with the passed value
	 *  Corresponding COBOL Variable is X360-A-CASHBK-INTER-EP
	 *	@param number
	 */
	public void setX360ACashbkInterEp(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360ACashbkInterEp = checkX360ACashbkInterEpMaxLimit(number); 
		serializeX360ACashbkInterEp(x360ACashbkInterEp);
	}
	

	/**
	 * 	Update X360ACashbkInterEp with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360ACashbkInterEp(char[] value) throws CFException {
		 x360ACashbkInterEp = serializeX360ACashbkInterEp(value);
	}
	/**
	 * 	Update X360ACashbkInterEp with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360ACashbkInterEpString(char[] value) throws CFException {
		 setX360ACashbkInterEp(value);
	}
	/**
	 *	Returns the value of x360ACashbkInterIndEp
	 *	@return x360ACashbkInterIndEp
	 */
   public char[] getX360ACashbkInterIndEp() throws CFException{
     if (isX360ACashbkInterIndEpModified()) { 
        x360ACashbkInterIndEp = refreshX360ACashbkInterIndEp();
     }
   		return x360ACashbkInterIndEp;
   }

  
	/**
	*  set variable x360ACashbkInterIndEp
	*  Corresponding COBOL Variable is X360-A-CASHBK-INTER-IND-EP
	*  @param value
	**/
   public void setX360ACashbkInterIndEp(char[] value) {
      x360ACashbkInterIndEp = checkX360ACashbkInterIndEpConstraints(value);
      serializeX360ACashbkInterIndEp(x360ACashbkInterIndEp);
   } 

     /**
	 * 	Update X360ACashbkInterIndEp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360ACashbkInterIndEp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360ACashbkInterIndEp,x360ACashbkInterIndEp.length);
   	
   }
   
   public void setX360ACashbkInterIndEp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360ACashbkInterIndEp,x360ACashbkInterIndEp.length);
   	
   }
   
     /**
	 * 	Update X360ACashbkInterIndEp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360ACashbkInterIndEp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360ACashbkInterIndEp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360ACashbkInterIndEp with another Field
	 *	@param value
	 */
   public void setX360ACashbkInterIndEp(Field source) {
       replace(source,0,source.length(),beginX360ACashbkInterIndEp,X_360_ACASHBK_INTER_IND_EP_LEN);
   	
   }  
   
     /**
	 * 	Update X360ACashbkInterIndEp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360ACashbkInterIndEp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360ACashbkInterIndEp,X_360_ACASHBK_INTER_IND_EP_LEN);
   	
   }
   
     /**
	 * 	Update X360ACashbkInterIndEp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360ACashbkInterIndEp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360ACashbkInterIndEp+targetIndex,targetLen);
    
   }

	
	
	

		public static int getX360ExtPrecisionInfoFieldLength() {
			return X_360_EXT_PRECISION_INFO_LENGTH;
		}

}
  

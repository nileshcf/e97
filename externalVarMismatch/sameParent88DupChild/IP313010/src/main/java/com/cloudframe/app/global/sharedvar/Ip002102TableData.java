package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip002102TableData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:18. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip002102TableData extends Ip002102TableDataSerialized { 
   
				private Ip002102OldElementId ip002102OldElementId = new Ip002102OldElementId();

								private short ip002102OldSubfldNo;
				private Ip002102NewElementId ip002102NewElementId = new Ip002102NewElementId();

								private short ip002102NewSubfldNo;

						private char[] ip002102Justified = Field.fillLowValue(1);

								private int ip002102FirstDefaultPtr;

						private char[] ip002102FirstDefaultPtrRedefined = Field.fillLowValue(4);

								private int ip002102LastDefaultPtr;
	
	/**
	* Constructor for Ip002102TableData
	**/
    public Ip002102TableData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip002102TableData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip002102TableData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip002102OldElementId.setParent(this,getStartOffset() + 0);
	       			ip002102NewElementId.setParent(this,getStartOffset() + 6);
    } 

	/**
	 *	Returns the value of ip002102OldElementId
	 *	@return ip002102OldElementId
	 */   
	 public Ip002102OldElementId getIp002102OldElementId() {
   	return ip002102OldElementId;
   }
   /**
	* 	Update Ip002102OldElementId with the passed value
	*   Corresponding COBOL Variable is IP002102-OLD-ELEMENT-ID
	*	@param value
	*/
   public void setIp002102OldElementId(char[] value) {
      ip002102OldElementId.setString(value); 
   }   
    
     /**
	 * 	Update Ip002102OldElementId 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp002102OldElementId(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip002102OldElementId.begin,ip002102OldElementId.length());
   }
   
     /**
	 * 	Update Ip002102OldElementId 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp002102OldElementId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip002102OldElementId.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip002102OldElementId with another Field
	 *	@param value
	 */
   public void setIp002102OldElementId(Field source) {
   	replace(source,0,source.length(),ip002102OldElementId.begin,ip002102OldElementId.length());
   }  
   
     /**
	 * 	Update Ip002102OldElementId 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp002102OldElementId(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip002102OldElementId.begin,ip002102OldElementId.length());
   }
   
     /**
	 * 	Update Ip002102OldElementId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp002102OldElementId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip002102OldElementId.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip002102OldSubfldNo
	 *	@return ip002102OldSubfldNo
	 */
	public short getIp002102OldSubfldNo() throws CFException {
        if (isIp002102OldSubfldNoModified()) { 
           ip002102OldSubfldNo = refreshIp002102OldSubfldNo();
        }
   		return ip002102OldSubfldNo;
	}
	
	/**
	 * 	Update Ip002102OldSubfldNo with the passed value
	 *  Corresponding COBOL Variable is IP002102-OLD-SUBFLD-NO
	 *	@param number
	 */
	public void setIp002102OldSubfldNo(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip002102OldSubfldNo = checkIp002102OldSubfldNoMaxLimit(number); 
		serializeIp002102OldSubfldNo(ip002102OldSubfldNo);
	}

	public void setIp002102OldSubfldNo(int number) {
	    number = checkIp002102OldSubfldNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp002102OldSubfldNo((short)number);
	}
	public void setIp002102OldSubfldNo(long number) {
	    number = checkIp002102OldSubfldNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp002102OldSubfldNo((short)number);
	}
	

	
	/**
	 *	Test condition 0 for isIp002102EntireElement()
	 *	@return  Returns true if isIp002102EntireElement() is 0
	 */
   public boolean isIp002102EntireElement() throws CFException {
      return (  getIp002102OldSubfldNo()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setIp002102EntireElementTrue() {  			
    	setIp002102OldSubfldNo( (short)0);
   	}
	
	/**
	 *	Test condition 99 for isIp002102NoOldSubfld()
	 *	@return  Returns true if isIp002102NoOldSubfld() is 99
	 */
   public boolean isIp002102NoOldSubfld() throws CFException {
      return (  getIp002102OldSubfldNo()  ==  99  );
   }


	/**
	*  set values 99
	*/
   	public void setIp002102NoOldSubfldTrue() {  			
    	setIp002102OldSubfldNo( (short)99);
   	}
	/**
	 *	Returns the value of ip002102NewElementId
	 *	@return ip002102NewElementId
	 */   
	 public Ip002102NewElementId getIp002102NewElementId() {
   	return ip002102NewElementId;
   }
   /**
	* 	Update Ip002102NewElementId with the passed value
	*   Corresponding COBOL Variable is IP002102-NEW-ELEMENT-ID
	*	@param value
	*/
   public void setIp002102NewElementId(char[] value) {
      ip002102NewElementId.setString(value); 
   }   
    
     /**
	 * 	Update Ip002102NewElementId 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp002102NewElementId(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip002102NewElementId.begin,ip002102NewElementId.length());
   }
   
     /**
	 * 	Update Ip002102NewElementId 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp002102NewElementId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip002102NewElementId.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip002102NewElementId with another Field
	 *	@param value
	 */
   public void setIp002102NewElementId(Field source) {
   	replace(source,0,source.length(),ip002102NewElementId.begin,ip002102NewElementId.length());
   }  
   
     /**
	 * 	Update Ip002102NewElementId 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp002102NewElementId(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip002102NewElementId.begin,ip002102NewElementId.length());
   }
   
     /**
	 * 	Update Ip002102NewElementId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp002102NewElementId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip002102NewElementId.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip002102NewSubfldNo
	 *	@return ip002102NewSubfldNo
	 */
	public short getIp002102NewSubfldNo() throws CFException {
        if (isIp002102NewSubfldNoModified()) { 
           ip002102NewSubfldNo = refreshIp002102NewSubfldNo();
        }
   		return ip002102NewSubfldNo;
	}
	
	/**
	 * 	Update Ip002102NewSubfldNo with the passed value
	 *  Corresponding COBOL Variable is IP002102-NEW-SUBFLD-NO
	 *	@param number
	 */
	public void setIp002102NewSubfldNo(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip002102NewSubfldNo = checkIp002102NewSubfldNoMaxLimit(number); 
		serializeIp002102NewSubfldNo(ip002102NewSubfldNo);
	}

	public void setIp002102NewSubfldNo(int number) {
	    number = checkIp002102NewSubfldNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp002102NewSubfldNo((short)number);
	}
	public void setIp002102NewSubfldNo(long number) {
	    number = checkIp002102NewSubfldNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp002102NewSubfldNo((short)number);
	}
	

	
	/**
	 *	Test condition 0 for isIp002102EntireElement1()
	 *	@return  Returns true if isIp002102EntireElement1() is 0
	 */
   public boolean isIp002102EntireElement1() throws CFException {
      return (  getIp002102NewSubfldNo()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setIp002102EntireElement1True() {  			
    	setIp002102NewSubfldNo( (short)0);
   	}
	/**
	 *	Returns the value of ip002102Justified
	 *	@return ip002102Justified
	 */
   public char[] getIp002102Justified() throws CFException{
     if (isIp002102JustifiedModified()) { 
        ip002102Justified = refreshIp002102Justified();
     }
   		return ip002102Justified;
   }

  
	/**
	*  set variable ip002102Justified
	*  Corresponding COBOL Variable is IP002102-JUSTIFIED
	*  @param value
	**/
   public void setIp002102Justified(char[] value) {
      ip002102Justified = checkIp002102JustifiedConstraints(value);
      serializeIp002102Justified(ip002102Justified);
   } 

     /**
	 * 	Update Ip002102Justified 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp002102Justified(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp002102Justified,ip002102Justified.length);
   	
   }
   
   public void setIp002102Justified(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp002102Justified,ip002102Justified.length);
   	
   }
   
     /**
	 * 	Update Ip002102Justified 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp002102Justified(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp002102Justified+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip002102Justified with another Field
	 *	@param value
	 */
   public void setIp002102Justified(Field source) {
       replace(source,0,source.length(),beginIp002102Justified,IP_002102_JUSTIFIED_LEN);
   	
   }  
   
     /**
	 * 	Update Ip002102Justified 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp002102Justified(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp002102Justified,IP_002102_JUSTIFIED_LEN);
   	
   }
   
     /**
	 * 	Update Ip002102Justified 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp002102Justified(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp002102Justified+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip002102FirstDefaultPtr
	 *	@return ip002102FirstDefaultPtr
	 */
	public int getIp002102FirstDefaultPtr() throws CFException {
        if (isIp002102FirstDefaultPtrModified()) { 
           ip002102FirstDefaultPtr = refreshIp002102FirstDefaultPtr();
        }
   		return ip002102FirstDefaultPtr;
	}
	
	/**
	 * 	Update Ip002102FirstDefaultPtr with the passed value
	 *  Corresponding COBOL Variable is IP002102-FIRST-DEFAULT-PTR
	 *	@param number
	 */
	public void setIp002102FirstDefaultPtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip002102FirstDefaultPtr = checkIp002102FirstDefaultPtrMaxLimit(number); 
		serializeIp002102FirstDefaultPtr(ip002102FirstDefaultPtr);
	}


	public void setIp002102FirstDefaultPtr(long number) {
	    number = checkIp002102FirstDefaultPtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp002102FirstDefaultPtr((int)number);
	}
	
	/**
	 *	Returns the value of ip002102FirstDefaultPtrRedefined
	 *	@return ip002102FirstDefaultPtrRedefined
	 */
   public char[] getIp002102FirstDefaultPtrRedefined() throws CFException{
     if (isIp002102FirstDefaultPtrRedefinedModified()) { 
        ip002102FirstDefaultPtrRedefined = refreshIp002102FirstDefaultPtrRedefined();
     }
   		return ip002102FirstDefaultPtrRedefined;
   }

  
	/**
	*  set variable ip002102FirstDefaultPtrRedefined
	*  Corresponding COBOL Variable is IP002102-FIRST-DEFAULT-PTR-REDEFINED
	*  @param value
	**/
   public void setIp002102FirstDefaultPtrRedefined(char[] value) {
      ip002102FirstDefaultPtrRedefined = checkIp002102FirstDefaultPtrRedefinedConstraints(value);
      serializeIp002102FirstDefaultPtrRedefined(ip002102FirstDefaultPtrRedefined);
   } 

     /**
	 * 	Update Ip002102FirstDefaultPtrRedefined 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp002102FirstDefaultPtrRedefined(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp002102FirstDefaultPtrRedefined,ip002102FirstDefaultPtrRedefined.length);
   	
   }
   
   public void setIp002102FirstDefaultPtrRedefined(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp002102FirstDefaultPtrRedefined,ip002102FirstDefaultPtrRedefined.length);
   	
   }
   
     /**
	 * 	Update Ip002102FirstDefaultPtrRedefined 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp002102FirstDefaultPtrRedefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp002102FirstDefaultPtrRedefined+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip002102FirstDefaultPtrRedefined with another Field
	 *	@param value
	 */
   public void setIp002102FirstDefaultPtrRedefined(Field source) {
       replace(source,0,source.length(),beginIp002102FirstDefaultPtrRedefined,IP_002102_FIRST_DEFAULT_PTR_REDEFINED_LEN);
   	
   }  
   
     /**
	 * 	Update Ip002102FirstDefaultPtrRedefined 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp002102FirstDefaultPtrRedefined(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp002102FirstDefaultPtrRedefined,IP_002102_FIRST_DEFAULT_PTR_REDEFINED_LEN);
   	
   }
   
     /**
	 * 	Update Ip002102FirstDefaultPtrRedefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp002102FirstDefaultPtrRedefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp002102FirstDefaultPtrRedefined+targetIndex,targetLen);
    
   }
	char[] ip002102NoDefaultValue88Value = fillHighValue(4);
	/**
	 *	Test condition new byte[] {(byte)0xFF} for isIp002102NoDefaultValue()
	 *	@return  Returns true if isIp002102NoDefaultValue() is new byte[] {(byte)0xFF}
	 */
   public boolean isIp002102NoDefaultValue() throws CFException {
      return (  compareChars( getIp002102FirstDefaultPtrRedefined() , ip002102NoDefaultValue88Value)  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xFF}
	*/
   	public void setIp002102NoDefaultValueTrue() {  			
    	setIp002102FirstDefaultPtrRedefined( ip002102NoDefaultValue88Value);
   	}
	/**
	 *	Returns the value of ip002102LastDefaultPtr
	 *	@return ip002102LastDefaultPtr
	 */
	public int getIp002102LastDefaultPtr() throws CFException {
        if (isIp002102LastDefaultPtrModified()) { 
           ip002102LastDefaultPtr = refreshIp002102LastDefaultPtr();
        }
   		return ip002102LastDefaultPtr;
	}
	
	/**
	 * 	Update Ip002102LastDefaultPtr with the passed value
	 *  Corresponding COBOL Variable is IP002102-LAST-DEFAULT-PTR
	 *	@param number
	 */
	public void setIp002102LastDefaultPtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip002102LastDefaultPtr = checkIp002102LastDefaultPtrMaxLimit(number); 
		serializeIp002102LastDefaultPtr(ip002102LastDefaultPtr);
	}


	public void setIp002102LastDefaultPtr(long number) {
	    number = checkIp002102LastDefaultPtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp002102LastDefaultPtr((int)number);
	}
	

	
	
	
	/**
	 * 	initializes Ip002102TableData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip002102OldElementId.initialize();
     
         	setIp002102OldSubfldNo((short)0);
          ip002102NewElementId.initialize();
     
         	setIp002102NewSubfldNo((short)0);
         setIp002102Justified(CONSTANTS.SPACE);
                     setIp002102FirstDefaultPtr(0);
                     setIp002102LastDefaultPtr(0);
   }

		public static int getIp002102TableDataFieldLength() {
			return IP_002102_TABLE_DATA_LENGTH;
		}

}
  

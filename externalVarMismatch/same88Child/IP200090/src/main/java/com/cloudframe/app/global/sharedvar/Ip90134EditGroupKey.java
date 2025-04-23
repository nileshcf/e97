package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip90134EditGroupKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:05. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip90134EditGroupKey extends Ip90134EditGroupKeySerialized { 
   

						private char[] ip90134EditGroup = Field.fillLowValue(1);

						private char[] ip90134AccBrand = Field.fillLowValue(3);

								private int ip90134ElementType;

								private int ip90134ElementNum;

								private int ip90134ElementSubNum;

								private int ip90134EditNumber;
	
	/**
	* Constructor for Ip90134EditGroupKey
	**/
    public Ip90134EditGroupKey() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip90134EditGroupKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip90134EditGroupKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip90134EditGroup
	 *	@return ip90134EditGroup
	 */
   public char[] getIp90134EditGroup() throws CFException{
     if (isIp90134EditGroupModified()) { 
        ip90134EditGroup = refreshIp90134EditGroup();
     }
   		return ip90134EditGroup;
   }

  
	/**
	*  set variable ip90134EditGroup
	*  Corresponding COBOL Variable is IP90134-EDIT-GROUP
	*  @param value
	**/
   public void setIp90134EditGroup(char[] value) {
      ip90134EditGroup = checkIp90134EditGroupConstraints(value);
      serializeIp90134EditGroup(ip90134EditGroup);
   } 

     /**
	 * 	Update Ip90134EditGroup 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp90134EditGroup(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp90134EditGroup,ip90134EditGroup.length);
   	
   }
   
   public void setIp90134EditGroup(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp90134EditGroup,ip90134EditGroup.length);
   	
   }
   
     /**
	 * 	Update Ip90134EditGroup 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp90134EditGroup(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp90134EditGroup+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip90134EditGroup with another Field
	 *	@param value
	 */
   public void setIp90134EditGroup(Field source) {
       replace(source,0,source.length(),beginIp90134EditGroup,IP_90134_EDIT_GROUP_LEN);
   	
   }  
   
     /**
	 * 	Update Ip90134EditGroup 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp90134EditGroup(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp90134EditGroup,IP_90134_EDIT_GROUP_LEN);
   	
   }
   
     /**
	 * 	Update Ip90134EditGroup 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp90134EditGroup(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp90134EditGroup+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip90134AccBrand
	 *	@return ip90134AccBrand
	 */
   public char[] getIp90134AccBrand() throws CFException{
     if (isIp90134AccBrandModified()) { 
        ip90134AccBrand = refreshIp90134AccBrand();
     }
   		return ip90134AccBrand;
   }

  
	/**
	*  set variable ip90134AccBrand
	*  Corresponding COBOL Variable is IP90134-ACC-BRAND
	*  @param value
	**/
   public void setIp90134AccBrand(char[] value) {
      ip90134AccBrand = checkIp90134AccBrandConstraints(value);
      serializeIp90134AccBrand(ip90134AccBrand);
   } 

     /**
	 * 	Update Ip90134AccBrand 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp90134AccBrand(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp90134AccBrand,ip90134AccBrand.length);
   	
   }
   
   public void setIp90134AccBrand(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp90134AccBrand,ip90134AccBrand.length);
   	
   }
   
     /**
	 * 	Update Ip90134AccBrand 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp90134AccBrand(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp90134AccBrand+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip90134AccBrand with another Field
	 *	@param value
	 */
   public void setIp90134AccBrand(Field source) {
       replace(source,0,source.length(),beginIp90134AccBrand,IP_90134_ACC_BRAND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip90134AccBrand 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp90134AccBrand(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp90134AccBrand,IP_90134_ACC_BRAND_LEN);
   	
   }
   
     /**
	 * 	Update Ip90134AccBrand 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp90134AccBrand(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp90134AccBrand+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip90134ElementType
	 *	@return ip90134ElementType
	 */
	public int getIp90134ElementType() throws CFException {
       if (isIp90134ElementTypeModified()) { 
           ip90134ElementType = refreshIp90134ElementType();
        }
   		return ip90134ElementType;
	}
	

	
	   
	/**
	 * 	Update Ip90134ElementType with the passed value
	 *  Corresponding COBOL Variable is IP90134-ELEMENT-TYPE
	 *	@param number
	 */
	public void setIp90134ElementType(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip90134ElementType = checkIp90134ElementTypeMaxLimit(number); 
		serializeIp90134ElementType(ip90134ElementType);
	}
	

	public void setIp90134ElementType(long number) {
	    number = checkIp90134ElementTypeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp90134ElementType((int)number);
	}
	
	/**
	 * 	Update Ip90134ElementType with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp90134ElementType(char[] value) throws CFException {
		 ip90134ElementType = serializeIp90134ElementType(value);
	}
	/**
	 * 	Update Ip90134ElementType with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp90134ElementTypeString(char[] value) throws CFException {
		 setIp90134ElementType(value);
	}
	/**
	 *	Returns the value of ip90134ElementNum
	 *	@return ip90134ElementNum
	 */
	public int getIp90134ElementNum() throws CFException {
       if (isIp90134ElementNumModified()) { 
           ip90134ElementNum = refreshIp90134ElementNum();
        }
   		return ip90134ElementNum;
	}
	

	
	   
	/**
	 * 	Update Ip90134ElementNum with the passed value
	 *  Corresponding COBOL Variable is IP90134-ELEMENT-NUM
	 *	@param number
	 */
	public void setIp90134ElementNum(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip90134ElementNum = checkIp90134ElementNumMaxLimit(number); 
		serializeIp90134ElementNum(ip90134ElementNum);
	}
	

	public void setIp90134ElementNum(long number) {
	    number = checkIp90134ElementNumMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp90134ElementNum((int)number);
	}
	
	/**
	 * 	Update Ip90134ElementNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp90134ElementNum(char[] value) throws CFException {
		 ip90134ElementNum = serializeIp90134ElementNum(value);
	}
	/**
	 * 	Update Ip90134ElementNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp90134ElementNumString(char[] value) throws CFException {
		 setIp90134ElementNum(value);
	}
	/**
	 *	Returns the value of ip90134ElementSubNum
	 *	@return ip90134ElementSubNum
	 */
	public int getIp90134ElementSubNum() throws CFException {
       if (isIp90134ElementSubNumModified()) { 
           ip90134ElementSubNum = refreshIp90134ElementSubNum();
        }
   		return ip90134ElementSubNum;
	}
	

	
	   
	/**
	 * 	Update Ip90134ElementSubNum with the passed value
	 *  Corresponding COBOL Variable is IP90134-ELEMENT-SUB-NUM
	 *	@param number
	 */
	public void setIp90134ElementSubNum(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip90134ElementSubNum = checkIp90134ElementSubNumMaxLimit(number); 
		serializeIp90134ElementSubNum(ip90134ElementSubNum);
	}
	

	public void setIp90134ElementSubNum(long number) {
	    number = checkIp90134ElementSubNumMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp90134ElementSubNum((int)number);
	}
	
	/**
	 * 	Update Ip90134ElementSubNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp90134ElementSubNum(char[] value) throws CFException {
		 ip90134ElementSubNum = serializeIp90134ElementSubNum(value);
	}
	/**
	 * 	Update Ip90134ElementSubNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp90134ElementSubNumString(char[] value) throws CFException {
		 setIp90134ElementSubNum(value);
	}
	/**
	 *	Returns the value of ip90134EditNumber
	 *	@return ip90134EditNumber
	 */
	public int getIp90134EditNumber() throws CFException {
       if (isIp90134EditNumberModified()) { 
           ip90134EditNumber = refreshIp90134EditNumber();
        }
   		return ip90134EditNumber;
	}
	

	
	   
	/**
	 * 	Update Ip90134EditNumber with the passed value
	 *  Corresponding COBOL Variable is IP90134-EDIT-NUMBER
	 *	@param number
	 */
	public void setIp90134EditNumber(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip90134EditNumber = checkIp90134EditNumberMaxLimit(number); 
		serializeIp90134EditNumber(ip90134EditNumber);
	}
	

	public void setIp90134EditNumber(long number) {
	    number = checkIp90134EditNumberMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp90134EditNumber((int)number);
	}
	
	/**
	 * 	Update Ip90134EditNumber with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp90134EditNumber(char[] value) throws CFException {
		 ip90134EditNumber = serializeIp90134EditNumber(value);
	}
	/**
	 * 	Update Ip90134EditNumber with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp90134EditNumberString(char[] value) throws CFException {
		 setIp90134EditNumber(value);
	}

	
	
	
	/**
	 * 	initializes Ip90134EditGroupKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp90134EditGroup(CONSTANTS.SPACE);
         setIp90134AccBrand(CONSTANTS.SPACE_3);
                     setIp90134ElementType(0);
                     setIp90134ElementNum(0);
                     setIp90134ElementSubNum(0);
                     setIp90134EditNumber(0);
   }

		public static int getIp90134EditGroupKeyFieldLength() {
			return IP_90134_EDIT_GROUP_KEY_LENGTH;
		}

}
  

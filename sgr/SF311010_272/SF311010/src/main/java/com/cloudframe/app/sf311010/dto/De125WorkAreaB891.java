package com.cloudframe.app.sf311010.dto;

/**
*  The class De125WorkAreaB891 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:05. using version 5.0.0.254
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class De125WorkAreaB891 extends De125WorkAreaB891Serialized { 
   

								private long bytes516891;

						private char[] bytes1718891 = Field.fillLowValue(2);

								private long bytes2128891;

						private char[] bytes2930891 = Field.fillLowValue(2);

								private int bytes3336891;

						private char[] bytes3738891 = Field.fillLowValue(2);

								private int bytes4143891;
	
	/**
	* Constructor for De125WorkAreaB891
	**/
    public De125WorkAreaB891() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for De125WorkAreaB891. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public De125WorkAreaB891(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bytes516891
	 *	@return bytes516891
	 */
	public long getBytes516891() throws CFException {
       if (isBytes516891Modified()) { 
           bytes516891 = refreshBytes516891();
        }
   		return bytes516891;
	}
	

	
	   
	/**
	 * 	Update Bytes516891 with the passed value
	 *  Corresponding COBOL Variable is 891-BYTES-5-16
	 *	@param number
	 */
	public void setBytes516891(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    bytes516891 = checkBytes516891MaxLimit(number); 
		serializeBytes516891(bytes516891);
	}
	

	/**
	 * 	Update Bytes516891 with the passed value
	 *	@param value (String or char[])
	 */
	public void setBytes516891(char[] value) throws CFException {
		 bytes516891 = serializeBytes516891(value);
	}
	/**
	 * 	Update Bytes516891 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBytes516891String(char[] value) throws CFException {
		 setBytes516891(value);
	}
	/**
	 *	Returns the value of bytes1718891
	 *	@return bytes1718891
	 */
   public char[] getBytes1718891() throws CFException{
     if (isBytes1718891Modified()) { 
        bytes1718891 = refreshBytes1718891();
     }
   		return bytes1718891;
   }

  
	/**
	*  set variable bytes1718891
	*  Corresponding COBOL Variable is 891-BYTES-17-18
	*  @param value
	**/
   public void setBytes1718891(char[] value) {
      bytes1718891 = checkBytes1718891Constraints(value);
      serializeBytes1718891(bytes1718891);
   } 

     /**
	 * 	Update Bytes1718891 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBytes1718891(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBytes1718891,bytes1718891.length);
   	
   }
   
   public void setBytes1718891(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBytes1718891,bytes1718891.length);
   	
   }
   
     /**
	 * 	Update Bytes1718891 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBytes1718891(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBytes1718891+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bytes1718891 with another Field
	 *	@param value
	 */
   public void setBytes1718891(Field source) {
       replace(source,0,source.length(),beginBytes1718891,BYTES_1718891_LEN);
   	
   }  
   
     /**
	 * 	Update Bytes1718891 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBytes1718891(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBytes1718891,BYTES_1718891_LEN);
   	
   }
   
     /**
	 * 	Update Bytes1718891 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBytes1718891(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBytes1718891+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bytes2128891
	 *	@return bytes2128891
	 */
	public long getBytes2128891() throws CFException {
       if (isBytes2128891Modified()) { 
           bytes2128891 = refreshBytes2128891();
        }
   		return bytes2128891;
	}
	

	
	   
	/**
	 * 	Update Bytes2128891 with the passed value
	 *  Corresponding COBOL Variable is 891-BYTES-21-28
	 *	@param number
	 */
	public void setBytes2128891(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    bytes2128891 = checkBytes2128891MaxLimit(number); 
		serializeBytes2128891(bytes2128891);
	}
	

	/**
	 * 	Update Bytes2128891 with the passed value
	 *	@param value (String or char[])
	 */
	public void setBytes2128891(char[] value) throws CFException {
		 bytes2128891 = serializeBytes2128891(value);
	}
	/**
	 * 	Update Bytes2128891 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBytes2128891String(char[] value) throws CFException {
		 setBytes2128891(value);
	}
	/**
	 *	Returns the value of bytes2930891
	 *	@return bytes2930891
	 */
   public char[] getBytes2930891() throws CFException{
     if (isBytes2930891Modified()) { 
        bytes2930891 = refreshBytes2930891();
     }
   		return bytes2930891;
   }

  
	/**
	*  set variable bytes2930891
	*  Corresponding COBOL Variable is 891-BYTES-29-30
	*  @param value
	**/
   public void setBytes2930891(char[] value) {
      bytes2930891 = checkBytes2930891Constraints(value);
      serializeBytes2930891(bytes2930891);
   } 

     /**
	 * 	Update Bytes2930891 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBytes2930891(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBytes2930891,bytes2930891.length);
   	
   }
   
   public void setBytes2930891(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBytes2930891,bytes2930891.length);
   	
   }
   
     /**
	 * 	Update Bytes2930891 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBytes2930891(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBytes2930891+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bytes2930891 with another Field
	 *	@param value
	 */
   public void setBytes2930891(Field source) {
       replace(source,0,source.length(),beginBytes2930891,BYTES_2930891_LEN);
   	
   }  
   
     /**
	 * 	Update Bytes2930891 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBytes2930891(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBytes2930891,BYTES_2930891_LEN);
   	
   }
   
     /**
	 * 	Update Bytes2930891 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBytes2930891(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBytes2930891+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bytes3336891
	 *	@return bytes3336891
	 */
	public int getBytes3336891() throws CFException {
       if (isBytes3336891Modified()) { 
           bytes3336891 = refreshBytes3336891();
        }
   		return bytes3336891;
	}
	

	
	   
	/**
	 * 	Update Bytes3336891 with the passed value
	 *  Corresponding COBOL Variable is 891-BYTES-33-36
	 *	@param number
	 */
	public void setBytes3336891(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bytes3336891 = checkBytes3336891MaxLimit(number); 
		serializeBytes3336891(bytes3336891);
	}
	

	public void setBytes3336891(long number) {
	    number = checkBytes3336891MaxLimit(number); // Truncate if value is beyond +/- Max range
		setBytes3336891((int)number);
	}
	
	/**
	 * 	Update Bytes3336891 with the passed value
	 *	@param value (String or char[])
	 */
	public void setBytes3336891(char[] value) throws CFException {
		 bytes3336891 = serializeBytes3336891(value);
	}
	/**
	 * 	Update Bytes3336891 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBytes3336891String(char[] value) throws CFException {
		 setBytes3336891(value);
	}
	/**
	 *	Returns the value of bytes3738891
	 *	@return bytes3738891
	 */
   public char[] getBytes3738891() throws CFException{
     if (isBytes3738891Modified()) { 
        bytes3738891 = refreshBytes3738891();
     }
   		return bytes3738891;
   }

  
	/**
	*  set variable bytes3738891
	*  Corresponding COBOL Variable is 891-BYTES-37-38
	*  @param value
	**/
   public void setBytes3738891(char[] value) {
      bytes3738891 = checkBytes3738891Constraints(value);
      serializeBytes3738891(bytes3738891);
   } 

     /**
	 * 	Update Bytes3738891 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBytes3738891(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBytes3738891,bytes3738891.length);
   	
   }
   
   public void setBytes3738891(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBytes3738891,bytes3738891.length);
   	
   }
   
     /**
	 * 	Update Bytes3738891 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBytes3738891(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBytes3738891+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bytes3738891 with another Field
	 *	@param value
	 */
   public void setBytes3738891(Field source) {
       replace(source,0,source.length(),beginBytes3738891,BYTES_3738891_LEN);
   	
   }  
   
     /**
	 * 	Update Bytes3738891 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBytes3738891(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBytes3738891,BYTES_3738891_LEN);
   	
   }
   
     /**
	 * 	Update Bytes3738891 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBytes3738891(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBytes3738891+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bytes4143891
	 *	@return bytes4143891
	 */
	public int getBytes4143891() throws CFException {
       if (isBytes4143891Modified()) { 
           bytes4143891 = refreshBytes4143891();
        }
   		return bytes4143891;
	}
	

	
	   
	/**
	 * 	Update Bytes4143891 with the passed value
	 *  Corresponding COBOL Variable is 891-BYTES-41-43
	 *	@param number
	 */
	public void setBytes4143891(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bytes4143891 = checkBytes4143891MaxLimit(number); 
		serializeBytes4143891(bytes4143891);
	}
	

	public void setBytes4143891(long number) {
	    number = checkBytes4143891MaxLimit(number); // Truncate if value is beyond +/- Max range
		setBytes4143891((int)number);
	}
	
	/**
	 * 	Update Bytes4143891 with the passed value
	 *	@param value (String or char[])
	 */
	public void setBytes4143891(char[] value) throws CFException {
		 bytes4143891 = serializeBytes4143891(value);
	}
	/**
	 * 	Update Bytes4143891 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBytes4143891String(char[] value) throws CFException {
		 setBytes4143891(value);
	}

	
	
	

		public static int getDe125WorkAreaB891FieldLength() {
			return DE_125_WORK_AREA_B_891_LENGTH;
		}

}
  

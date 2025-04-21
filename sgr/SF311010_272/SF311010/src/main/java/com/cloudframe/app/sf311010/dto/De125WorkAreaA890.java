package com.cloudframe.app.sf311010.dto;

/**
*  The class De125WorkAreaA890 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class De125WorkAreaA890 extends De125WorkAreaA890Serialized { 
   

						private char[] bytes12890 = Field.fillLowValue(2);

								private long bytes516890;

						private char[] bytes1718890 = Field.fillLowValue(2);

								private long bytes2132890;

						private char[] bytes3334890 = Field.fillLowValue(2);

								private long bytes3744890;

						private char[] bytes4546890 = Field.fillLowValue(2);

								private long bytes4956890;

						private char[] bytes5758890 = Field.fillLowValue(2);

								private int bytes6164890;

						private char[] bytes6566890 = Field.fillLowValue(2);

								private int bytes6971890;

						private char[] bytes7273890 = Field.fillLowValue(2);

								private int bytes7678890;
	
	/**
	* Constructor for De125WorkAreaA890
	**/
    public De125WorkAreaA890() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for De125WorkAreaA890. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public De125WorkAreaA890(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bytes12890
	 *	@return bytes12890
	 */
   public char[] getBytes12890() throws CFException{
     if (isBytes12890Modified()) { 
        bytes12890 = refreshBytes12890();
     }
   		return bytes12890;
   }

  
	/**
	*  set variable bytes12890
	*  Corresponding COBOL Variable is 890-BYTES-1-2
	*  @param value
	**/
   public void setBytes12890(char[] value) {
      bytes12890 = checkBytes12890Constraints(value);
      serializeBytes12890(bytes12890);
   } 

     /**
	 * 	Update Bytes12890 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBytes12890(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBytes12890,bytes12890.length);
   	
   }
   
   public void setBytes12890(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBytes12890,bytes12890.length);
   	
   }
   
     /**
	 * 	Update Bytes12890 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBytes12890(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBytes12890+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bytes12890 with another Field
	 *	@param value
	 */
   public void setBytes12890(Field source) {
       replace(source,0,source.length(),beginBytes12890,BYTES_12890_LEN);
   	
   }  
   
     /**
	 * 	Update Bytes12890 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBytes12890(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBytes12890,BYTES_12890_LEN);
   	
   }
   
     /**
	 * 	Update Bytes12890 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBytes12890(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBytes12890+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bytes516890
	 *	@return bytes516890
	 */
	public long getBytes516890() throws CFException {
       if (isBytes516890Modified()) { 
           bytes516890 = refreshBytes516890();
        }
   		return bytes516890;
	}
	

	
	   
	/**
	 * 	Update Bytes516890 with the passed value
	 *  Corresponding COBOL Variable is 890-BYTES-5-16
	 *	@param number
	 */
	public void setBytes516890(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    bytes516890 = checkBytes516890MaxLimit(number); 
		serializeBytes516890(bytes516890);
	}
	

	/**
	 * 	Update Bytes516890 with the passed value
	 *	@param value (String or char[])
	 */
	public void setBytes516890(char[] value) throws CFException {
		 bytes516890 = serializeBytes516890(value);
	}
	/**
	 * 	Update Bytes516890 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBytes516890String(char[] value) throws CFException {
		 setBytes516890(value);
	}
	/**
	 *	Returns the value of bytes1718890
	 *	@return bytes1718890
	 */
   public char[] getBytes1718890() throws CFException{
     if (isBytes1718890Modified()) { 
        bytes1718890 = refreshBytes1718890();
     }
   		return bytes1718890;
   }

  
	/**
	*  set variable bytes1718890
	*  Corresponding COBOL Variable is 890-BYTES-17-18
	*  @param value
	**/
   public void setBytes1718890(char[] value) {
      bytes1718890 = checkBytes1718890Constraints(value);
      serializeBytes1718890(bytes1718890);
   } 

     /**
	 * 	Update Bytes1718890 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBytes1718890(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBytes1718890,bytes1718890.length);
   	
   }
   
   public void setBytes1718890(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBytes1718890,bytes1718890.length);
   	
   }
   
     /**
	 * 	Update Bytes1718890 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBytes1718890(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBytes1718890+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bytes1718890 with another Field
	 *	@param value
	 */
   public void setBytes1718890(Field source) {
       replace(source,0,source.length(),beginBytes1718890,BYTES_1718890_LEN);
   	
   }  
   
     /**
	 * 	Update Bytes1718890 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBytes1718890(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBytes1718890,BYTES_1718890_LEN);
   	
   }
   
     /**
	 * 	Update Bytes1718890 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBytes1718890(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBytes1718890+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bytes2132890
	 *	@return bytes2132890
	 */
	public long getBytes2132890() throws CFException {
       if (isBytes2132890Modified()) { 
           bytes2132890 = refreshBytes2132890();
        }
   		return bytes2132890;
	}
	

	
	   
	/**
	 * 	Update Bytes2132890 with the passed value
	 *  Corresponding COBOL Variable is 890-BYTES-21-32
	 *	@param number
	 */
	public void setBytes2132890(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    bytes2132890 = checkBytes2132890MaxLimit(number); 
		serializeBytes2132890(bytes2132890);
	}
	

	/**
	 * 	Update Bytes2132890 with the passed value
	 *	@param value (String or char[])
	 */
	public void setBytes2132890(char[] value) throws CFException {
		 bytes2132890 = serializeBytes2132890(value);
	}
	/**
	 * 	Update Bytes2132890 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBytes2132890String(char[] value) throws CFException {
		 setBytes2132890(value);
	}
	/**
	 *	Returns the value of bytes3334890
	 *	@return bytes3334890
	 */
   public char[] getBytes3334890() throws CFException{
     if (isBytes3334890Modified()) { 
        bytes3334890 = refreshBytes3334890();
     }
   		return bytes3334890;
   }

  
	/**
	*  set variable bytes3334890
	*  Corresponding COBOL Variable is 890-BYTES-33-34
	*  @param value
	**/
   public void setBytes3334890(char[] value) {
      bytes3334890 = checkBytes3334890Constraints(value);
      serializeBytes3334890(bytes3334890);
   } 

     /**
	 * 	Update Bytes3334890 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBytes3334890(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBytes3334890,bytes3334890.length);
   	
   }
   
   public void setBytes3334890(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBytes3334890,bytes3334890.length);
   	
   }
   
     /**
	 * 	Update Bytes3334890 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBytes3334890(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBytes3334890+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bytes3334890 with another Field
	 *	@param value
	 */
   public void setBytes3334890(Field source) {
       replace(source,0,source.length(),beginBytes3334890,BYTES_3334890_LEN);
   	
   }  
   
     /**
	 * 	Update Bytes3334890 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBytes3334890(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBytes3334890,BYTES_3334890_LEN);
   	
   }
   
     /**
	 * 	Update Bytes3334890 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBytes3334890(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBytes3334890+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bytes3744890
	 *	@return bytes3744890
	 */
	public long getBytes3744890() throws CFException {
       if (isBytes3744890Modified()) { 
           bytes3744890 = refreshBytes3744890();
        }
   		return bytes3744890;
	}
	

	
	   
	/**
	 * 	Update Bytes3744890 with the passed value
	 *  Corresponding COBOL Variable is 890-BYTES-37-44
	 *	@param number
	 */
	public void setBytes3744890(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    bytes3744890 = checkBytes3744890MaxLimit(number); 
		serializeBytes3744890(bytes3744890);
	}
	

	/**
	 * 	Update Bytes3744890 with the passed value
	 *	@param value (String or char[])
	 */
	public void setBytes3744890(char[] value) throws CFException {
		 bytes3744890 = serializeBytes3744890(value);
	}
	/**
	 * 	Update Bytes3744890 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBytes3744890String(char[] value) throws CFException {
		 setBytes3744890(value);
	}
	/**
	 *	Returns the value of bytes4546890
	 *	@return bytes4546890
	 */
   public char[] getBytes4546890() throws CFException{
     if (isBytes4546890Modified()) { 
        bytes4546890 = refreshBytes4546890();
     }
   		return bytes4546890;
   }

  
	/**
	*  set variable bytes4546890
	*  Corresponding COBOL Variable is 890-BYTES-45-46
	*  @param value
	**/
   public void setBytes4546890(char[] value) {
      bytes4546890 = checkBytes4546890Constraints(value);
      serializeBytes4546890(bytes4546890);
   } 

     /**
	 * 	Update Bytes4546890 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBytes4546890(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBytes4546890,bytes4546890.length);
   	
   }
   
   public void setBytes4546890(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBytes4546890,bytes4546890.length);
   	
   }
   
     /**
	 * 	Update Bytes4546890 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBytes4546890(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBytes4546890+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bytes4546890 with another Field
	 *	@param value
	 */
   public void setBytes4546890(Field source) {
       replace(source,0,source.length(),beginBytes4546890,BYTES_4546890_LEN);
   	
   }  
   
     /**
	 * 	Update Bytes4546890 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBytes4546890(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBytes4546890,BYTES_4546890_LEN);
   	
   }
   
     /**
	 * 	Update Bytes4546890 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBytes4546890(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBytes4546890+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bytes4956890
	 *	@return bytes4956890
	 */
	public long getBytes4956890() throws CFException {
       if (isBytes4956890Modified()) { 
           bytes4956890 = refreshBytes4956890();
        }
   		return bytes4956890;
	}
	

	
	   
	/**
	 * 	Update Bytes4956890 with the passed value
	 *  Corresponding COBOL Variable is 890-BYTES-49-56
	 *	@param number
	 */
	public void setBytes4956890(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    bytes4956890 = checkBytes4956890MaxLimit(number); 
		serializeBytes4956890(bytes4956890);
	}
	

	/**
	 * 	Update Bytes4956890 with the passed value
	 *	@param value (String or char[])
	 */
	public void setBytes4956890(char[] value) throws CFException {
		 bytes4956890 = serializeBytes4956890(value);
	}
	/**
	 * 	Update Bytes4956890 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBytes4956890String(char[] value) throws CFException {
		 setBytes4956890(value);
	}
	/**
	 *	Returns the value of bytes5758890
	 *	@return bytes5758890
	 */
   public char[] getBytes5758890() throws CFException{
     if (isBytes5758890Modified()) { 
        bytes5758890 = refreshBytes5758890();
     }
   		return bytes5758890;
   }

  
	/**
	*  set variable bytes5758890
	*  Corresponding COBOL Variable is 890-BYTES-57-58
	*  @param value
	**/
   public void setBytes5758890(char[] value) {
      bytes5758890 = checkBytes5758890Constraints(value);
      serializeBytes5758890(bytes5758890);
   } 

     /**
	 * 	Update Bytes5758890 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBytes5758890(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBytes5758890,bytes5758890.length);
   	
   }
   
   public void setBytes5758890(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBytes5758890,bytes5758890.length);
   	
   }
   
     /**
	 * 	Update Bytes5758890 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBytes5758890(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBytes5758890+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bytes5758890 with another Field
	 *	@param value
	 */
   public void setBytes5758890(Field source) {
       replace(source,0,source.length(),beginBytes5758890,BYTES_5758890_LEN);
   	
   }  
   
     /**
	 * 	Update Bytes5758890 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBytes5758890(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBytes5758890,BYTES_5758890_LEN);
   	
   }
   
     /**
	 * 	Update Bytes5758890 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBytes5758890(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBytes5758890+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bytes6164890
	 *	@return bytes6164890
	 */
	public int getBytes6164890() throws CFException {
       if (isBytes6164890Modified()) { 
           bytes6164890 = refreshBytes6164890();
        }
   		return bytes6164890;
	}
	

	
	   
	/**
	 * 	Update Bytes6164890 with the passed value
	 *  Corresponding COBOL Variable is 890-BYTES-61-64
	 *	@param number
	 */
	public void setBytes6164890(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bytes6164890 = checkBytes6164890MaxLimit(number); 
		serializeBytes6164890(bytes6164890);
	}
	

	public void setBytes6164890(long number) {
	    number = checkBytes6164890MaxLimit(number); // Truncate if value is beyond +/- Max range
		setBytes6164890((int)number);
	}
	
	/**
	 * 	Update Bytes6164890 with the passed value
	 *	@param value (String or char[])
	 */
	public void setBytes6164890(char[] value) throws CFException {
		 bytes6164890 = serializeBytes6164890(value);
	}
	/**
	 * 	Update Bytes6164890 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBytes6164890String(char[] value) throws CFException {
		 setBytes6164890(value);
	}
	/**
	 *	Returns the value of bytes6566890
	 *	@return bytes6566890
	 */
   public char[] getBytes6566890() throws CFException{
     if (isBytes6566890Modified()) { 
        bytes6566890 = refreshBytes6566890();
     }
   		return bytes6566890;
   }

  
	/**
	*  set variable bytes6566890
	*  Corresponding COBOL Variable is 890-BYTES-65-66
	*  @param value
	**/
   public void setBytes6566890(char[] value) {
      bytes6566890 = checkBytes6566890Constraints(value);
      serializeBytes6566890(bytes6566890);
   } 

     /**
	 * 	Update Bytes6566890 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBytes6566890(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBytes6566890,bytes6566890.length);
   	
   }
   
   public void setBytes6566890(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBytes6566890,bytes6566890.length);
   	
   }
   
     /**
	 * 	Update Bytes6566890 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBytes6566890(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBytes6566890+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bytes6566890 with another Field
	 *	@param value
	 */
   public void setBytes6566890(Field source) {
       replace(source,0,source.length(),beginBytes6566890,BYTES_6566890_LEN);
   	
   }  
   
     /**
	 * 	Update Bytes6566890 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBytes6566890(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBytes6566890,BYTES_6566890_LEN);
   	
   }
   
     /**
	 * 	Update Bytes6566890 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBytes6566890(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBytes6566890+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bytes6971890
	 *	@return bytes6971890
	 */
	public int getBytes6971890() throws CFException {
       if (isBytes6971890Modified()) { 
           bytes6971890 = refreshBytes6971890();
        }
   		return bytes6971890;
	}
	

	
	   
	/**
	 * 	Update Bytes6971890 with the passed value
	 *  Corresponding COBOL Variable is 890-BYTES-69-71
	 *	@param number
	 */
	public void setBytes6971890(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bytes6971890 = checkBytes6971890MaxLimit(number); 
		serializeBytes6971890(bytes6971890);
	}
	

	public void setBytes6971890(long number) {
	    number = checkBytes6971890MaxLimit(number); // Truncate if value is beyond +/- Max range
		setBytes6971890((int)number);
	}
	
	/**
	 * 	Update Bytes6971890 with the passed value
	 *	@param value (String or char[])
	 */
	public void setBytes6971890(char[] value) throws CFException {
		 bytes6971890 = serializeBytes6971890(value);
	}
	/**
	 * 	Update Bytes6971890 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBytes6971890String(char[] value) throws CFException {
		 setBytes6971890(value);
	}
	/**
	 *	Returns the value of bytes7273890
	 *	@return bytes7273890
	 */
   public char[] getBytes7273890() throws CFException{
     if (isBytes7273890Modified()) { 
        bytes7273890 = refreshBytes7273890();
     }
   		return bytes7273890;
   }

  
	/**
	*  set variable bytes7273890
	*  Corresponding COBOL Variable is 890-BYTES-72-73
	*  @param value
	**/
   public void setBytes7273890(char[] value) {
      bytes7273890 = checkBytes7273890Constraints(value);
      serializeBytes7273890(bytes7273890);
   } 

     /**
	 * 	Update Bytes7273890 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBytes7273890(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBytes7273890,bytes7273890.length);
   	
   }
   
   public void setBytes7273890(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBytes7273890,bytes7273890.length);
   	
   }
   
     /**
	 * 	Update Bytes7273890 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBytes7273890(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBytes7273890+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bytes7273890 with another Field
	 *	@param value
	 */
   public void setBytes7273890(Field source) {
       replace(source,0,source.length(),beginBytes7273890,BYTES_7273890_LEN);
   	
   }  
   
     /**
	 * 	Update Bytes7273890 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBytes7273890(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBytes7273890,BYTES_7273890_LEN);
   	
   }
   
     /**
	 * 	Update Bytes7273890 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBytes7273890(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBytes7273890+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bytes7678890
	 *	@return bytes7678890
	 */
	public int getBytes7678890() throws CFException {
       if (isBytes7678890Modified()) { 
           bytes7678890 = refreshBytes7678890();
        }
   		return bytes7678890;
	}
	

	
	   
	/**
	 * 	Update Bytes7678890 with the passed value
	 *  Corresponding COBOL Variable is 890-BYTES-76-78
	 *	@param number
	 */
	public void setBytes7678890(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bytes7678890 = checkBytes7678890MaxLimit(number); 
		serializeBytes7678890(bytes7678890);
	}
	

	public void setBytes7678890(long number) {
	    number = checkBytes7678890MaxLimit(number); // Truncate if value is beyond +/- Max range
		setBytes7678890((int)number);
	}
	
	/**
	 * 	Update Bytes7678890 with the passed value
	 *	@param value (String or char[])
	 */
	public void setBytes7678890(char[] value) throws CFException {
		 bytes7678890 = serializeBytes7678890(value);
	}
	/**
	 * 	Update Bytes7678890 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBytes7678890String(char[] value) throws CFException {
		 setBytes7678890(value);
	}

	
	
	

		public static int getDe125WorkAreaA890FieldLength() {
			return DE_125_WORK_AREA_A_890_LENGTH;
		}

}
  

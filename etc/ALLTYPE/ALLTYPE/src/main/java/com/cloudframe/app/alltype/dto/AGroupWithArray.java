package com.cloudframe.app.alltype.dto;

/**
*  The class AGroupWithArray is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:24. using version 5.0.0.257
**/


import com.cloudframe.app.alltype.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;
import java.math.RoundingMode;
import com.cloudframe.app.common.CONSTANTS;


public class AGroupWithArray extends AGroupWithArraySerialized { 
   
      private List<Short> aBinarySign1; 

      private List<Integer> aBinarySign2; 

      private List<Long> aBinarySign3; 

      private List<Integer> aBinaryUnsign1; 

      private List<Long> aBinaryUnsign2; 

      private List<Long> aBinaryUnsign3; 

      private List<Short> aDisplaySign1; 

      private List<Integer> aDisplaySign2; 

      private List<Long> aDisplaySign3; 

      private List<Integer> aDisplayUnsign1; 

      private List<Long> aDisplayUnsign2; 

      private List<Long> aDisplayUnsign3; 

      private List<Short> aPackedSign1; 

      private List<Integer> aPackedSign2; 

      private List<Long> aPackedSign3; 

      private List<Integer> aPackedUnsign1; 

      private List<Long> aPackedUnsign2; 

      private List<Long> aPackedUnsign3; 

      private List<BigDecimal> aDecBinarySign1; 

      private List<BigDecimal> aDecBinarySign2; 

      private List<BigDecimal> aDecBinarySign3; 

      private List<BigDecimal> aDecBinaryUnsign1; 

      private List<BigDecimal> aDecBinaryUnsign2; 

      private List<BigDecimal> aDecBinaryUnsign3; 

      private List<BigDecimal> aDecDisplaySign1; 

      private List<BigDecimal> aDecDisplaySign2; 

      private List<BigDecimal> aDecDisplaySign3; 

      private List<BigDecimal> aDecDisplayUnsign1; 

      private List<BigDecimal> aDecDisplayUnsign2; 

      private List<BigDecimal> aDecDisplayUnsign3; 

      private List<BigDecimal> aDecPackedSign1; 

      private List<BigDecimal> aDecPackedSign2; 

      private List<BigDecimal> aDecPackedSign3; 

      private List<BigDecimal> aDecPackedUnsign1; 

      private List<BigDecimal> aDecPackedUnsign2; 

      private List<BigDecimal> aDecPackedUnsign3; 

      private List<char[]> aChar; 

      private List<char[]> aCharJustRight; 

      private List<char[]> aCharZero; 

	
	/**
	* Constructor for AGroupWithArray
	**/
    public AGroupWithArray() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AGroupWithArray. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AGroupWithArray(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

    /**
	 *	Returns the value of aBinarySign1
	 *  Corresponding COBOL Variable is WS-A-BINARY-SIGN1
	 *	@return aBinarySign1
	 */
	public List<Short> getABinarySign1() throws CFException {
        List<Short>	list = new ArrayList<>();  
        for (int index =0;index < A_BINARY_SIGN_1_SIZE;index++) {
        	list.add( getABinarySign1( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return aBinarySign1
	 */
	public short getABinarySign1(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getABinarySign1(), resetting it to 0",index);
		    index = 0;
        } else if (index >= A_BINARY_SIGN_1_SIZE) {
             	index = A_BINARY_SIGN_1_SIZE -1; // can't exceed max array size
             	logger.trace("aBinarySign1 - Array index exceeded max Size {}, resetting it to max allowed",A_BINARY_SIGN_1_SIZE); 
	    }   
         return getShort(beginABinarySign1+ index*A_BINARY_SIGN_1_LEN);
   }
	
	/**
	 *	Update ABinarySign1 at index with the passed value
	 *  Corresponding COBOL Variable is WS-A-BINARY-SIGN1
	 *  @param index
	 *	@param number
	 */
	public void setABinarySign1(int index,short number) {
	   truncated = false; // reset left over truncated flag
		setABinarySign1(index,number, true);
	}
	
	public void setABinarySign1(int index,int number) {
		setABinarySign1(index,(short)number, true);
	}
	public void setABinarySign1(int index,long number) {
			setABinarySign1(index,(short)number, true);
	}
	
	/**
	 *	Update  ABinarySign1 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setABinarySign1(int index,short value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setABinarySign1(int, String, boolean), resetting it to 0",index);
		    index = 0;
        } else if (index >= A_BINARY_SIGN_1_SIZE) {
             	index = A_BINARY_SIGN_1_SIZE -1; // can't exceed max array size
             	logger.trace("aBinarySign1 - Array index exceeded max Size "+A_BINARY_SIGN_1_SIZE+", resetting it to max allowed"); 
	    }
	    //
        //	    
		if (setModified) {
			serializeABinarySign1(index,value);
		}
   }
    /**
	 *	Returns the value of aBinarySign2
	 *  Corresponding COBOL Variable is WS-A-BINARY-SIGN2
	 *	@return aBinarySign2
	 */
	public List<Integer> getABinarySign2() throws CFException {
        List<Integer>	list = new ArrayList<>();  
        for (int index =0;index < A_BINARY_SIGN_2_SIZE;index++) {
        	list.add( getABinarySign2( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return aBinarySign2
	 */
	public int getABinarySign2(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getABinarySign2(), resetting it to 0",index);
		    index = 0;
        } else if (index >= A_BINARY_SIGN_2_SIZE) {
             	index = A_BINARY_SIGN_2_SIZE -1; // can't exceed max array size
             	logger.trace("aBinarySign2 - Array index exceeded max Size {}, resetting it to max allowed",A_BINARY_SIGN_2_SIZE); 
	    }   
		return getInt(beginABinarySign2+ index*A_BINARY_SIGN_2_LEN);
   }
	
	/**
	 *	Update ABinarySign2 at index with the passed value
	 *  Corresponding COBOL Variable is WS-A-BINARY-SIGN2
	 *  @param index
	 *	@param number
	 */
	public void setABinarySign2(int index,int number) {
	   truncated = false; // reset left over truncated flag
		setABinarySign2(index,number, true);
	}
	
	public void setABinarySign2(int index,long number) {
			setABinarySign2(index,(int)number, true);
	}
	
	/**
	 *	Update  ABinarySign2 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setABinarySign2(int index,int value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setABinarySign2(int, String, boolean), resetting it to 0",index);
		    index = 0;
        } else if (index >= A_BINARY_SIGN_2_SIZE) {
             	index = A_BINARY_SIGN_2_SIZE -1; // can't exceed max array size
             	logger.trace("aBinarySign2 - Array index exceeded max Size "+A_BINARY_SIGN_2_SIZE+", resetting it to max allowed"); 
	    }
	    //
        //	    
		if (setModified) {
			serializeABinarySign2(index,value);
		}
   }
    /**
	 *	Returns the value of aBinarySign3
	 *  Corresponding COBOL Variable is WS-A-BINARY-SIGN3
	 *	@return aBinarySign3
	 */
	public List<Long> getABinarySign3() throws CFException {
        List<Long>	list = new ArrayList<>();  
        for (int index =0;index < A_BINARY_SIGN_3_SIZE;index++) {
        	list.add( getABinarySign3( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return aBinarySign3
	 */
	public long getABinarySign3(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getABinarySign3(), resetting it to 0",index);
		    index = 0;
        } else if (index >= A_BINARY_SIGN_3_SIZE) {
             	index = A_BINARY_SIGN_3_SIZE -1; // can't exceed max array size
             	logger.trace("aBinarySign3 - Array index exceeded max Size {}, resetting it to max allowed",A_BINARY_SIGN_3_SIZE); 
	    }   
		 return getLong(beginABinarySign3+ index*A_BINARY_SIGN_3_LEN);
   }
	
	/**
	 *	Update ABinarySign3 at index with the passed value
	 *  Corresponding COBOL Variable is WS-A-BINARY-SIGN3
	 *  @param index
	 *	@param number
	 */
	public void setABinarySign3(int index,long number) {
	   truncated = false; // reset left over truncated flag
		setABinarySign3(index,number, true);
	}
	
	/**
	 *	Update  ABinarySign3 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setABinarySign3(int index,long value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setABinarySign3(int, String, boolean), resetting it to 0",index);
		    index = 0;
        } else if (index >= A_BINARY_SIGN_3_SIZE) {
             	index = A_BINARY_SIGN_3_SIZE -1; // can't exceed max array size
             	logger.trace("aBinarySign3 - Array index exceeded max Size "+A_BINARY_SIGN_3_SIZE+", resetting it to max allowed"); 
	    }
	    //
        //	    
		if (setModified) {
			serializeABinarySign3(index,value);
		}
   }
    /**
	 *	Returns the value of aBinaryUnsign1
	 *  Corresponding COBOL Variable is WS-A-BINARY-UNSIGN1
	 *	@return aBinaryUnsign1
	 */
	public List<Integer> getABinaryUnsign1() throws CFException {
        List<Integer>	list = new ArrayList<>();  
        for (int index =0;index < A_BINARY_UNSIGN_1_SIZE;index++) {
        	list.add( getABinaryUnsign1( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return aBinaryUnsign1
	 */
	public int getABinaryUnsign1(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getABinaryUnsign1(), resetting it to 0",index);
		    index = 0;
        } else if (index >= A_BINARY_UNSIGN_1_SIZE) {
             	index = A_BINARY_UNSIGN_1_SIZE -1; // can't exceed max array size
             	logger.trace("aBinaryUnsign1 - Array index exceeded max Size {}, resetting it to max allowed",A_BINARY_UNSIGN_1_SIZE); 
	    }   
         return getShort(beginABinaryUnsign1+ index*A_BINARY_UNSIGN_1_LEN);
   }
	
	/**
	 *	Update ABinaryUnsign1 at index with the passed value
	 *  Corresponding COBOL Variable is WS-A-BINARY-UNSIGN1
	 *  @param index
	 *	@param number
	 */
	public void setABinaryUnsign1(int index,int number) {
	   truncated = false; // reset left over truncated flag
        number = ((number >  MAX_64K || number <  -MAX_64K ) ? (number & MAX_64K /*truncate*/) : number); // Max value 2^16 allowed for Unsigned short
        number = (number < 0 ? -number : number); // Only positive number allowed   
		setABinaryUnsign1(index,number, true);
	}
	
	public void setABinaryUnsign1(int index,long number) {
			setABinaryUnsign1(index,(int)number, true);
	}
	
	/**
	 *	Update  ABinaryUnsign1 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setABinaryUnsign1(int index,int value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setABinaryUnsign1(int, String, boolean), resetting it to 0",index);
		    index = 0;
        } else if (index >= A_BINARY_UNSIGN_1_SIZE) {
             	index = A_BINARY_UNSIGN_1_SIZE -1; // can't exceed max array size
             	logger.trace("aBinaryUnsign1 - Array index exceeded max Size "+A_BINARY_UNSIGN_1_SIZE+", resetting it to max allowed"); 
	    }
	    //
        //	    
		if (setModified) {
			serializeABinaryUnsign1(index,value);
		}
   }
    /**
	 *	Returns the value of aBinaryUnsign2
	 *  Corresponding COBOL Variable is WS-A-BINARY-UNSIGN2
	 *	@return aBinaryUnsign2
	 */
	public List<Long> getABinaryUnsign2() throws CFException {
        List<Long>	list = new ArrayList<>();  
        for (int index =0;index < A_BINARY_UNSIGN_2_SIZE;index++) {
        	list.add( getABinaryUnsign2( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return aBinaryUnsign2
	 */
	public long getABinaryUnsign2(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getABinaryUnsign2(), resetting it to 0",index);
		    index = 0;
        } else if (index >= A_BINARY_UNSIGN_2_SIZE) {
             	index = A_BINARY_UNSIGN_2_SIZE -1; // can't exceed max array size
             	logger.trace("aBinaryUnsign2 - Array index exceeded max Size {}, resetting it to max allowed",A_BINARY_UNSIGN_2_SIZE); 
	    }   
		return getInt(beginABinaryUnsign2+ index*A_BINARY_UNSIGN_2_LEN);
   }
	
	/**
	 *	Update ABinaryUnsign2 at index with the passed value
	 *  Corresponding COBOL Variable is WS-A-BINARY-UNSIGN2
	 *  @param index
	 *	@param number
	 */
	public void setABinaryUnsign2(int index,long number) {
	   truncated = false; // reset left over truncated flag
        number = ( (number >  MAX_4G || number <  -MAX_4G) ? (number & MAX_4G /*truncate*/) : number); // Max value 2^32 allowed for Unsigned int
        number = (number < 0 ? -number : number); // Only positive number allowed   
		setABinaryUnsign2(index,number, true);
	}
	
	/**
	 *	Update  ABinaryUnsign2 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setABinaryUnsign2(int index,long value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setABinaryUnsign2(int, String, boolean), resetting it to 0",index);
		    index = 0;
        } else if (index >= A_BINARY_UNSIGN_2_SIZE) {
             	index = A_BINARY_UNSIGN_2_SIZE -1; // can't exceed max array size
             	logger.trace("aBinaryUnsign2 - Array index exceeded max Size "+A_BINARY_UNSIGN_2_SIZE+", resetting it to max allowed"); 
	    }
	    //
        //	    
		if (setModified) {
			serializeABinaryUnsign2(index,value);
		}
   }
    /**
	 *	Returns the value of aBinaryUnsign3
	 *  Corresponding COBOL Variable is WS-A-BINARY-UNSIGN3
	 *	@return aBinaryUnsign3
	 */
	public List<Long> getABinaryUnsign3() throws CFException {
        List<Long>	list = new ArrayList<>();  
        for (int index =0;index < A_BINARY_UNSIGN_3_SIZE;index++) {
        	list.add( getABinaryUnsign3( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return aBinaryUnsign3
	 */
	public long getABinaryUnsign3(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getABinaryUnsign3(), resetting it to 0",index);
		    index = 0;
        } else if (index >= A_BINARY_UNSIGN_3_SIZE) {
             	index = A_BINARY_UNSIGN_3_SIZE -1; // can't exceed max array size
             	logger.trace("aBinaryUnsign3 - Array index exceeded max Size {}, resetting it to max allowed",A_BINARY_UNSIGN_3_SIZE); 
	    }   
		 return getLong(beginABinaryUnsign3+ index*A_BINARY_UNSIGN_3_LEN);
   }
	
	/**
	 *	Update ABinaryUnsign3 at index with the passed value
	 *  Corresponding COBOL Variable is WS-A-BINARY-UNSIGN3
	 *  @param index
	 *	@param number
	 */
	public void setABinaryUnsign3(int index,long number) {
	   truncated = false; // reset left over truncated flag
        number = (number < 0 ? -number : number); // Only positive number allowed   
		setABinaryUnsign3(index,number, true);
	}
	
	/**
	 *	Update  ABinaryUnsign3 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setABinaryUnsign3(int index,long value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setABinaryUnsign3(int, String, boolean), resetting it to 0",index);
		    index = 0;
        } else if (index >= A_BINARY_UNSIGN_3_SIZE) {
             	index = A_BINARY_UNSIGN_3_SIZE -1; // can't exceed max array size
             	logger.trace("aBinaryUnsign3 - Array index exceeded max Size "+A_BINARY_UNSIGN_3_SIZE+", resetting it to max allowed"); 
	    }
	    //
        //	    
		if (setModified) {
			serializeABinaryUnsign3(index,value);
		}
   }
    /**
	 *	Returns the value of aDisplaySign1
	 *  Corresponding COBOL Variable is WS-A-DISPLAY-SIGN1
	 *	@return aDisplaySign1
	 */
	public List<Short> getADisplaySign1() throws CFException {
        List<Short>	list = new ArrayList<>();  
        for (int index =0;index < A_DISPLAY_SIGN_1_SIZE;index++) {
        	list.add( getADisplaySign1( index) );
        }   
   		return list;
	}
     /**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return aDisplaySign1
	 */
	public short getADisplaySign1(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getADisplaySign1(), resetting it to 0",index);
		    index = 0;
        } else if (index >= A_DISPLAY_SIGN_1_SIZE) {
             	index = A_DISPLAY_SIGN_1_SIZE -1; // can't exceed max array size
             	logger.trace("aDisplaySign1 - Array index exceeded max Size {}, resetting it to max allowed",A_DISPLAY_SIGN_1_SIZE); 
	    }
			return 
			            getShortNumber( 
			                 beginADisplaySign1+ index*A_DISPLAY_SIGN_1_LEN 
			                ,A_DISPLAY_SIGN_1_LEN
			                ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)
			            ;
   	}
   
  	
	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param Integer 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean aDisplaySign1IsNumeric(int index) {
	    return isNumeric(56 + index*4 
	                    ,56 + (index+1)*4 
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);	    
	}

	/**
	 *  Returns String value of aDisplaySign1
     *  @param index	 
	 *  @return aDisplaySign1
	 */
	public char[] getADisplaySign1String(int index) {
	    return toCharArray( (beginADisplaySign1 + index*A_DISPLAY_SIGN_1_LEN) , A_DISPLAY_SIGN_1_LEN );
	}
	/**
	 *	Update ADisplaySign1 at index with the passed value
	 *  Corresponding COBOL Variable is WS-A-DISPLAY-SIGN1
	 *  @param index
	 *	@param number
	 */
	public void setADisplaySign1(int index,short number) {
	    truncated = false; // reset left over truncated flag
	    number = (number <= -MAX_10K || number >= MAX_10K) ? truncate(number,MAX_10K) : number;
		setADisplaySign1(index,number, true);
	}
	
	public void setADisplaySign1(int index, int number) {
	    number = (number <= -MAX_10K || number >= MAX_10K) ? truncate(number,MAX_10K) : number;
		setADisplaySign1(index,(short)number, true);
	}
	public void setADisplaySign1(int index,long number) {
		    number = (number <= -MAX_10K || number >= MAX_10K) ? truncate(number,MAX_10K) : number;
			setADisplaySign1(index,(short)number, true);
	}
	

	/**
	 *  Update ADisplaySign1 at index with the passed value
	 * 	This method accepts a number value as char[]
	 *  char[] can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 */
	public void setADisplaySign1(int index,char[] value) {
			setADisplaySign1(index,value, true);
	}
	
	/**
	 *	Update ADisplaySign1 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setADisplaySign1(int index,short value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setADisplaySign1(int,char[],boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= A_DISPLAY_SIGN_1_SIZE) {
             	index = A_DISPLAY_SIGN_1_SIZE -1; // can't exceed max array size
             	logger.trace("aDisplaySign1 - Array index exceeded max Size {}, resetting it to max allowed",A_DISPLAY_SIGN_1_SIZE); 
	    }
		if (setModified) {
			serializeADisplaySign1(index,value);
		}
   }

	/**
	 *  Update ADisplaySign1 at index with the passed value and serialize the object if setModified is true
	 * 	This method can accept a number value as char[]
	 *  char[] can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setADisplaySign1(int index,char[] value, boolean setModified) {
		if (setModified) {
			// serialize the value
			replaceValue(
			        padNumber(4,value,true/*isSigned?*/)
			       ,(beginADisplaySign1 + index*A_DISPLAY_SIGN_1_LEN)
			       ,A_DISPLAY_SIGN_1_LEN
			       );
		}
   }
    /**
	 *	Returns the value of aDisplaySign2
	 *  Corresponding COBOL Variable is WS-A-DISPLAY-SIGN2
	 *	@return aDisplaySign2
	 */
	public List<Integer> getADisplaySign2() throws CFException {
        List<Integer>	list = new ArrayList<>();  
        for (int index =0;index < A_DISPLAY_SIGN_2_SIZE;index++) {
        	list.add( getADisplaySign2( index) );
        }   
   		return list;
	}
     /**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return aDisplaySign2
	 */
	public int getADisplaySign2(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getADisplaySign2(), resetting it to 0",index);
		    index = 0;
        } else if (index >= A_DISPLAY_SIGN_2_SIZE) {
             	index = A_DISPLAY_SIGN_2_SIZE -1; // can't exceed max array size
             	logger.trace("aDisplaySign2 - Array index exceeded max Size {}, resetting it to max allowed",A_DISPLAY_SIGN_2_SIZE); 
	    }
			return 
			            getIntNumber( 
			                 beginADisplaySign2+ index*A_DISPLAY_SIGN_2_LEN 
			                ,A_DISPLAY_SIGN_2_LEN
			                ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)
			            ;
   	}
   
  	
	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param Integer 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean aDisplaySign2IsNumeric(int index) {
	    return isNumeric(64 + index*8 
	                    ,64 + (index+1)*8 
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);	    
	}

	/**
	 *  Returns String value of aDisplaySign2
     *  @param index	 
	 *  @return aDisplaySign2
	 */
	public char[] getADisplaySign2String(int index) {
	    return toCharArray( (beginADisplaySign2 + index*A_DISPLAY_SIGN_2_LEN) , A_DISPLAY_SIGN_2_LEN );
	}
	/**
	 *	Update ADisplaySign2 at index with the passed value
	 *  Corresponding COBOL Variable is WS-A-DISPLAY-SIGN2
	 *  @param index
	 *	@param number
	 */
	public void setADisplaySign2(int index,int number) {
	    truncated = false; // reset left over truncated flag
	    number = (number <= -MAX_100M || number >= MAX_100M) ? truncate(number,MAX_100M) : number;
		setADisplaySign2(index,number, true);
	}
	
	public void setADisplaySign2(int index,long number) {
		    number = (number <= -MAX_100M || number >= MAX_100M) ? truncate(number,MAX_100M) : number;
			setADisplaySign2(index,(int)number, true);
	}
	

	/**
	 *  Update ADisplaySign2 at index with the passed value
	 * 	This method accepts a number value as char[]
	 *  char[] can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 */
	public void setADisplaySign2(int index,char[] value) {
			setADisplaySign2(index,value, true);
	}
	
	/**
	 *	Update ADisplaySign2 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setADisplaySign2(int index,int value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setADisplaySign2(int,char[],boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= A_DISPLAY_SIGN_2_SIZE) {
             	index = A_DISPLAY_SIGN_2_SIZE -1; // can't exceed max array size
             	logger.trace("aDisplaySign2 - Array index exceeded max Size {}, resetting it to max allowed",A_DISPLAY_SIGN_2_SIZE); 
	    }
		if (setModified) {
			serializeADisplaySign2(index,value);
		}
   }

	/**
	 *  Update ADisplaySign2 at index with the passed value and serialize the object if setModified is true
	 * 	This method can accept a number value as char[]
	 *  char[] can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setADisplaySign2(int index,char[] value, boolean setModified) {
		if (setModified) {
			// serialize the value
			replaceValue(
			        padNumber(8,value,true/*isSigned?*/)
			       ,(beginADisplaySign2 + index*A_DISPLAY_SIGN_2_LEN)
			       ,A_DISPLAY_SIGN_2_LEN
			       );
		}
   }
    /**
	 *	Returns the value of aDisplaySign3
	 *  Corresponding COBOL Variable is WS-A-DISPLAY-SIGN3
	 *	@return aDisplaySign3
	 */
	public List<Long> getADisplaySign3() throws CFException {
        List<Long>	list = new ArrayList<>();  
        for (int index =0;index < A_DISPLAY_SIGN_3_SIZE;index++) {
        	list.add( getADisplaySign3( index) );
        }   
   		return list;
	}
     /**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return aDisplaySign3
	 */
	public long getADisplaySign3(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getADisplaySign3(), resetting it to 0",index);
		    index = 0;
        } else if (index >= A_DISPLAY_SIGN_3_SIZE) {
             	index = A_DISPLAY_SIGN_3_SIZE -1; // can't exceed max array size
             	logger.trace("aDisplaySign3 - Array index exceeded max Size {}, resetting it to max allowed",A_DISPLAY_SIGN_3_SIZE); 
	    }
			return 
			            getLongNumber( 
			                 beginADisplaySign3+ index*A_DISPLAY_SIGN_3_LEN 
			                ,A_DISPLAY_SIGN_3_LEN
			                ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)
			            ;
   	}
   
  	
	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param Integer 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean aDisplaySign3IsNumeric(int index) {
	    return isNumeric(80 + index*10 
	                    ,80 + (index+1)*10 
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);	    
	}

	/**
	 *  Returns String value of aDisplaySign3
     *  @param index	 
	 *  @return aDisplaySign3
	 */
	public char[] getADisplaySign3String(int index) {
	    return toCharArray( (beginADisplaySign3 + index*A_DISPLAY_SIGN_3_LEN) , A_DISPLAY_SIGN_3_LEN );
	}
	/**
	 *	Update ADisplaySign3 at index with the passed value
	 *  Corresponding COBOL Variable is WS-A-DISPLAY-SIGN3
	 *  @param index
	 *	@param number
	 */
	public void setADisplaySign3(int index,long number) {
	    truncated = false; // reset left over truncated flag
	    number = (number <= -MAX_10G || number >= MAX_10G) ? truncate(number,MAX_10G) : number;
		setADisplaySign3(index,number, true);
	}
	

	/**
	 *  Update ADisplaySign3 at index with the passed value
	 * 	This method accepts a number value as char[]
	 *  char[] can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 */
	public void setADisplaySign3(int index,char[] value) {
			setADisplaySign3(index,value, true);
	}
	
	/**
	 *	Update ADisplaySign3 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setADisplaySign3(int index,long value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setADisplaySign3(int,char[],boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= A_DISPLAY_SIGN_3_SIZE) {
             	index = A_DISPLAY_SIGN_3_SIZE -1; // can't exceed max array size
             	logger.trace("aDisplaySign3 - Array index exceeded max Size {}, resetting it to max allowed",A_DISPLAY_SIGN_3_SIZE); 
	    }
		if (setModified) {
			serializeADisplaySign3(index,value);
		}
   }

	/**
	 *  Update ADisplaySign3 at index with the passed value and serialize the object if setModified is true
	 * 	This method can accept a number value as char[]
	 *  char[] can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setADisplaySign3(int index,char[] value, boolean setModified) {
		if (setModified) {
			// serialize the value
			replaceValue(
			        padNumber(10,value,true/*isSigned?*/)
			       ,(beginADisplaySign3 + index*A_DISPLAY_SIGN_3_LEN)
			       ,A_DISPLAY_SIGN_3_LEN
			       );
		}
   }
    /**
	 *	Returns the value of aDisplayUnsign1
	 *  Corresponding COBOL Variable is WS-A-DISPLAY-UNSIGN1
	 *	@return aDisplayUnsign1
	 */
	public List<Integer> getADisplayUnsign1() throws CFException {
        List<Integer>	list = new ArrayList<>();  
        for (int index =0;index < A_DISPLAY_UNSIGN_1_SIZE;index++) {
        	list.add( getADisplayUnsign1( index) );
        }   
   		return list;
	}
     /**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return aDisplayUnsign1
	 */
	public int getADisplayUnsign1(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getADisplayUnsign1(), resetting it to 0",index);
		    index = 0;
        } else if (index >= A_DISPLAY_UNSIGN_1_SIZE) {
             	index = A_DISPLAY_UNSIGN_1_SIZE -1; // can't exceed max array size
             	logger.trace("aDisplayUnsign1 - Array index exceeded max Size {}, resetting it to max allowed",A_DISPLAY_UNSIGN_1_SIZE); 
	    }
			return 
			            getIntNumber( 
			                 beginADisplayUnsign1+ index*A_DISPLAY_UNSIGN_1_LEN 
			                ,A_DISPLAY_UNSIGN_1_LEN
			                ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)
			            ;
   	}
   
  	
	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param Integer 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean aDisplayUnsign1IsNumeric(int index) {
	    return isNumeric(100 + index*4 
	                    ,100 + (index+1)*4 
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);	    
	}

	/**
	 *  Returns String value of aDisplayUnsign1
     *  @param index	 
	 *  @return aDisplayUnsign1
	 */
	public char[] getADisplayUnsign1String(int index) {
	    return toCharArray( (beginADisplayUnsign1 + index*A_DISPLAY_UNSIGN_1_LEN) , A_DISPLAY_UNSIGN_1_LEN );
	}
	/**
	 *	Update ADisplayUnsign1 at index with the passed value
	 *  Corresponding COBOL Variable is WS-A-DISPLAY-UNSIGN1
	 *  @param index
	 *	@param number
	 */
	public void setADisplayUnsign1(int index,int number) {
	    truncated = false; // reset left over truncated flag
	    number = (number <= -MAX_10K || number >= MAX_10K) ? truncate(number,MAX_10K) : number;
        number = (number < 0 ? -number : number); // Only positive number allowed     
		setADisplayUnsign1(index,number, true);
	}
	
	public void setADisplayUnsign1(int index,long number) {
		    number = (number <= -MAX_10K || number >= MAX_10K) ? truncate(number,MAX_10K) : number;
			setADisplayUnsign1(index,(int)number, true);
	}
	

	/**
	 *  Update ADisplayUnsign1 at index with the passed value
	 * 	This method accepts a number value as char[]
	 *  char[] can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 */
	public void setADisplayUnsign1(int index,char[] value) {
			setADisplayUnsign1(index,value, true);
	}
	
	/**
	 *	Update ADisplayUnsign1 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setADisplayUnsign1(int index,int value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setADisplayUnsign1(int,char[],boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= A_DISPLAY_UNSIGN_1_SIZE) {
             	index = A_DISPLAY_UNSIGN_1_SIZE -1; // can't exceed max array size
             	logger.trace("aDisplayUnsign1 - Array index exceeded max Size {}, resetting it to max allowed",A_DISPLAY_UNSIGN_1_SIZE); 
	    }
		if (setModified) {
			serializeADisplayUnsign1(index,value);
		}
   }

	/**
	 *  Update ADisplayUnsign1 at index with the passed value and serialize the object if setModified is true
	 * 	This method can accept a number value as char[]
	 *  char[] can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setADisplayUnsign1(int index,char[] value, boolean setModified) {
		if (setModified) {
			// serialize the value
			replaceValue(
			        padNumber(4,value,false/*isSigned?*/)
			       ,(beginADisplayUnsign1 + index*A_DISPLAY_UNSIGN_1_LEN)
			       ,A_DISPLAY_UNSIGN_1_LEN
			       );
		}
   }
    /**
	 *	Returns the value of aDisplayUnsign2
	 *  Corresponding COBOL Variable is WS-A-DISPLAY-UNSIGN2
	 *	@return aDisplayUnsign2
	 */
	public List<Long> getADisplayUnsign2() throws CFException {
        List<Long>	list = new ArrayList<>();  
        for (int index =0;index < A_DISPLAY_UNSIGN_2_SIZE;index++) {
        	list.add( getADisplayUnsign2( index) );
        }   
   		return list;
	}
     /**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return aDisplayUnsign2
	 */
	public long getADisplayUnsign2(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getADisplayUnsign2(), resetting it to 0",index);
		    index = 0;
        } else if (index >= A_DISPLAY_UNSIGN_2_SIZE) {
             	index = A_DISPLAY_UNSIGN_2_SIZE -1; // can't exceed max array size
             	logger.trace("aDisplayUnsign2 - Array index exceeded max Size {}, resetting it to max allowed",A_DISPLAY_UNSIGN_2_SIZE); 
	    }
			return 
			            getLongNumber( 
			                 beginADisplayUnsign2+ index*A_DISPLAY_UNSIGN_2_LEN 
			                ,A_DISPLAY_UNSIGN_2_LEN
			                ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)
			            ;
   	}
   
  	
	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param Integer 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean aDisplayUnsign2IsNumeric(int index) {
	    return isNumeric(108 + index*8 
	                    ,108 + (index+1)*8 
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);	    
	}

	/**
	 *  Returns String value of aDisplayUnsign2
     *  @param index	 
	 *  @return aDisplayUnsign2
	 */
	public char[] getADisplayUnsign2String(int index) {
	    return toCharArray( (beginADisplayUnsign2 + index*A_DISPLAY_UNSIGN_2_LEN) , A_DISPLAY_UNSIGN_2_LEN );
	}
	/**
	 *	Update ADisplayUnsign2 at index with the passed value
	 *  Corresponding COBOL Variable is WS-A-DISPLAY-UNSIGN2
	 *  @param index
	 *	@param number
	 */
	public void setADisplayUnsign2(int index,long number) {
	    truncated = false; // reset left over truncated flag
	    number = (number <= -MAX_100M || number >= MAX_100M) ? truncate(number,MAX_100M) : number;
        number = (number < 0 ? -number : number); // Only positive number allowed     
		setADisplayUnsign2(index,number, true);
	}
	

	/**
	 *  Update ADisplayUnsign2 at index with the passed value
	 * 	This method accepts a number value as char[]
	 *  char[] can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 */
	public void setADisplayUnsign2(int index,char[] value) {
			setADisplayUnsign2(index,value, true);
	}
	
	/**
	 *	Update ADisplayUnsign2 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setADisplayUnsign2(int index,long value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setADisplayUnsign2(int,char[],boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= A_DISPLAY_UNSIGN_2_SIZE) {
             	index = A_DISPLAY_UNSIGN_2_SIZE -1; // can't exceed max array size
             	logger.trace("aDisplayUnsign2 - Array index exceeded max Size {}, resetting it to max allowed",A_DISPLAY_UNSIGN_2_SIZE); 
	    }
		if (setModified) {
			serializeADisplayUnsign2(index,value);
		}
   }

	/**
	 *  Update ADisplayUnsign2 at index with the passed value and serialize the object if setModified is true
	 * 	This method can accept a number value as char[]
	 *  char[] can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setADisplayUnsign2(int index,char[] value, boolean setModified) {
		if (setModified) {
			// serialize the value
			replaceValue(
			        padNumber(8,value,false/*isSigned?*/)
			       ,(beginADisplayUnsign2 + index*A_DISPLAY_UNSIGN_2_LEN)
			       ,A_DISPLAY_UNSIGN_2_LEN
			       );
		}
   }
    /**
	 *	Returns the value of aDisplayUnsign3
	 *  Corresponding COBOL Variable is WS-A-DISPLAY-UNSIGN3
	 *	@return aDisplayUnsign3
	 */
	public List<Long> getADisplayUnsign3() throws CFException {
        List<Long>	list = new ArrayList<>();  
        for (int index =0;index < A_DISPLAY_UNSIGN_3_SIZE;index++) {
        	list.add( getADisplayUnsign3( index) );
        }   
   		return list;
	}
     /**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return aDisplayUnsign3
	 */
	public long getADisplayUnsign3(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getADisplayUnsign3(), resetting it to 0",index);
		    index = 0;
        } else if (index >= A_DISPLAY_UNSIGN_3_SIZE) {
             	index = A_DISPLAY_UNSIGN_3_SIZE -1; // can't exceed max array size
             	logger.trace("aDisplayUnsign3 - Array index exceeded max Size {}, resetting it to max allowed",A_DISPLAY_UNSIGN_3_SIZE); 
	    }
			return 
			            getLongNumber( 
			                 beginADisplayUnsign3+ index*A_DISPLAY_UNSIGN_3_LEN 
			                ,A_DISPLAY_UNSIGN_3_LEN
			                ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)
			            ;
   	}
   
  	
	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param Integer 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean aDisplayUnsign3IsNumeric(int index) {
	    return isNumeric(124 + index*10 
	                    ,124 + (index+1)*10 
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);	    
	}

	/**
	 *  Returns String value of aDisplayUnsign3
     *  @param index	 
	 *  @return aDisplayUnsign3
	 */
	public char[] getADisplayUnsign3String(int index) {
	    return toCharArray( (beginADisplayUnsign3 + index*A_DISPLAY_UNSIGN_3_LEN) , A_DISPLAY_UNSIGN_3_LEN );
	}
	/**
	 *	Update ADisplayUnsign3 at index with the passed value
	 *  Corresponding COBOL Variable is WS-A-DISPLAY-UNSIGN3
	 *  @param index
	 *	@param number
	 */
	public void setADisplayUnsign3(int index,long number) {
	    truncated = false; // reset left over truncated flag
	    number = (number <= -MAX_10G || number >= MAX_10G) ? truncate(number,MAX_10G) : number;
        number = (number < 0 ? -number : number); // Only positive number allowed     
		setADisplayUnsign3(index,number, true);
	}
	

	/**
	 *  Update ADisplayUnsign3 at index with the passed value
	 * 	This method accepts a number value as char[]
	 *  char[] can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 */
	public void setADisplayUnsign3(int index,char[] value) {
			setADisplayUnsign3(index,value, true);
	}
	
	/**
	 *	Update ADisplayUnsign3 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setADisplayUnsign3(int index,long value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setADisplayUnsign3(int,char[],boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= A_DISPLAY_UNSIGN_3_SIZE) {
             	index = A_DISPLAY_UNSIGN_3_SIZE -1; // can't exceed max array size
             	logger.trace("aDisplayUnsign3 - Array index exceeded max Size {}, resetting it to max allowed",A_DISPLAY_UNSIGN_3_SIZE); 
	    }
		if (setModified) {
			serializeADisplayUnsign3(index,value);
		}
   }

	/**
	 *  Update ADisplayUnsign3 at index with the passed value and serialize the object if setModified is true
	 * 	This method can accept a number value as char[]
	 *  char[] can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setADisplayUnsign3(int index,char[] value, boolean setModified) {
		if (setModified) {
			// serialize the value
			replaceValue(
			        padNumber(10,value,false/*isSigned?*/)
			       ,(beginADisplayUnsign3 + index*A_DISPLAY_UNSIGN_3_LEN)
			       ,A_DISPLAY_UNSIGN_3_LEN
			       );
		}
   }
    /**
	 *	Returns the value of aPackedSign1
	 *  Corresponding COBOL Variable is WS-A-PACKED-SIGN1
	 *	@return aPackedSign1
	 */
	public List<Short> getAPackedSign1() throws CFException {
        List<Short>	list = new ArrayList<>();  
        for (int index =0;index < A_PACKED_SIGN_1_SIZE;index++) {
        	list.add( getAPackedSign1( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position from this list.
	 *  @param index
	 *	@return aPackedSign1
	 */
	public short getAPackedSign1(int index) throws CFException {
		if (index < 0) {
		    logger.trace("Array index was {} for getAPackedSign1(), resetting it to 0",index);
		    index = 0;
        } else if (index >= A_PACKED_SIGN_1_SIZE) {
             	index = A_PACKED_SIGN_1_SIZE -1; // can't exceed max array size
             	logger.trace("aPackedSign1 - Array index exceeded max Size {}, resetting it to max allowed",A_PACKED_SIGN_1_SIZE); 
	    }
		try {
		return 
		getShortDecimal(
		 beginAPackedSign1+ index*A_PACKED_SIGN_1_LEN ,
		 A_PACKED_SIGN_1_LEN);
		} catch (Exception ex) {
			throw getSoc7ABend("aPackedSign1", beginAPackedSign1+ index*A_PACKED_SIGN_1_LEN ,A_PACKED_SIGN_1_LEN);
		}
   }
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param index 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean aPackedSign1IsNumeric(int index) {
	    return decimalIsNumeric( beginAPackedSign1+ index*A_PACKED_SIGN_1_LEN ,A_PACKED_SIGN_1_LEN);
	}
	/**
	 * 	Set value at the index passed
	 *  Corresponding COBOL Variable is WS-A-PACKED-SIGN1
	 *  @param index
	 *	@param number
	 */
	public void setAPackedSign1(int index,short number) {
	    truncated = false; // reset left over truncated flag
	    number = (number <= -MAX_10K || number >= MAX_10K) ? truncate(number,MAX_10K) : number;
		setAPackedSign1(index,number, true);
	}
	
	public void setAPackedSign1(int index, int number) {
	    number = (number <= -MAX_10K || number >= MAX_10K) ? truncate(number,MAX_10K) : number;
		setAPackedSign1(index,(short)number, true);
	}
	public void setAPackedSign1(int index,long number) {
		    number = (number <= -MAX_10K || number >= MAX_10K) ? truncate(number,MAX_10K) : number;
			setAPackedSign1(index,(short)number, true);
	}
	
	/**
	 * 	Set value at the index passed and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - use this if we want to serialize as string
	 */
	private void setAPackedSign1(int index,short value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setAPackedSign1(int,String,boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= A_PACKED_SIGN_1_SIZE) {
             	index = A_PACKED_SIGN_1_SIZE -1; // can't exceed max array size
             	logger.trace("aPackedSign1 - Array index exceeded max Size {}, resetting it to max allowed",A_PACKED_SIGN_1_SIZE); 
	    }
		if (setModified) {
			serializeAPackedSign1(index,value);
		}
   }

    /**
	 *	Returns the value of aPackedSign2
	 *  Corresponding COBOL Variable is WS-A-PACKED-SIGN2
	 *	@return aPackedSign2
	 */
	public List<Integer> getAPackedSign2() throws CFException {
        List<Integer>	list = new ArrayList<>();  
        for (int index =0;index < A_PACKED_SIGN_2_SIZE;index++) {
        	list.add( getAPackedSign2( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position from this list.
	 *  @param index
	 *	@return aPackedSign2
	 */
	public int getAPackedSign2(int index) throws CFException {
		if (index < 0) {
		    logger.trace("Array index was {} for getAPackedSign2(), resetting it to 0",index);
		    index = 0;
        } else if (index >= A_PACKED_SIGN_2_SIZE) {
             	index = A_PACKED_SIGN_2_SIZE -1; // can't exceed max array size
             	logger.trace("aPackedSign2 - Array index exceeded max Size {}, resetting it to max allowed",A_PACKED_SIGN_2_SIZE); 
	    }
		try {
		return 
		getIntDecimal(
		 beginAPackedSign2+ index*A_PACKED_SIGN_2_LEN ,
		 A_PACKED_SIGN_2_LEN);
		} catch (Exception ex) {
			throw getSoc7ABend("aPackedSign2", beginAPackedSign2+ index*A_PACKED_SIGN_2_LEN ,A_PACKED_SIGN_2_LEN);
		}
   }
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param index 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean aPackedSign2IsNumeric(int index) {
	    return decimalIsNumeric( beginAPackedSign2+ index*A_PACKED_SIGN_2_LEN ,A_PACKED_SIGN_2_LEN);
	}
	/**
	 * 	Set value at the index passed
	 *  Corresponding COBOL Variable is WS-A-PACKED-SIGN2
	 *  @param index
	 *	@param number
	 */
	public void setAPackedSign2(int index,int number) {
	    truncated = false; // reset left over truncated flag
	    number = (number <= -MAX_100M || number >= MAX_100M) ? truncate(number,MAX_100M) : number;
		setAPackedSign2(index,number, true);
	}
	
	public void setAPackedSign2(int index,long number) {
		    number = (number <= -MAX_100M || number >= MAX_100M) ? truncate(number,MAX_100M) : number;
			setAPackedSign2(index,(int)number, true);
	}
	
	/**
	 * 	Set value at the index passed and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - use this if we want to serialize as string
	 */
	private void setAPackedSign2(int index,int value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setAPackedSign2(int,String,boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= A_PACKED_SIGN_2_SIZE) {
             	index = A_PACKED_SIGN_2_SIZE -1; // can't exceed max array size
             	logger.trace("aPackedSign2 - Array index exceeded max Size {}, resetting it to max allowed",A_PACKED_SIGN_2_SIZE); 
	    }
		if (setModified) {
			serializeAPackedSign2(index,value);
		}
   }

    /**
	 *	Returns the value of aPackedSign3
	 *  Corresponding COBOL Variable is WS-A-PACKED-SIGN3
	 *	@return aPackedSign3
	 */
	public List<Long> getAPackedSign3() throws CFException {
        List<Long>	list = new ArrayList<>();  
        for (int index =0;index < A_PACKED_SIGN_3_SIZE;index++) {
        	list.add( getAPackedSign3( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position from this list.
	 *  @param index
	 *	@return aPackedSign3
	 */
	public long getAPackedSign3(int index) throws CFException {
		if (index < 0) {
		    logger.trace("Array index was {} for getAPackedSign3(), resetting it to 0",index);
		    index = 0;
        } else if (index >= A_PACKED_SIGN_3_SIZE) {
             	index = A_PACKED_SIGN_3_SIZE -1; // can't exceed max array size
             	logger.trace("aPackedSign3 - Array index exceeded max Size {}, resetting it to max allowed",A_PACKED_SIGN_3_SIZE); 
	    }
		try {
		return 
		getLongDecimal(
		 beginAPackedSign3+ index*A_PACKED_SIGN_3_LEN ,
		 A_PACKED_SIGN_3_LEN);
		} catch (Exception ex) {
			throw getSoc7ABend("aPackedSign3", beginAPackedSign3+ index*A_PACKED_SIGN_3_LEN ,A_PACKED_SIGN_3_LEN);
		}
   }
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param index 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean aPackedSign3IsNumeric(int index) {
	    return decimalIsNumeric( beginAPackedSign3+ index*A_PACKED_SIGN_3_LEN ,A_PACKED_SIGN_3_LEN);
	}
	/**
	 * 	Set value at the index passed
	 *  Corresponding COBOL Variable is WS-A-PACKED-SIGN3
	 *  @param index
	 *	@param number
	 */
	public void setAPackedSign3(int index,long number) {
	    truncated = false; // reset left over truncated flag
	    number = (number <= -MAX_10G || number >= MAX_10G) ? truncate(number,MAX_10G) : number;
		setAPackedSign3(index,number, true);
	}
	
	/**
	 * 	Set value at the index passed and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - use this if we want to serialize as string
	 */
	private void setAPackedSign3(int index,long value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setAPackedSign3(int,String,boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= A_PACKED_SIGN_3_SIZE) {
             	index = A_PACKED_SIGN_3_SIZE -1; // can't exceed max array size
             	logger.trace("aPackedSign3 - Array index exceeded max Size {}, resetting it to max allowed",A_PACKED_SIGN_3_SIZE); 
	    }
		if (setModified) {
			serializeAPackedSign3(index,value);
		}
   }

    /**
	 *	Returns the value of aPackedUnsign1
	 *  Corresponding COBOL Variable is WS-A-PACKED-UNSIGN1
	 *	@return aPackedUnsign1
	 */
	public List<Integer> getAPackedUnsign1() throws CFException {
        List<Integer>	list = new ArrayList<>();  
        for (int index =0;index < A_PACKED_UNSIGN_1_SIZE;index++) {
        	list.add( getAPackedUnsign1( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position from this list.
	 *  @param index
	 *	@return aPackedUnsign1
	 */
	public int getAPackedUnsign1(int index) throws CFException {
		if (index < 0) {
		    logger.trace("Array index was {} for getAPackedUnsign1(), resetting it to 0",index);
		    index = 0;
        } else if (index >= A_PACKED_UNSIGN_1_SIZE) {
             	index = A_PACKED_UNSIGN_1_SIZE -1; // can't exceed max array size
             	logger.trace("aPackedUnsign1 - Array index exceeded max Size {}, resetting it to max allowed",A_PACKED_UNSIGN_1_SIZE); 
	    }
		try {
		return 
		getIntDecimal(
		 beginAPackedUnsign1+ index*A_PACKED_UNSIGN_1_LEN ,
		 A_PACKED_UNSIGN_1_LEN);
		} catch (Exception ex) {
			throw getSoc7ABend("aPackedUnsign1", beginAPackedUnsign1+ index*A_PACKED_UNSIGN_1_LEN ,A_PACKED_UNSIGN_1_LEN);
		}
   }
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param index 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean aPackedUnsign1IsNumeric(int index) {
	    return decimalIsNumeric( beginAPackedUnsign1+ index*A_PACKED_UNSIGN_1_LEN ,A_PACKED_UNSIGN_1_LEN);
	}
	/**
	 * 	Set value at the index passed
	 *  Corresponding COBOL Variable is WS-A-PACKED-UNSIGN1
	 *  @param index
	 *	@param number
	 */
	public void setAPackedUnsign1(int index,int number) {
	    truncated = false; // reset left over truncated flag
	    number = (number <= -MAX_10K || number >= MAX_10K) ? truncate(number,MAX_10K) : number;
        number = (number < 0 ? -number : number); // Only positive number allowed     
		setAPackedUnsign1(index,number, true);
	}
	
	public void setAPackedUnsign1(int index,long number) {
		    number = (number <= -MAX_10K || number >= MAX_10K) ? truncate(number,MAX_10K) : number;
			setAPackedUnsign1(index,(int)number, true);
	}
	
	/**
	 * 	Set value at the index passed and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - use this if we want to serialize as string
	 */
	private void setAPackedUnsign1(int index,int value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setAPackedUnsign1(int,String,boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= A_PACKED_UNSIGN_1_SIZE) {
             	index = A_PACKED_UNSIGN_1_SIZE -1; // can't exceed max array size
             	logger.trace("aPackedUnsign1 - Array index exceeded max Size {}, resetting it to max allowed",A_PACKED_UNSIGN_1_SIZE); 
	    }
		if (setModified) {
			serializeAPackedUnsign1(index,value);
		}
   }

    /**
	 *	Returns the value of aPackedUnsign2
	 *  Corresponding COBOL Variable is WS-A-PACKED-UNSIGN2
	 *	@return aPackedUnsign2
	 */
	public List<Long> getAPackedUnsign2() throws CFException {
        List<Long>	list = new ArrayList<>();  
        for (int index =0;index < A_PACKED_UNSIGN_2_SIZE;index++) {
        	list.add( getAPackedUnsign2( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position from this list.
	 *  @param index
	 *	@return aPackedUnsign2
	 */
	public long getAPackedUnsign2(int index) throws CFException {
		if (index < 0) {
		    logger.trace("Array index was {} for getAPackedUnsign2(), resetting it to 0",index);
		    index = 0;
        } else if (index >= A_PACKED_UNSIGN_2_SIZE) {
             	index = A_PACKED_UNSIGN_2_SIZE -1; // can't exceed max array size
             	logger.trace("aPackedUnsign2 - Array index exceeded max Size {}, resetting it to max allowed",A_PACKED_UNSIGN_2_SIZE); 
	    }
		try {
		return 
		getLongDecimal(
		 beginAPackedUnsign2+ index*A_PACKED_UNSIGN_2_LEN ,
		 A_PACKED_UNSIGN_2_LEN);
		} catch (Exception ex) {
			throw getSoc7ABend("aPackedUnsign2", beginAPackedUnsign2+ index*A_PACKED_UNSIGN_2_LEN ,A_PACKED_UNSIGN_2_LEN);
		}
   }
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param index 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean aPackedUnsign2IsNumeric(int index) {
	    return decimalIsNumeric( beginAPackedUnsign2+ index*A_PACKED_UNSIGN_2_LEN ,A_PACKED_UNSIGN_2_LEN);
	}
	/**
	 * 	Set value at the index passed
	 *  Corresponding COBOL Variable is WS-A-PACKED-UNSIGN2
	 *  @param index
	 *	@param number
	 */
	public void setAPackedUnsign2(int index,long number) {
	    truncated = false; // reset left over truncated flag
	    number = (number <= -MAX_100M || number >= MAX_100M) ? truncate(number,MAX_100M) : number;
        number = (number < 0 ? -number : number); // Only positive number allowed     
		setAPackedUnsign2(index,number, true);
	}
	
	/**
	 * 	Set value at the index passed and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - use this if we want to serialize as string
	 */
	private void setAPackedUnsign2(int index,long value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setAPackedUnsign2(int,String,boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= A_PACKED_UNSIGN_2_SIZE) {
             	index = A_PACKED_UNSIGN_2_SIZE -1; // can't exceed max array size
             	logger.trace("aPackedUnsign2 - Array index exceeded max Size {}, resetting it to max allowed",A_PACKED_UNSIGN_2_SIZE); 
	    }
		if (setModified) {
			serializeAPackedUnsign2(index,value);
		}
   }

    /**
	 *	Returns the value of aPackedUnsign3
	 *  Corresponding COBOL Variable is WS-A-PACKED-UNSIGN3
	 *	@return aPackedUnsign3
	 */
	public List<Long> getAPackedUnsign3() throws CFException {
        List<Long>	list = new ArrayList<>();  
        for (int index =0;index < A_PACKED_UNSIGN_3_SIZE;index++) {
        	list.add( getAPackedUnsign3( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position from this list.
	 *  @param index
	 *	@return aPackedUnsign3
	 */
	public long getAPackedUnsign3(int index) throws CFException {
		if (index < 0) {
		    logger.trace("Array index was {} for getAPackedUnsign3(), resetting it to 0",index);
		    index = 0;
        } else if (index >= A_PACKED_UNSIGN_3_SIZE) {
             	index = A_PACKED_UNSIGN_3_SIZE -1; // can't exceed max array size
             	logger.trace("aPackedUnsign3 - Array index exceeded max Size {}, resetting it to max allowed",A_PACKED_UNSIGN_3_SIZE); 
	    }
		try {
		return 
		getLongDecimal(
		 beginAPackedUnsign3+ index*A_PACKED_UNSIGN_3_LEN ,
		 A_PACKED_UNSIGN_3_LEN);
		} catch (Exception ex) {
			throw getSoc7ABend("aPackedUnsign3", beginAPackedUnsign3+ index*A_PACKED_UNSIGN_3_LEN ,A_PACKED_UNSIGN_3_LEN);
		}
   }
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param index 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean aPackedUnsign3IsNumeric(int index) {
	    return decimalIsNumeric( beginAPackedUnsign3+ index*A_PACKED_UNSIGN_3_LEN ,A_PACKED_UNSIGN_3_LEN);
	}
	/**
	 * 	Set value at the index passed
	 *  Corresponding COBOL Variable is WS-A-PACKED-UNSIGN3
	 *  @param index
	 *	@param number
	 */
	public void setAPackedUnsign3(int index,long number) {
	    truncated = false; // reset left over truncated flag
	    number = (number <= -MAX_10G || number >= MAX_10G) ? truncate(number,MAX_10G) : number;
        number = (number < 0 ? -number : number); // Only positive number allowed     
		setAPackedUnsign3(index,number, true);
	}
	
	/**
	 * 	Set value at the index passed and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - use this if we want to serialize as string
	 */
	private void setAPackedUnsign3(int index,long value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setAPackedUnsign3(int,String,boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= A_PACKED_UNSIGN_3_SIZE) {
             	index = A_PACKED_UNSIGN_3_SIZE -1; // can't exceed max array size
             	logger.trace("aPackedUnsign3 - Array index exceeded max Size {}, resetting it to max allowed",A_PACKED_UNSIGN_3_SIZE); 
	    }
		if (setModified) {
			serializeAPackedUnsign3(index,value);
		}
   }

    /**
	 *	Returns the value of aDecBinarySign1
	 *  Corresponding COBOL Variable is WS-A-DEC-BINARY-SIGN1
	 *	@return aDecBinarySign1
	 */
	public List<BigDecimal> getADecBinarySign1() throws CFException {
        List<BigDecimal>	list = new ArrayList<>();  
        for (int index =0;index < A_DEC_BINARY_SIGN_1_SIZE;index++) {
        	list.add( getADecBinarySign1( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return aDecBinarySign1
	 */
	public BigDecimal getADecBinarySign1(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getADecBinarySign1(), resetting it to 0",index);
		    index = 0;
        } else if (index >= A_DEC_BINARY_SIGN_1_SIZE) {
             	index = A_DEC_BINARY_SIGN_1_SIZE -1; // can't exceed max array size
             	logger.trace("aDecBinarySign1 - Array index exceeded max Size {}, resetting it to max allowed",A_DEC_BINARY_SIGN_1_SIZE); 
	    }
			   return BigDecimal.valueOf(getShort(beginADecBinarySign1+ index*A_DEC_BINARY_SIGN_1_LEN)).movePointLeft(A_DEC_BINARY_SIGN_1_SCALE);
   }
	
	/**
	 *	Update ADecBinarySign1 at index with the passed value
     *  Corresponding COBOL Variable is WS-A-DEC-BINARY-SIGN1
	 *  @param index
	 *	@param number
	 */
	public void setADecBinarySign1(int index,BigDecimal number) {
		setADecBinarySign1(index,number, true);
	}

	/**
	 *	Update ADecBinarySign1 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param boolean
	 */
	private void setADecBinarySign1(int index,BigDecimal value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setADecBinarySign1(int, String, boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= A_DEC_BINARY_SIGN_1_SIZE) {
             	index = A_DEC_BINARY_SIGN_1_SIZE -1; // can't exceed max array size
             	logger.trace("aDecBinarySign1 - Array index exceeded max Size {}, resetting it to max allowed",A_DEC_BINARY_SIGN_1_SIZE); 
	    }
	    truncated = false; // reset left over truncated flag
        value = value.setScale(2,RoundingMode.DOWN);
	    if (value.precision() > 3) value =   truncate(value,3) ;
		if (setModified) {
			serializeADecBinarySign1(index,value);
		}
   }
    /**
	 *	Returns the value of aDecBinarySign2
	 *  Corresponding COBOL Variable is WS-A-DEC-BINARY-SIGN2
	 *	@return aDecBinarySign2
	 */
	public List<BigDecimal> getADecBinarySign2() throws CFException {
        List<BigDecimal>	list = new ArrayList<>();  
        for (int index =0;index < A_DEC_BINARY_SIGN_2_SIZE;index++) {
        	list.add( getADecBinarySign2( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return aDecBinarySign2
	 */
	public BigDecimal getADecBinarySign2(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getADecBinarySign2(), resetting it to 0",index);
		    index = 0;
        } else if (index >= A_DEC_BINARY_SIGN_2_SIZE) {
             	index = A_DEC_BINARY_SIGN_2_SIZE -1; // can't exceed max array size
             	logger.trace("aDecBinarySign2 - Array index exceeded max Size {}, resetting it to max allowed",A_DEC_BINARY_SIGN_2_SIZE); 
	    }
			   return BigDecimal.valueOf(getInt(beginADecBinarySign2+ index*A_DEC_BINARY_SIGN_2_LEN)).movePointLeft(A_DEC_BINARY_SIGN_2_SCALE);
   }
	
	/**
	 *	Update ADecBinarySign2 at index with the passed value
     *  Corresponding COBOL Variable is WS-A-DEC-BINARY-SIGN2
	 *  @param index
	 *	@param number
	 */
	public void setADecBinarySign2(int index,BigDecimal number) {
		setADecBinarySign2(index,number, true);
	}

	/**
	 *	Update ADecBinarySign2 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param boolean
	 */
	private void setADecBinarySign2(int index,BigDecimal value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setADecBinarySign2(int, String, boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= A_DEC_BINARY_SIGN_2_SIZE) {
             	index = A_DEC_BINARY_SIGN_2_SIZE -1; // can't exceed max array size
             	logger.trace("aDecBinarySign2 - Array index exceeded max Size {}, resetting it to max allowed",A_DEC_BINARY_SIGN_2_SIZE); 
	    }
	    truncated = false; // reset left over truncated flag
        value = value.setScale(7,RoundingMode.DOWN);
	    if (value.precision() > 8) value =   truncate(value,8) ;
		if (setModified) {
			serializeADecBinarySign2(index,value);
		}
   }
    /**
	 *	Returns the value of aDecBinarySign3
	 *  Corresponding COBOL Variable is WS-A-DEC-BINARY-SIGN3
	 *	@return aDecBinarySign3
	 */
	public List<BigDecimal> getADecBinarySign3() throws CFException {
        List<BigDecimal>	list = new ArrayList<>();  
        for (int index =0;index < A_DEC_BINARY_SIGN_3_SIZE;index++) {
        	list.add( getADecBinarySign3( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return aDecBinarySign3
	 */
	public BigDecimal getADecBinarySign3(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getADecBinarySign3(), resetting it to 0",index);
		    index = 0;
        } else if (index >= A_DEC_BINARY_SIGN_3_SIZE) {
             	index = A_DEC_BINARY_SIGN_3_SIZE -1; // can't exceed max array size
             	logger.trace("aDecBinarySign3 - Array index exceeded max Size {}, resetting it to max allowed",A_DEC_BINARY_SIGN_3_SIZE); 
	    }
			   return BigDecimal.valueOf(getLong(beginADecBinarySign3+ index*A_DEC_BINARY_SIGN_3_LEN)).movePointLeft(A_DEC_BINARY_SIGN_3_SCALE);
   }
	
	/**
	 *	Update ADecBinarySign3 at index with the passed value
     *  Corresponding COBOL Variable is WS-A-DEC-BINARY-SIGN3
	 *  @param index
	 *	@param number
	 */
	public void setADecBinarySign3(int index,BigDecimal number) {
		setADecBinarySign3(index,number, true);
	}

	/**
	 *	Update ADecBinarySign3 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param boolean
	 */
	private void setADecBinarySign3(int index,BigDecimal value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setADecBinarySign3(int, String, boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= A_DEC_BINARY_SIGN_3_SIZE) {
             	index = A_DEC_BINARY_SIGN_3_SIZE -1; // can't exceed max array size
             	logger.trace("aDecBinarySign3 - Array index exceeded max Size {}, resetting it to max allowed",A_DEC_BINARY_SIGN_3_SIZE); 
	    }
	    truncated = false; // reset left over truncated flag
        value = value.setScale(9,RoundingMode.DOWN);
	    if (value.precision() > 10) value =   truncate(value,10) ;
		if (setModified) {
			serializeADecBinarySign3(index,value);
		}
   }
    /**
	 *	Returns the value of aDecBinaryUnsign1
	 *  Corresponding COBOL Variable is WS-A-DEC-BINARY-UNSIGN1
	 *	@return aDecBinaryUnsign1
	 */
	public List<BigDecimal> getADecBinaryUnsign1() throws CFException {
        List<BigDecimal>	list = new ArrayList<>();  
        for (int index =0;index < A_DEC_BINARY_UNSIGN_1_SIZE;index++) {
        	list.add( getADecBinaryUnsign1( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return aDecBinaryUnsign1
	 */
	public BigDecimal getADecBinaryUnsign1(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getADecBinaryUnsign1(), resetting it to 0",index);
		    index = 0;
        } else if (index >= A_DEC_BINARY_UNSIGN_1_SIZE) {
             	index = A_DEC_BINARY_UNSIGN_1_SIZE -1; // can't exceed max array size
             	logger.trace("aDecBinaryUnsign1 - Array index exceeded max Size {}, resetting it to max allowed",A_DEC_BINARY_UNSIGN_1_SIZE); 
	    }
			   return BigDecimal.valueOf(getShort(beginADecBinaryUnsign1+ index*A_DEC_BINARY_UNSIGN_1_LEN)).movePointLeft(A_DEC_BINARY_UNSIGN_1_SCALE);
   }
	
	/**
	 *	Update ADecBinaryUnsign1 at index with the passed value
     *  Corresponding COBOL Variable is WS-A-DEC-BINARY-UNSIGN1
	 *  @param index
	 *	@param number
	 */
	public void setADecBinaryUnsign1(int index,BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
		setADecBinaryUnsign1(index,number, true);
	}

	/**
	 *	Update ADecBinaryUnsign1 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param boolean
	 */
	private void setADecBinaryUnsign1(int index,BigDecimal value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setADecBinaryUnsign1(int, String, boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= A_DEC_BINARY_UNSIGN_1_SIZE) {
             	index = A_DEC_BINARY_UNSIGN_1_SIZE -1; // can't exceed max array size
             	logger.trace("aDecBinaryUnsign1 - Array index exceeded max Size {}, resetting it to max allowed",A_DEC_BINARY_UNSIGN_1_SIZE); 
	    }
	    truncated = false; // reset left over truncated flag
        value = value.setScale(2,RoundingMode.DOWN);
	    if (value.precision() > 3) value =   truncate(value,3) ;
		if (setModified) {
			serializeADecBinaryUnsign1(index,value);
		}
   }
    /**
	 *	Returns the value of aDecBinaryUnsign2
	 *  Corresponding COBOL Variable is WS-A-DEC-BINARY-UNSIGN2
	 *	@return aDecBinaryUnsign2
	 */
	public List<BigDecimal> getADecBinaryUnsign2() throws CFException {
        List<BigDecimal>	list = new ArrayList<>();  
        for (int index =0;index < A_DEC_BINARY_UNSIGN_2_SIZE;index++) {
        	list.add( getADecBinaryUnsign2( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return aDecBinaryUnsign2
	 */
	public BigDecimal getADecBinaryUnsign2(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getADecBinaryUnsign2(), resetting it to 0",index);
		    index = 0;
        } else if (index >= A_DEC_BINARY_UNSIGN_2_SIZE) {
             	index = A_DEC_BINARY_UNSIGN_2_SIZE -1; // can't exceed max array size
             	logger.trace("aDecBinaryUnsign2 - Array index exceeded max Size {}, resetting it to max allowed",A_DEC_BINARY_UNSIGN_2_SIZE); 
	    }
			   return BigDecimal.valueOf(getInt(beginADecBinaryUnsign2+ index*A_DEC_BINARY_UNSIGN_2_LEN)).movePointLeft(A_DEC_BINARY_UNSIGN_2_SCALE);
   }
	
	/**
	 *	Update ADecBinaryUnsign2 at index with the passed value
     *  Corresponding COBOL Variable is WS-A-DEC-BINARY-UNSIGN2
	 *  @param index
	 *	@param number
	 */
	public void setADecBinaryUnsign2(int index,BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
		setADecBinaryUnsign2(index,number, true);
	}

	/**
	 *	Update ADecBinaryUnsign2 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param boolean
	 */
	private void setADecBinaryUnsign2(int index,BigDecimal value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setADecBinaryUnsign2(int, String, boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= A_DEC_BINARY_UNSIGN_2_SIZE) {
             	index = A_DEC_BINARY_UNSIGN_2_SIZE -1; // can't exceed max array size
             	logger.trace("aDecBinaryUnsign2 - Array index exceeded max Size {}, resetting it to max allowed",A_DEC_BINARY_UNSIGN_2_SIZE); 
	    }
	    truncated = false; // reset left over truncated flag
        value = value.setScale(6,RoundingMode.DOWN);
	    if (value.precision() > 7) value =   truncate(value,7) ;
		if (setModified) {
			serializeADecBinaryUnsign2(index,value);
		}
   }
    /**
	 *	Returns the value of aDecBinaryUnsign3
	 *  Corresponding COBOL Variable is WS-A-DEC-BINARY-UNSIGN3
	 *	@return aDecBinaryUnsign3
	 */
	public List<BigDecimal> getADecBinaryUnsign3() throws CFException {
        List<BigDecimal>	list = new ArrayList<>();  
        for (int index =0;index < A_DEC_BINARY_UNSIGN_3_SIZE;index++) {
        	list.add( getADecBinaryUnsign3( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return aDecBinaryUnsign3
	 */
	public BigDecimal getADecBinaryUnsign3(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getADecBinaryUnsign3(), resetting it to 0",index);
		    index = 0;
        } else if (index >= A_DEC_BINARY_UNSIGN_3_SIZE) {
             	index = A_DEC_BINARY_UNSIGN_3_SIZE -1; // can't exceed max array size
             	logger.trace("aDecBinaryUnsign3 - Array index exceeded max Size {}, resetting it to max allowed",A_DEC_BINARY_UNSIGN_3_SIZE); 
	    }
			   return BigDecimal.valueOf(getLong(beginADecBinaryUnsign3+ index*A_DEC_BINARY_UNSIGN_3_LEN)).movePointLeft(A_DEC_BINARY_UNSIGN_3_SCALE);
   }
	
	/**
	 *	Update ADecBinaryUnsign3 at index with the passed value
     *  Corresponding COBOL Variable is WS-A-DEC-BINARY-UNSIGN3
	 *  @param index
	 *	@param number
	 */
	public void setADecBinaryUnsign3(int index,BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
		setADecBinaryUnsign3(index,number, true);
	}

	/**
	 *	Update ADecBinaryUnsign3 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param boolean
	 */
	private void setADecBinaryUnsign3(int index,BigDecimal value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setADecBinaryUnsign3(int, String, boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= A_DEC_BINARY_UNSIGN_3_SIZE) {
             	index = A_DEC_BINARY_UNSIGN_3_SIZE -1; // can't exceed max array size
             	logger.trace("aDecBinaryUnsign3 - Array index exceeded max Size {}, resetting it to max allowed",A_DEC_BINARY_UNSIGN_3_SIZE); 
	    }
	    truncated = false; // reset left over truncated flag
        value = value.setScale(9,RoundingMode.DOWN);
	    if (value.precision() > 10) value =   truncate(value,10) ;
		if (setModified) {
			serializeADecBinaryUnsign3(index,value);
		}
   }
    /**
	 *	Returns the value of aDecDisplaySign1
	 *  Corresponding COBOL Variable is WS-A-DEC-DISPLAY-SIGN1
	 *	@return aDecDisplaySign1
	 */
	public List<BigDecimal> getADecDisplaySign1() throws CFException {
        List<BigDecimal>	list = new ArrayList<>();  
        for (int index =0;index < A_DEC_DISPLAY_SIGN_1_SIZE;index++) {
        	list.add( getADecDisplaySign1( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return aDecDisplaySign1
	 */
	public BigDecimal getADecDisplaySign1(int index) throws CFException {
	try {
		if (index < 0) {
		    logger.trace("Array index was {} for getADecDisplaySign1(), resetting it to 0",index);
		    index = 0;
        } else if (index >= A_DEC_DISPLAY_SIGN_1_SIZE) {
             	index = A_DEC_DISPLAY_SIGN_1_SIZE -1; // can't exceed max array size
             	logger.trace("aDecDisplaySign1 - Array index exceeded max Size {}, resetting it to max allowed",A_DEC_DISPLAY_SIGN_1_SIZE); 
	    }
			return 
			           getDecimalNumber( 
			                  beginADecDisplaySign1+ index*A_DEC_DISPLAY_SIGN_1_LEN 
			                 ,A_DEC_DISPLAY_SIGN_1_LEN
			                 ,A_DEC_DISPLAY_SIGN_1_SCALE
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              
			           ;
	} catch(Exception ex) {
    		throw getSoc7ABend("aDecDisplaySign1", beginADecDisplaySign1+ index*A_DEC_DISPLAY_SIGN_1_LEN,A_DEC_DISPLAY_SIGN_1_LEN);
    	}			           
   }
   

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param index
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean aDecDisplaySign1IsNumeric(int index) {
	    return isNumeric(256 + index*3 
	                    ,256 + (index+1)*3 
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);	    
	}


	/**
	 *  Returns String value of aDecDisplaySign1
     *  @param index
	 *  @return aDecDisplaySign1
	 */
	public char[] getADecDisplaySign1String(int index) {
	      return toCharArray( (beginADecDisplaySign1 + index*A_DEC_DISPLAY_SIGN_1_LEN) , A_DEC_DISPLAY_SIGN_1_LEN );
	}

	/**
	 *	Update ADecDisplaySign1 at index with the passed value
	 *  Corresponding COBOL Variable is WS-A-DEC-DISPLAY-SIGN1
	 *  @param index
	 *	@param number
	 */
	public void setADecDisplaySign1(int index,BigDecimal number) {
		setADecDisplaySign1(index,number, true);
	}

	 /**
	 *	Update ADecDisplaySign1 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setADecDisplaySign1(int index,BigDecimal value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setADecDisplaySign1(int,String,boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= A_DEC_DISPLAY_SIGN_1_SIZE) {
             	index = A_DEC_DISPLAY_SIGN_1_SIZE -1; // can't exceed max array size
             	logger.trace("aDecDisplaySign1 - Array index exceeded max Size {}, resetting it to max allowed",A_DEC_DISPLAY_SIGN_1_SIZE); 
	    }
       	//        
        truncated = false; // reset left over truncated flag
        value = value.setScale(2,RoundingMode.DOWN);
	    if (value.precision() > 3) value =   truncate(value,3) ;
		if (setModified) {
			serializeADecDisplaySign1(index,value);
		}
   }
   
   	/**
	 *  Update ADecDisplaySign1 at index with the passed value
	 * 	This method accepts a number value as String
	 *  String can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 */
	public void setADecDisplaySign1(int index,String value) {
			setADecDisplaySign1(index,value, true);
	}

	/**
	 *  Update ADecDisplaySign1 at index with the passed value and serialize the object if setModified is true
	 * 	This method can accept a number value as String
	 *  String can also be in a format that COBOL, 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setADecDisplaySign1(int index,String value, boolean setModified) { 
		if (setModified) {
			// serialize the value
			replaceValue(
			        padNumber(3,value,true/*isSigned?*/)
			       ,(beginADecDisplaySign1 + index*A_DEC_DISPLAY_SIGN_1_LEN)
			       ,A_DEC_DISPLAY_SIGN_1_LEN
			       );	
                      			
		}
   }
    /**
	 *	Returns the value of aDecDisplaySign2
	 *  Corresponding COBOL Variable is WS-A-DEC-DISPLAY-SIGN2
	 *	@return aDecDisplaySign2
	 */
	public List<BigDecimal> getADecDisplaySign2() throws CFException {
        List<BigDecimal>	list = new ArrayList<>();  
        for (int index =0;index < A_DEC_DISPLAY_SIGN_2_SIZE;index++) {
        	list.add( getADecDisplaySign2( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return aDecDisplaySign2
	 */
	public BigDecimal getADecDisplaySign2(int index) throws CFException {
	try {
		if (index < 0) {
		    logger.trace("Array index was {} for getADecDisplaySign2(), resetting it to 0",index);
		    index = 0;
        } else if (index >= A_DEC_DISPLAY_SIGN_2_SIZE) {
             	index = A_DEC_DISPLAY_SIGN_2_SIZE -1; // can't exceed max array size
             	logger.trace("aDecDisplaySign2 - Array index exceeded max Size {}, resetting it to max allowed",A_DEC_DISPLAY_SIGN_2_SIZE); 
	    }
			return 
			           getDecimalNumber( 
			                  beginADecDisplaySign2+ index*A_DEC_DISPLAY_SIGN_2_LEN 
			                 ,A_DEC_DISPLAY_SIGN_2_LEN
			                 ,A_DEC_DISPLAY_SIGN_2_SCALE
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              
			           ;
	} catch(Exception ex) {
    		throw getSoc7ABend("aDecDisplaySign2", beginADecDisplaySign2+ index*A_DEC_DISPLAY_SIGN_2_LEN,A_DEC_DISPLAY_SIGN_2_LEN);
    	}			           
   }
   

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param index
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean aDecDisplaySign2IsNumeric(int index) {
	    return isNumeric(262 + index*8 
	                    ,262 + (index+1)*8 
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);	    
	}


	/**
	 *  Returns String value of aDecDisplaySign2
     *  @param index
	 *  @return aDecDisplaySign2
	 */
	public char[] getADecDisplaySign2String(int index) {
	      return toCharArray( (beginADecDisplaySign2 + index*A_DEC_DISPLAY_SIGN_2_LEN) , A_DEC_DISPLAY_SIGN_2_LEN );
	}

	/**
	 *	Update ADecDisplaySign2 at index with the passed value
	 *  Corresponding COBOL Variable is WS-A-DEC-DISPLAY-SIGN2
	 *  @param index
	 *	@param number
	 */
	public void setADecDisplaySign2(int index,BigDecimal number) {
		setADecDisplaySign2(index,number, true);
	}

	 /**
	 *	Update ADecDisplaySign2 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setADecDisplaySign2(int index,BigDecimal value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setADecDisplaySign2(int,String,boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= A_DEC_DISPLAY_SIGN_2_SIZE) {
             	index = A_DEC_DISPLAY_SIGN_2_SIZE -1; // can't exceed max array size
             	logger.trace("aDecDisplaySign2 - Array index exceeded max Size {}, resetting it to max allowed",A_DEC_DISPLAY_SIGN_2_SIZE); 
	    }
       	//        
        truncated = false; // reset left over truncated flag
        value = value.setScale(7,RoundingMode.DOWN);
	    if (value.precision() > 8) value =   truncate(value,8) ;
		if (setModified) {
			serializeADecDisplaySign2(index,value);
		}
   }
   
   	/**
	 *  Update ADecDisplaySign2 at index with the passed value
	 * 	This method accepts a number value as String
	 *  String can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 */
	public void setADecDisplaySign2(int index,String value) {
			setADecDisplaySign2(index,value, true);
	}

	/**
	 *  Update ADecDisplaySign2 at index with the passed value and serialize the object if setModified is true
	 * 	This method can accept a number value as String
	 *  String can also be in a format that COBOL, 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setADecDisplaySign2(int index,String value, boolean setModified) { 
		if (setModified) {
			// serialize the value
			replaceValue(
			        padNumber(8,value,true/*isSigned?*/)
			       ,(beginADecDisplaySign2 + index*A_DEC_DISPLAY_SIGN_2_LEN)
			       ,A_DEC_DISPLAY_SIGN_2_LEN
			       );	
                      			
		}
   }
    /**
	 *	Returns the value of aDecDisplaySign3
	 *  Corresponding COBOL Variable is WS-A-DEC-DISPLAY-SIGN3
	 *	@return aDecDisplaySign3
	 */
	public List<BigDecimal> getADecDisplaySign3() throws CFException {
        List<BigDecimal>	list = new ArrayList<>();  
        for (int index =0;index < A_DEC_DISPLAY_SIGN_3_SIZE;index++) {
        	list.add( getADecDisplaySign3( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return aDecDisplaySign3
	 */
	public BigDecimal getADecDisplaySign3(int index) throws CFException {
	try {
		if (index < 0) {
		    logger.trace("Array index was {} for getADecDisplaySign3(), resetting it to 0",index);
		    index = 0;
        } else if (index >= A_DEC_DISPLAY_SIGN_3_SIZE) {
             	index = A_DEC_DISPLAY_SIGN_3_SIZE -1; // can't exceed max array size
             	logger.trace("aDecDisplaySign3 - Array index exceeded max Size {}, resetting it to max allowed",A_DEC_DISPLAY_SIGN_3_SIZE); 
	    }
			return 
			           getDecimalNumber( 
			                  beginADecDisplaySign3+ index*A_DEC_DISPLAY_SIGN_3_LEN 
			                 ,A_DEC_DISPLAY_SIGN_3_LEN
			                 ,A_DEC_DISPLAY_SIGN_3_SCALE
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              
			           ;
	} catch(Exception ex) {
    		throw getSoc7ABend("aDecDisplaySign3", beginADecDisplaySign3+ index*A_DEC_DISPLAY_SIGN_3_LEN,A_DEC_DISPLAY_SIGN_3_LEN);
    	}			           
   }
   

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param index
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean aDecDisplaySign3IsNumeric(int index) {
	    return isNumeric(278 + index*10 
	                    ,278 + (index+1)*10 
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);	    
	}


	/**
	 *  Returns String value of aDecDisplaySign3
     *  @param index
	 *  @return aDecDisplaySign3
	 */
	public char[] getADecDisplaySign3String(int index) {
	      return toCharArray( (beginADecDisplaySign3 + index*A_DEC_DISPLAY_SIGN_3_LEN) , A_DEC_DISPLAY_SIGN_3_LEN );
	}

	/**
	 *	Update ADecDisplaySign3 at index with the passed value
	 *  Corresponding COBOL Variable is WS-A-DEC-DISPLAY-SIGN3
	 *  @param index
	 *	@param number
	 */
	public void setADecDisplaySign3(int index,BigDecimal number) {
		setADecDisplaySign3(index,number, true);
	}

	 /**
	 *	Update ADecDisplaySign3 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setADecDisplaySign3(int index,BigDecimal value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setADecDisplaySign3(int,String,boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= A_DEC_DISPLAY_SIGN_3_SIZE) {
             	index = A_DEC_DISPLAY_SIGN_3_SIZE -1; // can't exceed max array size
             	logger.trace("aDecDisplaySign3 - Array index exceeded max Size {}, resetting it to max allowed",A_DEC_DISPLAY_SIGN_3_SIZE); 
	    }
       	//        
        truncated = false; // reset left over truncated flag
        value = value.setScale(9,RoundingMode.DOWN);
	    if (value.precision() > 10) value =   truncate(value,10) ;
		if (setModified) {
			serializeADecDisplaySign3(index,value);
		}
   }
   
   	/**
	 *  Update ADecDisplaySign3 at index with the passed value
	 * 	This method accepts a number value as String
	 *  String can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 */
	public void setADecDisplaySign3(int index,String value) {
			setADecDisplaySign3(index,value, true);
	}

	/**
	 *  Update ADecDisplaySign3 at index with the passed value and serialize the object if setModified is true
	 * 	This method can accept a number value as String
	 *  String can also be in a format that COBOL, 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setADecDisplaySign3(int index,String value, boolean setModified) { 
		if (setModified) {
			// serialize the value
			replaceValue(
			        padNumber(10,value,true/*isSigned?*/)
			       ,(beginADecDisplaySign3 + index*A_DEC_DISPLAY_SIGN_3_LEN)
			       ,A_DEC_DISPLAY_SIGN_3_LEN
			       );	
                      			
		}
   }
    /**
	 *	Returns the value of aDecDisplayUnsign1
	 *  Corresponding COBOL Variable is WS-A-DEC-DISPLAY-UNSIGN1
	 *	@return aDecDisplayUnsign1
	 */
	public List<BigDecimal> getADecDisplayUnsign1() throws CFException {
        List<BigDecimal>	list = new ArrayList<>();  
        for (int index =0;index < A_DEC_DISPLAY_UNSIGN_1_SIZE;index++) {
        	list.add( getADecDisplayUnsign1( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return aDecDisplayUnsign1
	 */
	public BigDecimal getADecDisplayUnsign1(int index) throws CFException {
	try {
		if (index < 0) {
		    logger.trace("Array index was {} for getADecDisplayUnsign1(), resetting it to 0",index);
		    index = 0;
        } else if (index >= A_DEC_DISPLAY_UNSIGN_1_SIZE) {
             	index = A_DEC_DISPLAY_UNSIGN_1_SIZE -1; // can't exceed max array size
             	logger.trace("aDecDisplayUnsign1 - Array index exceeded max Size {}, resetting it to max allowed",A_DEC_DISPLAY_UNSIGN_1_SIZE); 
	    }
			return 
			           getDecimalNumber( 
			                  beginADecDisplayUnsign1+ index*A_DEC_DISPLAY_UNSIGN_1_LEN 
			                 ,A_DEC_DISPLAY_UNSIGN_1_LEN
			                 ,A_DEC_DISPLAY_UNSIGN_1_SCALE
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              
			           ;
	} catch(Exception ex) {
    		throw getSoc7ABend("aDecDisplayUnsign1", beginADecDisplayUnsign1+ index*A_DEC_DISPLAY_UNSIGN_1_LEN,A_DEC_DISPLAY_UNSIGN_1_LEN);
    	}			           
   }
   

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param index
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean aDecDisplayUnsign1IsNumeric(int index) {
	    return isNumeric(298 + index*3 
	                    ,298 + (index+1)*3 
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);	    
	}


	/**
	 *  Returns String value of aDecDisplayUnsign1
     *  @param index
	 *  @return aDecDisplayUnsign1
	 */
	public char[] getADecDisplayUnsign1String(int index) {
	      return toCharArray( (beginADecDisplayUnsign1 + index*A_DEC_DISPLAY_UNSIGN_1_LEN) , A_DEC_DISPLAY_UNSIGN_1_LEN );
	}

	/**
	 *	Update ADecDisplayUnsign1 at index with the passed value
	 *  Corresponding COBOL Variable is WS-A-DEC-DISPLAY-UNSIGN1
	 *  @param index
	 *	@param number
	 */
	public void setADecDisplayUnsign1(int index,BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
		setADecDisplayUnsign1(index,number, true);
	}

	 /**
	 *	Update ADecDisplayUnsign1 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setADecDisplayUnsign1(int index,BigDecimal value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setADecDisplayUnsign1(int,String,boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= A_DEC_DISPLAY_UNSIGN_1_SIZE) {
             	index = A_DEC_DISPLAY_UNSIGN_1_SIZE -1; // can't exceed max array size
             	logger.trace("aDecDisplayUnsign1 - Array index exceeded max Size {}, resetting it to max allowed",A_DEC_DISPLAY_UNSIGN_1_SIZE); 
	    }
       	//        
        truncated = false; // reset left over truncated flag
        value = value.setScale(2,RoundingMode.DOWN);
	    if (value.precision() > 3) value =   truncate(value,3) ;
		if (setModified) {
			serializeADecDisplayUnsign1(index,value);
		}
   }
   
   	/**
	 *  Update ADecDisplayUnsign1 at index with the passed value
	 * 	This method accepts a number value as String
	 *  String can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 */
	public void setADecDisplayUnsign1(int index,String value) {
			setADecDisplayUnsign1(index,value, true);
	}

	/**
	 *  Update ADecDisplayUnsign1 at index with the passed value and serialize the object if setModified is true
	 * 	This method can accept a number value as String
	 *  String can also be in a format that COBOL, 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setADecDisplayUnsign1(int index,String value, boolean setModified) { 
		if (setModified) {
			// serialize the value
			replaceValue(
			        padNumber(3,value,false/*isSigned?*/)
			       ,(beginADecDisplayUnsign1 + index*A_DEC_DISPLAY_UNSIGN_1_LEN)
			       ,A_DEC_DISPLAY_UNSIGN_1_LEN
			       );	
                      			
		}
   }
    /**
	 *	Returns the value of aDecDisplayUnsign2
	 *  Corresponding COBOL Variable is WS-A-DEC-DISPLAY-UNSIGN2
	 *	@return aDecDisplayUnsign2
	 */
	public List<BigDecimal> getADecDisplayUnsign2() throws CFException {
        List<BigDecimal>	list = new ArrayList<>();  
        for (int index =0;index < A_DEC_DISPLAY_UNSIGN_2_SIZE;index++) {
        	list.add( getADecDisplayUnsign2( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return aDecDisplayUnsign2
	 */
	public BigDecimal getADecDisplayUnsign2(int index) throws CFException {
	try {
		if (index < 0) {
		    logger.trace("Array index was {} for getADecDisplayUnsign2(), resetting it to 0",index);
		    index = 0;
        } else if (index >= A_DEC_DISPLAY_UNSIGN_2_SIZE) {
             	index = A_DEC_DISPLAY_UNSIGN_2_SIZE -1; // can't exceed max array size
             	logger.trace("aDecDisplayUnsign2 - Array index exceeded max Size {}, resetting it to max allowed",A_DEC_DISPLAY_UNSIGN_2_SIZE); 
	    }
			return 
			           getDecimalNumber( 
			                  beginADecDisplayUnsign2+ index*A_DEC_DISPLAY_UNSIGN_2_LEN 
			                 ,A_DEC_DISPLAY_UNSIGN_2_LEN
			                 ,A_DEC_DISPLAY_UNSIGN_2_SCALE
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              
			           ;
	} catch(Exception ex) {
    		throw getSoc7ABend("aDecDisplayUnsign2", beginADecDisplayUnsign2+ index*A_DEC_DISPLAY_UNSIGN_2_LEN,A_DEC_DISPLAY_UNSIGN_2_LEN);
    	}			           
   }
   

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param index
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean aDecDisplayUnsign2IsNumeric(int index) {
	    return isNumeric(304 + index*7 
	                    ,304 + (index+1)*7 
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);	    
	}


	/**
	 *  Returns String value of aDecDisplayUnsign2
     *  @param index
	 *  @return aDecDisplayUnsign2
	 */
	public char[] getADecDisplayUnsign2String(int index) {
	      return toCharArray( (beginADecDisplayUnsign2 + index*A_DEC_DISPLAY_UNSIGN_2_LEN) , A_DEC_DISPLAY_UNSIGN_2_LEN );
	}

	/**
	 *	Update ADecDisplayUnsign2 at index with the passed value
	 *  Corresponding COBOL Variable is WS-A-DEC-DISPLAY-UNSIGN2
	 *  @param index
	 *	@param number
	 */
	public void setADecDisplayUnsign2(int index,BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
		setADecDisplayUnsign2(index,number, true);
	}

	 /**
	 *	Update ADecDisplayUnsign2 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setADecDisplayUnsign2(int index,BigDecimal value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setADecDisplayUnsign2(int,String,boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= A_DEC_DISPLAY_UNSIGN_2_SIZE) {
             	index = A_DEC_DISPLAY_UNSIGN_2_SIZE -1; // can't exceed max array size
             	logger.trace("aDecDisplayUnsign2 - Array index exceeded max Size {}, resetting it to max allowed",A_DEC_DISPLAY_UNSIGN_2_SIZE); 
	    }
       	//        
        truncated = false; // reset left over truncated flag
        value = value.setScale(6,RoundingMode.DOWN);
	    if (value.precision() > 7) value =   truncate(value,7) ;
		if (setModified) {
			serializeADecDisplayUnsign2(index,value);
		}
   }
   
   	/**
	 *  Update ADecDisplayUnsign2 at index with the passed value
	 * 	This method accepts a number value as String
	 *  String can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 */
	public void setADecDisplayUnsign2(int index,String value) {
			setADecDisplayUnsign2(index,value, true);
	}

	/**
	 *  Update ADecDisplayUnsign2 at index with the passed value and serialize the object if setModified is true
	 * 	This method can accept a number value as String
	 *  String can also be in a format that COBOL, 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setADecDisplayUnsign2(int index,String value, boolean setModified) { 
		if (setModified) {
			// serialize the value
			replaceValue(
			        padNumber(7,value,false/*isSigned?*/)
			       ,(beginADecDisplayUnsign2 + index*A_DEC_DISPLAY_UNSIGN_2_LEN)
			       ,A_DEC_DISPLAY_UNSIGN_2_LEN
			       );	
                      			
		}
   }
    /**
	 *	Returns the value of aDecDisplayUnsign3
	 *  Corresponding COBOL Variable is WS-A-DEC-DISPLAY-UNSIGN3
	 *	@return aDecDisplayUnsign3
	 */
	public List<BigDecimal> getADecDisplayUnsign3() throws CFException {
        List<BigDecimal>	list = new ArrayList<>();  
        for (int index =0;index < A_DEC_DISPLAY_UNSIGN_3_SIZE;index++) {
        	list.add( getADecDisplayUnsign3( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return aDecDisplayUnsign3
	 */
	public BigDecimal getADecDisplayUnsign3(int index) throws CFException {
	try {
		if (index < 0) {
		    logger.trace("Array index was {} for getADecDisplayUnsign3(), resetting it to 0",index);
		    index = 0;
        } else if (index >= A_DEC_DISPLAY_UNSIGN_3_SIZE) {
             	index = A_DEC_DISPLAY_UNSIGN_3_SIZE -1; // can't exceed max array size
             	logger.trace("aDecDisplayUnsign3 - Array index exceeded max Size {}, resetting it to max allowed",A_DEC_DISPLAY_UNSIGN_3_SIZE); 
	    }
			return 
			           getDecimalNumber( 
			                  beginADecDisplayUnsign3+ index*A_DEC_DISPLAY_UNSIGN_3_LEN 
			                 ,A_DEC_DISPLAY_UNSIGN_3_LEN
			                 ,A_DEC_DISPLAY_UNSIGN_3_SCALE
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              
			           ;
	} catch(Exception ex) {
    		throw getSoc7ABend("aDecDisplayUnsign3", beginADecDisplayUnsign3+ index*A_DEC_DISPLAY_UNSIGN_3_LEN,A_DEC_DISPLAY_UNSIGN_3_LEN);
    	}			           
   }
   

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param index
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean aDecDisplayUnsign3IsNumeric(int index) {
	    return isNumeric(318 + index*10 
	                    ,318 + (index+1)*10 
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);	    
	}


	/**
	 *  Returns String value of aDecDisplayUnsign3
     *  @param index
	 *  @return aDecDisplayUnsign3
	 */
	public char[] getADecDisplayUnsign3String(int index) {
	      return toCharArray( (beginADecDisplayUnsign3 + index*A_DEC_DISPLAY_UNSIGN_3_LEN) , A_DEC_DISPLAY_UNSIGN_3_LEN );
	}

	/**
	 *	Update ADecDisplayUnsign3 at index with the passed value
	 *  Corresponding COBOL Variable is WS-A-DEC-DISPLAY-UNSIGN3
	 *  @param index
	 *	@param number
	 */
	public void setADecDisplayUnsign3(int index,BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
		setADecDisplayUnsign3(index,number, true);
	}

	 /**
	 *	Update ADecDisplayUnsign3 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setADecDisplayUnsign3(int index,BigDecimal value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setADecDisplayUnsign3(int,String,boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= A_DEC_DISPLAY_UNSIGN_3_SIZE) {
             	index = A_DEC_DISPLAY_UNSIGN_3_SIZE -1; // can't exceed max array size
             	logger.trace("aDecDisplayUnsign3 - Array index exceeded max Size {}, resetting it to max allowed",A_DEC_DISPLAY_UNSIGN_3_SIZE); 
	    }
       	//        
        truncated = false; // reset left over truncated flag
        value = value.setScale(9,RoundingMode.DOWN);
	    if (value.precision() > 10) value =   truncate(value,10) ;
		if (setModified) {
			serializeADecDisplayUnsign3(index,value);
		}
   }
   
   	/**
	 *  Update ADecDisplayUnsign3 at index with the passed value
	 * 	This method accepts a number value as String
	 *  String can also be in a format that COBOL accepts as number (may not look like a number), 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 */
	public void setADecDisplayUnsign3(int index,String value) {
			setADecDisplayUnsign3(index,value, true);
	}

	/**
	 *  Update ADecDisplayUnsign3 at index with the passed value and serialize the object if setModified is true
	 * 	This method can accept a number value as String
	 *  String can also be in a format that COBOL, 
   	 *  which means, not all string will consists of digits
   	 *  In case of non digit value, this method will mimic COBOL behavior and use only last 4 bits per char	 
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setADecDisplayUnsign3(int index,String value, boolean setModified) { 
		if (setModified) {
			// serialize the value
			replaceValue(
			        padNumber(10,value,false/*isSigned?*/)
			       ,(beginADecDisplayUnsign3 + index*A_DEC_DISPLAY_UNSIGN_3_LEN)
			       ,A_DEC_DISPLAY_UNSIGN_3_LEN
			       );	
                      			
		}
   }

    /**
	 *	Returns the value of aDecPackedSign1
	 *  Corresponding COBOL Variable is WS-A-DEC-PACKED-SIGN1
	 *	@return aDecPackedSign1
	 */
	public List<BigDecimal> getADecPackedSign1() throws CFException {
        List<BigDecimal>	list = new ArrayList<>();  
        for (int index = 0 ;index < A_DEC_PACKED_SIGN_1_SIZE;index++) {
        	list.add( getADecPackedSign1( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return aDecPackedSign1
	 */
	public BigDecimal getADecPackedSign1(int index) throws CFException {
	try {
		if (index < 0) {
		    logger.trace("Array index was {} for getADecPackedSign1(), resetting it to 0",index);
		    index = 0;
        } else if (index >= A_DEC_PACKED_SIGN_1_SIZE) {
             	index = A_DEC_PACKED_SIGN_1_SIZE -1; // can't exceed max array size
             	logger.trace("aDecPackedSign1 - Array index exceeded max Size "+A_DEC_PACKED_SIGN_1_SIZE+", resetting it to max allowed"); 
	    }
		return 
		getDecimal( 
		beginADecPackedSign1+ index*A_DEC_PACKED_SIGN_1_LEN ,
		A_DEC_PACKED_SIGN_1_LEN, A_DEC_PACKED_SIGN_1_SCALE);
	} catch(Exception ex) {
    	throw getSoc7ABend("aDecPackedSign1", beginADecPackedSign1+ index*A_DEC_PACKED_SIGN_1_LEN,A_DEC_PACKED_SIGN_1_LEN);
    }
   }
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param index 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean aDecPackedSign1IsNumeric(int index) {
	    return decimalIsNumeric( beginADecPackedSign1+ index*A_DEC_PACKED_SIGN_1_LEN ,A_DEC_PACKED_SIGN_1_LEN);
	}
	/**
	 * 	Set value at the index passed
	 *  Corresponding COBOL Variable is WS-A-DEC-PACKED-SIGN1
	 *  @param index
	 *	@param number
	 */
	public void setADecPackedSign1(int index,BigDecimal number) {	
		setADecPackedSign1(index,number, true);
	}

	/**
	 * 	Set value at the index passed and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setADecPackedSign1(int index,BigDecimal value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setADecPackedSign1(int,String,boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= A_DEC_PACKED_SIGN_1_SIZE) {
             	index = A_DEC_PACKED_SIGN_1_SIZE -1; // can't exceed max array size
             	logger.trace("aDecPackedSign1 - Array index exceeded max Size {}, resetting it to max allowed",A_DEC_PACKED_SIGN_1_SIZE); 
	    }
       	
       	truncated = false; // reset left over truncated flag
        value = value.setScale(2,RoundingMode.DOWN);
	    if (value.precision() > 3) value =   truncate(value,3) ;
		if (setModified) {
			serializeADecPackedSign1(index,value);
		}
   }


    /**
	 *	Returns the value of aDecPackedSign2
	 *  Corresponding COBOL Variable is WS-A-DEC-PACKED-SIGN2
	 *	@return aDecPackedSign2
	 */
	public List<BigDecimal> getADecPackedSign2() throws CFException {
        List<BigDecimal>	list = new ArrayList<>();  
        for (int index = 0 ;index < A_DEC_PACKED_SIGN_2_SIZE;index++) {
        	list.add( getADecPackedSign2( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return aDecPackedSign2
	 */
	public BigDecimal getADecPackedSign2(int index) throws CFException {
	try {
		if (index < 0) {
		    logger.trace("Array index was {} for getADecPackedSign2(), resetting it to 0",index);
		    index = 0;
        } else if (index >= A_DEC_PACKED_SIGN_2_SIZE) {
             	index = A_DEC_PACKED_SIGN_2_SIZE -1; // can't exceed max array size
             	logger.trace("aDecPackedSign2 - Array index exceeded max Size "+A_DEC_PACKED_SIGN_2_SIZE+", resetting it to max allowed"); 
	    }
		return 
		getDecimal( 
		beginADecPackedSign2+ index*A_DEC_PACKED_SIGN_2_LEN ,
		A_DEC_PACKED_SIGN_2_LEN, A_DEC_PACKED_SIGN_2_SCALE);
	} catch(Exception ex) {
    	throw getSoc7ABend("aDecPackedSign2", beginADecPackedSign2+ index*A_DEC_PACKED_SIGN_2_LEN,A_DEC_PACKED_SIGN_2_LEN);
    }
   }
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param index 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean aDecPackedSign2IsNumeric(int index) {
	    return decimalIsNumeric( beginADecPackedSign2+ index*A_DEC_PACKED_SIGN_2_LEN ,A_DEC_PACKED_SIGN_2_LEN);
	}
	/**
	 * 	Set value at the index passed
	 *  Corresponding COBOL Variable is WS-A-DEC-PACKED-SIGN2
	 *  @param index
	 *	@param number
	 */
	public void setADecPackedSign2(int index,BigDecimal number) {	
		setADecPackedSign2(index,number, true);
	}

	/**
	 * 	Set value at the index passed and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setADecPackedSign2(int index,BigDecimal value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setADecPackedSign2(int,String,boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= A_DEC_PACKED_SIGN_2_SIZE) {
             	index = A_DEC_PACKED_SIGN_2_SIZE -1; // can't exceed max array size
             	logger.trace("aDecPackedSign2 - Array index exceeded max Size {}, resetting it to max allowed",A_DEC_PACKED_SIGN_2_SIZE); 
	    }
       	
       	truncated = false; // reset left over truncated flag
        value = value.setScale(7,RoundingMode.DOWN);
	    if (value.precision() > 8) value =   truncate(value,8) ;
		if (setModified) {
			serializeADecPackedSign2(index,value);
		}
   }


    /**
	 *	Returns the value of aDecPackedSign3
	 *  Corresponding COBOL Variable is WS-A-DEC-PACKED-SIGN3
	 *	@return aDecPackedSign3
	 */
	public List<BigDecimal> getADecPackedSign3() throws CFException {
        List<BigDecimal>	list = new ArrayList<>();  
        for (int index = 0 ;index < A_DEC_PACKED_SIGN_3_SIZE;index++) {
        	list.add( getADecPackedSign3( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return aDecPackedSign3
	 */
	public BigDecimal getADecPackedSign3(int index) throws CFException {
	try {
		if (index < 0) {
		    logger.trace("Array index was {} for getADecPackedSign3(), resetting it to 0",index);
		    index = 0;
        } else if (index >= A_DEC_PACKED_SIGN_3_SIZE) {
             	index = A_DEC_PACKED_SIGN_3_SIZE -1; // can't exceed max array size
             	logger.trace("aDecPackedSign3 - Array index exceeded max Size "+A_DEC_PACKED_SIGN_3_SIZE+", resetting it to max allowed"); 
	    }
		return 
		getDecimal( 
		beginADecPackedSign3+ index*A_DEC_PACKED_SIGN_3_LEN ,
		A_DEC_PACKED_SIGN_3_LEN, A_DEC_PACKED_SIGN_3_SCALE);
	} catch(Exception ex) {
    	throw getSoc7ABend("aDecPackedSign3", beginADecPackedSign3+ index*A_DEC_PACKED_SIGN_3_LEN,A_DEC_PACKED_SIGN_3_LEN);
    }
   }
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param index 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean aDecPackedSign3IsNumeric(int index) {
	    return decimalIsNumeric( beginADecPackedSign3+ index*A_DEC_PACKED_SIGN_3_LEN ,A_DEC_PACKED_SIGN_3_LEN);
	}
	/**
	 * 	Set value at the index passed
	 *  Corresponding COBOL Variable is WS-A-DEC-PACKED-SIGN3
	 *  @param index
	 *	@param number
	 */
	public void setADecPackedSign3(int index,BigDecimal number) {	
		setADecPackedSign3(index,number, true);
	}

	/**
	 * 	Set value at the index passed and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setADecPackedSign3(int index,BigDecimal value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setADecPackedSign3(int,String,boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= A_DEC_PACKED_SIGN_3_SIZE) {
             	index = A_DEC_PACKED_SIGN_3_SIZE -1; // can't exceed max array size
             	logger.trace("aDecPackedSign3 - Array index exceeded max Size {}, resetting it to max allowed",A_DEC_PACKED_SIGN_3_SIZE); 
	    }
       	
       	truncated = false; // reset left over truncated flag
        value = value.setScale(9,RoundingMode.DOWN);
	    if (value.precision() > 10) value =   truncate(value,10) ;
		if (setModified) {
			serializeADecPackedSign3(index,value);
		}
   }


    /**
	 *	Returns the value of aDecPackedUnsign1
	 *  Corresponding COBOL Variable is WS-A-DEC-PACKED-UNSIGN1
	 *	@return aDecPackedUnsign1
	 */
	public List<BigDecimal> getADecPackedUnsign1() throws CFException {
        List<BigDecimal>	list = new ArrayList<>();  
        for (int index = 0 ;index < A_DEC_PACKED_UNSIGN_1_SIZE;index++) {
        	list.add( getADecPackedUnsign1( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return aDecPackedUnsign1
	 */
	public BigDecimal getADecPackedUnsign1(int index) throws CFException {
	try {
		if (index < 0) {
		    logger.trace("Array index was {} for getADecPackedUnsign1(), resetting it to 0",index);
		    index = 0;
        } else if (index >= A_DEC_PACKED_UNSIGN_1_SIZE) {
             	index = A_DEC_PACKED_UNSIGN_1_SIZE -1; // can't exceed max array size
             	logger.trace("aDecPackedUnsign1 - Array index exceeded max Size "+A_DEC_PACKED_UNSIGN_1_SIZE+", resetting it to max allowed"); 
	    }
		return 
		getDecimal( 
		beginADecPackedUnsign1+ index*A_DEC_PACKED_UNSIGN_1_LEN ,
		A_DEC_PACKED_UNSIGN_1_LEN, A_DEC_PACKED_UNSIGN_1_SCALE);
	} catch(Exception ex) {
    	throw getSoc7ABend("aDecPackedUnsign1", beginADecPackedUnsign1+ index*A_DEC_PACKED_UNSIGN_1_LEN,A_DEC_PACKED_UNSIGN_1_LEN);
    }
   }
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param index 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean aDecPackedUnsign1IsNumeric(int index) {
	    return decimalIsNumeric( beginADecPackedUnsign1+ index*A_DEC_PACKED_UNSIGN_1_LEN ,A_DEC_PACKED_UNSIGN_1_LEN);
	}
	/**
	 * 	Set value at the index passed
	 *  Corresponding COBOL Variable is WS-A-DEC-PACKED-UNSIGN1
	 *  @param index
	 *	@param number
	 */
	public void setADecPackedUnsign1(int index,BigDecimal number) {	
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
		setADecPackedUnsign1(index,number, true);
	}

	/**
	 * 	Set value at the index passed and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setADecPackedUnsign1(int index,BigDecimal value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setADecPackedUnsign1(int,String,boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= A_DEC_PACKED_UNSIGN_1_SIZE) {
             	index = A_DEC_PACKED_UNSIGN_1_SIZE -1; // can't exceed max array size
             	logger.trace("aDecPackedUnsign1 - Array index exceeded max Size {}, resetting it to max allowed",A_DEC_PACKED_UNSIGN_1_SIZE); 
	    }
       	
       	truncated = false; // reset left over truncated flag
        value = value.setScale(2,RoundingMode.DOWN);
	    if (value.precision() > 3) value =   truncate(value,3) ;
		if (setModified) {
			serializeADecPackedUnsign1(index,value);
		}
   }


    /**
	 *	Returns the value of aDecPackedUnsign2
	 *  Corresponding COBOL Variable is WS-A-DEC-PACKED-UNSIGN2
	 *	@return aDecPackedUnsign2
	 */
	public List<BigDecimal> getADecPackedUnsign2() throws CFException {
        List<BigDecimal>	list = new ArrayList<>();  
        for (int index = 0 ;index < A_DEC_PACKED_UNSIGN_2_SIZE;index++) {
        	list.add( getADecPackedUnsign2( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return aDecPackedUnsign2
	 */
	public BigDecimal getADecPackedUnsign2(int index) throws CFException {
	try {
		if (index < 0) {
		    logger.trace("Array index was {} for getADecPackedUnsign2(), resetting it to 0",index);
		    index = 0;
        } else if (index >= A_DEC_PACKED_UNSIGN_2_SIZE) {
             	index = A_DEC_PACKED_UNSIGN_2_SIZE -1; // can't exceed max array size
             	logger.trace("aDecPackedUnsign2 - Array index exceeded max Size "+A_DEC_PACKED_UNSIGN_2_SIZE+", resetting it to max allowed"); 
	    }
		return 
		getDecimal( 
		beginADecPackedUnsign2+ index*A_DEC_PACKED_UNSIGN_2_LEN ,
		A_DEC_PACKED_UNSIGN_2_LEN, A_DEC_PACKED_UNSIGN_2_SCALE);
	} catch(Exception ex) {
    	throw getSoc7ABend("aDecPackedUnsign2", beginADecPackedUnsign2+ index*A_DEC_PACKED_UNSIGN_2_LEN,A_DEC_PACKED_UNSIGN_2_LEN);
    }
   }
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param index 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean aDecPackedUnsign2IsNumeric(int index) {
	    return decimalIsNumeric( beginADecPackedUnsign2+ index*A_DEC_PACKED_UNSIGN_2_LEN ,A_DEC_PACKED_UNSIGN_2_LEN);
	}
	/**
	 * 	Set value at the index passed
	 *  Corresponding COBOL Variable is WS-A-DEC-PACKED-UNSIGN2
	 *  @param index
	 *	@param number
	 */
	public void setADecPackedUnsign2(int index,BigDecimal number) {	
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
		setADecPackedUnsign2(index,number, true);
	}

	/**
	 * 	Set value at the index passed and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setADecPackedUnsign2(int index,BigDecimal value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setADecPackedUnsign2(int,String,boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= A_DEC_PACKED_UNSIGN_2_SIZE) {
             	index = A_DEC_PACKED_UNSIGN_2_SIZE -1; // can't exceed max array size
             	logger.trace("aDecPackedUnsign2 - Array index exceeded max Size {}, resetting it to max allowed",A_DEC_PACKED_UNSIGN_2_SIZE); 
	    }
       	
       	truncated = false; // reset left over truncated flag
        value = value.setScale(6,RoundingMode.DOWN);
	    if (value.precision() > 7) value =   truncate(value,7) ;
		if (setModified) {
			serializeADecPackedUnsign2(index,value);
		}
   }


    /**
	 *	Returns the value of aDecPackedUnsign3
	 *  Corresponding COBOL Variable is WS-A-DEC-PACKED-UNSIGN3
	 *	@return aDecPackedUnsign3
	 */
	public List<BigDecimal> getADecPackedUnsign3() throws CFException {
        List<BigDecimal>	list = new ArrayList<>();  
        for (int index = 0 ;index < A_DEC_PACKED_UNSIGN_3_SIZE;index++) {
        	list.add( getADecPackedUnsign3( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return aDecPackedUnsign3
	 */
	public BigDecimal getADecPackedUnsign3(int index) throws CFException {
	try {
		if (index < 0) {
		    logger.trace("Array index was {} for getADecPackedUnsign3(), resetting it to 0",index);
		    index = 0;
        } else if (index >= A_DEC_PACKED_UNSIGN_3_SIZE) {
             	index = A_DEC_PACKED_UNSIGN_3_SIZE -1; // can't exceed max array size
             	logger.trace("aDecPackedUnsign3 - Array index exceeded max Size "+A_DEC_PACKED_UNSIGN_3_SIZE+", resetting it to max allowed"); 
	    }
		return 
		getDecimal( 
		beginADecPackedUnsign3+ index*A_DEC_PACKED_UNSIGN_3_LEN ,
		A_DEC_PACKED_UNSIGN_3_LEN, A_DEC_PACKED_UNSIGN_3_SCALE);
	} catch(Exception ex) {
    	throw getSoc7ABend("aDecPackedUnsign3", beginADecPackedUnsign3+ index*A_DEC_PACKED_UNSIGN_3_LEN,A_DEC_PACKED_UNSIGN_3_LEN);
    }
   }
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *  @param index 
	 *	@return true if numeric value stored in the serialized String
	 */
	public boolean aDecPackedUnsign3IsNumeric(int index) {
	    return decimalIsNumeric( beginADecPackedUnsign3+ index*A_DEC_PACKED_UNSIGN_3_LEN ,A_DEC_PACKED_UNSIGN_3_LEN);
	}
	/**
	 * 	Set value at the index passed
	 *  Corresponding COBOL Variable is WS-A-DEC-PACKED-UNSIGN3
	 *  @param index
	 *	@param number
	 */
	public void setADecPackedUnsign3(int index,BigDecimal number) {	
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
		setADecPackedUnsign3(index,number, true);
	}

	/**
	 * 	Set value at the index passed and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setADecPackedUnsign3(int index,BigDecimal value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setADecPackedUnsign3(int,String,boolean), reset it to 0",index);
		    index = 0;
        } else if (index >= A_DEC_PACKED_UNSIGN_3_SIZE) {
             	index = A_DEC_PACKED_UNSIGN_3_SIZE -1; // can't exceed max array size
             	logger.trace("aDecPackedUnsign3 - Array index exceeded max Size {}, resetting it to max allowed",A_DEC_PACKED_UNSIGN_3_SIZE); 
	    }
       	
       	truncated = false; // reset left over truncated flag
        value = value.setScale(9,RoundingMode.DOWN);
	    if (value.precision() > 10) value =   truncate(value,10) ;
		if (setModified) {
			serializeADecPackedUnsign3(index,value);
		}
   }

    /**
	 *	Returns the value of aChar
	 *  Corresponding COBOL Variable is WS-A-CHAR
	 *	@return aChar
	 */
	public List<char[]> getAChar() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < A_CHAR_SIZE;index++) {
        	list.add( getAChar( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return aChar
	 */
	public char[] getAChar(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getAChar(), resetting it to 0",index);
		    index = 0;
        } else if (index >= A_CHAR_SIZE) {
             	index = A_CHAR_SIZE -1; // can't exceed max array size
             	logger.trace("aChar - Array index exceeded max Size {}, resetting it to max allowed",A_CHAR_SIZE); 
	    }
   	      return getCharArray( (beginAChar + index*A_CHAR_LEN) , A_CHAR_LEN );
    }
    
    
   public int  aCharFieldLength() {
   	return A_CHAR_LEN;
   }
   
	

  
  	/**
	 *	Update AChar with the passed value at a given index
	 *  Corresponding COBOL Variable is WS-A-CHAR
	 *  @param index
	 *	@param value
	 */
  public void setAChar(int index,char[] value) {
   	setAChar(index,value,true);
   }
   
   
   /**
	 *	Update AChar with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setAChar(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setAChar(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 5)  {     
		       value = substring(value,0,5);
           }  else if (value.length < 5) {
		       value = pad(5, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(5).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeAChar(index,value);		
       }
   }
   
    /**
	 *	Returns the value of aCharJustRight
	 *  Corresponding COBOL Variable is WS-A-CHAR-JUST-RIGHT
	 *	@return aCharJustRight
	 */
	public List<char[]> getACharJustRight() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < A_CHAR_JUST_RIGHT_SIZE;index++) {
        	list.add( getACharJustRight( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return aCharJustRight
	 */
	public char[] getACharJustRight(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getACharJustRight(), resetting it to 0",index);
		    index = 0;
        } else if (index >= A_CHAR_JUST_RIGHT_SIZE) {
             	index = A_CHAR_JUST_RIGHT_SIZE -1; // can't exceed max array size
             	logger.trace("aCharJustRight - Array index exceeded max Size {}, resetting it to max allowed",A_CHAR_JUST_RIGHT_SIZE); 
	    }
   	      return getCharArray( (beginACharJustRight + index*A_CHAR_JUST_RIGHT_LEN) , A_CHAR_JUST_RIGHT_LEN );
    }
    
    
   public int  aCharJustRightFieldLength() {
   	return A_CHAR_JUST_RIGHT_LEN;
   }
   
	

  
  	/**
	 *	Update ACharJustRight with the passed value at a given index
	 *  Corresponding COBOL Variable is WS-A-CHAR-JUST-RIGHT
	 *  @param index
	 *	@param value
	 */
  public void setACharJustRight(int index,char[] value) {
   	setACharJustRight(index,value,true);
   }
   
   
   /**
	 *	Update ACharJustRight with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setACharJustRight(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setACharJustRight(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 5)  {     
               // value must be right justified
		       value = substring(value,value.length-5,value.length);
           }  else if (value.length < 5) {
		       value = pad(5, value, SPACE_CHAR, LEFT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(5).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeACharJustRight(index,value);		
       }
   }
   
    /**
	 *	Returns the value of aCharZero
	 *  Corresponding COBOL Variable is WS-A-CHAR-ZERO
	 *	@return aCharZero
	 */
	public List<char[]> getACharZero() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < A_CHAR_ZERO_SIZE;index++) {
        	list.add( getACharZero( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return aCharZero
	 */
	public char[] getACharZero(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getACharZero(), resetting it to 0",index);
		    index = 0;
        } else if (index >= A_CHAR_ZERO_SIZE) {
             	index = A_CHAR_ZERO_SIZE -1; // can't exceed max array size
             	logger.trace("aCharZero - Array index exceeded max Size {}, resetting it to max allowed",A_CHAR_ZERO_SIZE); 
	    }
   	      return getCharArray( (beginACharZero + index*A_CHAR_ZERO_LEN) , A_CHAR_ZERO_LEN );
    }
    
    
   public int  aCharZeroFieldLength() {
   	return A_CHAR_ZERO_LEN;
   }
   
	

  
  	/**
	 *	Update ACharZero with the passed value at a given index
	 *  Corresponding COBOL Variable is WS-A-CHAR-ZERO
	 *  @param index
	 *	@param value
	 */
  public void setACharZero(int index,char[] value) {
   	setACharZero(index,value,true);
   }
   
   
   /**
	 *	Update ACharZero with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setACharZero(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setACharZero(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 5)  {     
		       value = substring(value,0,5);
           }  else if (value.length < 5) {
		       value = pad(5, value, SPACE_CHAR, RIGHT_PAD);
		   }   
           // if this field contains zero, it should be converted to spaces
           if(zeroPattern.matcher(java.nio.CharBuffer.wrap(value)).matches()) {
               value = fillSpaces(5).toCharArray();
           }
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(5).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeACharZero(index,value);		
       }
   }
   

	
	
	
	/**
	 * 	initializes AGroupWithArray
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
            for (int index =0; index < A_BINARY_SIGN_1_SIZE;index++) {
                  setABinarySign1(index,(short)0);
            }
            for (int index =0; index < A_BINARY_SIGN_2_SIZE;index++) {
                        setABinarySign2(index,0);
            }
            for (int index =0; index < A_BINARY_SIGN_3_SIZE;index++) {
                        setABinarySign3(index,0);
            }
            for (int index =0; index < A_BINARY_UNSIGN_1_SIZE;index++) {
                        setABinaryUnsign1(index,0);
            }
            for (int index =0; index < A_BINARY_UNSIGN_2_SIZE;index++) {
                        setABinaryUnsign2(index,0);
            }
            for (int index =0; index < A_BINARY_UNSIGN_3_SIZE;index++) {
                        setABinaryUnsign3(index,0);
            }
            for (int index =0; index < A_DISPLAY_SIGN_1_SIZE;index++) {
                  setADisplaySign1(index,(short)0);
            }
            for (int index =0; index < A_DISPLAY_SIGN_2_SIZE;index++) {
                        setADisplaySign2(index,0);
            }
            for (int index =0; index < A_DISPLAY_SIGN_3_SIZE;index++) {
                        setADisplaySign3(index,0);
            }
            for (int index =0; index < A_DISPLAY_UNSIGN_1_SIZE;index++) {
                        setADisplayUnsign1(index,0);
            }
            for (int index =0; index < A_DISPLAY_UNSIGN_2_SIZE;index++) {
                        setADisplayUnsign2(index,0);
            }
            for (int index =0; index < A_DISPLAY_UNSIGN_3_SIZE;index++) {
                        setADisplayUnsign3(index,0);
            }
            for (int index =0; index < A_PACKED_SIGN_1_SIZE;index++) {
                  setAPackedSign1(index,(short)0);
            }
            for (int index =0; index < A_PACKED_SIGN_2_SIZE;index++) {
                        setAPackedSign2(index,0);
            }
            for (int index =0; index < A_PACKED_SIGN_3_SIZE;index++) {
                        setAPackedSign3(index,0);
            }
            for (int index =0; index < A_PACKED_UNSIGN_1_SIZE;index++) {
                        setAPackedUnsign1(index,0);
            }
            for (int index =0; index < A_PACKED_UNSIGN_2_SIZE;index++) {
                        setAPackedUnsign2(index,0);
            }
            for (int index =0; index < A_PACKED_UNSIGN_3_SIZE;index++) {
                        setAPackedUnsign3(index,0);
            }
            for (int index =0; index < A_DEC_BINARY_SIGN_1_SIZE;index++) {
             setADecBinarySign1(index, BigDecimal.ZERO);
            }
            for (int index =0; index < A_DEC_BINARY_SIGN_2_SIZE;index++) {
             setADecBinarySign2(index, BigDecimal.ZERO);
            }
            for (int index =0; index < A_DEC_BINARY_SIGN_3_SIZE;index++) {
             setADecBinarySign3(index, BigDecimal.ZERO);
            }
            for (int index =0; index < A_DEC_BINARY_UNSIGN_1_SIZE;index++) {
             setADecBinaryUnsign1(index, BigDecimal.ZERO);
            }
            for (int index =0; index < A_DEC_BINARY_UNSIGN_2_SIZE;index++) {
             setADecBinaryUnsign2(index, BigDecimal.ZERO);
            }
            for (int index =0; index < A_DEC_BINARY_UNSIGN_3_SIZE;index++) {
             setADecBinaryUnsign3(index, BigDecimal.ZERO);
            }
            for (int index =0; index < A_DEC_DISPLAY_SIGN_1_SIZE;index++) {
             setADecDisplaySign1(index, BigDecimal.ZERO);
            }
            for (int index =0; index < A_DEC_DISPLAY_SIGN_2_SIZE;index++) {
             setADecDisplaySign2(index, BigDecimal.ZERO);
            }
            for (int index =0; index < A_DEC_DISPLAY_SIGN_3_SIZE;index++) {
             setADecDisplaySign3(index, BigDecimal.ZERO);
            }
            for (int index =0; index < A_DEC_DISPLAY_UNSIGN_1_SIZE;index++) {
             setADecDisplayUnsign1(index, BigDecimal.ZERO);
            }
            for (int index =0; index < A_DEC_DISPLAY_UNSIGN_2_SIZE;index++) {
             setADecDisplayUnsign2(index, BigDecimal.ZERO);
            }
            for (int index =0; index < A_DEC_DISPLAY_UNSIGN_3_SIZE;index++) {
             setADecDisplayUnsign3(index, BigDecimal.ZERO);
            }
            for (int index =0; index < A_DEC_PACKED_SIGN_1_SIZE;index++) {
             setADecPackedSign1(index, BigDecimal.ZERO);
            }
            for (int index =0; index < A_DEC_PACKED_SIGN_2_SIZE;index++) {
             setADecPackedSign2(index, BigDecimal.ZERO);
            }
            for (int index =0; index < A_DEC_PACKED_SIGN_3_SIZE;index++) {
             setADecPackedSign3(index, BigDecimal.ZERO);
            }
            for (int index =0; index < A_DEC_PACKED_UNSIGN_1_SIZE;index++) {
             setADecPackedUnsign1(index, BigDecimal.ZERO);
            }
            for (int index =0; index < A_DEC_PACKED_UNSIGN_2_SIZE;index++) {
             setADecPackedUnsign2(index, BigDecimal.ZERO);
            }
            for (int index =0; index < A_DEC_PACKED_UNSIGN_3_SIZE;index++) {
             setADecPackedUnsign3(index, BigDecimal.ZERO);
            }
         for (int index =0; index < A_CHAR_SIZE;index++) {
             setAChar(index, CONSTANTS.SPACE_5);
         }
         for (int index =0; index < A_CHAR_JUST_RIGHT_SIZE;index++) {
             setACharJustRight(index, CONSTANTS.SPACE_5);
         }
            for (int index =0; index < A_CHAR_ZERO_SIZE;index++) {
                     setACharZero(index,fillSpace(5));
            }
   }

		public static int getAGroupWithArrayFieldLength() {
			return A_GROUP_WITH_ARRAY_LENGTH;
		}

}
  

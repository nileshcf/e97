package com.cloudframe.app.init1.dto;

/**
*  The class CmnSqlca is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:55. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;
import com.cloudframe.app.common.CONSTANTS;


public class CmnSqlca extends CmnSqlcaSerialized { 
   

						private char[] cmncaid = Field.fillLowValue(8);

								private int cmncabc;

								private int cmncode;

								private short cmnerrml;

						private char[] cmnerrmc = Field.fillLowValue(70);

						private char[] cmnerrp = Field.fillLowValue(8);
      private List<Integer> cmnerrd; 


						private char[] cmnwarn = Field.fillLowValue(8);

						private char[] cmnext = Field.fillLowValue(8);
	
	/**
	* Constructor for CmnSqlca
	**/
    public CmnSqlca() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnSqlca. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnSqlca(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of cmncaid
	 *	@return cmncaid
	 */
   public char[] getCmncaid() throws CFException{
     if (isCmncaidModified()) { 
        cmncaid = refreshCmncaid();
     }
   		return cmncaid;
   }

  
	/**
	*  set variable cmncaid
	*  Corresponding COBOL Variable is CMNCAID
	*  @param value
	**/
   public void setCmncaid(char[] value) {
      cmncaid = checkCmncaidConstraints(value);
      serializeCmncaid(cmncaid);
   } 

     /**
	 * 	Update Cmncaid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmncaid(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmncaid,cmncaid.length);
   	
   }
   
   public void setCmncaid(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmncaid,cmncaid.length);
   	
   }
   
     /**
	 * 	Update Cmncaid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmncaid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmncaid+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Cmncaid with another Field
	 *	@param value
	 */
   public void setCmncaid(Field source) {
       replace(source,0,source.length(),beginCmncaid,CMNCAID_LEN);
   	
   }  
   
     /**
	 * 	Update Cmncaid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmncaid(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmncaid,CMNCAID_LEN);
   	
   }
   
     /**
	 * 	Update Cmncaid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmncaid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmncaid+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmncabc
	 *	@return cmncabc
	 */
	public int getCmncabc() throws CFException {
        if (isCmncabcModified()) { 
           cmncabc = refreshCmncabc();
        }
   		return cmncabc;
	}
	
	/**
	 * 	Update Cmncabc with the passed value
	 *  Corresponding COBOL Variable is CMNCABC
	 *	@param number
	 */
	public void setCmncabc(int number) {
	     // Truncate if the number is beyond +/- Max range
	    cmncabc = checkCmncabcMaxLimit(number); 
		serializeCmncabc(cmncabc);
	}


	public void setCmncabc(long number) {
	    number = checkCmncabcMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmncabc((int)number);
	}
	
	/**
	 *	Returns the value of cmncode
	 *	@return cmncode
	 */
	public int getCmncode() throws CFException {
        if (isCmncodeModified()) { 
           cmncode = refreshCmncode();
        }
   		return cmncode;
	}
	
	/**
	 * 	Update Cmncode with the passed value
	 *  Corresponding COBOL Variable is CMNCODE
	 *	@param number
	 */
	public void setCmncode(int number) {
	     // Truncate if the number is beyond +/- Max range
	    cmncode = checkCmncodeMaxLimit(number); 
		serializeCmncode(cmncode);
	}


	public void setCmncode(long number) {
	    number = checkCmncodeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmncode((int)number);
	}
	
	/**
	 *	Returns the value of cmnerrml
	 *	@return cmnerrml
	 */
	public short getCmnerrml() throws CFException {
        if (isCmnerrmlModified()) { 
           cmnerrml = refreshCmnerrml();
        }
   		return cmnerrml;
	}
	
	/**
	 * 	Update Cmnerrml with the passed value
	 *  Corresponding COBOL Variable is CMNERRML
	 *	@param number
	 */
	public void setCmnerrml(short number) {
	     // Truncate if the number is beyond +/- Max range
	    cmnerrml = checkCmnerrmlMaxLimit(number); 
		serializeCmnerrml(cmnerrml);
	}

	public void setCmnerrml(int number) {
	    number = checkCmnerrmlMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCmnerrml((short)number);
	}
	public void setCmnerrml(long number) {
	    number = checkCmnerrmlMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCmnerrml((short)number);
	}
	

	/**
	 *	Returns the value of cmnerrmc
	 *	@return cmnerrmc
	 */
   public char[] getCmnerrmc() throws CFException{
     if (isCmnerrmcModified()) { 
        cmnerrmc = refreshCmnerrmc();
     }
   		return cmnerrmc;
   }

  
	/**
	*  set variable cmnerrmc
	*  Corresponding COBOL Variable is CMNERRMC
	*  @param value
	**/
   public void setCmnerrmc(char[] value) {
      cmnerrmc = checkCmnerrmcConstraints(value);
      serializeCmnerrmc(cmnerrmc);
   } 

     /**
	 * 	Update Cmnerrmc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnerrmc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnerrmc,cmnerrmc.length);
   	
   }
   
   public void setCmnerrmc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnerrmc,cmnerrmc.length);
   	
   }
   
     /**
	 * 	Update Cmnerrmc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnerrmc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnerrmc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Cmnerrmc with another Field
	 *	@param value
	 */
   public void setCmnerrmc(Field source) {
       replace(source,0,source.length(),beginCmnerrmc,CMNERRMC_LEN);
   	
   }  
   
     /**
	 * 	Update Cmnerrmc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnerrmc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnerrmc,CMNERRMC_LEN);
   	
   }
   
     /**
	 * 	Update Cmnerrmc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnerrmc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnerrmc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnerrp
	 *	@return cmnerrp
	 */
   public char[] getCmnerrp() throws CFException{
     if (isCmnerrpModified()) { 
        cmnerrp = refreshCmnerrp();
     }
   		return cmnerrp;
   }

  
	/**
	*  set variable cmnerrp
	*  Corresponding COBOL Variable is CMNERRP
	*  @param value
	**/
   public void setCmnerrp(char[] value) {
      cmnerrp = checkCmnerrpConstraints(value);
      serializeCmnerrp(cmnerrp);
   } 

     /**
	 * 	Update Cmnerrp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnerrp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnerrp,cmnerrp.length);
   	
   }
   
   public void setCmnerrp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnerrp,cmnerrp.length);
   	
   }
   
     /**
	 * 	Update Cmnerrp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnerrp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnerrp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Cmnerrp with another Field
	 *	@param value
	 */
   public void setCmnerrp(Field source) {
       replace(source,0,source.length(),beginCmnerrp,CMNERRP_LEN);
   	
   }  
   
     /**
	 * 	Update Cmnerrp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnerrp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnerrp,CMNERRP_LEN);
   	
   }
   
     /**
	 * 	Update Cmnerrp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnerrp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnerrp+targetIndex,targetLen);
    
   }
    /**
	 *	Returns the value of cmnerrd
	 *  Corresponding COBOL Variable is CMNERRD
	 *	@return cmnerrd
	 */
	public List<Integer> getCmnerrd() throws CFException {
        List<Integer>	list = new ArrayList<>();  
        for (int index =0;index < CMNERRD_SIZE;index++) {
        	list.add( getCmnerrd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return cmnerrd
	 */
	public int getCmnerrd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getCmnerrd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= CMNERRD_SIZE) {
             	index = CMNERRD_SIZE -1; // can't exceed max array size
             	logger.trace("cmnerrd - Array index exceeded max Size {}, resetting it to max allowed",CMNERRD_SIZE); 
	    }   
		return getInt(beginCmnerrd+ index*CMNERRD_LEN);
   }
	
	/**
	 *	Update Cmnerrd at index with the passed value
	 *  Corresponding COBOL Variable is CMNERRD
	 *  @param index
	 *	@param number
	 */
	public void setCmnerrd(int index,int number) {
	   truncated = false; // reset left over truncated flag
		setCmnerrd(index,number, true);
	}
	
	public void setCmnerrd(int index,long number) {
			setCmnerrd(index,(int)number, true);
	}
	
	/**
	 *	Update  Cmnerrd at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setCmnerrd(int index,int value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setCmnerrd(int, String, boolean), resetting it to 0",index);
		    index = 0;
        } else if (index >= CMNERRD_SIZE) {
             	index = CMNERRD_SIZE -1; // can't exceed max array size
             	logger.trace("cmnerrd - Array index exceeded max Size "+CMNERRD_SIZE+", resetting it to max allowed"); 
	    }
	    //
        //	    
		if (setModified) {
			serializeCmnerrd(index,value);
		}
   }
	/**
	 *	Returns the value of cmnwarn
	 *	@return cmnwarn
	 */
   public char[] getCmnwarn() throws CFException{
     if (isCmnwarnModified()) { 
        cmnwarn = refreshCmnwarn();
     }
   		return cmnwarn;
   }

  
	/**
	*  set variable cmnwarn
	*  Corresponding COBOL Variable is CMNWARN
	*  @param value
	**/
   public void setCmnwarn(char[] value) {
      cmnwarn = checkCmnwarnConstraints(value);
      serializeCmnwarn(cmnwarn);
   } 

     /**
	 * 	Update Cmnwarn 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnwarn(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnwarn,cmnwarn.length);
   	
   }
   
   public void setCmnwarn(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnwarn,cmnwarn.length);
   	
   }
   
     /**
	 * 	Update Cmnwarn 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnwarn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnwarn+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Cmnwarn with another Field
	 *	@param value
	 */
   public void setCmnwarn(Field source) {
       replace(source,0,source.length(),beginCmnwarn,CMNWARN_LEN);
   	
   }  
   
     /**
	 * 	Update Cmnwarn 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnwarn(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnwarn,CMNWARN_LEN);
   	
   }
   
     /**
	 * 	Update Cmnwarn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnwarn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnwarn+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnext
	 *	@return cmnext
	 */
   public char[] getCmnext() throws CFException{
     if (isCmnextModified()) { 
        cmnext = refreshCmnext();
     }
   		return cmnext;
   }

  
	/**
	*  set variable cmnext
	*  Corresponding COBOL Variable is CMNEXT
	*  @param value
	**/
   public void setCmnext(char[] value) {
      cmnext = checkCmnextConstraints(value);
      serializeCmnext(cmnext);
   } 

     /**
	 * 	Update Cmnext 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnext(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnext,cmnext.length);
   	
   }
   
   public void setCmnext(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnext,cmnext.length);
   	
   }
   
     /**
	 * 	Update Cmnext 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnext(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnext+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Cmnext with another Field
	 *	@param value
	 */
   public void setCmnext(Field source) {
       replace(source,0,source.length(),beginCmnext,CMNEXT_LEN);
   	
   }  
   
     /**
	 * 	Update Cmnext 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnext(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnext,CMNEXT_LEN);
   	
   }
   
     /**
	 * 	Update Cmnext 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnext(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnext+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes CmnSqlca
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setCmncaid(CONSTANTS.SPACE_8);
                     setCmncabc(0);
                     setCmncode(0);
         	setCmnerrml((short)0);
         setCmnerrmc(CONSTANTS.SPACE_70);
         setCmnerrp(CONSTANTS.SPACE_8);
            for (int index =0; index < CMNERRD_SIZE;index++) {
                        setCmnerrd(index,0);
            }
         setCmnwarn(CONSTANTS.SPACE_8);
         setCmnext(CONSTANTS.SPACE_8);
   }

		public static int getCmnSqlcaFieldLength() {
			return CMN_SQLCA_LENGTH;
		}

}
  

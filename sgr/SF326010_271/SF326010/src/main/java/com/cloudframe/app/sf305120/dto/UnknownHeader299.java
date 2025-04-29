package com.cloudframe.app.sf305120.dto;

/**
*  The class UnknownHeader299 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:21. using version 5.0.0.257
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class UnknownHeader299 extends UnknownHeader299Serialized {
   

						private char[] uuHeaderId299 = new char[2];

								private int uuVersion299;

								private long uuHdrLength299;

								private int uuTlvLength299;

						private char[] uuData299 = new char[999];
	
	/**
	* Constructor for UnknownHeader299
	**/
    public UnknownHeader299() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setUuHeaderId299(("??").toCharArray());
								setUuVersion299(1);
								setUuHdrLength299(0L);
								setUuTlvLength299(0);
								setUuData299(pad(999," ".toCharArray(),' ',RIGHT_PAD));
    }


 

	/**
	 *	Returns the value of uuHeaderId299
	 *	@return uuHeaderId299
	 */
   public char[] getUuHeaderId299() throws CFException{
     if (isUuHeaderId299Modified()) { 
        uuHeaderId299 = refreshUuHeaderId299();
     }
   		return uuHeaderId299;
   }

  
	/**
	*  set variable uuHeaderId299
	*  Corresponding COBOL Variable is 299-UU-HEADER-ID
	*  @param value
	**/
   public void setUuHeaderId299(char[] value) {
      uuHeaderId299 = checkUuHeaderId299Constraints(value);
      serializeUuHeaderId299(uuHeaderId299);
   } 

     /**
	 * 	Update UuHeaderId299 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUuHeaderId299(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginUuHeaderId299,uuHeaderId299.length);
   	
   }
   
   public void setUuHeaderId299(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginUuHeaderId299,uuHeaderId299.length);
   	
   }
   
     /**
	 * 	Update UuHeaderId299 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUuHeaderId299(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUuHeaderId299+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update UuHeaderId299 with another Field
	 *	@param value
	 */
   public void setUuHeaderId299(Field source) {
       replace(source,0,source.length(),beginUuHeaderId299,UU_HEADER_ID_299_LEN);
   	
   }  
   
     /**
	 * 	Update UuHeaderId299 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUuHeaderId299(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginUuHeaderId299,UU_HEADER_ID_299_LEN);
   	
   }
   
     /**
	 * 	Update UuHeaderId299 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUuHeaderId299(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUuHeaderId299+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of uuVersion299
	 *	@return uuVersion299
	 */
	public int getUuVersion299() throws CFException {
       if (isUuVersion299Modified()) { 
           uuVersion299 = refreshUuVersion299();
        }
   		return uuVersion299;
	}
	

	
	   
	/**
	 * 	Update UuVersion299 with the passed value
	 *  Corresponding COBOL Variable is 299-UU-VERSION
	 *	@param number
	 */
	public void setUuVersion299(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    uuVersion299 = checkUuVersion299MaxLimit(number); 
		serializeUuVersion299(uuVersion299);
	}
	

	public void setUuVersion299(long number) {
	    number = checkUuVersion299MaxLimit(number); // Truncate if value is beyond +/- Max range
		setUuVersion299((int)number);
	}
	
	/**
	 * 	Update UuVersion299 with the passed value
	 *	@param value (String or char[])
	 */
	public void setUuVersion299(char[] value) throws CFException {
		 uuVersion299 = serializeUuVersion299(value);
	}
	/**
	 * 	Update UuVersion299 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setUuVersion299String(char[] value) throws CFException {
		 setUuVersion299(value);
	}
	/**
	 *	Returns the value of uuHdrLength299
	 *	@return uuHdrLength299
	 */
	public long getUuHdrLength299() throws CFException {
       if (isUuHdrLength299Modified()) { 
           uuHdrLength299 = refreshUuHdrLength299();
        }
   		return uuHdrLength299;
	}
	

	
	   
	/**
	 * 	Update UuHdrLength299 with the passed value
	 *  Corresponding COBOL Variable is 299-UU-HDR-LENGTH
	 *	@param number
	 */
	public void setUuHdrLength299(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    uuHdrLength299 = checkUuHdrLength299MaxLimit(number); 
		serializeUuHdrLength299(uuHdrLength299);
	}
	

	/**
	 * 	Update UuHdrLength299 with the passed value
	 *	@param value (String or char[])
	 */
	public void setUuHdrLength299(char[] value) throws CFException {
		 uuHdrLength299 = serializeUuHdrLength299(value);
	}
	/**
	 * 	Update UuHdrLength299 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setUuHdrLength299String(char[] value) throws CFException {
		 setUuHdrLength299(value);
	}
	/**
	 *	Returns the value of uuTlvLength299
	 *	@return uuTlvLength299
	 */
	public int getUuTlvLength299() throws CFException {
       if (isUuTlvLength299Modified()) { 
           uuTlvLength299 = refreshUuTlvLength299();
        }
   		return uuTlvLength299;
	}
	

	
	   
	/**
	 * 	Update UuTlvLength299 with the passed value
	 *  Corresponding COBOL Variable is 299-UU-TLV-LENGTH
	 *	@param number
	 */
	public void setUuTlvLength299(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    uuTlvLength299 = checkUuTlvLength299MaxLimit(number); 
		serializeUuTlvLength299(uuTlvLength299);
	}
	

	public void setUuTlvLength299(long number) {
	    number = checkUuTlvLength299MaxLimit(number); // Truncate if value is beyond +/- Max range
		setUuTlvLength299((int)number);
	}
	
	/**
	 * 	Update UuTlvLength299 with the passed value
	 *	@param value (String or char[])
	 */
	public void setUuTlvLength299(char[] value) throws CFException {
		 uuTlvLength299 = serializeUuTlvLength299(value);
	}
	/**
	 * 	Update UuTlvLength299 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setUuTlvLength299String(char[] value) throws CFException {
		 setUuTlvLength299(value);
	}
	/**
	 *	Returns the value of uuData299
	 *	@return uuData299
	 */
   public char[] getUuData299() throws CFException{
     if (isUuData299Modified()) { 
        uuData299 = refreshUuData299();
     }
   		return uuData299;
   }

  
	/**
	*  set variable uuData299
	*  Corresponding COBOL Variable is 299-UU-DATA
	*  @param value
	**/
   public void setUuData299(char[] value) {
      uuData299 = checkUuData299Constraints(value);
      serializeUuData299(uuData299);
   } 

     /**
	 * 	Update UuData299 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUuData299(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginUuData299,uuData299.length);
   	
   }
   
   public void setUuData299(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginUuData299,uuData299.length);
   	
   }
   
     /**
	 * 	Update UuData299 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUuData299(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUuData299+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update UuData299 with another Field
	 *	@param value
	 */
   public void setUuData299(Field source) {
       replace(source,0,source.length(),beginUuData299,UU_DATA_299_LEN);
   	
   }  
   
     /**
	 * 	Update UuData299 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUuData299(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginUuData299,UU_DATA_299_LEN);
   	
   }
   
     /**
	 * 	Update UuData299 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUuData299(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUuData299+targetIndex,targetLen);
    
   }

	
	
	

		public static int getUnknownHeader299FieldLength() {
			return UNKNOWN_HEADER_299_LENGTH;
		}

}
  

package com.cloudframe.app.sf305120.dto;

/**
*  The class InHeaderData290 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:12. using version 5.0.0.254
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class InHeaderData290 extends InHeaderData290Serialized {
   

						private char[] inHeaderId290 = new char[2];

								private int inVersion290;

								private long inHdrLength290;

								private int inTlvLength290;

						private char[] inServiceResults290 = new char[1006];
	
	/**
	* Constructor for InHeaderData290
	**/
    public InHeaderData290() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setInHeaderId290(("RE").toCharArray());
								setInVersion290(1);
								setInHdrLength290(0L);
								setInTlvLength290(0);
								setInServiceResults290("    000                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ".toCharArray());
    }


 

	/**
	 *	Returns the value of inHeaderId290
	 *	@return inHeaderId290
	 */
   public char[] getInHeaderId290() throws CFException{
     if (isInHeaderId290Modified()) { 
        inHeaderId290 = refreshInHeaderId290();
     }
   		return inHeaderId290;
   }

  
	/**
	*  set variable inHeaderId290
	*  Corresponding COBOL Variable is 290-IN-HEADER-ID
	*  @param value
	**/
   public void setInHeaderId290(char[] value) {
      inHeaderId290 = checkInHeaderId290Constraints(value);
      serializeInHeaderId290(inHeaderId290);
   } 

     /**
	 * 	Update InHeaderId290 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setInHeaderId290(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginInHeaderId290,inHeaderId290.length);
   	
   }
   
   public void setInHeaderId290(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginInHeaderId290,inHeaderId290.length);
   	
   }
   
     /**
	 * 	Update InHeaderId290 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInHeaderId290(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInHeaderId290+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update InHeaderId290 with another Field
	 *	@param value
	 */
   public void setInHeaderId290(Field source) {
       replace(source,0,source.length(),beginInHeaderId290,IN_HEADER_ID_290_LEN);
   	
   }  
   
     /**
	 * 	Update InHeaderId290 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setInHeaderId290(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginInHeaderId290,IN_HEADER_ID_290_LEN);
   	
   }
   
     /**
	 * 	Update InHeaderId290 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInHeaderId290(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInHeaderId290+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of inVersion290
	 *	@return inVersion290
	 */
	public int getInVersion290() throws CFException {
       if (isInVersion290Modified()) { 
           inVersion290 = refreshInVersion290();
        }
   		return inVersion290;
	}
	

	
	   
	/**
	 * 	Update InVersion290 with the passed value
	 *  Corresponding COBOL Variable is 290-IN-VERSION
	 *	@param number
	 */
	public void setInVersion290(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    inVersion290 = checkInVersion290MaxLimit(number); 
		serializeInVersion290(inVersion290);
	}
	

	public void setInVersion290(long number) {
	    number = checkInVersion290MaxLimit(number); // Truncate if value is beyond +/- Max range
		setInVersion290((int)number);
	}
	
	/**
	 * 	Update InVersion290 with the passed value
	 *	@param value (String or char[])
	 */
	public void setInVersion290(char[] value) throws CFException {
		 inVersion290 = serializeInVersion290(value);
	}
	/**
	 * 	Update InVersion290 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setInVersion290String(char[] value) throws CFException {
		 setInVersion290(value);
	}
	/**
	 *	Returns the value of inHdrLength290
	 *	@return inHdrLength290
	 */
	public long getInHdrLength290() throws CFException {
       if (isInHdrLength290Modified()) { 
           inHdrLength290 = refreshInHdrLength290();
        }
   		return inHdrLength290;
	}
	

	
	   
	/**
	 * 	Update InHdrLength290 with the passed value
	 *  Corresponding COBOL Variable is 290-IN-HDR-LENGTH
	 *	@param number
	 */
	public void setInHdrLength290(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    inHdrLength290 = checkInHdrLength290MaxLimit(number); 
		serializeInHdrLength290(inHdrLength290);
	}
	

	/**
	 * 	Update InHdrLength290 with the passed value
	 *	@param value (String or char[])
	 */
	public void setInHdrLength290(char[] value) throws CFException {
		 inHdrLength290 = serializeInHdrLength290(value);
	}
	/**
	 * 	Update InHdrLength290 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setInHdrLength290String(char[] value) throws CFException {
		 setInHdrLength290(value);
	}
	/**
	 *	Returns the value of inTlvLength290
	 *	@return inTlvLength290
	 */
	public int getInTlvLength290() throws CFException {
       if (isInTlvLength290Modified()) { 
           inTlvLength290 = refreshInTlvLength290();
        }
   		return inTlvLength290;
	}
	

	
	   
	/**
	 * 	Update InTlvLength290 with the passed value
	 *  Corresponding COBOL Variable is 290-IN-TLV-LENGTH
	 *	@param number
	 */
	public void setInTlvLength290(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    inTlvLength290 = checkInTlvLength290MaxLimit(number); 
		serializeInTlvLength290(inTlvLength290);
	}
	

	public void setInTlvLength290(long number) {
	    number = checkInTlvLength290MaxLimit(number); // Truncate if value is beyond +/- Max range
		setInTlvLength290((int)number);
	}
	
	/**
	 * 	Update InTlvLength290 with the passed value
	 *	@param value (String or char[])
	 */
	public void setInTlvLength290(char[] value) throws CFException {
		 inTlvLength290 = serializeInTlvLength290(value);
	}
	/**
	 * 	Update InTlvLength290 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setInTlvLength290String(char[] value) throws CFException {
		 setInTlvLength290(value);
	}
	/**
	 *	Returns the value of inServiceResults290
	 *	@return inServiceResults290
	 */
   public char[] getInServiceResults290() throws CFException{
     if (isInServiceResults290Modified()) { 
        inServiceResults290 = refreshInServiceResults290();
     }
   		return inServiceResults290;
   }

  
	/**
	*  set variable inServiceResults290
	*  Corresponding COBOL Variable is 290-IN-SERVICE-RESULTS
	*  @param value
	**/
   public void setInServiceResults290(char[] value) {
      inServiceResults290 = checkInServiceResults290Constraints(value);
      serializeInServiceResults290(inServiceResults290);
   } 

     /**
	 * 	Update InServiceResults290 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setInServiceResults290(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginInServiceResults290,inServiceResults290.length);
   	
   }
   
   public void setInServiceResults290(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginInServiceResults290,inServiceResults290.length);
   	
   }
   
     /**
	 * 	Update InServiceResults290 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInServiceResults290(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInServiceResults290+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update InServiceResults290 with another Field
	 *	@param value
	 */
   public void setInServiceResults290(Field source) {
       replace(source,0,source.length(),beginInServiceResults290,IN_SERVICE_RESULTS_290_LEN);
   	
   }  
   
     /**
	 * 	Update InServiceResults290 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setInServiceResults290(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginInServiceResults290,IN_SERVICE_RESULTS_290_LEN);
   	
   }
   
     /**
	 * 	Update InServiceResults290 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInServiceResults290(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInServiceResults290+targetIndex,targetLen);
    
   }

	
	
	

		public static int getInHeaderData290FieldLength() {
			return IN_HEADER_DATA_290_LENGTH;
		}

}
  

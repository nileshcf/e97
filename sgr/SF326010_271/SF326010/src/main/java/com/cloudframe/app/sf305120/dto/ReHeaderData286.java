package com.cloudframe.app.sf305120.dto;

/**
*  The class ReHeaderData286 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:25. using version 5.0.0.254
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ReHeaderData286 extends ReHeaderData286Serialized {
   

						private char[] reHeaderId286 = new char[2];

								private int reVersion286;

								private long reHdrLength286;

								private int reTlvLength286;

						private char[] reServiceResults286 = new char[1006];
	
	/**
	* Constructor for ReHeaderData286
	**/
    public ReHeaderData286() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setReHeaderId286(("RE").toCharArray());
								setReVersion286(1);
								setReHdrLength286(0L);
								setReTlvLength286(0);
								setReServiceResults286("    000                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ".toCharArray());
    }


 

	/**
	 *	Returns the value of reHeaderId286
	 *	@return reHeaderId286
	 */
   public char[] getReHeaderId286() throws CFException{
     if (isReHeaderId286Modified()) { 
        reHeaderId286 = refreshReHeaderId286();
     }
   		return reHeaderId286;
   }

  
	/**
	*  set variable reHeaderId286
	*  Corresponding COBOL Variable is 286-RE-HEADER-ID
	*  @param value
	**/
   public void setReHeaderId286(char[] value) {
      reHeaderId286 = checkReHeaderId286Constraints(value);
      serializeReHeaderId286(reHeaderId286);
   } 

     /**
	 * 	Update ReHeaderId286 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setReHeaderId286(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginReHeaderId286,reHeaderId286.length);
   	
   }
   
   public void setReHeaderId286(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginReHeaderId286,reHeaderId286.length);
   	
   }
   
     /**
	 * 	Update ReHeaderId286 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setReHeaderId286(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginReHeaderId286+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ReHeaderId286 with another Field
	 *	@param value
	 */
   public void setReHeaderId286(Field source) {
       replace(source,0,source.length(),beginReHeaderId286,RE_HEADER_ID_286_LEN);
   	
   }  
   
     /**
	 * 	Update ReHeaderId286 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setReHeaderId286(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginReHeaderId286,RE_HEADER_ID_286_LEN);
   	
   }
   
     /**
	 * 	Update ReHeaderId286 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setReHeaderId286(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginReHeaderId286+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of reVersion286
	 *	@return reVersion286
	 */
	public int getReVersion286() throws CFException {
       if (isReVersion286Modified()) { 
           reVersion286 = refreshReVersion286();
        }
   		return reVersion286;
	}
	

	
	   
	/**
	 * 	Update ReVersion286 with the passed value
	 *  Corresponding COBOL Variable is 286-RE-VERSION
	 *	@param number
	 */
	public void setReVersion286(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    reVersion286 = checkReVersion286MaxLimit(number); 
		serializeReVersion286(reVersion286);
	}
	

	public void setReVersion286(long number) {
	    number = checkReVersion286MaxLimit(number); // Truncate if value is beyond +/- Max range
		setReVersion286((int)number);
	}
	
	/**
	 * 	Update ReVersion286 with the passed value
	 *	@param value (String or char[])
	 */
	public void setReVersion286(char[] value) throws CFException {
		 reVersion286 = serializeReVersion286(value);
	}
	/**
	 * 	Update ReVersion286 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setReVersion286String(char[] value) throws CFException {
		 setReVersion286(value);
	}
	/**
	 *	Returns the value of reHdrLength286
	 *	@return reHdrLength286
	 */
	public long getReHdrLength286() throws CFException {
       if (isReHdrLength286Modified()) { 
           reHdrLength286 = refreshReHdrLength286();
        }
   		return reHdrLength286;
	}
	

	
	   
	/**
	 * 	Update ReHdrLength286 with the passed value
	 *  Corresponding COBOL Variable is 286-RE-HDR-LENGTH
	 *	@param number
	 */
	public void setReHdrLength286(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    reHdrLength286 = checkReHdrLength286MaxLimit(number); 
		serializeReHdrLength286(reHdrLength286);
	}
	

	/**
	 * 	Update ReHdrLength286 with the passed value
	 *	@param value (String or char[])
	 */
	public void setReHdrLength286(char[] value) throws CFException {
		 reHdrLength286 = serializeReHdrLength286(value);
	}
	/**
	 * 	Update ReHdrLength286 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setReHdrLength286String(char[] value) throws CFException {
		 setReHdrLength286(value);
	}
	/**
	 *	Returns the value of reTlvLength286
	 *	@return reTlvLength286
	 */
	public int getReTlvLength286() throws CFException {
       if (isReTlvLength286Modified()) { 
           reTlvLength286 = refreshReTlvLength286();
        }
   		return reTlvLength286;
	}
	

	
	   
	/**
	 * 	Update ReTlvLength286 with the passed value
	 *  Corresponding COBOL Variable is 286-RE-TLV-LENGTH
	 *	@param number
	 */
	public void setReTlvLength286(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    reTlvLength286 = checkReTlvLength286MaxLimit(number); 
		serializeReTlvLength286(reTlvLength286);
	}
	

	public void setReTlvLength286(long number) {
	    number = checkReTlvLength286MaxLimit(number); // Truncate if value is beyond +/- Max range
		setReTlvLength286((int)number);
	}
	
	/**
	 * 	Update ReTlvLength286 with the passed value
	 *	@param value (String or char[])
	 */
	public void setReTlvLength286(char[] value) throws CFException {
		 reTlvLength286 = serializeReTlvLength286(value);
	}
	/**
	 * 	Update ReTlvLength286 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setReTlvLength286String(char[] value) throws CFException {
		 setReTlvLength286(value);
	}
	/**
	 *	Returns the value of reServiceResults286
	 *	@return reServiceResults286
	 */
   public char[] getReServiceResults286() throws CFException{
     if (isReServiceResults286Modified()) { 
        reServiceResults286 = refreshReServiceResults286();
     }
   		return reServiceResults286;
   }

  
	/**
	*  set variable reServiceResults286
	*  Corresponding COBOL Variable is 286-RE-SERVICE-RESULTS
	*  @param value
	**/
   public void setReServiceResults286(char[] value) {
      reServiceResults286 = checkReServiceResults286Constraints(value);
      serializeReServiceResults286(reServiceResults286);
   } 

     /**
	 * 	Update ReServiceResults286 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setReServiceResults286(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginReServiceResults286,reServiceResults286.length);
   	
   }
   
   public void setReServiceResults286(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginReServiceResults286,reServiceResults286.length);
   	
   }
   
     /**
	 * 	Update ReServiceResults286 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setReServiceResults286(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginReServiceResults286+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ReServiceResults286 with another Field
	 *	@param value
	 */
   public void setReServiceResults286(Field source) {
       replace(source,0,source.length(),beginReServiceResults286,RE_SERVICE_RESULTS_286_LEN);
   	
   }  
   
     /**
	 * 	Update ReServiceResults286 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setReServiceResults286(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginReServiceResults286,RE_SERVICE_RESULTS_286_LEN);
   	
   }
   
     /**
	 * 	Update ReServiceResults286 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setReServiceResults286(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginReServiceResults286+targetIndex,targetLen);
    
   }

	
	
	

		public static int getReHeaderData286FieldLength() {
			return RE_HEADER_DATA_286_LENGTH;
		}

}
  

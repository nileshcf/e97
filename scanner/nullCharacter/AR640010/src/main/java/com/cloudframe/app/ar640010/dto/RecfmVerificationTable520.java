package com.cloudframe.app.ar640010.dto;

/**
*  The class RecfmVerificationTable520 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RecfmVerificationTable520 extends RecfmVerificationTable520Serialized {
   

								private short recfmTblMax520;

						private char[] recfmArray520 = new char[25];
				private RecfmTable520 recfmTable520 = new RecfmTable520();
	
	/**
	* Constructor for RecfmVerificationTable520
	**/
    public RecfmVerificationTable520() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			recfmTable520.setParent(this,getStartOffset() + 2);
	   	/*  end of offset */
								setRecfmTblMax520((short)5);
								setRecfmArray520(("FBFB VBVB U U  FSFBSVSVBS").toCharArray());
    }


 

	/**
	 *	Returns the value of recfmTblMax520
	 *	@return recfmTblMax520
	 */
	public short getRecfmTblMax520() throws CFException {
        if (isRecfmTblMax520Modified()) { 
           recfmTblMax520 = refreshRecfmTblMax520();
        }
   		return recfmTblMax520;
	}
	
	/**
	 * 	Update RecfmTblMax520 with the passed value
	 *  Corresponding COBOL Variable is 520-RECFM-TBL-MAX
	 *	@param number
	 */
	public void setRecfmTblMax520(short number) {
	     // Truncate if the number is beyond +/- Max range
	    recfmTblMax520 = checkRecfmTblMax520MaxLimit(number); 
		serializeRecfmTblMax520(recfmTblMax520);
	}

	public void setRecfmTblMax520(int number) {
	    number = checkRecfmTblMax520MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setRecfmTblMax520((short)number);
	}
	public void setRecfmTblMax520(long number) {
	    number = checkRecfmTblMax520MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setRecfmTblMax520((short)number);
	}
	

	/**
	 *	Returns the value of recfmArray520
	 *	@return recfmArray520
	 */
   public char[] getRecfmArray520() throws CFException{
     if (isRecfmArray520Modified()) { 
        recfmArray520 = refreshRecfmArray520();
     }
   		return recfmArray520;
   }

  
	/**
	*  set variable recfmArray520
	*  Corresponding COBOL Variable is 520-RECFM-ARRAY
	*  @param value
	**/
   public void setRecfmArray520(char[] value) {
      recfmArray520 = checkRecfmArray520Constraints(value);
      serializeRecfmArray520(recfmArray520);
   } 

     /**
	 * 	Update RecfmArray520 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRecfmArray520(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRecfmArray520,recfmArray520.length);
   	
   }
   
   public void setRecfmArray520(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRecfmArray520,recfmArray520.length);
   	
   }
   
     /**
	 * 	Update RecfmArray520 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRecfmArray520(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRecfmArray520+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RecfmArray520 with another Field
	 *	@param value
	 */
   public void setRecfmArray520(Field source) {
       replace(source,0,source.length(),beginRecfmArray520,RECFM_ARRAY_520_LEN);
   	
   }  
   
     /**
	 * 	Update RecfmArray520 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRecfmArray520(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRecfmArray520,RECFM_ARRAY_520_LEN);
   	
   }
   
     /**
	 * 	Update RecfmArray520 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRecfmArray520(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRecfmArray520+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of recfmTable520
	 *	@return recfmTable520
	 */   
	 public RecfmTable520 getRecfmTable520() {
   	return recfmTable520;
   }
   /**
	* 	Update RecfmTable520 with the passed value
	*   Corresponding COBOL Variable is 520-RECFM-TABLE
	*	@param value
	*/
   public void setRecfmTable520(char[] value) {
      recfmTable520.setString(value); 
   }   
    
     /**
	 * 	Update RecfmTable520 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRecfmTable520(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,recfmTable520.begin,recfmTable520.length());
   }
   
     /**
	 * 	Update RecfmTable520 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRecfmTable520(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,recfmTable520.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update RecfmTable520 with another Field
	 *	@param value
	 */
   public void setRecfmTable520(Field source) {
   	replace(source,0,source.length(),recfmTable520.begin,recfmTable520.length());
   }  
   
     /**
	 * 	Update RecfmTable520 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRecfmTable520(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,recfmTable520.begin,recfmTable520.length());
   }
   
     /**
	 * 	Update RecfmTable520 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRecfmTable520(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,recfmTable520.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getRecfmVerificationTable520FieldLength() {
			return RECFM_VERIFICATION_TABLE_520_LENGTH;
		}

}
  

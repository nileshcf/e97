package com.cloudframe.app.ip662010.dto;

/**
*  The class LastSubfldTag800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:58. using version 5.0.0.256
**/


import com.cloudframe.app.ip662010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class LastSubfldTag800 extends LastSubfldTag800Serialized { 
   

						private char[] lastSubId800 = Field.fillLowValue(4);

								private short lastSubfldNo800;

								private short lastSubStart800;

								private short lastSubLngth800;
	
	/**
	* Constructor for LastSubfldTag800
	**/
    public LastSubfldTag800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of lastSubId800
	 *	@return lastSubId800
	 */
   public char[] getLastSubId800() throws CFException{
     if (isLastSubId800Modified()) { 
        lastSubId800 = refreshLastSubId800();
     }
   		return lastSubId800;
   }

  
	/**
	*  set variable lastSubId800
	*  Corresponding COBOL Variable is 800-LAST-SUB-ID
	*  @param value
	**/
   public void setLastSubId800(char[] value) {
      lastSubId800 = checkLastSubId800Constraints(value);
      serializeLastSubId800(lastSubId800);
   } 

     /**
	 * 	Update LastSubId800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLastSubId800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLastSubId800,lastSubId800.length);
   	
   }
   
   public void setLastSubId800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLastSubId800,lastSubId800.length);
   	
   }
   
     /**
	 * 	Update LastSubId800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLastSubId800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLastSubId800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LastSubId800 with another Field
	 *	@param value
	 */
   public void setLastSubId800(Field source) {
       replace(source,0,source.length(),beginLastSubId800,LAST_SUB_ID_800_LEN);
   	
   }  
   
     /**
	 * 	Update LastSubId800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLastSubId800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLastSubId800,LAST_SUB_ID_800_LEN);
   	
   }
   
     /**
	 * 	Update LastSubId800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLastSubId800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLastSubId800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lastSubfldNo800
	 *	@return lastSubfldNo800
	 */
	public short getLastSubfldNo800() throws CFException {
        if (isLastSubfldNo800Modified()) { 
           lastSubfldNo800 = refreshLastSubfldNo800();
        }
   		return lastSubfldNo800;
	}
	
	/**
	 * 	Update LastSubfldNo800 with the passed value
	 *  Corresponding COBOL Variable is 800-LAST-SUBFLD-NO
	 *	@param number
	 */
	public void setLastSubfldNo800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    lastSubfldNo800 = checkLastSubfldNo800MaxLimit(number); 
		serializeLastSubfldNo800(lastSubfldNo800);
	}

	public void setLastSubfldNo800(int number) {
	    number = checkLastSubfldNo800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setLastSubfldNo800((short)number);
	}
	public void setLastSubfldNo800(long number) {
	    number = checkLastSubfldNo800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setLastSubfldNo800((short)number);
	}
	

	/**
	 *	Returns the value of lastSubStart800
	 *	@return lastSubStart800
	 */
	public short getLastSubStart800() throws CFException {
        if (isLastSubStart800Modified()) { 
           lastSubStart800 = refreshLastSubStart800();
        }
   		return lastSubStart800;
	}
	
	/**
	 * 	Update LastSubStart800 with the passed value
	 *  Corresponding COBOL Variable is 800-LAST-SUB-START
	 *	@param number
	 */
	public void setLastSubStart800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    lastSubStart800 = checkLastSubStart800MaxLimit(number); 
		serializeLastSubStart800(lastSubStart800);
	}

	public void setLastSubStart800(int number) {
	    number = checkLastSubStart800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setLastSubStart800((short)number);
	}
	public void setLastSubStart800(long number) {
	    number = checkLastSubStart800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setLastSubStart800((short)number);
	}
	

	/**
	 *	Returns the value of lastSubLngth800
	 *	@return lastSubLngth800
	 */
	public short getLastSubLngth800() throws CFException {
        if (isLastSubLngth800Modified()) { 
           lastSubLngth800 = refreshLastSubLngth800();
        }
   		return lastSubLngth800;
	}
	
	/**
	 * 	Update LastSubLngth800 with the passed value
	 *  Corresponding COBOL Variable is 800-LAST-SUB-LNGTH
	 *	@param number
	 */
	public void setLastSubLngth800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    lastSubLngth800 = checkLastSubLngth800MaxLimit(number); 
		serializeLastSubLngth800(lastSubLngth800);
	}

	public void setLastSubLngth800(int number) {
	    number = checkLastSubLngth800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setLastSubLngth800((short)number);
	}
	public void setLastSubLngth800(long number) {
	    number = checkLastSubLngth800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setLastSubLngth800((short)number);
	}
	


	
	
	

		public static int getLastSubfldTag800FieldLength() {
			return LAST_SUBFLD_TAG_800_LENGTH;
		}

}
  

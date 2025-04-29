package com.cloudframe.app.ip662010.dto;

/**
*  The class NewTag800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:24. using version 5.0.0.254
**/


import com.cloudframe.app.ip662010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class NewTag800 extends NewTag800Serialized {
   

								private short newType800;

								private short newNo800;

								private short newSubfldNo800;

								private short newStart800;

								private short newLength800;

						private char[] newStatus800 = new char[1];
	
	/**
	* Constructor for NewTag800
	**/
    public NewTag800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setNewStatus800(fillSpace(1));
    }


 

	/**
	 *	Returns the value of newType800
	 *	@return newType800
	 */
	public short getNewType800() throws CFException {
        if (isNewType800Modified()) { 
           newType800 = refreshNewType800();
        }
   		return newType800;
	}
	
	/**
	 * 	Update NewType800 with the passed value
	 *  Corresponding COBOL Variable is 800-NEW-TYPE
	 *	@param number
	 */
	public void setNewType800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    newType800 = checkNewType800MaxLimit(number); 
		serializeNewType800(newType800);
	}

	public void setNewType800(int number) {
	    number = checkNewType800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setNewType800((short)number);
	}
	public void setNewType800(long number) {
	    number = checkNewType800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setNewType800((short)number);
	}
	

	/**
	 *	Returns the value of newNo800
	 *	@return newNo800
	 */
	public short getNewNo800() throws CFException {
        if (isNewNo800Modified()) { 
           newNo800 = refreshNewNo800();
        }
   		return newNo800;
	}
	
	/**
	 * 	Update NewNo800 with the passed value
	 *  Corresponding COBOL Variable is 800-NEW-NO
	 *	@param number
	 */
	public void setNewNo800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    newNo800 = checkNewNo800MaxLimit(number); 
		serializeNewNo800(newNo800);
	}

	public void setNewNo800(int number) {
	    number = checkNewNo800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setNewNo800((short)number);
	}
	public void setNewNo800(long number) {
	    number = checkNewNo800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setNewNo800((short)number);
	}
	

	/**
	 *	Returns the value of newSubfldNo800
	 *	@return newSubfldNo800
	 */
	public short getNewSubfldNo800() throws CFException {
        if (isNewSubfldNo800Modified()) { 
           newSubfldNo800 = refreshNewSubfldNo800();
        }
   		return newSubfldNo800;
	}
	
	/**
	 * 	Update NewSubfldNo800 with the passed value
	 *  Corresponding COBOL Variable is 800-NEW-SUBFLD-NO
	 *	@param number
	 */
	public void setNewSubfldNo800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    newSubfldNo800 = checkNewSubfldNo800MaxLimit(number); 
		serializeNewSubfldNo800(newSubfldNo800);
	}

	public void setNewSubfldNo800(int number) {
	    number = checkNewSubfldNo800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setNewSubfldNo800((short)number);
	}
	public void setNewSubfldNo800(long number) {
	    number = checkNewSubfldNo800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setNewSubfldNo800((short)number);
	}
	

	/**
	 *	Returns the value of newStart800
	 *	@return newStart800
	 */
	public short getNewStart800() throws CFException {
        if (isNewStart800Modified()) { 
           newStart800 = refreshNewStart800();
        }
   		return newStart800;
	}
	
	/**
	 * 	Update NewStart800 with the passed value
	 *  Corresponding COBOL Variable is 800-NEW-START
	 *	@param number
	 */
	public void setNewStart800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    newStart800 = checkNewStart800MaxLimit(number); 
		serializeNewStart800(newStart800);
	}

	public void setNewStart800(int number) {
	    number = checkNewStart800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setNewStart800((short)number);
	}
	public void setNewStart800(long number) {
	    number = checkNewStart800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setNewStart800((short)number);
	}
	

	/**
	 *	Returns the value of newLength800
	 *	@return newLength800
	 */
	public short getNewLength800() throws CFException {
        if (isNewLength800Modified()) { 
           newLength800 = refreshNewLength800();
        }
   		return newLength800;
	}
	
	/**
	 * 	Update NewLength800 with the passed value
	 *  Corresponding COBOL Variable is 800-NEW-LENGTH
	 *	@param number
	 */
	public void setNewLength800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    newLength800 = checkNewLength800MaxLimit(number); 
		serializeNewLength800(newLength800);
	}

	public void setNewLength800(int number) {
	    number = checkNewLength800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setNewLength800((short)number);
	}
	public void setNewLength800(long number) {
	    number = checkNewLength800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setNewLength800((short)number);
	}
	

	/**
	 *	Returns the value of newStatus800
	 *	@return newStatus800
	 */
   public char[] getNewStatus800() throws CFException{
     if (isNewStatus800Modified()) { 
        newStatus800 = refreshNewStatus800();
     }
   		return newStatus800;
   }

  
	/**
	*  set variable newStatus800
	*  Corresponding COBOL Variable is 800-NEW-STATUS
	*  @param value
	**/
   public void setNewStatus800(char[] value) {
      newStatus800 = checkNewStatus800Constraints(value);
      serializeNewStatus800(newStatus800);
   } 

     /**
	 * 	Update NewStatus800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setNewStatus800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginNewStatus800,newStatus800.length);
   	
   }
   
   public void setNewStatus800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginNewStatus800,newStatus800.length);
   	
   }
   
     /**
	 * 	Update NewStatus800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setNewStatus800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNewStatus800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update NewStatus800 with another Field
	 *	@param value
	 */
   public void setNewStatus800(Field source) {
       replace(source,0,source.length(),beginNewStatus800,NEW_STATUS_800_LEN);
   	
   }  
   
     /**
	 * 	Update NewStatus800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setNewStatus800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginNewStatus800,NEW_STATUS_800_LEN);
   	
   }
   
     /**
	 * 	Update NewStatus800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setNewStatus800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNewStatus800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getNewTag800FieldLength() {
			return NEW_TAG_800_LENGTH;
		}

}
  

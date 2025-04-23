package com.cloudframe.app.ip662010.dto;

/**
*  The class CurrentTag800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:21. using version 5.0.0.254
**/


import com.cloudframe.app.ip662010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CurrentTag800 extends CurrentTag800Serialized {
   
				private Id800 id800 = new Id800();

								private short subfldNo800;

								private short start800;

								private short length800;
	
	/**
	* Constructor for CurrentTag800
	**/
    public CurrentTag800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			id800.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of id800
	 *	@return id800
	 */   
	 public Id800 getId800() {
   	return id800;
   }
   /**
	* 	Update Id800 with the passed value
	*   Corresponding COBOL Variable is 800-ID
	*	@param value
	*/
   public void setId800(char[] value) {
      id800.setString(value); 
   }   
    
     /**
	 * 	Update Id800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setId800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,id800.begin,id800.length());
   }
   
     /**
	 * 	Update Id800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setId800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,id800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Id800 with another Field
	 *	@param value
	 */
   public void setId800(Field source) {
   	replace(source,0,source.length(),id800.begin,id800.length());
   }  
   
     /**
	 * 	Update Id800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setId800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,id800.begin,id800.length());
   }
   
     /**
	 * 	Update Id800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setId800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,id800.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of subfldNo800
	 *	@return subfldNo800
	 */
	public short getSubfldNo800() throws CFException {
        if (isSubfldNo800Modified()) { 
           subfldNo800 = refreshSubfldNo800();
        }
   		return subfldNo800;
	}
	
	/**
	 * 	Update SubfldNo800 with the passed value
	 *  Corresponding COBOL Variable is 800-SUBFLD-NO
	 *	@param number
	 */
	public void setSubfldNo800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    subfldNo800 = checkSubfldNo800MaxLimit(number); 
		serializeSubfldNo800(subfldNo800);
	}

	public void setSubfldNo800(int number) {
	    number = checkSubfldNo800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSubfldNo800((short)number);
	}
	public void setSubfldNo800(long number) {
	    number = checkSubfldNo800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSubfldNo800((short)number);
	}
	

	/**
	 *	Returns the value of start800
	 *	@return start800
	 */
	public short getStart800() throws CFException {
        if (isStart800Modified()) { 
           start800 = refreshStart800();
        }
   		return start800;
	}
	
	/**
	 * 	Update Start800 with the passed value
	 *  Corresponding COBOL Variable is 800-START
	 *	@param number
	 */
	public void setStart800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    start800 = checkStart800MaxLimit(number); 
		serializeStart800(start800);
	}

	public void setStart800(int number) {
	    number = checkStart800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setStart800((short)number);
	}
	public void setStart800(long number) {
	    number = checkStart800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setStart800((short)number);
	}
	

	/**
	 *	Returns the value of length800
	 *	@return length800
	 */
	public short getLength800() throws CFException {
        if (isLength800Modified()) { 
           length800 = refreshLength800();
        }
   		return length800;
	}
	
	/**
	 * 	Update Length800 with the passed value
	 *  Corresponding COBOL Variable is 800-LENGTH
	 *	@param number
	 */
	public void setLength800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    length800 = checkLength800MaxLimit(number); 
		serializeLength800(length800);
	}

	public void setLength800(int number) {
	    number = checkLength800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setLength800((short)number);
	}
	public void setLength800(long number) {
	    number = checkLength800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setLength800((short)number);
	}
	


	
	
	

		public static int getCurrentTag800FieldLength() {
			return CURRENT_TAG_800_LENGTH;
		}

}
  

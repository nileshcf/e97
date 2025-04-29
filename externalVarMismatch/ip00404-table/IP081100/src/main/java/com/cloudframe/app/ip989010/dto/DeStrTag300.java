package com.cloudframe.app.ip989010.dto;

/**
*  The class DeStrTag300 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:34. using version 5.0.0.254
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class DeStrTag300 extends DeStrTag300Serialized {
   


								private int deStrCd300;

	
	/**
	* Constructor for DeStrTag300
	**/
    public DeStrTag300() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("<de code=\"").toCharArray()
             , getStartOffset() + 0
             ,10
             );
								setDeStrCd300(0);
       replaceValue( // serialize and save the value
             ("\">").toCharArray()
             , getStartOffset() + 13
             ,2
             );
    }


 

	/**
	 *	Returns the value of deStrCd300
	 *	@return deStrCd300
	 */
	public int getDeStrCd300() throws CFException {
       if (isDeStrCd300Modified()) { 
           deStrCd300 = refreshDeStrCd300();
        }
   		return deStrCd300;
	}
	

	
	   
	/**
	 * 	Update DeStrCd300 with the passed value
	 *  Corresponding COBOL Variable is 300-DE-STR-CD
	 *	@param number
	 */
	public void setDeStrCd300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    deStrCd300 = checkDeStrCd300MaxLimit(number); 
		serializeDeStrCd300(deStrCd300);
	}
	

	public void setDeStrCd300(long number) {
	    number = checkDeStrCd300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setDeStrCd300((int)number);
	}
	
	/**
	 * 	Update DeStrCd300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setDeStrCd300(char[] value) throws CFException {
		 deStrCd300 = serializeDeStrCd300(value);
	}
	/**
	 * 	Update DeStrCd300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDeStrCd300String(char[] value) throws CFException {
		 setDeStrCd300(value);
	}

	
	
	

		public static int getDeStrTag300FieldLength() {
			return DE_STR_TAG_300_LENGTH;
		}

}
  

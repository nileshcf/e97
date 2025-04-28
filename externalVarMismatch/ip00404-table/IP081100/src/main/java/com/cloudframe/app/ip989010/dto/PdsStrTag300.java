package com.cloudframe.app.ip989010.dto;

/**
*  The class PdsStrTag300 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class PdsStrTag300 extends PdsStrTag300Serialized {
   


								private int pdsStrCd300;

	
	/**
	* Constructor for PdsStrTag300
	**/
    public PdsStrTag300() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("<pds code=\"").toCharArray()
             , getStartOffset() + 0
             ,11
             );
								setPdsStrCd300(0);
       replaceValue( // serialize and save the value
             ("\">").toCharArray()
             , getStartOffset() + 15
             ,2
             );
    }


 

	/**
	 *	Returns the value of pdsStrCd300
	 *	@return pdsStrCd300
	 */
	public int getPdsStrCd300() throws CFException {
       if (isPdsStrCd300Modified()) { 
           pdsStrCd300 = refreshPdsStrCd300();
        }
   		return pdsStrCd300;
	}
	

	
	   
	/**
	 * 	Update PdsStrCd300 with the passed value
	 *  Corresponding COBOL Variable is 300-PDS-STR-CD
	 *	@param number
	 */
	public void setPdsStrCd300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    pdsStrCd300 = checkPdsStrCd300MaxLimit(number); 
		serializePdsStrCd300(pdsStrCd300);
	}
	

	public void setPdsStrCd300(long number) {
	    number = checkPdsStrCd300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setPdsStrCd300((int)number);
	}
	
	/**
	 * 	Update PdsStrCd300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPdsStrCd300(char[] value) throws CFException {
		 pdsStrCd300 = serializePdsStrCd300(value);
	}
	/**
	 * 	Update PdsStrCd300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPdsStrCd300String(char[] value) throws CFException {
		 setPdsStrCd300(value);
	}

	
	
	

		public static int getPdsStrTag300FieldLength() {
			return PDS_STR_TAG_300_LENGTH;
		}

}
  

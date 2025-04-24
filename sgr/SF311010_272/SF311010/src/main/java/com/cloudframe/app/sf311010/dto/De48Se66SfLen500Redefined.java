package com.cloudframe.app.sf311010.dto;

/**
*  The class De48Se66SfLen500Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class De48Se66SfLen500Redefined extends De48Se66SfLen500RedefinedSerialized { 
   

								private int de48Se66SfLen9500;
	
	/**
	* Constructor for De48Se66SfLen500Redefined
	**/
    public De48Se66SfLen500Redefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for De48Se66SfLen500Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public De48Se66SfLen500Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of de48Se66SfLen9500
	 *	@return de48Se66SfLen9500
	 */
	public int getDe48Se66SfLen9500() throws CFException {
       if (isDe48Se66SfLen9500Modified()) { 
           de48Se66SfLen9500 = refreshDe48Se66SfLen9500();
        }
   		return de48Se66SfLen9500;
	}
	

	
	   
	/**
	 * 	Update De48Se66SfLen9500 with the passed value
	 *  Corresponding COBOL Variable is 500-DE48-SE66-SF-LEN-9
	 *	@param number
	 */
	public void setDe48Se66SfLen9500(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    de48Se66SfLen9500 = checkDe48Se66SfLen9500MaxLimit(number); 
		serializeDe48Se66SfLen9500(de48Se66SfLen9500);
	}
	

	public void setDe48Se66SfLen9500(long number) {
	    number = checkDe48Se66SfLen9500MaxLimit(number); // Truncate if value is beyond +/- Max range
		setDe48Se66SfLen9500((int)number);
	}
	
	/**
	 * 	Update De48Se66SfLen9500 with the passed value
	 *	@param value (String or char[])
	 */
	public void setDe48Se66SfLen9500(char[] value) throws CFException {
		 de48Se66SfLen9500 = serializeDe48Se66SfLen9500(value);
	}
	/**
	 * 	Update De48Se66SfLen9500 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDe48Se66SfLen9500String(char[] value) throws CFException {
		 setDe48Se66SfLen9500(value);
	}

	
	
	

		public static int getDe48Se66SfLen500RedefinedFieldLength() {
			return DE_48_SE_66_SF_LEN_500_REDEFINED_LENGTH;
		}

}
  

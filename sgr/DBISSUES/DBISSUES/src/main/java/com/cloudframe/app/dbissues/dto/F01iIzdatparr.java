package com.cloudframe.app.dbissues.dto;

/**
*  The class F01iIzdatparr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:07. using version 5.0.0.256
**/


import com.cloudframe.app.dbissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class F01iIzdatparr extends F01iIzdatparrSerialized { 
   

								private int f01iIzfinprf;
	
	/**
	* Constructor for F01iIzdatparr
	**/
    public F01iIzdatparr() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for F01iIzdatparr. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public F01iIzdatparr(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of f01iIzfinprf
	 *	@return f01iIzfinprf
	 */
	public int getF01iIzfinprf() throws CFException {
       if (isF01iIzfinprfModified()) { 
           f01iIzfinprf = refreshF01iIzfinprf();
        }
   		return f01iIzfinprf;
	}
	

	
	   
	/**
	 * 	Update F01iIzfinprf with the passed value
	 *  Corresponding COBOL Variable is F01I-IZFINPRF
	 *	@param number
	 */
	public void setF01iIzfinprf(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    f01iIzfinprf = checkF01iIzfinprfMaxLimit(number); 
		serializeF01iIzfinprf(f01iIzfinprf);
	}
	

	public void setF01iIzfinprf(long number) {
	    number = checkF01iIzfinprfMaxLimit(number); // Truncate if value is beyond +/- Max range
		setF01iIzfinprf((int)number);
	}
	
	/**
	 * 	Update F01iIzfinprf with the passed value
	 *	@param value (String or char[])
	 */
	public void setF01iIzfinprf(char[] value) throws CFException {
		 f01iIzfinprf = serializeF01iIzfinprf(value);
	}
	/**
	 * 	Update F01iIzfinprf with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setF01iIzfinprfString(char[] value) throws CFException {
		 setF01iIzfinprf(value);
	}

	
	
	

		public static int getF01iIzdatparrFieldLength() {
			return F_01I_IZDATPARR_LENGTH;
		}

}
  

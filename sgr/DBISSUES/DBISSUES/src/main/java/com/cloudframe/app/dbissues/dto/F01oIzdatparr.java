package com.cloudframe.app.dbissues.dto;

/**
*  The class F01oIzdatparr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:34. using version 5.0.0.254
**/


import com.cloudframe.app.dbissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class F01oIzdatparr extends F01oIzdatparrSerialized { 
   

								private int f01oIzfinprf;
	
	/**
	* Constructor for F01oIzdatparr
	**/
    public F01oIzdatparr() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for F01oIzdatparr. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public F01oIzdatparr(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of f01oIzfinprf
	 *	@return f01oIzfinprf
	 */
	public int getF01oIzfinprf() throws CFException {
       if (isF01oIzfinprfModified()) { 
           f01oIzfinprf = refreshF01oIzfinprf();
        }
   		return f01oIzfinprf;
	}
	

	
	   
	/**
	 * 	Update F01oIzfinprf with the passed value
	 *  Corresponding COBOL Variable is F01O-IZFINPRF
	 *	@param number
	 */
	public void setF01oIzfinprf(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    f01oIzfinprf = checkF01oIzfinprfMaxLimit(number); 
		serializeF01oIzfinprf(f01oIzfinprf);
	}
	

	public void setF01oIzfinprf(long number) {
	    number = checkF01oIzfinprfMaxLimit(number); // Truncate if value is beyond +/- Max range
		setF01oIzfinprf((int)number);
	}
	
	/**
	 * 	Update F01oIzfinprf with the passed value
	 *	@param value (String or char[])
	 */
	public void setF01oIzfinprf(char[] value) throws CFException {
		 f01oIzfinprf = serializeF01oIzfinprf(value);
	}
	/**
	 * 	Update F01oIzfinprf with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setF01oIzfinprfString(char[] value) throws CFException {
		 setF01oIzfinprf(value);
	}

	
	
	

		public static int getF01oIzdatparrFieldLength() {
			return F_01O_IZDATPARR_LENGTH;
		}

}
  

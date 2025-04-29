package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360FWorkOfDateFil is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class X360FWorkOfDateFil extends X360FWorkOfDateFilSerialized { 
   

								private int x360FWoYyFil;

								private int x360FWoMmFil;

								private int x360FWoDdFil;
	
	/**
	* Constructor for X360FWorkOfDateFil
	**/
    public X360FWorkOfDateFil() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for X360FWorkOfDateFil. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360FWorkOfDateFil(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of x360FWoYyFil
	 *	@return x360FWoYyFil
	 */
	public int getX360FWoYyFil() throws CFException {
       if (isX360FWoYyFilModified()) { 
           x360FWoYyFil = refreshX360FWoYyFil();
        }
   		return x360FWoYyFil;
	}
	

	
	   
	/**
	 * 	Update X360FWoYyFil with the passed value
	 *  Corresponding COBOL Variable is X360-F-WO-YY-FIL
	 *	@param number
	 */
	public void setX360FWoYyFil(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360FWoYyFil = checkX360FWoYyFilMaxLimit(number); 
		serializeX360FWoYyFil(x360FWoYyFil);
	}
	

	public void setX360FWoYyFil(long number) {
	    number = checkX360FWoYyFilMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FWoYyFil((int)number);
	}
	
	/**
	 * 	Update X360FWoYyFil with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360FWoYyFil(char[] value) throws CFException {
		 x360FWoYyFil = serializeX360FWoYyFil(value);
	}
	/**
	 * 	Update X360FWoYyFil with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360FWoYyFilString(char[] value) throws CFException {
		 setX360FWoYyFil(value);
	}
	/**
	 *	Returns the value of x360FWoMmFil
	 *	@return x360FWoMmFil
	 */
	public int getX360FWoMmFil() throws CFException {
       if (isX360FWoMmFilModified()) { 
           x360FWoMmFil = refreshX360FWoMmFil();
        }
   		return x360FWoMmFil;
	}
	

	
	   
	/**
	 * 	Update X360FWoMmFil with the passed value
	 *  Corresponding COBOL Variable is X360-F-WO-MM-FIL
	 *	@param number
	 */
	public void setX360FWoMmFil(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360FWoMmFil = checkX360FWoMmFilMaxLimit(number); 
		serializeX360FWoMmFil(x360FWoMmFil);
	}
	

	public void setX360FWoMmFil(long number) {
	    number = checkX360FWoMmFilMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FWoMmFil((int)number);
	}
	
	/**
	 * 	Update X360FWoMmFil with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360FWoMmFil(char[] value) throws CFException {
		 x360FWoMmFil = serializeX360FWoMmFil(value);
	}
	/**
	 * 	Update X360FWoMmFil with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360FWoMmFilString(char[] value) throws CFException {
		 setX360FWoMmFil(value);
	}
	/**
	 *	Returns the value of x360FWoDdFil
	 *	@return x360FWoDdFil
	 */
	public int getX360FWoDdFil() throws CFException {
       if (isX360FWoDdFilModified()) { 
           x360FWoDdFil = refreshX360FWoDdFil();
        }
   		return x360FWoDdFil;
	}
	

	
	   
	/**
	 * 	Update X360FWoDdFil with the passed value
	 *  Corresponding COBOL Variable is X360-F-WO-DD-FIL
	 *	@param number
	 */
	public void setX360FWoDdFil(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360FWoDdFil = checkX360FWoDdFilMaxLimit(number); 
		serializeX360FWoDdFil(x360FWoDdFil);
	}
	

	public void setX360FWoDdFil(long number) {
	    number = checkX360FWoDdFilMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FWoDdFil((int)number);
	}
	
	/**
	 * 	Update X360FWoDdFil with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360FWoDdFil(char[] value) throws CFException {
		 x360FWoDdFil = serializeX360FWoDdFil(value);
	}
	/**
	 * 	Update X360FWoDdFil with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360FWoDdFilString(char[] value) throws CFException {
		 setX360FWoDdFil(value);
	}

	
	
	

		public static int getX360FWorkOfDateFilFieldLength() {
			return X_360_FWORK_OF_DATE_FIL_LENGTH;
		}

}
  

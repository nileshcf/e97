package com.cloudframe.app.cfif01.dto;

/**
*  The class X9 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:21. using version 5.0.0.254
**/


import com.cloudframe.app.cfif01.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class X9 extends X9Serialized {
   

								private int wS9;

								private int wS88;
	
	/**
	* Constructor for X9
	**/
    public X9() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wS9
	 *	@return wS9
	 */
	public int getWS9() throws CFException {
       if (isWS9Modified()) { 
           wS9 = refreshWS9();
        }
   		return wS9;
	}
	

	
	   
	/**
	 * 	Update WS9 with the passed value
	 *  Corresponding COBOL Variable is WS-9
	 *	@param number
	 */
	public void setWS9(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wS9 = checkWS9MaxLimit(number); 
		serializeWS9(wS9);
	}
	

	public void setWS9(long number) {
	    number = checkWS9MaxLimit(number); // Truncate if value is beyond +/- Max range
		setWS9((int)number);
	}
	
	/**
	 * 	Update WS9 with the passed value
	 *	@param value (String or char[])
	 */
	public void setWS9(char[] value) throws CFException {
		 wS9 = serializeWS9(value);
	}
	/**
	 * 	Update WS9 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWS9String(char[] value) throws CFException {
		 setWS9(value);
	}
	/**
	 *	Returns the value of wS88
	 *	@return wS88
	 */
	public int getWS88() throws CFException {
       if (isWS88Modified()) { 
           wS88 = refreshWS88();
        }
   		return wS88;
	}
	

	
	   
	/**
	 * 	Update WS88 with the passed value
	 *  Corresponding COBOL Variable is WS-88
	 *	@param number
	 */
	public void setWS88(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wS88 = checkWS88MaxLimit(number); 
		serializeWS88(wS88);
	}
	

	public void setWS88(long number) {
	    number = checkWS88MaxLimit(number); // Truncate if value is beyond +/- Max range
		setWS88((int)number);
	}
	
	/**
	 * 	Update WS88 with the passed value
	 *	@param value (String or char[])
	 */
	public void setWS88(char[] value) throws CFException {
		 wS88 = serializeWS88(value);
	}
	/**
	 * 	Update WS88 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWS88String(char[] value) throws CFException {
		 setWS88(value);
	}
	
	/**
	 *	Test condition 0 for isZero()
	 *	@return  Returns true if isZero() is 0
	 */
   public boolean isZero() throws CFException {
      return (  getWS88()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setZeroTrue() {  			
    	setWS88( 0);
   	}

	
	
	

		public static int getX9FieldLength() {
			return X_9_LENGTH;
		}

}
  

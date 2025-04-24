package com.cloudframe.app.bm80022.dto;

/**
*  The class Contadors is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:40. using version 5.0.0.254
**/


import com.cloudframe.app.bm80022.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Contadors extends ContadorsSerialized { 
   

								private long llegitsGe1801;

								private long gravatsGe0001w;
	
	/**
	* Constructor for Contadors
	**/
    public Contadors() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setLlegitsGe1801(0L);
								setGravatsGe0001w(0L);
    }


 

	/**
	 *	Returns the value of llegitsGe1801
	 *	@return llegitsGe1801
	 */
	public long getLlegitsGe1801() throws CFException {
       if (isLlegitsGe1801Modified()) { 
           llegitsGe1801 = refreshLlegitsGe1801();
        }
   		return llegitsGe1801;
	}
	

	
	   
	/**
	 * 	Update LlegitsGe1801 with the passed value
	 *  Corresponding COBOL Variable is WS-LLEGITS-GE1801
	 *	@param number
	 */
	public void setLlegitsGe1801(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    llegitsGe1801 = checkLlegitsGe1801MaxLimit(number); 
		serializeLlegitsGe1801(llegitsGe1801);
	}
	

	/**
	 * 	Update LlegitsGe1801 with the passed value
	 *	@param value (String or char[])
	 */
	public void setLlegitsGe1801(char[] value) throws CFException {
		 llegitsGe1801 = serializeLlegitsGe1801(value);
	}
	/**
	 * 	Update LlegitsGe1801 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLlegitsGe1801String(char[] value) throws CFException {
		 setLlegitsGe1801(value);
	}
	/**
	 *	Returns the value of gravatsGe0001w
	 *	@return gravatsGe0001w
	 */
	public long getGravatsGe0001w() throws CFException {
       if (isGravatsGe0001wModified()) { 
           gravatsGe0001w = refreshGravatsGe0001w();
        }
   		return gravatsGe0001w;
	}
	

	
	   
	/**
	 * 	Update GravatsGe0001w with the passed value
	 *  Corresponding COBOL Variable is WS-GRAVATS-GE0001W
	 *	@param number
	 */
	public void setGravatsGe0001w(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    gravatsGe0001w = checkGravatsGe0001wMaxLimit(number); 
		serializeGravatsGe0001w(gravatsGe0001w);
	}
	

	/**
	 * 	Update GravatsGe0001w with the passed value
	 *	@param value (String or char[])
	 */
	public void setGravatsGe0001w(char[] value) throws CFException {
		 gravatsGe0001w = serializeGravatsGe0001w(value);
	}
	/**
	 * 	Update GravatsGe0001w with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setGravatsGe0001wString(char[] value) throws CFException {
		 setGravatsGe0001w(value);
	}

	
	
	
	/**
	 * 	initializes Contadors
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setLlegitsGe1801(0);
                     setGravatsGe0001w(0);
   }

		public static int getContadorsFieldLength() {
			return CONTADORS_LENGTH;
		}

}
  

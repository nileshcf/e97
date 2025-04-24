package com.cloudframe.app.evalpgm.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:39. using version 5.0.0.254
**/


import com.cloudframe.app.evalpgm.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized { 
   

								private int inpCountd;

								private int outCountd;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setInpCountd(0);
								setOutCountd(0);
    }


 

	/**
	 *	Returns the value of inpCountd
	 *	@return inpCountd
	 */
	public int getInpCountd() throws CFException {
       if (isInpCountdModified()) { 
           inpCountd = refreshInpCountd();
        }
   		return inpCountd;
	}
	

	
	   
	/**
	 * 	Update InpCountd with the passed value
	 *  Corresponding COBOL Variable is INP-COUNTD
	 *	@param number
	 */
	public void setInpCountd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    inpCountd = checkInpCountdMaxLimit(number); 
		serializeInpCountd(inpCountd);
	}
	

	public void setInpCountd(long number) {
	    number = checkInpCountdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setInpCountd((int)number);
	}
	
	/**
	 * 	Update InpCountd with the passed value
	 *	@param value (String or char[])
	 */
	public void setInpCountd(char[] value) throws CFException {
		 inpCountd = serializeInpCountd(value);
	}
	/**
	 * 	Update InpCountd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setInpCountdString(char[] value) throws CFException {
		 setInpCountd(value);
	}
	/**
	 *	Returns the value of outCountd
	 *	@return outCountd
	 */
	public int getOutCountd() throws CFException {
       if (isOutCountdModified()) { 
           outCountd = refreshOutCountd();
        }
   		return outCountd;
	}
	

	
	   
	/**
	 * 	Update OutCountd with the passed value
	 *  Corresponding COBOL Variable is OUT-COUNTD
	 *	@param number
	 */
	public void setOutCountd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    outCountd = checkOutCountdMaxLimit(number); 
		serializeOutCountd(outCountd);
	}
	

	public void setOutCountd(long number) {
	    number = checkOutCountdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setOutCountd((int)number);
	}
	
	/**
	 * 	Update OutCountd with the passed value
	 *	@param value (String or char[])
	 */
	public void setOutCountd(char[] value) throws CFException {
		 outCountd = serializeOutCountd(value);
	}
	/**
	 * 	Update OutCountd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOutCountdString(char[] value) throws CFException {
		 setOutCountd(value);
	}

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  

package com.cloudframe.app.bm8090m.dto;

/**
*  The class WMcat7bPe8090m is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:59. using version 5.0.0.256
**/


import com.cloudframe.app.bm8090m.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WMcat7bPe8090m extends WMcat7bPe8090mSerialized { 
   


								private int wMcat73Pe8090m;

	
	/**
	* Constructor for WMcat7bPe8090m
	**/
    public WMcat7bPe8090m() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WMcat7bPe8090m. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WMcat7bPe8090m(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 0
             ,1
             );
       replaceValue( // serialize and save the value
             (" PERSONES ").toCharArray()
             , getStartOffset() + 4
             ,10
             );
    } 

	/**
	 *	Returns the value of wMcat73Pe8090m
	 *	@return wMcat73Pe8090m
	 */
	public int getWMcat73Pe8090m() throws CFException {
       if (isWMcat73Pe8090mModified()) { 
           wMcat73Pe8090m = refreshWMcat73Pe8090m();
        }
   		return wMcat73Pe8090m;
	}
	

	
	   
	/**
	 * 	Update WMcat73Pe8090m with the passed value
	 *  Corresponding COBOL Variable is W-MCAT73-PE8090M
	 *	@param number
	 */
	public void setWMcat73Pe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wMcat73Pe8090m = checkWMcat73Pe8090mMaxLimit(number); 
		serializeWMcat73Pe8090m(wMcat73Pe8090m);
	}
	

	public void setWMcat73Pe8090m(long number) {
	    number = checkWMcat73Pe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWMcat73Pe8090m((int)number);
	}
	
	/**
	 * 	Update WMcat73Pe8090m with the passed value
	 *	@param value (String or char[])
	 */
	public void setWMcat73Pe8090m(char[] value) throws CFException {
		 wMcat73Pe8090m = serializeWMcat73Pe8090m(value);
	}
	/**
	 * 	Update WMcat73Pe8090m with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWMcat73Pe8090mString(char[] value) throws CFException {
		 setWMcat73Pe8090m(value);
	}

	
	
	
	/**
	 * 	initializes WMcat7bPe8090m
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setWMcat73Pe8090m(0);
   }

		public static int getWMcat7bPe8090mFieldLength() {
			return W_MCAT_7B_PE_8090M_LENGTH;
		}

}
  

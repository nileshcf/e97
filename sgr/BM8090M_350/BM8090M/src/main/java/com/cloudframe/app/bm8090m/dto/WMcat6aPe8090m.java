package com.cloudframe.app.bm8090m.dto;

/**
*  The class WMcat6aPe8090m is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:05. using version 5.0.0.256
**/


import com.cloudframe.app.bm8090m.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WMcat6aPe8090m extends WMcat6aPe8090mSerialized { 
   


								private int wMcat62Pe8090m;

	
	/**
	* Constructor for WMcat6aPe8090m
	**/
    public WMcat6aPe8090m() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WMcat6aPe8090m. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WMcat6aPe8090m(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             (" DE ").toCharArray()
             , getStartOffset() + 0
             ,4
             );
       replaceValue( // serialize and save the value
             (" PERSONES ").toCharArray()
             , getStartOffset() + 6
             ,10
             );
    } 

	/**
	 *	Returns the value of wMcat62Pe8090m
	 *	@return wMcat62Pe8090m
	 */
	public int getWMcat62Pe8090m() throws CFException {
       if (isWMcat62Pe8090mModified()) { 
           wMcat62Pe8090m = refreshWMcat62Pe8090m();
        }
   		return wMcat62Pe8090m;
	}
	

	
	   
	/**
	 * 	Update WMcat62Pe8090m with the passed value
	 *  Corresponding COBOL Variable is W-MCAT62-PE8090M
	 *	@param number
	 */
	public void setWMcat62Pe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wMcat62Pe8090m = checkWMcat62Pe8090mMaxLimit(number); 
		serializeWMcat62Pe8090m(wMcat62Pe8090m);
	}
	

	public void setWMcat62Pe8090m(long number) {
	    number = checkWMcat62Pe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWMcat62Pe8090m((int)number);
	}
	
	/**
	 * 	Update WMcat62Pe8090m with the passed value
	 *	@param value (String or char[])
	 */
	public void setWMcat62Pe8090m(char[] value) throws CFException {
		 wMcat62Pe8090m = serializeWMcat62Pe8090m(value);
	}
	/**
	 * 	Update WMcat62Pe8090m with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWMcat62Pe8090mString(char[] value) throws CFException {
		 setWMcat62Pe8090m(value);
	}

	
	
	
	/**
	 * 	initializes WMcat6aPe8090m
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setWMcat62Pe8090m(0);
   }

		public static int getWMcat6aPe8090mFieldLength() {
			return W_MCAT_6A_PE_8090M_LENGTH;
		}

}
  

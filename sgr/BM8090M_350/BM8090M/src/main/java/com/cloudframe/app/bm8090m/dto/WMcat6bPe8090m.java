package com.cloudframe.app.bm8090m.dto;

/**
*  The class WMcat6bPe8090m is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/


import com.cloudframe.app.bm8090m.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WMcat6bPe8090m extends WMcat6bPe8090mSerialized { 
   


								private int wMcat63Pe8090m;

	
	/**
	* Constructor for WMcat6bPe8090m
	**/
    public WMcat6bPe8090m() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WMcat6bPe8090m. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WMcat6bPe8090m(Field parent,int begin) {
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
             , getStartOffset() + 7
             ,10
             );
    } 

	/**
	 *	Returns the value of wMcat63Pe8090m
	 *	@return wMcat63Pe8090m
	 */
	public int getWMcat63Pe8090m() throws CFException {
       if (isWMcat63Pe8090mModified()) { 
           wMcat63Pe8090m = refreshWMcat63Pe8090m();
        }
   		return wMcat63Pe8090m;
	}
	

	
	   
	/**
	 * 	Update WMcat63Pe8090m with the passed value
	 *  Corresponding COBOL Variable is W-MCAT63-PE8090M
	 *	@param number
	 */
	public void setWMcat63Pe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wMcat63Pe8090m = checkWMcat63Pe8090mMaxLimit(number); 
		serializeWMcat63Pe8090m(wMcat63Pe8090m);
	}
	

	public void setWMcat63Pe8090m(long number) {
	    number = checkWMcat63Pe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWMcat63Pe8090m((int)number);
	}
	
	/**
	 * 	Update WMcat63Pe8090m with the passed value
	 *	@param value (String or char[])
	 */
	public void setWMcat63Pe8090m(char[] value) throws CFException {
		 wMcat63Pe8090m = serializeWMcat63Pe8090m(value);
	}
	/**
	 * 	Update WMcat63Pe8090m with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWMcat63Pe8090mString(char[] value) throws CFException {
		 setWMcat63Pe8090m(value);
	}

	
	
	
	/**
	 * 	initializes WMcat6bPe8090m
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setWMcat63Pe8090m(0);
   }

		public static int getWMcat6bPe8090mFieldLength() {
			return W_MCAT_6B_PE_8090M_LENGTH;
		}

}
  

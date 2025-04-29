package com.cloudframe.app.bm8090m.dto;

/**
*  The class WMcat3bPe8090m is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:28. using version 5.0.0.254
**/


import com.cloudframe.app.bm8090m.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WMcat3bPe8090m extends WMcat3bPe8090mSerialized { 
   


								private int wMcat33Pe8090m;

	
	/**
	* Constructor for WMcat3bPe8090m
	**/
    public WMcat3bPe8090m() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WMcat3bPe8090m. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WMcat3bPe8090m(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             (" I ").toCharArray()
             , getStartOffset() + 0
             ,3
             );
       replaceValue( // serialize and save the value
             (" MES ").toCharArray()
             , getStartOffset() + 6
             ,5
             );
    } 

	/**
	 *	Returns the value of wMcat33Pe8090m
	 *	@return wMcat33Pe8090m
	 */
	public int getWMcat33Pe8090m() throws CFException {
       if (isWMcat33Pe8090mModified()) { 
           wMcat33Pe8090m = refreshWMcat33Pe8090m();
        }
   		return wMcat33Pe8090m;
	}
	

	
	   
	/**
	 * 	Update WMcat33Pe8090m with the passed value
	 *  Corresponding COBOL Variable is W-MCAT33-PE8090M
	 *	@param number
	 */
	public void setWMcat33Pe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wMcat33Pe8090m = checkWMcat33Pe8090mMaxLimit(number); 
		serializeWMcat33Pe8090m(wMcat33Pe8090m);
	}
	

	public void setWMcat33Pe8090m(long number) {
	    number = checkWMcat33Pe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWMcat33Pe8090m((int)number);
	}
	
	/**
	 * 	Update WMcat33Pe8090m with the passed value
	 *	@param value (String or char[])
	 */
	public void setWMcat33Pe8090m(char[] value) throws CFException {
		 wMcat33Pe8090m = serializeWMcat33Pe8090m(value);
	}
	/**
	 * 	Update WMcat33Pe8090m with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWMcat33Pe8090mString(char[] value) throws CFException {
		 setWMcat33Pe8090m(value);
	}

	
	
	
	/**
	 * 	initializes WMcat3bPe8090m
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setWMcat33Pe8090m(0);
   }

		public static int getWMcat3bPe8090mFieldLength() {
			return W_MCAT_3B_PE_8090M_LENGTH;
		}

}
  

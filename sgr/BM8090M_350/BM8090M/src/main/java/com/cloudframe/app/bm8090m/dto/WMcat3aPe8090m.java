package com.cloudframe.app.bm8090m.dto;

/**
*  The class WMcat3aPe8090m is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/


import com.cloudframe.app.bm8090m.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WMcat3aPe8090m extends WMcat3aPe8090mSerialized { 
   


								private int wMcat32Pe8090m;

	
	/**
	* Constructor for WMcat3aPe8090m
	**/
    public WMcat3aPe8090m() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WMcat3aPe8090m. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WMcat3aPe8090m(Field parent,int begin) {
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
             , getStartOffset() + 5
             ,5
             );
    } 

	/**
	 *	Returns the value of wMcat32Pe8090m
	 *	@return wMcat32Pe8090m
	 */
	public int getWMcat32Pe8090m() throws CFException {
       if (isWMcat32Pe8090mModified()) { 
           wMcat32Pe8090m = refreshWMcat32Pe8090m();
        }
   		return wMcat32Pe8090m;
	}
	

	
	   
	/**
	 * 	Update WMcat32Pe8090m with the passed value
	 *  Corresponding COBOL Variable is W-MCAT32-PE8090M
	 *	@param number
	 */
	public void setWMcat32Pe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wMcat32Pe8090m = checkWMcat32Pe8090mMaxLimit(number); 
		serializeWMcat32Pe8090m(wMcat32Pe8090m);
	}
	

	public void setWMcat32Pe8090m(long number) {
	    number = checkWMcat32Pe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWMcat32Pe8090m((int)number);
	}
	
	/**
	 * 	Update WMcat32Pe8090m with the passed value
	 *	@param value (String or char[])
	 */
	public void setWMcat32Pe8090m(char[] value) throws CFException {
		 wMcat32Pe8090m = serializeWMcat32Pe8090m(value);
	}
	/**
	 * 	Update WMcat32Pe8090m with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWMcat32Pe8090mString(char[] value) throws CFException {
		 setWMcat32Pe8090m(value);
	}

	
	
	
	/**
	 * 	initializes WMcat3aPe8090m
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setWMcat32Pe8090m(0);
   }

		public static int getWMcat3aPe8090mFieldLength() {
			return W_MCAT_3A_PE_8090M_LENGTH;
		}

}
  

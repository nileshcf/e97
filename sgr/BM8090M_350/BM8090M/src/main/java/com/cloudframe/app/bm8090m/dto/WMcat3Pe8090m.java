package com.cloudframe.app.bm8090m.dto;

/**
*  The class WMcat3Pe8090m is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/


import com.cloudframe.app.bm8090m.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WMcat3Pe8090m extends WMcat3Pe8090mSerialized { 
   


								private int wMcat31Pe8090m;

	
	/**
	* Constructor for WMcat3Pe8090m
	**/
    public WMcat3Pe8090m() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WMcat3Pe8090m. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WMcat3Pe8090m(Field parent,int begin) {
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
             , getStartOffset() + 4
             ,5
             );
    } 

	/**
	 *	Returns the value of wMcat31Pe8090m
	 *	@return wMcat31Pe8090m
	 */
	public int getWMcat31Pe8090m() throws CFException {
       if (isWMcat31Pe8090mModified()) { 
           wMcat31Pe8090m = refreshWMcat31Pe8090m();
        }
   		return wMcat31Pe8090m;
	}
	

	
	   
	/**
	 * 	Update WMcat31Pe8090m with the passed value
	 *  Corresponding COBOL Variable is W-MCAT31-PE8090M
	 *	@param number
	 */
	public void setWMcat31Pe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wMcat31Pe8090m = checkWMcat31Pe8090mMaxLimit(number); 
		serializeWMcat31Pe8090m(wMcat31Pe8090m);
	}
	

	public void setWMcat31Pe8090m(long number) {
	    number = checkWMcat31Pe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWMcat31Pe8090m((int)number);
	}
	
	/**
	 * 	Update WMcat31Pe8090m with the passed value
	 *	@param value (String or char[])
	 */
	public void setWMcat31Pe8090m(char[] value) throws CFException {
		 wMcat31Pe8090m = serializeWMcat31Pe8090m(value);
	}
	/**
	 * 	Update WMcat31Pe8090m with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWMcat31Pe8090mString(char[] value) throws CFException {
		 setWMcat31Pe8090m(value);
	}

	
	
	
	/**
	 * 	initializes WMcat3Pe8090m
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setWMcat31Pe8090m(0);
   }

		public static int getWMcat3Pe8090mFieldLength() {
			return W_MCAT_3_PE_8090M_LENGTH;
		}

}
  

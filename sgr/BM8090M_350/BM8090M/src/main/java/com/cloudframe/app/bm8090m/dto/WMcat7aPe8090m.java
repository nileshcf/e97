package com.cloudframe.app.bm8090m.dto;

/**
*  The class WMcat7aPe8090m is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/


import com.cloudframe.app.bm8090m.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WMcat7aPe8090m extends WMcat7aPe8090mSerialized { 
   


								private int wMcat72Pe8090m;

	
	/**
	* Constructor for WMcat7aPe8090m
	**/
    public WMcat7aPe8090m() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WMcat7aPe8090m. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WMcat7aPe8090m(Field parent,int begin) {
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
             , getStartOffset() + 3
             ,10
             );
    } 

	/**
	 *	Returns the value of wMcat72Pe8090m
	 *	@return wMcat72Pe8090m
	 */
	public int getWMcat72Pe8090m() throws CFException {
       if (isWMcat72Pe8090mModified()) { 
           wMcat72Pe8090m = refreshWMcat72Pe8090m();
        }
   		return wMcat72Pe8090m;
	}
	

	
	   
	/**
	 * 	Update WMcat72Pe8090m with the passed value
	 *  Corresponding COBOL Variable is W-MCAT72-PE8090M
	 *	@param number
	 */
	public void setWMcat72Pe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wMcat72Pe8090m = checkWMcat72Pe8090mMaxLimit(number); 
		serializeWMcat72Pe8090m(wMcat72Pe8090m);
	}
	

	public void setWMcat72Pe8090m(long number) {
	    number = checkWMcat72Pe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWMcat72Pe8090m((int)number);
	}
	
	/**
	 * 	Update WMcat72Pe8090m with the passed value
	 *	@param value (String or char[])
	 */
	public void setWMcat72Pe8090m(char[] value) throws CFException {
		 wMcat72Pe8090m = serializeWMcat72Pe8090m(value);
	}
	/**
	 * 	Update WMcat72Pe8090m with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWMcat72Pe8090mString(char[] value) throws CFException {
		 setWMcat72Pe8090m(value);
	}

	
	
	
	/**
	 * 	initializes WMcat7aPe8090m
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setWMcat72Pe8090m(0);
   }

		public static int getWMcat7aPe8090mFieldLength() {
			return W_MCAT_7A_PE_8090M_LENGTH;
		}

}
  

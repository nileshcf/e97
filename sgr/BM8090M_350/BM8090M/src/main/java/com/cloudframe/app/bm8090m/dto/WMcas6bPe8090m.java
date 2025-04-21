package com.cloudframe.app.bm8090m.dto;

/**
*  The class WMcas6bPe8090m is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:05. using version 5.0.0.256
**/


import com.cloudframe.app.bm8090m.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WMcas6bPe8090m extends WMcas6bPe8090mSerialized { 
   


								private int wMcas63Pe8090m;

	
	/**
	* Constructor for WMcas6bPe8090m
	**/
    public WMcas6bPe8090m() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WMcas6bPe8090m. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WMcas6bPe8090m(Field parent,int begin) {
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
             (" PERSONAS ").toCharArray()
             , getStartOffset() + 7
             ,10
             );
    } 

	/**
	 *	Returns the value of wMcas63Pe8090m
	 *	@return wMcas63Pe8090m
	 */
	public int getWMcas63Pe8090m() throws CFException {
       if (isWMcas63Pe8090mModified()) { 
           wMcas63Pe8090m = refreshWMcas63Pe8090m();
        }
   		return wMcas63Pe8090m;
	}
	

	
	   
	/**
	 * 	Update WMcas63Pe8090m with the passed value
	 *  Corresponding COBOL Variable is W-MCAS63-PE8090M
	 *	@param number
	 */
	public void setWMcas63Pe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wMcas63Pe8090m = checkWMcas63Pe8090mMaxLimit(number); 
		serializeWMcas63Pe8090m(wMcas63Pe8090m);
	}
	

	public void setWMcas63Pe8090m(long number) {
	    number = checkWMcas63Pe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWMcas63Pe8090m((int)number);
	}
	
	/**
	 * 	Update WMcas63Pe8090m with the passed value
	 *	@param value (String or char[])
	 */
	public void setWMcas63Pe8090m(char[] value) throws CFException {
		 wMcas63Pe8090m = serializeWMcas63Pe8090m(value);
	}
	/**
	 * 	Update WMcas63Pe8090m with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWMcas63Pe8090mString(char[] value) throws CFException {
		 setWMcas63Pe8090m(value);
	}

	
	
	
	/**
	 * 	initializes WMcas6bPe8090m
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setWMcas63Pe8090m(0);
   }

		public static int getWMcas6bPe8090mFieldLength() {
			return W_MCAS_6B_PE_8090M_LENGTH;
		}

}
  

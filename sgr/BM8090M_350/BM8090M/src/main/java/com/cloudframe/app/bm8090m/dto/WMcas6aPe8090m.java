package com.cloudframe.app.bm8090m.dto;

/**
*  The class WMcas6aPe8090m is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:21. using version 5.0.0.257
**/


import com.cloudframe.app.bm8090m.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WMcas6aPe8090m extends WMcas6aPe8090mSerialized { 
   


								private int wMcas62Pe8090m;

	
	/**
	* Constructor for WMcas6aPe8090m
	**/
    public WMcas6aPe8090m() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WMcas6aPe8090m. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WMcas6aPe8090m(Field parent,int begin) {
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
             , getStartOffset() + 6
             ,10
             );
    } 

	/**
	 *	Returns the value of wMcas62Pe8090m
	 *	@return wMcas62Pe8090m
	 */
	public int getWMcas62Pe8090m() throws CFException {
       if (isWMcas62Pe8090mModified()) { 
           wMcas62Pe8090m = refreshWMcas62Pe8090m();
        }
   		return wMcas62Pe8090m;
	}
	

	
	   
	/**
	 * 	Update WMcas62Pe8090m with the passed value
	 *  Corresponding COBOL Variable is W-MCAS62-PE8090M
	 *	@param number
	 */
	public void setWMcas62Pe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wMcas62Pe8090m = checkWMcas62Pe8090mMaxLimit(number); 
		serializeWMcas62Pe8090m(wMcas62Pe8090m);
	}
	

	public void setWMcas62Pe8090m(long number) {
	    number = checkWMcas62Pe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWMcas62Pe8090m((int)number);
	}
	
	/**
	 * 	Update WMcas62Pe8090m with the passed value
	 *	@param value (String or char[])
	 */
	public void setWMcas62Pe8090m(char[] value) throws CFException {
		 wMcas62Pe8090m = serializeWMcas62Pe8090m(value);
	}
	/**
	 * 	Update WMcas62Pe8090m with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWMcas62Pe8090mString(char[] value) throws CFException {
		 setWMcas62Pe8090m(value);
	}

	
	
	
	/**
	 * 	initializes WMcas6aPe8090m
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setWMcas62Pe8090m(0);
   }

		public static int getWMcas6aPe8090mFieldLength() {
			return W_MCAS_6A_PE_8090M_LENGTH;
		}

}
  

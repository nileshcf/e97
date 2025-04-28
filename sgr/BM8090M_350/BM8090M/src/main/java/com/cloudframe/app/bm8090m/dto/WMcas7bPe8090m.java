package com.cloudframe.app.bm8090m.dto;

/**
*  The class WMcas7bPe8090m is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/


import com.cloudframe.app.bm8090m.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WMcas7bPe8090m extends WMcas7bPe8090mSerialized { 
   


								private int wMcas73Pe8090m;

	
	/**
	* Constructor for WMcas7bPe8090m
	**/
    public WMcas7bPe8090m() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WMcas7bPe8090m. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WMcas7bPe8090m(Field parent,int begin) {
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
             (" PERSONAS ").toCharArray()
             , getStartOffset() + 4
             ,10
             );
    } 

	/**
	 *	Returns the value of wMcas73Pe8090m
	 *	@return wMcas73Pe8090m
	 */
	public int getWMcas73Pe8090m() throws CFException {
       if (isWMcas73Pe8090mModified()) { 
           wMcas73Pe8090m = refreshWMcas73Pe8090m();
        }
   		return wMcas73Pe8090m;
	}
	

	
	   
	/**
	 * 	Update WMcas73Pe8090m with the passed value
	 *  Corresponding COBOL Variable is W-MCAS73-PE8090M
	 *	@param number
	 */
	public void setWMcas73Pe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wMcas73Pe8090m = checkWMcas73Pe8090mMaxLimit(number); 
		serializeWMcas73Pe8090m(wMcas73Pe8090m);
	}
	

	public void setWMcas73Pe8090m(long number) {
	    number = checkWMcas73Pe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWMcas73Pe8090m((int)number);
	}
	
	/**
	 * 	Update WMcas73Pe8090m with the passed value
	 *	@param value (String or char[])
	 */
	public void setWMcas73Pe8090m(char[] value) throws CFException {
		 wMcas73Pe8090m = serializeWMcas73Pe8090m(value);
	}
	/**
	 * 	Update WMcas73Pe8090m with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWMcas73Pe8090mString(char[] value) throws CFException {
		 setWMcas73Pe8090m(value);
	}

	
	
	
	/**
	 * 	initializes WMcas7bPe8090m
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setWMcas73Pe8090m(0);
   }

		public static int getWMcas7bPe8090mFieldLength() {
			return W_MCAS_7B_PE_8090M_LENGTH;
		}

}
  

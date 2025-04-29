package com.cloudframe.app.bm8090m.dto;

/**
*  The class WMcas7aPe8090m is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:28. using version 5.0.0.254
**/


import com.cloudframe.app.bm8090m.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WMcas7aPe8090m extends WMcas7aPe8090mSerialized { 
   


								private int wMcas72Pe8090m;

	
	/**
	* Constructor for WMcas7aPe8090m
	**/
    public WMcas7aPe8090m() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WMcas7aPe8090m. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WMcas7aPe8090m(Field parent,int begin) {
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
             , getStartOffset() + 3
             ,10
             );
    } 

	/**
	 *	Returns the value of wMcas72Pe8090m
	 *	@return wMcas72Pe8090m
	 */
	public int getWMcas72Pe8090m() throws CFException {
       if (isWMcas72Pe8090mModified()) { 
           wMcas72Pe8090m = refreshWMcas72Pe8090m();
        }
   		return wMcas72Pe8090m;
	}
	

	
	   
	/**
	 * 	Update WMcas72Pe8090m with the passed value
	 *  Corresponding COBOL Variable is W-MCAS72-PE8090M
	 *	@param number
	 */
	public void setWMcas72Pe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wMcas72Pe8090m = checkWMcas72Pe8090mMaxLimit(number); 
		serializeWMcas72Pe8090m(wMcas72Pe8090m);
	}
	

	public void setWMcas72Pe8090m(long number) {
	    number = checkWMcas72Pe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWMcas72Pe8090m((int)number);
	}
	
	/**
	 * 	Update WMcas72Pe8090m with the passed value
	 *	@param value (String or char[])
	 */
	public void setWMcas72Pe8090m(char[] value) throws CFException {
		 wMcas72Pe8090m = serializeWMcas72Pe8090m(value);
	}
	/**
	 * 	Update WMcas72Pe8090m with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWMcas72Pe8090mString(char[] value) throws CFException {
		 setWMcas72Pe8090m(value);
	}

	
	
	
	/**
	 * 	initializes WMcas7aPe8090m
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setWMcas72Pe8090m(0);
   }

		public static int getWMcas7aPe8090mFieldLength() {
			return W_MCAS_7A_PE_8090M_LENGTH;
		}

}
  

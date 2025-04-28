package com.cloudframe.app.bm8090m.dto;

/**
*  The class WMcas3bPe8090m is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/


import com.cloudframe.app.bm8090m.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WMcas3bPe8090m extends WMcas3bPe8090mSerialized { 
   


								private int wMcas33Pe8090m;

	
	/**
	* Constructor for WMcas3bPe8090m
	**/
    public WMcas3bPe8090m() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WMcas3bPe8090m. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WMcas3bPe8090m(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             (" Y ").toCharArray()
             , getStartOffset() + 0
             ,3
             );
       replaceValue( // serialize and save the value
             (" MAS ").toCharArray()
             , getStartOffset() + 6
             ,5
             );
    } 

	/**
	 *	Returns the value of wMcas33Pe8090m
	 *	@return wMcas33Pe8090m
	 */
	public int getWMcas33Pe8090m() throws CFException {
       if (isWMcas33Pe8090mModified()) { 
           wMcas33Pe8090m = refreshWMcas33Pe8090m();
        }
   		return wMcas33Pe8090m;
	}
	

	
	   
	/**
	 * 	Update WMcas33Pe8090m with the passed value
	 *  Corresponding COBOL Variable is W-MCAS33-PE8090M
	 *	@param number
	 */
	public void setWMcas33Pe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wMcas33Pe8090m = checkWMcas33Pe8090mMaxLimit(number); 
		serializeWMcas33Pe8090m(wMcas33Pe8090m);
	}
	

	public void setWMcas33Pe8090m(long number) {
	    number = checkWMcas33Pe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWMcas33Pe8090m((int)number);
	}
	
	/**
	 * 	Update WMcas33Pe8090m with the passed value
	 *	@param value (String or char[])
	 */
	public void setWMcas33Pe8090m(char[] value) throws CFException {
		 wMcas33Pe8090m = serializeWMcas33Pe8090m(value);
	}
	/**
	 * 	Update WMcas33Pe8090m with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWMcas33Pe8090mString(char[] value) throws CFException {
		 setWMcas33Pe8090m(value);
	}

	
	
	
	/**
	 * 	initializes WMcas3bPe8090m
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setWMcas33Pe8090m(0);
   }

		public static int getWMcas3bPe8090mFieldLength() {
			return W_MCAS_3B_PE_8090M_LENGTH;
		}

}
  

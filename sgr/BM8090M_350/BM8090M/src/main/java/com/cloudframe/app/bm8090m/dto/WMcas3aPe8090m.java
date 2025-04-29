package com.cloudframe.app.bm8090m.dto;

/**
*  The class WMcas3aPe8090m is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:28. using version 5.0.0.254
**/


import com.cloudframe.app.bm8090m.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WMcas3aPe8090m extends WMcas3aPe8090mSerialized { 
   


								private int wMcas32Pe8090m;

	
	/**
	* Constructor for WMcas3aPe8090m
	**/
    public WMcas3aPe8090m() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WMcas3aPe8090m. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WMcas3aPe8090m(Field parent,int begin) {
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
             , getStartOffset() + 5
             ,5
             );
    } 

	/**
	 *	Returns the value of wMcas32Pe8090m
	 *	@return wMcas32Pe8090m
	 */
	public int getWMcas32Pe8090m() throws CFException {
       if (isWMcas32Pe8090mModified()) { 
           wMcas32Pe8090m = refreshWMcas32Pe8090m();
        }
   		return wMcas32Pe8090m;
	}
	

	
	   
	/**
	 * 	Update WMcas32Pe8090m with the passed value
	 *  Corresponding COBOL Variable is W-MCAS32-PE8090M
	 *	@param number
	 */
	public void setWMcas32Pe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wMcas32Pe8090m = checkWMcas32Pe8090mMaxLimit(number); 
		serializeWMcas32Pe8090m(wMcas32Pe8090m);
	}
	

	public void setWMcas32Pe8090m(long number) {
	    number = checkWMcas32Pe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWMcas32Pe8090m((int)number);
	}
	
	/**
	 * 	Update WMcas32Pe8090m with the passed value
	 *	@param value (String or char[])
	 */
	public void setWMcas32Pe8090m(char[] value) throws CFException {
		 wMcas32Pe8090m = serializeWMcas32Pe8090m(value);
	}
	/**
	 * 	Update WMcas32Pe8090m with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWMcas32Pe8090mString(char[] value) throws CFException {
		 setWMcas32Pe8090m(value);
	}

	
	
	
	/**
	 * 	initializes WMcas3aPe8090m
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setWMcas32Pe8090m(0);
   }

		public static int getWMcas3aPe8090mFieldLength() {
			return W_MCAS_3A_PE_8090M_LENGTH;
		}

}
  

package com.cloudframe.app.bm8090m.dto;

/**
*  The class WMcas3Pe8090m is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/


import com.cloudframe.app.bm8090m.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WMcas3Pe8090m extends WMcas3Pe8090mSerialized { 
   


								private int wMcas31Pe8090m;

	
	/**
	* Constructor for WMcas3Pe8090m
	**/
    public WMcas3Pe8090m() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WMcas3Pe8090m. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WMcas3Pe8090m(Field parent,int begin) {
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
             , getStartOffset() + 4
             ,5
             );
    } 

	/**
	 *	Returns the value of wMcas31Pe8090m
	 *	@return wMcas31Pe8090m
	 */
	public int getWMcas31Pe8090m() throws CFException {
       if (isWMcas31Pe8090mModified()) { 
           wMcas31Pe8090m = refreshWMcas31Pe8090m();
        }
   		return wMcas31Pe8090m;
	}
	

	
	   
	/**
	 * 	Update WMcas31Pe8090m with the passed value
	 *  Corresponding COBOL Variable is W-MCAS31-PE8090M
	 *	@param number
	 */
	public void setWMcas31Pe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wMcas31Pe8090m = checkWMcas31Pe8090mMaxLimit(number); 
		serializeWMcas31Pe8090m(wMcas31Pe8090m);
	}
	

	public void setWMcas31Pe8090m(long number) {
	    number = checkWMcas31Pe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWMcas31Pe8090m((int)number);
	}
	
	/**
	 * 	Update WMcas31Pe8090m with the passed value
	 *	@param value (String or char[])
	 */
	public void setWMcas31Pe8090m(char[] value) throws CFException {
		 wMcas31Pe8090m = serializeWMcas31Pe8090m(value);
	}
	/**
	 * 	Update WMcas31Pe8090m with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWMcas31Pe8090mString(char[] value) throws CFException {
		 setWMcas31Pe8090m(value);
	}

	
	
	
	/**
	 * 	initializes WMcas3Pe8090m
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setWMcas31Pe8090m(0);
   }

		public static int getWMcas3Pe8090mFieldLength() {
			return W_MCAS_3_PE_8090M_LENGTH;
		}

}
  

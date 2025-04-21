package com.cloudframe.app.ar640010.dto;

/**
*  The class CyclNumRange810 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CyclNumRange810 extends CyclNumRange810Serialized { 
   

								private short cyclNumLo810;

								private short cyclNumHi810;
	
	/**
	* Constructor for CyclNumRange810
	**/
    public CyclNumRange810() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CyclNumRange810. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CyclNumRange810(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setCyclNumLo810((short)0);
								setCyclNumHi810((short)0);
    } 

	public short getCyclNumLo810() throws CFException {
        if (isCyclNumLo810Modified()) { 
           cyclNumLo810 = refreshCyclNumLo810();
        }
   		return cyclNumLo810;
	}
	
	/**
	 * 	Update CyclNumLo810 with the passed value
	 *  Corresponding COBOL Variable is 810-CYCL-NUM-LO
	 *	@param number
	 */
	public void setCyclNumLo810(short number) {
			cyclNumLo810 = checkCyclNumLo810MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeCyclNumLo810(cyclNumLo810);
	}

	public void setCyclNumLo810(int number) {
	    number = checkCyclNumLo810MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCyclNumLo810((short)number);
	}
	public void setCyclNumLo810(long number) {
	    number = checkCyclNumLo810MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCyclNumLo810((short)number);
	}
	

	
	/**
	 *	Test condition 0 for isCyclNumMin88810()
	 *	@return  Returns true if isCyclNumMin88810() is 0
	 */
   public boolean isCyclNumMin88810() throws CFException {
      return (  getCyclNumLo810()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setCyclNumMin88810True() {  			
    	setCyclNumLo810( (short)0);
   	}
	public short getCyclNumHi810() throws CFException {
        if (isCyclNumHi810Modified()) { 
           cyclNumHi810 = refreshCyclNumHi810();
        }
   		return cyclNumHi810;
	}
	
	/**
	 * 	Update CyclNumHi810 with the passed value
	 *  Corresponding COBOL Variable is 810-CYCL-NUM-HI
	 *	@param number
	 */
	public void setCyclNumHi810(short number) {
			cyclNumHi810 = checkCyclNumHi810MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeCyclNumHi810(cyclNumHi810);
	}

	public void setCyclNumHi810(int number) {
	    number = checkCyclNumHi810MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCyclNumHi810((short)number);
	}
	public void setCyclNumHi810(long number) {
	    number = checkCyclNumHi810MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCyclNumHi810((short)number);
	}
	

	
	/**
	 *	Test condition 999 for isCyclNumMax88810()
	 *	@return  Returns true if isCyclNumMax88810() is 999
	 */
   public boolean isCyclNumMax88810() throws CFException {
      return (  getCyclNumHi810()  ==  999  );
   }


	/**
	*  set values 999
	*/
   	public void setCyclNumMax88810True() {  			
    	setCyclNumHi810( (short)999);
   	}

	
	
	

		public static int getCyclNumRange810FieldLength() {
			return CYCL_NUM_RANGE_810_LENGTH;
		}

}
  

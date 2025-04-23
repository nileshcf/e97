package com.cloudframe.app.bm8090m.dto;

/**
*  The class WMcat6Pe8090m is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/


import com.cloudframe.app.bm8090m.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class WMcat6Pe8090m extends WMcat6Pe8090mSerialized { 
   


								private int wMcat61Pe8090m;

						private char[] wMcat6pPe8090m = Field.fillLowValue(10);
	
	/**
	* Constructor for WMcat6Pe8090m
	**/
    public WMcat6Pe8090m() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WMcat6Pe8090m. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WMcat6Pe8090m(Field parent,int begin) {
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
    } 

	/**
	 *	Returns the value of wMcat61Pe8090m
	 *	@return wMcat61Pe8090m
	 */
	public int getWMcat61Pe8090m() throws CFException {
       if (isWMcat61Pe8090mModified()) { 
           wMcat61Pe8090m = refreshWMcat61Pe8090m();
        }
   		return wMcat61Pe8090m;
	}
	

	
	   
	/**
	 * 	Update WMcat61Pe8090m with the passed value
	 *  Corresponding COBOL Variable is W-MCAT61-PE8090M
	 *	@param number
	 */
	public void setWMcat61Pe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wMcat61Pe8090m = checkWMcat61Pe8090mMaxLimit(number); 
		serializeWMcat61Pe8090m(wMcat61Pe8090m);
	}
	

	public void setWMcat61Pe8090m(long number) {
	    number = checkWMcat61Pe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWMcat61Pe8090m((int)number);
	}
	
	/**
	 * 	Update WMcat61Pe8090m with the passed value
	 *	@param value (String or char[])
	 */
	public void setWMcat61Pe8090m(char[] value) throws CFException {
		 wMcat61Pe8090m = serializeWMcat61Pe8090m(value);
	}
	/**
	 * 	Update WMcat61Pe8090m with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWMcat61Pe8090mString(char[] value) throws CFException {
		 setWMcat61Pe8090m(value);
	}
	/**
	 *	Returns the value of wMcat6pPe8090m
	 *	@return wMcat6pPe8090m
	 */
   public char[] getWMcat6pPe8090m() throws CFException{
     if (isWMcat6pPe8090mModified()) { 
        wMcat6pPe8090m = refreshWMcat6pPe8090m();
     }
   		return wMcat6pPe8090m;
   }

  
	/**
	*  set variable wMcat6pPe8090m
	*  Corresponding COBOL Variable is W-MCAT6P-PE8090M
	*  @param value
	**/
   public void setWMcat6pPe8090m(char[] value) {
      wMcat6pPe8090m = checkWMcat6pPe8090mConstraints(value);
      serializeWMcat6pPe8090m(wMcat6pPe8090m);
   } 

     /**
	 * 	Update WMcat6pPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWMcat6pPe8090m(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWMcat6pPe8090m,wMcat6pPe8090m.length);
   	
   }
   
   public void setWMcat6pPe8090m(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWMcat6pPe8090m,wMcat6pPe8090m.length);
   	
   }
   
     /**
	 * 	Update WMcat6pPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcat6pPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWMcat6pPe8090m+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WMcat6pPe8090m with another Field
	 *	@param value
	 */
   public void setWMcat6pPe8090m(Field source) {
       replace(source,0,source.length(),beginWMcat6pPe8090m,W_MCAT_6P_PE_8090M_LEN);
   	
   }  
   
     /**
	 * 	Update WMcat6pPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWMcat6pPe8090m(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWMcat6pPe8090m,W_MCAT_6P_PE_8090M_LEN);
   	
   }
   
     /**
	 * 	Update WMcat6pPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcat6pPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWMcat6pPe8090m+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes WMcat6Pe8090m
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setWMcat61Pe8090m(0);
         setWMcat6pPe8090m(CONSTANTS.SPACE_10);
   }

		public static int getWMcat6Pe8090mFieldLength() {
			return W_MCAT_6_PE_8090M_LENGTH;
		}

}
  

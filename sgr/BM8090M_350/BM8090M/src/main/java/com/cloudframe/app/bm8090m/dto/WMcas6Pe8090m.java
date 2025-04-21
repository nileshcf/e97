package com.cloudframe.app.bm8090m.dto;

/**
*  The class WMcas6Pe8090m is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:05. using version 5.0.0.256
**/


import com.cloudframe.app.bm8090m.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class WMcas6Pe8090m extends WMcas6Pe8090mSerialized { 
   


								private int wMcas61Pe8090m;

						private char[] wMcas6pPe8090m = Field.fillLowValue(10);
	
	/**
	* Constructor for WMcas6Pe8090m
	**/
    public WMcas6Pe8090m() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WMcas6Pe8090m. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WMcas6Pe8090m(Field parent,int begin) {
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
	 *	Returns the value of wMcas61Pe8090m
	 *	@return wMcas61Pe8090m
	 */
	public int getWMcas61Pe8090m() throws CFException {
       if (isWMcas61Pe8090mModified()) { 
           wMcas61Pe8090m = refreshWMcas61Pe8090m();
        }
   		return wMcas61Pe8090m;
	}
	

	
	   
	/**
	 * 	Update WMcas61Pe8090m with the passed value
	 *  Corresponding COBOL Variable is W-MCAS61-PE8090M
	 *	@param number
	 */
	public void setWMcas61Pe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wMcas61Pe8090m = checkWMcas61Pe8090mMaxLimit(number); 
		serializeWMcas61Pe8090m(wMcas61Pe8090m);
	}
	

	public void setWMcas61Pe8090m(long number) {
	    number = checkWMcas61Pe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWMcas61Pe8090m((int)number);
	}
	
	/**
	 * 	Update WMcas61Pe8090m with the passed value
	 *	@param value (String or char[])
	 */
	public void setWMcas61Pe8090m(char[] value) throws CFException {
		 wMcas61Pe8090m = serializeWMcas61Pe8090m(value);
	}
	/**
	 * 	Update WMcas61Pe8090m with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWMcas61Pe8090mString(char[] value) throws CFException {
		 setWMcas61Pe8090m(value);
	}
	/**
	 *	Returns the value of wMcas6pPe8090m
	 *	@return wMcas6pPe8090m
	 */
   public char[] getWMcas6pPe8090m() throws CFException{
     if (isWMcas6pPe8090mModified()) { 
        wMcas6pPe8090m = refreshWMcas6pPe8090m();
     }
   		return wMcas6pPe8090m;
   }

  
	/**
	*  set variable wMcas6pPe8090m
	*  Corresponding COBOL Variable is W-MCAS6P-PE8090M
	*  @param value
	**/
   public void setWMcas6pPe8090m(char[] value) {
      wMcas6pPe8090m = checkWMcas6pPe8090mConstraints(value);
      serializeWMcas6pPe8090m(wMcas6pPe8090m);
   } 

     /**
	 * 	Update WMcas6pPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWMcas6pPe8090m(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWMcas6pPe8090m,wMcas6pPe8090m.length);
   	
   }
   
   public void setWMcas6pPe8090m(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWMcas6pPe8090m,wMcas6pPe8090m.length);
   	
   }
   
     /**
	 * 	Update WMcas6pPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcas6pPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWMcas6pPe8090m+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WMcas6pPe8090m with another Field
	 *	@param value
	 */
   public void setWMcas6pPe8090m(Field source) {
       replace(source,0,source.length(),beginWMcas6pPe8090m,W_MCAS_6P_PE_8090M_LEN);
   	
   }  
   
     /**
	 * 	Update WMcas6pPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWMcas6pPe8090m(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWMcas6pPe8090m,W_MCAS_6P_PE_8090M_LEN);
   	
   }
   
     /**
	 * 	Update WMcas6pPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcas6pPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWMcas6pPe8090m+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes WMcas6Pe8090m
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setWMcas61Pe8090m(0);
         setWMcas6pPe8090m(CONSTANTS.SPACE_10);
   }

		public static int getWMcas6Pe8090mFieldLength() {
			return W_MCAS_6_PE_8090M_LENGTH;
		}

}
  

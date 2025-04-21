package com.cloudframe.app.bm8090m.dto;

/**
*  The class WMcas7Pe8090m is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:59. using version 5.0.0.256
**/


import com.cloudframe.app.bm8090m.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class WMcas7Pe8090m extends WMcas7Pe8090mSerialized { 
   


								private int wMcas71Pe8090m;

						private char[] wMcas7pPe8090m = Field.fillLowValue(10);
	
	/**
	* Constructor for WMcas7Pe8090m
	**/
    public WMcas7Pe8090m() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WMcas7Pe8090m. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WMcas7Pe8090m(Field parent,int begin) {
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
    } 

	/**
	 *	Returns the value of wMcas71Pe8090m
	 *	@return wMcas71Pe8090m
	 */
	public int getWMcas71Pe8090m() throws CFException {
       if (isWMcas71Pe8090mModified()) { 
           wMcas71Pe8090m = refreshWMcas71Pe8090m();
        }
   		return wMcas71Pe8090m;
	}
	

	
	   
	/**
	 * 	Update WMcas71Pe8090m with the passed value
	 *  Corresponding COBOL Variable is W-MCAS71-PE8090M
	 *	@param number
	 */
	public void setWMcas71Pe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wMcas71Pe8090m = checkWMcas71Pe8090mMaxLimit(number); 
		serializeWMcas71Pe8090m(wMcas71Pe8090m);
	}
	

	public void setWMcas71Pe8090m(long number) {
	    number = checkWMcas71Pe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWMcas71Pe8090m((int)number);
	}
	
	/**
	 * 	Update WMcas71Pe8090m with the passed value
	 *	@param value (String or char[])
	 */
	public void setWMcas71Pe8090m(char[] value) throws CFException {
		 wMcas71Pe8090m = serializeWMcas71Pe8090m(value);
	}
	/**
	 * 	Update WMcas71Pe8090m with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWMcas71Pe8090mString(char[] value) throws CFException {
		 setWMcas71Pe8090m(value);
	}
	/**
	 *	Returns the value of wMcas7pPe8090m
	 *	@return wMcas7pPe8090m
	 */
   public char[] getWMcas7pPe8090m() throws CFException{
     if (isWMcas7pPe8090mModified()) { 
        wMcas7pPe8090m = refreshWMcas7pPe8090m();
     }
   		return wMcas7pPe8090m;
   }

  
	/**
	*  set variable wMcas7pPe8090m
	*  Corresponding COBOL Variable is W-MCAS7P-PE8090M
	*  @param value
	**/
   public void setWMcas7pPe8090m(char[] value) {
      wMcas7pPe8090m = checkWMcas7pPe8090mConstraints(value);
      serializeWMcas7pPe8090m(wMcas7pPe8090m);
   } 

     /**
	 * 	Update WMcas7pPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWMcas7pPe8090m(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWMcas7pPe8090m,wMcas7pPe8090m.length);
   	
   }
   
   public void setWMcas7pPe8090m(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWMcas7pPe8090m,wMcas7pPe8090m.length);
   	
   }
   
     /**
	 * 	Update WMcas7pPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcas7pPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWMcas7pPe8090m+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WMcas7pPe8090m with another Field
	 *	@param value
	 */
   public void setWMcas7pPe8090m(Field source) {
       replace(source,0,source.length(),beginWMcas7pPe8090m,W_MCAS_7P_PE_8090M_LEN);
   	
   }  
   
     /**
	 * 	Update WMcas7pPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWMcas7pPe8090m(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWMcas7pPe8090m,W_MCAS_7P_PE_8090M_LEN);
   	
   }
   
     /**
	 * 	Update WMcas7pPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcas7pPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWMcas7pPe8090m+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes WMcas7Pe8090m
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setWMcas71Pe8090m(0);
         setWMcas7pPe8090m(CONSTANTS.SPACE_10);
   }

		public static int getWMcas7Pe8090mFieldLength() {
			return W_MCAS_7_PE_8090M_LENGTH;
		}

}
  

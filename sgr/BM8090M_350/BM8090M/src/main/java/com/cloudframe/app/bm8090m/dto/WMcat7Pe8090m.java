package com.cloudframe.app.bm8090m.dto;

/**
*  The class WMcat7Pe8090m is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/


import com.cloudframe.app.bm8090m.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class WMcat7Pe8090m extends WMcat7Pe8090mSerialized { 
   


								private int wMcat71Pe8090m;

						private char[] wMcat7pPe8090m = Field.fillLowValue(10);
	
	/**
	* Constructor for WMcat7Pe8090m
	**/
    public WMcat7Pe8090m() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WMcat7Pe8090m. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WMcat7Pe8090m(Field parent,int begin) {
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
	 *	Returns the value of wMcat71Pe8090m
	 *	@return wMcat71Pe8090m
	 */
	public int getWMcat71Pe8090m() throws CFException {
       if (isWMcat71Pe8090mModified()) { 
           wMcat71Pe8090m = refreshWMcat71Pe8090m();
        }
   		return wMcat71Pe8090m;
	}
	

	
	   
	/**
	 * 	Update WMcat71Pe8090m with the passed value
	 *  Corresponding COBOL Variable is W-MCAT71-PE8090M
	 *	@param number
	 */
	public void setWMcat71Pe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wMcat71Pe8090m = checkWMcat71Pe8090mMaxLimit(number); 
		serializeWMcat71Pe8090m(wMcat71Pe8090m);
	}
	

	public void setWMcat71Pe8090m(long number) {
	    number = checkWMcat71Pe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWMcat71Pe8090m((int)number);
	}
	
	/**
	 * 	Update WMcat71Pe8090m with the passed value
	 *	@param value (String or char[])
	 */
	public void setWMcat71Pe8090m(char[] value) throws CFException {
		 wMcat71Pe8090m = serializeWMcat71Pe8090m(value);
	}
	/**
	 * 	Update WMcat71Pe8090m with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWMcat71Pe8090mString(char[] value) throws CFException {
		 setWMcat71Pe8090m(value);
	}
	/**
	 *	Returns the value of wMcat7pPe8090m
	 *	@return wMcat7pPe8090m
	 */
   public char[] getWMcat7pPe8090m() throws CFException{
     if (isWMcat7pPe8090mModified()) { 
        wMcat7pPe8090m = refreshWMcat7pPe8090m();
     }
   		return wMcat7pPe8090m;
   }

  
	/**
	*  set variable wMcat7pPe8090m
	*  Corresponding COBOL Variable is W-MCAT7P-PE8090M
	*  @param value
	**/
   public void setWMcat7pPe8090m(char[] value) {
      wMcat7pPe8090m = checkWMcat7pPe8090mConstraints(value);
      serializeWMcat7pPe8090m(wMcat7pPe8090m);
   } 

     /**
	 * 	Update WMcat7pPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWMcat7pPe8090m(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWMcat7pPe8090m,wMcat7pPe8090m.length);
   	
   }
   
   public void setWMcat7pPe8090m(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWMcat7pPe8090m,wMcat7pPe8090m.length);
   	
   }
   
     /**
	 * 	Update WMcat7pPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMcat7pPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWMcat7pPe8090m+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WMcat7pPe8090m with another Field
	 *	@param value
	 */
   public void setWMcat7pPe8090m(Field source) {
       replace(source,0,source.length(),beginWMcat7pPe8090m,W_MCAT_7P_PE_8090M_LEN);
   	
   }  
   
     /**
	 * 	Update WMcat7pPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWMcat7pPe8090m(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWMcat7pPe8090m,W_MCAT_7P_PE_8090M_LEN);
   	
   }
   
     /**
	 * 	Update WMcat7pPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMcat7pPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWMcat7pPe8090m+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes WMcat7Pe8090m
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setWMcat71Pe8090m(0);
         setWMcat7pPe8090m(CONSTANTS.SPACE_10);
   }

		public static int getWMcat7Pe8090mFieldLength() {
			return W_MCAT_7_PE_8090M_LENGTH;
		}

}
  

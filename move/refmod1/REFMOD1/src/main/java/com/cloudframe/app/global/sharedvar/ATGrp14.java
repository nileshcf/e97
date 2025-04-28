package com.cloudframe.app.global.sharedvar;

/**
*  The class ATGrp14 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class ATGrp14 extends ATGrp14Serialized { 
   

						private char[] fillerWs025 = Field.fillLowValue(5);
				private AT14 aT14 = new AT14();
	
	/**
	* Constructor for ATGrp14
	**/
    public ATGrp14() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ATGrp14. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ATGrp14(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			aT14.setParent(this,getStartOffset() + 5);
    } 

	/**
	 *	Returns the value of fillerWs025
	 *	@return fillerWs025
	 */
   public char[] getFillerWs025() throws CFException{
     if (isFillerWs025Modified()) { 
        fillerWs025 = refreshFillerWs025();
     }
   		return fillerWs025;
   }

  
	/**
	*  set variable fillerWs025
	*  Corresponding COBOL Variable is WS-FILLER
	*  @param value
	**/
   public void setFillerWs025(char[] value) {
      fillerWs025 = checkFillerWs025Constraints(value);
      serializeFillerWs025(fillerWs025);
   } 

     /**
	 * 	Update FillerWs025 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFillerWs025(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFillerWs025,fillerWs025.length);
   	
   }
   
   public void setFillerWs025(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs025,fillerWs025.length);
   	
   }
   
     /**
	 * 	Update FillerWs025 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs025(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs025+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FillerWs025 with another Field
	 *	@param value
	 */
   public void setFillerWs025(Field source) {
       replace(source,0,source.length(),beginFillerWs025,FILLER_WS_025_LEN);
   	
   }  
   
     /**
	 * 	Update FillerWs025 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFillerWs025(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFillerWs025,FILLER_WS_025_LEN);
   	
   }
   
     /**
	 * 	Update FillerWs025 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs025(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs025+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aT14
	 *	@return aT14
	 */   
	 public AT14 getAT14() {
   	return aT14;
   }
   /**
	* 	Update AT14 with the passed value
	*   Corresponding COBOL Variable is WS-14A-T
	*	@param value
	*/
   public void setAT14(char[] value) {
      aT14.setString(value); 
   }   
    
     /**
	 * 	Update AT14 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAT14(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT14.begin,aT14.length());
   }
   
     /**
	 * 	Update AT14 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAT14(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT14.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AT14 with another Field
	 *	@param value
	 */
   public void setAT14(Field source) {
   	replace(source,0,source.length(),aT14.begin,aT14.length());
   }  
   
     /**
	 * 	Update AT14 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAT14(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT14.begin,aT14.length());
   }
   
     /**
	 * 	Update AT14 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAT14(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT14.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes ATGrp14
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs025(CONSTANTS.SPACE_5);
          aT14.initialize();
     
   }

		public static int getATGrp14FieldLength() {
			return A_TGRP_14_LENGTH;
		}

}
  

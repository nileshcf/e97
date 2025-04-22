package com.cloudframe.app.global.sharedvar;

/**
*  The class ATGrp12 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class ATGrp12 extends ATGrp12Serialized { 
   

						private char[] fillerWs018 = Field.fillLowValue(5);
				private AT12 aT12 = new AT12();
	
	/**
	* Constructor for ATGrp12
	**/
    public ATGrp12() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ATGrp12. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ATGrp12(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			aT12.setParent(this,getStartOffset() + 5);
    } 

	/**
	 *	Returns the value of fillerWs018
	 *	@return fillerWs018
	 */
   public char[] getFillerWs018() throws CFException{
     if (isFillerWs018Modified()) { 
        fillerWs018 = refreshFillerWs018();
     }
   		return fillerWs018;
   }

  
	/**
	*  set variable fillerWs018
	*  Corresponding COBOL Variable is WS-FILLER
	*  @param value
	**/
   public void setFillerWs018(char[] value) {
      fillerWs018 = checkFillerWs018Constraints(value);
      serializeFillerWs018(fillerWs018);
   } 

     /**
	 * 	Update FillerWs018 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFillerWs018(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFillerWs018,fillerWs018.length);
   	
   }
   
   public void setFillerWs018(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs018,fillerWs018.length);
   	
   }
   
     /**
	 * 	Update FillerWs018 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs018(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs018+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FillerWs018 with another Field
	 *	@param value
	 */
   public void setFillerWs018(Field source) {
       replace(source,0,source.length(),beginFillerWs018,FILLER_WS_018_LEN);
   	
   }  
   
     /**
	 * 	Update FillerWs018 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFillerWs018(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFillerWs018,FILLER_WS_018_LEN);
   	
   }
   
     /**
	 * 	Update FillerWs018 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs018(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs018+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aT12
	 *	@return aT12
	 */   
	 public AT12 getAT12() {
   	return aT12;
   }
   /**
	* 	Update AT12 with the passed value
	*   Corresponding COBOL Variable is WS-12A-T
	*	@param value
	*/
   public void setAT12(char[] value) {
      aT12.setString(value); 
   }   
    
     /**
	 * 	Update AT12 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAT12(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT12.begin,aT12.length());
   }
   
     /**
	 * 	Update AT12 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAT12(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT12.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AT12 with another Field
	 *	@param value
	 */
   public void setAT12(Field source) {
   	replace(source,0,source.length(),aT12.begin,aT12.length());
   }  
   
     /**
	 * 	Update AT12 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAT12(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT12.begin,aT12.length());
   }
   
     /**
	 * 	Update AT12 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAT12(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT12.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes ATGrp12
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs018(CONSTANTS.SPACE_5);
          aT12.initialize();
     
   }

		public static int getATGrp12FieldLength() {
			return A_TGRP_12_LENGTH;
		}

}
  

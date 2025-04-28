package com.cloudframe.app.global.sharedvar;

/**
*  The class ATGrp13 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class ATGrp13 extends ATGrp13Serialized { 
   

						private char[] fillerWs021 = Field.fillLowValue(5);
				private AT13 aT13 = new AT13();
	
	/**
	* Constructor for ATGrp13
	**/
    public ATGrp13() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ATGrp13. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ATGrp13(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			aT13.setParent(this,getStartOffset() + 5);
    } 

	/**
	 *	Returns the value of fillerWs021
	 *	@return fillerWs021
	 */
   public char[] getFillerWs021() throws CFException{
     if (isFillerWs021Modified()) { 
        fillerWs021 = refreshFillerWs021();
     }
   		return fillerWs021;
   }

  
	/**
	*  set variable fillerWs021
	*  Corresponding COBOL Variable is WS-FILLER
	*  @param value
	**/
   public void setFillerWs021(char[] value) {
      fillerWs021 = checkFillerWs021Constraints(value);
      serializeFillerWs021(fillerWs021);
   } 

     /**
	 * 	Update FillerWs021 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFillerWs021(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFillerWs021,fillerWs021.length);
   	
   }
   
   public void setFillerWs021(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs021,fillerWs021.length);
   	
   }
   
     /**
	 * 	Update FillerWs021 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs021(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs021+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FillerWs021 with another Field
	 *	@param value
	 */
   public void setFillerWs021(Field source) {
       replace(source,0,source.length(),beginFillerWs021,FILLER_WS_021_LEN);
   	
   }  
   
     /**
	 * 	Update FillerWs021 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFillerWs021(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFillerWs021,FILLER_WS_021_LEN);
   	
   }
   
     /**
	 * 	Update FillerWs021 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs021(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs021+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aT13
	 *	@return aT13
	 */   
	 public AT13 getAT13() {
   	return aT13;
   }
   /**
	* 	Update AT13 with the passed value
	*   Corresponding COBOL Variable is WS-13A-T
	*	@param value
	*/
   public void setAT13(char[] value) {
      aT13.setString(value); 
   }   
    
     /**
	 * 	Update AT13 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAT13(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT13.begin,aT13.length());
   }
   
     /**
	 * 	Update AT13 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAT13(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT13.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AT13 with another Field
	 *	@param value
	 */
   public void setAT13(Field source) {
   	replace(source,0,source.length(),aT13.begin,aT13.length());
   }  
   
     /**
	 * 	Update AT13 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAT13(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT13.begin,aT13.length());
   }
   
     /**
	 * 	Update AT13 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAT13(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT13.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes ATGrp13
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs021(CONSTANTS.SPACE_5);
          aT13.initialize();
     
   }

		public static int getATGrp13FieldLength() {
			return A_TGRP_13_LENGTH;
		}

}
  

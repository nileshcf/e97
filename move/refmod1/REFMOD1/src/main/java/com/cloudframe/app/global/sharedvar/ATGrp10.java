package com.cloudframe.app.global.sharedvar;

/**
*  The class ATGrp10 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class ATGrp10 extends ATGrp10Serialized { 
   

						private char[] fillerWs013 = Field.fillLowValue(5);
				private AT10 aT10 = new AT10();
	
	/**
	* Constructor for ATGrp10
	**/
    public ATGrp10() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ATGrp10. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ATGrp10(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			aT10.setParent(this,getStartOffset() + 5);
    } 

	/**
	 *	Returns the value of fillerWs013
	 *	@return fillerWs013
	 */
   public char[] getFillerWs013() throws CFException{
     if (isFillerWs013Modified()) { 
        fillerWs013 = refreshFillerWs013();
     }
   		return fillerWs013;
   }

  
	/**
	*  set variable fillerWs013
	*  Corresponding COBOL Variable is WS-FILLER
	*  @param value
	**/
   public void setFillerWs013(char[] value) {
      fillerWs013 = checkFillerWs013Constraints(value);
      serializeFillerWs013(fillerWs013);
   } 

     /**
	 * 	Update FillerWs013 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFillerWs013(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFillerWs013,fillerWs013.length);
   	
   }
   
   public void setFillerWs013(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs013,fillerWs013.length);
   	
   }
   
     /**
	 * 	Update FillerWs013 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs013(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs013+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FillerWs013 with another Field
	 *	@param value
	 */
   public void setFillerWs013(Field source) {
       replace(source,0,source.length(),beginFillerWs013,FILLER_WS_013_LEN);
   	
   }  
   
     /**
	 * 	Update FillerWs013 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFillerWs013(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFillerWs013,FILLER_WS_013_LEN);
   	
   }
   
     /**
	 * 	Update FillerWs013 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs013(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs013+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aT10
	 *	@return aT10
	 */   
	 public AT10 getAT10() {
   	return aT10;
   }
   /**
	* 	Update AT10 with the passed value
	*   Corresponding COBOL Variable is WS-10A-T
	*	@param value
	*/
   public void setAT10(char[] value) {
      aT10.setString(value); 
   }   
    
     /**
	 * 	Update AT10 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAT10(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT10.begin,aT10.length());
   }
   
     /**
	 * 	Update AT10 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAT10(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT10.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AT10 with another Field
	 *	@param value
	 */
   public void setAT10(Field source) {
   	replace(source,0,source.length(),aT10.begin,aT10.length());
   }  
   
     /**
	 * 	Update AT10 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAT10(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT10.begin,aT10.length());
   }
   
     /**
	 * 	Update AT10 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAT10(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT10.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes ATGrp10
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs013(CONSTANTS.SPACE_5);
          aT10.initialize();
     
   }

		public static int getATGrp10FieldLength() {
			return A_TGRP_10_LENGTH;
		}

}
  

package com.cloudframe.app.global.sharedvar;

/**
*  The class ATGrp9 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class ATGrp9 extends ATGrp9Serialized { 
   

						private char[] fillerWs09 = Field.fillLowValue(5);
				private AT9 aT9 = new AT9();
	
	/**
	* Constructor for ATGrp9
	**/
    public ATGrp9() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ATGrp9. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ATGrp9(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			aT9.setParent(this,getStartOffset() + 5);
    } 

	/**
	 *	Returns the value of fillerWs09
	 *	@return fillerWs09
	 */
   public char[] getFillerWs09() throws CFException{
     if (isFillerWs09Modified()) { 
        fillerWs09 = refreshFillerWs09();
     }
   		return fillerWs09;
   }

  
	/**
	*  set variable fillerWs09
	*  Corresponding COBOL Variable is WS-FILLER
	*  @param value
	**/
   public void setFillerWs09(char[] value) {
      fillerWs09 = checkFillerWs09Constraints(value);
      serializeFillerWs09(fillerWs09);
   } 

     /**
	 * 	Update FillerWs09 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFillerWs09(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFillerWs09,fillerWs09.length);
   	
   }
   
   public void setFillerWs09(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs09,fillerWs09.length);
   	
   }
   
     /**
	 * 	Update FillerWs09 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs09(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs09+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FillerWs09 with another Field
	 *	@param value
	 */
   public void setFillerWs09(Field source) {
       replace(source,0,source.length(),beginFillerWs09,FILLER_WS_09_LEN);
   	
   }  
   
     /**
	 * 	Update FillerWs09 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFillerWs09(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFillerWs09,FILLER_WS_09_LEN);
   	
   }
   
     /**
	 * 	Update FillerWs09 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs09(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs09+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aT9
	 *	@return aT9
	 */   
	 public AT9 getAT9() {
   	return aT9;
   }
   /**
	* 	Update AT9 with the passed value
	*   Corresponding COBOL Variable is WS-9A-T
	*	@param value
	*/
   public void setAT9(char[] value) {
      aT9.setString(value); 
   }   
    
     /**
	 * 	Update AT9 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAT9(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT9.begin,aT9.length());
   }
   
     /**
	 * 	Update AT9 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAT9(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT9.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AT9 with another Field
	 *	@param value
	 */
   public void setAT9(Field source) {
   	replace(source,0,source.length(),aT9.begin,aT9.length());
   }  
   
     /**
	 * 	Update AT9 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAT9(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT9.begin,aT9.length());
   }
   
     /**
	 * 	Update AT9 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAT9(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT9.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes ATGrp9
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs09(CONSTANTS.SPACE_5);
          aT9.initialize();
     
   }

		public static int getATGrp9FieldLength() {
			return A_TGRP_9_LENGTH;
		}

}
  

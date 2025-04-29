package com.cloudframe.app.global.sharedvar;

/**
*  The class ATGrp7 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class ATGrp7 extends ATGrp7Serialized { 
   

						private char[] fillerWs04 = Field.fillLowValue(5);
				private AT7 aT7 = new AT7();
	
	/**
	* Constructor for ATGrp7
	**/
    public ATGrp7() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ATGrp7. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ATGrp7(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			aT7.setParent(this,getStartOffset() + 5);
    } 

	/**
	 *	Returns the value of fillerWs04
	 *	@return fillerWs04
	 */
   public char[] getFillerWs04() throws CFException{
     if (isFillerWs04Modified()) { 
        fillerWs04 = refreshFillerWs04();
     }
   		return fillerWs04;
   }

  
	/**
	*  set variable fillerWs04
	*  Corresponding COBOL Variable is WS-FILLER
	*  @param value
	**/
   public void setFillerWs04(char[] value) {
      fillerWs04 = checkFillerWs04Constraints(value);
      serializeFillerWs04(fillerWs04);
   } 

     /**
	 * 	Update FillerWs04 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFillerWs04(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFillerWs04,fillerWs04.length);
   	
   }
   
   public void setFillerWs04(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs04,fillerWs04.length);
   	
   }
   
     /**
	 * 	Update FillerWs04 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs04(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs04+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FillerWs04 with another Field
	 *	@param value
	 */
   public void setFillerWs04(Field source) {
       replace(source,0,source.length(),beginFillerWs04,FILLER_WS_04_LEN);
   	
   }  
   
     /**
	 * 	Update FillerWs04 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFillerWs04(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFillerWs04,FILLER_WS_04_LEN);
   	
   }
   
     /**
	 * 	Update FillerWs04 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs04(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs04+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aT7
	 *	@return aT7
	 */   
	 public AT7 getAT7() {
   	return aT7;
   }
   /**
	* 	Update AT7 with the passed value
	*   Corresponding COBOL Variable is WS-7A-T
	*	@param value
	*/
   public void setAT7(char[] value) {
      aT7.setString(value); 
   }   
    
     /**
	 * 	Update AT7 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAT7(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT7.begin,aT7.length());
   }
   
     /**
	 * 	Update AT7 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAT7(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT7.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AT7 with another Field
	 *	@param value
	 */
   public void setAT7(Field source) {
   	replace(source,0,source.length(),aT7.begin,aT7.length());
   }  
   
     /**
	 * 	Update AT7 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAT7(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT7.begin,aT7.length());
   }
   
     /**
	 * 	Update AT7 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAT7(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT7.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes ATGrp7
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs04(CONSTANTS.SPACE_5);
          aT7.initialize();
     
   }

		public static int getATGrp7FieldLength() {
			return A_TGRP_7_LENGTH;
		}

}
  

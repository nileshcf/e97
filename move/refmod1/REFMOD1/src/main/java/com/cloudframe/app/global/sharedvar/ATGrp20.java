package com.cloudframe.app.global.sharedvar;

/**
*  The class ATGrp20 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class ATGrp20 extends ATGrp20Serialized { 
   

						private char[] fillerWs038 = Field.fillLowValue(5);
				private AT20 aT20 = new AT20();
	
	/**
	* Constructor for ATGrp20
	**/
    public ATGrp20() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ATGrp20. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ATGrp20(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			aT20.setParent(this,getStartOffset() + 5);
    } 

	/**
	 *	Returns the value of fillerWs038
	 *	@return fillerWs038
	 */
   public char[] getFillerWs038() throws CFException{
     if (isFillerWs038Modified()) { 
        fillerWs038 = refreshFillerWs038();
     }
   		return fillerWs038;
   }

  
	/**
	*  set variable fillerWs038
	*  Corresponding COBOL Variable is WS-FILLER
	*  @param value
	**/
   public void setFillerWs038(char[] value) {
      fillerWs038 = checkFillerWs038Constraints(value);
      serializeFillerWs038(fillerWs038);
   } 

     /**
	 * 	Update FillerWs038 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFillerWs038(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFillerWs038,fillerWs038.length);
   	
   }
   
   public void setFillerWs038(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs038,fillerWs038.length);
   	
   }
   
     /**
	 * 	Update FillerWs038 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs038(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs038+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FillerWs038 with another Field
	 *	@param value
	 */
   public void setFillerWs038(Field source) {
       replace(source,0,source.length(),beginFillerWs038,FILLER_WS_038_LEN);
   	
   }  
   
     /**
	 * 	Update FillerWs038 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFillerWs038(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFillerWs038,FILLER_WS_038_LEN);
   	
   }
   
     /**
	 * 	Update FillerWs038 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs038(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs038+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aT20
	 *	@return aT20
	 */   
	 public AT20 getAT20() {
   	return aT20;
   }
   /**
	* 	Update AT20 with the passed value
	*   Corresponding COBOL Variable is WS-20A-T
	*	@param value
	*/
   public void setAT20(char[] value) {
      aT20.setString(value); 
   }   
    
     /**
	 * 	Update AT20 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAT20(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT20.begin,aT20.length());
   }
   
     /**
	 * 	Update AT20 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAT20(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT20.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AT20 with another Field
	 *	@param value
	 */
   public void setAT20(Field source) {
   	replace(source,0,source.length(),aT20.begin,aT20.length());
   }  
   
     /**
	 * 	Update AT20 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAT20(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT20.begin,aT20.length());
   }
   
     /**
	 * 	Update AT20 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAT20(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT20.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes ATGrp20
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs038(CONSTANTS.SPACE_5);
          aT20.initialize();
     
   }

		public static int getATGrp20FieldLength() {
			return A_TGRP_20_LENGTH;
		}

}
  

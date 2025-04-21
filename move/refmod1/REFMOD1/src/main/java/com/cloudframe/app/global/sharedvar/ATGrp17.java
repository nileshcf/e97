package com.cloudframe.app.global.sharedvar;

/**
*  The class ATGrp17 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class ATGrp17 extends ATGrp17Serialized { 
   

						private char[] fillerWs032 = Field.fillLowValue(5);
				private AT17 aT17 = new AT17();
	
	/**
	* Constructor for ATGrp17
	**/
    public ATGrp17() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ATGrp17. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ATGrp17(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			aT17.setParent(this,getStartOffset() + 5);
    } 

	/**
	 *	Returns the value of fillerWs032
	 *	@return fillerWs032
	 */
   public char[] getFillerWs032() throws CFException{
     if (isFillerWs032Modified()) { 
        fillerWs032 = refreshFillerWs032();
     }
   		return fillerWs032;
   }

  
	/**
	*  set variable fillerWs032
	*  Corresponding COBOL Variable is WS-FILLER
	*  @param value
	**/
   public void setFillerWs032(char[] value) {
      fillerWs032 = checkFillerWs032Constraints(value);
      serializeFillerWs032(fillerWs032);
   } 

     /**
	 * 	Update FillerWs032 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFillerWs032(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFillerWs032,fillerWs032.length);
   	
   }
   
   public void setFillerWs032(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs032,fillerWs032.length);
   	
   }
   
     /**
	 * 	Update FillerWs032 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs032(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs032+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FillerWs032 with another Field
	 *	@param value
	 */
   public void setFillerWs032(Field source) {
       replace(source,0,source.length(),beginFillerWs032,FILLER_WS_032_LEN);
   	
   }  
   
     /**
	 * 	Update FillerWs032 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFillerWs032(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFillerWs032,FILLER_WS_032_LEN);
   	
   }
   
     /**
	 * 	Update FillerWs032 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs032(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs032+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aT17
	 *	@return aT17
	 */   
	 public AT17 getAT17() {
   	return aT17;
   }
   /**
	* 	Update AT17 with the passed value
	*   Corresponding COBOL Variable is WS-17A-T
	*	@param value
	*/
   public void setAT17(char[] value) {
      aT17.setString(value); 
   }   
    
     /**
	 * 	Update AT17 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAT17(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT17.begin,aT17.length());
   }
   
     /**
	 * 	Update AT17 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAT17(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT17.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AT17 with another Field
	 *	@param value
	 */
   public void setAT17(Field source) {
   	replace(source,0,source.length(),aT17.begin,aT17.length());
   }  
   
     /**
	 * 	Update AT17 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAT17(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT17.begin,aT17.length());
   }
   
     /**
	 * 	Update AT17 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAT17(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT17.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes ATGrp17
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs032(CONSTANTS.SPACE_5);
          aT17.initialize();
     
   }

		public static int getATGrp17FieldLength() {
			return A_TGRP_17_LENGTH;
		}

}
  

package com.cloudframe.app.global.sharedvar;

/**
*  The class ATGrp19 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class ATGrp19 extends ATGrp19Serialized { 
   

						private char[] fillerWs036 = Field.fillLowValue(5);
				private AT19 aT19 = new AT19();
	
	/**
	* Constructor for ATGrp19
	**/
    public ATGrp19() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ATGrp19. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ATGrp19(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			aT19.setParent(this,getStartOffset() + 5);
    } 

	/**
	 *	Returns the value of fillerWs036
	 *	@return fillerWs036
	 */
   public char[] getFillerWs036() throws CFException{
     if (isFillerWs036Modified()) { 
        fillerWs036 = refreshFillerWs036();
     }
   		return fillerWs036;
   }

  
	/**
	*  set variable fillerWs036
	*  Corresponding COBOL Variable is WS-FILLER
	*  @param value
	**/
   public void setFillerWs036(char[] value) {
      fillerWs036 = checkFillerWs036Constraints(value);
      serializeFillerWs036(fillerWs036);
   } 

     /**
	 * 	Update FillerWs036 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFillerWs036(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFillerWs036,fillerWs036.length);
   	
   }
   
   public void setFillerWs036(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs036,fillerWs036.length);
   	
   }
   
     /**
	 * 	Update FillerWs036 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs036(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs036+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FillerWs036 with another Field
	 *	@param value
	 */
   public void setFillerWs036(Field source) {
       replace(source,0,source.length(),beginFillerWs036,FILLER_WS_036_LEN);
   	
   }  
   
     /**
	 * 	Update FillerWs036 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFillerWs036(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFillerWs036,FILLER_WS_036_LEN);
   	
   }
   
     /**
	 * 	Update FillerWs036 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs036(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs036+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aT19
	 *	@return aT19
	 */   
	 public AT19 getAT19() {
   	return aT19;
   }
   /**
	* 	Update AT19 with the passed value
	*   Corresponding COBOL Variable is WS-19A-T
	*	@param value
	*/
   public void setAT19(char[] value) {
      aT19.setString(value); 
   }   
    
     /**
	 * 	Update AT19 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAT19(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT19.begin,aT19.length());
   }
   
     /**
	 * 	Update AT19 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAT19(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT19.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AT19 with another Field
	 *	@param value
	 */
   public void setAT19(Field source) {
   	replace(source,0,source.length(),aT19.begin,aT19.length());
   }  
   
     /**
	 * 	Update AT19 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAT19(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT19.begin,aT19.length());
   }
   
     /**
	 * 	Update AT19 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAT19(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT19.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes ATGrp19
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs036(CONSTANTS.SPACE_5);
          aT19.initialize();
     
   }

		public static int getATGrp19FieldLength() {
			return A_TGRP_19_LENGTH;
		}

}
  

package com.cloudframe.app.global.sharedvar;

/**
*  The class ATGrp18 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class ATGrp18 extends ATGrp18Serialized { 
   

						private char[] fillerWs034 = Field.fillLowValue(5);
				private AT18 aT18 = new AT18();
	
	/**
	* Constructor for ATGrp18
	**/
    public ATGrp18() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ATGrp18. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ATGrp18(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			aT18.setParent(this,getStartOffset() + 5);
    } 

	/**
	 *	Returns the value of fillerWs034
	 *	@return fillerWs034
	 */
   public char[] getFillerWs034() throws CFException{
     if (isFillerWs034Modified()) { 
        fillerWs034 = refreshFillerWs034();
     }
   		return fillerWs034;
   }

  
	/**
	*  set variable fillerWs034
	*  Corresponding COBOL Variable is WS-FILLER
	*  @param value
	**/
   public void setFillerWs034(char[] value) {
      fillerWs034 = checkFillerWs034Constraints(value);
      serializeFillerWs034(fillerWs034);
   } 

     /**
	 * 	Update FillerWs034 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFillerWs034(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFillerWs034,fillerWs034.length);
   	
   }
   
   public void setFillerWs034(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs034,fillerWs034.length);
   	
   }
   
     /**
	 * 	Update FillerWs034 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs034(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs034+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FillerWs034 with another Field
	 *	@param value
	 */
   public void setFillerWs034(Field source) {
       replace(source,0,source.length(),beginFillerWs034,FILLER_WS_034_LEN);
   	
   }  
   
     /**
	 * 	Update FillerWs034 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFillerWs034(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFillerWs034,FILLER_WS_034_LEN);
   	
   }
   
     /**
	 * 	Update FillerWs034 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs034(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs034+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aT18
	 *	@return aT18
	 */   
	 public AT18 getAT18() {
   	return aT18;
   }
   /**
	* 	Update AT18 with the passed value
	*   Corresponding COBOL Variable is WS-18A-T
	*	@param value
	*/
   public void setAT18(char[] value) {
      aT18.setString(value); 
   }   
    
     /**
	 * 	Update AT18 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAT18(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT18.begin,aT18.length());
   }
   
     /**
	 * 	Update AT18 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAT18(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT18.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AT18 with another Field
	 *	@param value
	 */
   public void setAT18(Field source) {
   	replace(source,0,source.length(),aT18.begin,aT18.length());
   }  
   
     /**
	 * 	Update AT18 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAT18(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT18.begin,aT18.length());
   }
   
     /**
	 * 	Update AT18 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAT18(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT18.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes ATGrp18
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs034(CONSTANTS.SPACE_5);
          aT18.initialize();
     
   }

		public static int getATGrp18FieldLength() {
			return A_TGRP_18_LENGTH;
		}

}
  

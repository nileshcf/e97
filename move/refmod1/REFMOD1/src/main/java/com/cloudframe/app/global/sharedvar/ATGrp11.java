package com.cloudframe.app.global.sharedvar;

/**
*  The class ATGrp11 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class ATGrp11 extends ATGrp11Serialized { 
   

						private char[] fillerWs016 = Field.fillLowValue(5);
				private AT11 aT11 = new AT11();
	
	/**
	* Constructor for ATGrp11
	**/
    public ATGrp11() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ATGrp11. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ATGrp11(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			aT11.setParent(this,getStartOffset() + 5);
    } 

	/**
	 *	Returns the value of fillerWs016
	 *	@return fillerWs016
	 */
   public char[] getFillerWs016() throws CFException{
     if (isFillerWs016Modified()) { 
        fillerWs016 = refreshFillerWs016();
     }
   		return fillerWs016;
   }

  
	/**
	*  set variable fillerWs016
	*  Corresponding COBOL Variable is WS-FILLER
	*  @param value
	**/
   public void setFillerWs016(char[] value) {
      fillerWs016 = checkFillerWs016Constraints(value);
      serializeFillerWs016(fillerWs016);
   } 

     /**
	 * 	Update FillerWs016 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFillerWs016(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFillerWs016,fillerWs016.length);
   	
   }
   
   public void setFillerWs016(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs016,fillerWs016.length);
   	
   }
   
     /**
	 * 	Update FillerWs016 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs016(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs016+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FillerWs016 with another Field
	 *	@param value
	 */
   public void setFillerWs016(Field source) {
       replace(source,0,source.length(),beginFillerWs016,FILLER_WS_016_LEN);
   	
   }  
   
     /**
	 * 	Update FillerWs016 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFillerWs016(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFillerWs016,FILLER_WS_016_LEN);
   	
   }
   
     /**
	 * 	Update FillerWs016 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs016(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs016+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aT11
	 *	@return aT11
	 */   
	 public AT11 getAT11() {
   	return aT11;
   }
   /**
	* 	Update AT11 with the passed value
	*   Corresponding COBOL Variable is WS-11A-T
	*	@param value
	*/
   public void setAT11(char[] value) {
      aT11.setString(value); 
   }   
    
     /**
	 * 	Update AT11 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAT11(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT11.begin,aT11.length());
   }
   
     /**
	 * 	Update AT11 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAT11(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT11.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AT11 with another Field
	 *	@param value
	 */
   public void setAT11(Field source) {
   	replace(source,0,source.length(),aT11.begin,aT11.length());
   }  
   
     /**
	 * 	Update AT11 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAT11(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT11.begin,aT11.length());
   }
   
     /**
	 * 	Update AT11 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAT11(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT11.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes ATGrp11
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs016(CONSTANTS.SPACE_5);
          aT11.initialize();
     
   }

		public static int getATGrp11FieldLength() {
			return A_TGRP_11_LENGTH;
		}

}
  

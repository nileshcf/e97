package com.cloudframe.app.global.sharedvar;

/**
*  The class BSGrp9 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_bSGrp9")

public class BSGrp9 extends BSGrp9Serialized  implements InitializingBean {
   

						private char[] fillerWs010 = Field.fillLowValue(3);
				private BS9 bS9 = new BS9();
	
	/**
	* Constructor for BSGrp9
	**/
    public BSGrp9() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			bS9.setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of fillerWs010
	 *	@return fillerWs010
	 */
   public char[] getFillerWs010() throws CFException{
     if (isFillerWs010Modified()) { 
        fillerWs010 = refreshFillerWs010();
     }
   		return fillerWs010;
   }

  
	/**
	*  set variable fillerWs010
	*  Corresponding COBOL Variable is WS-FILLER
	*  @param value
	**/
   public void setFillerWs010(char[] value) {
      fillerWs010 = checkFillerWs010Constraints(value);
      serializeFillerWs010(fillerWs010);
   } 

     /**
	 * 	Update FillerWs010 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFillerWs010(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFillerWs010,fillerWs010.length);
   	
   }
   
   public void setFillerWs010(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs010,fillerWs010.length);
   	
   }
   
     /**
	 * 	Update FillerWs010 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs010(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs010+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FillerWs010 with another Field
	 *	@param value
	 */
   public void setFillerWs010(Field source) {
       replace(source,0,source.length(),beginFillerWs010,FILLER_WS_010_LEN);
   	
   }  
   
     /**
	 * 	Update FillerWs010 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFillerWs010(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFillerWs010,FILLER_WS_010_LEN);
   	
   }
   
     /**
	 * 	Update FillerWs010 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs010(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs010+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bS9
	 *	@return bS9
	 */   
	 public BS9 getBS9() {
   	return bS9;
   }
   /**
	* 	Update BS9 with the passed value
	*   Corresponding COBOL Variable is WS-9B-S
	*	@param value
	*/
   public void setBS9(char[] value) {
      bS9.setString(value); 
   }   
    
     /**
	 * 	Update BS9 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBS9(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bS9.begin,bS9.length());
   }
   
     /**
	 * 	Update BS9 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBS9(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bS9.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BS9 with another Field
	 *	@param value
	 */
   public void setBS9(Field source) {
   	replace(source,0,source.length(),bS9.begin,bS9.length());
   }  
   
     /**
	 * 	Update BS9 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBS9(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bS9.begin,bS9.length());
   }
   
     /**
	 * 	Update BS9 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBS9(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bS9.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes BSGrp9
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs010(CONSTANTS.SPACE_3);
          bS9.initialize();
     
   }

		public static int getBSGrp9FieldLength() {
			return B_SGRP_9_LENGTH;
		}

}
  

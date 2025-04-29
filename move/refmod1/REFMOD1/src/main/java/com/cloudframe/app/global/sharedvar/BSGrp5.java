package com.cloudframe.app.global.sharedvar;

/**
*  The class BSGrp5 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_bSGrp5")

public class BSGrp5 extends BSGrp5Serialized  implements InitializingBean {
   

						private char[] fillerWs01 = Field.fillLowValue(3);
				private BS5 bS5 = new BS5();
	
	/**
	* Constructor for BSGrp5
	**/
    public BSGrp5() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			bS5.setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of fillerWs01
	 *	@return fillerWs01
	 */
   public char[] getFillerWs01() throws CFException{
     if (isFillerWs01Modified()) { 
        fillerWs01 = refreshFillerWs01();
     }
   		return fillerWs01;
   }

  
	/**
	*  set variable fillerWs01
	*  Corresponding COBOL Variable is WS-FILLER
	*  @param value
	**/
   public void setFillerWs01(char[] value) {
      fillerWs01 = checkFillerWs01Constraints(value);
      serializeFillerWs01(fillerWs01);
   } 

     /**
	 * 	Update FillerWs01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFillerWs01(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFillerWs01,fillerWs01.length);
   	
   }
   
   public void setFillerWs01(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs01,fillerWs01.length);
   	
   }
   
     /**
	 * 	Update FillerWs01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs01+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FillerWs01 with another Field
	 *	@param value
	 */
   public void setFillerWs01(Field source) {
       replace(source,0,source.length(),beginFillerWs01,FILLER_WS_01_LEN);
   	
   }  
   
     /**
	 * 	Update FillerWs01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFillerWs01(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFillerWs01,FILLER_WS_01_LEN);
   	
   }
   
     /**
	 * 	Update FillerWs01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs01+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bS5
	 *	@return bS5
	 */   
	 public BS5 getBS5() {
   	return bS5;
   }
   /**
	* 	Update BS5 with the passed value
	*   Corresponding COBOL Variable is WS-5B-S
	*	@param value
	*/
   public void setBS5(char[] value) {
      bS5.setString(value); 
   }   
    
     /**
	 * 	Update BS5 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBS5(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bS5.begin,bS5.length());
   }
   
     /**
	 * 	Update BS5 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBS5(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bS5.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BS5 with another Field
	 *	@param value
	 */
   public void setBS5(Field source) {
   	replace(source,0,source.length(),bS5.begin,bS5.length());
   }  
   
     /**
	 * 	Update BS5 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBS5(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bS5.begin,bS5.length());
   }
   
     /**
	 * 	Update BS5 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBS5(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bS5.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes BSGrp5
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs01(CONSTANTS.SPACE_3);
          bS5.initialize();
     
   }

		public static int getBSGrp5FieldLength() {
			return B_SGRP_5_LENGTH;
		}

}
  

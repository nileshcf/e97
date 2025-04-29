package com.cloudframe.app.global.sharedvar;

/**
*  The class ASGrp5 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_aSGrp5")

public class ASGrp5 extends ASGrp5Serialized  implements InitializingBean {
   

						private char[] fillerWs = Field.fillLowValue(3);
				private AS5 aS5 = new AS5();
	
	/**
	* Constructor for ASGrp5
	**/
    public ASGrp5() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			aS5.setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of fillerWs
	 *	@return fillerWs
	 */
   public char[] getFillerWs() throws CFException{
     if (isFillerWsModified()) { 
        fillerWs = refreshFillerWs();
     }
   		return fillerWs;
   }

  
	/**
	*  set variable fillerWs
	*  Corresponding COBOL Variable is WS-FILLER
	*  @param value
	**/
   public void setFillerWs(char[] value) {
      fillerWs = checkFillerWsConstraints(value);
      serializeFillerWs(fillerWs);
   } 

     /**
	 * 	Update FillerWs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFillerWs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFillerWs,fillerWs.length);
   	
   }
   
   public void setFillerWs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs,fillerWs.length);
   	
   }
   
     /**
	 * 	Update FillerWs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FillerWs with another Field
	 *	@param value
	 */
   public void setFillerWs(Field source) {
       replace(source,0,source.length(),beginFillerWs,FILLER_WS_LEN);
   	
   }  
   
     /**
	 * 	Update FillerWs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFillerWs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFillerWs,FILLER_WS_LEN);
   	
   }
   
     /**
	 * 	Update FillerWs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aS5
	 *	@return aS5
	 */   
	 public AS5 getAS5() {
   	return aS5;
   }
   /**
	* 	Update AS5 with the passed value
	*   Corresponding COBOL Variable is WS-5A-S
	*	@param value
	*/
   public void setAS5(char[] value) {
      aS5.setString(value); 
   }   
    
     /**
	 * 	Update AS5 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAS5(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aS5.begin,aS5.length());
   }
   
     /**
	 * 	Update AS5 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAS5(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aS5.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AS5 with another Field
	 *	@param value
	 */
   public void setAS5(Field source) {
   	replace(source,0,source.length(),aS5.begin,aS5.length());
   }  
   
     /**
	 * 	Update AS5 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAS5(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aS5.begin,aS5.length());
   }
   
     /**
	 * 	Update AS5 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAS5(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aS5.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes ASGrp5
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs(CONSTANTS.SPACE_3);
          aS5.initialize();
     
   }

		public static int getASGrp5FieldLength() {
			return A_SGRP_5_LENGTH;
		}

}
  

package com.cloudframe.app.global.sharedvar;

/**
*  The class ASGrp10 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_aSGrp10")

public class ASGrp10 extends ASGrp10Serialized  implements InitializingBean {
   

						private char[] fillerWs012 = Field.fillLowValue(3);

						private char[] aS10 = Field.fillLowValue(70);
	
	/**
	* Constructor for ASGrp10
	**/
    public ASGrp10() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of fillerWs012
	 *	@return fillerWs012
	 */
   public char[] getFillerWs012() throws CFException{
     if (isFillerWs012Modified()) { 
        fillerWs012 = refreshFillerWs012();
     }
   		return fillerWs012;
   }

  
	/**
	*  set variable fillerWs012
	*  Corresponding COBOL Variable is WS-FILLER
	*  @param value
	**/
   public void setFillerWs012(char[] value) {
      fillerWs012 = checkFillerWs012Constraints(value);
      serializeFillerWs012(fillerWs012);
   } 

     /**
	 * 	Update FillerWs012 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFillerWs012(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFillerWs012,fillerWs012.length);
   	
   }
   
   public void setFillerWs012(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs012,fillerWs012.length);
   	
   }
   
     /**
	 * 	Update FillerWs012 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs012(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs012+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FillerWs012 with another Field
	 *	@param value
	 */
   public void setFillerWs012(Field source) {
       replace(source,0,source.length(),beginFillerWs012,FILLER_WS_012_LEN);
   	
   }  
   
     /**
	 * 	Update FillerWs012 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFillerWs012(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFillerWs012,FILLER_WS_012_LEN);
   	
   }
   
     /**
	 * 	Update FillerWs012 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs012(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs012+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aS10
	 *	@return aS10
	 */
   public char[] getAS10() throws CFException{
     if (isAS10Modified()) { 
        aS10 = refreshAS10();
     }
   		return aS10;
   }

  
	/**
	*  set variable aS10
	*  Corresponding COBOL Variable is WS-10A-S
	*  @param value
	**/
   public void setAS10(char[] value) {
      aS10 = checkAS10Constraints(value);
      serializeAS10(aS10);
   } 

     /**
	 * 	Update AS10 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAS10(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAS10,aS10.length);
   	
   }
   
   public void setAS10(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAS10,aS10.length);
   	
   }
   
     /**
	 * 	Update AS10 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAS10(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAS10+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AS10 with another Field
	 *	@param value
	 */
   public void setAS10(Field source) {
       replace(source,0,source.length(),beginAS10,A_S_10_LEN);
   	
   }  
   
     /**
	 * 	Update AS10 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAS10(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAS10,A_S_10_LEN);
   	
   }
   
     /**
	 * 	Update AS10 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAS10(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAS10+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes ASGrp10
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs012(CONSTANTS.SPACE_3);
         setAS10(CONSTANTS.SPACE_70);
   }

		public static int getASGrp10FieldLength() {
			return A_SGRP_10_LENGTH;
		}

}
  

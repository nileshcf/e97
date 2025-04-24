package com.cloudframe.app.global.sharedvar;

/**
*  The class ASGrp9 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@GlobalDto
public class ASGrp9 extends ASGrp9Serialized { 
   

						private char[] fillerWs08 = Field.fillLowValue(3);
				private AS9 aS9 = new AS9();
	
	/**
	* Constructor for ASGrp9
	**/
    public ASGrp9() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			aS9.setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of fillerWs08
	 *	@return fillerWs08
	 */
   public char[] getFillerWs08() throws CFException{
     if (isFillerWs08Modified()) { 
        fillerWs08 = refreshFillerWs08();
     }
   		return fillerWs08;
   }

  
	/**
	*  set variable fillerWs08
	*  Corresponding COBOL Variable is WS-FILLER
	*  @param value
	**/
   public void setFillerWs08(char[] value) {
      fillerWs08 = checkFillerWs08Constraints(value);
      serializeFillerWs08(fillerWs08);
   } 

     /**
	 * 	Update FillerWs08 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFillerWs08(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFillerWs08,fillerWs08.length);
   	
   }
   
   public void setFillerWs08(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs08,fillerWs08.length);
   	
   }
   
     /**
	 * 	Update FillerWs08 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs08(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs08+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FillerWs08 with another Field
	 *	@param value
	 */
   public void setFillerWs08(Field source) {
       replace(source,0,source.length(),beginFillerWs08,FILLER_WS_08_LEN);
   	
   }  
   
     /**
	 * 	Update FillerWs08 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFillerWs08(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFillerWs08,FILLER_WS_08_LEN);
   	
   }
   
     /**
	 * 	Update FillerWs08 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs08(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs08+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aS9
	 *	@return aS9
	 */   
	 public AS9 getAS9() {
   	return aS9;
   }
   /**
	* 	Update AS9 with the passed value
	*   Corresponding COBOL Variable is WS-9A-S
	*	@param value
	*/
   public void setAS9(char[] value) {
      aS9.setString(value); 
   }   
    
     /**
	 * 	Update AS9 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAS9(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aS9.begin,aS9.length());
   }
   
     /**
	 * 	Update AS9 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAS9(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aS9.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AS9 with another Field
	 *	@param value
	 */
   public void setAS9(Field source) {
   	replace(source,0,source.length(),aS9.begin,aS9.length());
   }  
   
     /**
	 * 	Update AS9 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAS9(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aS9.begin,aS9.length());
   }
   
     /**
	 * 	Update AS9 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAS9(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aS9.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes ASGrp9
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs08(CONSTANTS.SPACE_3);
          aS9.initialize();
     
   }

		public static int getASGrp9FieldLength() {
			return A_SGRP_9_LENGTH;
		}

}
  

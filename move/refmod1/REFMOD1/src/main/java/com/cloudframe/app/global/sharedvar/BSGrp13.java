package com.cloudframe.app.global.sharedvar;

/**
*  The class BSGrp13 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@GlobalDto
public class BSGrp13 extends BSGrp13Serialized { 
   

						private char[] fillerWs022 = Field.fillLowValue(3);
				private BS13 bS13 = new BS13();
	
	/**
	* Constructor for BSGrp13
	**/
    public BSGrp13() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			bS13.setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of fillerWs022
	 *	@return fillerWs022
	 */
   public char[] getFillerWs022() throws CFException{
     if (isFillerWs022Modified()) { 
        fillerWs022 = refreshFillerWs022();
     }
   		return fillerWs022;
   }

  
	/**
	*  set variable fillerWs022
	*  Corresponding COBOL Variable is WS-FILLER
	*  @param value
	**/
   public void setFillerWs022(char[] value) {
      fillerWs022 = checkFillerWs022Constraints(value);
      serializeFillerWs022(fillerWs022);
   } 

     /**
	 * 	Update FillerWs022 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFillerWs022(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFillerWs022,fillerWs022.length);
   	
   }
   
   public void setFillerWs022(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs022,fillerWs022.length);
   	
   }
   
     /**
	 * 	Update FillerWs022 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs022(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs022+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FillerWs022 with another Field
	 *	@param value
	 */
   public void setFillerWs022(Field source) {
       replace(source,0,source.length(),beginFillerWs022,FILLER_WS_022_LEN);
   	
   }  
   
     /**
	 * 	Update FillerWs022 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFillerWs022(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFillerWs022,FILLER_WS_022_LEN);
   	
   }
   
     /**
	 * 	Update FillerWs022 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs022(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs022+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bS13
	 *	@return bS13
	 */   
	 public BS13 getBS13() {
   	return bS13;
   }
   /**
	* 	Update BS13 with the passed value
	*   Corresponding COBOL Variable is WS-13B-S
	*	@param value
	*/
   public void setBS13(char[] value) {
      bS13.setString(value); 
   }   
    
     /**
	 * 	Update BS13 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBS13(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bS13.begin,bS13.length());
   }
   
     /**
	 * 	Update BS13 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBS13(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bS13.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BS13 with another Field
	 *	@param value
	 */
   public void setBS13(Field source) {
   	replace(source,0,source.length(),bS13.begin,bS13.length());
   }  
   
     /**
	 * 	Update BS13 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBS13(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bS13.begin,bS13.length());
   }
   
     /**
	 * 	Update BS13 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBS13(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bS13.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes BSGrp13
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs022(CONSTANTS.SPACE_3);
          bS13.initialize();
     
   }

		public static int getBSGrp13FieldLength() {
			return B_SGRP_13_LENGTH;
		}

}
  

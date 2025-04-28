package com.cloudframe.app.global.sharedvar;

/**
*  The class BSGrp15 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@GlobalDto
public class BSGrp15 extends BSGrp15Serialized { 
   

						private char[] fillerWs029 = Field.fillLowValue(3);
				private BS15 bS15 = new BS15();
	
	/**
	* Constructor for BSGrp15
	**/
    public BSGrp15() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			bS15.setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of fillerWs029
	 *	@return fillerWs029
	 */
   public char[] getFillerWs029() throws CFException{
     if (isFillerWs029Modified()) { 
        fillerWs029 = refreshFillerWs029();
     }
   		return fillerWs029;
   }

  
	/**
	*  set variable fillerWs029
	*  Corresponding COBOL Variable is WS-FILLER
	*  @param value
	**/
   public void setFillerWs029(char[] value) {
      fillerWs029 = checkFillerWs029Constraints(value);
      serializeFillerWs029(fillerWs029);
   } 

     /**
	 * 	Update FillerWs029 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFillerWs029(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFillerWs029,fillerWs029.length);
   	
   }
   
   public void setFillerWs029(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs029,fillerWs029.length);
   	
   }
   
     /**
	 * 	Update FillerWs029 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs029(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs029+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FillerWs029 with another Field
	 *	@param value
	 */
   public void setFillerWs029(Field source) {
       replace(source,0,source.length(),beginFillerWs029,FILLER_WS_029_LEN);
   	
   }  
   
     /**
	 * 	Update FillerWs029 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFillerWs029(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFillerWs029,FILLER_WS_029_LEN);
   	
   }
   
     /**
	 * 	Update FillerWs029 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs029(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs029+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bS15
	 *	@return bS15
	 */   
	 public BS15 getBS15() {
   	return bS15;
   }
   /**
	* 	Update BS15 with the passed value
	*   Corresponding COBOL Variable is WS-15B-S
	*	@param value
	*/
   public void setBS15(char[] value) {
      bS15.setString(value); 
   }   
    
     /**
	 * 	Update BS15 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBS15(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bS15.begin,bS15.length());
   }
   
     /**
	 * 	Update BS15 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBS15(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bS15.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BS15 with another Field
	 *	@param value
	 */
   public void setBS15(Field source) {
   	replace(source,0,source.length(),bS15.begin,bS15.length());
   }  
   
     /**
	 * 	Update BS15 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBS15(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bS15.begin,bS15.length());
   }
   
     /**
	 * 	Update BS15 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBS15(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bS15.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes BSGrp15
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs029(CONSTANTS.SPACE_3);
          bS15.initialize();
     
   }

		public static int getBSGrp15FieldLength() {
			return B_SGRP_15_LENGTH;
		}

}
  

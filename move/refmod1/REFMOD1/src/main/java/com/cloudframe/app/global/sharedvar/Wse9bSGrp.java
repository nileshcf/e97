package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse9bSGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@GlobalDto
public class Wse9bSGrp extends Wse9bSGrpSerialized { 
   

						private char[] wseFiller010 = Field.fillLowValue(3);
				private Wse9bS wse9bS = new Wse9bS();
	
	/**
	* Constructor for Wse9bSGrp
	**/
    public Wse9bSGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wse9bS.setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wseFiller010
	 *	@return wseFiller010
	 */
   public char[] getWseFiller010() throws CFException{
     if (isWseFiller010Modified()) { 
        wseFiller010 = refreshWseFiller010();
     }
   		return wseFiller010;
   }

  
	/**
	*  set variable wseFiller010
	*  Corresponding COBOL Variable is WSE-FILLER
	*  @param value
	**/
   public void setWseFiller010(char[] value) {
      wseFiller010 = checkWseFiller010Constraints(value);
      serializeWseFiller010(wseFiller010);
   } 

     /**
	 * 	Update WseFiller010 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWseFiller010(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWseFiller010,wseFiller010.length);
   	
   }
   
   public void setWseFiller010(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller010,wseFiller010.length);
   	
   }
   
     /**
	 * 	Update WseFiller010 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller010(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller010+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WseFiller010 with another Field
	 *	@param value
	 */
   public void setWseFiller010(Field source) {
       replace(source,0,source.length(),beginWseFiller010,WSE_FILLER_010_LEN);
   	
   }  
   
     /**
	 * 	Update WseFiller010 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWseFiller010(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWseFiller010,WSE_FILLER_010_LEN);
   	
   }
   
     /**
	 * 	Update WseFiller010 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller010(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller010+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse9bS
	 *	@return wse9bS
	 */   
	 public Wse9bS getWse9bS() {
   	return wse9bS;
   }
   /**
	* 	Update Wse9bS with the passed value
	*   Corresponding COBOL Variable is WSE-9B-S
	*	@param value
	*/
   public void setWse9bS(char[] value) {
      wse9bS.setString(value); 
   }   
    
     /**
	 * 	Update Wse9bS 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse9bS(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse9bS.begin,wse9bS.length());
   }
   
     /**
	 * 	Update Wse9bS 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse9bS(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse9bS.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse9bS with another Field
	 *	@param value
	 */
   public void setWse9bS(Field source) {
   	replace(source,0,source.length(),wse9bS.begin,wse9bS.length());
   }  
   
     /**
	 * 	Update Wse9bS 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse9bS(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse9bS.begin,wse9bS.length());
   }
   
     /**
	 * 	Update Wse9bS 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse9bS(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse9bS.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Wse9bSGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller010(CONSTANTS.SPACE_3);
          wse9bS.initialize();
     
   }

		public static int getWse9bSGrpFieldLength() {
			return WSE_9B_SGRP_LENGTH;
		}

}
  

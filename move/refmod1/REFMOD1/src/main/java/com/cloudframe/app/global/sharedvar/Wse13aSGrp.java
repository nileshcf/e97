package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse13aSGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_wse13aSGrp")

public class Wse13aSGrp extends Wse13aSGrpSerialized  implements InitializingBean {
   

						private char[] wseFiller020 = Field.fillLowValue(3);
				private Wse13aS wse13aS = new Wse13aS();
	
	/**
	* Constructor for Wse13aSGrp
	**/
    public Wse13aSGrp() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			wse13aS.setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of wseFiller020
	 *	@return wseFiller020
	 */
   public char[] getWseFiller020() throws CFException{
     if (isWseFiller020Modified()) { 
        wseFiller020 = refreshWseFiller020();
     }
   		return wseFiller020;
   }

  
	/**
	*  set variable wseFiller020
	*  Corresponding COBOL Variable is WSE-FILLER
	*  @param value
	**/
   public void setWseFiller020(char[] value) {
      wseFiller020 = checkWseFiller020Constraints(value);
      serializeWseFiller020(wseFiller020);
   } 

     /**
	 * 	Update WseFiller020 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWseFiller020(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWseFiller020,wseFiller020.length);
   	
   }
   
   public void setWseFiller020(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller020,wseFiller020.length);
   	
   }
   
     /**
	 * 	Update WseFiller020 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller020(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller020+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WseFiller020 with another Field
	 *	@param value
	 */
   public void setWseFiller020(Field source) {
       replace(source,0,source.length(),beginWseFiller020,WSE_FILLER_020_LEN);
   	
   }  
   
     /**
	 * 	Update WseFiller020 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWseFiller020(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWseFiller020,WSE_FILLER_020_LEN);
   	
   }
   
     /**
	 * 	Update WseFiller020 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller020(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller020+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse13aS
	 *	@return wse13aS
	 */   
	 public Wse13aS getWse13aS() {
   	return wse13aS;
   }
   /**
	* 	Update Wse13aS with the passed value
	*   Corresponding COBOL Variable is WSE-13A-S
	*	@param value
	*/
   public void setWse13aS(char[] value) {
      wse13aS.setString(value); 
   }   
    
     /**
	 * 	Update Wse13aS 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse13aS(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse13aS.begin,wse13aS.length());
   }
   
     /**
	 * 	Update Wse13aS 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse13aS(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse13aS.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse13aS with another Field
	 *	@param value
	 */
   public void setWse13aS(Field source) {
   	replace(source,0,source.length(),wse13aS.begin,wse13aS.length());
   }  
   
     /**
	 * 	Update Wse13aS 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse13aS(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse13aS.begin,wse13aS.length());
   }
   
     /**
	 * 	Update Wse13aS 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse13aS(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse13aS.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Wse13aSGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller020(CONSTANTS.SPACE_3);
          wse13aS.initialize();
     
   }

		public static int getWse13aSGrpFieldLength() {
			return WSE_13A_SGRP_LENGTH;
		}

}
  

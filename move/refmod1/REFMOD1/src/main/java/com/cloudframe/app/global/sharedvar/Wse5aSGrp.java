package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse5aSGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_wse5aSGrp")

public class Wse5aSGrp extends Wse5aSGrpSerialized  implements InitializingBean {
   

						private char[] wseFiller = Field.fillLowValue(3);
				private Wse5aS wse5aS = new Wse5aS();
	
	/**
	* Constructor for Wse5aSGrp
	**/
    public Wse5aSGrp() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			wse5aS.setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of wseFiller
	 *	@return wseFiller
	 */
   public char[] getWseFiller() throws CFException{
     if (isWseFillerModified()) { 
        wseFiller = refreshWseFiller();
     }
   		return wseFiller;
   }

  
	/**
	*  set variable wseFiller
	*  Corresponding COBOL Variable is WSE-FILLER
	*  @param value
	**/
   public void setWseFiller(char[] value) {
      wseFiller = checkWseFillerConstraints(value);
      serializeWseFiller(wseFiller);
   } 

     /**
	 * 	Update WseFiller 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWseFiller(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWseFiller,wseFiller.length);
   	
   }
   
   public void setWseFiller(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller,wseFiller.length);
   	
   }
   
     /**
	 * 	Update WseFiller 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WseFiller with another Field
	 *	@param value
	 */
   public void setWseFiller(Field source) {
       replace(source,0,source.length(),beginWseFiller,WSE_FILLER_LEN);
   	
   }  
   
     /**
	 * 	Update WseFiller 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWseFiller(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWseFiller,WSE_FILLER_LEN);
   	
   }
   
     /**
	 * 	Update WseFiller 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse5aS
	 *	@return wse5aS
	 */   
	 public Wse5aS getWse5aS() {
   	return wse5aS;
   }
   /**
	* 	Update Wse5aS with the passed value
	*   Corresponding COBOL Variable is WSE-5A-S
	*	@param value
	*/
   public void setWse5aS(char[] value) {
      wse5aS.setString(value); 
   }   
    
     /**
	 * 	Update Wse5aS 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse5aS(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse5aS.begin,wse5aS.length());
   }
   
     /**
	 * 	Update Wse5aS 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse5aS(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse5aS.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse5aS with another Field
	 *	@param value
	 */
   public void setWse5aS(Field source) {
   	replace(source,0,source.length(),wse5aS.begin,wse5aS.length());
   }  
   
     /**
	 * 	Update Wse5aS 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse5aS(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse5aS.begin,wse5aS.length());
   }
   
     /**
	 * 	Update Wse5aS 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse5aS(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse5aS.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Wse5aSGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller(CONSTANTS.SPACE_3);
          wse5aS.initialize();
     
   }

		public static int getWse5aSGrpFieldLength() {
			return WSE_5A_SGRP_LENGTH;
		}

}
  

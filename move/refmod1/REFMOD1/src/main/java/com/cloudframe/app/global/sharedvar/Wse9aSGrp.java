package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse9aSGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_wse9aSGrp")

public class Wse9aSGrp extends Wse9aSGrpSerialized  implements InitializingBean {
   

						private char[] wseFiller08 = Field.fillLowValue(3);
				private Wse9aS wse9aS = new Wse9aS();
	
	/**
	* Constructor for Wse9aSGrp
	**/
    public Wse9aSGrp() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			wse9aS.setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of wseFiller08
	 *	@return wseFiller08
	 */
   public char[] getWseFiller08() throws CFException{
     if (isWseFiller08Modified()) { 
        wseFiller08 = refreshWseFiller08();
     }
   		return wseFiller08;
   }

  
	/**
	*  set variable wseFiller08
	*  Corresponding COBOL Variable is WSE-FILLER
	*  @param value
	**/
   public void setWseFiller08(char[] value) {
      wseFiller08 = checkWseFiller08Constraints(value);
      serializeWseFiller08(wseFiller08);
   } 

     /**
	 * 	Update WseFiller08 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWseFiller08(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWseFiller08,wseFiller08.length);
   	
   }
   
   public void setWseFiller08(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller08,wseFiller08.length);
   	
   }
   
     /**
	 * 	Update WseFiller08 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller08(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller08+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WseFiller08 with another Field
	 *	@param value
	 */
   public void setWseFiller08(Field source) {
       replace(source,0,source.length(),beginWseFiller08,WSE_FILLER_08_LEN);
   	
   }  
   
     /**
	 * 	Update WseFiller08 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWseFiller08(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWseFiller08,WSE_FILLER_08_LEN);
   	
   }
   
     /**
	 * 	Update WseFiller08 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller08(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller08+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse9aS
	 *	@return wse9aS
	 */   
	 public Wse9aS getWse9aS() {
   	return wse9aS;
   }
   /**
	* 	Update Wse9aS with the passed value
	*   Corresponding COBOL Variable is WSE-9A-S
	*	@param value
	*/
   public void setWse9aS(char[] value) {
      wse9aS.setString(value); 
   }   
    
     /**
	 * 	Update Wse9aS 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse9aS(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse9aS.begin,wse9aS.length());
   }
   
     /**
	 * 	Update Wse9aS 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse9aS(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse9aS.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse9aS with another Field
	 *	@param value
	 */
   public void setWse9aS(Field source) {
   	replace(source,0,source.length(),wse9aS.begin,wse9aS.length());
   }  
   
     /**
	 * 	Update Wse9aS 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse9aS(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse9aS.begin,wse9aS.length());
   }
   
     /**
	 * 	Update Wse9aS 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse9aS(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse9aS.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Wse9aSGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller08(CONSTANTS.SPACE_3);
          wse9aS.initialize();
     
   }

		public static int getWse9aSGrpFieldLength() {
			return WSE_9A_SGRP_LENGTH;
		}

}
  

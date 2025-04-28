package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse5bSGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_wse5bSGrp")

public class Wse5bSGrp extends Wse5bSGrpSerialized  implements InitializingBean {
   

						private char[] wseFiller01 = Field.fillLowValue(3);
				private Wse5bS wse5bS = new Wse5bS();
	
	/**
	* Constructor for Wse5bSGrp
	**/
    public Wse5bSGrp() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			wse5bS.setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of wseFiller01
	 *	@return wseFiller01
	 */
   public char[] getWseFiller01() throws CFException{
     if (isWseFiller01Modified()) { 
        wseFiller01 = refreshWseFiller01();
     }
   		return wseFiller01;
   }

  
	/**
	*  set variable wseFiller01
	*  Corresponding COBOL Variable is WSE-FILLER
	*  @param value
	**/
   public void setWseFiller01(char[] value) {
      wseFiller01 = checkWseFiller01Constraints(value);
      serializeWseFiller01(wseFiller01);
   } 

     /**
	 * 	Update WseFiller01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWseFiller01(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWseFiller01,wseFiller01.length);
   	
   }
   
   public void setWseFiller01(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller01,wseFiller01.length);
   	
   }
   
     /**
	 * 	Update WseFiller01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller01+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WseFiller01 with another Field
	 *	@param value
	 */
   public void setWseFiller01(Field source) {
       replace(source,0,source.length(),beginWseFiller01,WSE_FILLER_01_LEN);
   	
   }  
   
     /**
	 * 	Update WseFiller01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWseFiller01(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWseFiller01,WSE_FILLER_01_LEN);
   	
   }
   
     /**
	 * 	Update WseFiller01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller01+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse5bS
	 *	@return wse5bS
	 */   
	 public Wse5bS getWse5bS() {
   	return wse5bS;
   }
   /**
	* 	Update Wse5bS with the passed value
	*   Corresponding COBOL Variable is WSE-5B-S
	*	@param value
	*/
   public void setWse5bS(char[] value) {
      wse5bS.setString(value); 
   }   
    
     /**
	 * 	Update Wse5bS 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse5bS(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse5bS.begin,wse5bS.length());
   }
   
     /**
	 * 	Update Wse5bS 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse5bS(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse5bS.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse5bS with another Field
	 *	@param value
	 */
   public void setWse5bS(Field source) {
   	replace(source,0,source.length(),wse5bS.begin,wse5bS.length());
   }  
   
     /**
	 * 	Update Wse5bS 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse5bS(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse5bS.begin,wse5bS.length());
   }
   
     /**
	 * 	Update Wse5bS 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse5bS(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse5bS.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Wse5bSGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller01(CONSTANTS.SPACE_3);
          wse5bS.initialize();
     
   }

		public static int getWse5bSGrpFieldLength() {
			return WSE_5B_SGRP_LENGTH;
		}

}
  

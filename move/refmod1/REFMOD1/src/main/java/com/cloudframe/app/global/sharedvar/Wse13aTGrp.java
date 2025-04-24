package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse13aTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse13aTGrp extends Wse13aTGrpSerialized { 
   

						private char[] wseFiller021 = Field.fillLowValue(5);
				private Wse13aT wse13aT = new Wse13aT();
	
	/**
	* Constructor for Wse13aTGrp
	**/
    public Wse13aTGrp() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse13aTGrp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse13aTGrp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			wse13aT.setParent(this,getStartOffset() + 5);
    } 

	/**
	 *	Returns the value of wseFiller021
	 *	@return wseFiller021
	 */
   public char[] getWseFiller021() throws CFException{
     if (isWseFiller021Modified()) { 
        wseFiller021 = refreshWseFiller021();
     }
   		return wseFiller021;
   }

  
	/**
	*  set variable wseFiller021
	*  Corresponding COBOL Variable is WSE-FILLER
	*  @param value
	**/
   public void setWseFiller021(char[] value) {
      wseFiller021 = checkWseFiller021Constraints(value);
      serializeWseFiller021(wseFiller021);
   } 

     /**
	 * 	Update WseFiller021 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWseFiller021(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWseFiller021,wseFiller021.length);
   	
   }
   
   public void setWseFiller021(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller021,wseFiller021.length);
   	
   }
   
     /**
	 * 	Update WseFiller021 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller021(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller021+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WseFiller021 with another Field
	 *	@param value
	 */
   public void setWseFiller021(Field source) {
       replace(source,0,source.length(),beginWseFiller021,WSE_FILLER_021_LEN);
   	
   }  
   
     /**
	 * 	Update WseFiller021 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWseFiller021(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWseFiller021,WSE_FILLER_021_LEN);
   	
   }
   
     /**
	 * 	Update WseFiller021 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller021(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller021+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse13aT
	 *	@return wse13aT
	 */   
	 public Wse13aT getWse13aT() {
   	return wse13aT;
   }
   /**
	* 	Update Wse13aT with the passed value
	*   Corresponding COBOL Variable is WSE-13A-T
	*	@param value
	*/
   public void setWse13aT(char[] value) {
      wse13aT.setString(value); 
   }   
    
     /**
	 * 	Update Wse13aT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse13aT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse13aT.begin,wse13aT.length());
   }
   
     /**
	 * 	Update Wse13aT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse13aT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse13aT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse13aT with another Field
	 *	@param value
	 */
   public void setWse13aT(Field source) {
   	replace(source,0,source.length(),wse13aT.begin,wse13aT.length());
   }  
   
     /**
	 * 	Update Wse13aT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse13aT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse13aT.begin,wse13aT.length());
   }
   
     /**
	 * 	Update Wse13aT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse13aT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse13aT.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Wse13aTGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller021(CONSTANTS.SPACE_5);
          wse13aT.initialize();
     
   }

		public static int getWse13aTGrpFieldLength() {
			return WSE_13A_TGRP_LENGTH;
		}

}
  

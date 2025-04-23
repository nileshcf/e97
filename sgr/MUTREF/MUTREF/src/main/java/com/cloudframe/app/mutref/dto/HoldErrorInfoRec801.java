package com.cloudframe.app.mutref.dto;

/**
*  The class HoldErrorInfoRec801 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:35. using version 5.0.0.254
**/


import com.cloudframe.app.mutref.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class HoldErrorInfoRec801 extends HoldErrorInfoRec801Serialized {
   

						private char[] holdCardAcceptor801 = new char[15];

						private char[] var = Field.fillLowValue(10);
	
	/**
	* Constructor for HoldErrorInfoRec801
	**/
    public HoldErrorInfoRec801() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setHoldCardAcceptor801("000000000000000".toCharArray());
    }


 

	/**
	 *	Returns the value of holdCardAcceptor801
	 *	@return holdCardAcceptor801
	 */
   public char[] getHoldCardAcceptor801() throws CFException{
     if (isHoldCardAcceptor801Modified()) { 
        holdCardAcceptor801 = refreshHoldCardAcceptor801();
     }
   		return holdCardAcceptor801;
   }

  
	/**
	*  set variable holdCardAcceptor801
	*  Corresponding COBOL Variable is 801-HOLD-CARD-ACCEPTOR
	*  @param value
	**/
   public void setHoldCardAcceptor801(char[] value) {
      holdCardAcceptor801 = checkHoldCardAcceptor801Constraints(value);
      serializeHoldCardAcceptor801(holdCardAcceptor801);
   } 

     /**
	 * 	Update HoldCardAcceptor801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHoldCardAcceptor801(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHoldCardAcceptor801,holdCardAcceptor801.length);
   	
   }
   
   public void setHoldCardAcceptor801(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHoldCardAcceptor801,holdCardAcceptor801.length);
   	
   }
   
     /**
	 * 	Update HoldCardAcceptor801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHoldCardAcceptor801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHoldCardAcceptor801+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HoldCardAcceptor801 with another Field
	 *	@param value
	 */
   public void setHoldCardAcceptor801(Field source) {
       replace(source,0,source.length(),beginHoldCardAcceptor801,HOLD_CARD_ACCEPTOR_801_LEN);
   	
   }  
   
     /**
	 * 	Update HoldCardAcceptor801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHoldCardAcceptor801(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHoldCardAcceptor801,HOLD_CARD_ACCEPTOR_801_LEN);
   	
   }
   
     /**
	 * 	Update HoldCardAcceptor801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHoldCardAcceptor801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHoldCardAcceptor801+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of var
	 *	@return var
	 */
   public char[] getVar() throws CFException{
     if (isVarModified()) { 
        var = refreshVar();
     }
   		return var;
   }

  
	/**
	*  set variable var
	*  Corresponding COBOL Variable is WS-VAR
	*  @param value
	**/
   public void setVar(char[] value) {
      var = checkVarConstraints(value);
      serializeVar(var);
   } 

     /**
	 * 	Update Var 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setVar(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginVar,var.length);
   	
   }
   
   public void setVar(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginVar,var.length);
   	
   }
   
     /**
	 * 	Update Var 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVar(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginVar+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Var with another Field
	 *	@param value
	 */
   public void setVar(Field source) {
       replace(source,0,source.length(),beginVar,VAR_LEN);
   	
   }  
   
     /**
	 * 	Update Var 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setVar(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginVar,VAR_LEN);
   	
   }
   
     /**
	 * 	Update Var 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVar(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginVar+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes HoldErrorInfoRec801
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setHoldCardAcceptor801(CONSTANTS.SPACE_15);
         setVar(CONSTANTS.SPACE_10);
   }

		public static int getHoldErrorInfoRec801FieldLength() {
			return HOLD_ERROR_INFO_REC_801_LENGTH;
		}

}
  

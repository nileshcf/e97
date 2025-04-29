package com.cloudframe.app.global.sharedvar;

/**
*  The class Key800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:22. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Key800 extends Key800Serialized { 
   

						private char[] cpi800 = Field.fillLowValue(3);

						private char[] bsl800 = Field.fillLowValue(1);

						private char[] bsid800 = Field.fillLowValue(6);

						private char[] msgType800 = Field.fillLowValue(4);

						private char[] funcCd800 = Field.fillLowValue(3);

						private char[] prcsCd800 = Field.fillLowValue(6);

								private long de26800;

						private char[] prodId800 = Field.fillLowValue(3);
	
	/**
	* Constructor for Key800
	**/
    public Key800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Key800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Key800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of cpi800
	 *	@return cpi800
	 */
   public char[] getCpi800() throws CFException{
     if (isCpi800Modified()) { 
        cpi800 = refreshCpi800();
     }
   		return cpi800;
   }

  
	/**
	*  set variable cpi800
	*  Corresponding COBOL Variable is 800-CPI
	*  @param value
	**/
   public void setCpi800(char[] value) {
      cpi800 = checkCpi800Constraints(value);
      serializeCpi800(cpi800);
   } 

     /**
	 * 	Update Cpi800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCpi800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCpi800,cpi800.length);
   	
   }
   
   public void setCpi800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCpi800,cpi800.length);
   	
   }
   
     /**
	 * 	Update Cpi800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCpi800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpi800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Cpi800 with another Field
	 *	@param value
	 */
   public void setCpi800(Field source) {
       replace(source,0,source.length(),beginCpi800,CPI_800_LEN);
   	
   }  
   
     /**
	 * 	Update Cpi800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCpi800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCpi800,CPI_800_LEN);
   	
   }
   
     /**
	 * 	Update Cpi800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCpi800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpi800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bsl800
	 *	@return bsl800
	 */
   public char[] getBsl800() throws CFException{
     if (isBsl800Modified()) { 
        bsl800 = refreshBsl800();
     }
   		return bsl800;
   }

  
	/**
	*  set variable bsl800
	*  Corresponding COBOL Variable is 800-BSL
	*  @param value
	**/
   public void setBsl800(char[] value) {
      bsl800 = checkBsl800Constraints(value);
      serializeBsl800(bsl800);
   } 

     /**
	 * 	Update Bsl800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBsl800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBsl800,bsl800.length);
   	
   }
   
   public void setBsl800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBsl800,bsl800.length);
   	
   }
   
     /**
	 * 	Update Bsl800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBsl800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBsl800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bsl800 with another Field
	 *	@param value
	 */
   public void setBsl800(Field source) {
       replace(source,0,source.length(),beginBsl800,BSL_800_LEN);
   	
   }  
   
     /**
	 * 	Update Bsl800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBsl800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBsl800,BSL_800_LEN);
   	
   }
   
     /**
	 * 	Update Bsl800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBsl800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBsl800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bsid800
	 *	@return bsid800
	 */
   public char[] getBsid800() throws CFException{
     if (isBsid800Modified()) { 
        bsid800 = refreshBsid800();
     }
   		return bsid800;
   }

  
	/**
	*  set variable bsid800
	*  Corresponding COBOL Variable is 800-BSID
	*  @param value
	**/
   public void setBsid800(char[] value) {
      bsid800 = checkBsid800Constraints(value);
      serializeBsid800(bsid800);
   } 

     /**
	 * 	Update Bsid800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBsid800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBsid800,bsid800.length);
   	
   }
   
   public void setBsid800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBsid800,bsid800.length);
   	
   }
   
     /**
	 * 	Update Bsid800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBsid800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBsid800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bsid800 with another Field
	 *	@param value
	 */
   public void setBsid800(Field source) {
       replace(source,0,source.length(),beginBsid800,BSID_800_LEN);
   	
   }  
   
     /**
	 * 	Update Bsid800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBsid800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBsid800,BSID_800_LEN);
   	
   }
   
     /**
	 * 	Update Bsid800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBsid800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBsid800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msgType800
	 *	@return msgType800
	 */
   public char[] getMsgType800() throws CFException{
     if (isMsgType800Modified()) { 
        msgType800 = refreshMsgType800();
     }
   		return msgType800;
   }

  
	/**
	*  set variable msgType800
	*  Corresponding COBOL Variable is 800-MSG-TYPE
	*  @param value
	**/
   public void setMsgType800(char[] value) {
      msgType800 = checkMsgType800Constraints(value);
      serializeMsgType800(msgType800);
   } 

     /**
	 * 	Update MsgType800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsgType800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsgType800,msgType800.length);
   	
   }
   
   public void setMsgType800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsgType800,msgType800.length);
   	
   }
   
     /**
	 * 	Update MsgType800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsgType800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsgType800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsgType800 with another Field
	 *	@param value
	 */
   public void setMsgType800(Field source) {
       replace(source,0,source.length(),beginMsgType800,MSG_TYPE_800_LEN);
   	
   }  
   
     /**
	 * 	Update MsgType800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsgType800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsgType800,MSG_TYPE_800_LEN);
   	
   }
   
     /**
	 * 	Update MsgType800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsgType800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsgType800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of funcCd800
	 *	@return funcCd800
	 */
   public char[] getFuncCd800() throws CFException{
     if (isFuncCd800Modified()) { 
        funcCd800 = refreshFuncCd800();
     }
   		return funcCd800;
   }

  
	/**
	*  set variable funcCd800
	*  Corresponding COBOL Variable is 800-FUNC-CD
	*  @param value
	**/
   public void setFuncCd800(char[] value) {
      funcCd800 = checkFuncCd800Constraints(value);
      serializeFuncCd800(funcCd800);
   } 

     /**
	 * 	Update FuncCd800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFuncCd800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFuncCd800,funcCd800.length);
   	
   }
   
   public void setFuncCd800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFuncCd800,funcCd800.length);
   	
   }
   
     /**
	 * 	Update FuncCd800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFuncCd800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFuncCd800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FuncCd800 with another Field
	 *	@param value
	 */
   public void setFuncCd800(Field source) {
       replace(source,0,source.length(),beginFuncCd800,FUNC_CD_800_LEN);
   	
   }  
   
     /**
	 * 	Update FuncCd800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFuncCd800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFuncCd800,FUNC_CD_800_LEN);
   	
   }
   
     /**
	 * 	Update FuncCd800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFuncCd800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFuncCd800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of prcsCd800
	 *	@return prcsCd800
	 */
   public char[] getPrcsCd800() throws CFException{
     if (isPrcsCd800Modified()) { 
        prcsCd800 = refreshPrcsCd800();
     }
   		return prcsCd800;
   }

  
	/**
	*  set variable prcsCd800
	*  Corresponding COBOL Variable is 800-PRCS-CD
	*  @param value
	**/
   public void setPrcsCd800(char[] value) {
      prcsCd800 = checkPrcsCd800Constraints(value);
      serializePrcsCd800(prcsCd800);
   } 

     /**
	 * 	Update PrcsCd800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrcsCd800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPrcsCd800,prcsCd800.length);
   	
   }
   
   public void setPrcsCd800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPrcsCd800,prcsCd800.length);
   	
   }
   
     /**
	 * 	Update PrcsCd800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrcsCd800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrcsCd800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PrcsCd800 with another Field
	 *	@param value
	 */
   public void setPrcsCd800(Field source) {
       replace(source,0,source.length(),beginPrcsCd800,PRCS_CD_800_LEN);
   	
   }  
   
     /**
	 * 	Update PrcsCd800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrcsCd800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPrcsCd800,PRCS_CD_800_LEN);
   	
   }
   
     /**
	 * 	Update PrcsCd800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrcsCd800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrcsCd800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of de26800
	 *	@return de26800
	 */
	public long getDe26800() throws CFException {
       if (isDe26800Modified()) { 
           de26800 = refreshDe26800();
        }
   		return de26800;
	}
	

	
	   
	/**
	 * 	Update De26800 with the passed value
	 *  Corresponding COBOL Variable is 800-DE26
	 *	@param number
	 */
	public void setDe26800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    de26800 = checkDe26800MaxLimit(number); 
		serializeDe26800(de26800);
	}
	

	/**
	 * 	Update De26800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setDe26800(char[] value) throws CFException {
		 de26800 = serializeDe26800(value);
	}
	/**
	 * 	Update De26800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDe26800String(char[] value) throws CFException {
		 setDe26800(value);
	}
	/**
	 *	Returns the value of prodId800
	 *	@return prodId800
	 */
   public char[] getProdId800() throws CFException{
     if (isProdId800Modified()) { 
        prodId800 = refreshProdId800();
     }
   		return prodId800;
   }

  
	/**
	*  set variable prodId800
	*  Corresponding COBOL Variable is 800-PROD-ID
	*  @param value
	**/
   public void setProdId800(char[] value) {
      prodId800 = checkProdId800Constraints(value);
      serializeProdId800(prodId800);
   } 

     /**
	 * 	Update ProdId800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setProdId800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginProdId800,prodId800.length);
   	
   }
   
   public void setProdId800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginProdId800,prodId800.length);
   	
   }
   
     /**
	 * 	Update ProdId800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setProdId800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginProdId800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ProdId800 with another Field
	 *	@param value
	 */
   public void setProdId800(Field source) {
       replace(source,0,source.length(),beginProdId800,PROD_ID_800_LEN);
   	
   }  
   
     /**
	 * 	Update ProdId800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setProdId800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginProdId800,PROD_ID_800_LEN);
   	
   }
   
     /**
	 * 	Update ProdId800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setProdId800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginProdId800+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Key800
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setCpi800(CONSTANTS.SPACE_3);
         setBsl800(CONSTANTS.SPACE);
         setBsid800(CONSTANTS.SPACE_6);
         setMsgType800(CONSTANTS.SPACE_4);
         setFuncCd800(CONSTANTS.SPACE_3);
         setPrcsCd800(CONSTANTS.SPACE_6);
                     setDe26800(0);
         setProdId800(CONSTANTS.SPACE_3);
   }

		public static int getKey800FieldLength() {
			return KEY_800_LENGTH;
		}

}
  

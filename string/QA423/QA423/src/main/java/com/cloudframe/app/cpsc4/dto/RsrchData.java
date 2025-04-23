package com.cloudframe.app.cpsc4.dto;

/**
*  The class RsrchData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/


import com.cloudframe.app.cpsc4.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RsrchData extends RsrchDataSerialized { 
   

						private char[] cusipOrSmaId = Field.fillLowValue(9);

						private char[] filler1Ws = new char[1];

						private char[] prodInvstObjCd = Field.fillLowValue(1);

						private char[] filler2Ws = new char[1];

								private char[] prodInvstAllocPct = Field.fillLowValue(7);

						private char[] filler3Ws = new char[1];

								private char[] prodMinTrgtDriftPct = Field.fillLowValue(7);

						private char[] filler4Ws = new char[1];

								private char[] prodMaxTrgtDriftPct = Field.fillLowValue(7);

						private char[] filler5Ws = new char[1];
	
	/**
	* Constructor for RsrchData
	**/
    public RsrchData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for RsrchData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RsrchData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setFiller1Ws((";").toCharArray());
								setFiller2Ws((";").toCharArray());
								setFiller3Ws((";").toCharArray());
								setFiller4Ws((";").toCharArray());
								setFiller5Ws((";").toCharArray());
    } 

	/**
	 *	Returns the value of cusipOrSmaId
	 *	@return cusipOrSmaId
	 */
   public char[] getCusipOrSmaId() throws CFException{
     if (isCusipOrSmaIdModified()) { 
        cusipOrSmaId = refreshCusipOrSmaId();
     }
   		return cusipOrSmaId;
   }

  
	/**
	*  set variable cusipOrSmaId
	*  Corresponding COBOL Variable is WS-CUSIP-OR-SMA-ID
	*  @param value
	**/
   public void setCusipOrSmaId(char[] value) {
      cusipOrSmaId = checkCusipOrSmaIdConstraints(value);
      serializeCusipOrSmaId(cusipOrSmaId);
   } 

     /**
	 * 	Update CusipOrSmaId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCusipOrSmaId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCusipOrSmaId,cusipOrSmaId.length);
   	
   }
   
   public void setCusipOrSmaId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCusipOrSmaId,cusipOrSmaId.length);
   	
   }
   
     /**
	 * 	Update CusipOrSmaId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCusipOrSmaId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCusipOrSmaId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CusipOrSmaId with another Field
	 *	@param value
	 */
   public void setCusipOrSmaId(Field source) {
       replace(source,0,source.length(),beginCusipOrSmaId,CUSIP_OR_SMA_ID_LEN);
   	
   }  
   
     /**
	 * 	Update CusipOrSmaId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCusipOrSmaId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCusipOrSmaId,CUSIP_OR_SMA_ID_LEN);
   	
   }
   
     /**
	 * 	Update CusipOrSmaId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCusipOrSmaId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCusipOrSmaId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of filler1Ws
	 *	@return filler1Ws
	 */
   public char[] getFiller1Ws() throws CFException{
     if (isFiller1WsModified()) { 
        filler1Ws = refreshFiller1Ws();
     }
   		return filler1Ws;
   }

  
	/**
	*  set variable filler1Ws
	*  Corresponding COBOL Variable is WS-FILLER-1
	*  @param value
	**/
   public void setFiller1Ws(char[] value) {
      filler1Ws = checkFiller1WsConstraints(value);
      serializeFiller1Ws(filler1Ws);
   } 

     /**
	 * 	Update Filler1Ws 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller1Ws(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFiller1Ws,filler1Ws.length);
   	
   }
   
   public void setFiller1Ws(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFiller1Ws,filler1Ws.length);
   	
   }
   
     /**
	 * 	Update Filler1Ws 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller1Ws(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller1Ws+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Filler1Ws with another Field
	 *	@param value
	 */
   public void setFiller1Ws(Field source) {
       replace(source,0,source.length(),beginFiller1Ws,FILLER_1_WS_LEN);
   	
   }  
   
     /**
	 * 	Update Filler1Ws 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller1Ws(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFiller1Ws,FILLER_1_WS_LEN);
   	
   }
   
     /**
	 * 	Update Filler1Ws 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller1Ws(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller1Ws+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of prodInvstObjCd
	 *	@return prodInvstObjCd
	 */
   public char[] getProdInvstObjCd() throws CFException{
     if (isProdInvstObjCdModified()) { 
        prodInvstObjCd = refreshProdInvstObjCd();
     }
   		return prodInvstObjCd;
   }

  
	/**
	*  set variable prodInvstObjCd
	*  Corresponding COBOL Variable is WS-PROD-INVST-OBJ-CD
	*  @param value
	**/
   public void setProdInvstObjCd(char[] value) {
      prodInvstObjCd = checkProdInvstObjCdConstraints(value);
      serializeProdInvstObjCd(prodInvstObjCd);
   } 

     /**
	 * 	Update ProdInvstObjCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setProdInvstObjCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginProdInvstObjCd,prodInvstObjCd.length);
   	
   }
   
   public void setProdInvstObjCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginProdInvstObjCd,prodInvstObjCd.length);
   	
   }
   
     /**
	 * 	Update ProdInvstObjCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setProdInvstObjCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginProdInvstObjCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ProdInvstObjCd with another Field
	 *	@param value
	 */
   public void setProdInvstObjCd(Field source) {
       replace(source,0,source.length(),beginProdInvstObjCd,PROD_INVST_OBJ_CD_LEN);
   	
   }  
   
     /**
	 * 	Update ProdInvstObjCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setProdInvstObjCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginProdInvstObjCd,PROD_INVST_OBJ_CD_LEN);
   	
   }
   
     /**
	 * 	Update ProdInvstObjCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setProdInvstObjCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginProdInvstObjCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of filler2Ws
	 *	@return filler2Ws
	 */
   public char[] getFiller2Ws() throws CFException{
     if (isFiller2WsModified()) { 
        filler2Ws = refreshFiller2Ws();
     }
   		return filler2Ws;
   }

  
	/**
	*  set variable filler2Ws
	*  Corresponding COBOL Variable is WS-FILLER-2
	*  @param value
	**/
   public void setFiller2Ws(char[] value) {
      filler2Ws = checkFiller2WsConstraints(value);
      serializeFiller2Ws(filler2Ws);
   } 

     /**
	 * 	Update Filler2Ws 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller2Ws(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFiller2Ws,filler2Ws.length);
   	
   }
   
   public void setFiller2Ws(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFiller2Ws,filler2Ws.length);
   	
   }
   
     /**
	 * 	Update Filler2Ws 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller2Ws(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller2Ws+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Filler2Ws with another Field
	 *	@param value
	 */
   public void setFiller2Ws(Field source) {
       replace(source,0,source.length(),beginFiller2Ws,FILLER_2_WS_LEN);
   	
   }  
   
     /**
	 * 	Update Filler2Ws 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller2Ws(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFiller2Ws,FILLER_2_WS_LEN);
   	
   }
   
     /**
	 * 	Update Filler2Ws 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller2Ws(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller2Ws+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of prodInvstAllocPct
	 *	@return prodInvstAllocPct
	 */
   public char[] getProdInvstAllocPct() throws CFException{
     if (isProdInvstAllocPctModified()) { 
        prodInvstAllocPct = refreshProdInvstAllocPct();
     }
   		return prodInvstAllocPct;
   }

  
	/**
	*  set variable prodInvstAllocPct
	*  Corresponding COBOL Variable is WS-PROD-INVST-ALLOC-PCT
	*  @param value
	**/
   public void setProdInvstAllocPct(char[] value) {
      prodInvstAllocPct = checkProdInvstAllocPctConstraints(value);
      serializeProdInvstAllocPct(prodInvstAllocPct);
   } 

     /**
	 * 	Update ProdInvstAllocPct 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setProdInvstAllocPct(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginProdInvstAllocPct,prodInvstAllocPct.length);
   	
   }
   
   public void setProdInvstAllocPct(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginProdInvstAllocPct,prodInvstAllocPct.length);
   	
   }
   
     /**
	 * 	Update ProdInvstAllocPct 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setProdInvstAllocPct(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginProdInvstAllocPct+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ProdInvstAllocPct with another Field
	 *	@param value
	 */
   public void setProdInvstAllocPct(Field source) {
       replace(source,0,source.length(),beginProdInvstAllocPct,PROD_INVST_ALLOC_PCT_LEN);
   	
   }  
   
     /**
	 * 	Update ProdInvstAllocPct 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setProdInvstAllocPct(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginProdInvstAllocPct,PROD_INVST_ALLOC_PCT_LEN);
   	
   }
   
     /**
	 * 	Update ProdInvstAllocPct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setProdInvstAllocPct(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginProdInvstAllocPct+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of filler3Ws
	 *	@return filler3Ws
	 */
   public char[] getFiller3Ws() throws CFException{
     if (isFiller3WsModified()) { 
        filler3Ws = refreshFiller3Ws();
     }
   		return filler3Ws;
   }

  
	/**
	*  set variable filler3Ws
	*  Corresponding COBOL Variable is WS-FILLER-3
	*  @param value
	**/
   public void setFiller3Ws(char[] value) {
      filler3Ws = checkFiller3WsConstraints(value);
      serializeFiller3Ws(filler3Ws);
   } 

     /**
	 * 	Update Filler3Ws 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller3Ws(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFiller3Ws,filler3Ws.length);
   	
   }
   
   public void setFiller3Ws(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFiller3Ws,filler3Ws.length);
   	
   }
   
     /**
	 * 	Update Filler3Ws 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller3Ws(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller3Ws+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Filler3Ws with another Field
	 *	@param value
	 */
   public void setFiller3Ws(Field source) {
       replace(source,0,source.length(),beginFiller3Ws,FILLER_3_WS_LEN);
   	
   }  
   
     /**
	 * 	Update Filler3Ws 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller3Ws(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFiller3Ws,FILLER_3_WS_LEN);
   	
   }
   
     /**
	 * 	Update Filler3Ws 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller3Ws(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller3Ws+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of prodMinTrgtDriftPct
	 *	@return prodMinTrgtDriftPct
	 */
   public char[] getProdMinTrgtDriftPct() throws CFException{
     if (isProdMinTrgtDriftPctModified()) { 
        prodMinTrgtDriftPct = refreshProdMinTrgtDriftPct();
     }
   		return prodMinTrgtDriftPct;
   }

  
	/**
	*  set variable prodMinTrgtDriftPct
	*  Corresponding COBOL Variable is WS-PROD-MIN-TRGT-DRIFT-PCT
	*  @param value
	**/
   public void setProdMinTrgtDriftPct(char[] value) {
      prodMinTrgtDriftPct = checkProdMinTrgtDriftPctConstraints(value);
      serializeProdMinTrgtDriftPct(prodMinTrgtDriftPct);
   } 

     /**
	 * 	Update ProdMinTrgtDriftPct 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setProdMinTrgtDriftPct(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginProdMinTrgtDriftPct,prodMinTrgtDriftPct.length);
   	
   }
   
   public void setProdMinTrgtDriftPct(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginProdMinTrgtDriftPct,prodMinTrgtDriftPct.length);
   	
   }
   
     /**
	 * 	Update ProdMinTrgtDriftPct 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setProdMinTrgtDriftPct(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginProdMinTrgtDriftPct+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ProdMinTrgtDriftPct with another Field
	 *	@param value
	 */
   public void setProdMinTrgtDriftPct(Field source) {
       replace(source,0,source.length(),beginProdMinTrgtDriftPct,PROD_MIN_TRGT_DRIFT_PCT_LEN);
   	
   }  
   
     /**
	 * 	Update ProdMinTrgtDriftPct 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setProdMinTrgtDriftPct(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginProdMinTrgtDriftPct,PROD_MIN_TRGT_DRIFT_PCT_LEN);
   	
   }
   
     /**
	 * 	Update ProdMinTrgtDriftPct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setProdMinTrgtDriftPct(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginProdMinTrgtDriftPct+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of filler4Ws
	 *	@return filler4Ws
	 */
   public char[] getFiller4Ws() throws CFException{
     if (isFiller4WsModified()) { 
        filler4Ws = refreshFiller4Ws();
     }
   		return filler4Ws;
   }

  
	/**
	*  set variable filler4Ws
	*  Corresponding COBOL Variable is WS-FILLER-4
	*  @param value
	**/
   public void setFiller4Ws(char[] value) {
      filler4Ws = checkFiller4WsConstraints(value);
      serializeFiller4Ws(filler4Ws);
   } 

     /**
	 * 	Update Filler4Ws 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller4Ws(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFiller4Ws,filler4Ws.length);
   	
   }
   
   public void setFiller4Ws(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFiller4Ws,filler4Ws.length);
   	
   }
   
     /**
	 * 	Update Filler4Ws 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller4Ws(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller4Ws+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Filler4Ws with another Field
	 *	@param value
	 */
   public void setFiller4Ws(Field source) {
       replace(source,0,source.length(),beginFiller4Ws,FILLER_4_WS_LEN);
   	
   }  
   
     /**
	 * 	Update Filler4Ws 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller4Ws(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFiller4Ws,FILLER_4_WS_LEN);
   	
   }
   
     /**
	 * 	Update Filler4Ws 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller4Ws(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller4Ws+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of prodMaxTrgtDriftPct
	 *	@return prodMaxTrgtDriftPct
	 */
   public char[] getProdMaxTrgtDriftPct() throws CFException{
     if (isProdMaxTrgtDriftPctModified()) { 
        prodMaxTrgtDriftPct = refreshProdMaxTrgtDriftPct();
     }
   		return prodMaxTrgtDriftPct;
   }

  
	/**
	*  set variable prodMaxTrgtDriftPct
	*  Corresponding COBOL Variable is WS-PROD-MAX-TRGT-DRIFT-PCT
	*  @param value
	**/
   public void setProdMaxTrgtDriftPct(char[] value) {
      prodMaxTrgtDriftPct = checkProdMaxTrgtDriftPctConstraints(value);
      serializeProdMaxTrgtDriftPct(prodMaxTrgtDriftPct);
   } 

     /**
	 * 	Update ProdMaxTrgtDriftPct 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setProdMaxTrgtDriftPct(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginProdMaxTrgtDriftPct,prodMaxTrgtDriftPct.length);
   	
   }
   
   public void setProdMaxTrgtDriftPct(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginProdMaxTrgtDriftPct,prodMaxTrgtDriftPct.length);
   	
   }
   
     /**
	 * 	Update ProdMaxTrgtDriftPct 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setProdMaxTrgtDriftPct(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginProdMaxTrgtDriftPct+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ProdMaxTrgtDriftPct with another Field
	 *	@param value
	 */
   public void setProdMaxTrgtDriftPct(Field source) {
       replace(source,0,source.length(),beginProdMaxTrgtDriftPct,PROD_MAX_TRGT_DRIFT_PCT_LEN);
   	
   }  
   
     /**
	 * 	Update ProdMaxTrgtDriftPct 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setProdMaxTrgtDriftPct(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginProdMaxTrgtDriftPct,PROD_MAX_TRGT_DRIFT_PCT_LEN);
   	
   }
   
     /**
	 * 	Update ProdMaxTrgtDriftPct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setProdMaxTrgtDriftPct(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginProdMaxTrgtDriftPct+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of filler5Ws
	 *	@return filler5Ws
	 */
   public char[] getFiller5Ws() throws CFException{
     if (isFiller5WsModified()) { 
        filler5Ws = refreshFiller5Ws();
     }
   		return filler5Ws;
   }

  
	/**
	*  set variable filler5Ws
	*  Corresponding COBOL Variable is WS-FILLER-5
	*  @param value
	**/
   public void setFiller5Ws(char[] value) {
      filler5Ws = checkFiller5WsConstraints(value);
      serializeFiller5Ws(filler5Ws);
   } 

     /**
	 * 	Update Filler5Ws 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller5Ws(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFiller5Ws,filler5Ws.length);
   	
   }
   
   public void setFiller5Ws(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFiller5Ws,filler5Ws.length);
   	
   }
   
     /**
	 * 	Update Filler5Ws 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller5Ws(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller5Ws+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Filler5Ws with another Field
	 *	@param value
	 */
   public void setFiller5Ws(Field source) {
       replace(source,0,source.length(),beginFiller5Ws,FILLER_5_WS_LEN);
   	
   }  
   
     /**
	 * 	Update Filler5Ws 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller5Ws(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFiller5Ws,FILLER_5_WS_LEN);
   	
   }
   
     /**
	 * 	Update Filler5Ws 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller5Ws(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller5Ws+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRsrchDataFieldLength() {
			return RSRCH_DATA_LENGTH;
		}

}
  

package com.cloudframe.app.db2funci.dto;

/**
*  The class Bdms01BondBasicExpData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:40. using version 5.0.0.254
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Bdms01BondBasicExpData extends Bdms01BondBasicExpDataSerialized { 
   

						private char[] bdms01ScrtyAdpBaseNbr = Field.fillLowValue(7);

						private char[] bdms01PuttableInd = Field.fillLowValue(1);

						private char[] bdms01AbsInd = Field.fillLowValue(1);

						private char[] bdms01TypeAbsCd = Field.fillLowValue(2);

						private char[] bdms01CbndPassThruInd = Field.fillLowValue(1);

						private char[] bdms01UseOfPrcdCd = Field.fillLowValue(2);

						private char[] bdms01OtrEnhcmtCmpyNm = Field.fillLowValue(50);

						private char[] bdms01OtrEnhcmtTypeCd = Field.fillLowValue(2);

						private char[] bdms01SttlmDt = Field.fillLowValue(10);

						private char[] bdms01SttlmInd = Field.fillLowValue(1);

						private char[] bdms01OtrTaxExmptCd = Field.fillLowValue(1);

						private char[] bdms01RmktTermInd = Field.fillLowValue(1);

						private char[] bdms01FrgnSvrgnDbInd = Field.fillLowValue(1);

						private char[] bdms01ClMkWhlInd = Field.fillLowValue(1);

						private char[] bdms01InsCd = Field.fillLowValue(5);

						private char[] bdms01InsFtidCd = Field.fillLowValue(2);

						private char[] bdms01RrbInd = Field.fillLowValue(1);

						private char[] bdms01IssSttsCd = Field.fillLowValue(1);

						private char[] bdms01EomRuleCd = Field.fillLowValue(1);

						private char[] bdms01CouponTypeCd = Field.fillLowValue(1);

						private char[] bdms01OffrDocDlvryCd = Field.fillLowValue(1);

						private char[] bdms01SidMudNbr = Field.fillLowValue(7);

						private char[] bdms01MuniSrsDescTxt = Field.fillLowValue(20);

						private char[] bdms01SupissTypeCd = Field.fillLowValue(5);

	
	/**
	* Constructor for Bdms01BondBasicExpData
	**/
    public Bdms01BondBasicExpData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Bdms01BondBasicExpData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01BondBasicExpData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bdms01ScrtyAdpBaseNbr
	 *	@return bdms01ScrtyAdpBaseNbr
	 */
   public char[] getBdms01ScrtyAdpBaseNbr() throws CFException{
     if (isBdms01ScrtyAdpBaseNbrModified()) { 
        bdms01ScrtyAdpBaseNbr = refreshBdms01ScrtyAdpBaseNbr();
     }
   		return bdms01ScrtyAdpBaseNbr;
   }

  
	/**
	*  set variable bdms01ScrtyAdpBaseNbr
	*  Corresponding COBOL Variable is BDMS01-SCRTY-ADP-BASE-NBR
	*  @param value
	**/
   public void setBdms01ScrtyAdpBaseNbr(char[] value) {
      bdms01ScrtyAdpBaseNbr = checkBdms01ScrtyAdpBaseNbrConstraints(value);
      serializeBdms01ScrtyAdpBaseNbr(bdms01ScrtyAdpBaseNbr);
   } 

     /**
	 * 	Update Bdms01ScrtyAdpBaseNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01ScrtyAdpBaseNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01ScrtyAdpBaseNbr,bdms01ScrtyAdpBaseNbr.length);
   	
   }
   
   public void setBdms01ScrtyAdpBaseNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ScrtyAdpBaseNbr,bdms01ScrtyAdpBaseNbr.length);
   	
   }
   
     /**
	 * 	Update Bdms01ScrtyAdpBaseNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ScrtyAdpBaseNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ScrtyAdpBaseNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01ScrtyAdpBaseNbr with another Field
	 *	@param value
	 */
   public void setBdms01ScrtyAdpBaseNbr(Field source) {
       replace(source,0,source.length(),beginBdms01ScrtyAdpBaseNbr,BDMS_01_SCRTY_ADP_BASE_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01ScrtyAdpBaseNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01ScrtyAdpBaseNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01ScrtyAdpBaseNbr,BDMS_01_SCRTY_ADP_BASE_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01ScrtyAdpBaseNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ScrtyAdpBaseNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ScrtyAdpBaseNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01PuttableInd
	 *	@return bdms01PuttableInd
	 */
   public char[] getBdms01PuttableInd() throws CFException{
     if (isBdms01PuttableIndModified()) { 
        bdms01PuttableInd = refreshBdms01PuttableInd();
     }
   		return bdms01PuttableInd;
   }

  
	/**
	*  set variable bdms01PuttableInd
	*  Corresponding COBOL Variable is BDMS01-PUTTABLE-IND
	*  @param value
	**/
   public void setBdms01PuttableInd(char[] value) {
      bdms01PuttableInd = checkBdms01PuttableIndConstraints(value);
      serializeBdms01PuttableInd(bdms01PuttableInd);
   } 

     /**
	 * 	Update Bdms01PuttableInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PuttableInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01PuttableInd,bdms01PuttableInd.length);
   	
   }
   
   public void setBdms01PuttableInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PuttableInd,bdms01PuttableInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01PuttableInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PuttableInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PuttableInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01PuttableInd with another Field
	 *	@param value
	 */
   public void setBdms01PuttableInd(Field source) {
       replace(source,0,source.length(),beginBdms01PuttableInd,BDMS_01_PUTTABLE_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01PuttableInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PuttableInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01PuttableInd,BDMS_01_PUTTABLE_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01PuttableInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PuttableInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PuttableInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01AbsInd
	 *	@return bdms01AbsInd
	 */
   public char[] getBdms01AbsInd() throws CFException{
     if (isBdms01AbsIndModified()) { 
        bdms01AbsInd = refreshBdms01AbsInd();
     }
   		return bdms01AbsInd;
   }

  
	/**
	*  set variable bdms01AbsInd
	*  Corresponding COBOL Variable is BDMS01-ABS-IND
	*  @param value
	**/
   public void setBdms01AbsInd(char[] value) {
      bdms01AbsInd = checkBdms01AbsIndConstraints(value);
      serializeBdms01AbsInd(bdms01AbsInd);
   } 

     /**
	 * 	Update Bdms01AbsInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01AbsInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01AbsInd,bdms01AbsInd.length);
   	
   }
   
   public void setBdms01AbsInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01AbsInd,bdms01AbsInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01AbsInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01AbsInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01AbsInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01AbsInd with another Field
	 *	@param value
	 */
   public void setBdms01AbsInd(Field source) {
       replace(source,0,source.length(),beginBdms01AbsInd,BDMS_01_ABS_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01AbsInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01AbsInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01AbsInd,BDMS_01_ABS_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01AbsInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01AbsInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01AbsInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01TypeAbsCd
	 *	@return bdms01TypeAbsCd
	 */
   public char[] getBdms01TypeAbsCd() throws CFException{
     if (isBdms01TypeAbsCdModified()) { 
        bdms01TypeAbsCd = refreshBdms01TypeAbsCd();
     }
   		return bdms01TypeAbsCd;
   }

  
	/**
	*  set variable bdms01TypeAbsCd
	*  Corresponding COBOL Variable is BDMS01-TYPE-ABS-CD
	*  @param value
	**/
   public void setBdms01TypeAbsCd(char[] value) {
      bdms01TypeAbsCd = checkBdms01TypeAbsCdConstraints(value);
      serializeBdms01TypeAbsCd(bdms01TypeAbsCd);
   } 

     /**
	 * 	Update Bdms01TypeAbsCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01TypeAbsCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01TypeAbsCd,bdms01TypeAbsCd.length);
   	
   }
   
   public void setBdms01TypeAbsCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TypeAbsCd,bdms01TypeAbsCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01TypeAbsCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TypeAbsCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TypeAbsCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01TypeAbsCd with another Field
	 *	@param value
	 */
   public void setBdms01TypeAbsCd(Field source) {
       replace(source,0,source.length(),beginBdms01TypeAbsCd,BDMS_01_TYPE_ABS_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01TypeAbsCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01TypeAbsCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01TypeAbsCd,BDMS_01_TYPE_ABS_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01TypeAbsCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TypeAbsCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TypeAbsCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01CbndPassThruInd
	 *	@return bdms01CbndPassThruInd
	 */
   public char[] getBdms01CbndPassThruInd() throws CFException{
     if (isBdms01CbndPassThruIndModified()) { 
        bdms01CbndPassThruInd = refreshBdms01CbndPassThruInd();
     }
   		return bdms01CbndPassThruInd;
   }

  
	/**
	*  set variable bdms01CbndPassThruInd
	*  Corresponding COBOL Variable is BDMS01-CBND-PASS-THRU-IND
	*  @param value
	**/
   public void setBdms01CbndPassThruInd(char[] value) {
      bdms01CbndPassThruInd = checkBdms01CbndPassThruIndConstraints(value);
      serializeBdms01CbndPassThruInd(bdms01CbndPassThruInd);
   } 

     /**
	 * 	Update Bdms01CbndPassThruInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01CbndPassThruInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01CbndPassThruInd,bdms01CbndPassThruInd.length);
   	
   }
   
   public void setBdms01CbndPassThruInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CbndPassThruInd,bdms01CbndPassThruInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01CbndPassThruInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CbndPassThruInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CbndPassThruInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01CbndPassThruInd with another Field
	 *	@param value
	 */
   public void setBdms01CbndPassThruInd(Field source) {
       replace(source,0,source.length(),beginBdms01CbndPassThruInd,BDMS_01_CBND_PASS_THRU_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01CbndPassThruInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01CbndPassThruInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01CbndPassThruInd,BDMS_01_CBND_PASS_THRU_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01CbndPassThruInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CbndPassThruInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CbndPassThruInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01UseOfPrcdCd
	 *	@return bdms01UseOfPrcdCd
	 */
   public char[] getBdms01UseOfPrcdCd() throws CFException{
     if (isBdms01UseOfPrcdCdModified()) { 
        bdms01UseOfPrcdCd = refreshBdms01UseOfPrcdCd();
     }
   		return bdms01UseOfPrcdCd;
   }

  
	/**
	*  set variable bdms01UseOfPrcdCd
	*  Corresponding COBOL Variable is BDMS01-USE-OF-PRCD-CD
	*  @param value
	**/
   public void setBdms01UseOfPrcdCd(char[] value) {
      bdms01UseOfPrcdCd = checkBdms01UseOfPrcdCdConstraints(value);
      serializeBdms01UseOfPrcdCd(bdms01UseOfPrcdCd);
   } 

     /**
	 * 	Update Bdms01UseOfPrcdCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01UseOfPrcdCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01UseOfPrcdCd,bdms01UseOfPrcdCd.length);
   	
   }
   
   public void setBdms01UseOfPrcdCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UseOfPrcdCd,bdms01UseOfPrcdCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01UseOfPrcdCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01UseOfPrcdCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UseOfPrcdCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01UseOfPrcdCd with another Field
	 *	@param value
	 */
   public void setBdms01UseOfPrcdCd(Field source) {
       replace(source,0,source.length(),beginBdms01UseOfPrcdCd,BDMS_01_USE_OF_PRCD_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01UseOfPrcdCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01UseOfPrcdCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01UseOfPrcdCd,BDMS_01_USE_OF_PRCD_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01UseOfPrcdCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01UseOfPrcdCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01UseOfPrcdCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01OtrEnhcmtCmpyNm
	 *	@return bdms01OtrEnhcmtCmpyNm
	 */
   public char[] getBdms01OtrEnhcmtCmpyNm() throws CFException{
     if (isBdms01OtrEnhcmtCmpyNmModified()) { 
        bdms01OtrEnhcmtCmpyNm = refreshBdms01OtrEnhcmtCmpyNm();
     }
   		return bdms01OtrEnhcmtCmpyNm;
   }

  
	/**
	*  set variable bdms01OtrEnhcmtCmpyNm
	*  Corresponding COBOL Variable is BDMS01-OTR-ENHCMT-CMPY-NM
	*  @param value
	**/
   public void setBdms01OtrEnhcmtCmpyNm(char[] value) {
      bdms01OtrEnhcmtCmpyNm = checkBdms01OtrEnhcmtCmpyNmConstraints(value);
      serializeBdms01OtrEnhcmtCmpyNm(bdms01OtrEnhcmtCmpyNm);
   } 

     /**
	 * 	Update Bdms01OtrEnhcmtCmpyNm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01OtrEnhcmtCmpyNm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01OtrEnhcmtCmpyNm,bdms01OtrEnhcmtCmpyNm.length);
   	
   }
   
   public void setBdms01OtrEnhcmtCmpyNm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OtrEnhcmtCmpyNm,bdms01OtrEnhcmtCmpyNm.length);
   	
   }
   
     /**
	 * 	Update Bdms01OtrEnhcmtCmpyNm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OtrEnhcmtCmpyNm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OtrEnhcmtCmpyNm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01OtrEnhcmtCmpyNm with another Field
	 *	@param value
	 */
   public void setBdms01OtrEnhcmtCmpyNm(Field source) {
       replace(source,0,source.length(),beginBdms01OtrEnhcmtCmpyNm,BDMS_01_OTR_ENHCMT_CMPY_NM_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01OtrEnhcmtCmpyNm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01OtrEnhcmtCmpyNm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01OtrEnhcmtCmpyNm,BDMS_01_OTR_ENHCMT_CMPY_NM_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01OtrEnhcmtCmpyNm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OtrEnhcmtCmpyNm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OtrEnhcmtCmpyNm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01OtrEnhcmtTypeCd
	 *	@return bdms01OtrEnhcmtTypeCd
	 */
   public char[] getBdms01OtrEnhcmtTypeCd() throws CFException{
     if (isBdms01OtrEnhcmtTypeCdModified()) { 
        bdms01OtrEnhcmtTypeCd = refreshBdms01OtrEnhcmtTypeCd();
     }
   		return bdms01OtrEnhcmtTypeCd;
   }

  
	/**
	*  set variable bdms01OtrEnhcmtTypeCd
	*  Corresponding COBOL Variable is BDMS01-OTR-ENHCMT-TYPE-CD
	*  @param value
	**/
   public void setBdms01OtrEnhcmtTypeCd(char[] value) {
      bdms01OtrEnhcmtTypeCd = checkBdms01OtrEnhcmtTypeCdConstraints(value);
      serializeBdms01OtrEnhcmtTypeCd(bdms01OtrEnhcmtTypeCd);
   } 

     /**
	 * 	Update Bdms01OtrEnhcmtTypeCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01OtrEnhcmtTypeCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01OtrEnhcmtTypeCd,bdms01OtrEnhcmtTypeCd.length);
   	
   }
   
   public void setBdms01OtrEnhcmtTypeCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OtrEnhcmtTypeCd,bdms01OtrEnhcmtTypeCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01OtrEnhcmtTypeCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OtrEnhcmtTypeCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OtrEnhcmtTypeCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01OtrEnhcmtTypeCd with another Field
	 *	@param value
	 */
   public void setBdms01OtrEnhcmtTypeCd(Field source) {
       replace(source,0,source.length(),beginBdms01OtrEnhcmtTypeCd,BDMS_01_OTR_ENHCMT_TYPE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01OtrEnhcmtTypeCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01OtrEnhcmtTypeCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01OtrEnhcmtTypeCd,BDMS_01_OTR_ENHCMT_TYPE_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01OtrEnhcmtTypeCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OtrEnhcmtTypeCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OtrEnhcmtTypeCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01SttlmDt
	 *	@return bdms01SttlmDt
	 */
   public char[] getBdms01SttlmDt() throws CFException{
     if (isBdms01SttlmDtModified()) { 
        bdms01SttlmDt = refreshBdms01SttlmDt();
     }
   		return bdms01SttlmDt;
   }

  
	/**
	*  set variable bdms01SttlmDt
	*  Corresponding COBOL Variable is BDMS01-STTLM-DT
	*  @param value
	**/
   public void setBdms01SttlmDt(char[] value) {
      bdms01SttlmDt = checkBdms01SttlmDtConstraints(value);
      serializeBdms01SttlmDt(bdms01SttlmDt);
   } 

     /**
	 * 	Update Bdms01SttlmDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01SttlmDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01SttlmDt,bdms01SttlmDt.length);
   	
   }
   
   public void setBdms01SttlmDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SttlmDt,bdms01SttlmDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01SttlmDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SttlmDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SttlmDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01SttlmDt with another Field
	 *	@param value
	 */
   public void setBdms01SttlmDt(Field source) {
       replace(source,0,source.length(),beginBdms01SttlmDt,BDMS_01_STTLM_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01SttlmDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01SttlmDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01SttlmDt,BDMS_01_STTLM_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01SttlmDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SttlmDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SttlmDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01SttlmInd
	 *	@return bdms01SttlmInd
	 */
   public char[] getBdms01SttlmInd() throws CFException{
     if (isBdms01SttlmIndModified()) { 
        bdms01SttlmInd = refreshBdms01SttlmInd();
     }
   		return bdms01SttlmInd;
   }

  
	/**
	*  set variable bdms01SttlmInd
	*  Corresponding COBOL Variable is BDMS01-STTLM-IND
	*  @param value
	**/
   public void setBdms01SttlmInd(char[] value) {
      bdms01SttlmInd = checkBdms01SttlmIndConstraints(value);
      serializeBdms01SttlmInd(bdms01SttlmInd);
   } 

     /**
	 * 	Update Bdms01SttlmInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01SttlmInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01SttlmInd,bdms01SttlmInd.length);
   	
   }
   
   public void setBdms01SttlmInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SttlmInd,bdms01SttlmInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01SttlmInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SttlmInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SttlmInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01SttlmInd with another Field
	 *	@param value
	 */
   public void setBdms01SttlmInd(Field source) {
       replace(source,0,source.length(),beginBdms01SttlmInd,BDMS_01_STTLM_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01SttlmInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01SttlmInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01SttlmInd,BDMS_01_STTLM_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01SttlmInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SttlmInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SttlmInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01OtrTaxExmptCd
	 *	@return bdms01OtrTaxExmptCd
	 */
   public char[] getBdms01OtrTaxExmptCd() throws CFException{
     if (isBdms01OtrTaxExmptCdModified()) { 
        bdms01OtrTaxExmptCd = refreshBdms01OtrTaxExmptCd();
     }
   		return bdms01OtrTaxExmptCd;
   }

  
	/**
	*  set variable bdms01OtrTaxExmptCd
	*  Corresponding COBOL Variable is BDMS01-OTR-TAX-EXMPT-CD
	*  @param value
	**/
   public void setBdms01OtrTaxExmptCd(char[] value) {
      bdms01OtrTaxExmptCd = checkBdms01OtrTaxExmptCdConstraints(value);
      serializeBdms01OtrTaxExmptCd(bdms01OtrTaxExmptCd);
   } 

     /**
	 * 	Update Bdms01OtrTaxExmptCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01OtrTaxExmptCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01OtrTaxExmptCd,bdms01OtrTaxExmptCd.length);
   	
   }
   
   public void setBdms01OtrTaxExmptCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OtrTaxExmptCd,bdms01OtrTaxExmptCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01OtrTaxExmptCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OtrTaxExmptCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OtrTaxExmptCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01OtrTaxExmptCd with another Field
	 *	@param value
	 */
   public void setBdms01OtrTaxExmptCd(Field source) {
       replace(source,0,source.length(),beginBdms01OtrTaxExmptCd,BDMS_01_OTR_TAX_EXMPT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01OtrTaxExmptCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01OtrTaxExmptCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01OtrTaxExmptCd,BDMS_01_OTR_TAX_EXMPT_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01OtrTaxExmptCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OtrTaxExmptCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OtrTaxExmptCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01RmktTermInd
	 *	@return bdms01RmktTermInd
	 */
   public char[] getBdms01RmktTermInd() throws CFException{
     if (isBdms01RmktTermIndModified()) { 
        bdms01RmktTermInd = refreshBdms01RmktTermInd();
     }
   		return bdms01RmktTermInd;
   }

  
	/**
	*  set variable bdms01RmktTermInd
	*  Corresponding COBOL Variable is BDMS01-RMKT-TERM-IND
	*  @param value
	**/
   public void setBdms01RmktTermInd(char[] value) {
      bdms01RmktTermInd = checkBdms01RmktTermIndConstraints(value);
      serializeBdms01RmktTermInd(bdms01RmktTermInd);
   } 

     /**
	 * 	Update Bdms01RmktTermInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01RmktTermInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01RmktTermInd,bdms01RmktTermInd.length);
   	
   }
   
   public void setBdms01RmktTermInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RmktTermInd,bdms01RmktTermInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01RmktTermInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RmktTermInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RmktTermInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01RmktTermInd with another Field
	 *	@param value
	 */
   public void setBdms01RmktTermInd(Field source) {
       replace(source,0,source.length(),beginBdms01RmktTermInd,BDMS_01_RMKT_TERM_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01RmktTermInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01RmktTermInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01RmktTermInd,BDMS_01_RMKT_TERM_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01RmktTermInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RmktTermInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RmktTermInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01FrgnSvrgnDbInd
	 *	@return bdms01FrgnSvrgnDbInd
	 */
   public char[] getBdms01FrgnSvrgnDbInd() throws CFException{
     if (isBdms01FrgnSvrgnDbIndModified()) { 
        bdms01FrgnSvrgnDbInd = refreshBdms01FrgnSvrgnDbInd();
     }
   		return bdms01FrgnSvrgnDbInd;
   }

  
	/**
	*  set variable bdms01FrgnSvrgnDbInd
	*  Corresponding COBOL Variable is BDMS01-FRGN-SVRGN-DB-IND
	*  @param value
	**/
   public void setBdms01FrgnSvrgnDbInd(char[] value) {
      bdms01FrgnSvrgnDbInd = checkBdms01FrgnSvrgnDbIndConstraints(value);
      serializeBdms01FrgnSvrgnDbInd(bdms01FrgnSvrgnDbInd);
   } 

     /**
	 * 	Update Bdms01FrgnSvrgnDbInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01FrgnSvrgnDbInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01FrgnSvrgnDbInd,bdms01FrgnSvrgnDbInd.length);
   	
   }
   
   public void setBdms01FrgnSvrgnDbInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01FrgnSvrgnDbInd,bdms01FrgnSvrgnDbInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01FrgnSvrgnDbInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01FrgnSvrgnDbInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01FrgnSvrgnDbInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01FrgnSvrgnDbInd with another Field
	 *	@param value
	 */
   public void setBdms01FrgnSvrgnDbInd(Field source) {
       replace(source,0,source.length(),beginBdms01FrgnSvrgnDbInd,BDMS_01_FRGN_SVRGN_DB_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01FrgnSvrgnDbInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01FrgnSvrgnDbInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01FrgnSvrgnDbInd,BDMS_01_FRGN_SVRGN_DB_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01FrgnSvrgnDbInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01FrgnSvrgnDbInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01FrgnSvrgnDbInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01ClMkWhlInd
	 *	@return bdms01ClMkWhlInd
	 */
   public char[] getBdms01ClMkWhlInd() throws CFException{
     if (isBdms01ClMkWhlIndModified()) { 
        bdms01ClMkWhlInd = refreshBdms01ClMkWhlInd();
     }
   		return bdms01ClMkWhlInd;
   }

  
	/**
	*  set variable bdms01ClMkWhlInd
	*  Corresponding COBOL Variable is BDMS01-CL-MK-WHL-IND
	*  @param value
	**/
   public void setBdms01ClMkWhlInd(char[] value) {
      bdms01ClMkWhlInd = checkBdms01ClMkWhlIndConstraints(value);
      serializeBdms01ClMkWhlInd(bdms01ClMkWhlInd);
   } 

     /**
	 * 	Update Bdms01ClMkWhlInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01ClMkWhlInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01ClMkWhlInd,bdms01ClMkWhlInd.length);
   	
   }
   
   public void setBdms01ClMkWhlInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ClMkWhlInd,bdms01ClMkWhlInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01ClMkWhlInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ClMkWhlInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ClMkWhlInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01ClMkWhlInd with another Field
	 *	@param value
	 */
   public void setBdms01ClMkWhlInd(Field source) {
       replace(source,0,source.length(),beginBdms01ClMkWhlInd,BDMS_01_CL_MK_WHL_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01ClMkWhlInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01ClMkWhlInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01ClMkWhlInd,BDMS_01_CL_MK_WHL_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01ClMkWhlInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ClMkWhlInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ClMkWhlInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01InsCd
	 *	@return bdms01InsCd
	 */
   public char[] getBdms01InsCd() throws CFException{
     if (isBdms01InsCdModified()) { 
        bdms01InsCd = refreshBdms01InsCd();
     }
   		return bdms01InsCd;
   }

  
	/**
	*  set variable bdms01InsCd
	*  Corresponding COBOL Variable is BDMS01-INS-CD
	*  @param value
	**/
   public void setBdms01InsCd(char[] value) {
      bdms01InsCd = checkBdms01InsCdConstraints(value);
      serializeBdms01InsCd(bdms01InsCd);
   } 

     /**
	 * 	Update Bdms01InsCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01InsCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01InsCd,bdms01InsCd.length);
   	
   }
   
   public void setBdms01InsCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01InsCd,bdms01InsCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01InsCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01InsCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01InsCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01InsCd with another Field
	 *	@param value
	 */
   public void setBdms01InsCd(Field source) {
       replace(source,0,source.length(),beginBdms01InsCd,BDMS_01_INS_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01InsCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01InsCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01InsCd,BDMS_01_INS_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01InsCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01InsCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01InsCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01InsFtidCd
	 *	@return bdms01InsFtidCd
	 */
   public char[] getBdms01InsFtidCd() throws CFException{
     if (isBdms01InsFtidCdModified()) { 
        bdms01InsFtidCd = refreshBdms01InsFtidCd();
     }
   		return bdms01InsFtidCd;
   }

  
	/**
	*  set variable bdms01InsFtidCd
	*  Corresponding COBOL Variable is BDMS01-INS-FTID-CD
	*  @param value
	**/
   public void setBdms01InsFtidCd(char[] value) {
      bdms01InsFtidCd = checkBdms01InsFtidCdConstraints(value);
      serializeBdms01InsFtidCd(bdms01InsFtidCd);
   } 

     /**
	 * 	Update Bdms01InsFtidCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01InsFtidCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01InsFtidCd,bdms01InsFtidCd.length);
   	
   }
   
   public void setBdms01InsFtidCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01InsFtidCd,bdms01InsFtidCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01InsFtidCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01InsFtidCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01InsFtidCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01InsFtidCd with another Field
	 *	@param value
	 */
   public void setBdms01InsFtidCd(Field source) {
       replace(source,0,source.length(),beginBdms01InsFtidCd,BDMS_01_INS_FTID_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01InsFtidCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01InsFtidCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01InsFtidCd,BDMS_01_INS_FTID_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01InsFtidCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01InsFtidCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01InsFtidCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01RrbInd
	 *	@return bdms01RrbInd
	 */
   public char[] getBdms01RrbInd() throws CFException{
     if (isBdms01RrbIndModified()) { 
        bdms01RrbInd = refreshBdms01RrbInd();
     }
   		return bdms01RrbInd;
   }

  
	/**
	*  set variable bdms01RrbInd
	*  Corresponding COBOL Variable is BDMS01-RRB-IND
	*  @param value
	**/
   public void setBdms01RrbInd(char[] value) {
      bdms01RrbInd = checkBdms01RrbIndConstraints(value);
      serializeBdms01RrbInd(bdms01RrbInd);
   } 

     /**
	 * 	Update Bdms01RrbInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01RrbInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01RrbInd,bdms01RrbInd.length);
   	
   }
   
   public void setBdms01RrbInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RrbInd,bdms01RrbInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01RrbInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RrbInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RrbInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01RrbInd with another Field
	 *	@param value
	 */
   public void setBdms01RrbInd(Field source) {
       replace(source,0,source.length(),beginBdms01RrbInd,BDMS_01_RRB_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01RrbInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01RrbInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01RrbInd,BDMS_01_RRB_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01RrbInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RrbInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RrbInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01IssSttsCd
	 *	@return bdms01IssSttsCd
	 */
   public char[] getBdms01IssSttsCd() throws CFException{
     if (isBdms01IssSttsCdModified()) { 
        bdms01IssSttsCd = refreshBdms01IssSttsCd();
     }
   		return bdms01IssSttsCd;
   }

  
	/**
	*  set variable bdms01IssSttsCd
	*  Corresponding COBOL Variable is BDMS01-ISS-STTS-CD
	*  @param value
	**/
   public void setBdms01IssSttsCd(char[] value) {
      bdms01IssSttsCd = checkBdms01IssSttsCdConstraints(value);
      serializeBdms01IssSttsCd(bdms01IssSttsCd);
   } 

     /**
	 * 	Update Bdms01IssSttsCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01IssSttsCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01IssSttsCd,bdms01IssSttsCd.length);
   	
   }
   
   public void setBdms01IssSttsCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01IssSttsCd,bdms01IssSttsCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01IssSttsCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01IssSttsCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01IssSttsCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01IssSttsCd with another Field
	 *	@param value
	 */
   public void setBdms01IssSttsCd(Field source) {
       replace(source,0,source.length(),beginBdms01IssSttsCd,BDMS_01_ISS_STTS_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01IssSttsCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01IssSttsCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01IssSttsCd,BDMS_01_ISS_STTS_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01IssSttsCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01IssSttsCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01IssSttsCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01EomRuleCd
	 *	@return bdms01EomRuleCd
	 */
   public char[] getBdms01EomRuleCd() throws CFException{
     if (isBdms01EomRuleCdModified()) { 
        bdms01EomRuleCd = refreshBdms01EomRuleCd();
     }
   		return bdms01EomRuleCd;
   }

  
	/**
	*  set variable bdms01EomRuleCd
	*  Corresponding COBOL Variable is BDMS01-EOM-RULE-CD
	*  @param value
	**/
   public void setBdms01EomRuleCd(char[] value) {
      bdms01EomRuleCd = checkBdms01EomRuleCdConstraints(value);
      serializeBdms01EomRuleCd(bdms01EomRuleCd);
   } 

     /**
	 * 	Update Bdms01EomRuleCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01EomRuleCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01EomRuleCd,bdms01EomRuleCd.length);
   	
   }
   
   public void setBdms01EomRuleCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01EomRuleCd,bdms01EomRuleCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01EomRuleCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01EomRuleCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01EomRuleCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01EomRuleCd with another Field
	 *	@param value
	 */
   public void setBdms01EomRuleCd(Field source) {
       replace(source,0,source.length(),beginBdms01EomRuleCd,BDMS_01_EOM_RULE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01EomRuleCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01EomRuleCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01EomRuleCd,BDMS_01_EOM_RULE_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01EomRuleCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01EomRuleCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01EomRuleCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01CouponTypeCd
	 *	@return bdms01CouponTypeCd
	 */
   public char[] getBdms01CouponTypeCd() throws CFException{
     if (isBdms01CouponTypeCdModified()) { 
        bdms01CouponTypeCd = refreshBdms01CouponTypeCd();
     }
   		return bdms01CouponTypeCd;
   }

  
	/**
	*  set variable bdms01CouponTypeCd
	*  Corresponding COBOL Variable is BDMS01-COUPON-TYPE-CD
	*  @param value
	**/
   public void setBdms01CouponTypeCd(char[] value) {
      bdms01CouponTypeCd = checkBdms01CouponTypeCdConstraints(value);
      serializeBdms01CouponTypeCd(bdms01CouponTypeCd);
   } 

     /**
	 * 	Update Bdms01CouponTypeCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01CouponTypeCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01CouponTypeCd,bdms01CouponTypeCd.length);
   	
   }
   
   public void setBdms01CouponTypeCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CouponTypeCd,bdms01CouponTypeCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01CouponTypeCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CouponTypeCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CouponTypeCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01CouponTypeCd with another Field
	 *	@param value
	 */
   public void setBdms01CouponTypeCd(Field source) {
       replace(source,0,source.length(),beginBdms01CouponTypeCd,BDMS_01_COUPON_TYPE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01CouponTypeCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01CouponTypeCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01CouponTypeCd,BDMS_01_COUPON_TYPE_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01CouponTypeCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CouponTypeCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CouponTypeCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01OffrDocDlvryCd
	 *	@return bdms01OffrDocDlvryCd
	 */
   public char[] getBdms01OffrDocDlvryCd() throws CFException{
     if (isBdms01OffrDocDlvryCdModified()) { 
        bdms01OffrDocDlvryCd = refreshBdms01OffrDocDlvryCd();
     }
   		return bdms01OffrDocDlvryCd;
   }

  
	/**
	*  set variable bdms01OffrDocDlvryCd
	*  Corresponding COBOL Variable is BDMS01-OFFR-DOC-DLVRY-CD
	*  @param value
	**/
   public void setBdms01OffrDocDlvryCd(char[] value) {
      bdms01OffrDocDlvryCd = checkBdms01OffrDocDlvryCdConstraints(value);
      serializeBdms01OffrDocDlvryCd(bdms01OffrDocDlvryCd);
   } 

     /**
	 * 	Update Bdms01OffrDocDlvryCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01OffrDocDlvryCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01OffrDocDlvryCd,bdms01OffrDocDlvryCd.length);
   	
   }
   
   public void setBdms01OffrDocDlvryCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OffrDocDlvryCd,bdms01OffrDocDlvryCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01OffrDocDlvryCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OffrDocDlvryCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OffrDocDlvryCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01OffrDocDlvryCd with another Field
	 *	@param value
	 */
   public void setBdms01OffrDocDlvryCd(Field source) {
       replace(source,0,source.length(),beginBdms01OffrDocDlvryCd,BDMS_01_OFFR_DOC_DLVRY_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01OffrDocDlvryCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01OffrDocDlvryCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01OffrDocDlvryCd,BDMS_01_OFFR_DOC_DLVRY_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01OffrDocDlvryCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OffrDocDlvryCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01OffrDocDlvryCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01SidMudNbr
	 *	@return bdms01SidMudNbr
	 */
   public char[] getBdms01SidMudNbr() throws CFException{
     if (isBdms01SidMudNbrModified()) { 
        bdms01SidMudNbr = refreshBdms01SidMudNbr();
     }
   		return bdms01SidMudNbr;
   }

  
	/**
	*  set variable bdms01SidMudNbr
	*  Corresponding COBOL Variable is BDMS01-SID-MUD-NBR
	*  @param value
	**/
   public void setBdms01SidMudNbr(char[] value) {
      bdms01SidMudNbr = checkBdms01SidMudNbrConstraints(value);
      serializeBdms01SidMudNbr(bdms01SidMudNbr);
   } 

     /**
	 * 	Update Bdms01SidMudNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01SidMudNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01SidMudNbr,bdms01SidMudNbr.length);
   	
   }
   
   public void setBdms01SidMudNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SidMudNbr,bdms01SidMudNbr.length);
   	
   }
   
     /**
	 * 	Update Bdms01SidMudNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SidMudNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SidMudNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01SidMudNbr with another Field
	 *	@param value
	 */
   public void setBdms01SidMudNbr(Field source) {
       replace(source,0,source.length(),beginBdms01SidMudNbr,BDMS_01_SID_MUD_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01SidMudNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01SidMudNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01SidMudNbr,BDMS_01_SID_MUD_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01SidMudNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SidMudNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SidMudNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01MuniSrsDescTxt
	 *	@return bdms01MuniSrsDescTxt
	 */
   public char[] getBdms01MuniSrsDescTxt() throws CFException{
     if (isBdms01MuniSrsDescTxtModified()) { 
        bdms01MuniSrsDescTxt = refreshBdms01MuniSrsDescTxt();
     }
   		return bdms01MuniSrsDescTxt;
   }

  
	/**
	*  set variable bdms01MuniSrsDescTxt
	*  Corresponding COBOL Variable is BDMS01-MUNI-SRS-DESC-TXT
	*  @param value
	**/
   public void setBdms01MuniSrsDescTxt(char[] value) {
      bdms01MuniSrsDescTxt = checkBdms01MuniSrsDescTxtConstraints(value);
      serializeBdms01MuniSrsDescTxt(bdms01MuniSrsDescTxt);
   } 

     /**
	 * 	Update Bdms01MuniSrsDescTxt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01MuniSrsDescTxt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01MuniSrsDescTxt,bdms01MuniSrsDescTxt.length);
   	
   }
   
   public void setBdms01MuniSrsDescTxt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MuniSrsDescTxt,bdms01MuniSrsDescTxt.length);
   	
   }
   
     /**
	 * 	Update Bdms01MuniSrsDescTxt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01MuniSrsDescTxt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MuniSrsDescTxt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01MuniSrsDescTxt with another Field
	 *	@param value
	 */
   public void setBdms01MuniSrsDescTxt(Field source) {
       replace(source,0,source.length(),beginBdms01MuniSrsDescTxt,BDMS_01_MUNI_SRS_DESC_TXT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01MuniSrsDescTxt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01MuniSrsDescTxt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01MuniSrsDescTxt,BDMS_01_MUNI_SRS_DESC_TXT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01MuniSrsDescTxt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01MuniSrsDescTxt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MuniSrsDescTxt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01SupissTypeCd
	 *	@return bdms01SupissTypeCd
	 */
   public char[] getBdms01SupissTypeCd() throws CFException{
     if (isBdms01SupissTypeCdModified()) { 
        bdms01SupissTypeCd = refreshBdms01SupissTypeCd();
     }
   		return bdms01SupissTypeCd;
   }

  
	/**
	*  set variable bdms01SupissTypeCd
	*  Corresponding COBOL Variable is BDMS01-SUPISS-TYPE-CD
	*  @param value
	**/
   public void setBdms01SupissTypeCd(char[] value) {
      bdms01SupissTypeCd = checkBdms01SupissTypeCdConstraints(value);
      serializeBdms01SupissTypeCd(bdms01SupissTypeCd);
   } 

     /**
	 * 	Update Bdms01SupissTypeCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01SupissTypeCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01SupissTypeCd,bdms01SupissTypeCd.length);
   	
   }
   
   public void setBdms01SupissTypeCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SupissTypeCd,bdms01SupissTypeCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01SupissTypeCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SupissTypeCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SupissTypeCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01SupissTypeCd with another Field
	 *	@param value
	 */
   public void setBdms01SupissTypeCd(Field source) {
       replace(source,0,source.length(),beginBdms01SupissTypeCd,BDMS_01_SUPISS_TYPE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01SupissTypeCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01SupissTypeCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01SupissTypeCd,BDMS_01_SUPISS_TYPE_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01SupissTypeCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SupissTypeCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SupissTypeCd+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Bdms01BondBasicExpData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBdms01ScrtyAdpBaseNbr(CONSTANTS.SPACE_7);
         setBdms01PuttableInd(CONSTANTS.SPACE);
         setBdms01AbsInd(CONSTANTS.SPACE);
         setBdms01TypeAbsCd(CONSTANTS.SPACE_2);
         setBdms01CbndPassThruInd(CONSTANTS.SPACE);
         setBdms01UseOfPrcdCd(CONSTANTS.SPACE_2);
         setBdms01OtrEnhcmtCmpyNm(CONSTANTS.SPACE_50);
         setBdms01OtrEnhcmtTypeCd(CONSTANTS.SPACE_2);
         setBdms01SttlmDt(CONSTANTS.SPACE_10);
         setBdms01SttlmInd(CONSTANTS.SPACE);
         setBdms01OtrTaxExmptCd(CONSTANTS.SPACE);
         setBdms01RmktTermInd(CONSTANTS.SPACE);
         setBdms01FrgnSvrgnDbInd(CONSTANTS.SPACE);
         setBdms01ClMkWhlInd(CONSTANTS.SPACE);
         setBdms01InsCd(CONSTANTS.SPACE_5);
         setBdms01InsFtidCd(CONSTANTS.SPACE_2);
         setBdms01RrbInd(CONSTANTS.SPACE);
         setBdms01IssSttsCd(CONSTANTS.SPACE);
         setBdms01EomRuleCd(CONSTANTS.SPACE);
         setBdms01CouponTypeCd(CONSTANTS.SPACE);
         setBdms01OffrDocDlvryCd(CONSTANTS.SPACE);
         setBdms01SidMudNbr(CONSTANTS.SPACE_7);
         setBdms01MuniSrsDescTxt(CONSTANTS.SPACE_20);
         setBdms01SupissTypeCd(CONSTANTS.SPACE_5);
   }

		public static int getBdms01BondBasicExpDataFieldLength() {
			return BDMS_01_BOND_BASIC_EXP_DATA_LENGTH;
		}

}
  

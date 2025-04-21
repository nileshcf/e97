package com.cloudframe.app.cpsc4.dto;

/**
*  The class S0v3DtlMdlData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/


import com.cloudframe.app.cpsc4.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class S0v3DtlMdlData extends S0v3DtlMdlDataSerialized {
   

						private char[] advsryMdlId = new char[6];


						private char[] mdlTmpltTyCd = new char[3];


						private char[] acctSvcTyCd = new char[2];


						private char[] advsryRsrchTyCd = new char[1];


						private char[] portObjCd = new char[2];


								private long minInvstAmt;


						private char[] begEffDate = new char[10];


						private char[] clsNewMnyInd = new char[1];


						private char[] rebalAtmptCnt = new char[4];


						private char[] advsryMdlNa = new char[80];


						private char[] advsrySubAdviseCd = new char[1];


						private char[] taxSnstvInd = new char[1];


						private char[] mdlSerTyCd = new char[4];


						private char[] advsryMdlVerCd = new char[5];


						private char[] advsryMdlBnchmkCd = new char[5];


						private char[] mdlThresTyCd = new char[1];


						private char[] endEffDa = new char[10];


						private char[] advsryMdlTyCd = new char[3];

	
	/**
	* Constructor for S0v3DtlMdlData
	**/
    public S0v3DtlMdlData() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setAdvsryMdlId(fillSpace(6));
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 6
             ,1
             );
								setMdlTmpltTyCd(fillSpace(3));
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 10
             ,1
             );
								setAcctSvcTyCd(fillSpace(2));
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 13
             ,1
             );
								setAdvsryRsrchTyCd(fillSpace(1));
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 15
             ,1
             );
								setPortObjCd(fillSpace(2));
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 18
             ,1
             );
								setMinInvstAmt(0L);
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 29
             ,1
             );
								setBegEffDate("0000000000".toCharArray());
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 40
             ,1
             );
								setClsNewMnyInd(fillSpace(1));
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 42
             ,1
             );
								setRebalAtmptCnt("0000".toCharArray());
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 47
             ,1
             );
								setAdvsryMdlNa(pad(80," ".toCharArray(),' ',RIGHT_PAD));
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 128
             ,1
             );
								setAdvsrySubAdviseCd(fillSpace(1));
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 130
             ,1
             );
								setTaxSnstvInd(fillSpace(1));
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 132
             ,1
             );
								setMdlSerTyCd(fillSpace(4));
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 137
             ,1
             );
								setAdvsryMdlVerCd(fillSpace(5));
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 143
             ,1
             );
								setAdvsryMdlBnchmkCd(fillSpace(5));
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 149
             ,1
             );
								setMdlThresTyCd(fillSpace(1));
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 151
             ,1
             );
								setEndEffDa(fillSpace(10));
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 162
             ,1
             );
								setAdvsryMdlTyCd(fillSpace(3));
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 166
             ,1
             );
    }


 

	/**
	 *	Returns the value of advsryMdlId
	 *	@return advsryMdlId
	 */
   public char[] getAdvsryMdlId() throws CFException{
     if (isAdvsryMdlIdModified()) { 
        advsryMdlId = refreshAdvsryMdlId();
     }
   		return advsryMdlId;
   }

  
	/**
	*  set variable advsryMdlId
	*  Corresponding COBOL Variable is WS-ADVSRY-MDL-ID
	*  @param value
	**/
   public void setAdvsryMdlId(char[] value) {
      advsryMdlId = checkAdvsryMdlIdConstraints(value);
      serializeAdvsryMdlId(advsryMdlId);
   } 

     /**
	 * 	Update AdvsryMdlId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAdvsryMdlId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAdvsryMdlId,advsryMdlId.length);
   	
   }
   
   public void setAdvsryMdlId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAdvsryMdlId,advsryMdlId.length);
   	
   }
   
     /**
	 * 	Update AdvsryMdlId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdvsryMdlId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAdvsryMdlId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AdvsryMdlId with another Field
	 *	@param value
	 */
   public void setAdvsryMdlId(Field source) {
       replace(source,0,source.length(),beginAdvsryMdlId,ADVSRY_MDL_ID_LEN);
   	
   }  
   
     /**
	 * 	Update AdvsryMdlId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAdvsryMdlId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAdvsryMdlId,ADVSRY_MDL_ID_LEN);
   	
   }
   
     /**
	 * 	Update AdvsryMdlId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdvsryMdlId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAdvsryMdlId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mdlTmpltTyCd
	 *	@return mdlTmpltTyCd
	 */
   public char[] getMdlTmpltTyCd() throws CFException{
     if (isMdlTmpltTyCdModified()) { 
        mdlTmpltTyCd = refreshMdlTmpltTyCd();
     }
   		return mdlTmpltTyCd;
   }

  
	/**
	*  set variable mdlTmpltTyCd
	*  Corresponding COBOL Variable is WS-MDL-TMPLT-TY-CD
	*  @param value
	**/
   public void setMdlTmpltTyCd(char[] value) {
      mdlTmpltTyCd = checkMdlTmpltTyCdConstraints(value);
      serializeMdlTmpltTyCd(mdlTmpltTyCd);
   } 

     /**
	 * 	Update MdlTmpltTyCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMdlTmpltTyCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMdlTmpltTyCd,mdlTmpltTyCd.length);
   	
   }
   
   public void setMdlTmpltTyCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMdlTmpltTyCd,mdlTmpltTyCd.length);
   	
   }
   
     /**
	 * 	Update MdlTmpltTyCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMdlTmpltTyCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMdlTmpltTyCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MdlTmpltTyCd with another Field
	 *	@param value
	 */
   public void setMdlTmpltTyCd(Field source) {
       replace(source,0,source.length(),beginMdlTmpltTyCd,MDL_TMPLT_TY_CD_LEN);
   	
   }  
   
     /**
	 * 	Update MdlTmpltTyCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMdlTmpltTyCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMdlTmpltTyCd,MDL_TMPLT_TY_CD_LEN);
   	
   }
   
     /**
	 * 	Update MdlTmpltTyCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMdlTmpltTyCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMdlTmpltTyCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of acctSvcTyCd
	 *	@return acctSvcTyCd
	 */
   public char[] getAcctSvcTyCd() throws CFException{
     if (isAcctSvcTyCdModified()) { 
        acctSvcTyCd = refreshAcctSvcTyCd();
     }
   		return acctSvcTyCd;
   }

  
	/**
	*  set variable acctSvcTyCd
	*  Corresponding COBOL Variable is WS-ACCT-SVC-TY-CD
	*  @param value
	**/
   public void setAcctSvcTyCd(char[] value) {
      acctSvcTyCd = checkAcctSvcTyCdConstraints(value);
      serializeAcctSvcTyCd(acctSvcTyCd);
   } 

     /**
	 * 	Update AcctSvcTyCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAcctSvcTyCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAcctSvcTyCd,acctSvcTyCd.length);
   	
   }
   
   public void setAcctSvcTyCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAcctSvcTyCd,acctSvcTyCd.length);
   	
   }
   
     /**
	 * 	Update AcctSvcTyCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAcctSvcTyCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAcctSvcTyCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AcctSvcTyCd with another Field
	 *	@param value
	 */
   public void setAcctSvcTyCd(Field source) {
       replace(source,0,source.length(),beginAcctSvcTyCd,ACCT_SVC_TY_CD_LEN);
   	
   }  
   
     /**
	 * 	Update AcctSvcTyCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAcctSvcTyCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAcctSvcTyCd,ACCT_SVC_TY_CD_LEN);
   	
   }
   
     /**
	 * 	Update AcctSvcTyCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAcctSvcTyCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAcctSvcTyCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of advsryRsrchTyCd
	 *	@return advsryRsrchTyCd
	 */
   public char[] getAdvsryRsrchTyCd() throws CFException{
     if (isAdvsryRsrchTyCdModified()) { 
        advsryRsrchTyCd = refreshAdvsryRsrchTyCd();
     }
   		return advsryRsrchTyCd;
   }

  
	/**
	*  set variable advsryRsrchTyCd
	*  Corresponding COBOL Variable is WS-ADVSRY-RSRCH-TY-CD
	*  @param value
	**/
   public void setAdvsryRsrchTyCd(char[] value) {
      advsryRsrchTyCd = checkAdvsryRsrchTyCdConstraints(value);
      serializeAdvsryRsrchTyCd(advsryRsrchTyCd);
   } 

     /**
	 * 	Update AdvsryRsrchTyCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAdvsryRsrchTyCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAdvsryRsrchTyCd,advsryRsrchTyCd.length);
   	
   }
   
   public void setAdvsryRsrchTyCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAdvsryRsrchTyCd,advsryRsrchTyCd.length);
   	
   }
   
     /**
	 * 	Update AdvsryRsrchTyCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdvsryRsrchTyCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAdvsryRsrchTyCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AdvsryRsrchTyCd with another Field
	 *	@param value
	 */
   public void setAdvsryRsrchTyCd(Field source) {
       replace(source,0,source.length(),beginAdvsryRsrchTyCd,ADVSRY_RSRCH_TY_CD_LEN);
   	
   }  
   
     /**
	 * 	Update AdvsryRsrchTyCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAdvsryRsrchTyCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAdvsryRsrchTyCd,ADVSRY_RSRCH_TY_CD_LEN);
   	
   }
   
     /**
	 * 	Update AdvsryRsrchTyCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdvsryRsrchTyCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAdvsryRsrchTyCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of portObjCd
	 *	@return portObjCd
	 */
   public char[] getPortObjCd() throws CFException{
     if (isPortObjCdModified()) { 
        portObjCd = refreshPortObjCd();
     }
   		return portObjCd;
   }

  
	/**
	*  set variable portObjCd
	*  Corresponding COBOL Variable is WS-PORT-OBJ-CD
	*  @param value
	**/
   public void setPortObjCd(char[] value) {
      portObjCd = checkPortObjCdConstraints(value);
      serializePortObjCd(portObjCd);
   } 

     /**
	 * 	Update PortObjCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPortObjCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPortObjCd,portObjCd.length);
   	
   }
   
   public void setPortObjCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPortObjCd,portObjCd.length);
   	
   }
   
     /**
	 * 	Update PortObjCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPortObjCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPortObjCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PortObjCd with another Field
	 *	@param value
	 */
   public void setPortObjCd(Field source) {
       replace(source,0,source.length(),beginPortObjCd,PORT_OBJ_CD_LEN);
   	
   }  
   
     /**
	 * 	Update PortObjCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPortObjCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPortObjCd,PORT_OBJ_CD_LEN);
   	
   }
   
     /**
	 * 	Update PortObjCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPortObjCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPortObjCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of minInvstAmt
	 *	@return minInvstAmt
	 */
	public long getMinInvstAmt() throws CFException {
       if (isMinInvstAmtModified()) { 
           minInvstAmt = refreshMinInvstAmt();
        }
   		return minInvstAmt;
	}
	

	
	   
	/**
	 * 	Update MinInvstAmt with the passed value
	 *  Corresponding COBOL Variable is WS-MIN-INVST-AMT
	 *	@param number
	 */
	public void setMinInvstAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    minInvstAmt = checkMinInvstAmtMaxLimit(number); 
		serializeMinInvstAmt(minInvstAmt);
	}
	

	/**
	 * 	Update MinInvstAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setMinInvstAmt(char[] value) throws CFException {
		 minInvstAmt = serializeMinInvstAmt(value);
	}
	/**
	 * 	Update MinInvstAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMinInvstAmtString(char[] value) throws CFException {
		 setMinInvstAmt(value);
	}
	/**
	 *	Returns the value of begEffDate
	 *	@return begEffDate
	 */
   public char[] getBegEffDate() throws CFException{
     if (isBegEffDateModified()) { 
        begEffDate = refreshBegEffDate();
     }
   		return begEffDate;
   }

  
	/**
	*  set variable begEffDate
	*  Corresponding COBOL Variable is WS-BEG-EFF-DATE
	*  @param value
	**/
   public void setBegEffDate(char[] value) {
      begEffDate = checkBegEffDateConstraints(value);
      serializeBegEffDate(begEffDate);
   } 

     /**
	 * 	Update BegEffDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBegEffDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBegEffDate,begEffDate.length);
   	
   }
   
   public void setBegEffDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBegEffDate,begEffDate.length);
   	
   }
   
     /**
	 * 	Update BegEffDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBegEffDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBegEffDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BegEffDate with another Field
	 *	@param value
	 */
   public void setBegEffDate(Field source) {
       replace(source,0,source.length(),beginBegEffDate,BEG_EFF_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update BegEffDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBegEffDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBegEffDate,BEG_EFF_DATE_LEN);
   	
   }
   
     /**
	 * 	Update BegEffDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBegEffDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBegEffDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of clsNewMnyInd
	 *	@return clsNewMnyInd
	 */
   public char[] getClsNewMnyInd() throws CFException{
     if (isClsNewMnyIndModified()) { 
        clsNewMnyInd = refreshClsNewMnyInd();
     }
   		return clsNewMnyInd;
   }

  
	/**
	*  set variable clsNewMnyInd
	*  Corresponding COBOL Variable is WS-CLS-NEW-MNY-IND
	*  @param value
	**/
   public void setClsNewMnyInd(char[] value) {
      clsNewMnyInd = checkClsNewMnyIndConstraints(value);
      serializeClsNewMnyInd(clsNewMnyInd);
   } 

     /**
	 * 	Update ClsNewMnyInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setClsNewMnyInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginClsNewMnyInd,clsNewMnyInd.length);
   	
   }
   
   public void setClsNewMnyInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginClsNewMnyInd,clsNewMnyInd.length);
   	
   }
   
     /**
	 * 	Update ClsNewMnyInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setClsNewMnyInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginClsNewMnyInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ClsNewMnyInd with another Field
	 *	@param value
	 */
   public void setClsNewMnyInd(Field source) {
       replace(source,0,source.length(),beginClsNewMnyInd,CLS_NEW_MNY_IND_LEN);
   	
   }  
   
     /**
	 * 	Update ClsNewMnyInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setClsNewMnyInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginClsNewMnyInd,CLS_NEW_MNY_IND_LEN);
   	
   }
   
     /**
	 * 	Update ClsNewMnyInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setClsNewMnyInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginClsNewMnyInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rebalAtmptCnt
	 *	@return rebalAtmptCnt
	 */
   public char[] getRebalAtmptCnt() throws CFException{
     if (isRebalAtmptCntModified()) { 
        rebalAtmptCnt = refreshRebalAtmptCnt();
     }
   		return rebalAtmptCnt;
   }

  
	/**
	*  set variable rebalAtmptCnt
	*  Corresponding COBOL Variable is WS-REBAL-ATMPT-CNT
	*  @param value
	**/
   public void setRebalAtmptCnt(char[] value) {
      rebalAtmptCnt = checkRebalAtmptCntConstraints(value);
      serializeRebalAtmptCnt(rebalAtmptCnt);
   } 

     /**
	 * 	Update RebalAtmptCnt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRebalAtmptCnt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRebalAtmptCnt,rebalAtmptCnt.length);
   	
   }
   
   public void setRebalAtmptCnt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRebalAtmptCnt,rebalAtmptCnt.length);
   	
   }
   
     /**
	 * 	Update RebalAtmptCnt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRebalAtmptCnt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRebalAtmptCnt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RebalAtmptCnt with another Field
	 *	@param value
	 */
   public void setRebalAtmptCnt(Field source) {
       replace(source,0,source.length(),beginRebalAtmptCnt,REBAL_ATMPT_CNT_LEN);
   	
   }  
   
     /**
	 * 	Update RebalAtmptCnt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRebalAtmptCnt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRebalAtmptCnt,REBAL_ATMPT_CNT_LEN);
   	
   }
   
     /**
	 * 	Update RebalAtmptCnt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRebalAtmptCnt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRebalAtmptCnt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of advsryMdlNa
	 *	@return advsryMdlNa
	 */
   public char[] getAdvsryMdlNa() throws CFException{
     if (isAdvsryMdlNaModified()) { 
        advsryMdlNa = refreshAdvsryMdlNa();
     }
   		return advsryMdlNa;
   }

  
	/**
	*  set variable advsryMdlNa
	*  Corresponding COBOL Variable is WS-ADVSRY-MDL-NA
	*  @param value
	**/
   public void setAdvsryMdlNa(char[] value) {
      advsryMdlNa = checkAdvsryMdlNaConstraints(value);
      serializeAdvsryMdlNa(advsryMdlNa);
   } 

     /**
	 * 	Update AdvsryMdlNa 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAdvsryMdlNa(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAdvsryMdlNa,advsryMdlNa.length);
   	
   }
   
   public void setAdvsryMdlNa(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAdvsryMdlNa,advsryMdlNa.length);
   	
   }
   
     /**
	 * 	Update AdvsryMdlNa 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdvsryMdlNa(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAdvsryMdlNa+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AdvsryMdlNa with another Field
	 *	@param value
	 */
   public void setAdvsryMdlNa(Field source) {
       replace(source,0,source.length(),beginAdvsryMdlNa,ADVSRY_MDL_NA_LEN);
   	
   }  
   
     /**
	 * 	Update AdvsryMdlNa 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAdvsryMdlNa(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAdvsryMdlNa,ADVSRY_MDL_NA_LEN);
   	
   }
   
     /**
	 * 	Update AdvsryMdlNa 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdvsryMdlNa(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAdvsryMdlNa+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of advsrySubAdviseCd
	 *	@return advsrySubAdviseCd
	 */
   public char[] getAdvsrySubAdviseCd() throws CFException{
     if (isAdvsrySubAdviseCdModified()) { 
        advsrySubAdviseCd = refreshAdvsrySubAdviseCd();
     }
   		return advsrySubAdviseCd;
   }

  
	/**
	*  set variable advsrySubAdviseCd
	*  Corresponding COBOL Variable is WS-ADVSRY-SUB-ADVISE-CD
	*  @param value
	**/
   public void setAdvsrySubAdviseCd(char[] value) {
      advsrySubAdviseCd = checkAdvsrySubAdviseCdConstraints(value);
      serializeAdvsrySubAdviseCd(advsrySubAdviseCd);
   } 

     /**
	 * 	Update AdvsrySubAdviseCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAdvsrySubAdviseCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAdvsrySubAdviseCd,advsrySubAdviseCd.length);
   	
   }
   
   public void setAdvsrySubAdviseCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAdvsrySubAdviseCd,advsrySubAdviseCd.length);
   	
   }
   
     /**
	 * 	Update AdvsrySubAdviseCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdvsrySubAdviseCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAdvsrySubAdviseCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AdvsrySubAdviseCd with another Field
	 *	@param value
	 */
   public void setAdvsrySubAdviseCd(Field source) {
       replace(source,0,source.length(),beginAdvsrySubAdviseCd,ADVSRY_SUB_ADVISE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update AdvsrySubAdviseCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAdvsrySubAdviseCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAdvsrySubAdviseCd,ADVSRY_SUB_ADVISE_CD_LEN);
   	
   }
   
     /**
	 * 	Update AdvsrySubAdviseCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdvsrySubAdviseCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAdvsrySubAdviseCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taxSnstvInd
	 *	@return taxSnstvInd
	 */
   public char[] getTaxSnstvInd() throws CFException{
     if (isTaxSnstvIndModified()) { 
        taxSnstvInd = refreshTaxSnstvInd();
     }
   		return taxSnstvInd;
   }

  
	/**
	*  set variable taxSnstvInd
	*  Corresponding COBOL Variable is WS-TAX-SNSTV-IND
	*  @param value
	**/
   public void setTaxSnstvInd(char[] value) {
      taxSnstvInd = checkTaxSnstvIndConstraints(value);
      serializeTaxSnstvInd(taxSnstvInd);
   } 

     /**
	 * 	Update TaxSnstvInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaxSnstvInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaxSnstvInd,taxSnstvInd.length);
   	
   }
   
   public void setTaxSnstvInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaxSnstvInd,taxSnstvInd.length);
   	
   }
   
     /**
	 * 	Update TaxSnstvInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaxSnstvInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaxSnstvInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaxSnstvInd with another Field
	 *	@param value
	 */
   public void setTaxSnstvInd(Field source) {
       replace(source,0,source.length(),beginTaxSnstvInd,TAX_SNSTV_IND_LEN);
   	
   }  
   
     /**
	 * 	Update TaxSnstvInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaxSnstvInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaxSnstvInd,TAX_SNSTV_IND_LEN);
   	
   }
   
     /**
	 * 	Update TaxSnstvInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaxSnstvInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaxSnstvInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mdlSerTyCd
	 *	@return mdlSerTyCd
	 */
   public char[] getMdlSerTyCd() throws CFException{
     if (isMdlSerTyCdModified()) { 
        mdlSerTyCd = refreshMdlSerTyCd();
     }
   		return mdlSerTyCd;
   }

  
	/**
	*  set variable mdlSerTyCd
	*  Corresponding COBOL Variable is WS-MDL-SER-TY-CD
	*  @param value
	**/
   public void setMdlSerTyCd(char[] value) {
      mdlSerTyCd = checkMdlSerTyCdConstraints(value);
      serializeMdlSerTyCd(mdlSerTyCd);
   } 

     /**
	 * 	Update MdlSerTyCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMdlSerTyCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMdlSerTyCd,mdlSerTyCd.length);
   	
   }
   
   public void setMdlSerTyCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMdlSerTyCd,mdlSerTyCd.length);
   	
   }
   
     /**
	 * 	Update MdlSerTyCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMdlSerTyCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMdlSerTyCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MdlSerTyCd with another Field
	 *	@param value
	 */
   public void setMdlSerTyCd(Field source) {
       replace(source,0,source.length(),beginMdlSerTyCd,MDL_SER_TY_CD_LEN);
   	
   }  
   
     /**
	 * 	Update MdlSerTyCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMdlSerTyCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMdlSerTyCd,MDL_SER_TY_CD_LEN);
   	
   }
   
     /**
	 * 	Update MdlSerTyCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMdlSerTyCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMdlSerTyCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of advsryMdlVerCd
	 *	@return advsryMdlVerCd
	 */
   public char[] getAdvsryMdlVerCd() throws CFException{
     if (isAdvsryMdlVerCdModified()) { 
        advsryMdlVerCd = refreshAdvsryMdlVerCd();
     }
   		return advsryMdlVerCd;
   }

  
	/**
	*  set variable advsryMdlVerCd
	*  Corresponding COBOL Variable is WS-ADVSRY-MDL-VER-CD
	*  @param value
	**/
   public void setAdvsryMdlVerCd(char[] value) {
      advsryMdlVerCd = checkAdvsryMdlVerCdConstraints(value);
      serializeAdvsryMdlVerCd(advsryMdlVerCd);
   } 

     /**
	 * 	Update AdvsryMdlVerCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAdvsryMdlVerCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAdvsryMdlVerCd,advsryMdlVerCd.length);
   	
   }
   
   public void setAdvsryMdlVerCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAdvsryMdlVerCd,advsryMdlVerCd.length);
   	
   }
   
     /**
	 * 	Update AdvsryMdlVerCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdvsryMdlVerCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAdvsryMdlVerCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AdvsryMdlVerCd with another Field
	 *	@param value
	 */
   public void setAdvsryMdlVerCd(Field source) {
       replace(source,0,source.length(),beginAdvsryMdlVerCd,ADVSRY_MDL_VER_CD_LEN);
   	
   }  
   
     /**
	 * 	Update AdvsryMdlVerCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAdvsryMdlVerCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAdvsryMdlVerCd,ADVSRY_MDL_VER_CD_LEN);
   	
   }
   
     /**
	 * 	Update AdvsryMdlVerCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdvsryMdlVerCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAdvsryMdlVerCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of advsryMdlBnchmkCd
	 *	@return advsryMdlBnchmkCd
	 */
   public char[] getAdvsryMdlBnchmkCd() throws CFException{
     if (isAdvsryMdlBnchmkCdModified()) { 
        advsryMdlBnchmkCd = refreshAdvsryMdlBnchmkCd();
     }
   		return advsryMdlBnchmkCd;
   }

  
	/**
	*  set variable advsryMdlBnchmkCd
	*  Corresponding COBOL Variable is WS-ADVSRY-MDL-BNCHMK-CD
	*  @param value
	**/
   public void setAdvsryMdlBnchmkCd(char[] value) {
      advsryMdlBnchmkCd = checkAdvsryMdlBnchmkCdConstraints(value);
      serializeAdvsryMdlBnchmkCd(advsryMdlBnchmkCd);
   } 

     /**
	 * 	Update AdvsryMdlBnchmkCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAdvsryMdlBnchmkCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAdvsryMdlBnchmkCd,advsryMdlBnchmkCd.length);
   	
   }
   
   public void setAdvsryMdlBnchmkCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAdvsryMdlBnchmkCd,advsryMdlBnchmkCd.length);
   	
   }
   
     /**
	 * 	Update AdvsryMdlBnchmkCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdvsryMdlBnchmkCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAdvsryMdlBnchmkCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AdvsryMdlBnchmkCd with another Field
	 *	@param value
	 */
   public void setAdvsryMdlBnchmkCd(Field source) {
       replace(source,0,source.length(),beginAdvsryMdlBnchmkCd,ADVSRY_MDL_BNCHMK_CD_LEN);
   	
   }  
   
     /**
	 * 	Update AdvsryMdlBnchmkCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAdvsryMdlBnchmkCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAdvsryMdlBnchmkCd,ADVSRY_MDL_BNCHMK_CD_LEN);
   	
   }
   
     /**
	 * 	Update AdvsryMdlBnchmkCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdvsryMdlBnchmkCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAdvsryMdlBnchmkCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mdlThresTyCd
	 *	@return mdlThresTyCd
	 */
   public char[] getMdlThresTyCd() throws CFException{
     if (isMdlThresTyCdModified()) { 
        mdlThresTyCd = refreshMdlThresTyCd();
     }
   		return mdlThresTyCd;
   }

  
	/**
	*  set variable mdlThresTyCd
	*  Corresponding COBOL Variable is WS-MDL-THRES-TY-CD
	*  @param value
	**/
   public void setMdlThresTyCd(char[] value) {
      mdlThresTyCd = checkMdlThresTyCdConstraints(value);
      serializeMdlThresTyCd(mdlThresTyCd);
   } 

     /**
	 * 	Update MdlThresTyCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMdlThresTyCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMdlThresTyCd,mdlThresTyCd.length);
   	
   }
   
   public void setMdlThresTyCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMdlThresTyCd,mdlThresTyCd.length);
   	
   }
   
     /**
	 * 	Update MdlThresTyCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMdlThresTyCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMdlThresTyCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MdlThresTyCd with another Field
	 *	@param value
	 */
   public void setMdlThresTyCd(Field source) {
       replace(source,0,source.length(),beginMdlThresTyCd,MDL_THRES_TY_CD_LEN);
   	
   }  
   
     /**
	 * 	Update MdlThresTyCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMdlThresTyCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMdlThresTyCd,MDL_THRES_TY_CD_LEN);
   	
   }
   
     /**
	 * 	Update MdlThresTyCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMdlThresTyCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMdlThresTyCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of endEffDa
	 *	@return endEffDa
	 */
   public char[] getEndEffDa() throws CFException{
     if (isEndEffDaModified()) { 
        endEffDa = refreshEndEffDa();
     }
   		return endEffDa;
   }

  
	/**
	*  set variable endEffDa
	*  Corresponding COBOL Variable is WS-END-EFF-DA
	*  @param value
	**/
   public void setEndEffDa(char[] value) {
      endEffDa = checkEndEffDaConstraints(value);
      serializeEndEffDa(endEffDa);
   } 

     /**
	 * 	Update EndEffDa 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEndEffDa(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEndEffDa,endEffDa.length);
   	
   }
   
   public void setEndEffDa(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEndEffDa,endEffDa.length);
   	
   }
   
     /**
	 * 	Update EndEffDa 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEndEffDa(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEndEffDa+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EndEffDa with another Field
	 *	@param value
	 */
   public void setEndEffDa(Field source) {
       replace(source,0,source.length(),beginEndEffDa,END_EFF_DA_LEN);
   	
   }  
   
     /**
	 * 	Update EndEffDa 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEndEffDa(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEndEffDa,END_EFF_DA_LEN);
   	
   }
   
     /**
	 * 	Update EndEffDa 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEndEffDa(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEndEffDa+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of advsryMdlTyCd
	 *	@return advsryMdlTyCd
	 */
   public char[] getAdvsryMdlTyCd() throws CFException{
     if (isAdvsryMdlTyCdModified()) { 
        advsryMdlTyCd = refreshAdvsryMdlTyCd();
     }
   		return advsryMdlTyCd;
   }

  
	/**
	*  set variable advsryMdlTyCd
	*  Corresponding COBOL Variable is WS-ADVSRY-MDL-TY-CD
	*  @param value
	**/
   public void setAdvsryMdlTyCd(char[] value) {
      advsryMdlTyCd = checkAdvsryMdlTyCdConstraints(value);
      serializeAdvsryMdlTyCd(advsryMdlTyCd);
   } 

     /**
	 * 	Update AdvsryMdlTyCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAdvsryMdlTyCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAdvsryMdlTyCd,advsryMdlTyCd.length);
   	
   }
   
   public void setAdvsryMdlTyCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAdvsryMdlTyCd,advsryMdlTyCd.length);
   	
   }
   
     /**
	 * 	Update AdvsryMdlTyCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdvsryMdlTyCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAdvsryMdlTyCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AdvsryMdlTyCd with another Field
	 *	@param value
	 */
   public void setAdvsryMdlTyCd(Field source) {
       replace(source,0,source.length(),beginAdvsryMdlTyCd,ADVSRY_MDL_TY_CD_LEN);
   	
   }  
   
     /**
	 * 	Update AdvsryMdlTyCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAdvsryMdlTyCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAdvsryMdlTyCd,ADVSRY_MDL_TY_CD_LEN);
   	
   }
   
     /**
	 * 	Update AdvsryMdlTyCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdvsryMdlTyCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAdvsryMdlTyCd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getS0v3DtlMdlDataFieldLength() {
			return S_0V_3_DTL_MDL_DATA_LENGTH;
		}

}
  

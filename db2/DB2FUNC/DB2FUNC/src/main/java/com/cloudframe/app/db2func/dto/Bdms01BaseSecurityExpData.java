package com.cloudframe.app.db2func.dto;

/**
*  The class Bdms01BaseSecurityExpData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/


import com.cloudframe.app.db2func.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import com.cloudframe.app.common.CONSTANTS;


public class Bdms01BaseSecurityExpData extends Bdms01BaseSecurityExpDataSerialized { 
   

						private char[] bdms01PutEndDt = Field.fillLowValue(10);

								private int bdms01PutNtcMinDyQty;

								private int bdms01PutNtcMaxDyQty;

						private char[] bdms01CltrlTypeCd = Field.fillLowValue(2);

						private char[] bdms01PutFreqCd = Field.fillLowValue(2);

						private char[] bdms01MtrtyTypeCd = Field.fillLowValue(2);

						private char[] bdms01LnkdCd = Field.fillLowValue(1);

						private char[] bdms01ActnRtInd = Field.fillLowValue(1);

						private char[] bdms01FrstVrblRstDt = Field.fillLowValue(10);

						private char[] bdms01RstFreqCd = Field.fillLowValue(2);

						private char[] bdms01Call2TmngCd = Field.fillLowValue(2);

						private char[] bdms01ExchgPrimeCd = Field.fillLowValue(3);

						private char[] bdms01MrktTierCd = Field.fillLowValue(1);

						private char[] bdms01MrktIndCd = Field.fillLowValue(4);

						private char[] bdms01NewTraceInd = Field.fillLowValue(1);

						private char[] bdms01QuickCd = Field.fillLowValue(6);

						private char[] bdms01LseMrktCd = Field.fillLowValue(4);

						private char[] bdms01IsinChngInd = Field.fillLowValue(1);

						private char[] bdms01StkIssueSttsCd = Field.fillLowValue(1);

						private char[] bdms01IssrTypeCd = Field.fillLowValue(1);

						private char[] bdms01TraceSymblTxt = Field.fillLowValue(14);

						private char[] bdms01RegsInd = Field.fillLowValue(1);

						private char[] bdms01PpnCd = Field.fillLowValue(3);

						private char[] bdms01PpnInd = Field.fillLowValue(1);

						private char[] bdms01DtcUnrtdMoodyCd = Field.fillLowValue(1);

						private char[] bdms01DtcUnrtdSpCd = Field.fillLowValue(1);

						private char[] bdms01TirsSecTypeCd = Field.fillLowValue(1);

						private char[] bdms01SifmaSmgInd = Field.fillLowValue(1);

						private char[] bdms01CalledAncmtCd = Field.fillLowValue(1);

						private char[] bdms01PrtlRdmptSchdCd = Field.fillLowValue(1);

						private char[] bdms01FdrlTaxSttsCd = Field.fillLowValue(1);

						private char[] bdms01CntngTaxCd = Field.fillLowValue(1);

								private BigDecimal bdms01CntngYldRt = BigDecimal.ZERO;

						private char[] bdms01SecTypeCd = Field.fillLowValue(3);

						private char[] bdms01CltrlIssCd = Field.fillLowValue(2);

						private char[] bdms01RangeInd = Field.fillLowValue(1);

						private char[] bdms01B8CntngPymntCd = Field.fillLowValue(1);

						private char[] bdms01CrntCpnTypeCd = Field.fillLowValue(1);

						private char[] bdms01Extelc1SecTypCd = Field.fillLowValue(2);

	
	/**
	* Constructor for Bdms01BaseSecurityExpData
	**/
    public Bdms01BaseSecurityExpData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Bdms01BaseSecurityExpData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01BaseSecurityExpData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bdms01PutEndDt
	 *	@return bdms01PutEndDt
	 */
   public char[] getBdms01PutEndDt() throws CFException{
     if (isBdms01PutEndDtModified()) { 
        bdms01PutEndDt = refreshBdms01PutEndDt();
     }
   		return bdms01PutEndDt;
   }

  
	/**
	*  set variable bdms01PutEndDt
	*  Corresponding COBOL Variable is BDMS01-PUT-END-DT
	*  @param value
	**/
   public void setBdms01PutEndDt(char[] value) {
      bdms01PutEndDt = checkBdms01PutEndDtConstraints(value);
      serializeBdms01PutEndDt(bdms01PutEndDt);
   } 

     /**
	 * 	Update Bdms01PutEndDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PutEndDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01PutEndDt,bdms01PutEndDt.length);
   	
   }
   
   public void setBdms01PutEndDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PutEndDt,bdms01PutEndDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01PutEndDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PutEndDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PutEndDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01PutEndDt with another Field
	 *	@param value
	 */
   public void setBdms01PutEndDt(Field source) {
       replace(source,0,source.length(),beginBdms01PutEndDt,BDMS_01_PUT_END_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01PutEndDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PutEndDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01PutEndDt,BDMS_01_PUT_END_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01PutEndDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PutEndDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PutEndDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01PutNtcMinDyQty
	 *	@return bdms01PutNtcMinDyQty
	 */
	public int getBdms01PutNtcMinDyQty() throws CFException {
       if (isBdms01PutNtcMinDyQtyModified()) { 
           bdms01PutNtcMinDyQty = refreshBdms01PutNtcMinDyQty();
        }
   		return bdms01PutNtcMinDyQty;
	}
	

	
	   
	/**
	 * 	Update Bdms01PutNtcMinDyQty with the passed value
	 *  Corresponding COBOL Variable is BDMS01-PUT-NTC-MIN-DY-QTY
	 *	@param number
	 */
	public void setBdms01PutNtcMinDyQty(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bdms01PutNtcMinDyQty = checkBdms01PutNtcMinDyQtyMaxLimit(number); 
		serializeBdms01PutNtcMinDyQty(bdms01PutNtcMinDyQty);
	}
	

	public void setBdms01PutNtcMinDyQty(long number) {
	    number = checkBdms01PutNtcMinDyQtyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBdms01PutNtcMinDyQty((int)number);
	}
	
	/**
	 * 	Update Bdms01PutNtcMinDyQty with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01PutNtcMinDyQty(char[] value) throws CFException {
		 bdms01PutNtcMinDyQty = serializeBdms01PutNtcMinDyQty(value);
	}
	/**
	 * 	Update Bdms01PutNtcMinDyQty with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBdms01PutNtcMinDyQtyString(char[] value) throws CFException {
		 setBdms01PutNtcMinDyQty(value);
	}
	/**
	 *	Returns the value of bdms01PutNtcMaxDyQty
	 *	@return bdms01PutNtcMaxDyQty
	 */
	public int getBdms01PutNtcMaxDyQty() throws CFException {
       if (isBdms01PutNtcMaxDyQtyModified()) { 
           bdms01PutNtcMaxDyQty = refreshBdms01PutNtcMaxDyQty();
        }
   		return bdms01PutNtcMaxDyQty;
	}
	

	
	   
	/**
	 * 	Update Bdms01PutNtcMaxDyQty with the passed value
	 *  Corresponding COBOL Variable is BDMS01-PUT-NTC-MAX-DY-QTY
	 *	@param number
	 */
	public void setBdms01PutNtcMaxDyQty(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bdms01PutNtcMaxDyQty = checkBdms01PutNtcMaxDyQtyMaxLimit(number); 
		serializeBdms01PutNtcMaxDyQty(bdms01PutNtcMaxDyQty);
	}
	

	public void setBdms01PutNtcMaxDyQty(long number) {
	    number = checkBdms01PutNtcMaxDyQtyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBdms01PutNtcMaxDyQty((int)number);
	}
	
	/**
	 * 	Update Bdms01PutNtcMaxDyQty with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01PutNtcMaxDyQty(char[] value) throws CFException {
		 bdms01PutNtcMaxDyQty = serializeBdms01PutNtcMaxDyQty(value);
	}
	/**
	 * 	Update Bdms01PutNtcMaxDyQty with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBdms01PutNtcMaxDyQtyString(char[] value) throws CFException {
		 setBdms01PutNtcMaxDyQty(value);
	}
	/**
	 *	Returns the value of bdms01CltrlTypeCd
	 *	@return bdms01CltrlTypeCd
	 */
   public char[] getBdms01CltrlTypeCd() throws CFException{
     if (isBdms01CltrlTypeCdModified()) { 
        bdms01CltrlTypeCd = refreshBdms01CltrlTypeCd();
     }
   		return bdms01CltrlTypeCd;
   }

  
	/**
	*  set variable bdms01CltrlTypeCd
	*  Corresponding COBOL Variable is BDMS01-CLTRL-TYPE-CD
	*  @param value
	**/
   public void setBdms01CltrlTypeCd(char[] value) {
      bdms01CltrlTypeCd = checkBdms01CltrlTypeCdConstraints(value);
      serializeBdms01CltrlTypeCd(bdms01CltrlTypeCd);
   } 

     /**
	 * 	Update Bdms01CltrlTypeCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01CltrlTypeCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01CltrlTypeCd,bdms01CltrlTypeCd.length);
   	
   }
   
   public void setBdms01CltrlTypeCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CltrlTypeCd,bdms01CltrlTypeCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01CltrlTypeCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CltrlTypeCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CltrlTypeCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01CltrlTypeCd with another Field
	 *	@param value
	 */
   public void setBdms01CltrlTypeCd(Field source) {
       replace(source,0,source.length(),beginBdms01CltrlTypeCd,BDMS_01_CLTRL_TYPE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01CltrlTypeCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01CltrlTypeCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01CltrlTypeCd,BDMS_01_CLTRL_TYPE_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01CltrlTypeCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CltrlTypeCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CltrlTypeCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01PutFreqCd
	 *	@return bdms01PutFreqCd
	 */
   public char[] getBdms01PutFreqCd() throws CFException{
     if (isBdms01PutFreqCdModified()) { 
        bdms01PutFreqCd = refreshBdms01PutFreqCd();
     }
   		return bdms01PutFreqCd;
   }

  
	/**
	*  set variable bdms01PutFreqCd
	*  Corresponding COBOL Variable is BDMS01-PUT-FREQ-CD
	*  @param value
	**/
   public void setBdms01PutFreqCd(char[] value) {
      bdms01PutFreqCd = checkBdms01PutFreqCdConstraints(value);
      serializeBdms01PutFreqCd(bdms01PutFreqCd);
   } 

     /**
	 * 	Update Bdms01PutFreqCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PutFreqCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01PutFreqCd,bdms01PutFreqCd.length);
   	
   }
   
   public void setBdms01PutFreqCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PutFreqCd,bdms01PutFreqCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01PutFreqCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PutFreqCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PutFreqCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01PutFreqCd with another Field
	 *	@param value
	 */
   public void setBdms01PutFreqCd(Field source) {
       replace(source,0,source.length(),beginBdms01PutFreqCd,BDMS_01_PUT_FREQ_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01PutFreqCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PutFreqCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01PutFreqCd,BDMS_01_PUT_FREQ_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01PutFreqCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PutFreqCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PutFreqCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01MtrtyTypeCd
	 *	@return bdms01MtrtyTypeCd
	 */
   public char[] getBdms01MtrtyTypeCd() throws CFException{
     if (isBdms01MtrtyTypeCdModified()) { 
        bdms01MtrtyTypeCd = refreshBdms01MtrtyTypeCd();
     }
   		return bdms01MtrtyTypeCd;
   }

  
	/**
	*  set variable bdms01MtrtyTypeCd
	*  Corresponding COBOL Variable is BDMS01-MTRTY-TYPE-CD
	*  @param value
	**/
   public void setBdms01MtrtyTypeCd(char[] value) {
      bdms01MtrtyTypeCd = checkBdms01MtrtyTypeCdConstraints(value);
      serializeBdms01MtrtyTypeCd(bdms01MtrtyTypeCd);
   } 

     /**
	 * 	Update Bdms01MtrtyTypeCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01MtrtyTypeCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01MtrtyTypeCd,bdms01MtrtyTypeCd.length);
   	
   }
   
   public void setBdms01MtrtyTypeCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MtrtyTypeCd,bdms01MtrtyTypeCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01MtrtyTypeCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01MtrtyTypeCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MtrtyTypeCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01MtrtyTypeCd with another Field
	 *	@param value
	 */
   public void setBdms01MtrtyTypeCd(Field source) {
       replace(source,0,source.length(),beginBdms01MtrtyTypeCd,BDMS_01_MTRTY_TYPE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01MtrtyTypeCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01MtrtyTypeCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01MtrtyTypeCd,BDMS_01_MTRTY_TYPE_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01MtrtyTypeCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01MtrtyTypeCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MtrtyTypeCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01LnkdCd
	 *	@return bdms01LnkdCd
	 */
   public char[] getBdms01LnkdCd() throws CFException{
     if (isBdms01LnkdCdModified()) { 
        bdms01LnkdCd = refreshBdms01LnkdCd();
     }
   		return bdms01LnkdCd;
   }

  
	/**
	*  set variable bdms01LnkdCd
	*  Corresponding COBOL Variable is BDMS01-LNKD-CD
	*  @param value
	**/
   public void setBdms01LnkdCd(char[] value) {
      bdms01LnkdCd = checkBdms01LnkdCdConstraints(value);
      serializeBdms01LnkdCd(bdms01LnkdCd);
   } 

     /**
	 * 	Update Bdms01LnkdCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01LnkdCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01LnkdCd,bdms01LnkdCd.length);
   	
   }
   
   public void setBdms01LnkdCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01LnkdCd,bdms01LnkdCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01LnkdCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01LnkdCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01LnkdCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01LnkdCd with another Field
	 *	@param value
	 */
   public void setBdms01LnkdCd(Field source) {
       replace(source,0,source.length(),beginBdms01LnkdCd,BDMS_01_LNKD_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01LnkdCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01LnkdCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01LnkdCd,BDMS_01_LNKD_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01LnkdCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01LnkdCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01LnkdCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01ActnRtInd
	 *	@return bdms01ActnRtInd
	 */
   public char[] getBdms01ActnRtInd() throws CFException{
     if (isBdms01ActnRtIndModified()) { 
        bdms01ActnRtInd = refreshBdms01ActnRtInd();
     }
   		return bdms01ActnRtInd;
   }

  
	/**
	*  set variable bdms01ActnRtInd
	*  Corresponding COBOL Variable is BDMS01-ACTN-RT-IND
	*  @param value
	**/
   public void setBdms01ActnRtInd(char[] value) {
      bdms01ActnRtInd = checkBdms01ActnRtIndConstraints(value);
      serializeBdms01ActnRtInd(bdms01ActnRtInd);
   } 

     /**
	 * 	Update Bdms01ActnRtInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01ActnRtInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01ActnRtInd,bdms01ActnRtInd.length);
   	
   }
   
   public void setBdms01ActnRtInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ActnRtInd,bdms01ActnRtInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01ActnRtInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ActnRtInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ActnRtInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01ActnRtInd with another Field
	 *	@param value
	 */
   public void setBdms01ActnRtInd(Field source) {
       replace(source,0,source.length(),beginBdms01ActnRtInd,BDMS_01_ACTN_RT_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01ActnRtInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01ActnRtInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01ActnRtInd,BDMS_01_ACTN_RT_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01ActnRtInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ActnRtInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ActnRtInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01FrstVrblRstDt
	 *	@return bdms01FrstVrblRstDt
	 */
   public char[] getBdms01FrstVrblRstDt() throws CFException{
     if (isBdms01FrstVrblRstDtModified()) { 
        bdms01FrstVrblRstDt = refreshBdms01FrstVrblRstDt();
     }
   		return bdms01FrstVrblRstDt;
   }

  
	/**
	*  set variable bdms01FrstVrblRstDt
	*  Corresponding COBOL Variable is BDMS01-FRST-VRBL-RST-DT
	*  @param value
	**/
   public void setBdms01FrstVrblRstDt(char[] value) {
      bdms01FrstVrblRstDt = checkBdms01FrstVrblRstDtConstraints(value);
      serializeBdms01FrstVrblRstDt(bdms01FrstVrblRstDt);
   } 

     /**
	 * 	Update Bdms01FrstVrblRstDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01FrstVrblRstDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01FrstVrblRstDt,bdms01FrstVrblRstDt.length);
   	
   }
   
   public void setBdms01FrstVrblRstDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01FrstVrblRstDt,bdms01FrstVrblRstDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01FrstVrblRstDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01FrstVrblRstDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01FrstVrblRstDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01FrstVrblRstDt with another Field
	 *	@param value
	 */
   public void setBdms01FrstVrblRstDt(Field source) {
       replace(source,0,source.length(),beginBdms01FrstVrblRstDt,BDMS_01_FRST_VRBL_RST_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01FrstVrblRstDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01FrstVrblRstDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01FrstVrblRstDt,BDMS_01_FRST_VRBL_RST_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01FrstVrblRstDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01FrstVrblRstDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01FrstVrblRstDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01RstFreqCd
	 *	@return bdms01RstFreqCd
	 */
   public char[] getBdms01RstFreqCd() throws CFException{
     if (isBdms01RstFreqCdModified()) { 
        bdms01RstFreqCd = refreshBdms01RstFreqCd();
     }
   		return bdms01RstFreqCd;
   }

  
	/**
	*  set variable bdms01RstFreqCd
	*  Corresponding COBOL Variable is BDMS01-RST-FREQ-CD
	*  @param value
	**/
   public void setBdms01RstFreqCd(char[] value) {
      bdms01RstFreqCd = checkBdms01RstFreqCdConstraints(value);
      serializeBdms01RstFreqCd(bdms01RstFreqCd);
   } 

     /**
	 * 	Update Bdms01RstFreqCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01RstFreqCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01RstFreqCd,bdms01RstFreqCd.length);
   	
   }
   
   public void setBdms01RstFreqCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RstFreqCd,bdms01RstFreqCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01RstFreqCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RstFreqCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RstFreqCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01RstFreqCd with another Field
	 *	@param value
	 */
   public void setBdms01RstFreqCd(Field source) {
       replace(source,0,source.length(),beginBdms01RstFreqCd,BDMS_01_RST_FREQ_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01RstFreqCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01RstFreqCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01RstFreqCd,BDMS_01_RST_FREQ_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01RstFreqCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RstFreqCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RstFreqCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01Call2TmngCd
	 *	@return bdms01Call2TmngCd
	 */
   public char[] getBdms01Call2TmngCd() throws CFException{
     if (isBdms01Call2TmngCdModified()) { 
        bdms01Call2TmngCd = refreshBdms01Call2TmngCd();
     }
   		return bdms01Call2TmngCd;
   }

  
	/**
	*  set variable bdms01Call2TmngCd
	*  Corresponding COBOL Variable is BDMS01-CALL2-TMNG-CD
	*  @param value
	**/
   public void setBdms01Call2TmngCd(char[] value) {
      bdms01Call2TmngCd = checkBdms01Call2TmngCdConstraints(value);
      serializeBdms01Call2TmngCd(bdms01Call2TmngCd);
   } 

     /**
	 * 	Update Bdms01Call2TmngCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01Call2TmngCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01Call2TmngCd,bdms01Call2TmngCd.length);
   	
   }
   
   public void setBdms01Call2TmngCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Call2TmngCd,bdms01Call2TmngCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01Call2TmngCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Call2TmngCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Call2TmngCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01Call2TmngCd with another Field
	 *	@param value
	 */
   public void setBdms01Call2TmngCd(Field source) {
       replace(source,0,source.length(),beginBdms01Call2TmngCd,BDMS_01_CALL_2_TMNG_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01Call2TmngCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01Call2TmngCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01Call2TmngCd,BDMS_01_CALL_2_TMNG_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01Call2TmngCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Call2TmngCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Call2TmngCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01ExchgPrimeCd
	 *	@return bdms01ExchgPrimeCd
	 */
   public char[] getBdms01ExchgPrimeCd() throws CFException{
     if (isBdms01ExchgPrimeCdModified()) { 
        bdms01ExchgPrimeCd = refreshBdms01ExchgPrimeCd();
     }
   		return bdms01ExchgPrimeCd;
   }

  
	/**
	*  set variable bdms01ExchgPrimeCd
	*  Corresponding COBOL Variable is BDMS01-EXCHG-PRIME-CD
	*  @param value
	**/
   public void setBdms01ExchgPrimeCd(char[] value) {
      bdms01ExchgPrimeCd = checkBdms01ExchgPrimeCdConstraints(value);
      serializeBdms01ExchgPrimeCd(bdms01ExchgPrimeCd);
   } 

     /**
	 * 	Update Bdms01ExchgPrimeCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01ExchgPrimeCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01ExchgPrimeCd,bdms01ExchgPrimeCd.length);
   	
   }
   
   public void setBdms01ExchgPrimeCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ExchgPrimeCd,bdms01ExchgPrimeCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01ExchgPrimeCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ExchgPrimeCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ExchgPrimeCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01ExchgPrimeCd with another Field
	 *	@param value
	 */
   public void setBdms01ExchgPrimeCd(Field source) {
       replace(source,0,source.length(),beginBdms01ExchgPrimeCd,BDMS_01_EXCHG_PRIME_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01ExchgPrimeCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01ExchgPrimeCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01ExchgPrimeCd,BDMS_01_EXCHG_PRIME_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01ExchgPrimeCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ExchgPrimeCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01ExchgPrimeCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01MrktTierCd
	 *	@return bdms01MrktTierCd
	 */
   public char[] getBdms01MrktTierCd() throws CFException{
     if (isBdms01MrktTierCdModified()) { 
        bdms01MrktTierCd = refreshBdms01MrktTierCd();
     }
   		return bdms01MrktTierCd;
   }

  
	/**
	*  set variable bdms01MrktTierCd
	*  Corresponding COBOL Variable is BDMS01-MRKT-TIER-CD
	*  @param value
	**/
   public void setBdms01MrktTierCd(char[] value) {
      bdms01MrktTierCd = checkBdms01MrktTierCdConstraints(value);
      serializeBdms01MrktTierCd(bdms01MrktTierCd);
   } 

     /**
	 * 	Update Bdms01MrktTierCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01MrktTierCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01MrktTierCd,bdms01MrktTierCd.length);
   	
   }
   
   public void setBdms01MrktTierCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MrktTierCd,bdms01MrktTierCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01MrktTierCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01MrktTierCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MrktTierCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01MrktTierCd with another Field
	 *	@param value
	 */
   public void setBdms01MrktTierCd(Field source) {
       replace(source,0,source.length(),beginBdms01MrktTierCd,BDMS_01_MRKT_TIER_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01MrktTierCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01MrktTierCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01MrktTierCd,BDMS_01_MRKT_TIER_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01MrktTierCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01MrktTierCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MrktTierCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01MrktIndCd
	 *	@return bdms01MrktIndCd
	 */
   public char[] getBdms01MrktIndCd() throws CFException{
     if (isBdms01MrktIndCdModified()) { 
        bdms01MrktIndCd = refreshBdms01MrktIndCd();
     }
   		return bdms01MrktIndCd;
   }

  
	/**
	*  set variable bdms01MrktIndCd
	*  Corresponding COBOL Variable is BDMS01-MRKT-IND-CD
	*  @param value
	**/
   public void setBdms01MrktIndCd(char[] value) {
      bdms01MrktIndCd = checkBdms01MrktIndCdConstraints(value);
      serializeBdms01MrktIndCd(bdms01MrktIndCd);
   } 

     /**
	 * 	Update Bdms01MrktIndCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01MrktIndCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01MrktIndCd,bdms01MrktIndCd.length);
   	
   }
   
   public void setBdms01MrktIndCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MrktIndCd,bdms01MrktIndCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01MrktIndCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01MrktIndCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MrktIndCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01MrktIndCd with another Field
	 *	@param value
	 */
   public void setBdms01MrktIndCd(Field source) {
       replace(source,0,source.length(),beginBdms01MrktIndCd,BDMS_01_MRKT_IND_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01MrktIndCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01MrktIndCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01MrktIndCd,BDMS_01_MRKT_IND_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01MrktIndCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01MrktIndCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01MrktIndCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01NewTraceInd
	 *	@return bdms01NewTraceInd
	 */
   public char[] getBdms01NewTraceInd() throws CFException{
     if (isBdms01NewTraceIndModified()) { 
        bdms01NewTraceInd = refreshBdms01NewTraceInd();
     }
   		return bdms01NewTraceInd;
   }

  
	/**
	*  set variable bdms01NewTraceInd
	*  Corresponding COBOL Variable is BDMS01-NEW-TRACE-IND
	*  @param value
	**/
   public void setBdms01NewTraceInd(char[] value) {
      bdms01NewTraceInd = checkBdms01NewTraceIndConstraints(value);
      serializeBdms01NewTraceInd(bdms01NewTraceInd);
   } 

     /**
	 * 	Update Bdms01NewTraceInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01NewTraceInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01NewTraceInd,bdms01NewTraceInd.length);
   	
   }
   
   public void setBdms01NewTraceInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01NewTraceInd,bdms01NewTraceInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01NewTraceInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01NewTraceInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01NewTraceInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01NewTraceInd with another Field
	 *	@param value
	 */
   public void setBdms01NewTraceInd(Field source) {
       replace(source,0,source.length(),beginBdms01NewTraceInd,BDMS_01_NEW_TRACE_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01NewTraceInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01NewTraceInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01NewTraceInd,BDMS_01_NEW_TRACE_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01NewTraceInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01NewTraceInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01NewTraceInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01QuickCd
	 *	@return bdms01QuickCd
	 */
   public char[] getBdms01QuickCd() throws CFException{
     if (isBdms01QuickCdModified()) { 
        bdms01QuickCd = refreshBdms01QuickCd();
     }
   		return bdms01QuickCd;
   }

  
	/**
	*  set variable bdms01QuickCd
	*  Corresponding COBOL Variable is BDMS01-QUICK-CD
	*  @param value
	**/
   public void setBdms01QuickCd(char[] value) {
      bdms01QuickCd = checkBdms01QuickCdConstraints(value);
      serializeBdms01QuickCd(bdms01QuickCd);
   } 

     /**
	 * 	Update Bdms01QuickCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01QuickCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01QuickCd,bdms01QuickCd.length);
   	
   }
   
   public void setBdms01QuickCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01QuickCd,bdms01QuickCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01QuickCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01QuickCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01QuickCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01QuickCd with another Field
	 *	@param value
	 */
   public void setBdms01QuickCd(Field source) {
       replace(source,0,source.length(),beginBdms01QuickCd,BDMS_01_QUICK_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01QuickCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01QuickCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01QuickCd,BDMS_01_QUICK_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01QuickCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01QuickCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01QuickCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01LseMrktCd
	 *	@return bdms01LseMrktCd
	 */
   public char[] getBdms01LseMrktCd() throws CFException{
     if (isBdms01LseMrktCdModified()) { 
        bdms01LseMrktCd = refreshBdms01LseMrktCd();
     }
   		return bdms01LseMrktCd;
   }

  
	/**
	*  set variable bdms01LseMrktCd
	*  Corresponding COBOL Variable is BDMS01-LSE-MRKT-CD
	*  @param value
	**/
   public void setBdms01LseMrktCd(char[] value) {
      bdms01LseMrktCd = checkBdms01LseMrktCdConstraints(value);
      serializeBdms01LseMrktCd(bdms01LseMrktCd);
   } 

     /**
	 * 	Update Bdms01LseMrktCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01LseMrktCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01LseMrktCd,bdms01LseMrktCd.length);
   	
   }
   
   public void setBdms01LseMrktCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01LseMrktCd,bdms01LseMrktCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01LseMrktCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01LseMrktCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01LseMrktCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01LseMrktCd with another Field
	 *	@param value
	 */
   public void setBdms01LseMrktCd(Field source) {
       replace(source,0,source.length(),beginBdms01LseMrktCd,BDMS_01_LSE_MRKT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01LseMrktCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01LseMrktCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01LseMrktCd,BDMS_01_LSE_MRKT_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01LseMrktCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01LseMrktCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01LseMrktCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01IsinChngInd
	 *	@return bdms01IsinChngInd
	 */
   public char[] getBdms01IsinChngInd() throws CFException{
     if (isBdms01IsinChngIndModified()) { 
        bdms01IsinChngInd = refreshBdms01IsinChngInd();
     }
   		return bdms01IsinChngInd;
   }

  
	/**
	*  set variable bdms01IsinChngInd
	*  Corresponding COBOL Variable is BDMS01-ISIN-CHNG-IND
	*  @param value
	**/
   public void setBdms01IsinChngInd(char[] value) {
      bdms01IsinChngInd = checkBdms01IsinChngIndConstraints(value);
      serializeBdms01IsinChngInd(bdms01IsinChngInd);
   } 

     /**
	 * 	Update Bdms01IsinChngInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01IsinChngInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01IsinChngInd,bdms01IsinChngInd.length);
   	
   }
   
   public void setBdms01IsinChngInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01IsinChngInd,bdms01IsinChngInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01IsinChngInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01IsinChngInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01IsinChngInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01IsinChngInd with another Field
	 *	@param value
	 */
   public void setBdms01IsinChngInd(Field source) {
       replace(source,0,source.length(),beginBdms01IsinChngInd,BDMS_01_ISIN_CHNG_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01IsinChngInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01IsinChngInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01IsinChngInd,BDMS_01_ISIN_CHNG_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01IsinChngInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01IsinChngInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01IsinChngInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01StkIssueSttsCd
	 *	@return bdms01StkIssueSttsCd
	 */
   public char[] getBdms01StkIssueSttsCd() throws CFException{
     if (isBdms01StkIssueSttsCdModified()) { 
        bdms01StkIssueSttsCd = refreshBdms01StkIssueSttsCd();
     }
   		return bdms01StkIssueSttsCd;
   }

  
	/**
	*  set variable bdms01StkIssueSttsCd
	*  Corresponding COBOL Variable is BDMS01-STK-ISSUE-STTS-CD
	*  @param value
	**/
   public void setBdms01StkIssueSttsCd(char[] value) {
      bdms01StkIssueSttsCd = checkBdms01StkIssueSttsCdConstraints(value);
      serializeBdms01StkIssueSttsCd(bdms01StkIssueSttsCd);
   } 

     /**
	 * 	Update Bdms01StkIssueSttsCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01StkIssueSttsCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01StkIssueSttsCd,bdms01StkIssueSttsCd.length);
   	
   }
   
   public void setBdms01StkIssueSttsCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01StkIssueSttsCd,bdms01StkIssueSttsCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01StkIssueSttsCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01StkIssueSttsCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01StkIssueSttsCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01StkIssueSttsCd with another Field
	 *	@param value
	 */
   public void setBdms01StkIssueSttsCd(Field source) {
       replace(source,0,source.length(),beginBdms01StkIssueSttsCd,BDMS_01_STK_ISSUE_STTS_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01StkIssueSttsCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01StkIssueSttsCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01StkIssueSttsCd,BDMS_01_STK_ISSUE_STTS_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01StkIssueSttsCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01StkIssueSttsCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01StkIssueSttsCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01IssrTypeCd
	 *	@return bdms01IssrTypeCd
	 */
   public char[] getBdms01IssrTypeCd() throws CFException{
     if (isBdms01IssrTypeCdModified()) { 
        bdms01IssrTypeCd = refreshBdms01IssrTypeCd();
     }
   		return bdms01IssrTypeCd;
   }

  
	/**
	*  set variable bdms01IssrTypeCd
	*  Corresponding COBOL Variable is BDMS01-ISSR-TYPE-CD
	*  @param value
	**/
   public void setBdms01IssrTypeCd(char[] value) {
      bdms01IssrTypeCd = checkBdms01IssrTypeCdConstraints(value);
      serializeBdms01IssrTypeCd(bdms01IssrTypeCd);
   } 

     /**
	 * 	Update Bdms01IssrTypeCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01IssrTypeCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01IssrTypeCd,bdms01IssrTypeCd.length);
   	
   }
   
   public void setBdms01IssrTypeCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01IssrTypeCd,bdms01IssrTypeCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01IssrTypeCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01IssrTypeCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01IssrTypeCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01IssrTypeCd with another Field
	 *	@param value
	 */
   public void setBdms01IssrTypeCd(Field source) {
       replace(source,0,source.length(),beginBdms01IssrTypeCd,BDMS_01_ISSR_TYPE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01IssrTypeCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01IssrTypeCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01IssrTypeCd,BDMS_01_ISSR_TYPE_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01IssrTypeCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01IssrTypeCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01IssrTypeCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01TraceSymblTxt
	 *	@return bdms01TraceSymblTxt
	 */
   public char[] getBdms01TraceSymblTxt() throws CFException{
     if (isBdms01TraceSymblTxtModified()) { 
        bdms01TraceSymblTxt = refreshBdms01TraceSymblTxt();
     }
   		return bdms01TraceSymblTxt;
   }

  
	/**
	*  set variable bdms01TraceSymblTxt
	*  Corresponding COBOL Variable is BDMS01-TRACE-SYMBL-TXT
	*  @param value
	**/
   public void setBdms01TraceSymblTxt(char[] value) {
      bdms01TraceSymblTxt = checkBdms01TraceSymblTxtConstraints(value);
      serializeBdms01TraceSymblTxt(bdms01TraceSymblTxt);
   } 

     /**
	 * 	Update Bdms01TraceSymblTxt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01TraceSymblTxt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01TraceSymblTxt,bdms01TraceSymblTxt.length);
   	
   }
   
   public void setBdms01TraceSymblTxt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TraceSymblTxt,bdms01TraceSymblTxt.length);
   	
   }
   
     /**
	 * 	Update Bdms01TraceSymblTxt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TraceSymblTxt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TraceSymblTxt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01TraceSymblTxt with another Field
	 *	@param value
	 */
   public void setBdms01TraceSymblTxt(Field source) {
       replace(source,0,source.length(),beginBdms01TraceSymblTxt,BDMS_01_TRACE_SYMBL_TXT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01TraceSymblTxt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01TraceSymblTxt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01TraceSymblTxt,BDMS_01_TRACE_SYMBL_TXT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01TraceSymblTxt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TraceSymblTxt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TraceSymblTxt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01RegsInd
	 *	@return bdms01RegsInd
	 */
   public char[] getBdms01RegsInd() throws CFException{
     if (isBdms01RegsIndModified()) { 
        bdms01RegsInd = refreshBdms01RegsInd();
     }
   		return bdms01RegsInd;
   }

  
	/**
	*  set variable bdms01RegsInd
	*  Corresponding COBOL Variable is BDMS01-REGS-IND
	*  @param value
	**/
   public void setBdms01RegsInd(char[] value) {
      bdms01RegsInd = checkBdms01RegsIndConstraints(value);
      serializeBdms01RegsInd(bdms01RegsInd);
   } 

     /**
	 * 	Update Bdms01RegsInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01RegsInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01RegsInd,bdms01RegsInd.length);
   	
   }
   
   public void setBdms01RegsInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RegsInd,bdms01RegsInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01RegsInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RegsInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RegsInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01RegsInd with another Field
	 *	@param value
	 */
   public void setBdms01RegsInd(Field source) {
       replace(source,0,source.length(),beginBdms01RegsInd,BDMS_01_REGS_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01RegsInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01RegsInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01RegsInd,BDMS_01_REGS_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01RegsInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RegsInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RegsInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01PpnCd
	 *	@return bdms01PpnCd
	 */
   public char[] getBdms01PpnCd() throws CFException{
     if (isBdms01PpnCdModified()) { 
        bdms01PpnCd = refreshBdms01PpnCd();
     }
   		return bdms01PpnCd;
   }

  
	/**
	*  set variable bdms01PpnCd
	*  Corresponding COBOL Variable is BDMS01-PPN-CD
	*  @param value
	**/
   public void setBdms01PpnCd(char[] value) {
      bdms01PpnCd = checkBdms01PpnCdConstraints(value);
      serializeBdms01PpnCd(bdms01PpnCd);
   } 

     /**
	 * 	Update Bdms01PpnCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PpnCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01PpnCd,bdms01PpnCd.length);
   	
   }
   
   public void setBdms01PpnCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PpnCd,bdms01PpnCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01PpnCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PpnCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PpnCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01PpnCd with another Field
	 *	@param value
	 */
   public void setBdms01PpnCd(Field source) {
       replace(source,0,source.length(),beginBdms01PpnCd,BDMS_01_PPN_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01PpnCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PpnCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01PpnCd,BDMS_01_PPN_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01PpnCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PpnCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PpnCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01PpnInd
	 *	@return bdms01PpnInd
	 */
   public char[] getBdms01PpnInd() throws CFException{
     if (isBdms01PpnIndModified()) { 
        bdms01PpnInd = refreshBdms01PpnInd();
     }
   		return bdms01PpnInd;
   }

  
	/**
	*  set variable bdms01PpnInd
	*  Corresponding COBOL Variable is BDMS01-PPN-IND
	*  @param value
	**/
   public void setBdms01PpnInd(char[] value) {
      bdms01PpnInd = checkBdms01PpnIndConstraints(value);
      serializeBdms01PpnInd(bdms01PpnInd);
   } 

     /**
	 * 	Update Bdms01PpnInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PpnInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01PpnInd,bdms01PpnInd.length);
   	
   }
   
   public void setBdms01PpnInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PpnInd,bdms01PpnInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01PpnInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PpnInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PpnInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01PpnInd with another Field
	 *	@param value
	 */
   public void setBdms01PpnInd(Field source) {
       replace(source,0,source.length(),beginBdms01PpnInd,BDMS_01_PPN_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01PpnInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PpnInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01PpnInd,BDMS_01_PPN_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01PpnInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PpnInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PpnInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01DtcUnrtdMoodyCd
	 *	@return bdms01DtcUnrtdMoodyCd
	 */
   public char[] getBdms01DtcUnrtdMoodyCd() throws CFException{
     if (isBdms01DtcUnrtdMoodyCdModified()) { 
        bdms01DtcUnrtdMoodyCd = refreshBdms01DtcUnrtdMoodyCd();
     }
   		return bdms01DtcUnrtdMoodyCd;
   }

  
	/**
	*  set variable bdms01DtcUnrtdMoodyCd
	*  Corresponding COBOL Variable is BDMS01-DTC-UNRTD-MOODY-CD
	*  @param value
	**/
   public void setBdms01DtcUnrtdMoodyCd(char[] value) {
      bdms01DtcUnrtdMoodyCd = checkBdms01DtcUnrtdMoodyCdConstraints(value);
      serializeBdms01DtcUnrtdMoodyCd(bdms01DtcUnrtdMoodyCd);
   } 

     /**
	 * 	Update Bdms01DtcUnrtdMoodyCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01DtcUnrtdMoodyCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01DtcUnrtdMoodyCd,bdms01DtcUnrtdMoodyCd.length);
   	
   }
   
   public void setBdms01DtcUnrtdMoodyCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01DtcUnrtdMoodyCd,bdms01DtcUnrtdMoodyCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01DtcUnrtdMoodyCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01DtcUnrtdMoodyCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01DtcUnrtdMoodyCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01DtcUnrtdMoodyCd with another Field
	 *	@param value
	 */
   public void setBdms01DtcUnrtdMoodyCd(Field source) {
       replace(source,0,source.length(),beginBdms01DtcUnrtdMoodyCd,BDMS_01_DTC_UNRTD_MOODY_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01DtcUnrtdMoodyCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01DtcUnrtdMoodyCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01DtcUnrtdMoodyCd,BDMS_01_DTC_UNRTD_MOODY_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01DtcUnrtdMoodyCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01DtcUnrtdMoodyCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01DtcUnrtdMoodyCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01DtcUnrtdSpCd
	 *	@return bdms01DtcUnrtdSpCd
	 */
   public char[] getBdms01DtcUnrtdSpCd() throws CFException{
     if (isBdms01DtcUnrtdSpCdModified()) { 
        bdms01DtcUnrtdSpCd = refreshBdms01DtcUnrtdSpCd();
     }
   		return bdms01DtcUnrtdSpCd;
   }

  
	/**
	*  set variable bdms01DtcUnrtdSpCd
	*  Corresponding COBOL Variable is BDMS01-DTC-UNRTD-SP-CD
	*  @param value
	**/
   public void setBdms01DtcUnrtdSpCd(char[] value) {
      bdms01DtcUnrtdSpCd = checkBdms01DtcUnrtdSpCdConstraints(value);
      serializeBdms01DtcUnrtdSpCd(bdms01DtcUnrtdSpCd);
   } 

     /**
	 * 	Update Bdms01DtcUnrtdSpCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01DtcUnrtdSpCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01DtcUnrtdSpCd,bdms01DtcUnrtdSpCd.length);
   	
   }
   
   public void setBdms01DtcUnrtdSpCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01DtcUnrtdSpCd,bdms01DtcUnrtdSpCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01DtcUnrtdSpCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01DtcUnrtdSpCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01DtcUnrtdSpCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01DtcUnrtdSpCd with another Field
	 *	@param value
	 */
   public void setBdms01DtcUnrtdSpCd(Field source) {
       replace(source,0,source.length(),beginBdms01DtcUnrtdSpCd,BDMS_01_DTC_UNRTD_SP_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01DtcUnrtdSpCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01DtcUnrtdSpCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01DtcUnrtdSpCd,BDMS_01_DTC_UNRTD_SP_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01DtcUnrtdSpCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01DtcUnrtdSpCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01DtcUnrtdSpCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01TirsSecTypeCd
	 *	@return bdms01TirsSecTypeCd
	 */
   public char[] getBdms01TirsSecTypeCd() throws CFException{
     if (isBdms01TirsSecTypeCdModified()) { 
        bdms01TirsSecTypeCd = refreshBdms01TirsSecTypeCd();
     }
   		return bdms01TirsSecTypeCd;
   }

  
	/**
	*  set variable bdms01TirsSecTypeCd
	*  Corresponding COBOL Variable is BDMS01-TIRS-SEC-TYPE-CD
	*  @param value
	**/
   public void setBdms01TirsSecTypeCd(char[] value) {
      bdms01TirsSecTypeCd = checkBdms01TirsSecTypeCdConstraints(value);
      serializeBdms01TirsSecTypeCd(bdms01TirsSecTypeCd);
   } 

     /**
	 * 	Update Bdms01TirsSecTypeCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01TirsSecTypeCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01TirsSecTypeCd,bdms01TirsSecTypeCd.length);
   	
   }
   
   public void setBdms01TirsSecTypeCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TirsSecTypeCd,bdms01TirsSecTypeCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01TirsSecTypeCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TirsSecTypeCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TirsSecTypeCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01TirsSecTypeCd with another Field
	 *	@param value
	 */
   public void setBdms01TirsSecTypeCd(Field source) {
       replace(source,0,source.length(),beginBdms01TirsSecTypeCd,BDMS_01_TIRS_SEC_TYPE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01TirsSecTypeCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01TirsSecTypeCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01TirsSecTypeCd,BDMS_01_TIRS_SEC_TYPE_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01TirsSecTypeCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01TirsSecTypeCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01TirsSecTypeCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01SifmaSmgInd
	 *	@return bdms01SifmaSmgInd
	 */
   public char[] getBdms01SifmaSmgInd() throws CFException{
     if (isBdms01SifmaSmgIndModified()) { 
        bdms01SifmaSmgInd = refreshBdms01SifmaSmgInd();
     }
   		return bdms01SifmaSmgInd;
   }

  
	/**
	*  set variable bdms01SifmaSmgInd
	*  Corresponding COBOL Variable is BDMS01-SIFMA-SMG-IND
	*  @param value
	**/
   public void setBdms01SifmaSmgInd(char[] value) {
      bdms01SifmaSmgInd = checkBdms01SifmaSmgIndConstraints(value);
      serializeBdms01SifmaSmgInd(bdms01SifmaSmgInd);
   } 

     /**
	 * 	Update Bdms01SifmaSmgInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01SifmaSmgInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01SifmaSmgInd,bdms01SifmaSmgInd.length);
   	
   }
   
   public void setBdms01SifmaSmgInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SifmaSmgInd,bdms01SifmaSmgInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01SifmaSmgInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SifmaSmgInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SifmaSmgInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01SifmaSmgInd with another Field
	 *	@param value
	 */
   public void setBdms01SifmaSmgInd(Field source) {
       replace(source,0,source.length(),beginBdms01SifmaSmgInd,BDMS_01_SIFMA_SMG_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01SifmaSmgInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01SifmaSmgInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01SifmaSmgInd,BDMS_01_SIFMA_SMG_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01SifmaSmgInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SifmaSmgInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SifmaSmgInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01CalledAncmtCd
	 *	@return bdms01CalledAncmtCd
	 */
   public char[] getBdms01CalledAncmtCd() throws CFException{
     if (isBdms01CalledAncmtCdModified()) { 
        bdms01CalledAncmtCd = refreshBdms01CalledAncmtCd();
     }
   		return bdms01CalledAncmtCd;
   }

  
	/**
	*  set variable bdms01CalledAncmtCd
	*  Corresponding COBOL Variable is BDMS01-CALLED-ANCMT-CD
	*  @param value
	**/
   public void setBdms01CalledAncmtCd(char[] value) {
      bdms01CalledAncmtCd = checkBdms01CalledAncmtCdConstraints(value);
      serializeBdms01CalledAncmtCd(bdms01CalledAncmtCd);
   } 

     /**
	 * 	Update Bdms01CalledAncmtCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01CalledAncmtCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01CalledAncmtCd,bdms01CalledAncmtCd.length);
   	
   }
   
   public void setBdms01CalledAncmtCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CalledAncmtCd,bdms01CalledAncmtCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01CalledAncmtCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CalledAncmtCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CalledAncmtCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01CalledAncmtCd with another Field
	 *	@param value
	 */
   public void setBdms01CalledAncmtCd(Field source) {
       replace(source,0,source.length(),beginBdms01CalledAncmtCd,BDMS_01_CALLED_ANCMT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01CalledAncmtCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01CalledAncmtCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01CalledAncmtCd,BDMS_01_CALLED_ANCMT_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01CalledAncmtCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CalledAncmtCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CalledAncmtCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01PrtlRdmptSchdCd
	 *	@return bdms01PrtlRdmptSchdCd
	 */
   public char[] getBdms01PrtlRdmptSchdCd() throws CFException{
     if (isBdms01PrtlRdmptSchdCdModified()) { 
        bdms01PrtlRdmptSchdCd = refreshBdms01PrtlRdmptSchdCd();
     }
   		return bdms01PrtlRdmptSchdCd;
   }

  
	/**
	*  set variable bdms01PrtlRdmptSchdCd
	*  Corresponding COBOL Variable is BDMS01-PRTL-RDMPT-SCHD-CD
	*  @param value
	**/
   public void setBdms01PrtlRdmptSchdCd(char[] value) {
      bdms01PrtlRdmptSchdCd = checkBdms01PrtlRdmptSchdCdConstraints(value);
      serializeBdms01PrtlRdmptSchdCd(bdms01PrtlRdmptSchdCd);
   } 

     /**
	 * 	Update Bdms01PrtlRdmptSchdCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PrtlRdmptSchdCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01PrtlRdmptSchdCd,bdms01PrtlRdmptSchdCd.length);
   	
   }
   
   public void setBdms01PrtlRdmptSchdCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PrtlRdmptSchdCd,bdms01PrtlRdmptSchdCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01PrtlRdmptSchdCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PrtlRdmptSchdCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PrtlRdmptSchdCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01PrtlRdmptSchdCd with another Field
	 *	@param value
	 */
   public void setBdms01PrtlRdmptSchdCd(Field source) {
       replace(source,0,source.length(),beginBdms01PrtlRdmptSchdCd,BDMS_01_PRTL_RDMPT_SCHD_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01PrtlRdmptSchdCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PrtlRdmptSchdCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01PrtlRdmptSchdCd,BDMS_01_PRTL_RDMPT_SCHD_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01PrtlRdmptSchdCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PrtlRdmptSchdCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PrtlRdmptSchdCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01FdrlTaxSttsCd
	 *	@return bdms01FdrlTaxSttsCd
	 */
   public char[] getBdms01FdrlTaxSttsCd() throws CFException{
     if (isBdms01FdrlTaxSttsCdModified()) { 
        bdms01FdrlTaxSttsCd = refreshBdms01FdrlTaxSttsCd();
     }
   		return bdms01FdrlTaxSttsCd;
   }

  
	/**
	*  set variable bdms01FdrlTaxSttsCd
	*  Corresponding COBOL Variable is BDMS01-FDRL-TAX-STTS-CD
	*  @param value
	**/
   public void setBdms01FdrlTaxSttsCd(char[] value) {
      bdms01FdrlTaxSttsCd = checkBdms01FdrlTaxSttsCdConstraints(value);
      serializeBdms01FdrlTaxSttsCd(bdms01FdrlTaxSttsCd);
   } 

     /**
	 * 	Update Bdms01FdrlTaxSttsCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01FdrlTaxSttsCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01FdrlTaxSttsCd,bdms01FdrlTaxSttsCd.length);
   	
   }
   
   public void setBdms01FdrlTaxSttsCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01FdrlTaxSttsCd,bdms01FdrlTaxSttsCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01FdrlTaxSttsCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01FdrlTaxSttsCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01FdrlTaxSttsCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01FdrlTaxSttsCd with another Field
	 *	@param value
	 */
   public void setBdms01FdrlTaxSttsCd(Field source) {
       replace(source,0,source.length(),beginBdms01FdrlTaxSttsCd,BDMS_01_FDRL_TAX_STTS_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01FdrlTaxSttsCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01FdrlTaxSttsCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01FdrlTaxSttsCd,BDMS_01_FDRL_TAX_STTS_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01FdrlTaxSttsCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01FdrlTaxSttsCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01FdrlTaxSttsCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01CntngTaxCd
	 *	@return bdms01CntngTaxCd
	 */
   public char[] getBdms01CntngTaxCd() throws CFException{
     if (isBdms01CntngTaxCdModified()) { 
        bdms01CntngTaxCd = refreshBdms01CntngTaxCd();
     }
   		return bdms01CntngTaxCd;
   }

  
	/**
	*  set variable bdms01CntngTaxCd
	*  Corresponding COBOL Variable is BDMS01-CNTNG-TAX-CD
	*  @param value
	**/
   public void setBdms01CntngTaxCd(char[] value) {
      bdms01CntngTaxCd = checkBdms01CntngTaxCdConstraints(value);
      serializeBdms01CntngTaxCd(bdms01CntngTaxCd);
   } 

     /**
	 * 	Update Bdms01CntngTaxCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01CntngTaxCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01CntngTaxCd,bdms01CntngTaxCd.length);
   	
   }
   
   public void setBdms01CntngTaxCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CntngTaxCd,bdms01CntngTaxCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01CntngTaxCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CntngTaxCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CntngTaxCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01CntngTaxCd with another Field
	 *	@param value
	 */
   public void setBdms01CntngTaxCd(Field source) {
       replace(source,0,source.length(),beginBdms01CntngTaxCd,BDMS_01_CNTNG_TAX_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01CntngTaxCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01CntngTaxCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01CntngTaxCd,BDMS_01_CNTNG_TAX_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01CntngTaxCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CntngTaxCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CntngTaxCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01CntngYldRt
	 *	@return bdms01CntngYldRt
	 */
	public BigDecimal getBdms01CntngYldRt() throws CFException {
       if (isBdms01CntngYldRtModified()) { 
           bdms01CntngYldRt = refreshBdms01CntngYldRt();
        }
   		return bdms01CntngYldRt;
	}
	

	
	   
	/**
	 * 	Update Bdms01CntngYldRt with the passed number
	 *  Corresponding COBOL Variable is BDMS01-CNTNG-YLD-RT
	 *	@param number
	 */
	public void setBdms01CntngYldRt(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       bdms01CntngYldRt = checkBdms01CntngYldRtMaxLimit(number);
	    serializeBdms01CntngYldRt(bdms01CntngYldRt);
   }
	/**
	 * 	Update Bdms01CntngYldRt with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01CntngYldRt(char[] value) throws CFException {
		 bdms01CntngYldRt = serializeBdms01CntngYldRt(value);
	}   
	/**
	 *	Returns the value of bdms01SecTypeCd
	 *	@return bdms01SecTypeCd
	 */
   public char[] getBdms01SecTypeCd() throws CFException{
     if (isBdms01SecTypeCdModified()) { 
        bdms01SecTypeCd = refreshBdms01SecTypeCd();
     }
   		return bdms01SecTypeCd;
   }

  
	/**
	*  set variable bdms01SecTypeCd
	*  Corresponding COBOL Variable is BDMS01-SEC-TYPE-CD
	*  @param value
	**/
   public void setBdms01SecTypeCd(char[] value) {
      bdms01SecTypeCd = checkBdms01SecTypeCdConstraints(value);
      serializeBdms01SecTypeCd(bdms01SecTypeCd);
   } 

     /**
	 * 	Update Bdms01SecTypeCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01SecTypeCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01SecTypeCd,bdms01SecTypeCd.length);
   	
   }
   
   public void setBdms01SecTypeCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SecTypeCd,bdms01SecTypeCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01SecTypeCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SecTypeCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SecTypeCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01SecTypeCd with another Field
	 *	@param value
	 */
   public void setBdms01SecTypeCd(Field source) {
       replace(source,0,source.length(),beginBdms01SecTypeCd,BDMS_01_SEC_TYPE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01SecTypeCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01SecTypeCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01SecTypeCd,BDMS_01_SEC_TYPE_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01SecTypeCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SecTypeCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01SecTypeCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01CltrlIssCd
	 *	@return bdms01CltrlIssCd
	 */
   public char[] getBdms01CltrlIssCd() throws CFException{
     if (isBdms01CltrlIssCdModified()) { 
        bdms01CltrlIssCd = refreshBdms01CltrlIssCd();
     }
   		return bdms01CltrlIssCd;
   }

  
	/**
	*  set variable bdms01CltrlIssCd
	*  Corresponding COBOL Variable is BDMS01-CLTRL-ISS-CD
	*  @param value
	**/
   public void setBdms01CltrlIssCd(char[] value) {
      bdms01CltrlIssCd = checkBdms01CltrlIssCdConstraints(value);
      serializeBdms01CltrlIssCd(bdms01CltrlIssCd);
   } 

     /**
	 * 	Update Bdms01CltrlIssCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01CltrlIssCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01CltrlIssCd,bdms01CltrlIssCd.length);
   	
   }
   
   public void setBdms01CltrlIssCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CltrlIssCd,bdms01CltrlIssCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01CltrlIssCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CltrlIssCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CltrlIssCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01CltrlIssCd with another Field
	 *	@param value
	 */
   public void setBdms01CltrlIssCd(Field source) {
       replace(source,0,source.length(),beginBdms01CltrlIssCd,BDMS_01_CLTRL_ISS_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01CltrlIssCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01CltrlIssCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01CltrlIssCd,BDMS_01_CLTRL_ISS_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01CltrlIssCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CltrlIssCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CltrlIssCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01RangeInd
	 *	@return bdms01RangeInd
	 */
   public char[] getBdms01RangeInd() throws CFException{
     if (isBdms01RangeIndModified()) { 
        bdms01RangeInd = refreshBdms01RangeInd();
     }
   		return bdms01RangeInd;
   }

  
	/**
	*  set variable bdms01RangeInd
	*  Corresponding COBOL Variable is BDMS01-RANGE-IND
	*  @param value
	**/
   public void setBdms01RangeInd(char[] value) {
      bdms01RangeInd = checkBdms01RangeIndConstraints(value);
      serializeBdms01RangeInd(bdms01RangeInd);
   } 

     /**
	 * 	Update Bdms01RangeInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01RangeInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01RangeInd,bdms01RangeInd.length);
   	
   }
   
   public void setBdms01RangeInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RangeInd,bdms01RangeInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01RangeInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RangeInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RangeInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01RangeInd with another Field
	 *	@param value
	 */
   public void setBdms01RangeInd(Field source) {
       replace(source,0,source.length(),beginBdms01RangeInd,BDMS_01_RANGE_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01RangeInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01RangeInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01RangeInd,BDMS_01_RANGE_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01RangeInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RangeInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01RangeInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01B8CntngPymntCd
	 *	@return bdms01B8CntngPymntCd
	 */
   public char[] getBdms01B8CntngPymntCd() throws CFException{
     if (isBdms01B8CntngPymntCdModified()) { 
        bdms01B8CntngPymntCd = refreshBdms01B8CntngPymntCd();
     }
   		return bdms01B8CntngPymntCd;
   }

  
	/**
	*  set variable bdms01B8CntngPymntCd
	*  Corresponding COBOL Variable is BDMS01-B8-CNTNG-PYMNT-CD
	*  @param value
	**/
   public void setBdms01B8CntngPymntCd(char[] value) {
      bdms01B8CntngPymntCd = checkBdms01B8CntngPymntCdConstraints(value);
      serializeBdms01B8CntngPymntCd(bdms01B8CntngPymntCd);
   } 

     /**
	 * 	Update Bdms01B8CntngPymntCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01B8CntngPymntCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01B8CntngPymntCd,bdms01B8CntngPymntCd.length);
   	
   }
   
   public void setBdms01B8CntngPymntCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01B8CntngPymntCd,bdms01B8CntngPymntCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01B8CntngPymntCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01B8CntngPymntCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01B8CntngPymntCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01B8CntngPymntCd with another Field
	 *	@param value
	 */
   public void setBdms01B8CntngPymntCd(Field source) {
       replace(source,0,source.length(),beginBdms01B8CntngPymntCd,BDMS_01_B_8_CNTNG_PYMNT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01B8CntngPymntCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01B8CntngPymntCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01B8CntngPymntCd,BDMS_01_B_8_CNTNG_PYMNT_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01B8CntngPymntCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01B8CntngPymntCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01B8CntngPymntCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01CrntCpnTypeCd
	 *	@return bdms01CrntCpnTypeCd
	 */
   public char[] getBdms01CrntCpnTypeCd() throws CFException{
     if (isBdms01CrntCpnTypeCdModified()) { 
        bdms01CrntCpnTypeCd = refreshBdms01CrntCpnTypeCd();
     }
   		return bdms01CrntCpnTypeCd;
   }

  
	/**
	*  set variable bdms01CrntCpnTypeCd
	*  Corresponding COBOL Variable is BDMS01-CRNT-CPN-TYPE-CD
	*  @param value
	**/
   public void setBdms01CrntCpnTypeCd(char[] value) {
      bdms01CrntCpnTypeCd = checkBdms01CrntCpnTypeCdConstraints(value);
      serializeBdms01CrntCpnTypeCd(bdms01CrntCpnTypeCd);
   } 

     /**
	 * 	Update Bdms01CrntCpnTypeCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01CrntCpnTypeCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01CrntCpnTypeCd,bdms01CrntCpnTypeCd.length);
   	
   }
   
   public void setBdms01CrntCpnTypeCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CrntCpnTypeCd,bdms01CrntCpnTypeCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01CrntCpnTypeCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CrntCpnTypeCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CrntCpnTypeCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01CrntCpnTypeCd with another Field
	 *	@param value
	 */
   public void setBdms01CrntCpnTypeCd(Field source) {
       replace(source,0,source.length(),beginBdms01CrntCpnTypeCd,BDMS_01_CRNT_CPN_TYPE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01CrntCpnTypeCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01CrntCpnTypeCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01CrntCpnTypeCd,BDMS_01_CRNT_CPN_TYPE_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01CrntCpnTypeCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CrntCpnTypeCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01CrntCpnTypeCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01Extelc1SecTypCd
	 *	@return bdms01Extelc1SecTypCd
	 */
   public char[] getBdms01Extelc1SecTypCd() throws CFException{
     if (isBdms01Extelc1SecTypCdModified()) { 
        bdms01Extelc1SecTypCd = refreshBdms01Extelc1SecTypCd();
     }
   		return bdms01Extelc1SecTypCd;
   }

  
	/**
	*  set variable bdms01Extelc1SecTypCd
	*  Corresponding COBOL Variable is BDMS01-EXTELC1-SEC-TYP-CD
	*  @param value
	**/
   public void setBdms01Extelc1SecTypCd(char[] value) {
      bdms01Extelc1SecTypCd = checkBdms01Extelc1SecTypCdConstraints(value);
      serializeBdms01Extelc1SecTypCd(bdms01Extelc1SecTypCd);
   } 

     /**
	 * 	Update Bdms01Extelc1SecTypCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01Extelc1SecTypCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01Extelc1SecTypCd,bdms01Extelc1SecTypCd.length);
   	
   }
   
   public void setBdms01Extelc1SecTypCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Extelc1SecTypCd,bdms01Extelc1SecTypCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01Extelc1SecTypCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Extelc1SecTypCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Extelc1SecTypCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01Extelc1SecTypCd with another Field
	 *	@param value
	 */
   public void setBdms01Extelc1SecTypCd(Field source) {
       replace(source,0,source.length(),beginBdms01Extelc1SecTypCd,BDMS_01_EXTELC_1_SEC_TYP_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01Extelc1SecTypCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01Extelc1SecTypCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01Extelc1SecTypCd,BDMS_01_EXTELC_1_SEC_TYP_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01Extelc1SecTypCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Extelc1SecTypCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Extelc1SecTypCd+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Bdms01BaseSecurityExpData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBdms01PutEndDt(CONSTANTS.SPACE_10);
                     setBdms01PutNtcMinDyQty(0);
                     setBdms01PutNtcMaxDyQty(0);
         setBdms01CltrlTypeCd(CONSTANTS.SPACE_2);
         setBdms01PutFreqCd(CONSTANTS.SPACE_2);
         setBdms01MtrtyTypeCd(CONSTANTS.SPACE_2);
         setBdms01LnkdCd(CONSTANTS.SPACE);
         setBdms01ActnRtInd(CONSTANTS.SPACE);
         setBdms01FrstVrblRstDt(CONSTANTS.SPACE_10);
         setBdms01RstFreqCd(CONSTANTS.SPACE_2);
         setBdms01Call2TmngCd(CONSTANTS.SPACE_2);
         setBdms01ExchgPrimeCd(CONSTANTS.SPACE_3);
         setBdms01MrktTierCd(CONSTANTS.SPACE);
         setBdms01MrktIndCd(CONSTANTS.SPACE_4);
         setBdms01NewTraceInd(CONSTANTS.SPACE);
         setBdms01QuickCd(CONSTANTS.SPACE_6);
         setBdms01LseMrktCd(CONSTANTS.SPACE_4);
         setBdms01IsinChngInd(CONSTANTS.SPACE);
         setBdms01StkIssueSttsCd(CONSTANTS.SPACE);
         setBdms01IssrTypeCd(CONSTANTS.SPACE);
         setBdms01TraceSymblTxt(CONSTANTS.SPACE_14);
         setBdms01RegsInd(CONSTANTS.SPACE);
         setBdms01PpnCd(CONSTANTS.SPACE_3);
         setBdms01PpnInd(CONSTANTS.SPACE);
         setBdms01DtcUnrtdMoodyCd(CONSTANTS.SPACE);
         setBdms01DtcUnrtdSpCd(CONSTANTS.SPACE);
         setBdms01TirsSecTypeCd(CONSTANTS.SPACE);
         setBdms01SifmaSmgInd(CONSTANTS.SPACE);
         setBdms01CalledAncmtCd(CONSTANTS.SPACE);
         setBdms01PrtlRdmptSchdCd(CONSTANTS.SPACE);
         setBdms01FdrlTaxSttsCd(CONSTANTS.SPACE);
         setBdms01CntngTaxCd(CONSTANTS.SPACE);
			setBdms01CntngYldRt(BigDecimal.ZERO);
         setBdms01SecTypeCd(CONSTANTS.SPACE_3);
         setBdms01CltrlIssCd(CONSTANTS.SPACE_2);
         setBdms01RangeInd(CONSTANTS.SPACE);
         setBdms01B8CntngPymntCd(CONSTANTS.SPACE);
         setBdms01CrntCpnTypeCd(CONSTANTS.SPACE);
         setBdms01Extelc1SecTypCd(CONSTANTS.SPACE_2);
   }

		public static int getBdms01BaseSecurityExpDataFieldLength() {
			return BDMS_01_BASE_SECURITY_EXP_DATA_LENGTH;
		}

}
  

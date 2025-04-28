package com.cloudframe.app.init1.dto;

/**
*  The class Rlm2tPromoCustMtnRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:55. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Rlm2tPromoCustMtnRec extends Rlm2tPromoCustMtnRecSerialized { 
   

								private int rlm2tCustIdNo;

						private char[] rlm2tNpa = Field.fillLowValue(3);

						private char[] rlm2tNxx = Field.fillLowValue(3);

						private char[] rlm2tTln = Field.fillLowValue(4);

						private char[] rlm2tMtnEffDt = Field.fillLowValue(10);

								private int rlm2tOffrTypId;

						private char[] rlm2tOffrTypCd = Field.fillLowValue(2);

								private int rlm2tFreeUsgMin;

						private char[] rlm2tAllowTypCd = Field.fillLowValue(2);

						private char[] rlm2tAllowCrTyp = Field.fillLowValue(1);
				private Rlm2tQualifyDt rlm2tQualifyDt = new Rlm2tQualifyDt();
				private Rlm2tEndDt rlm2tEndDt = new Rlm2tEndDt();

								private long rlm2tFreeTmLeft;

								private int rlm2tPromoConnectId;

								private long rlm2tLnOfSvcIdNoP2;

								private int rlm2tLnOfSvcIdNoP1;

						private char[] rlm2tLnSvcProdEffTs = Field.fillLowValue(26);

						private char[] rlm2tLnSvcProdEndTs = Field.fillLowValue(26);

								private int rlm2tAcctNo;

								private short rlm2tBlSegregateNo;

								private short rlm2tJobIterationNo;

						private char[] rlm2tBlStreamCd = Field.fillLowValue(1);

						private char[] rlm2tDbUserid = Field.fillLowValue(8);

						private char[] rlm2tDbTmstamp = Field.fillLowValue(26);
	
	/**
	* Constructor for Rlm2tPromoCustMtnRec
	**/
    public Rlm2tPromoCustMtnRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			rlm2tQualifyDt.setParent(this,getStartOffset() + 37);
	       			rlm2tEndDt.setParent(this,getStartOffset() + 47);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of rlm2tCustIdNo
	 *	@return rlm2tCustIdNo
	 */
	public int getRlm2tCustIdNo() throws CFException {
        if (isRlm2tCustIdNoModified()) { 
           rlm2tCustIdNo = refreshRlm2tCustIdNo();
        }
   		return rlm2tCustIdNo;
	}
	
	/**
	 * 	Update Rlm2tCustIdNo with the passed value
	 *  Corresponding COBOL Variable is RLM2T-CUST-ID-NO
	 *	@param number
	 */
	public void setRlm2tCustIdNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    rlm2tCustIdNo = checkRlm2tCustIdNoMaxLimit(number); 
		serializeRlm2tCustIdNo(rlm2tCustIdNo);
	}


	public void setRlm2tCustIdNo(long number) {
	    number = checkRlm2tCustIdNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRlm2tCustIdNo((int)number);
	}
	
	/**
	 *	Returns the value of rlm2tNpa
	 *	@return rlm2tNpa
	 */
   public char[] getRlm2tNpa() throws CFException{
     if (isRlm2tNpaModified()) { 
        rlm2tNpa = refreshRlm2tNpa();
     }
   		return rlm2tNpa;
   }

  
	/**
	*  set variable rlm2tNpa
	*  Corresponding COBOL Variable is RLM2T-NPA
	*  @param value
	**/
   public void setRlm2tNpa(char[] value) {
      rlm2tNpa = checkRlm2tNpaConstraints(value);
      serializeRlm2tNpa(rlm2tNpa);
   } 

     /**
	 * 	Update Rlm2tNpa 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlm2tNpa(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlm2tNpa,rlm2tNpa.length);
   	
   }
   
   public void setRlm2tNpa(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tNpa,rlm2tNpa.length);
   	
   }
   
     /**
	 * 	Update Rlm2tNpa 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlm2tNpa(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tNpa+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlm2tNpa with another Field
	 *	@param value
	 */
   public void setRlm2tNpa(Field source) {
       replace(source,0,source.length(),beginRlm2tNpa,RLM_2T_NPA_LEN);
   	
   }  
   
     /**
	 * 	Update Rlm2tNpa 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlm2tNpa(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlm2tNpa,RLM_2T_NPA_LEN);
   	
   }
   
     /**
	 * 	Update Rlm2tNpa 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlm2tNpa(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tNpa+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rlm2tNxx
	 *	@return rlm2tNxx
	 */
   public char[] getRlm2tNxx() throws CFException{
     if (isRlm2tNxxModified()) { 
        rlm2tNxx = refreshRlm2tNxx();
     }
   		return rlm2tNxx;
   }

  
	/**
	*  set variable rlm2tNxx
	*  Corresponding COBOL Variable is RLM2T-NXX
	*  @param value
	**/
   public void setRlm2tNxx(char[] value) {
      rlm2tNxx = checkRlm2tNxxConstraints(value);
      serializeRlm2tNxx(rlm2tNxx);
   } 

     /**
	 * 	Update Rlm2tNxx 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlm2tNxx(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlm2tNxx,rlm2tNxx.length);
   	
   }
   
   public void setRlm2tNxx(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tNxx,rlm2tNxx.length);
   	
   }
   
     /**
	 * 	Update Rlm2tNxx 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlm2tNxx(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tNxx+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlm2tNxx with another Field
	 *	@param value
	 */
   public void setRlm2tNxx(Field source) {
       replace(source,0,source.length(),beginRlm2tNxx,RLM_2T_NXX_LEN);
   	
   }  
   
     /**
	 * 	Update Rlm2tNxx 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlm2tNxx(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlm2tNxx,RLM_2T_NXX_LEN);
   	
   }
   
     /**
	 * 	Update Rlm2tNxx 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlm2tNxx(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tNxx+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rlm2tTln
	 *	@return rlm2tTln
	 */
   public char[] getRlm2tTln() throws CFException{
     if (isRlm2tTlnModified()) { 
        rlm2tTln = refreshRlm2tTln();
     }
   		return rlm2tTln;
   }

  
	/**
	*  set variable rlm2tTln
	*  Corresponding COBOL Variable is RLM2T-TLN
	*  @param value
	**/
   public void setRlm2tTln(char[] value) {
      rlm2tTln = checkRlm2tTlnConstraints(value);
      serializeRlm2tTln(rlm2tTln);
   } 

     /**
	 * 	Update Rlm2tTln 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlm2tTln(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlm2tTln,rlm2tTln.length);
   	
   }
   
   public void setRlm2tTln(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tTln,rlm2tTln.length);
   	
   }
   
     /**
	 * 	Update Rlm2tTln 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlm2tTln(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tTln+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlm2tTln with another Field
	 *	@param value
	 */
   public void setRlm2tTln(Field source) {
       replace(source,0,source.length(),beginRlm2tTln,RLM_2T_TLN_LEN);
   	
   }  
   
     /**
	 * 	Update Rlm2tTln 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlm2tTln(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlm2tTln,RLM_2T_TLN_LEN);
   	
   }
   
     /**
	 * 	Update Rlm2tTln 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlm2tTln(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tTln+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rlm2tMtnEffDt
	 *	@return rlm2tMtnEffDt
	 */
   public char[] getRlm2tMtnEffDt() throws CFException{
     if (isRlm2tMtnEffDtModified()) { 
        rlm2tMtnEffDt = refreshRlm2tMtnEffDt();
     }
   		return rlm2tMtnEffDt;
   }

  
	/**
	*  set variable rlm2tMtnEffDt
	*  Corresponding COBOL Variable is RLM2T-MTN-EFF-DT
	*  @param value
	**/
   public void setRlm2tMtnEffDt(char[] value) {
      rlm2tMtnEffDt = checkRlm2tMtnEffDtConstraints(value);
      serializeRlm2tMtnEffDt(rlm2tMtnEffDt);
   } 

     /**
	 * 	Update Rlm2tMtnEffDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlm2tMtnEffDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlm2tMtnEffDt,rlm2tMtnEffDt.length);
   	
   }
   
   public void setRlm2tMtnEffDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tMtnEffDt,rlm2tMtnEffDt.length);
   	
   }
   
     /**
	 * 	Update Rlm2tMtnEffDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlm2tMtnEffDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tMtnEffDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlm2tMtnEffDt with another Field
	 *	@param value
	 */
   public void setRlm2tMtnEffDt(Field source) {
       replace(source,0,source.length(),beginRlm2tMtnEffDt,RLM_2T_MTN_EFF_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Rlm2tMtnEffDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlm2tMtnEffDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlm2tMtnEffDt,RLM_2T_MTN_EFF_DT_LEN);
   	
   }
   
     /**
	 * 	Update Rlm2tMtnEffDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlm2tMtnEffDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tMtnEffDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rlm2tOffrTypId
	 *	@return rlm2tOffrTypId
	 */
	public int getRlm2tOffrTypId() throws CFException {
        if (isRlm2tOffrTypIdModified()) { 
           rlm2tOffrTypId = refreshRlm2tOffrTypId();
        }
   		return rlm2tOffrTypId;
	}
	
	/**
	 * 	Update Rlm2tOffrTypId with the passed value
	 *  Corresponding COBOL Variable is RLM2T-OFFR-TYP-ID
	 *	@param number
	 */
	public void setRlm2tOffrTypId(int number) {
	     // Truncate if the number is beyond +/- Max range
	    rlm2tOffrTypId = checkRlm2tOffrTypIdMaxLimit(number); 
		serializeRlm2tOffrTypId(rlm2tOffrTypId);
	}


	public void setRlm2tOffrTypId(long number) {
	    number = checkRlm2tOffrTypIdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRlm2tOffrTypId((int)number);
	}
	
	/**
	 *	Returns the value of rlm2tOffrTypCd
	 *	@return rlm2tOffrTypCd
	 */
   public char[] getRlm2tOffrTypCd() throws CFException{
     if (isRlm2tOffrTypCdModified()) { 
        rlm2tOffrTypCd = refreshRlm2tOffrTypCd();
     }
   		return rlm2tOffrTypCd;
   }

  
	/**
	*  set variable rlm2tOffrTypCd
	*  Corresponding COBOL Variable is RLM2T-OFFR-TYP-CD
	*  @param value
	**/
   public void setRlm2tOffrTypCd(char[] value) {
      rlm2tOffrTypCd = checkRlm2tOffrTypCdConstraints(value);
      serializeRlm2tOffrTypCd(rlm2tOffrTypCd);
   } 

     /**
	 * 	Update Rlm2tOffrTypCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlm2tOffrTypCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlm2tOffrTypCd,rlm2tOffrTypCd.length);
   	
   }
   
   public void setRlm2tOffrTypCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tOffrTypCd,rlm2tOffrTypCd.length);
   	
   }
   
     /**
	 * 	Update Rlm2tOffrTypCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlm2tOffrTypCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tOffrTypCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlm2tOffrTypCd with another Field
	 *	@param value
	 */
   public void setRlm2tOffrTypCd(Field source) {
       replace(source,0,source.length(),beginRlm2tOffrTypCd,RLM_2T_OFFR_TYP_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Rlm2tOffrTypCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlm2tOffrTypCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlm2tOffrTypCd,RLM_2T_OFFR_TYP_CD_LEN);
   	
   }
   
     /**
	 * 	Update Rlm2tOffrTypCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlm2tOffrTypCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tOffrTypCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rlm2tFreeUsgMin
	 *	@return rlm2tFreeUsgMin
	 */
	public int getRlm2tFreeUsgMin() throws CFException {
        if (isRlm2tFreeUsgMinModified()) { 
           rlm2tFreeUsgMin = refreshRlm2tFreeUsgMin();
        }
   		return rlm2tFreeUsgMin;
	}
	
	/**
	 * 	Update Rlm2tFreeUsgMin with the passed value
	 *  Corresponding COBOL Variable is RLM2T-FREE-USG-MIN
	 *	@param number
	 */
	public void setRlm2tFreeUsgMin(int number) {
	     // Truncate if the number is beyond +/- Max range
	    rlm2tFreeUsgMin = checkRlm2tFreeUsgMinMaxLimit(number); 
		serializeRlm2tFreeUsgMin(rlm2tFreeUsgMin);
	}


	public void setRlm2tFreeUsgMin(long number) {
	    number = checkRlm2tFreeUsgMinMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRlm2tFreeUsgMin((int)number);
	}
	
	/**
	 *	Returns the value of rlm2tAllowTypCd
	 *	@return rlm2tAllowTypCd
	 */
   public char[] getRlm2tAllowTypCd() throws CFException{
     if (isRlm2tAllowTypCdModified()) { 
        rlm2tAllowTypCd = refreshRlm2tAllowTypCd();
     }
   		return rlm2tAllowTypCd;
   }

  
	/**
	*  set variable rlm2tAllowTypCd
	*  Corresponding COBOL Variable is RLM2T-ALLOW-TYP-CD
	*  @param value
	**/
   public void setRlm2tAllowTypCd(char[] value) {
      rlm2tAllowTypCd = checkRlm2tAllowTypCdConstraints(value);
      serializeRlm2tAllowTypCd(rlm2tAllowTypCd);
   } 

     /**
	 * 	Update Rlm2tAllowTypCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlm2tAllowTypCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlm2tAllowTypCd,rlm2tAllowTypCd.length);
   	
   }
   
   public void setRlm2tAllowTypCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tAllowTypCd,rlm2tAllowTypCd.length);
   	
   }
   
     /**
	 * 	Update Rlm2tAllowTypCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlm2tAllowTypCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tAllowTypCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlm2tAllowTypCd with another Field
	 *	@param value
	 */
   public void setRlm2tAllowTypCd(Field source) {
       replace(source,0,source.length(),beginRlm2tAllowTypCd,RLM_2T_ALLOW_TYP_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Rlm2tAllowTypCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlm2tAllowTypCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlm2tAllowTypCd,RLM_2T_ALLOW_TYP_CD_LEN);
   	
   }
   
     /**
	 * 	Update Rlm2tAllowTypCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlm2tAllowTypCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tAllowTypCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rlm2tAllowCrTyp
	 *	@return rlm2tAllowCrTyp
	 */
   public char[] getRlm2tAllowCrTyp() throws CFException{
     if (isRlm2tAllowCrTypModified()) { 
        rlm2tAllowCrTyp = refreshRlm2tAllowCrTyp();
     }
   		return rlm2tAllowCrTyp;
   }

  
	/**
	*  set variable rlm2tAllowCrTyp
	*  Corresponding COBOL Variable is RLM2T-ALLOW-CR-TYP
	*  @param value
	**/
   public void setRlm2tAllowCrTyp(char[] value) {
      rlm2tAllowCrTyp = checkRlm2tAllowCrTypConstraints(value);
      serializeRlm2tAllowCrTyp(rlm2tAllowCrTyp);
   } 

     /**
	 * 	Update Rlm2tAllowCrTyp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlm2tAllowCrTyp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlm2tAllowCrTyp,rlm2tAllowCrTyp.length);
   	
   }
   
   public void setRlm2tAllowCrTyp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tAllowCrTyp,rlm2tAllowCrTyp.length);
   	
   }
   
     /**
	 * 	Update Rlm2tAllowCrTyp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlm2tAllowCrTyp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tAllowCrTyp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlm2tAllowCrTyp with another Field
	 *	@param value
	 */
   public void setRlm2tAllowCrTyp(Field source) {
       replace(source,0,source.length(),beginRlm2tAllowCrTyp,RLM_2T_ALLOW_CR_TYP_LEN);
   	
   }  
   
     /**
	 * 	Update Rlm2tAllowCrTyp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlm2tAllowCrTyp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlm2tAllowCrTyp,RLM_2T_ALLOW_CR_TYP_LEN);
   	
   }
   
     /**
	 * 	Update Rlm2tAllowCrTyp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlm2tAllowCrTyp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tAllowCrTyp+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rlm2tQualifyDt
	 *	@return rlm2tQualifyDt
	 */   
	 public Rlm2tQualifyDt getRlm2tQualifyDt() {
   	return rlm2tQualifyDt;
   }
   /**
	* 	Update Rlm2tQualifyDt with the passed value
	*   Corresponding COBOL Variable is RLM2T-QUALIFY-DT
	*	@param value
	*/
   public void setRlm2tQualifyDt(char[] value) {
      rlm2tQualifyDt.setString(value); 
   }   
    
     /**
	 * 	Update Rlm2tQualifyDt 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRlm2tQualifyDt(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlm2tQualifyDt.begin,rlm2tQualifyDt.length());
   }
   
     /**
	 * 	Update Rlm2tQualifyDt 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlm2tQualifyDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlm2tQualifyDt.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Rlm2tQualifyDt with another Field
	 *	@param value
	 */
   public void setRlm2tQualifyDt(Field source) {
   	replace(source,0,source.length(),rlm2tQualifyDt.begin,rlm2tQualifyDt.length());
   }  
   
     /**
	 * 	Update Rlm2tQualifyDt 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRlm2tQualifyDt(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlm2tQualifyDt.begin,rlm2tQualifyDt.length());
   }
   
     /**
	 * 	Update Rlm2tQualifyDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlm2tQualifyDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlm2tQualifyDt.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of rlm2tEndDt
	 *	@return rlm2tEndDt
	 */   
	 public Rlm2tEndDt getRlm2tEndDt() {
   	return rlm2tEndDt;
   }
   /**
	* 	Update Rlm2tEndDt with the passed value
	*   Corresponding COBOL Variable is RLM2T-END-DT
	*	@param value
	*/
   public void setRlm2tEndDt(char[] value) {
      rlm2tEndDt.setString(value); 
   }   
    
     /**
	 * 	Update Rlm2tEndDt 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRlm2tEndDt(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlm2tEndDt.begin,rlm2tEndDt.length());
   }
   
     /**
	 * 	Update Rlm2tEndDt 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlm2tEndDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlm2tEndDt.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Rlm2tEndDt with another Field
	 *	@param value
	 */
   public void setRlm2tEndDt(Field source) {
   	replace(source,0,source.length(),rlm2tEndDt.begin,rlm2tEndDt.length());
   }  
   
     /**
	 * 	Update Rlm2tEndDt 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRlm2tEndDt(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlm2tEndDt.begin,rlm2tEndDt.length());
   }
   
     /**
	 * 	Update Rlm2tEndDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlm2tEndDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlm2tEndDt.begin+targetIndex,targetLen);
   }
	public long getRlm2tFreeTmLeft() throws CFException {
        if (isRlm2tFreeTmLeftModified()) { 
           rlm2tFreeTmLeft = refreshRlm2tFreeTmLeft();
        }
   		return rlm2tFreeTmLeft;
	}
	
	/**
	 * 	Update Rlm2tFreeTmLeft with the passed value
	 *  Corresponding COBOL Variable is RLM2T-FREE-TM-LEFT
	 *	@param number
	 */
	public void setRlm2tFreeTmLeft(long number) {
			rlm2tFreeTmLeft = checkRlm2tFreeTmLeftMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeRlm2tFreeTmLeft(rlm2tFreeTmLeft);
	}


	/**
	 *	Returns the value of rlm2tPromoConnectId
	 *	@return rlm2tPromoConnectId
	 */
	public int getRlm2tPromoConnectId() throws CFException {
        if (isRlm2tPromoConnectIdModified()) { 
           rlm2tPromoConnectId = refreshRlm2tPromoConnectId();
        }
   		return rlm2tPromoConnectId;
	}
	
	/**
	 * 	Update Rlm2tPromoConnectId with the passed value
	 *  Corresponding COBOL Variable is RLM2T-PROMO-CONNECT-ID
	 *	@param number
	 */
	public void setRlm2tPromoConnectId(int number) {
	     // Truncate if the number is beyond +/- Max range
	    rlm2tPromoConnectId = checkRlm2tPromoConnectIdMaxLimit(number); 
		serializeRlm2tPromoConnectId(rlm2tPromoConnectId);
	}


	public void setRlm2tPromoConnectId(long number) {
	    number = checkRlm2tPromoConnectIdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRlm2tPromoConnectId((int)number);
	}
	
	/**
	 *	Returns the value of rlm2tLnOfSvcIdNoP2
	 *	@return rlm2tLnOfSvcIdNoP2
	 */
	public long getRlm2tLnOfSvcIdNoP2() throws CFException {
        if (isRlm2tLnOfSvcIdNoP2Modified()) { 
           rlm2tLnOfSvcIdNoP2 = refreshRlm2tLnOfSvcIdNoP2();
        }
   		return rlm2tLnOfSvcIdNoP2;
	}
	
	/**
	 * 	Update Rlm2tLnOfSvcIdNoP2 with the passed value
	 *  Corresponding COBOL Variable is RLM2T-LN-OF-SVC-ID-NO-P2
	 *	@param number
	 */
	public void setRlm2tLnOfSvcIdNoP2(long number) {
	     // Truncate if the number is beyond +/- Max range
	    rlm2tLnOfSvcIdNoP2 = checkRlm2tLnOfSvcIdNoP2MaxLimit(number); 
		serializeRlm2tLnOfSvcIdNoP2(rlm2tLnOfSvcIdNoP2);
	}


	public int getRlm2tLnOfSvcIdNoP1() throws CFException {
        if (isRlm2tLnOfSvcIdNoP1Modified()) { 
           rlm2tLnOfSvcIdNoP1 = refreshRlm2tLnOfSvcIdNoP1();
        }
   		return rlm2tLnOfSvcIdNoP1;
	}
	
	/**
	 * 	Update Rlm2tLnOfSvcIdNoP1 with the passed value
	 *  Corresponding COBOL Variable is RLM2T-LN-OF-SVC-ID-NO-P1
	 *	@param number
	 */
	public void setRlm2tLnOfSvcIdNoP1(int number) {
			rlm2tLnOfSvcIdNoP1 = checkRlm2tLnOfSvcIdNoP1MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeRlm2tLnOfSvcIdNoP1(rlm2tLnOfSvcIdNoP1);
	}


	public void setRlm2tLnOfSvcIdNoP1(long number) {
	    number = checkRlm2tLnOfSvcIdNoP1MaxLimit(number); // Truncate if value is beyond +/- Max range
		setRlm2tLnOfSvcIdNoP1((int)number);
	}
	
	/**
	 *	Returns the value of rlm2tLnSvcProdEffTs
	 *	@return rlm2tLnSvcProdEffTs
	 */
   public char[] getRlm2tLnSvcProdEffTs() throws CFException{
     if (isRlm2tLnSvcProdEffTsModified()) { 
        rlm2tLnSvcProdEffTs = refreshRlm2tLnSvcProdEffTs();
     }
   		return rlm2tLnSvcProdEffTs;
   }

  
	/**
	*  set variable rlm2tLnSvcProdEffTs
	*  Corresponding COBOL Variable is RLM2T-LN-SVC-PROD-EFF-TS
	*  @param value
	**/
   public void setRlm2tLnSvcProdEffTs(char[] value) {
      rlm2tLnSvcProdEffTs = checkRlm2tLnSvcProdEffTsConstraints(value);
      serializeRlm2tLnSvcProdEffTs(rlm2tLnSvcProdEffTs);
   } 

     /**
	 * 	Update Rlm2tLnSvcProdEffTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlm2tLnSvcProdEffTs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlm2tLnSvcProdEffTs,rlm2tLnSvcProdEffTs.length);
   	
   }
   
   public void setRlm2tLnSvcProdEffTs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tLnSvcProdEffTs,rlm2tLnSvcProdEffTs.length);
   	
   }
   
     /**
	 * 	Update Rlm2tLnSvcProdEffTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlm2tLnSvcProdEffTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tLnSvcProdEffTs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlm2tLnSvcProdEffTs with another Field
	 *	@param value
	 */
   public void setRlm2tLnSvcProdEffTs(Field source) {
       replace(source,0,source.length(),beginRlm2tLnSvcProdEffTs,RLM_2T_LN_SVC_PROD_EFF_TS_LEN);
   	
   }  
   
     /**
	 * 	Update Rlm2tLnSvcProdEffTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlm2tLnSvcProdEffTs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlm2tLnSvcProdEffTs,RLM_2T_LN_SVC_PROD_EFF_TS_LEN);
   	
   }
   
     /**
	 * 	Update Rlm2tLnSvcProdEffTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlm2tLnSvcProdEffTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tLnSvcProdEffTs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rlm2tLnSvcProdEndTs
	 *	@return rlm2tLnSvcProdEndTs
	 */
   public char[] getRlm2tLnSvcProdEndTs() throws CFException{
     if (isRlm2tLnSvcProdEndTsModified()) { 
        rlm2tLnSvcProdEndTs = refreshRlm2tLnSvcProdEndTs();
     }
   		return rlm2tLnSvcProdEndTs;
   }

  
	/**
	*  set variable rlm2tLnSvcProdEndTs
	*  Corresponding COBOL Variable is RLM2T-LN-SVC-PROD-END-TS
	*  @param value
	**/
   public void setRlm2tLnSvcProdEndTs(char[] value) {
      rlm2tLnSvcProdEndTs = checkRlm2tLnSvcProdEndTsConstraints(value);
      serializeRlm2tLnSvcProdEndTs(rlm2tLnSvcProdEndTs);
   } 

     /**
	 * 	Update Rlm2tLnSvcProdEndTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlm2tLnSvcProdEndTs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlm2tLnSvcProdEndTs,rlm2tLnSvcProdEndTs.length);
   	
   }
   
   public void setRlm2tLnSvcProdEndTs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tLnSvcProdEndTs,rlm2tLnSvcProdEndTs.length);
   	
   }
   
     /**
	 * 	Update Rlm2tLnSvcProdEndTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlm2tLnSvcProdEndTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tLnSvcProdEndTs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlm2tLnSvcProdEndTs with another Field
	 *	@param value
	 */
   public void setRlm2tLnSvcProdEndTs(Field source) {
       replace(source,0,source.length(),beginRlm2tLnSvcProdEndTs,RLM_2T_LN_SVC_PROD_END_TS_LEN);
   	
   }  
   
     /**
	 * 	Update Rlm2tLnSvcProdEndTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlm2tLnSvcProdEndTs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlm2tLnSvcProdEndTs,RLM_2T_LN_SVC_PROD_END_TS_LEN);
   	
   }
   
     /**
	 * 	Update Rlm2tLnSvcProdEndTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlm2tLnSvcProdEndTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tLnSvcProdEndTs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rlm2tAcctNo
	 *	@return rlm2tAcctNo
	 */
	public int getRlm2tAcctNo() throws CFException {
        if (isRlm2tAcctNoModified()) { 
           rlm2tAcctNo = refreshRlm2tAcctNo();
        }
   		return rlm2tAcctNo;
	}
	
	/**
	 * 	Update Rlm2tAcctNo with the passed value
	 *  Corresponding COBOL Variable is RLM2T-ACCT-NO
	 *	@param number
	 */
	public void setRlm2tAcctNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    rlm2tAcctNo = checkRlm2tAcctNoMaxLimit(number); 
		serializeRlm2tAcctNo(rlm2tAcctNo);
	}


	public void setRlm2tAcctNo(long number) {
	    number = checkRlm2tAcctNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRlm2tAcctNo((int)number);
	}
	
	/**
	 *	Returns the value of rlm2tBlSegregateNo
	 *	@return rlm2tBlSegregateNo
	 */
	public short getRlm2tBlSegregateNo() throws CFException {
        if (isRlm2tBlSegregateNoModified()) { 
           rlm2tBlSegregateNo = refreshRlm2tBlSegregateNo();
        }
   		return rlm2tBlSegregateNo;
	}
	
	/**
	 * 	Update Rlm2tBlSegregateNo with the passed value
	 *  Corresponding COBOL Variable is RLM2T-BL-SEGREGATE-NO
	 *	@param number
	 */
	public void setRlm2tBlSegregateNo(short number) {
	     // Truncate if the number is beyond +/- Max range
	    rlm2tBlSegregateNo = checkRlm2tBlSegregateNoMaxLimit(number); 
		serializeRlm2tBlSegregateNo(rlm2tBlSegregateNo);
	}

	public void setRlm2tBlSegregateNo(int number) {
	    number = checkRlm2tBlSegregateNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setRlm2tBlSegregateNo((short)number);
	}
	public void setRlm2tBlSegregateNo(long number) {
	    number = checkRlm2tBlSegregateNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setRlm2tBlSegregateNo((short)number);
	}
	

	/**
	 *	Returns the value of rlm2tJobIterationNo
	 *	@return rlm2tJobIterationNo
	 */
	public short getRlm2tJobIterationNo() throws CFException {
        if (isRlm2tJobIterationNoModified()) { 
           rlm2tJobIterationNo = refreshRlm2tJobIterationNo();
        }
   		return rlm2tJobIterationNo;
	}
	
	/**
	 * 	Update Rlm2tJobIterationNo with the passed value
	 *  Corresponding COBOL Variable is RLM2T-JOB-ITERATION-NO
	 *	@param number
	 */
	public void setRlm2tJobIterationNo(short number) {
	     // Truncate if the number is beyond +/- Max range
	    rlm2tJobIterationNo = checkRlm2tJobIterationNoMaxLimit(number); 
		serializeRlm2tJobIterationNo(rlm2tJobIterationNo);
	}

	public void setRlm2tJobIterationNo(int number) {
	    number = checkRlm2tJobIterationNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setRlm2tJobIterationNo((short)number);
	}
	public void setRlm2tJobIterationNo(long number) {
	    number = checkRlm2tJobIterationNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setRlm2tJobIterationNo((short)number);
	}
	

	/**
	 *	Returns the value of rlm2tBlStreamCd
	 *	@return rlm2tBlStreamCd
	 */
   public char[] getRlm2tBlStreamCd() throws CFException{
     if (isRlm2tBlStreamCdModified()) { 
        rlm2tBlStreamCd = refreshRlm2tBlStreamCd();
     }
   		return rlm2tBlStreamCd;
   }

  
	/**
	*  set variable rlm2tBlStreamCd
	*  Corresponding COBOL Variable is RLM2T-BL-STREAM-CD
	*  @param value
	**/
   public void setRlm2tBlStreamCd(char[] value) {
      rlm2tBlStreamCd = checkRlm2tBlStreamCdConstraints(value);
      serializeRlm2tBlStreamCd(rlm2tBlStreamCd);
   } 

     /**
	 * 	Update Rlm2tBlStreamCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlm2tBlStreamCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlm2tBlStreamCd,rlm2tBlStreamCd.length);
   	
   }
   
   public void setRlm2tBlStreamCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tBlStreamCd,rlm2tBlStreamCd.length);
   	
   }
   
     /**
	 * 	Update Rlm2tBlStreamCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlm2tBlStreamCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tBlStreamCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlm2tBlStreamCd with another Field
	 *	@param value
	 */
   public void setRlm2tBlStreamCd(Field source) {
       replace(source,0,source.length(),beginRlm2tBlStreamCd,RLM_2T_BL_STREAM_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Rlm2tBlStreamCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlm2tBlStreamCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlm2tBlStreamCd,RLM_2T_BL_STREAM_CD_LEN);
   	
   }
   
     /**
	 * 	Update Rlm2tBlStreamCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlm2tBlStreamCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tBlStreamCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rlm2tDbUserid
	 *	@return rlm2tDbUserid
	 */
   public char[] getRlm2tDbUserid() throws CFException{
     if (isRlm2tDbUseridModified()) { 
        rlm2tDbUserid = refreshRlm2tDbUserid();
     }
   		return rlm2tDbUserid;
   }

  
	/**
	*  set variable rlm2tDbUserid
	*  Corresponding COBOL Variable is RLM2T-DB-USERID
	*  @param value
	**/
   public void setRlm2tDbUserid(char[] value) {
      rlm2tDbUserid = checkRlm2tDbUseridConstraints(value);
      serializeRlm2tDbUserid(rlm2tDbUserid);
   } 

     /**
	 * 	Update Rlm2tDbUserid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlm2tDbUserid(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlm2tDbUserid,rlm2tDbUserid.length);
   	
   }
   
   public void setRlm2tDbUserid(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tDbUserid,rlm2tDbUserid.length);
   	
   }
   
     /**
	 * 	Update Rlm2tDbUserid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlm2tDbUserid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tDbUserid+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlm2tDbUserid with another Field
	 *	@param value
	 */
   public void setRlm2tDbUserid(Field source) {
       replace(source,0,source.length(),beginRlm2tDbUserid,RLM_2T_DB_USERID_LEN);
   	
   }  
   
     /**
	 * 	Update Rlm2tDbUserid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlm2tDbUserid(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlm2tDbUserid,RLM_2T_DB_USERID_LEN);
   	
   }
   
     /**
	 * 	Update Rlm2tDbUserid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlm2tDbUserid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tDbUserid+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rlm2tDbTmstamp
	 *	@return rlm2tDbTmstamp
	 */
   public char[] getRlm2tDbTmstamp() throws CFException{
     if (isRlm2tDbTmstampModified()) { 
        rlm2tDbTmstamp = refreshRlm2tDbTmstamp();
     }
   		return rlm2tDbTmstamp;
   }

  
	/**
	*  set variable rlm2tDbTmstamp
	*  Corresponding COBOL Variable is RLM2T-DB-TMSTAMP
	*  @param value
	**/
   public void setRlm2tDbTmstamp(char[] value) {
      rlm2tDbTmstamp = checkRlm2tDbTmstampConstraints(value);
      serializeRlm2tDbTmstamp(rlm2tDbTmstamp);
   } 

     /**
	 * 	Update Rlm2tDbTmstamp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlm2tDbTmstamp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlm2tDbTmstamp,rlm2tDbTmstamp.length);
   	
   }
   
   public void setRlm2tDbTmstamp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tDbTmstamp,rlm2tDbTmstamp.length);
   	
   }
   
     /**
	 * 	Update Rlm2tDbTmstamp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlm2tDbTmstamp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tDbTmstamp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rlm2tDbTmstamp with another Field
	 *	@param value
	 */
   public void setRlm2tDbTmstamp(Field source) {
       replace(source,0,source.length(),beginRlm2tDbTmstamp,RLM_2T_DB_TMSTAMP_LEN);
   	
   }  
   
     /**
	 * 	Update Rlm2tDbTmstamp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlm2tDbTmstamp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlm2tDbTmstamp,RLM_2T_DB_TMSTAMP_LEN);
   	
   }
   
     /**
	 * 	Update Rlm2tDbTmstamp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlm2tDbTmstamp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlm2tDbTmstamp+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Rlm2tPromoCustMtnRec
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setRlm2tCustIdNo(0);
         setRlm2tNpa(CONSTANTS.SPACE_3);
         setRlm2tNxx(CONSTANTS.SPACE_3);
         setRlm2tTln(CONSTANTS.SPACE_4);
         setRlm2tMtnEffDt(CONSTANTS.SPACE_10);
                     setRlm2tOffrTypId(0);
         setRlm2tOffrTypCd(CONSTANTS.SPACE_2);
                     setRlm2tFreeUsgMin(0);
         setRlm2tAllowTypCd(CONSTANTS.SPACE_2);
         setRlm2tAllowCrTyp(CONSTANTS.SPACE);
          rlm2tQualifyDt.initialize();
     
          rlm2tEndDt.initialize();
     
                     setRlm2tFreeTmLeft(0);
                     setRlm2tPromoConnectId(0);
                     setRlm2tLnOfSvcIdNoP2(0);
                     setRlm2tLnOfSvcIdNoP1(0);
         setRlm2tLnSvcProdEffTs(CONSTANTS.SPACE_26);
         setRlm2tLnSvcProdEndTs(CONSTANTS.SPACE_26);
                     setRlm2tAcctNo(0);
         	setRlm2tBlSegregateNo((short)0);
         	setRlm2tJobIterationNo((short)0);
         setRlm2tBlStreamCd(CONSTANTS.SPACE);
         setRlm2tDbUserid(CONSTANTS.SPACE_8);
         setRlm2tDbTmstamp(CONSTANTS.SPACE_26);
   }

		public static int getRlm2tPromoCustMtnRecFieldLength() {
			return RLM_2T_PROMO_CUST_MTN_REC_LENGTH;
		}

}
  

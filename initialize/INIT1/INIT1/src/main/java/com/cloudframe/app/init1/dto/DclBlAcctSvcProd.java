package com.cloudframe.app.init1.dto;

/**
*  The class DclBlAcctSvcProd is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:59. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class DclBlAcctSvcProd extends DclBlAcctSvcProdSerialized {
   

								private int tb13033CustIdNo;

								private int tb13033AcctNo;

								private int tb13033SvcProdId;

						private char[] tb13033BaSvcProdEffTs = Field.fillLowValue(26);

								private int tb13033SvcProdUniqueId;

						private char[] tb13033SvcProdExpireDt = Field.fillLowValue(10);

						private char[] tb13033SvcProdReinstatInd = Field.fillLowValue(1);

								private int tb13033RuleGrpIdLast;

						private char[] tb13033BaSvcProdEndTs = Field.fillLowValue(26);

						private char[] tb13033OrigSvcProdEffTs = Field.fillLowValue(26);

								private int tb13033OrigSvcProdUniqId;

						private char[] tb13033VisionUserIdCd = Field.fillLowValue(8);

						private char[] tb13033DbUserid = Field.fillLowValue(8);

						private char[] tb13033DbTmstamp = Field.fillLowValue(26);

								private int tb13033OutletId;

						private char[] tb13033SlsRepId = Field.fillLowValue(5);

						private char[] tb13033CreateTs = Field.fillLowValue(26);

								private int tb13033OrdLnProdUniqueId;

								private int tb13033ProdIdTrig;
	
	/**
	* Constructor for DclBlAcctSvcProd
	**/
    public DclBlAcctSvcProd() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of tb13033CustIdNo
	 *	@return tb13033CustIdNo
	 */
	public int getTb13033CustIdNo() throws CFException {
        if (isTb13033CustIdNoModified()) { 
           tb13033CustIdNo = refreshTb13033CustIdNo();
        }
   		return tb13033CustIdNo;
	}
	
	/**
	 * 	Update Tb13033CustIdNo with the passed value
	 *  Corresponding COBOL Variable is TB13033-CUST-ID-NO
	 *	@param number
	 */
	public void setTb13033CustIdNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    tb13033CustIdNo = checkTb13033CustIdNoMaxLimit(number); 
		serializeTb13033CustIdNo(tb13033CustIdNo);
	}


	public void setTb13033CustIdNo(long number) {
	    number = checkTb13033CustIdNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb13033CustIdNo((int)number);
	}
	
	/**
	 *	Returns the value of tb13033AcctNo
	 *	@return tb13033AcctNo
	 */
	public int getTb13033AcctNo() throws CFException {
        if (isTb13033AcctNoModified()) { 
           tb13033AcctNo = refreshTb13033AcctNo();
        }
   		return tb13033AcctNo;
	}
	
	/**
	 * 	Update Tb13033AcctNo with the passed value
	 *  Corresponding COBOL Variable is TB13033-ACCT-NO
	 *	@param number
	 */
	public void setTb13033AcctNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    tb13033AcctNo = checkTb13033AcctNoMaxLimit(number); 
		serializeTb13033AcctNo(tb13033AcctNo);
	}


	public void setTb13033AcctNo(long number) {
	    number = checkTb13033AcctNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb13033AcctNo((int)number);
	}
	
	/**
	 *	Returns the value of tb13033SvcProdId
	 *	@return tb13033SvcProdId
	 */
	public int getTb13033SvcProdId() throws CFException {
        if (isTb13033SvcProdIdModified()) { 
           tb13033SvcProdId = refreshTb13033SvcProdId();
        }
   		return tb13033SvcProdId;
	}
	
	/**
	 * 	Update Tb13033SvcProdId with the passed value
	 *  Corresponding COBOL Variable is TB13033-SVC-PROD-ID
	 *	@param number
	 */
	public void setTb13033SvcProdId(int number) {
	     // Truncate if the number is beyond +/- Max range
	    tb13033SvcProdId = checkTb13033SvcProdIdMaxLimit(number); 
		serializeTb13033SvcProdId(tb13033SvcProdId);
	}


	public void setTb13033SvcProdId(long number) {
	    number = checkTb13033SvcProdIdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb13033SvcProdId((int)number);
	}
	
	/**
	 *	Returns the value of tb13033BaSvcProdEffTs
	 *	@return tb13033BaSvcProdEffTs
	 */
   public char[] getTb13033BaSvcProdEffTs() throws CFException{
     if (isTb13033BaSvcProdEffTsModified()) { 
        tb13033BaSvcProdEffTs = refreshTb13033BaSvcProdEffTs();
     }
   		return tb13033BaSvcProdEffTs;
   }

  
	/**
	*  set variable tb13033BaSvcProdEffTs
	*  Corresponding COBOL Variable is TB13033-BA-SVC-PROD-EFF-TS
	*  @param value
	**/
   public void setTb13033BaSvcProdEffTs(char[] value) {
      tb13033BaSvcProdEffTs = checkTb13033BaSvcProdEffTsConstraints(value);
      serializeTb13033BaSvcProdEffTs(tb13033BaSvcProdEffTs);
   } 

     /**
	 * 	Update Tb13033BaSvcProdEffTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTb13033BaSvcProdEffTs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTb13033BaSvcProdEffTs,tb13033BaSvcProdEffTs.length);
   	
   }
   
   public void setTb13033BaSvcProdEffTs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTb13033BaSvcProdEffTs,tb13033BaSvcProdEffTs.length);
   	
   }
   
     /**
	 * 	Update Tb13033BaSvcProdEffTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTb13033BaSvcProdEffTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTb13033BaSvcProdEffTs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Tb13033BaSvcProdEffTs with another Field
	 *	@param value
	 */
   public void setTb13033BaSvcProdEffTs(Field source) {
       replace(source,0,source.length(),beginTb13033BaSvcProdEffTs,TB_13033_BA_SVC_PROD_EFF_TS_LEN);
   	
   }  
   
     /**
	 * 	Update Tb13033BaSvcProdEffTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTb13033BaSvcProdEffTs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTb13033BaSvcProdEffTs,TB_13033_BA_SVC_PROD_EFF_TS_LEN);
   	
   }
   
     /**
	 * 	Update Tb13033BaSvcProdEffTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTb13033BaSvcProdEffTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTb13033BaSvcProdEffTs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tb13033SvcProdUniqueId
	 *	@return tb13033SvcProdUniqueId
	 */
	public int getTb13033SvcProdUniqueId() throws CFException {
        if (isTb13033SvcProdUniqueIdModified()) { 
           tb13033SvcProdUniqueId = refreshTb13033SvcProdUniqueId();
        }
   		return tb13033SvcProdUniqueId;
	}
	
	/**
	 * 	Update Tb13033SvcProdUniqueId with the passed value
	 *  Corresponding COBOL Variable is TB13033-SVC-PROD-UNIQUE-ID
	 *	@param number
	 */
	public void setTb13033SvcProdUniqueId(int number) {
	     // Truncate if the number is beyond +/- Max range
	    tb13033SvcProdUniqueId = checkTb13033SvcProdUniqueIdMaxLimit(number); 
		serializeTb13033SvcProdUniqueId(tb13033SvcProdUniqueId);
	}


	public void setTb13033SvcProdUniqueId(long number) {
	    number = checkTb13033SvcProdUniqueIdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb13033SvcProdUniqueId((int)number);
	}
	
	/**
	 *	Returns the value of tb13033SvcProdExpireDt
	 *	@return tb13033SvcProdExpireDt
	 */
   public char[] getTb13033SvcProdExpireDt() throws CFException{
     if (isTb13033SvcProdExpireDtModified()) { 
        tb13033SvcProdExpireDt = refreshTb13033SvcProdExpireDt();
     }
   		return tb13033SvcProdExpireDt;
   }

  
	/**
	*  set variable tb13033SvcProdExpireDt
	*  Corresponding COBOL Variable is TB13033-SVC-PROD-EXPIRE-DT
	*  @param value
	**/
   public void setTb13033SvcProdExpireDt(char[] value) {
      tb13033SvcProdExpireDt = checkTb13033SvcProdExpireDtConstraints(value);
      serializeTb13033SvcProdExpireDt(tb13033SvcProdExpireDt);
   } 

     /**
	 * 	Update Tb13033SvcProdExpireDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTb13033SvcProdExpireDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTb13033SvcProdExpireDt,tb13033SvcProdExpireDt.length);
   	
   }
   
   public void setTb13033SvcProdExpireDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTb13033SvcProdExpireDt,tb13033SvcProdExpireDt.length);
   	
   }
   
     /**
	 * 	Update Tb13033SvcProdExpireDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTb13033SvcProdExpireDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTb13033SvcProdExpireDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Tb13033SvcProdExpireDt with another Field
	 *	@param value
	 */
   public void setTb13033SvcProdExpireDt(Field source) {
       replace(source,0,source.length(),beginTb13033SvcProdExpireDt,TB_13033_SVC_PROD_EXPIRE_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Tb13033SvcProdExpireDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTb13033SvcProdExpireDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTb13033SvcProdExpireDt,TB_13033_SVC_PROD_EXPIRE_DT_LEN);
   	
   }
   
     /**
	 * 	Update Tb13033SvcProdExpireDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTb13033SvcProdExpireDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTb13033SvcProdExpireDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tb13033SvcProdReinstatInd
	 *	@return tb13033SvcProdReinstatInd
	 */
   public char[] getTb13033SvcProdReinstatInd() throws CFException{
     if (isTb13033SvcProdReinstatIndModified()) { 
        tb13033SvcProdReinstatInd = refreshTb13033SvcProdReinstatInd();
     }
   		return tb13033SvcProdReinstatInd;
   }

  
	/**
	*  set variable tb13033SvcProdReinstatInd
	*  Corresponding COBOL Variable is TB13033-SVC-PROD-REINSTAT-IND
	*  @param value
	**/
   public void setTb13033SvcProdReinstatInd(char[] value) {
      tb13033SvcProdReinstatInd = checkTb13033SvcProdReinstatIndConstraints(value);
      serializeTb13033SvcProdReinstatInd(tb13033SvcProdReinstatInd);
   } 

     /**
	 * 	Update Tb13033SvcProdReinstatInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTb13033SvcProdReinstatInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTb13033SvcProdReinstatInd,tb13033SvcProdReinstatInd.length);
   	
   }
   
   public void setTb13033SvcProdReinstatInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTb13033SvcProdReinstatInd,tb13033SvcProdReinstatInd.length);
   	
   }
   
     /**
	 * 	Update Tb13033SvcProdReinstatInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTb13033SvcProdReinstatInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTb13033SvcProdReinstatInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Tb13033SvcProdReinstatInd with another Field
	 *	@param value
	 */
   public void setTb13033SvcProdReinstatInd(Field source) {
       replace(source,0,source.length(),beginTb13033SvcProdReinstatInd,TB_13033_SVC_PROD_REINSTAT_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Tb13033SvcProdReinstatInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTb13033SvcProdReinstatInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTb13033SvcProdReinstatInd,TB_13033_SVC_PROD_REINSTAT_IND_LEN);
   	
   }
   
     /**
	 * 	Update Tb13033SvcProdReinstatInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTb13033SvcProdReinstatInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTb13033SvcProdReinstatInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tb13033RuleGrpIdLast
	 *	@return tb13033RuleGrpIdLast
	 */
	public int getTb13033RuleGrpIdLast() throws CFException {
        if (isTb13033RuleGrpIdLastModified()) { 
           tb13033RuleGrpIdLast = refreshTb13033RuleGrpIdLast();
        }
   		return tb13033RuleGrpIdLast;
	}
	
	/**
	 * 	Update Tb13033RuleGrpIdLast with the passed value
	 *  Corresponding COBOL Variable is TB13033-RULE-GRP-ID-LAST
	 *	@param number
	 */
	public void setTb13033RuleGrpIdLast(int number) {
	     // Truncate if the number is beyond +/- Max range
	    tb13033RuleGrpIdLast = checkTb13033RuleGrpIdLastMaxLimit(number); 
		serializeTb13033RuleGrpIdLast(tb13033RuleGrpIdLast);
	}


	public void setTb13033RuleGrpIdLast(long number) {
	    number = checkTb13033RuleGrpIdLastMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb13033RuleGrpIdLast((int)number);
	}
	
	/**
	 *	Returns the value of tb13033BaSvcProdEndTs
	 *	@return tb13033BaSvcProdEndTs
	 */
   public char[] getTb13033BaSvcProdEndTs() throws CFException{
     if (isTb13033BaSvcProdEndTsModified()) { 
        tb13033BaSvcProdEndTs = refreshTb13033BaSvcProdEndTs();
     }
   		return tb13033BaSvcProdEndTs;
   }

  
	/**
	*  set variable tb13033BaSvcProdEndTs
	*  Corresponding COBOL Variable is TB13033-BA-SVC-PROD-END-TS
	*  @param value
	**/
   public void setTb13033BaSvcProdEndTs(char[] value) {
      tb13033BaSvcProdEndTs = checkTb13033BaSvcProdEndTsConstraints(value);
      serializeTb13033BaSvcProdEndTs(tb13033BaSvcProdEndTs);
   } 

     /**
	 * 	Update Tb13033BaSvcProdEndTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTb13033BaSvcProdEndTs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTb13033BaSvcProdEndTs,tb13033BaSvcProdEndTs.length);
   	
   }
   
   public void setTb13033BaSvcProdEndTs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTb13033BaSvcProdEndTs,tb13033BaSvcProdEndTs.length);
   	
   }
   
     /**
	 * 	Update Tb13033BaSvcProdEndTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTb13033BaSvcProdEndTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTb13033BaSvcProdEndTs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Tb13033BaSvcProdEndTs with another Field
	 *	@param value
	 */
   public void setTb13033BaSvcProdEndTs(Field source) {
       replace(source,0,source.length(),beginTb13033BaSvcProdEndTs,TB_13033_BA_SVC_PROD_END_TS_LEN);
   	
   }  
   
     /**
	 * 	Update Tb13033BaSvcProdEndTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTb13033BaSvcProdEndTs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTb13033BaSvcProdEndTs,TB_13033_BA_SVC_PROD_END_TS_LEN);
   	
   }
   
     /**
	 * 	Update Tb13033BaSvcProdEndTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTb13033BaSvcProdEndTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTb13033BaSvcProdEndTs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tb13033OrigSvcProdEffTs
	 *	@return tb13033OrigSvcProdEffTs
	 */
   public char[] getTb13033OrigSvcProdEffTs() throws CFException{
     if (isTb13033OrigSvcProdEffTsModified()) { 
        tb13033OrigSvcProdEffTs = refreshTb13033OrigSvcProdEffTs();
     }
   		return tb13033OrigSvcProdEffTs;
   }

  
	/**
	*  set variable tb13033OrigSvcProdEffTs
	*  Corresponding COBOL Variable is TB13033-ORIG-SVC-PROD-EFF-TS
	*  @param value
	**/
   public void setTb13033OrigSvcProdEffTs(char[] value) {
      tb13033OrigSvcProdEffTs = checkTb13033OrigSvcProdEffTsConstraints(value);
      serializeTb13033OrigSvcProdEffTs(tb13033OrigSvcProdEffTs);
   } 

     /**
	 * 	Update Tb13033OrigSvcProdEffTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTb13033OrigSvcProdEffTs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTb13033OrigSvcProdEffTs,tb13033OrigSvcProdEffTs.length);
   	
   }
   
   public void setTb13033OrigSvcProdEffTs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTb13033OrigSvcProdEffTs,tb13033OrigSvcProdEffTs.length);
   	
   }
   
     /**
	 * 	Update Tb13033OrigSvcProdEffTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTb13033OrigSvcProdEffTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTb13033OrigSvcProdEffTs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Tb13033OrigSvcProdEffTs with another Field
	 *	@param value
	 */
   public void setTb13033OrigSvcProdEffTs(Field source) {
       replace(source,0,source.length(),beginTb13033OrigSvcProdEffTs,TB_13033_ORIG_SVC_PROD_EFF_TS_LEN);
   	
   }  
   
     /**
	 * 	Update Tb13033OrigSvcProdEffTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTb13033OrigSvcProdEffTs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTb13033OrigSvcProdEffTs,TB_13033_ORIG_SVC_PROD_EFF_TS_LEN);
   	
   }
   
     /**
	 * 	Update Tb13033OrigSvcProdEffTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTb13033OrigSvcProdEffTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTb13033OrigSvcProdEffTs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tb13033OrigSvcProdUniqId
	 *	@return tb13033OrigSvcProdUniqId
	 */
	public int getTb13033OrigSvcProdUniqId() throws CFException {
        if (isTb13033OrigSvcProdUniqIdModified()) { 
           tb13033OrigSvcProdUniqId = refreshTb13033OrigSvcProdUniqId();
        }
   		return tb13033OrigSvcProdUniqId;
	}
	
	/**
	 * 	Update Tb13033OrigSvcProdUniqId with the passed value
	 *  Corresponding COBOL Variable is TB13033-ORIG-SVC-PROD-UNIQ-ID
	 *	@param number
	 */
	public void setTb13033OrigSvcProdUniqId(int number) {
	     // Truncate if the number is beyond +/- Max range
	    tb13033OrigSvcProdUniqId = checkTb13033OrigSvcProdUniqIdMaxLimit(number); 
		serializeTb13033OrigSvcProdUniqId(tb13033OrigSvcProdUniqId);
	}


	public void setTb13033OrigSvcProdUniqId(long number) {
	    number = checkTb13033OrigSvcProdUniqIdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb13033OrigSvcProdUniqId((int)number);
	}
	
	/**
	 *	Returns the value of tb13033VisionUserIdCd
	 *	@return tb13033VisionUserIdCd
	 */
   public char[] getTb13033VisionUserIdCd() throws CFException{
     if (isTb13033VisionUserIdCdModified()) { 
        tb13033VisionUserIdCd = refreshTb13033VisionUserIdCd();
     }
   		return tb13033VisionUserIdCd;
   }

  
	/**
	*  set variable tb13033VisionUserIdCd
	*  Corresponding COBOL Variable is TB13033-VISION-USER-ID-CD
	*  @param value
	**/
   public void setTb13033VisionUserIdCd(char[] value) {
      tb13033VisionUserIdCd = checkTb13033VisionUserIdCdConstraints(value);
      serializeTb13033VisionUserIdCd(tb13033VisionUserIdCd);
   } 

     /**
	 * 	Update Tb13033VisionUserIdCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTb13033VisionUserIdCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTb13033VisionUserIdCd,tb13033VisionUserIdCd.length);
   	
   }
   
   public void setTb13033VisionUserIdCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTb13033VisionUserIdCd,tb13033VisionUserIdCd.length);
   	
   }
   
     /**
	 * 	Update Tb13033VisionUserIdCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTb13033VisionUserIdCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTb13033VisionUserIdCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Tb13033VisionUserIdCd with another Field
	 *	@param value
	 */
   public void setTb13033VisionUserIdCd(Field source) {
       replace(source,0,source.length(),beginTb13033VisionUserIdCd,TB_13033_VISION_USER_ID_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Tb13033VisionUserIdCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTb13033VisionUserIdCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTb13033VisionUserIdCd,TB_13033_VISION_USER_ID_CD_LEN);
   	
   }
   
     /**
	 * 	Update Tb13033VisionUserIdCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTb13033VisionUserIdCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTb13033VisionUserIdCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tb13033DbUserid
	 *	@return tb13033DbUserid
	 */
   public char[] getTb13033DbUserid() throws CFException{
     if (isTb13033DbUseridModified()) { 
        tb13033DbUserid = refreshTb13033DbUserid();
     }
   		return tb13033DbUserid;
   }

  
	/**
	*  set variable tb13033DbUserid
	*  Corresponding COBOL Variable is TB13033-DB-USERID
	*  @param value
	**/
   public void setTb13033DbUserid(char[] value) {
      tb13033DbUserid = checkTb13033DbUseridConstraints(value);
      serializeTb13033DbUserid(tb13033DbUserid);
   } 

     /**
	 * 	Update Tb13033DbUserid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTb13033DbUserid(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTb13033DbUserid,tb13033DbUserid.length);
   	
   }
   
   public void setTb13033DbUserid(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTb13033DbUserid,tb13033DbUserid.length);
   	
   }
   
     /**
	 * 	Update Tb13033DbUserid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTb13033DbUserid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTb13033DbUserid+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Tb13033DbUserid with another Field
	 *	@param value
	 */
   public void setTb13033DbUserid(Field source) {
       replace(source,0,source.length(),beginTb13033DbUserid,TB_13033_DB_USERID_LEN);
   	
   }  
   
     /**
	 * 	Update Tb13033DbUserid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTb13033DbUserid(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTb13033DbUserid,TB_13033_DB_USERID_LEN);
   	
   }
   
     /**
	 * 	Update Tb13033DbUserid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTb13033DbUserid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTb13033DbUserid+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tb13033DbTmstamp
	 *	@return tb13033DbTmstamp
	 */
   public char[] getTb13033DbTmstamp() throws CFException{
     if (isTb13033DbTmstampModified()) { 
        tb13033DbTmstamp = refreshTb13033DbTmstamp();
     }
   		return tb13033DbTmstamp;
   }

  
	/**
	*  set variable tb13033DbTmstamp
	*  Corresponding COBOL Variable is TB13033-DB-TMSTAMP
	*  @param value
	**/
   public void setTb13033DbTmstamp(char[] value) {
      tb13033DbTmstamp = checkTb13033DbTmstampConstraints(value);
      serializeTb13033DbTmstamp(tb13033DbTmstamp);
   } 

     /**
	 * 	Update Tb13033DbTmstamp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTb13033DbTmstamp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTb13033DbTmstamp,tb13033DbTmstamp.length);
   	
   }
   
   public void setTb13033DbTmstamp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTb13033DbTmstamp,tb13033DbTmstamp.length);
   	
   }
   
     /**
	 * 	Update Tb13033DbTmstamp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTb13033DbTmstamp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTb13033DbTmstamp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Tb13033DbTmstamp with another Field
	 *	@param value
	 */
   public void setTb13033DbTmstamp(Field source) {
       replace(source,0,source.length(),beginTb13033DbTmstamp,TB_13033_DB_TMSTAMP_LEN);
   	
   }  
   
     /**
	 * 	Update Tb13033DbTmstamp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTb13033DbTmstamp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTb13033DbTmstamp,TB_13033_DB_TMSTAMP_LEN);
   	
   }
   
     /**
	 * 	Update Tb13033DbTmstamp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTb13033DbTmstamp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTb13033DbTmstamp+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tb13033OutletId
	 *	@return tb13033OutletId
	 */
	public int getTb13033OutletId() throws CFException {
        if (isTb13033OutletIdModified()) { 
           tb13033OutletId = refreshTb13033OutletId();
        }
   		return tb13033OutletId;
	}
	
	/**
	 * 	Update Tb13033OutletId with the passed value
	 *  Corresponding COBOL Variable is TB13033-OUTLET-ID
	 *	@param number
	 */
	public void setTb13033OutletId(int number) {
	     // Truncate if the number is beyond +/- Max range
	    tb13033OutletId = checkTb13033OutletIdMaxLimit(number); 
		serializeTb13033OutletId(tb13033OutletId);
	}


	public void setTb13033OutletId(long number) {
	    number = checkTb13033OutletIdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb13033OutletId((int)number);
	}
	
	/**
	 *	Returns the value of tb13033SlsRepId
	 *	@return tb13033SlsRepId
	 */
   public char[] getTb13033SlsRepId() throws CFException{
     if (isTb13033SlsRepIdModified()) { 
        tb13033SlsRepId = refreshTb13033SlsRepId();
     }
   		return tb13033SlsRepId;
   }

  
	/**
	*  set variable tb13033SlsRepId
	*  Corresponding COBOL Variable is TB13033-SLS-REP-ID
	*  @param value
	**/
   public void setTb13033SlsRepId(char[] value) {
      tb13033SlsRepId = checkTb13033SlsRepIdConstraints(value);
      serializeTb13033SlsRepId(tb13033SlsRepId);
   } 

     /**
	 * 	Update Tb13033SlsRepId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTb13033SlsRepId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTb13033SlsRepId,tb13033SlsRepId.length);
   	
   }
   
   public void setTb13033SlsRepId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTb13033SlsRepId,tb13033SlsRepId.length);
   	
   }
   
     /**
	 * 	Update Tb13033SlsRepId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTb13033SlsRepId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTb13033SlsRepId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Tb13033SlsRepId with another Field
	 *	@param value
	 */
   public void setTb13033SlsRepId(Field source) {
       replace(source,0,source.length(),beginTb13033SlsRepId,TB_13033_SLS_REP_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Tb13033SlsRepId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTb13033SlsRepId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTb13033SlsRepId,TB_13033_SLS_REP_ID_LEN);
   	
   }
   
     /**
	 * 	Update Tb13033SlsRepId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTb13033SlsRepId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTb13033SlsRepId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tb13033CreateTs
	 *	@return tb13033CreateTs
	 */
   public char[] getTb13033CreateTs() throws CFException{
     if (isTb13033CreateTsModified()) { 
        tb13033CreateTs = refreshTb13033CreateTs();
     }
   		return tb13033CreateTs;
   }

  
	/**
	*  set variable tb13033CreateTs
	*  Corresponding COBOL Variable is TB13033-CREATE-TS
	*  @param value
	**/
   public void setTb13033CreateTs(char[] value) {
      tb13033CreateTs = checkTb13033CreateTsConstraints(value);
      serializeTb13033CreateTs(tb13033CreateTs);
   } 

     /**
	 * 	Update Tb13033CreateTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTb13033CreateTs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTb13033CreateTs,tb13033CreateTs.length);
   	
   }
   
   public void setTb13033CreateTs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTb13033CreateTs,tb13033CreateTs.length);
   	
   }
   
     /**
	 * 	Update Tb13033CreateTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTb13033CreateTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTb13033CreateTs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Tb13033CreateTs with another Field
	 *	@param value
	 */
   public void setTb13033CreateTs(Field source) {
       replace(source,0,source.length(),beginTb13033CreateTs,TB_13033_CREATE_TS_LEN);
   	
   }  
   
     /**
	 * 	Update Tb13033CreateTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTb13033CreateTs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTb13033CreateTs,TB_13033_CREATE_TS_LEN);
   	
   }
   
     /**
	 * 	Update Tb13033CreateTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTb13033CreateTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTb13033CreateTs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tb13033OrdLnProdUniqueId
	 *	@return tb13033OrdLnProdUniqueId
	 */
	public int getTb13033OrdLnProdUniqueId() throws CFException {
        if (isTb13033OrdLnProdUniqueIdModified()) { 
           tb13033OrdLnProdUniqueId = refreshTb13033OrdLnProdUniqueId();
        }
   		return tb13033OrdLnProdUniqueId;
	}
	
	/**
	 * 	Update Tb13033OrdLnProdUniqueId with the passed value
	 *  Corresponding COBOL Variable is TB13033-ORD-LN-PROD-UNIQUE-ID
	 *	@param number
	 */
	public void setTb13033OrdLnProdUniqueId(int number) {
	     // Truncate if the number is beyond +/- Max range
	    tb13033OrdLnProdUniqueId = checkTb13033OrdLnProdUniqueIdMaxLimit(number); 
		serializeTb13033OrdLnProdUniqueId(tb13033OrdLnProdUniqueId);
	}


	public void setTb13033OrdLnProdUniqueId(long number) {
	    number = checkTb13033OrdLnProdUniqueIdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb13033OrdLnProdUniqueId((int)number);
	}
	
	/**
	 *	Returns the value of tb13033ProdIdTrig
	 *	@return tb13033ProdIdTrig
	 */
	public int getTb13033ProdIdTrig() throws CFException {
        if (isTb13033ProdIdTrigModified()) { 
           tb13033ProdIdTrig = refreshTb13033ProdIdTrig();
        }
   		return tb13033ProdIdTrig;
	}
	
	/**
	 * 	Update Tb13033ProdIdTrig with the passed value
	 *  Corresponding COBOL Variable is TB13033-PROD-ID-TRIG
	 *	@param number
	 */
	public void setTb13033ProdIdTrig(int number) {
	     // Truncate if the number is beyond +/- Max range
	    tb13033ProdIdTrig = checkTb13033ProdIdTrigMaxLimit(number); 
		serializeTb13033ProdIdTrig(tb13033ProdIdTrig);
	}


	public void setTb13033ProdIdTrig(long number) {
	    number = checkTb13033ProdIdTrigMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTb13033ProdIdTrig((int)number);
	}
	

	
	
	
	/**
	 * 	initializes DclBlAcctSvcProd
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setTb13033CustIdNo(0);
                     setTb13033AcctNo(0);
                     setTb13033SvcProdId(0);
         setTb13033BaSvcProdEffTs(CONSTANTS.SPACE_26);
                     setTb13033SvcProdUniqueId(0);
         setTb13033SvcProdExpireDt(CONSTANTS.SPACE_10);
         setTb13033SvcProdReinstatInd(CONSTANTS.SPACE);
                     setTb13033RuleGrpIdLast(0);
         setTb13033BaSvcProdEndTs(CONSTANTS.SPACE_26);
         setTb13033OrigSvcProdEffTs(CONSTANTS.SPACE_26);
                     setTb13033OrigSvcProdUniqId(0);
         setTb13033VisionUserIdCd(CONSTANTS.SPACE_8);
         setTb13033DbUserid(CONSTANTS.SPACE_8);
         setTb13033DbTmstamp(CONSTANTS.SPACE_26);
                     setTb13033OutletId(0);
         setTb13033SlsRepId(CONSTANTS.SPACE_5);
         setTb13033CreateTs(CONSTANTS.SPACE_26);
                     setTb13033OrdLnProdUniqueId(0);
                     setTb13033ProdIdTrig(0);
   }

		public static int getDclBlAcctSvcProdFieldLength() {
			return DCL_BL_ACCT_SVC_PROD_LENGTH;
		}

}
  

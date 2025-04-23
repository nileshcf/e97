package com.cloudframe.app.ip989010.dto;

/**
*  The class WorkAreas800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:08. using version 5.0.0.254
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


public class WorkAreas800 extends WorkAreas800Serialized {
   
				private Tag800 tag800 = new Tag800();

								private long trnAmt8001240;

								private long trnAmt8001740;

								private long acqAmt800;

								private long issAmt800;

								private long mcAmt800;

								private long merchAmt800;

								private long rcvr8001740;
				private De31800 de31800 = new De31800();

						private char[] de43s1800 = new char[80];

								private int de43s1Len800;

						private char[] de63s2800 = new char[15];

								private int fieldLen800;

								private int fieldPtr800;

								private long fldStrt800;

						private char[] fieldVal800 = new char[999];

						private char[] fileid800 = new char[25];

						private char[] fundOpt800 = new char[1];
				private CurrentDate800 currentDate800 = new CurrentDate800();

								private long internalMbrId800;

						private char[] indent800 = new char[12];

								private int ilvl800;

								private long julianDate800;
				private LuhnsWorkArea800 luhnsWorkArea800 = new LuhnsWorkArea800();

						private char[] mccCd800 = new char[4];

								private int mccCdLen800;

						private char[] merchId800 = new char[15];

								private int merchIdLen800;

						private char[] newElem800 = Field.fillLowValue(13);
				private NewElemData800 newElemData800 = new NewElemData800();

						private char[] pan800 = new char[16];

								private int panLen800;

								private long ptrVal800;

								private BigDecimal random800 = BigDecimal.ZERO;
				private RandomX800 randomX800 = new RandomX800();

						private char[] revInd800 = new char[1];

								private int revIndLen800;

								private long rewardAmt800;

								private long rewardPgmId800;

						private char[] saveEntry800 = new char[1015];

								private int saveTagNum800;

								private long seed800;

						private char[] sender800 = new char[11];

								private long seqNum8800;

								private long seqNumP0137800;

								private long sys101Rdw800;

								private long sys201Rdw800;

						private char[] sys001Status800 = new char[2];

						private char[] sys002Status800 = new char[2];

						private char[] sys005Status800 = new char[2];

						private char[] sys003Status800 = new char[2];

						private char[] sys004Status800 = new char[2];

						private char[] sys101Status800 = new char[2];

						private char[] sys201Status800 = new char[2];

						private char[] sys202Status800 = new char[2];

						private char[] sys204Status800 = new char[2];

						private char[] sys205Status800 = new char[2];

								private long tagTblPtr800;

						private char[] tranAmt800 = new char[12];

								private int tranAmtLen800;

						private char[] type1800 = new char[22];

								private long ica1800;

								private long bin1800;

								private long maid1800;

								private long endpoint1800;

						private char[] type2800 = new char[22];

								private long ica2800;

								private long bin2800;

								private long maid2800;

								private long endpoint2800;

								private long donationAmount800;

						private char[] ird800 = new char[2];
	
	/**
	* Constructor for WorkAreas800
	**/
    public WorkAreas800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			tag800.setParent(this,getStartOffset() + 0);
	       			de31800.setParent(this,getStartOffset() + 107);
	       			currentDate800.setParent(this,getStartOffset() + 1264);
	       			luhnsWorkArea800.setParent(this,getStartOffset() + 1302);
	       			newElemData800.setParent(this,getStartOffset() + 1346);
	       			randomX800.setParent(this,getStartOffset() + 2375);
	   	/*  end of offset */
								setTrnAmt8001240(0L);
								setTrnAmt8001740(0L);
								setAcqAmt800(0L);
								setIssAmt800(0L);
								setMcAmt800(0L);
								setMerchAmt800(0L);
								setRcvr8001740(0L);
								setDe43s1800(pad(80," ".toCharArray(),' ',RIGHT_PAD));
								setDe43s1Len800(0);
								setDe63s2800(String.join("", java.util.Collections.nCopies(15, "9")).toCharArray());
								setFieldLen800(0);
								setFieldPtr800(0);
								setFldStrt800(0L);
								setFieldVal800(pad(999," ".toCharArray(),' ',RIGHT_PAD));
								setFileid800("0000000000000000000000000".toCharArray());
								setFundOpt800("0".toCharArray());
								setInternalMbrId800(0L);
								setIndent800(fillSpace(12));
								setIlvl800(3);
								setJulianDate800(0L);
								setMccCd800(fillSpace(4));
								setMccCdLen800(0);
								setMerchId800(fillSpace(15));
								setMerchIdLen800(0);
								setPan800(fillSpace(16));
								setPanLen800(0);
								setPtrVal800(0L);
								setRandom800(BigDecimal.ZERO);
								setRevInd800(fillSpace(1));
								setRevIndLen800(0);
								setRewardAmt800(0L);
								setRewardPgmId800(0L);
								setSaveEntry800(pad(1015," ".toCharArray(),' ',RIGHT_PAD));
								setSaveTagNum800(0);
								setSeed800(0L);
								setSender800(fillSpace(11));
								setSeqNum8800(0L);
								setSeqNumP0137800(0L);
								setSys001Status800(fillSpace(2));
								setSys002Status800(fillSpace(2));
								setSys005Status800(fillSpace(2));
								setSys003Status800(fillSpace(2));
								setSys004Status800(fillSpace(2));
								setSys101Status800(fillSpace(2));
								setSys201Status800(fillSpace(2));
								setSys202Status800(fillSpace(2));
								setSys204Status800(fillSpace(2));
								setSys205Status800(fillSpace(2));
								setTagTblPtr800(0L);
								setTranAmt800("000000000000".toCharArray());
								setTranAmtLen800(0);
								setType1800(fillSpace(22));
								setIca1800(0L);
								setBin1800(0L);
								setMaid1800(0L);
								setEndpoint1800(0L);
								setType2800(fillSpace(22));
								setIca2800(0L);
								setBin2800(0L);
								setMaid2800(0L);
								setEndpoint2800(0L);
								setDonationAmount800(0L);
								setIrd800(fillSpace(2));
    }


 

	/**
	 *	Returns the value of tag800
	 *	@return tag800
	 */   
	 public Tag800 getTag800() {
   	return tag800;
   }
   /**
	* 	Update Tag800 with the passed value
	*   Corresponding COBOL Variable is 800-TAG
	*	@param value
	*/
   public void setTag800(char[] value) {
      tag800.setString(value); 
   }   
    
     /**
	 * 	Update Tag800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setTag800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,tag800.begin,tag800.length());
   }
   
     /**
	 * 	Update Tag800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTag800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,tag800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Tag800 with another Field
	 *	@param value
	 */
   public void setTag800(Field source) {
   	replace(source,0,source.length(),tag800.begin,tag800.length());
   }  
   
     /**
	 * 	Update Tag800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setTag800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,tag800.begin,tag800.length());
   }
   
     /**
	 * 	Update Tag800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTag800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,tag800.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of trnAmt8001240
	 *	@return trnAmt8001240
	 */
	public long getTrnAmt8001240() throws CFException {
       if (isTrnAmt8001240Modified()) { 
           trnAmt8001240 = refreshTrnAmt8001240();
        }
   		return trnAmt8001240;
	}
	

	
	   
	/**
	 * 	Update TrnAmt8001240 with the passed value
	 *  Corresponding COBOL Variable is 800-1240-TRN-AMT
	 *	@param number
	 */
	public void setTrnAmt8001240(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    trnAmt8001240 = checkTrnAmt8001240MaxLimit(number); 
		serializeTrnAmt8001240(trnAmt8001240);
	}
	

	/**
	 * 	Update TrnAmt8001240 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTrnAmt8001240(char[] value) throws CFException {
		 trnAmt8001240 = serializeTrnAmt8001240(value);
	}
	/**
	 * 	Update TrnAmt8001240 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTrnAmt8001240String(char[] value) throws CFException {
		 setTrnAmt8001240(value);
	}
	/**
	 *	Returns the value of trnAmt8001740
	 *	@return trnAmt8001740
	 */
	public long getTrnAmt8001740() throws CFException {
       if (isTrnAmt8001740Modified()) { 
           trnAmt8001740 = refreshTrnAmt8001740();
        }
   		return trnAmt8001740;
	}
	

	
	   
	/**
	 * 	Update TrnAmt8001740 with the passed value
	 *  Corresponding COBOL Variable is 800-1740-TRN-AMT
	 *	@param number
	 */
	public void setTrnAmt8001740(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    trnAmt8001740 = checkTrnAmt8001740MaxLimit(number); 
		serializeTrnAmt8001740(trnAmt8001740);
	}
	

	/**
	 * 	Update TrnAmt8001740 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTrnAmt8001740(char[] value) throws CFException {
		 trnAmt8001740 = serializeTrnAmt8001740(value);
	}
	/**
	 * 	Update TrnAmt8001740 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTrnAmt8001740String(char[] value) throws CFException {
		 setTrnAmt8001740(value);
	}
	/**
	 *	Returns the value of acqAmt800
	 *	@return acqAmt800
	 */
	public long getAcqAmt800() throws CFException {
       if (isAcqAmt800Modified()) { 
           acqAmt800 = refreshAcqAmt800();
        }
   		return acqAmt800;
	}
	

	
	   
	/**
	 * 	Update AcqAmt800 with the passed value
	 *  Corresponding COBOL Variable is 800-ACQ-AMT
	 *	@param number
	 */
	public void setAcqAmt800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    acqAmt800 = checkAcqAmt800MaxLimit(number); 
		serializeAcqAmt800(acqAmt800);
	}
	

	/**
	 * 	Update AcqAmt800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAcqAmt800(char[] value) throws CFException {
		 acqAmt800 = serializeAcqAmt800(value);
	}
	/**
	 * 	Update AcqAmt800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAcqAmt800String(char[] value) throws CFException {
		 setAcqAmt800(value);
	}
	/**
	 *	Returns the value of issAmt800
	 *	@return issAmt800
	 */
	public long getIssAmt800() throws CFException {
       if (isIssAmt800Modified()) { 
           issAmt800 = refreshIssAmt800();
        }
   		return issAmt800;
	}
	

	
	   
	/**
	 * 	Update IssAmt800 with the passed value
	 *  Corresponding COBOL Variable is 800-ISS-AMT
	 *	@param number
	 */
	public void setIssAmt800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    issAmt800 = checkIssAmt800MaxLimit(number); 
		serializeIssAmt800(issAmt800);
	}
	

	/**
	 * 	Update IssAmt800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIssAmt800(char[] value) throws CFException {
		 issAmt800 = serializeIssAmt800(value);
	}
	/**
	 * 	Update IssAmt800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIssAmt800String(char[] value) throws CFException {
		 setIssAmt800(value);
	}
	/**
	 *	Returns the value of mcAmt800
	 *	@return mcAmt800
	 */
	public long getMcAmt800() throws CFException {
       if (isMcAmt800Modified()) { 
           mcAmt800 = refreshMcAmt800();
        }
   		return mcAmt800;
	}
	

	
	   
	/**
	 * 	Update McAmt800 with the passed value
	 *  Corresponding COBOL Variable is 800-MC-AMT
	 *	@param number
	 */
	public void setMcAmt800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    mcAmt800 = checkMcAmt800MaxLimit(number); 
		serializeMcAmt800(mcAmt800);
	}
	

	/**
	 * 	Update McAmt800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMcAmt800(char[] value) throws CFException {
		 mcAmt800 = serializeMcAmt800(value);
	}
	/**
	 * 	Update McAmt800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMcAmt800String(char[] value) throws CFException {
		 setMcAmt800(value);
	}
	/**
	 *	Returns the value of merchAmt800
	 *	@return merchAmt800
	 */
	public long getMerchAmt800() throws CFException {
       if (isMerchAmt800Modified()) { 
           merchAmt800 = refreshMerchAmt800();
        }
   		return merchAmt800;
	}
	

	
	   
	/**
	 * 	Update MerchAmt800 with the passed value
	 *  Corresponding COBOL Variable is 800-MERCH-AMT
	 *	@param number
	 */
	public void setMerchAmt800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    merchAmt800 = checkMerchAmt800MaxLimit(number); 
		serializeMerchAmt800(merchAmt800);
	}
	

	/**
	 * 	Update MerchAmt800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMerchAmt800(char[] value) throws CFException {
		 merchAmt800 = serializeMerchAmt800(value);
	}
	/**
	 * 	Update MerchAmt800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMerchAmt800String(char[] value) throws CFException {
		 setMerchAmt800(value);
	}
	/**
	 *	Returns the value of rcvr8001740
	 *	@return rcvr8001740
	 */
	public long getRcvr8001740() throws CFException {
       if (isRcvr8001740Modified()) { 
           rcvr8001740 = refreshRcvr8001740();
        }
   		return rcvr8001740;
	}
	

	
	   
	/**
	 * 	Update Rcvr8001740 with the passed value
	 *  Corresponding COBOL Variable is 800-1740-RCVR
	 *	@param number
	 */
	public void setRcvr8001740(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    rcvr8001740 = checkRcvr8001740MaxLimit(number); 
		serializeRcvr8001740(rcvr8001740);
	}
	

	/**
	 * 	Update Rcvr8001740 with the passed value
	 *	@param value (String or char[])
	 */
	public void setRcvr8001740(char[] value) throws CFException {
		 rcvr8001740 = serializeRcvr8001740(value);
	}
	/**
	 * 	Update Rcvr8001740 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRcvr8001740String(char[] value) throws CFException {
		 setRcvr8001740(value);
	}
	/**
	 *	Returns the value of de31800
	 *	@return de31800
	 */   
	 public De31800 getDe31800() {
   	return de31800;
   }
   /**
	* 	Update De31800 with the passed value
	*   Corresponding COBOL Variable is 800-DE31
	*	@param value
	*/
   public void setDe31800(char[] value) {
      de31800.setString(value); 
   }   
    
     /**
	 * 	Update De31800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDe31800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,de31800.begin,de31800.length());
   }
   
     /**
	 * 	Update De31800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDe31800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,de31800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update De31800 with another Field
	 *	@param value
	 */
   public void setDe31800(Field source) {
   	replace(source,0,source.length(),de31800.begin,de31800.length());
   }  
   
     /**
	 * 	Update De31800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDe31800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,de31800.begin,de31800.length());
   }
   
     /**
	 * 	Update De31800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDe31800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,de31800.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of de43s1800
	 *	@return de43s1800
	 */
   public char[] getDe43s1800() throws CFException{
     if (isDe43s1800Modified()) { 
        de43s1800 = refreshDe43s1800();
     }
   		return de43s1800;
   }

  
	/**
	*  set variable de43s1800
	*  Corresponding COBOL Variable is 800-DE43S1
	*  @param value
	**/
   public void setDe43s1800(char[] value) {
      de43s1800 = checkDe43s1800Constraints(value);
      serializeDe43s1800(de43s1800);
   } 

     /**
	 * 	Update De43s1800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDe43s1800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDe43s1800,de43s1800.length);
   	
   }
   
   public void setDe43s1800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDe43s1800,de43s1800.length);
   	
   }
   
     /**
	 * 	Update De43s1800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDe43s1800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDe43s1800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update De43s1800 with another Field
	 *	@param value
	 */
   public void setDe43s1800(Field source) {
       replace(source,0,source.length(),beginDe43s1800,DE_43S_1800_LEN);
   	
   }  
   
     /**
	 * 	Update De43s1800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDe43s1800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDe43s1800,DE_43S_1800_LEN);
   	
   }
   
     /**
	 * 	Update De43s1800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDe43s1800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDe43s1800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of de43s1Len800
	 *	@return de43s1Len800
	 */
	public int getDe43s1Len800() throws CFException {
       if (isDe43s1Len800Modified()) { 
           de43s1Len800 = refreshDe43s1Len800();
        }
   		return de43s1Len800;
	}
	

	
	   
	/**
	 * 	Update De43s1Len800 with the passed value
	 *  Corresponding COBOL Variable is 800-DE43S1-LEN
	 *	@param number
	 */
	public void setDe43s1Len800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    de43s1Len800 = checkDe43s1Len800MaxLimit(number); 
		serializeDe43s1Len800(de43s1Len800);
	}
	

	public void setDe43s1Len800(long number) {
	    number = checkDe43s1Len800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setDe43s1Len800((int)number);
	}
	
	/**
	 * 	Update De43s1Len800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setDe43s1Len800(char[] value) throws CFException {
		 de43s1Len800 = serializeDe43s1Len800(value);
	}
	/**
	 * 	Update De43s1Len800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDe43s1Len800String(char[] value) throws CFException {
		 setDe43s1Len800(value);
	}
	/**
	 *	Returns the value of de63s2800
	 *	@return de63s2800
	 */
   public char[] getDe63s2800() throws CFException{
     if (isDe63s2800Modified()) { 
        de63s2800 = refreshDe63s2800();
     }
   		return de63s2800;
   }

  
	/**
	*  set variable de63s2800
	*  Corresponding COBOL Variable is 800-DE63S2
	*  @param value
	**/
   public void setDe63s2800(char[] value) {
      de63s2800 = checkDe63s2800Constraints(value);
      serializeDe63s2800(de63s2800);
   } 

     /**
	 * 	Update De63s2800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDe63s2800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDe63s2800,de63s2800.length);
   	
   }
   
   public void setDe63s2800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDe63s2800,de63s2800.length);
   	
   }
   
     /**
	 * 	Update De63s2800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDe63s2800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDe63s2800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update De63s2800 with another Field
	 *	@param value
	 */
   public void setDe63s2800(Field source) {
       replace(source,0,source.length(),beginDe63s2800,DE_63S_2800_LEN);
   	
   }  
   
     /**
	 * 	Update De63s2800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDe63s2800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDe63s2800,DE_63S_2800_LEN);
   	
   }
   
     /**
	 * 	Update De63s2800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDe63s2800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDe63s2800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fieldLen800
	 *	@return fieldLen800
	 */
	public int getFieldLen800() throws CFException {
       if (isFieldLen800Modified()) { 
           fieldLen800 = refreshFieldLen800();
        }
   		return fieldLen800;
	}
	

	
	   
	/**
	 * 	Update FieldLen800 with the passed value
	 *  Corresponding COBOL Variable is 800-FIELD-LEN
	 *	@param number
	 */
	public void setFieldLen800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    fieldLen800 = checkFieldLen800MaxLimit(number); 
		serializeFieldLen800(fieldLen800);
	}
	

	public void setFieldLen800(long number) {
	    number = checkFieldLen800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setFieldLen800((int)number);
	}
	
	/**
	 * 	Update FieldLen800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setFieldLen800(char[] value) throws CFException {
		 fieldLen800 = serializeFieldLen800(value);
	}
	/**
	 * 	Update FieldLen800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFieldLen800String(char[] value) throws CFException {
		 setFieldLen800(value);
	}
	/**
	 *	Returns the value of fieldPtr800
	 *	@return fieldPtr800
	 */
	public int getFieldPtr800() throws CFException {
       if (isFieldPtr800Modified()) { 
           fieldPtr800 = refreshFieldPtr800();
        }
   		return fieldPtr800;
	}
	

	
	   
	/**
	 * 	Update FieldPtr800 with the passed value
	 *  Corresponding COBOL Variable is 800-FIELD-PTR
	 *	@param number
	 */
	public void setFieldPtr800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    fieldPtr800 = checkFieldPtr800MaxLimit(number); 
		serializeFieldPtr800(fieldPtr800);
	}
	

	public void setFieldPtr800(long number) {
	    number = checkFieldPtr800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setFieldPtr800((int)number);
	}
	
	/**
	 * 	Update FieldPtr800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setFieldPtr800(char[] value) throws CFException {
		 fieldPtr800 = serializeFieldPtr800(value);
	}
	/**
	 * 	Update FieldPtr800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFieldPtr800String(char[] value) throws CFException {
		 setFieldPtr800(value);
	}
	/**
	 *	Returns the value of fldStrt800
	 *	@return fldStrt800
	 */
	public long getFldStrt800() throws CFException {
       if (isFldStrt800Modified()) { 
           fldStrt800 = refreshFldStrt800();
        }
   		return fldStrt800;
	}
	

	
	   
	/**
	 * 	Update FldStrt800 with the passed value
	 *  Corresponding COBOL Variable is 800-FLD-STRT
	 *	@param number
	 */
	public void setFldStrt800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    fldStrt800 = checkFldStrt800MaxLimit(number); 
		serializeFldStrt800(fldStrt800);
	}
	

	/**
	 * 	Update FldStrt800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setFldStrt800(char[] value) throws CFException {
		 fldStrt800 = serializeFldStrt800(value);
	}
	/**
	 * 	Update FldStrt800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFldStrt800String(char[] value) throws CFException {
		 setFldStrt800(value);
	}
	/**
	 *	Returns the value of fieldVal800
	 *	@return fieldVal800
	 */
   public char[] getFieldVal800() throws CFException{
     if (isFieldVal800Modified()) { 
        fieldVal800 = refreshFieldVal800();
     }
   		return fieldVal800;
   }

  
	/**
	*  set variable fieldVal800
	*  Corresponding COBOL Variable is 800-FIELD-VAL
	*  @param value
	**/
   public void setFieldVal800(char[] value) {
      fieldVal800 = checkFieldVal800Constraints(value);
      serializeFieldVal800(fieldVal800);
   } 

     /**
	 * 	Update FieldVal800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFieldVal800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFieldVal800,fieldVal800.length);
   	
   }
   
   public void setFieldVal800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFieldVal800,fieldVal800.length);
   	
   }
   
     /**
	 * 	Update FieldVal800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFieldVal800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFieldVal800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FieldVal800 with another Field
	 *	@param value
	 */
   public void setFieldVal800(Field source) {
       replace(source,0,source.length(),beginFieldVal800,FIELD_VAL_800_LEN);
   	
   }  
   
     /**
	 * 	Update FieldVal800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFieldVal800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFieldVal800,FIELD_VAL_800_LEN);
   	
   }
   
     /**
	 * 	Update FieldVal800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFieldVal800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFieldVal800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fileid800
	 *	@return fileid800
	 */
   public char[] getFileid800() throws CFException{
     if (isFileid800Modified()) { 
        fileid800 = refreshFileid800();
     }
   		return fileid800;
   }

  
	/**
	*  set variable fileid800
	*  Corresponding COBOL Variable is 800-FILEID
	*  @param value
	**/
   public void setFileid800(char[] value) {
      fileid800 = checkFileid800Constraints(value);
      serializeFileid800(fileid800);
   } 

     /**
	 * 	Update Fileid800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFileid800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFileid800,fileid800.length);
   	
   }
   
   public void setFileid800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFileid800,fileid800.length);
   	
   }
   
     /**
	 * 	Update Fileid800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFileid800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileid800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Fileid800 with another Field
	 *	@param value
	 */
   public void setFileid800(Field source) {
       replace(source,0,source.length(),beginFileid800,FILEID_800_LEN);
   	
   }  
   
     /**
	 * 	Update Fileid800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFileid800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFileid800,FILEID_800_LEN);
   	
   }
   
     /**
	 * 	Update Fileid800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFileid800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileid800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fundOpt800
	 *	@return fundOpt800
	 */
   public char[] getFundOpt800() throws CFException{
     if (isFundOpt800Modified()) { 
        fundOpt800 = refreshFundOpt800();
     }
   		return fundOpt800;
   }

  
	/**
	*  set variable fundOpt800
	*  Corresponding COBOL Variable is 800-FUND-OPT
	*  @param value
	**/
   public void setFundOpt800(char[] value) {
      fundOpt800 = checkFundOpt800Constraints(value);
      serializeFundOpt800(fundOpt800);
   } 

     /**
	 * 	Update FundOpt800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFundOpt800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFundOpt800,fundOpt800.length);
   	
   }
   
   public void setFundOpt800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFundOpt800,fundOpt800.length);
   	
   }
   
     /**
	 * 	Update FundOpt800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFundOpt800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFundOpt800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FundOpt800 with another Field
	 *	@param value
	 */
   public void setFundOpt800(Field source) {
       replace(source,0,source.length(),beginFundOpt800,FUND_OPT_800_LEN);
   	
   }  
   
     /**
	 * 	Update FundOpt800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFundOpt800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFundOpt800,FUND_OPT_800_LEN);
   	
   }
   
     /**
	 * 	Update FundOpt800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFundOpt800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFundOpt800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of currentDate800
	 *	@return currentDate800
	 */   
	 public CurrentDate800 getCurrentDate800() {
   	return currentDate800;
   }
   /**
	* 	Update CurrentDate800 with the passed value
	*   Corresponding COBOL Variable is 800-CURRENT-DATE
	*	@param value
	*/
   public void setCurrentDate800(char[] value) {
      currentDate800.setString(value); 
   }   
    
     /**
	 * 	Update CurrentDate800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCurrentDate800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,currentDate800.begin,currentDate800.length());
   }
   
     /**
	 * 	Update CurrentDate800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrentDate800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,currentDate800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CurrentDate800 with another Field
	 *	@param value
	 */
   public void setCurrentDate800(Field source) {
   	replace(source,0,source.length(),currentDate800.begin,currentDate800.length());
   }  
   
     /**
	 * 	Update CurrentDate800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCurrentDate800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,currentDate800.begin,currentDate800.length());
   }
   
     /**
	 * 	Update CurrentDate800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrentDate800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,currentDate800.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of internalMbrId800
	 *	@return internalMbrId800
	 */
	public long getInternalMbrId800() throws CFException {
       if (isInternalMbrId800Modified()) { 
           internalMbrId800 = refreshInternalMbrId800();
        }
   		return internalMbrId800;
	}
	

	
	   
	/**
	 * 	Update InternalMbrId800 with the passed value
	 *  Corresponding COBOL Variable is 800-INTERNAL-MBR-ID
	 *	@param number
	 */
	public void setInternalMbrId800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    internalMbrId800 = checkInternalMbrId800MaxLimit(number); 
		serializeInternalMbrId800(internalMbrId800);
	}
	

	/**
	 * 	Update InternalMbrId800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setInternalMbrId800(char[] value) throws CFException {
		 internalMbrId800 = serializeInternalMbrId800(value);
	}
	/**
	 * 	Update InternalMbrId800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setInternalMbrId800String(char[] value) throws CFException {
		 setInternalMbrId800(value);
	}
	/**
	 *	Returns the value of indent800
	 *	@return indent800
	 */
   public char[] getIndent800() throws CFException{
     if (isIndent800Modified()) { 
        indent800 = refreshIndent800();
     }
   		return indent800;
   }

  
	/**
	*  set variable indent800
	*  Corresponding COBOL Variable is 800-INDENT
	*  @param value
	**/
   public void setIndent800(char[] value) {
      indent800 = checkIndent800Constraints(value);
      serializeIndent800(indent800);
   } 

     /**
	 * 	Update Indent800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIndent800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIndent800,indent800.length);
   	
   }
   
   public void setIndent800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIndent800,indent800.length);
   	
   }
   
     /**
	 * 	Update Indent800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIndent800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIndent800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Indent800 with another Field
	 *	@param value
	 */
   public void setIndent800(Field source) {
       replace(source,0,source.length(),beginIndent800,INDENT_800_LEN);
   	
   }  
   
     /**
	 * 	Update Indent800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIndent800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIndent800,INDENT_800_LEN);
   	
   }
   
     /**
	 * 	Update Indent800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIndent800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIndent800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ilvl800
	 *	@return ilvl800
	 */
	public int getIlvl800() throws CFException {
       if (isIlvl800Modified()) { 
           ilvl800 = refreshIlvl800();
        }
   		return ilvl800;
	}
	

	
	   
	/**
	 * 	Update Ilvl800 with the passed value
	 *  Corresponding COBOL Variable is 800-ILVL
	 *	@param number
	 */
	public void setIlvl800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ilvl800 = checkIlvl800MaxLimit(number); 
		serializeIlvl800(ilvl800);
	}
	

	public void setIlvl800(long number) {
	    number = checkIlvl800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setIlvl800((int)number);
	}
	
	/**
	 * 	Update Ilvl800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIlvl800(char[] value) throws CFException {
		 ilvl800 = serializeIlvl800(value);
	}
	/**
	 * 	Update Ilvl800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIlvl800String(char[] value) throws CFException {
		 setIlvl800(value);
	}
	
	/**
	 *	Test condition 0 for isIlvl0800()
	 *	@return  Returns true if isIlvl0800() is 0
	 */
   public boolean isIlvl0800() throws CFException {
      return (  getIlvl800()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setIlvl0800True() {  			
    	setIlvl800( 0);
   	}
	
	/**
	 *	Test condition 3 for isIlvl1800()
	 *	@return  Returns true if isIlvl1800() is 3
	 */
   public boolean isIlvl1800() throws CFException {
      return (  getIlvl800()  ==  3  );
   }


	/**
	*  set values 3
	*/
   	public void setIlvl1800True() {  			
    	setIlvl800( 3);
   	}
	
	/**
	 *	Test condition 6 for isIlvl2800()
	 *	@return  Returns true if isIlvl2800() is 6
	 */
   public boolean isIlvl2800() throws CFException {
      return (  getIlvl800()  ==  6  );
   }


	/**
	*  set values 6
	*/
   	public void setIlvl2800True() {  			
    	setIlvl800( 6);
   	}
	
	/**
	 *	Test condition 9 for isIlvl3800()
	 *	@return  Returns true if isIlvl3800() is 9
	 */
   public boolean isIlvl3800() throws CFException {
      return (  getIlvl800()  ==  9  );
   }


	/**
	*  set values 9
	*/
   	public void setIlvl3800True() {  			
    	setIlvl800( 9);
   	}
	
	/**
	 *	Test condition 12 for isIlvl4800()
	 *	@return  Returns true if isIlvl4800() is 12
	 */
   public boolean isIlvl4800() throws CFException {
      return (  getIlvl800()  ==  12  );
   }


	/**
	*  set values 12
	*/
   	public void setIlvl4800True() {  			
    	setIlvl800( 12);
   	}
	/**
	 *	Returns the value of julianDate800
	 *	@return julianDate800
	 */
	public long getJulianDate800() throws CFException {
       if (isJulianDate800Modified()) { 
           julianDate800 = refreshJulianDate800();
        }
   		return julianDate800;
	}
	

	
	   
	/**
	 * 	Update JulianDate800 with the passed value
	 *  Corresponding COBOL Variable is 800-JULIAN-DATE
	 *	@param number
	 */
	public void setJulianDate800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    julianDate800 = checkJulianDate800MaxLimit(number); 
		serializeJulianDate800(julianDate800);
	}
	

	/**
	 * 	Update JulianDate800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setJulianDate800(char[] value) throws CFException {
		 julianDate800 = serializeJulianDate800(value);
	}
	/**
	 * 	Update JulianDate800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setJulianDate800String(char[] value) throws CFException {
		 setJulianDate800(value);
	}
	/**
	 *	Returns the value of luhnsWorkArea800
	 *	@return luhnsWorkArea800
	 */   
	 public LuhnsWorkArea800 getLuhnsWorkArea800() {
   	return luhnsWorkArea800;
   }
   /**
	* 	Update LuhnsWorkArea800 with the passed value
	*   Corresponding COBOL Variable is 800-LUHNS-WORK-AREA
	*	@param value
	*/
   public void setLuhnsWorkArea800(char[] value) {
      luhnsWorkArea800.setString(value); 
   }   
    
     /**
	 * 	Update LuhnsWorkArea800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setLuhnsWorkArea800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,luhnsWorkArea800.begin,luhnsWorkArea800.length());
   }
   
     /**
	 * 	Update LuhnsWorkArea800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLuhnsWorkArea800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,luhnsWorkArea800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update LuhnsWorkArea800 with another Field
	 *	@param value
	 */
   public void setLuhnsWorkArea800(Field source) {
   	replace(source,0,source.length(),luhnsWorkArea800.begin,luhnsWorkArea800.length());
   }  
   
     /**
	 * 	Update LuhnsWorkArea800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setLuhnsWorkArea800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,luhnsWorkArea800.begin,luhnsWorkArea800.length());
   }
   
     /**
	 * 	Update LuhnsWorkArea800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLuhnsWorkArea800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,luhnsWorkArea800.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of mccCd800
	 *	@return mccCd800
	 */
   public char[] getMccCd800() throws CFException{
     if (isMccCd800Modified()) { 
        mccCd800 = refreshMccCd800();
     }
   		return mccCd800;
   }

  
	/**
	*  set variable mccCd800
	*  Corresponding COBOL Variable is 800-MCC-CD
	*  @param value
	**/
   public void setMccCd800(char[] value) {
      mccCd800 = checkMccCd800Constraints(value);
      serializeMccCd800(mccCd800);
   } 

     /**
	 * 	Update MccCd800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMccCd800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMccCd800,mccCd800.length);
   	
   }
   
   public void setMccCd800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMccCd800,mccCd800.length);
   	
   }
   
     /**
	 * 	Update MccCd800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMccCd800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMccCd800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MccCd800 with another Field
	 *	@param value
	 */
   public void setMccCd800(Field source) {
       replace(source,0,source.length(),beginMccCd800,MCC_CD_800_LEN);
   	
   }  
   
     /**
	 * 	Update MccCd800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMccCd800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMccCd800,MCC_CD_800_LEN);
   	
   }
   
     /**
	 * 	Update MccCd800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMccCd800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMccCd800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mccCdLen800
	 *	@return mccCdLen800
	 */
	public int getMccCdLen800() throws CFException {
       if (isMccCdLen800Modified()) { 
           mccCdLen800 = refreshMccCdLen800();
        }
   		return mccCdLen800;
	}
	

	
	   
	/**
	 * 	Update MccCdLen800 with the passed value
	 *  Corresponding COBOL Variable is 800-MCC-CD-LEN
	 *	@param number
	 */
	public void setMccCdLen800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    mccCdLen800 = checkMccCdLen800MaxLimit(number); 
		serializeMccCdLen800(mccCdLen800);
	}
	

	public void setMccCdLen800(long number) {
	    number = checkMccCdLen800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setMccCdLen800((int)number);
	}
	
	/**
	 * 	Update MccCdLen800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMccCdLen800(char[] value) throws CFException {
		 mccCdLen800 = serializeMccCdLen800(value);
	}
	/**
	 * 	Update MccCdLen800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMccCdLen800String(char[] value) throws CFException {
		 setMccCdLen800(value);
	}
	/**
	 *	Returns the value of merchId800
	 *	@return merchId800
	 */
   public char[] getMerchId800() throws CFException{
     if (isMerchId800Modified()) { 
        merchId800 = refreshMerchId800();
     }
   		return merchId800;
   }

  
	/**
	*  set variable merchId800
	*  Corresponding COBOL Variable is 800-MERCH-ID
	*  @param value
	**/
   public void setMerchId800(char[] value) {
      merchId800 = checkMerchId800Constraints(value);
      serializeMerchId800(merchId800);
   } 

     /**
	 * 	Update MerchId800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMerchId800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMerchId800,merchId800.length);
   	
   }
   
   public void setMerchId800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMerchId800,merchId800.length);
   	
   }
   
     /**
	 * 	Update MerchId800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMerchId800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMerchId800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MerchId800 with another Field
	 *	@param value
	 */
   public void setMerchId800(Field source) {
       replace(source,0,source.length(),beginMerchId800,MERCH_ID_800_LEN);
   	
   }  
   
     /**
	 * 	Update MerchId800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMerchId800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMerchId800,MERCH_ID_800_LEN);
   	
   }
   
     /**
	 * 	Update MerchId800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMerchId800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMerchId800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of merchIdLen800
	 *	@return merchIdLen800
	 */
	public int getMerchIdLen800() throws CFException {
       if (isMerchIdLen800Modified()) { 
           merchIdLen800 = refreshMerchIdLen800();
        }
   		return merchIdLen800;
	}
	

	
	   
	/**
	 * 	Update MerchIdLen800 with the passed value
	 *  Corresponding COBOL Variable is 800-MERCH-ID-LEN
	 *	@param number
	 */
	public void setMerchIdLen800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    merchIdLen800 = checkMerchIdLen800MaxLimit(number); 
		serializeMerchIdLen800(merchIdLen800);
	}
	

	public void setMerchIdLen800(long number) {
	    number = checkMerchIdLen800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setMerchIdLen800((int)number);
	}
	
	/**
	 * 	Update MerchIdLen800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMerchIdLen800(char[] value) throws CFException {
		 merchIdLen800 = serializeMerchIdLen800(value);
	}
	/**
	 * 	Update MerchIdLen800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMerchIdLen800String(char[] value) throws CFException {
		 setMerchIdLen800(value);
	}
	/**
	 *	Returns the value of newElem800
	 *	@return newElem800
	 */
   public char[] getNewElem800() throws CFException{
     if (isNewElem800Modified()) { 
        newElem800 = refreshNewElem800();
     }
   		return newElem800;
   }

  
	/**
	*  set variable newElem800
	*  Corresponding COBOL Variable is 800-NEW-ELEM
	*  @param value
	**/
   public void setNewElem800(char[] value) {
      newElem800 = checkNewElem800Constraints(value);
      serializeNewElem800(newElem800);
   } 

     /**
	 * 	Update NewElem800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setNewElem800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginNewElem800,newElem800.length);
   	
   }
   
   public void setNewElem800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginNewElem800,newElem800.length);
   	
   }
   
     /**
	 * 	Update NewElem800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setNewElem800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNewElem800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update NewElem800 with another Field
	 *	@param value
	 */
   public void setNewElem800(Field source) {
       replace(source,0,source.length(),beginNewElem800,NEW_ELEM_800_LEN);
   	
   }  
   
     /**
	 * 	Update NewElem800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setNewElem800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginNewElem800,NEW_ELEM_800_LEN);
   	
   }
   
     /**
	 * 	Update NewElem800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setNewElem800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNewElem800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of newElemData800
	 *	@return newElemData800
	 */   
	 public NewElemData800 getNewElemData800() {
   	return newElemData800;
   }
   /**
	* 	Update NewElemData800 with the passed value
	*   Corresponding COBOL Variable is 800-NEW-ELEM-DATA
	*	@param value
	*/
   public void setNewElemData800(char[] value) {
      newElemData800.setString(value); 
   }   
    
     /**
	 * 	Update NewElemData800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setNewElemData800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,newElemData800.begin,newElemData800.length());
   }
   
     /**
	 * 	Update NewElemData800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setNewElemData800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,newElemData800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update NewElemData800 with another Field
	 *	@param value
	 */
   public void setNewElemData800(Field source) {
   	replace(source,0,source.length(),newElemData800.begin,newElemData800.length());
   }  
   
     /**
	 * 	Update NewElemData800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setNewElemData800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,newElemData800.begin,newElemData800.length());
   }
   
     /**
	 * 	Update NewElemData800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setNewElemData800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,newElemData800.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of pan800
	 *	@return pan800
	 */
   public char[] getPan800() throws CFException{
     if (isPan800Modified()) { 
        pan800 = refreshPan800();
     }
   		return pan800;
   }

  
	/**
	*  set variable pan800
	*  Corresponding COBOL Variable is 800-PAN
	*  @param value
	**/
   public void setPan800(char[] value) {
      pan800 = checkPan800Constraints(value);
      serializePan800(pan800);
   } 

     /**
	 * 	Update Pan800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPan800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPan800,pan800.length);
   	
   }
   
   public void setPan800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPan800,pan800.length);
   	
   }
   
     /**
	 * 	Update Pan800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPan800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPan800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Pan800 with another Field
	 *	@param value
	 */
   public void setPan800(Field source) {
       replace(source,0,source.length(),beginPan800,PAN_800_LEN);
   	
   }  
   
     /**
	 * 	Update Pan800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPan800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPan800,PAN_800_LEN);
   	
   }
   
     /**
	 * 	Update Pan800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPan800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPan800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of panLen800
	 *	@return panLen800
	 */
	public int getPanLen800() throws CFException {
       if (isPanLen800Modified()) { 
           panLen800 = refreshPanLen800();
        }
   		return panLen800;
	}
	

	
	   
	/**
	 * 	Update PanLen800 with the passed value
	 *  Corresponding COBOL Variable is 800-PAN-LEN
	 *	@param number
	 */
	public void setPanLen800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    panLen800 = checkPanLen800MaxLimit(number); 
		serializePanLen800(panLen800);
	}
	

	public void setPanLen800(long number) {
	    number = checkPanLen800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setPanLen800((int)number);
	}
	
	/**
	 * 	Update PanLen800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPanLen800(char[] value) throws CFException {
		 panLen800 = serializePanLen800(value);
	}
	/**
	 * 	Update PanLen800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPanLen800String(char[] value) throws CFException {
		 setPanLen800(value);
	}
	/**
	 *	Returns the value of ptrVal800
	 *	@return ptrVal800
	 */
	public long getPtrVal800() throws CFException {
       if (isPtrVal800Modified()) { 
           ptrVal800 = refreshPtrVal800();
        }
   		return ptrVal800;
	}
	

	
	   
	/**
	 * 	Update PtrVal800 with the passed value
	 *  Corresponding COBOL Variable is 800-PTR-VAL
	 *	@param number
	 */
	public void setPtrVal800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ptrVal800 = checkPtrVal800MaxLimit(number); 
		serializePtrVal800(ptrVal800);
	}
	

	/**
	 * 	Update PtrVal800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPtrVal800(char[] value) throws CFException {
		 ptrVal800 = serializePtrVal800(value);
	}
	/**
	 * 	Update PtrVal800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPtrVal800String(char[] value) throws CFException {
		 setPtrVal800(value);
	}
	/**
	 *	Returns the value of random800
	 *	@return random800
	 */
	public BigDecimal getRandom800() throws CFException {
       if (isRandom800Modified()) { 
           random800 = refreshRandom800();
        }
   		return random800;
	}
	

	
	   
	/**
	 * 	Update Random800 with the passed number
	 *  Corresponding COBOL Variable is 800-RANDOM
	 *	@param number
	 */
	public void setRandom800(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       random800 = checkRandom800MaxLimit(number);
	    serializeRandom800(random800);
   }
	/**
	 * 	Update Random800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setRandom800(char[] value) throws CFException {
		 random800 = serializeRandom800(value);
	}   
	/**
	 *	Returns the value of randomX800
	 *	@return randomX800
	 */   
	 public RandomX800 getRandomX800() {
   	return randomX800;
   }
   /**
	* 	Update RandomX800 with the passed value
	*   Corresponding COBOL Variable is 800-RANDOM-X
	*	@param value
	*/
   public void setRandomX800(char[] value) {
      randomX800.setString(value); 
   }   
    
     /**
	 * 	Update RandomX800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRandomX800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,randomX800.begin,randomX800.length());
   }
   
     /**
	 * 	Update RandomX800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRandomX800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,randomX800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update RandomX800 with another Field
	 *	@param value
	 */
   public void setRandomX800(Field source) {
   	replace(source,0,source.length(),randomX800.begin,randomX800.length());
   }  
   
     /**
	 * 	Update RandomX800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRandomX800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,randomX800.begin,randomX800.length());
   }
   
     /**
	 * 	Update RandomX800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRandomX800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,randomX800.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of revInd800
	 *	@return revInd800
	 */
   public char[] getRevInd800() throws CFException{
     if (isRevInd800Modified()) { 
        revInd800 = refreshRevInd800();
     }
   		return revInd800;
   }

  
	/**
	*  set variable revInd800
	*  Corresponding COBOL Variable is 800-REV-IND
	*  @param value
	**/
   public void setRevInd800(char[] value) {
      revInd800 = checkRevInd800Constraints(value);
      serializeRevInd800(revInd800);
   } 

     /**
	 * 	Update RevInd800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRevInd800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRevInd800,revInd800.length);
   	
   }
   
   public void setRevInd800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRevInd800,revInd800.length);
   	
   }
   
     /**
	 * 	Update RevInd800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRevInd800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRevInd800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RevInd800 with another Field
	 *	@param value
	 */
   public void setRevInd800(Field source) {
       replace(source,0,source.length(),beginRevInd800,REV_IND_800_LEN);
   	
   }  
   
     /**
	 * 	Update RevInd800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRevInd800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRevInd800,REV_IND_800_LEN);
   	
   }
   
     /**
	 * 	Update RevInd800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRevInd800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRevInd800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of revIndLen800
	 *	@return revIndLen800
	 */
	public int getRevIndLen800() throws CFException {
       if (isRevIndLen800Modified()) { 
           revIndLen800 = refreshRevIndLen800();
        }
   		return revIndLen800;
	}
	

	
	   
	/**
	 * 	Update RevIndLen800 with the passed value
	 *  Corresponding COBOL Variable is 800-REV-IND-LEN
	 *	@param number
	 */
	public void setRevIndLen800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    revIndLen800 = checkRevIndLen800MaxLimit(number); 
		serializeRevIndLen800(revIndLen800);
	}
	

	public void setRevIndLen800(long number) {
	    number = checkRevIndLen800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setRevIndLen800((int)number);
	}
	
	/**
	 * 	Update RevIndLen800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setRevIndLen800(char[] value) throws CFException {
		 revIndLen800 = serializeRevIndLen800(value);
	}
	/**
	 * 	Update RevIndLen800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRevIndLen800String(char[] value) throws CFException {
		 setRevIndLen800(value);
	}
	/**
	 *	Returns the value of rewardAmt800
	 *	@return rewardAmt800
	 */
	public long getRewardAmt800() throws CFException {
       if (isRewardAmt800Modified()) { 
           rewardAmt800 = refreshRewardAmt800();
        }
   		return rewardAmt800;
	}
	

	
	   
	/**
	 * 	Update RewardAmt800 with the passed value
	 *  Corresponding COBOL Variable is 800-REWARD-AMT
	 *	@param number
	 */
	public void setRewardAmt800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    rewardAmt800 = checkRewardAmt800MaxLimit(number); 
		serializeRewardAmt800(rewardAmt800);
	}
	

	/**
	 * 	Update RewardAmt800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setRewardAmt800(char[] value) throws CFException {
		 rewardAmt800 = serializeRewardAmt800(value);
	}
	/**
	 * 	Update RewardAmt800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRewardAmt800String(char[] value) throws CFException {
		 setRewardAmt800(value);
	}
	/**
	 *	Returns the value of rewardPgmId800
	 *	@return rewardPgmId800
	 */
	public long getRewardPgmId800() throws CFException {
       if (isRewardPgmId800Modified()) { 
           rewardPgmId800 = refreshRewardPgmId800();
        }
   		return rewardPgmId800;
	}
	

	
	   
	/**
	 * 	Update RewardPgmId800 with the passed value
	 *  Corresponding COBOL Variable is 800-REWARD-PGM-ID
	 *	@param number
	 */
	public void setRewardPgmId800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    rewardPgmId800 = checkRewardPgmId800MaxLimit(number); 
		serializeRewardPgmId800(rewardPgmId800);
	}
	

	/**
	 * 	Update RewardPgmId800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setRewardPgmId800(char[] value) throws CFException {
		 rewardPgmId800 = serializeRewardPgmId800(value);
	}
	/**
	 * 	Update RewardPgmId800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRewardPgmId800String(char[] value) throws CFException {
		 setRewardPgmId800(value);
	}
	/**
	 *	Returns the value of saveEntry800
	 *	@return saveEntry800
	 */
   public char[] getSaveEntry800() throws CFException{
     if (isSaveEntry800Modified()) { 
        saveEntry800 = refreshSaveEntry800();
     }
   		return saveEntry800;
   }

  
	/**
	*  set variable saveEntry800
	*  Corresponding COBOL Variable is 800-SAVE-ENTRY
	*  @param value
	**/
   public void setSaveEntry800(char[] value) {
      saveEntry800 = checkSaveEntry800Constraints(value);
      serializeSaveEntry800(saveEntry800);
   } 

     /**
	 * 	Update SaveEntry800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSaveEntry800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSaveEntry800,saveEntry800.length);
   	
   }
   
   public void setSaveEntry800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSaveEntry800,saveEntry800.length);
   	
   }
   
     /**
	 * 	Update SaveEntry800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSaveEntry800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSaveEntry800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SaveEntry800 with another Field
	 *	@param value
	 */
   public void setSaveEntry800(Field source) {
       replace(source,0,source.length(),beginSaveEntry800,SAVE_ENTRY_800_LEN);
   	
   }  
   
     /**
	 * 	Update SaveEntry800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSaveEntry800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSaveEntry800,SAVE_ENTRY_800_LEN);
   	
   }
   
     /**
	 * 	Update SaveEntry800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSaveEntry800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSaveEntry800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of saveTagNum800
	 *	@return saveTagNum800
	 */
	public int getSaveTagNum800() throws CFException {
       if (isSaveTagNum800Modified()) { 
           saveTagNum800 = refreshSaveTagNum800();
        }
   		return saveTagNum800;
	}
	

	
	   
	/**
	 * 	Update SaveTagNum800 with the passed value
	 *  Corresponding COBOL Variable is 800-SAVE-TAG-NUM
	 *	@param number
	 */
	public void setSaveTagNum800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    saveTagNum800 = checkSaveTagNum800MaxLimit(number); 
		serializeSaveTagNum800(saveTagNum800);
	}
	

	public void setSaveTagNum800(long number) {
	    number = checkSaveTagNum800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSaveTagNum800((int)number);
	}
	
	/**
	 * 	Update SaveTagNum800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSaveTagNum800(char[] value) throws CFException {
		 saveTagNum800 = serializeSaveTagNum800(value);
	}
	/**
	 * 	Update SaveTagNum800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSaveTagNum800String(char[] value) throws CFException {
		 setSaveTagNum800(value);
	}
	/**
	 *	Returns the value of seed800
	 *	@return seed800
	 */
	public long getSeed800() throws CFException {
       if (isSeed800Modified()) { 
           seed800 = refreshSeed800();
        }
   		return seed800;
	}
	

	
	   
	/**
	 * 	Update Seed800 with the passed value
	 *  Corresponding COBOL Variable is 800-SEED
	 *	@param number
	 */
	public void setSeed800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    seed800 = checkSeed800MaxLimit(number); 
		serializeSeed800(seed800);
	}
	

	/**
	 * 	Update Seed800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSeed800(char[] value) throws CFException {
		 seed800 = serializeSeed800(value);
	}
	/**
	 * 	Update Seed800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSeed800String(char[] value) throws CFException {
		 setSeed800(value);
	}
	/**
	 *	Returns the value of sender800
	 *	@return sender800
	 */
   public char[] getSender800() throws CFException{
     if (isSender800Modified()) { 
        sender800 = refreshSender800();
     }
   		return sender800;
   }

  
	/**
	*  set variable sender800
	*  Corresponding COBOL Variable is 800-SENDER
	*  @param value
	**/
   public void setSender800(char[] value) {
      sender800 = checkSender800Constraints(value);
      serializeSender800(sender800);
   } 

     /**
	 * 	Update Sender800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSender800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSender800,sender800.length);
   	
   }
   
   public void setSender800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSender800,sender800.length);
   	
   }
   
     /**
	 * 	Update Sender800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSender800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSender800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sender800 with another Field
	 *	@param value
	 */
   public void setSender800(Field source) {
       replace(source,0,source.length(),beginSender800,SENDER_800_LEN);
   	
   }  
   
     /**
	 * 	Update Sender800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSender800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSender800,SENDER_800_LEN);
   	
   }
   
     /**
	 * 	Update Sender800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSender800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSender800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of seqNum8800
	 *	@return seqNum8800
	 */
	public long getSeqNum8800() throws CFException {
       if (isSeqNum8800Modified()) { 
           seqNum8800 = refreshSeqNum8800();
        }
   		return seqNum8800;
	}
	

	
	   
	/**
	 * 	Update SeqNum8800 with the passed value
	 *  Corresponding COBOL Variable is 800-SEQ-NUM-8
	 *	@param number
	 */
	public void setSeqNum8800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    seqNum8800 = checkSeqNum8800MaxLimit(number); 
		serializeSeqNum8800(seqNum8800);
	}
	

	/**
	 * 	Update SeqNum8800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSeqNum8800(char[] value) throws CFException {
		 seqNum8800 = serializeSeqNum8800(value);
	}
	/**
	 * 	Update SeqNum8800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSeqNum8800String(char[] value) throws CFException {
		 setSeqNum8800(value);
	}
	/**
	 *	Returns the value of seqNumP0137800
	 *	@return seqNumP0137800
	 */
	public long getSeqNumP0137800() throws CFException {
       if (isSeqNumP0137800Modified()) { 
           seqNumP0137800 = refreshSeqNumP0137800();
        }
   		return seqNumP0137800;
	}
	

	
	   
	/**
	 * 	Update SeqNumP0137800 with the passed value
	 *  Corresponding COBOL Variable is 800-SEQ-NUM-P0137
	 *	@param number
	 */
	public void setSeqNumP0137800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    seqNumP0137800 = checkSeqNumP0137800MaxLimit(number); 
		serializeSeqNumP0137800(seqNumP0137800);
	}
	

	/**
	 * 	Update SeqNumP0137800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSeqNumP0137800(char[] value) throws CFException {
		 seqNumP0137800 = serializeSeqNumP0137800(value);
	}
	/**
	 * 	Update SeqNumP0137800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSeqNumP0137800String(char[] value) throws CFException {
		 setSeqNumP0137800(value);
	}
	/**
	 *	Returns the value of sys101Rdw800
	 *	@return sys101Rdw800
	 */
	public long getSys101Rdw800() throws CFException {
        if (isSys101Rdw800Modified()) { 
           sys101Rdw800 = refreshSys101Rdw800();
        }
   		return sys101Rdw800;
	}
	
	/**
	 * 	Update Sys101Rdw800 with the passed value
	 *  Corresponding COBOL Variable is 800-SYS101-RDW
	 *	@param number
	 */
	public void setSys101Rdw800(long number) {
	     // Truncate if the number is beyond +/- Max range
	    sys101Rdw800 = checkSys101Rdw800MaxLimit(number); 
		serializeSys101Rdw800(sys101Rdw800);
	}


	/**
	 *	Returns the value of sys201Rdw800
	 *	@return sys201Rdw800
	 */
	public long getSys201Rdw800() throws CFException {
        if (isSys201Rdw800Modified()) { 
           sys201Rdw800 = refreshSys201Rdw800();
        }
   		return sys201Rdw800;
	}
	
	/**
	 * 	Update Sys201Rdw800 with the passed value
	 *  Corresponding COBOL Variable is 800-SYS201-RDW
	 *	@param number
	 */
	public void setSys201Rdw800(long number) {
	     // Truncate if the number is beyond +/- Max range
	    sys201Rdw800 = checkSys201Rdw800MaxLimit(number); 
		serializeSys201Rdw800(sys201Rdw800);
	}


	/**
	 *	Returns the value of sys001Status800
	 *	@return sys001Status800
	 */
   public char[] getSys001Status800() throws CFException{
     if (isSys001Status800Modified()) { 
        sys001Status800 = refreshSys001Status800();
     }
   		return sys001Status800;
   }

  
	/**
	*  set variable sys001Status800
	*  Corresponding COBOL Variable is 800-SYS001-STATUS
	*  @param value
	**/
   public void setSys001Status800(char[] value) {
      sys001Status800 = checkSys001Status800Constraints(value);
      serializeSys001Status800(sys001Status800);
   } 

     /**
	 * 	Update Sys001Status800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001Status800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys001Status800,sys001Status800.length);
   	
   }
   
   public void setSys001Status800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys001Status800,sys001Status800.length);
   	
   }
   
     /**
	 * 	Update Sys001Status800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001Status800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001Status800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys001Status800 with another Field
	 *	@param value
	 */
   public void setSys001Status800(Field source) {
       replace(source,0,source.length(),beginSys001Status800,SYS_001_STATUS_800_LEN);
   	
   }  
   
     /**
	 * 	Update Sys001Status800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001Status800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys001Status800,SYS_001_STATUS_800_LEN);
   	
   }
   
     /**
	 * 	Update Sys001Status800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001Status800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001Status800+targetIndex,targetLen);
    
   }
	char[] sys001Good8880088Value = "00".toCharArray();
	/**
	 *	Test condition "00" for isSys001Good88800()
	 *	@return  Returns true if isSys001Good88800() is "00"
	 */
   public boolean isSys001Good88800() throws CFException {
      return (  compareChars( getSys001Status800() , sys001Good8880088Value)  == 0  );
   }


	/**
	*  set values "00"
	*/
   	public void setSys001Good88800True() {  			
    	setSys001Status800( sys001Good8880088Value);
   	}
	char[] sys001Noexist8880088Value = "05".toCharArray();
	/**
	 *	Test condition "05" for isSys001Noexist88800()
	 *	@return  Returns true if isSys001Noexist88800() is "05"
	 */
   public boolean isSys001Noexist88800() throws CFException {
      return (  compareChars( getSys001Status800() , sys001Noexist8880088Value)  == 0  );
   }


	/**
	*  set values "05"
	*/
   	public void setSys001Noexist88800True() {  			
    	setSys001Status800( sys001Noexist8880088Value);
   	}
	char[] sys001Empty8880088Value1 = "10".toCharArray();
char[] sys001Empty8880088Value2 = "46".toCharArray();

	/**
	 *	Test condition "10" "46" for isSys001Empty88800()
	 *	@return  Returns true if isSys001Empty88800() is "10" "46"
	 */
   public boolean isSys001Empty88800() throws CFException {
      return (  compareChars( getSys001Status800() , sys001Empty8880088Value1)  == 0  ||  compareChars( getSys001Status800() , sys001Empty8880088Value2)  == 0  );
   }


	/**
	*  set values "10" "46"
	*/
   	public void setSys001Empty88800True() {  			
    	setSys001Status800( sys001Empty8880088Value1);
   	}
	char[] sys001Conflict8880088Value = "39".toCharArray();
	/**
	 *	Test condition "39" for isSys001Conflict88800()
	 *	@return  Returns true if isSys001Conflict88800() is "39"
	 */
   public boolean isSys001Conflict88800() throws CFException {
      return (  compareChars( getSys001Status800() , sys001Conflict8880088Value)  == 0  );
   }


	/**
	*  set values "39"
	*/
   	public void setSys001Conflict88800True() {  			
    	setSys001Status800( sys001Conflict8880088Value);
   	}
	/**
	 *	Returns the value of sys002Status800
	 *	@return sys002Status800
	 */
   public char[] getSys002Status800() throws CFException{
     if (isSys002Status800Modified()) { 
        sys002Status800 = refreshSys002Status800();
     }
   		return sys002Status800;
   }

  
	/**
	*  set variable sys002Status800
	*  Corresponding COBOL Variable is 800-SYS002-STATUS
	*  @param value
	**/
   public void setSys002Status800(char[] value) {
      sys002Status800 = checkSys002Status800Constraints(value);
      serializeSys002Status800(sys002Status800);
   } 

     /**
	 * 	Update Sys002Status800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys002Status800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys002Status800,sys002Status800.length);
   	
   }
   
   public void setSys002Status800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys002Status800,sys002Status800.length);
   	
   }
   
     /**
	 * 	Update Sys002Status800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys002Status800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys002Status800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys002Status800 with another Field
	 *	@param value
	 */
   public void setSys002Status800(Field source) {
       replace(source,0,source.length(),beginSys002Status800,SYS_002_STATUS_800_LEN);
   	
   }  
   
     /**
	 * 	Update Sys002Status800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys002Status800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys002Status800,SYS_002_STATUS_800_LEN);
   	
   }
   
     /**
	 * 	Update Sys002Status800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys002Status800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys002Status800+targetIndex,targetLen);
    
   }
	char[] sys002Good8880088Value = "00".toCharArray();
	/**
	 *	Test condition "00" for isSys002Good88800()
	 *	@return  Returns true if isSys002Good88800() is "00"
	 */
   public boolean isSys002Good88800() throws CFException {
      return (  compareChars( getSys002Status800() , sys002Good8880088Value)  == 0  );
   }


	/**
	*  set values "00"
	*/
   	public void setSys002Good88800True() {  			
    	setSys002Status800( sys002Good8880088Value);
   	}
	char[] sys002Noexist8880088Value = "05".toCharArray();
	/**
	 *	Test condition "05" for isSys002Noexist88800()
	 *	@return  Returns true if isSys002Noexist88800() is "05"
	 */
   public boolean isSys002Noexist88800() throws CFException {
      return (  compareChars( getSys002Status800() , sys002Noexist8880088Value)  == 0  );
   }


	/**
	*  set values "05"
	*/
   	public void setSys002Noexist88800True() {  			
    	setSys002Status800( sys002Noexist8880088Value);
   	}
	char[] sys002Eof8880088Value = "10".toCharArray();
	/**
	 *	Test condition "10" for isSys002Eof88800()
	 *	@return  Returns true if isSys002Eof88800() is "10"
	 */
   public boolean isSys002Eof88800() throws CFException {
      return (  compareChars( getSys002Status800() , sys002Eof8880088Value)  == 0  );
   }


	/**
	*  set values "10"
	*/
   	public void setSys002Eof88800True() {  			
    	setSys002Status800( sys002Eof8880088Value);
   	}
	char[] sys002Empty8880088Value = "46".toCharArray();
	/**
	 *	Test condition "46" for isSys002Empty88800()
	 *	@return  Returns true if isSys002Empty88800() is "46"
	 */
   public boolean isSys002Empty88800() throws CFException {
      return (  compareChars( getSys002Status800() , sys002Empty8880088Value)  == 0  );
   }


	/**
	*  set values "46"
	*/
   	public void setSys002Empty88800True() {  			
    	setSys002Status800( sys002Empty8880088Value);
   	}
	char[] sys002Conflict8880088Value = "39".toCharArray();
	/**
	 *	Test condition "39" for isSys002Conflict88800()
	 *	@return  Returns true if isSys002Conflict88800() is "39"
	 */
   public boolean isSys002Conflict88800() throws CFException {
      return (  compareChars( getSys002Status800() , sys002Conflict8880088Value)  == 0  );
   }


	/**
	*  set values "39"
	*/
   	public void setSys002Conflict88800True() {  			
    	setSys002Status800( sys002Conflict8880088Value);
   	}
	/**
	 *	Returns the value of sys005Status800
	 *	@return sys005Status800
	 */
   public char[] getSys005Status800() throws CFException{
     if (isSys005Status800Modified()) { 
        sys005Status800 = refreshSys005Status800();
     }
   		return sys005Status800;
   }

  
	/**
	*  set variable sys005Status800
	*  Corresponding COBOL Variable is 800-SYS005-STATUS
	*  @param value
	**/
   public void setSys005Status800(char[] value) {
      sys005Status800 = checkSys005Status800Constraints(value);
      serializeSys005Status800(sys005Status800);
   } 

     /**
	 * 	Update Sys005Status800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys005Status800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys005Status800,sys005Status800.length);
   	
   }
   
   public void setSys005Status800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys005Status800,sys005Status800.length);
   	
   }
   
     /**
	 * 	Update Sys005Status800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys005Status800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys005Status800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys005Status800 with another Field
	 *	@param value
	 */
   public void setSys005Status800(Field source) {
       replace(source,0,source.length(),beginSys005Status800,SYS_005_STATUS_800_LEN);
   	
   }  
   
     /**
	 * 	Update Sys005Status800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys005Status800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys005Status800,SYS_005_STATUS_800_LEN);
   	
   }
   
     /**
	 * 	Update Sys005Status800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys005Status800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys005Status800+targetIndex,targetLen);
    
   }
	char[] sys005Good8880088Value = "00".toCharArray();
	/**
	 *	Test condition "00" for isSys005Good88800()
	 *	@return  Returns true if isSys005Good88800() is "00"
	 */
   public boolean isSys005Good88800() throws CFException {
      return (  compareChars( getSys005Status800() , sys005Good8880088Value)  == 0  );
   }


	/**
	*  set values "00"
	*/
   	public void setSys005Good88800True() {  			
    	setSys005Status800( sys005Good8880088Value);
   	}
	char[] sys005Noexist8880088Value = "05".toCharArray();
	/**
	 *	Test condition "05" for isSys005Noexist88800()
	 *	@return  Returns true if isSys005Noexist88800() is "05"
	 */
   public boolean isSys005Noexist88800() throws CFException {
      return (  compareChars( getSys005Status800() , sys005Noexist8880088Value)  == 0  );
   }


	/**
	*  set values "05"
	*/
   	public void setSys005Noexist88800True() {  			
    	setSys005Status800( sys005Noexist8880088Value);
   	}
	char[] sys005Eof8880088Value = "10".toCharArray();
	/**
	 *	Test condition "10" for isSys005Eof88800()
	 *	@return  Returns true if isSys005Eof88800() is "10"
	 */
   public boolean isSys005Eof88800() throws CFException {
      return (  compareChars( getSys005Status800() , sys005Eof8880088Value)  == 0  );
   }


	/**
	*  set values "10"
	*/
   	public void setSys005Eof88800True() {  			
    	setSys005Status800( sys005Eof8880088Value);
   	}
	char[] sys005Empty8880088Value = "46".toCharArray();
	/**
	 *	Test condition "46" for isSys005Empty88800()
	 *	@return  Returns true if isSys005Empty88800() is "46"
	 */
   public boolean isSys005Empty88800() throws CFException {
      return (  compareChars( getSys005Status800() , sys005Empty8880088Value)  == 0  );
   }


	/**
	*  set values "46"
	*/
   	public void setSys005Empty88800True() {  			
    	setSys005Status800( sys005Empty8880088Value);
   	}
	char[] sys005Conflict8880088Value = "39".toCharArray();
	/**
	 *	Test condition "39" for isSys005Conflict88800()
	 *	@return  Returns true if isSys005Conflict88800() is "39"
	 */
   public boolean isSys005Conflict88800() throws CFException {
      return (  compareChars( getSys005Status800() , sys005Conflict8880088Value)  == 0  );
   }


	/**
	*  set values "39"
	*/
   	public void setSys005Conflict88800True() {  			
    	setSys005Status800( sys005Conflict8880088Value);
   	}
	/**
	 *	Returns the value of sys003Status800
	 *	@return sys003Status800
	 */
   public char[] getSys003Status800() throws CFException{
     if (isSys003Status800Modified()) { 
        sys003Status800 = refreshSys003Status800();
     }
   		return sys003Status800;
   }

  
	/**
	*  set variable sys003Status800
	*  Corresponding COBOL Variable is 800-SYS003-STATUS
	*  @param value
	**/
   public void setSys003Status800(char[] value) {
      sys003Status800 = checkSys003Status800Constraints(value);
      serializeSys003Status800(sys003Status800);
   } 

     /**
	 * 	Update Sys003Status800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys003Status800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys003Status800,sys003Status800.length);
   	
   }
   
   public void setSys003Status800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys003Status800,sys003Status800.length);
   	
   }
   
     /**
	 * 	Update Sys003Status800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys003Status800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys003Status800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys003Status800 with another Field
	 *	@param value
	 */
   public void setSys003Status800(Field source) {
       replace(source,0,source.length(),beginSys003Status800,SYS_003_STATUS_800_LEN);
   	
   }  
   
     /**
	 * 	Update Sys003Status800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys003Status800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys003Status800,SYS_003_STATUS_800_LEN);
   	
   }
   
     /**
	 * 	Update Sys003Status800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys003Status800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys003Status800+targetIndex,targetLen);
    
   }
	char[] sys003Good8880088Value = "00".toCharArray();
	/**
	 *	Test condition "00" for isSys003Good88800()
	 *	@return  Returns true if isSys003Good88800() is "00"
	 */
   public boolean isSys003Good88800() throws CFException {
      return (  compareChars( getSys003Status800() , sys003Good8880088Value)  == 0  );
   }


	/**
	*  set values "00"
	*/
   	public void setSys003Good88800True() {  			
    	setSys003Status800( sys003Good8880088Value);
   	}
	char[] sys003Noexist8880088Value = "05".toCharArray();
	/**
	 *	Test condition "05" for isSys003Noexist88800()
	 *	@return  Returns true if isSys003Noexist88800() is "05"
	 */
   public boolean isSys003Noexist88800() throws CFException {
      return (  compareChars( getSys003Status800() , sys003Noexist8880088Value)  == 0  );
   }


	/**
	*  set values "05"
	*/
   	public void setSys003Noexist88800True() {  			
    	setSys003Status800( sys003Noexist8880088Value);
   	}
	char[] sys003Empty8880088Value1 = "10".toCharArray();
char[] sys003Empty8880088Value2 = "46".toCharArray();

	/**
	 *	Test condition "10" "46" for isSys003Empty88800()
	 *	@return  Returns true if isSys003Empty88800() is "10" "46"
	 */
   public boolean isSys003Empty88800() throws CFException {
      return (  compareChars( getSys003Status800() , sys003Empty8880088Value1)  == 0  ||  compareChars( getSys003Status800() , sys003Empty8880088Value2)  == 0  );
   }


	/**
	*  set values "10" "46"
	*/
   	public void setSys003Empty88800True() {  			
    	setSys003Status800( sys003Empty8880088Value1);
   	}
	char[] sys003Conflict8880088Value = "39".toCharArray();
	/**
	 *	Test condition "39" for isSys003Conflict88800()
	 *	@return  Returns true if isSys003Conflict88800() is "39"
	 */
   public boolean isSys003Conflict88800() throws CFException {
      return (  compareChars( getSys003Status800() , sys003Conflict8880088Value)  == 0  );
   }


	/**
	*  set values "39"
	*/
   	public void setSys003Conflict88800True() {  			
    	setSys003Status800( sys003Conflict8880088Value);
   	}
	/**
	 *	Returns the value of sys004Status800
	 *	@return sys004Status800
	 */
   public char[] getSys004Status800() throws CFException{
     if (isSys004Status800Modified()) { 
        sys004Status800 = refreshSys004Status800();
     }
   		return sys004Status800;
   }

  
	/**
	*  set variable sys004Status800
	*  Corresponding COBOL Variable is 800-SYS004-STATUS
	*  @param value
	**/
   public void setSys004Status800(char[] value) {
      sys004Status800 = checkSys004Status800Constraints(value);
      serializeSys004Status800(sys004Status800);
   } 

     /**
	 * 	Update Sys004Status800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys004Status800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys004Status800,sys004Status800.length);
   	
   }
   
   public void setSys004Status800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys004Status800,sys004Status800.length);
   	
   }
   
     /**
	 * 	Update Sys004Status800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys004Status800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys004Status800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys004Status800 with another Field
	 *	@param value
	 */
   public void setSys004Status800(Field source) {
       replace(source,0,source.length(),beginSys004Status800,SYS_004_STATUS_800_LEN);
   	
   }  
   
     /**
	 * 	Update Sys004Status800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys004Status800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys004Status800,SYS_004_STATUS_800_LEN);
   	
   }
   
     /**
	 * 	Update Sys004Status800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys004Status800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys004Status800+targetIndex,targetLen);
    
   }
	char[] sys004Good8880088Value = "00".toCharArray();
	/**
	 *	Test condition "00" for isSys004Good88800()
	 *	@return  Returns true if isSys004Good88800() is "00"
	 */
   public boolean isSys004Good88800() throws CFException {
      return (  compareChars( getSys004Status800() , sys004Good8880088Value)  == 0  );
   }


	/**
	*  set values "00"
	*/
   	public void setSys004Good88800True() {  			
    	setSys004Status800( sys004Good8880088Value);
   	}
	char[] sys004Noexist8880088Value = "05".toCharArray();
	/**
	 *	Test condition "05" for isSys004Noexist88800()
	 *	@return  Returns true if isSys004Noexist88800() is "05"
	 */
   public boolean isSys004Noexist88800() throws CFException {
      return (  compareChars( getSys004Status800() , sys004Noexist8880088Value)  == 0  );
   }


	/**
	*  set values "05"
	*/
   	public void setSys004Noexist88800True() {  			
    	setSys004Status800( sys004Noexist8880088Value);
   	}
	char[] sys004Empty8880088Value1 = "10".toCharArray();
char[] sys004Empty8880088Value2 = "46".toCharArray();

	/**
	 *	Test condition "10" "46" for isSys004Empty88800()
	 *	@return  Returns true if isSys004Empty88800() is "10" "46"
	 */
   public boolean isSys004Empty88800() throws CFException {
      return (  compareChars( getSys004Status800() , sys004Empty8880088Value1)  == 0  ||  compareChars( getSys004Status800() , sys004Empty8880088Value2)  == 0  );
   }


	/**
	*  set values "10" "46"
	*/
   	public void setSys004Empty88800True() {  			
    	setSys004Status800( sys004Empty8880088Value1);
   	}
	char[] sys004Conflict8880088Value = "39".toCharArray();
	/**
	 *	Test condition "39" for isSys004Conflict88800()
	 *	@return  Returns true if isSys004Conflict88800() is "39"
	 */
   public boolean isSys004Conflict88800() throws CFException {
      return (  compareChars( getSys004Status800() , sys004Conflict8880088Value)  == 0  );
   }


	/**
	*  set values "39"
	*/
   	public void setSys004Conflict88800True() {  			
    	setSys004Status800( sys004Conflict8880088Value);
   	}
	/**
	 *	Returns the value of sys101Status800
	 *	@return sys101Status800
	 */
   public char[] getSys101Status800() throws CFException{
     if (isSys101Status800Modified()) { 
        sys101Status800 = refreshSys101Status800();
     }
   		return sys101Status800;
   }

  
	/**
	*  set variable sys101Status800
	*  Corresponding COBOL Variable is 800-SYS101-STATUS
	*  @param value
	**/
   public void setSys101Status800(char[] value) {
      sys101Status800 = checkSys101Status800Constraints(value);
      serializeSys101Status800(sys101Status800);
   } 

     /**
	 * 	Update Sys101Status800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys101Status800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys101Status800,sys101Status800.length);
   	
   }
   
   public void setSys101Status800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys101Status800,sys101Status800.length);
   	
   }
   
     /**
	 * 	Update Sys101Status800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys101Status800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys101Status800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys101Status800 with another Field
	 *	@param value
	 */
   public void setSys101Status800(Field source) {
       replace(source,0,source.length(),beginSys101Status800,SYS_101_STATUS_800_LEN);
   	
   }  
   
     /**
	 * 	Update Sys101Status800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys101Status800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys101Status800,SYS_101_STATUS_800_LEN);
   	
   }
   
     /**
	 * 	Update Sys101Status800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys101Status800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys101Status800+targetIndex,targetLen);
    
   }
	char[] sys101Good8880088Value = "00".toCharArray();
	/**
	 *	Test condition "00" for isSys101Good88800()
	 *	@return  Returns true if isSys101Good88800() is "00"
	 */
   public boolean isSys101Good88800() throws CFException {
      return (  compareChars( getSys101Status800() , sys101Good8880088Value)  == 0  );
   }


	/**
	*  set values "00"
	*/
   	public void setSys101Good88800True() {  			
    	setSys101Status800( sys101Good8880088Value);
   	}
	char[] sys101Noexist8880088Value = "05".toCharArray();
	/**
	 *	Test condition "05" for isSys101Noexist88800()
	 *	@return  Returns true if isSys101Noexist88800() is "05"
	 */
   public boolean isSys101Noexist88800() throws CFException {
      return (  compareChars( getSys101Status800() , sys101Noexist8880088Value)  == 0  );
   }


	/**
	*  set values "05"
	*/
   	public void setSys101Noexist88800True() {  			
    	setSys101Status800( sys101Noexist8880088Value);
   	}
	char[] sys101Empty8880088Value1 = "10".toCharArray();
char[] sys101Empty8880088Value2 = "46".toCharArray();

	/**
	 *	Test condition "10" "46" for isSys101Empty88800()
	 *	@return  Returns true if isSys101Empty88800() is "10" "46"
	 */
   public boolean isSys101Empty88800() throws CFException {
      return (  compareChars( getSys101Status800() , sys101Empty8880088Value1)  == 0  ||  compareChars( getSys101Status800() , sys101Empty8880088Value2)  == 0  );
   }


	/**
	*  set values "10" "46"
	*/
   	public void setSys101Empty88800True() {  			
    	setSys101Status800( sys101Empty8880088Value1);
   	}
	char[] sys101Conflict8880088Value = "39".toCharArray();
	/**
	 *	Test condition "39" for isSys101Conflict88800()
	 *	@return  Returns true if isSys101Conflict88800() is "39"
	 */
   public boolean isSys101Conflict88800() throws CFException {
      return (  compareChars( getSys101Status800() , sys101Conflict8880088Value)  == 0  );
   }


	/**
	*  set values "39"
	*/
   	public void setSys101Conflict88800True() {  			
    	setSys101Status800( sys101Conflict8880088Value);
   	}
	/**
	 *	Returns the value of sys201Status800
	 *	@return sys201Status800
	 */
   public char[] getSys201Status800() throws CFException{
     if (isSys201Status800Modified()) { 
        sys201Status800 = refreshSys201Status800();
     }
   		return sys201Status800;
   }

  
	/**
	*  set variable sys201Status800
	*  Corresponding COBOL Variable is 800-SYS201-STATUS
	*  @param value
	**/
   public void setSys201Status800(char[] value) {
      sys201Status800 = checkSys201Status800Constraints(value);
      serializeSys201Status800(sys201Status800);
   } 

     /**
	 * 	Update Sys201Status800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys201Status800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys201Status800,sys201Status800.length);
   	
   }
   
   public void setSys201Status800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys201Status800,sys201Status800.length);
   	
   }
   
     /**
	 * 	Update Sys201Status800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys201Status800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys201Status800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys201Status800 with another Field
	 *	@param value
	 */
   public void setSys201Status800(Field source) {
       replace(source,0,source.length(),beginSys201Status800,SYS_201_STATUS_800_LEN);
   	
   }  
   
     /**
	 * 	Update Sys201Status800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys201Status800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys201Status800,SYS_201_STATUS_800_LEN);
   	
   }
   
     /**
	 * 	Update Sys201Status800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys201Status800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys201Status800+targetIndex,targetLen);
    
   }
	char[] sys201Good8880088Value = "00".toCharArray();
	/**
	 *	Test condition "00" for isSys201Good88800()
	 *	@return  Returns true if isSys201Good88800() is "00"
	 */
   public boolean isSys201Good88800() throws CFException {
      return (  compareChars( getSys201Status800() , sys201Good8880088Value)  == 0  );
   }


	/**
	*  set values "00"
	*/
   	public void setSys201Good88800True() {  			
    	setSys201Status800( sys201Good8880088Value);
   	}
	char[] sys201Noexist8880088Value = "05".toCharArray();
	/**
	 *	Test condition "05" for isSys201Noexist88800()
	 *	@return  Returns true if isSys201Noexist88800() is "05"
	 */
   public boolean isSys201Noexist88800() throws CFException {
      return (  compareChars( getSys201Status800() , sys201Noexist8880088Value)  == 0  );
   }


	/**
	*  set values "05"
	*/
   	public void setSys201Noexist88800True() {  			
    	setSys201Status800( sys201Noexist8880088Value);
   	}
	char[] sys201Empty8880088Value1 = "10".toCharArray();
char[] sys201Empty8880088Value2 = "46".toCharArray();

	/**
	 *	Test condition "10" "46" for isSys201Empty88800()
	 *	@return  Returns true if isSys201Empty88800() is "10" "46"
	 */
   public boolean isSys201Empty88800() throws CFException {
      return (  compareChars( getSys201Status800() , sys201Empty8880088Value1)  == 0  ||  compareChars( getSys201Status800() , sys201Empty8880088Value2)  == 0  );
   }


	/**
	*  set values "10" "46"
	*/
   	public void setSys201Empty88800True() {  			
    	setSys201Status800( sys201Empty8880088Value1);
   	}
	char[] sys201Conflict8880088Value = "39".toCharArray();
	/**
	 *	Test condition "39" for isSys201Conflict88800()
	 *	@return  Returns true if isSys201Conflict88800() is "39"
	 */
   public boolean isSys201Conflict88800() throws CFException {
      return (  compareChars( getSys201Status800() , sys201Conflict8880088Value)  == 0  );
   }


	/**
	*  set values "39"
	*/
   	public void setSys201Conflict88800True() {  			
    	setSys201Status800( sys201Conflict8880088Value);
   	}
	/**
	 *	Returns the value of sys202Status800
	 *	@return sys202Status800
	 */
   public char[] getSys202Status800() throws CFException{
     if (isSys202Status800Modified()) { 
        sys202Status800 = refreshSys202Status800();
     }
   		return sys202Status800;
   }

  
	/**
	*  set variable sys202Status800
	*  Corresponding COBOL Variable is 800-SYS202-STATUS
	*  @param value
	**/
   public void setSys202Status800(char[] value) {
      sys202Status800 = checkSys202Status800Constraints(value);
      serializeSys202Status800(sys202Status800);
   } 

     /**
	 * 	Update Sys202Status800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys202Status800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys202Status800,sys202Status800.length);
   	
   }
   
   public void setSys202Status800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys202Status800,sys202Status800.length);
   	
   }
   
     /**
	 * 	Update Sys202Status800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys202Status800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys202Status800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys202Status800 with another Field
	 *	@param value
	 */
   public void setSys202Status800(Field source) {
       replace(source,0,source.length(),beginSys202Status800,SYS_202_STATUS_800_LEN);
   	
   }  
   
     /**
	 * 	Update Sys202Status800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys202Status800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys202Status800,SYS_202_STATUS_800_LEN);
   	
   }
   
     /**
	 * 	Update Sys202Status800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys202Status800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys202Status800+targetIndex,targetLen);
    
   }
	char[] sys202Good8880088Value = "00".toCharArray();
	/**
	 *	Test condition "00" for isSys202Good88800()
	 *	@return  Returns true if isSys202Good88800() is "00"
	 */
   public boolean isSys202Good88800() throws CFException {
      return (  compareChars( getSys202Status800() , sys202Good8880088Value)  == 0  );
   }


	/**
	*  set values "00"
	*/
   	public void setSys202Good88800True() {  			
    	setSys202Status800( sys202Good8880088Value);
   	}
	char[] sys202Noexist8880088Value = "05".toCharArray();
	/**
	 *	Test condition "05" for isSys202Noexist88800()
	 *	@return  Returns true if isSys202Noexist88800() is "05"
	 */
   public boolean isSys202Noexist88800() throws CFException {
      return (  compareChars( getSys202Status800() , sys202Noexist8880088Value)  == 0  );
   }


	/**
	*  set values "05"
	*/
   	public void setSys202Noexist88800True() {  			
    	setSys202Status800( sys202Noexist8880088Value);
   	}
	char[] sys202Empty8880088Value1 = "10".toCharArray();
char[] sys202Empty8880088Value2 = "46".toCharArray();

	/**
	 *	Test condition "10" "46" for isSys202Empty88800()
	 *	@return  Returns true if isSys202Empty88800() is "10" "46"
	 */
   public boolean isSys202Empty88800() throws CFException {
      return (  compareChars( getSys202Status800() , sys202Empty8880088Value1)  == 0  ||  compareChars( getSys202Status800() , sys202Empty8880088Value2)  == 0  );
   }


	/**
	*  set values "10" "46"
	*/
   	public void setSys202Empty88800True() {  			
    	setSys202Status800( sys202Empty8880088Value1);
   	}
	char[] sys202Conflict8880088Value = "39".toCharArray();
	/**
	 *	Test condition "39" for isSys202Conflict88800()
	 *	@return  Returns true if isSys202Conflict88800() is "39"
	 */
   public boolean isSys202Conflict88800() throws CFException {
      return (  compareChars( getSys202Status800() , sys202Conflict8880088Value)  == 0  );
   }


	/**
	*  set values "39"
	*/
   	public void setSys202Conflict88800True() {  			
    	setSys202Status800( sys202Conflict8880088Value);
   	}
	/**
	 *	Returns the value of sys204Status800
	 *	@return sys204Status800
	 */
   public char[] getSys204Status800() throws CFException{
     if (isSys204Status800Modified()) { 
        sys204Status800 = refreshSys204Status800();
     }
   		return sys204Status800;
   }

  
	/**
	*  set variable sys204Status800
	*  Corresponding COBOL Variable is 800-SYS204-STATUS
	*  @param value
	**/
   public void setSys204Status800(char[] value) {
      sys204Status800 = checkSys204Status800Constraints(value);
      serializeSys204Status800(sys204Status800);
   } 

     /**
	 * 	Update Sys204Status800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys204Status800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys204Status800,sys204Status800.length);
   	
   }
   
   public void setSys204Status800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys204Status800,sys204Status800.length);
   	
   }
   
     /**
	 * 	Update Sys204Status800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys204Status800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys204Status800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys204Status800 with another Field
	 *	@param value
	 */
   public void setSys204Status800(Field source) {
       replace(source,0,source.length(),beginSys204Status800,SYS_204_STATUS_800_LEN);
   	
   }  
   
     /**
	 * 	Update Sys204Status800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys204Status800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys204Status800,SYS_204_STATUS_800_LEN);
   	
   }
   
     /**
	 * 	Update Sys204Status800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys204Status800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys204Status800+targetIndex,targetLen);
    
   }
	char[] sys204Good8880088Value = "00".toCharArray();
	/**
	 *	Test condition "00" for isSys204Good88800()
	 *	@return  Returns true if isSys204Good88800() is "00"
	 */
   public boolean isSys204Good88800() throws CFException {
      return (  compareChars( getSys204Status800() , sys204Good8880088Value)  == 0  );
   }


	/**
	*  set values "00"
	*/
   	public void setSys204Good88800True() {  			
    	setSys204Status800( sys204Good8880088Value);
   	}
	char[] sys204Noexist8880088Value = "05".toCharArray();
	/**
	 *	Test condition "05" for isSys204Noexist88800()
	 *	@return  Returns true if isSys204Noexist88800() is "05"
	 */
   public boolean isSys204Noexist88800() throws CFException {
      return (  compareChars( getSys204Status800() , sys204Noexist8880088Value)  == 0  );
   }


	/**
	*  set values "05"
	*/
   	public void setSys204Noexist88800True() {  			
    	setSys204Status800( sys204Noexist8880088Value);
   	}
	char[] sys204Empty8880088Value1 = "10".toCharArray();
char[] sys204Empty8880088Value2 = "46".toCharArray();

	/**
	 *	Test condition "10" "46" for isSys204Empty88800()
	 *	@return  Returns true if isSys204Empty88800() is "10" "46"
	 */
   public boolean isSys204Empty88800() throws CFException {
      return (  compareChars( getSys204Status800() , sys204Empty8880088Value1)  == 0  ||  compareChars( getSys204Status800() , sys204Empty8880088Value2)  == 0  );
   }


	/**
	*  set values "10" "46"
	*/
   	public void setSys204Empty88800True() {  			
    	setSys204Status800( sys204Empty8880088Value1);
   	}
	char[] sys204Conflict8880088Value = "39".toCharArray();
	/**
	 *	Test condition "39" for isSys204Conflict88800()
	 *	@return  Returns true if isSys204Conflict88800() is "39"
	 */
   public boolean isSys204Conflict88800() throws CFException {
      return (  compareChars( getSys204Status800() , sys204Conflict8880088Value)  == 0  );
   }


	/**
	*  set values "39"
	*/
   	public void setSys204Conflict88800True() {  			
    	setSys204Status800( sys204Conflict8880088Value);
   	}
	/**
	 *	Returns the value of sys205Status800
	 *	@return sys205Status800
	 */
   public char[] getSys205Status800() throws CFException{
     if (isSys205Status800Modified()) { 
        sys205Status800 = refreshSys205Status800();
     }
   		return sys205Status800;
   }

  
	/**
	*  set variable sys205Status800
	*  Corresponding COBOL Variable is 800-SYS205-STATUS
	*  @param value
	**/
   public void setSys205Status800(char[] value) {
      sys205Status800 = checkSys205Status800Constraints(value);
      serializeSys205Status800(sys205Status800);
   } 

     /**
	 * 	Update Sys205Status800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys205Status800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys205Status800,sys205Status800.length);
   	
   }
   
   public void setSys205Status800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys205Status800,sys205Status800.length);
   	
   }
   
     /**
	 * 	Update Sys205Status800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys205Status800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys205Status800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys205Status800 with another Field
	 *	@param value
	 */
   public void setSys205Status800(Field source) {
       replace(source,0,source.length(),beginSys205Status800,SYS_205_STATUS_800_LEN);
   	
   }  
   
     /**
	 * 	Update Sys205Status800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys205Status800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys205Status800,SYS_205_STATUS_800_LEN);
   	
   }
   
     /**
	 * 	Update Sys205Status800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys205Status800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys205Status800+targetIndex,targetLen);
    
   }
	char[] sys205Good8880088Value = "00".toCharArray();
	/**
	 *	Test condition "00" for isSys205Good88800()
	 *	@return  Returns true if isSys205Good88800() is "00"
	 */
   public boolean isSys205Good88800() throws CFException {
      return (  compareChars( getSys205Status800() , sys205Good8880088Value)  == 0  );
   }


	/**
	*  set values "00"
	*/
   	public void setSys205Good88800True() {  			
    	setSys205Status800( sys205Good8880088Value);
   	}
	char[] sys205Noexist8880088Value = "05".toCharArray();
	/**
	 *	Test condition "05" for isSys205Noexist88800()
	 *	@return  Returns true if isSys205Noexist88800() is "05"
	 */
   public boolean isSys205Noexist88800() throws CFException {
      return (  compareChars( getSys205Status800() , sys205Noexist8880088Value)  == 0  );
   }


	/**
	*  set values "05"
	*/
   	public void setSys205Noexist88800True() {  			
    	setSys205Status800( sys205Noexist8880088Value);
   	}
	char[] sys205Empty8880088Value1 = "10".toCharArray();
char[] sys205Empty8880088Value2 = "46".toCharArray();

	/**
	 *	Test condition "10" "46" for isSys205Empty88800()
	 *	@return  Returns true if isSys205Empty88800() is "10" "46"
	 */
   public boolean isSys205Empty88800() throws CFException {
      return (  compareChars( getSys205Status800() , sys205Empty8880088Value1)  == 0  ||  compareChars( getSys205Status800() , sys205Empty8880088Value2)  == 0  );
   }


	/**
	*  set values "10" "46"
	*/
   	public void setSys205Empty88800True() {  			
    	setSys205Status800( sys205Empty8880088Value1);
   	}
	char[] sys205Conflict8880088Value = "39".toCharArray();
	/**
	 *	Test condition "39" for isSys205Conflict88800()
	 *	@return  Returns true if isSys205Conflict88800() is "39"
	 */
   public boolean isSys205Conflict88800() throws CFException {
      return (  compareChars( getSys205Status800() , sys205Conflict8880088Value)  == 0  );
   }


	/**
	*  set values "39"
	*/
   	public void setSys205Conflict88800True() {  			
    	setSys205Status800( sys205Conflict8880088Value);
   	}
	/**
	 *	Returns the value of tagTblPtr800
	 *	@return tagTblPtr800
	 */
	public long getTagTblPtr800() throws CFException {
       if (isTagTblPtr800Modified()) { 
           tagTblPtr800 = refreshTagTblPtr800();
        }
   		return tagTblPtr800;
	}
	

	
	   
	/**
	 * 	Update TagTblPtr800 with the passed value
	 *  Corresponding COBOL Variable is 800-TAG-TBL-PTR
	 *	@param number
	 */
	public void setTagTblPtr800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    tagTblPtr800 = checkTagTblPtr800MaxLimit(number); 
		serializeTagTblPtr800(tagTblPtr800);
	}
	

	/**
	 * 	Update TagTblPtr800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTagTblPtr800(char[] value) throws CFException {
		 tagTblPtr800 = serializeTagTblPtr800(value);
	}
	/**
	 * 	Update TagTblPtr800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTagTblPtr800String(char[] value) throws CFException {
		 setTagTblPtr800(value);
	}
	/**
	 *	Returns the value of tranAmt800
	 *	@return tranAmt800
	 */
   public char[] getTranAmt800() throws CFException{
     if (isTranAmt800Modified()) { 
        tranAmt800 = refreshTranAmt800();
     }
   		return tranAmt800;
   }

  
	/**
	*  set variable tranAmt800
	*  Corresponding COBOL Variable is 800-TRAN-AMT
	*  @param value
	**/
   public void setTranAmt800(char[] value) {
      tranAmt800 = checkTranAmt800Constraints(value);
      serializeTranAmt800(tranAmt800);
   } 

     /**
	 * 	Update TranAmt800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTranAmt800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTranAmt800,tranAmt800.length);
   	
   }
   
   public void setTranAmt800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTranAmt800,tranAmt800.length);
   	
   }
   
     /**
	 * 	Update TranAmt800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTranAmt800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTranAmt800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TranAmt800 with another Field
	 *	@param value
	 */
   public void setTranAmt800(Field source) {
       replace(source,0,source.length(),beginTranAmt800,TRAN_AMT_800_LEN);
   	
   }  
   
     /**
	 * 	Update TranAmt800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTranAmt800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTranAmt800,TRAN_AMT_800_LEN);
   	
   }
   
     /**
	 * 	Update TranAmt800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTranAmt800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTranAmt800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tranAmtLen800
	 *	@return tranAmtLen800
	 */
	public int getTranAmtLen800() throws CFException {
       if (isTranAmtLen800Modified()) { 
           tranAmtLen800 = refreshTranAmtLen800();
        }
   		return tranAmtLen800;
	}
	

	
	   
	/**
	 * 	Update TranAmtLen800 with the passed value
	 *  Corresponding COBOL Variable is 800-TRAN-AMT-LEN
	 *	@param number
	 */
	public void setTranAmtLen800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    tranAmtLen800 = checkTranAmtLen800MaxLimit(number); 
		serializeTranAmtLen800(tranAmtLen800);
	}
	

	public void setTranAmtLen800(long number) {
	    number = checkTranAmtLen800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setTranAmtLen800((int)number);
	}
	
	/**
	 * 	Update TranAmtLen800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTranAmtLen800(char[] value) throws CFException {
		 tranAmtLen800 = serializeTranAmtLen800(value);
	}
	/**
	 * 	Update TranAmtLen800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTranAmtLen800String(char[] value) throws CFException {
		 setTranAmtLen800(value);
	}
	/**
	 *	Returns the value of type1800
	 *	@return type1800
	 */
   public char[] getType1800() throws CFException{
     if (isType1800Modified()) { 
        type1800 = refreshType1800();
     }
   		return type1800;
   }

  
	/**
	*  set variable type1800
	*  Corresponding COBOL Variable is 800-TYPE1
	*  @param value
	**/
   public void setType1800(char[] value) {
      type1800 = checkType1800Constraints(value);
      serializeType1800(type1800);
   } 

     /**
	 * 	Update Type1800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setType1800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginType1800,type1800.length);
   	
   }
   
   public void setType1800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginType1800,type1800.length);
   	
   }
   
     /**
	 * 	Update Type1800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setType1800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginType1800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Type1800 with another Field
	 *	@param value
	 */
   public void setType1800(Field source) {
       replace(source,0,source.length(),beginType1800,TYPE_1800_LEN);
   	
   }  
   
     /**
	 * 	Update Type1800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setType1800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginType1800,TYPE_1800_LEN);
   	
   }
   
     /**
	 * 	Update Type1800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setType1800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginType1800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ica1800
	 *	@return ica1800
	 */
	public long getIca1800() throws CFException {
       if (isIca1800Modified()) { 
           ica1800 = refreshIca1800();
        }
   		return ica1800;
	}
	

	
	   
	/**
	 * 	Update Ica1800 with the passed value
	 *  Corresponding COBOL Variable is 800-ICA1
	 *	@param number
	 */
	public void setIca1800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ica1800 = checkIca1800MaxLimit(number); 
		serializeIca1800(ica1800);
	}
	

	/**
	 * 	Update Ica1800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIca1800(char[] value) throws CFException {
		 ica1800 = serializeIca1800(value);
	}
	/**
	 * 	Update Ica1800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIca1800String(char[] value) throws CFException {
		 setIca1800(value);
	}
	/**
	 *	Returns the value of bin1800
	 *	@return bin1800
	 */
	public long getBin1800() throws CFException {
       if (isBin1800Modified()) { 
           bin1800 = refreshBin1800();
        }
   		return bin1800;
	}
	

	
	   
	/**
	 * 	Update Bin1800 with the passed value
	 *  Corresponding COBOL Variable is 800-BIN1
	 *	@param number
	 */
	public void setBin1800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    bin1800 = checkBin1800MaxLimit(number); 
		serializeBin1800(bin1800);
	}
	

	/**
	 * 	Update Bin1800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setBin1800(char[] value) throws CFException {
		 bin1800 = serializeBin1800(value);
	}
	/**
	 * 	Update Bin1800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBin1800String(char[] value) throws CFException {
		 setBin1800(value);
	}
	/**
	 *	Returns the value of maid1800
	 *	@return maid1800
	 */
	public long getMaid1800() throws CFException {
       if (isMaid1800Modified()) { 
           maid1800 = refreshMaid1800();
        }
   		return maid1800;
	}
	

	
	   
	/**
	 * 	Update Maid1800 with the passed value
	 *  Corresponding COBOL Variable is 800-MAID1
	 *	@param number
	 */
	public void setMaid1800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    maid1800 = checkMaid1800MaxLimit(number); 
		serializeMaid1800(maid1800);
	}
	

	/**
	 * 	Update Maid1800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMaid1800(char[] value) throws CFException {
		 maid1800 = serializeMaid1800(value);
	}
	/**
	 * 	Update Maid1800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMaid1800String(char[] value) throws CFException {
		 setMaid1800(value);
	}
	/**
	 *	Returns the value of endpoint1800
	 *	@return endpoint1800
	 */
	public long getEndpoint1800() throws CFException {
       if (isEndpoint1800Modified()) { 
           endpoint1800 = refreshEndpoint1800();
        }
   		return endpoint1800;
	}
	

	
	   
	/**
	 * 	Update Endpoint1800 with the passed value
	 *  Corresponding COBOL Variable is 800-ENDPOINT1
	 *	@param number
	 */
	public void setEndpoint1800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    endpoint1800 = checkEndpoint1800MaxLimit(number); 
		serializeEndpoint1800(endpoint1800);
	}
	

	/**
	 * 	Update Endpoint1800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setEndpoint1800(char[] value) throws CFException {
		 endpoint1800 = serializeEndpoint1800(value);
	}
	/**
	 * 	Update Endpoint1800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setEndpoint1800String(char[] value) throws CFException {
		 setEndpoint1800(value);
	}
	/**
	 *	Returns the value of type2800
	 *	@return type2800
	 */
   public char[] getType2800() throws CFException{
     if (isType2800Modified()) { 
        type2800 = refreshType2800();
     }
   		return type2800;
   }

  
	/**
	*  set variable type2800
	*  Corresponding COBOL Variable is 800-TYPE2
	*  @param value
	**/
   public void setType2800(char[] value) {
      type2800 = checkType2800Constraints(value);
      serializeType2800(type2800);
   } 

     /**
	 * 	Update Type2800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setType2800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginType2800,type2800.length);
   	
   }
   
   public void setType2800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginType2800,type2800.length);
   	
   }
   
     /**
	 * 	Update Type2800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setType2800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginType2800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Type2800 with another Field
	 *	@param value
	 */
   public void setType2800(Field source) {
       replace(source,0,source.length(),beginType2800,TYPE_2800_LEN);
   	
   }  
   
     /**
	 * 	Update Type2800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setType2800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginType2800,TYPE_2800_LEN);
   	
   }
   
     /**
	 * 	Update Type2800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setType2800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginType2800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ica2800
	 *	@return ica2800
	 */
	public long getIca2800() throws CFException {
       if (isIca2800Modified()) { 
           ica2800 = refreshIca2800();
        }
   		return ica2800;
	}
	

	
	   
	/**
	 * 	Update Ica2800 with the passed value
	 *  Corresponding COBOL Variable is 800-ICA2
	 *	@param number
	 */
	public void setIca2800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ica2800 = checkIca2800MaxLimit(number); 
		serializeIca2800(ica2800);
	}
	

	/**
	 * 	Update Ica2800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIca2800(char[] value) throws CFException {
		 ica2800 = serializeIca2800(value);
	}
	/**
	 * 	Update Ica2800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIca2800String(char[] value) throws CFException {
		 setIca2800(value);
	}
	/**
	 *	Returns the value of bin2800
	 *	@return bin2800
	 */
	public long getBin2800() throws CFException {
       if (isBin2800Modified()) { 
           bin2800 = refreshBin2800();
        }
   		return bin2800;
	}
	

	
	   
	/**
	 * 	Update Bin2800 with the passed value
	 *  Corresponding COBOL Variable is 800-BIN2
	 *	@param number
	 */
	public void setBin2800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    bin2800 = checkBin2800MaxLimit(number); 
		serializeBin2800(bin2800);
	}
	

	/**
	 * 	Update Bin2800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setBin2800(char[] value) throws CFException {
		 bin2800 = serializeBin2800(value);
	}
	/**
	 * 	Update Bin2800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBin2800String(char[] value) throws CFException {
		 setBin2800(value);
	}
	/**
	 *	Returns the value of maid2800
	 *	@return maid2800
	 */
	public long getMaid2800() throws CFException {
       if (isMaid2800Modified()) { 
           maid2800 = refreshMaid2800();
        }
   		return maid2800;
	}
	

	
	   
	/**
	 * 	Update Maid2800 with the passed value
	 *  Corresponding COBOL Variable is 800-MAID2
	 *	@param number
	 */
	public void setMaid2800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    maid2800 = checkMaid2800MaxLimit(number); 
		serializeMaid2800(maid2800);
	}
	

	/**
	 * 	Update Maid2800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMaid2800(char[] value) throws CFException {
		 maid2800 = serializeMaid2800(value);
	}
	/**
	 * 	Update Maid2800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMaid2800String(char[] value) throws CFException {
		 setMaid2800(value);
	}
	/**
	 *	Returns the value of endpoint2800
	 *	@return endpoint2800
	 */
	public long getEndpoint2800() throws CFException {
       if (isEndpoint2800Modified()) { 
           endpoint2800 = refreshEndpoint2800();
        }
   		return endpoint2800;
	}
	

	
	   
	/**
	 * 	Update Endpoint2800 with the passed value
	 *  Corresponding COBOL Variable is 800-ENDPOINT2
	 *	@param number
	 */
	public void setEndpoint2800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    endpoint2800 = checkEndpoint2800MaxLimit(number); 
		serializeEndpoint2800(endpoint2800);
	}
	

	/**
	 * 	Update Endpoint2800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setEndpoint2800(char[] value) throws CFException {
		 endpoint2800 = serializeEndpoint2800(value);
	}
	/**
	 * 	Update Endpoint2800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setEndpoint2800String(char[] value) throws CFException {
		 setEndpoint2800(value);
	}
	/**
	 *	Returns the value of donationAmount800
	 *	@return donationAmount800
	 */
	public long getDonationAmount800() throws CFException {
       if (isDonationAmount800Modified()) { 
           donationAmount800 = refreshDonationAmount800();
        }
   		return donationAmount800;
	}
	

	
	   
	/**
	 * 	Update DonationAmount800 with the passed value
	 *  Corresponding COBOL Variable is 800-DONATION-AMOUNT
	 *	@param number
	 */
	public void setDonationAmount800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    donationAmount800 = checkDonationAmount800MaxLimit(number); 
		serializeDonationAmount800(donationAmount800);
	}
	

	/**
	 * 	Update DonationAmount800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setDonationAmount800(char[] value) throws CFException {
		 donationAmount800 = serializeDonationAmount800(value);
	}
	/**
	 * 	Update DonationAmount800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDonationAmount800String(char[] value) throws CFException {
		 setDonationAmount800(value);
	}
	/**
	 *	Returns the value of ird800
	 *	@return ird800
	 */
   public char[] getIrd800() throws CFException{
     if (isIrd800Modified()) { 
        ird800 = refreshIrd800();
     }
   		return ird800;
   }

  
	/**
	*  set variable ird800
	*  Corresponding COBOL Variable is 800-IRD
	*  @param value
	**/
   public void setIrd800(char[] value) {
      ird800 = checkIrd800Constraints(value);
      serializeIrd800(ird800);
   } 

     /**
	 * 	Update Ird800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIrd800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIrd800,ird800.length);
   	
   }
   
   public void setIrd800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIrd800,ird800.length);
   	
   }
   
     /**
	 * 	Update Ird800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIrd800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIrd800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ird800 with another Field
	 *	@param value
	 */
   public void setIrd800(Field source) {
       replace(source,0,source.length(),beginIrd800,IRD_800_LEN);
   	
   }  
   
     /**
	 * 	Update Ird800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIrd800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIrd800,IRD_800_LEN);
   	
   }
   
     /**
	 * 	Update Ird800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIrd800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIrd800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWorkAreas800FieldLength() {
			return WORK_AREAS_800_LENGTH;
		}

}
  

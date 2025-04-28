package com.cloudframe.app.ip798030.dto;

/**
*  The class Parms is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/


import com.cloudframe.app.ip798030.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Parms extends ParmsSerialized {
   

								private short parmLength800;

						private char[] parmJobgroup800 = Field.fillLowValue(6);

								private int parmJobgrpNum800;


								private int retryCount800;


						private char[] launchType800 = Field.fillLowValue(1);


								private int commitCnt800;


						private char[] cloneOwnerId800 = Field.fillLowValue(3);


								private long preclearThrhdCnt800;


						private char[] debugFlag800 = Field.fillLowValue(1);


						private char[] prcsAgrmntId800 = Field.fillLowValue(11);
	
	/**
	* Constructor for Parms
	**/
    public Parms() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of parmLength800
	 *	@return parmLength800
	 */
	public short getParmLength800() throws CFException {
        if (isParmLength800Modified()) { 
           parmLength800 = refreshParmLength800();
        }
   		return parmLength800;
	}
	
	/**
	 * 	Update ParmLength800 with the passed value
	 *  Corresponding COBOL Variable is 800-PARM-LENGTH
	 *	@param number
	 */
	public void setParmLength800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    parmLength800 = checkParmLength800MaxLimit(number); 
		serializeParmLength800(parmLength800);
	}

	public void setParmLength800(int number) {
	    number = checkParmLength800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setParmLength800((short)number);
	}
	public void setParmLength800(long number) {
	    number = checkParmLength800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setParmLength800((short)number);
	}
	

	/**
	 *	Returns the value of parmJobgroup800
	 *	@return parmJobgroup800
	 */
   public char[] getParmJobgroup800() throws CFException{
     if (isParmJobgroup800Modified()) { 
        parmJobgroup800 = refreshParmJobgroup800();
     }
   		return parmJobgroup800;
   }

  
	/**
	*  set variable parmJobgroup800
	*  Corresponding COBOL Variable is 800-PARM-JOBGROUP
	*  @param value
	**/
   public void setParmJobgroup800(char[] value) {
      parmJobgroup800 = checkParmJobgroup800Constraints(value);
      serializeParmJobgroup800(parmJobgroup800);
   } 

     /**
	 * 	Update ParmJobgroup800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setParmJobgroup800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginParmJobgroup800,parmJobgroup800.length);
   	
   }
   
   public void setParmJobgroup800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginParmJobgroup800,parmJobgroup800.length);
   	
   }
   
     /**
	 * 	Update ParmJobgroup800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParmJobgroup800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParmJobgroup800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ParmJobgroup800 with another Field
	 *	@param value
	 */
   public void setParmJobgroup800(Field source) {
       replace(source,0,source.length(),beginParmJobgroup800,PARM_JOBGROUP_800_LEN);
   	
   }  
   
     /**
	 * 	Update ParmJobgroup800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setParmJobgroup800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginParmJobgroup800,PARM_JOBGROUP_800_LEN);
   	
   }
   
     /**
	 * 	Update ParmJobgroup800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParmJobgroup800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParmJobgroup800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of parmJobgrpNum800
	 *	@return parmJobgrpNum800
	 */
	public int getParmJobgrpNum800() throws CFException {
       if (isParmJobgrpNum800Modified()) { 
           parmJobgrpNum800 = refreshParmJobgrpNum800();
        }
   		return parmJobgrpNum800;
	}
	

	
	   
	/**
	 * 	Update ParmJobgrpNum800 with the passed value
	 *  Corresponding COBOL Variable is 800-PARM-JOBGRP-NUM
	 *	@param number
	 */
	public void setParmJobgrpNum800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    parmJobgrpNum800 = checkParmJobgrpNum800MaxLimit(number); 
		serializeParmJobgrpNum800(parmJobgrpNum800);
	}
	

	public void setParmJobgrpNum800(long number) {
	    number = checkParmJobgrpNum800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setParmJobgrpNum800((int)number);
	}
	
	/**
	 * 	Update ParmJobgrpNum800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setParmJobgrpNum800(char[] value) throws CFException {
		 parmJobgrpNum800 = serializeParmJobgrpNum800(value);
	}
	/**
	 * 	Update ParmJobgrpNum800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setParmJobgrpNum800String(char[] value) throws CFException {
		 setParmJobgrpNum800(value);
	}
	/**
	 *	Returns the value of retryCount800
	 *	@return retryCount800
	 */
	public int getRetryCount800() throws CFException {
       if (isRetryCount800Modified()) { 
           retryCount800 = refreshRetryCount800();
        }
   		return retryCount800;
	}
	

	
	   
	/**
	 * 	Update RetryCount800 with the passed value
	 *  Corresponding COBOL Variable is 800-RETRY-COUNT
	 *	@param number
	 */
	public void setRetryCount800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    retryCount800 = checkRetryCount800MaxLimit(number); 
		serializeRetryCount800(retryCount800);
	}
	

	public void setRetryCount800(long number) {
	    number = checkRetryCount800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setRetryCount800((int)number);
	}
	
	/**
	 * 	Update RetryCount800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setRetryCount800(char[] value) throws CFException {
		 retryCount800 = serializeRetryCount800(value);
	}
	/**
	 * 	Update RetryCount800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRetryCount800String(char[] value) throws CFException {
		 setRetryCount800(value);
	}
	/**
	 *	Returns the value of launchType800
	 *	@return launchType800
	 */
   public char[] getLaunchType800() throws CFException{
     if (isLaunchType800Modified()) { 
        launchType800 = refreshLaunchType800();
     }
   		return launchType800;
   }

  
	/**
	*  set variable launchType800
	*  Corresponding COBOL Variable is 800-LAUNCH-TYPE
	*  @param value
	**/
   public void setLaunchType800(char[] value) {
      launchType800 = checkLaunchType800Constraints(value);
      serializeLaunchType800(launchType800);
   } 

     /**
	 * 	Update LaunchType800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLaunchType800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLaunchType800,launchType800.length);
   	
   }
   
   public void setLaunchType800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLaunchType800,launchType800.length);
   	
   }
   
     /**
	 * 	Update LaunchType800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLaunchType800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLaunchType800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LaunchType800 with another Field
	 *	@param value
	 */
   public void setLaunchType800(Field source) {
       replace(source,0,source.length(),beginLaunchType800,LAUNCH_TYPE_800_LEN);
   	
   }  
   
     /**
	 * 	Update LaunchType800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLaunchType800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLaunchType800,LAUNCH_TYPE_800_LEN);
   	
   }
   
     /**
	 * 	Update LaunchType800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLaunchType800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLaunchType800+targetIndex,targetLen);
    
   }
	char[] itIsPreclear8880088Value = "P".toCharArray();
	/**
	 *	Test condition "P" for isItIsPreclear88800()
	 *	@return  Returns true if isItIsPreclear88800() is "P"
	 */
   public boolean isItIsPreclear88800() throws CFException {
      return (  compareChars( getLaunchType800() , itIsPreclear8880088Value)  == 0  );
   }


	/**
	*  set values "P"
	*/
   	public void setItIsPreclear88800True() {  			
    	setLaunchType800( itIsPreclear8880088Value);
   	}
	/**
	 *	Returns the value of commitCnt800
	 *	@return commitCnt800
	 */
	public int getCommitCnt800() throws CFException {
       if (isCommitCnt800Modified()) { 
           commitCnt800 = refreshCommitCnt800();
        }
   		return commitCnt800;
	}
	

	
	   
	/**
	 * 	Update CommitCnt800 with the passed value
	 *  Corresponding COBOL Variable is 800-COMMIT-CNT
	 *	@param number
	 */
	public void setCommitCnt800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    commitCnt800 = checkCommitCnt800MaxLimit(number); 
		serializeCommitCnt800(commitCnt800);
	}
	

	public void setCommitCnt800(long number) {
	    number = checkCommitCnt800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setCommitCnt800((int)number);
	}
	
	/**
	 * 	Update CommitCnt800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCommitCnt800(char[] value) throws CFException {
		 commitCnt800 = serializeCommitCnt800(value);
	}
	/**
	 * 	Update CommitCnt800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCommitCnt800String(char[] value) throws CFException {
		 setCommitCnt800(value);
	}
	/**
	 *	Returns the value of cloneOwnerId800
	 *	@return cloneOwnerId800
	 */
   public char[] getCloneOwnerId800() throws CFException{
     if (isCloneOwnerId800Modified()) { 
        cloneOwnerId800 = refreshCloneOwnerId800();
     }
   		return cloneOwnerId800;
   }

  
	/**
	*  set variable cloneOwnerId800
	*  Corresponding COBOL Variable is 800-CLONE-OWNER-ID
	*  @param value
	**/
   public void setCloneOwnerId800(char[] value) {
      cloneOwnerId800 = checkCloneOwnerId800Constraints(value);
      serializeCloneOwnerId800(cloneOwnerId800);
   } 

     /**
	 * 	Update CloneOwnerId800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCloneOwnerId800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCloneOwnerId800,cloneOwnerId800.length);
   	
   }
   
   public void setCloneOwnerId800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCloneOwnerId800,cloneOwnerId800.length);
   	
   }
   
     /**
	 * 	Update CloneOwnerId800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCloneOwnerId800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCloneOwnerId800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CloneOwnerId800 with another Field
	 *	@param value
	 */
   public void setCloneOwnerId800(Field source) {
       replace(source,0,source.length(),beginCloneOwnerId800,CLONE_OWNER_ID_800_LEN);
   	
   }  
   
     /**
	 * 	Update CloneOwnerId800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCloneOwnerId800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCloneOwnerId800,CLONE_OWNER_ID_800_LEN);
   	
   }
   
     /**
	 * 	Update CloneOwnerId800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCloneOwnerId800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCloneOwnerId800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of preclearThrhdCnt800
	 *	@return preclearThrhdCnt800
	 */
	public long getPreclearThrhdCnt800() throws CFException {
       if (isPreclearThrhdCnt800Modified()) { 
           preclearThrhdCnt800 = refreshPreclearThrhdCnt800();
        }
   		return preclearThrhdCnt800;
	}
	

	
	   
	/**
	 * 	Update PreclearThrhdCnt800 with the passed value
	 *  Corresponding COBOL Variable is 800-PRECLEAR-THRHD-CNT
	 *	@param number
	 */
	public void setPreclearThrhdCnt800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    preclearThrhdCnt800 = checkPreclearThrhdCnt800MaxLimit(number); 
		serializePreclearThrhdCnt800(preclearThrhdCnt800);
	}
	

	/**
	 * 	Update PreclearThrhdCnt800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPreclearThrhdCnt800(char[] value) throws CFException {
		 preclearThrhdCnt800 = serializePreclearThrhdCnt800(value);
	}
	/**
	 * 	Update PreclearThrhdCnt800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPreclearThrhdCnt800String(char[] value) throws CFException {
		 setPreclearThrhdCnt800(value);
	}
	/**
	 *	Returns the value of debugFlag800
	 *	@return debugFlag800
	 */
   public char[] getDebugFlag800() throws CFException{
     if (isDebugFlag800Modified()) { 
        debugFlag800 = refreshDebugFlag800();
     }
   		return debugFlag800;
   }

  
	/**
	*  set variable debugFlag800
	*  Corresponding COBOL Variable is 800-DEBUG-FLAG
	*  @param value
	**/
   public void setDebugFlag800(char[] value) {
      debugFlag800 = checkDebugFlag800Constraints(value);
      serializeDebugFlag800(debugFlag800);
   } 

     /**
	 * 	Update DebugFlag800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDebugFlag800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDebugFlag800,debugFlag800.length);
   	
   }
   
   public void setDebugFlag800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDebugFlag800,debugFlag800.length);
   	
   }
   
     /**
	 * 	Update DebugFlag800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDebugFlag800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDebugFlag800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DebugFlag800 with another Field
	 *	@param value
	 */
   public void setDebugFlag800(Field source) {
       replace(source,0,source.length(),beginDebugFlag800,DEBUG_FLAG_800_LEN);
   	
   }  
   
     /**
	 * 	Update DebugFlag800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDebugFlag800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDebugFlag800,DEBUG_FLAG_800_LEN);
   	
   }
   
     /**
	 * 	Update DebugFlag800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDebugFlag800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDebugFlag800+targetIndex,targetLen);
    
   }
	char[] debugFlagY8880088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isDebugFlagY88800()
	 *	@return  Returns true if isDebugFlagY88800() is "Y"
	 */
   public boolean isDebugFlagY88800() throws CFException {
      return (  compareChars( getDebugFlag800() , debugFlagY8880088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setDebugFlagY88800True() {  			
    	setDebugFlag800( debugFlagY8880088Value);
   	}
	char[] debugFlagN8880088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isDebugFlagN88800()
	 *	@return  Returns true if isDebugFlagN88800() is "N"
	 */
   public boolean isDebugFlagN88800() throws CFException {
      return (  compareChars( getDebugFlag800() , debugFlagN8880088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setDebugFlagN88800True() {  			
    	setDebugFlag800( debugFlagN8880088Value);
   	}
	/**
	 *	Returns the value of prcsAgrmntId800
	 *	@return prcsAgrmntId800
	 */
   public char[] getPrcsAgrmntId800() throws CFException{
     if (isPrcsAgrmntId800Modified()) { 
        prcsAgrmntId800 = refreshPrcsAgrmntId800();
     }
   		return prcsAgrmntId800;
   }

  
	/**
	*  set variable prcsAgrmntId800
	*  Corresponding COBOL Variable is 800-PRCS-AGRMNT-ID
	*  @param value
	**/
   public void setPrcsAgrmntId800(char[] value) {
      prcsAgrmntId800 = checkPrcsAgrmntId800Constraints(value);
      serializePrcsAgrmntId800(prcsAgrmntId800);
   } 

     /**
	 * 	Update PrcsAgrmntId800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrcsAgrmntId800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPrcsAgrmntId800,prcsAgrmntId800.length);
   	
   }
   
   public void setPrcsAgrmntId800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPrcsAgrmntId800,prcsAgrmntId800.length);
   	
   }
   
     /**
	 * 	Update PrcsAgrmntId800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrcsAgrmntId800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrcsAgrmntId800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PrcsAgrmntId800 with another Field
	 *	@param value
	 */
   public void setPrcsAgrmntId800(Field source) {
       replace(source,0,source.length(),beginPrcsAgrmntId800,PRCS_AGRMNT_ID_800_LEN);
   	
   }  
   
     /**
	 * 	Update PrcsAgrmntId800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrcsAgrmntId800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPrcsAgrmntId800,PRCS_AGRMNT_ID_800_LEN);
   	
   }
   
     /**
	 * 	Update PrcsAgrmntId800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrcsAgrmntId800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrcsAgrmntId800+targetIndex,targetLen);
    
   }
	char[] prcsGlobal8880088Value = "GLOBAL     ".toCharArray();
	/**
	 *	Test condition "GLOBAL" for isPrcsGlobal88800()
	 *	@return  Returns true if isPrcsGlobal88800() is "GLOBAL"
	 */
   public boolean isPrcsGlobal88800() throws CFException {
      return (  compareChars( getPrcsAgrmntId800() , prcsGlobal8880088Value)  == 0  );
   }


	/**
	*  set values "GLOBAL"
	*/
   	public void setPrcsGlobal88800True() {  			
    	setPrcsAgrmntId800( prcsGlobal8880088Value);
   	}
	char[] prcsLprus8880088Value = "LPRUS      ".toCharArray();
	/**
	 *	Test condition "LPRUS" for isPrcsLprus88800()
	 *	@return  Returns true if isPrcsLprus88800() is "LPRUS"
	 */
   public boolean isPrcsLprus88800() throws CFException {
      return (  compareChars( getPrcsAgrmntId800() , prcsLprus8880088Value)  == 0  );
   }


	/**
	*  set values "LPRUS"
	*/
   	public void setPrcsLprus88800True() {  			
    	setPrcsAgrmntId800( prcsLprus8880088Value);
   	}
	char[] prcsLpidn8880088Value = "LPIDN      ".toCharArray();
	/**
	 *	Test condition "LPIDN" for isPrcsLpidn88800()
	 *	@return  Returns true if isPrcsLpidn88800() is "LPIDN"
	 */
   public boolean isPrcsLpidn88800() throws CFException {
      return (  compareChars( getPrcsAgrmntId800() , prcsLpidn8880088Value)  == 0  );
   }


	/**
	*  set values "LPIDN"
	*/
   	public void setPrcsLpidn88800True() {  			
    	setPrcsAgrmntId800( prcsLpidn8880088Value);
   	}
	char[] prcsRpnspk8880088Value = "RPNSPK     ".toCharArray();
	/**
	 *	Test condition "RPNSPK" for isPrcsRpnspk88800()
	 *	@return  Returns true if isPrcsRpnspk88800() is "RPNSPK"
	 */
   public boolean isPrcsRpnspk88800() throws CFException {
      return (  compareChars( getPrcsAgrmntId800() , prcsRpnspk8880088Value)  == 0  );
   }


	/**
	*  set values "RPNSPK"
	*/
   	public void setPrcsRpnspk88800True() {  			
    	setPrcsAgrmntId800( prcsRpnspk8880088Value);
   	}

	
	
	

		public static int getParmsFieldLength() {
			return PARMS_LENGTH;
		}

}
  

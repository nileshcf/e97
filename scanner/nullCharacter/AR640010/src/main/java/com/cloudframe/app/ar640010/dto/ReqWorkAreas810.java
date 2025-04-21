package com.cloudframe.app.ar640010.dto;

/**
*  The class ReqWorkAreas810 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ReqWorkAreas810 extends ReqWorkAreas810Serialized {
   

						private char[] applTkn810 = new char[128];

						private char[] functionTs810 = new char[26];

						private char[] bulkId810 = new char[4];

						private char[] endptId810 = new char[7];

						private char[] endptIdOrig810 = new char[7];

						private char[] busPrtnrIdOrig810 = new char[6];

								private short cyclNum810;
				private CyclNumRange810 cyclNumRange810 = new CyclNumRange810();

						private char[] busPrtnrId810 = new char[6];
				private ProcDate810 procDate810 = new ProcDate810();

								private int procJulDay810;

								private long computeDate810;

						private char[] statCd810 = new char[1];

						private char[] xferMthdCd810 = new char[1];

						private char[] xferTypeCd810 = new char[1];

						private char[] sndRcvPrmsnCd810 = new char[1];

						private char[] renameHlq810 = new char[8];

						private char[] renameSystemId810 = new char[8];

						private char[] preExitDsn810 = new char[44];
				private ApplExitWork810 applExitWork810 = new ApplExitWork810();

						private char[] rteToHubSw810 = new char[1];
	
	/**
	* Constructor for ReqWorkAreas810
	**/
    public ReqWorkAreas810() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			cyclNumRange810.setParent(this,getStartOffset() + 180);
	       			procDate810.setParent(this,getStartOffset() + 190);
	       			applExitWork810.setParent(this,getStartOffset() + 275);
	   	/*  end of offset */
								setApplTkn810(pad(128," ".toCharArray(),' ',RIGHT_PAD));
								setFunctionTs810(fillSpace(26));
								setBulkId810(fillSpace(4));
								setEndptId810(fillSpace(7));
								setEndptIdOrig810(fillSpace(7));
								setBusPrtnrIdOrig810(fillSpace(6));
								setCyclNum810((short)0);
								setBusPrtnrId810(fillSpace(6));
								setProcJulDay810(0);
								setComputeDate810(0L);
								setStatCd810(fillSpace(1));
								setXferMthdCd810(fillSpace(1));
								setXferTypeCd810(fillSpace(1));
								setSndRcvPrmsnCd810(fillSpace(1));
								setRenameHlq810(fillSpace(8));
								setRenameSystemId810(fillSpace(8));
								setPreExitDsn810(fillSpace(44));
								setRteToHubSw810(fillSpace(1));
    }


 

	/**
	 *	Returns the value of applTkn810
	 *	@return applTkn810
	 */
   public char[] getApplTkn810() throws CFException{
     if (isApplTkn810Modified()) { 
        applTkn810 = refreshApplTkn810();
     }
   		return applTkn810;
   }

  
	/**
	*  set variable applTkn810
	*  Corresponding COBOL Variable is 810-APPL-TKN
	*  @param value
	**/
   public void setApplTkn810(char[] value) {
      applTkn810 = checkApplTkn810Constraints(value);
      serializeApplTkn810(applTkn810);
   } 

     /**
	 * 	Update ApplTkn810 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setApplTkn810(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginApplTkn810,applTkn810.length);
   	
   }
   
   public void setApplTkn810(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginApplTkn810,applTkn810.length);
   	
   }
   
     /**
	 * 	Update ApplTkn810 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setApplTkn810(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginApplTkn810+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ApplTkn810 with another Field
	 *	@param value
	 */
   public void setApplTkn810(Field source) {
       replace(source,0,source.length(),beginApplTkn810,APPL_TKN_810_LEN);
   	
   }  
   
     /**
	 * 	Update ApplTkn810 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setApplTkn810(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginApplTkn810,APPL_TKN_810_LEN);
   	
   }
   
     /**
	 * 	Update ApplTkn810 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setApplTkn810(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginApplTkn810+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of functionTs810
	 *	@return functionTs810
	 */
   public char[] getFunctionTs810() throws CFException{
     if (isFunctionTs810Modified()) { 
        functionTs810 = refreshFunctionTs810();
     }
   		return functionTs810;
   }

  
	/**
	*  set variable functionTs810
	*  Corresponding COBOL Variable is 810-FUNCTION-TS
	*  @param value
	**/
   public void setFunctionTs810(char[] value) {
      functionTs810 = checkFunctionTs810Constraints(value);
      serializeFunctionTs810(functionTs810);
   } 

     /**
	 * 	Update FunctionTs810 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFunctionTs810(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFunctionTs810,functionTs810.length);
   	
   }
   
   public void setFunctionTs810(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFunctionTs810,functionTs810.length);
   	
   }
   
     /**
	 * 	Update FunctionTs810 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFunctionTs810(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFunctionTs810+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FunctionTs810 with another Field
	 *	@param value
	 */
   public void setFunctionTs810(Field source) {
       replace(source,0,source.length(),beginFunctionTs810,FUNCTION_TS_810_LEN);
   	
   }  
   
     /**
	 * 	Update FunctionTs810 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFunctionTs810(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFunctionTs810,FUNCTION_TS_810_LEN);
   	
   }
   
     /**
	 * 	Update FunctionTs810 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFunctionTs810(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFunctionTs810+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bulkId810
	 *	@return bulkId810
	 */
   public char[] getBulkId810() throws CFException{
     if (isBulkId810Modified()) { 
        bulkId810 = refreshBulkId810();
     }
   		return bulkId810;
   }

  
	/**
	*  set variable bulkId810
	*  Corresponding COBOL Variable is 810-BULK-ID
	*  @param value
	**/
   public void setBulkId810(char[] value) {
      bulkId810 = checkBulkId810Constraints(value);
      serializeBulkId810(bulkId810);
   } 

     /**
	 * 	Update BulkId810 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBulkId810(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBulkId810,bulkId810.length);
   	
   }
   
   public void setBulkId810(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBulkId810,bulkId810.length);
   	
   }
   
     /**
	 * 	Update BulkId810 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBulkId810(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBulkId810+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BulkId810 with another Field
	 *	@param value
	 */
   public void setBulkId810(Field source) {
       replace(source,0,source.length(),beginBulkId810,BULK_ID_810_LEN);
   	
   }  
   
     /**
	 * 	Update BulkId810 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBulkId810(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBulkId810,BULK_ID_810_LEN);
   	
   }
   
     /**
	 * 	Update BulkId810 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBulkId810(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBulkId810+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of endptId810
	 *	@return endptId810
	 */
   public char[] getEndptId810() throws CFException{
     if (isEndptId810Modified()) { 
        endptId810 = refreshEndptId810();
     }
   		return endptId810;
   }

  
	/**
	*  set variable endptId810
	*  Corresponding COBOL Variable is 810-ENDPT-ID
	*  @param value
	**/
   public void setEndptId810(char[] value) {
      endptId810 = checkEndptId810Constraints(value);
      serializeEndptId810(endptId810);
   } 

     /**
	 * 	Update EndptId810 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEndptId810(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEndptId810,endptId810.length);
   	
   }
   
   public void setEndptId810(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEndptId810,endptId810.length);
   	
   }
   
     /**
	 * 	Update EndptId810 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEndptId810(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEndptId810+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EndptId810 with another Field
	 *	@param value
	 */
   public void setEndptId810(Field source) {
       replace(source,0,source.length(),beginEndptId810,ENDPT_ID_810_LEN);
   	
   }  
   
     /**
	 * 	Update EndptId810 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEndptId810(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEndptId810,ENDPT_ID_810_LEN);
   	
   }
   
     /**
	 * 	Update EndptId810 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEndptId810(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEndptId810+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of endptIdOrig810
	 *	@return endptIdOrig810
	 */
   public char[] getEndptIdOrig810() throws CFException{
     if (isEndptIdOrig810Modified()) { 
        endptIdOrig810 = refreshEndptIdOrig810();
     }
   		return endptIdOrig810;
   }

  
	/**
	*  set variable endptIdOrig810
	*  Corresponding COBOL Variable is 810-ENDPT-ID-ORIG
	*  @param value
	**/
   public void setEndptIdOrig810(char[] value) {
      endptIdOrig810 = checkEndptIdOrig810Constraints(value);
      serializeEndptIdOrig810(endptIdOrig810);
   } 

     /**
	 * 	Update EndptIdOrig810 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEndptIdOrig810(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEndptIdOrig810,endptIdOrig810.length);
   	
   }
   
   public void setEndptIdOrig810(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEndptIdOrig810,endptIdOrig810.length);
   	
   }
   
     /**
	 * 	Update EndptIdOrig810 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEndptIdOrig810(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEndptIdOrig810+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EndptIdOrig810 with another Field
	 *	@param value
	 */
   public void setEndptIdOrig810(Field source) {
       replace(source,0,source.length(),beginEndptIdOrig810,ENDPT_ID_ORIG_810_LEN);
   	
   }  
   
     /**
	 * 	Update EndptIdOrig810 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEndptIdOrig810(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEndptIdOrig810,ENDPT_ID_ORIG_810_LEN);
   	
   }
   
     /**
	 * 	Update EndptIdOrig810 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEndptIdOrig810(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEndptIdOrig810+targetIndex,targetLen);
    
   }
	char[] endptIdOriginal8881088Value = "       ".toCharArray();
	/**
	 *	Test condition " " for isEndptIdOriginal88810()
	 *	@return  Returns true if isEndptIdOriginal88810() is " "
	 */
   public boolean isEndptIdOriginal88810() throws CFException {
      return (  compareChars( getEndptIdOrig810() , endptIdOriginal8881088Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setEndptIdOriginal88810True() {  			
    	setEndptIdOrig810( endptIdOriginal8881088Value);
   	}
	/**
	 *	Returns the value of busPrtnrIdOrig810
	 *	@return busPrtnrIdOrig810
	 */
   public char[] getBusPrtnrIdOrig810() throws CFException{
     if (isBusPrtnrIdOrig810Modified()) { 
        busPrtnrIdOrig810 = refreshBusPrtnrIdOrig810();
     }
   		return busPrtnrIdOrig810;
   }

  
	/**
	*  set variable busPrtnrIdOrig810
	*  Corresponding COBOL Variable is 810-BUS-PRTNR-ID-ORIG
	*  @param value
	**/
   public void setBusPrtnrIdOrig810(char[] value) {
      busPrtnrIdOrig810 = checkBusPrtnrIdOrig810Constraints(value);
      serializeBusPrtnrIdOrig810(busPrtnrIdOrig810);
   } 

     /**
	 * 	Update BusPrtnrIdOrig810 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBusPrtnrIdOrig810(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBusPrtnrIdOrig810,busPrtnrIdOrig810.length);
   	
   }
   
   public void setBusPrtnrIdOrig810(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBusPrtnrIdOrig810,busPrtnrIdOrig810.length);
   	
   }
   
     /**
	 * 	Update BusPrtnrIdOrig810 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBusPrtnrIdOrig810(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBusPrtnrIdOrig810+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BusPrtnrIdOrig810 with another Field
	 *	@param value
	 */
   public void setBusPrtnrIdOrig810(Field source) {
       replace(source,0,source.length(),beginBusPrtnrIdOrig810,BUS_PRTNR_ID_ORIG_810_LEN);
   	
   }  
   
     /**
	 * 	Update BusPrtnrIdOrig810 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBusPrtnrIdOrig810(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBusPrtnrIdOrig810,BUS_PRTNR_ID_ORIG_810_LEN);
   	
   }
   
     /**
	 * 	Update BusPrtnrIdOrig810 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBusPrtnrIdOrig810(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBusPrtnrIdOrig810+targetIndex,targetLen);
    
   }
	public short getCyclNum810() throws CFException {
        if (isCyclNum810Modified()) { 
           cyclNum810 = refreshCyclNum810();
        }
   		return cyclNum810;
	}
	
	/**
	 * 	Update CyclNum810 with the passed value
	 *  Corresponding COBOL Variable is 810-CYCL-NUM
	 *	@param number
	 */
	public void setCyclNum810(short number) {
			cyclNum810 = checkCyclNum810MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeCyclNum810(cyclNum810);
	}

	public void setCyclNum810(int number) {
	    number = checkCyclNum810MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCyclNum810((short)number);
	}
	public void setCyclNum810(long number) {
	    number = checkCyclNum810MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCyclNum810((short)number);
	}
	

	
	/**
	 *	Test condition 1 for isCyclNumDflt88810()
	 *	@return  Returns true if isCyclNumDflt88810() is 1
	 */
   public boolean isCyclNumDflt88810() throws CFException {
      return (  getCyclNum810()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setCyclNumDflt88810True() {  			
    	setCyclNum810( (short)1);
   	}
	/**
	 *	Returns the value of cyclNumRange810
	 *	@return cyclNumRange810
	 */   
	 public CyclNumRange810 getCyclNumRange810() {
   	return cyclNumRange810;
   }
   /**
	* 	Update CyclNumRange810 with the passed value
	*   Corresponding COBOL Variable is 810-CYCL-NUM-RANGE
	*	@param value
	*/
   public void setCyclNumRange810(char[] value) {
      cyclNumRange810.setString(value); 
   }   
    
     /**
	 * 	Update CyclNumRange810 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCyclNumRange810(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cyclNumRange810.begin,cyclNumRange810.length());
   }
   
     /**
	 * 	Update CyclNumRange810 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCyclNumRange810(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cyclNumRange810.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CyclNumRange810 with another Field
	 *	@param value
	 */
   public void setCyclNumRange810(Field source) {
   	replace(source,0,source.length(),cyclNumRange810.begin,cyclNumRange810.length());
   }  
   
     /**
	 * 	Update CyclNumRange810 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCyclNumRange810(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cyclNumRange810.begin,cyclNumRange810.length());
   }
   
     /**
	 * 	Update CyclNumRange810 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCyclNumRange810(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cyclNumRange810.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of busPrtnrId810
	 *	@return busPrtnrId810
	 */
   public char[] getBusPrtnrId810() throws CFException{
     if (isBusPrtnrId810Modified()) { 
        busPrtnrId810 = refreshBusPrtnrId810();
     }
   		return busPrtnrId810;
   }

  
	/**
	*  set variable busPrtnrId810
	*  Corresponding COBOL Variable is 810-BUS-PRTNR-ID
	*  @param value
	**/
   public void setBusPrtnrId810(char[] value) {
      busPrtnrId810 = checkBusPrtnrId810Constraints(value);
      serializeBusPrtnrId810(busPrtnrId810);
   } 

     /**
	 * 	Update BusPrtnrId810 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBusPrtnrId810(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBusPrtnrId810,busPrtnrId810.length);
   	
   }
   
   public void setBusPrtnrId810(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBusPrtnrId810,busPrtnrId810.length);
   	
   }
   
     /**
	 * 	Update BusPrtnrId810 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBusPrtnrId810(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBusPrtnrId810+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BusPrtnrId810 with another Field
	 *	@param value
	 */
   public void setBusPrtnrId810(Field source) {
       replace(source,0,source.length(),beginBusPrtnrId810,BUS_PRTNR_ID_810_LEN);
   	
   }  
   
     /**
	 * 	Update BusPrtnrId810 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBusPrtnrId810(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBusPrtnrId810,BUS_PRTNR_ID_810_LEN);
   	
   }
   
     /**
	 * 	Update BusPrtnrId810 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBusPrtnrId810(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBusPrtnrId810+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of procDate810
	 *	@return procDate810
	 */   
	 public ProcDate810 getProcDate810() {
   	return procDate810;
   }
   /**
	* 	Update ProcDate810 with the passed value
	*   Corresponding COBOL Variable is 810-PROC-DATE
	*	@param value
	*/
   public void setProcDate810(char[] value) {
      procDate810.setString(value); 
   }   
    
     /**
	 * 	Update ProcDate810 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setProcDate810(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,procDate810.begin,procDate810.length());
   }
   
     /**
	 * 	Update ProcDate810 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setProcDate810(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,procDate810.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ProcDate810 with another Field
	 *	@param value
	 */
   public void setProcDate810(Field source) {
   	replace(source,0,source.length(),procDate810.begin,procDate810.length());
   }  
   
     /**
	 * 	Update ProcDate810 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setProcDate810(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,procDate810.begin,procDate810.length());
   }
   
     /**
	 * 	Update ProcDate810 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setProcDate810(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,procDate810.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of procJulDay810
	 *	@return procJulDay810
	 */
	public int getProcJulDay810() throws CFException {
       if (isProcJulDay810Modified()) { 
           procJulDay810 = refreshProcJulDay810();
        }
   		return procJulDay810;
	}
	

	
	   
	/**
	 * 	Update ProcJulDay810 with the passed value
	 *  Corresponding COBOL Variable is 810-PROC-JUL-DAY
	 *	@param number
	 */
	public void setProcJulDay810(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    procJulDay810 = checkProcJulDay810MaxLimit(number); 
		serializeProcJulDay810(procJulDay810);
	}
	

	public void setProcJulDay810(long number) {
	    number = checkProcJulDay810MaxLimit(number); // Truncate if value is beyond +/- Max range
		setProcJulDay810((int)number);
	}
	
	/**
	 * 	Update ProcJulDay810 with the passed value
	 *	@param value (String or char[])
	 */
	public void setProcJulDay810(char[] value) throws CFException {
		 procJulDay810 = serializeProcJulDay810(value);
	}
	/**
	 * 	Update ProcJulDay810 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setProcJulDay810String(char[] value) throws CFException {
		 setProcJulDay810(value);
	}
	/**
	 *	Returns the value of computeDate810
	 *	@return computeDate810
	 */
	public long getComputeDate810() throws CFException {
       if (isComputeDate810Modified()) { 
           computeDate810 = refreshComputeDate810();
        }
   		return computeDate810;
	}
	

	
	   
	/**
	 * 	Update ComputeDate810 with the passed value
	 *  Corresponding COBOL Variable is 810-COMPUTE-DATE
	 *	@param number
	 */
	public void setComputeDate810(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    computeDate810 = checkComputeDate810MaxLimit(number); 
		serializeComputeDate810(computeDate810);
	}
	

	/**
	 * 	Update ComputeDate810 with the passed value
	 *	@param value (String or char[])
	 */
	public void setComputeDate810(char[] value) throws CFException {
		 computeDate810 = serializeComputeDate810(value);
	}
	/**
	 * 	Update ComputeDate810 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setComputeDate810String(char[] value) throws CFException {
		 setComputeDate810(value);
	}
	/**
	 *	Returns the value of statCd810
	 *	@return statCd810
	 */
   public char[] getStatCd810() throws CFException{
     if (isStatCd810Modified()) { 
        statCd810 = refreshStatCd810();
     }
   		return statCd810;
   }

  
	/**
	*  set variable statCd810
	*  Corresponding COBOL Variable is 810-STAT-CD
	*  @param value
	**/
   public void setStatCd810(char[] value) {
      statCd810 = checkStatCd810Constraints(value);
      serializeStatCd810(statCd810);
   } 

     /**
	 * 	Update StatCd810 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setStatCd810(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginStatCd810,statCd810.length);
   	
   }
   
   public void setStatCd810(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginStatCd810,statCd810.length);
   	
   }
   
     /**
	 * 	Update StatCd810 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStatCd810(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStatCd810+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update StatCd810 with another Field
	 *	@param value
	 */
   public void setStatCd810(Field source) {
       replace(source,0,source.length(),beginStatCd810,STAT_CD_810_LEN);
   	
   }  
   
     /**
	 * 	Update StatCd810 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setStatCd810(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginStatCd810,STAT_CD_810_LEN);
   	
   }
   
     /**
	 * 	Update StatCd810 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStatCd810(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStatCd810+targetIndex,targetLen);
    
   }
	char[] statAvailOutbound8881088Value = "A".toCharArray();
	/**
	 *	Test condition "A" for isStatAvailOutbound88810()
	 *	@return  Returns true if isStatAvailOutbound88810() is "A"
	 */
   public boolean isStatAvailOutbound88810() throws CFException {
      return (  compareChars( getStatCd810() , statAvailOutbound8881088Value)  == 0  );
   }


	/**
	*  set values "A"
	*/
   	public void setStatAvailOutbound88810True() {  			
    	setStatCd810( statAvailOutbound8881088Value);
   	}
	char[] statFileComplete8881088Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isStatFileComplete88810()
	 *	@return  Returns true if isStatFileComplete88810() is "C"
	 */
   public boolean isStatFileComplete88810() throws CFException {
      return (  compareChars( getStatCd810() , statFileComplete8881088Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setStatFileComplete88810True() {  			
    	setStatCd810( statFileComplete8881088Value);
   	}
	char[] statFileDownloading8881088Value = "D".toCharArray();
	/**
	 *	Test condition "D" for isStatFileDownloading88810()
	 *	@return  Returns true if isStatFileDownloading88810() is "D"
	 */
   public boolean isStatFileDownloading88810() throws CFException {
      return (  compareChars( getStatCd810() , statFileDownloading8881088Value)  == 0  );
   }


	/**
	*  set values "D"
	*/
   	public void setStatFileDownloading88810True() {  			
    	setStatCd810( statFileDownloading8881088Value);
   	}
	char[] statFileError8881088Value = "E".toCharArray();
	/**
	 *	Test condition "E" for isStatFileError88810()
	 *	@return  Returns true if isStatFileError88810() is "E"
	 */
   public boolean isStatFileError88810() throws CFException {
      return (  compareChars( getStatCd810() , statFileError8881088Value)  == 0  );
   }


	/**
	*  set values "E"
	*/
   	public void setStatFileError88810True() {  			
    	setStatCd810( statFileError8881088Value);
   	}
	char[] statHubRouting8881088Value = "H".toCharArray();
	/**
	 *	Test condition "H" for isStatHubRouting88810()
	 *	@return  Returns true if isStatHubRouting88810() is "H"
	 */
   public boolean isStatHubRouting88810() throws CFException {
      return (  compareChars( getStatCd810() , statHubRouting8881088Value)  == 0  );
   }


	/**
	*  set values "H"
	*/
   	public void setStatHubRouting88810True() {  			
    	setStatCd810( statHubRouting8881088Value);
   	}
	char[] statLogicExitWait8881088Value = "L".toCharArray();
	/**
	 *	Test condition "L" for isStatLogicExitWait88810()
	 *	@return  Returns true if isStatLogicExitWait88810() is "L"
	 */
   public boolean isStatLogicExitWait88810() throws CFException {
      return (  compareChars( getStatCd810() , statLogicExitWait8881088Value)  == 0  );
   }


	/**
	*  set values "L"
	*/
   	public void setStatLogicExitWait88810True() {  			
    	setStatCd810( statLogicExitWait8881088Value);
   	}
	char[] statFilePended8881088Value = "P".toCharArray();
	/**
	 *	Test condition "P" for isStatFilePended88810()
	 *	@return  Returns true if isStatFilePended88810() is "P"
	 */
   public boolean isStatFilePended88810() throws CFException {
      return (  compareChars( getStatCd810() , statFilePended8881088Value)  == 0  );
   }


	/**
	*  set values "P"
	*/
   	public void setStatFilePended88810True() {  			
    	setStatCd810( statFilePended8881088Value);
   	}
	char[] statQuiescedEndpt8881088Value = "Q".toCharArray();
	/**
	 *	Test condition "Q" for isStatQuiescedEndpt88810()
	 *	@return  Returns true if isStatQuiescedEndpt88810() is "Q"
	 */
   public boolean isStatQuiescedEndpt88810() throws CFException {
      return (  compareChars( getStatCd810() , statQuiescedEndpt8881088Value)  == 0  );
   }


	/**
	*  set values "Q"
	*/
   	public void setStatQuiescedEndpt88810True() {  			
    	setStatCd810( statQuiescedEndpt8881088Value);
   	}
	char[] statReadyInbound8881088Value = "R".toCharArray();
	/**
	 *	Test condition "R" for isStatReadyInbound88810()
	 *	@return  Returns true if isStatReadyInbound88810() is "R"
	 */
   public boolean isStatReadyInbound88810() throws CFException {
      return (  compareChars( getStatCd810() , statReadyInbound8881088Value)  == 0  );
   }


	/**
	*  set values "R"
	*/
   	public void setStatReadyInbound88810True() {  			
    	setStatCd810( statReadyInbound8881088Value);
   	}
	char[] statLogicalDelete8881088Value = "T".toCharArray();
	/**
	 *	Test condition "T" for isStatLogicalDelete88810()
	 *	@return  Returns true if isStatLogicalDelete88810() is "T"
	 */
   public boolean isStatLogicalDelete88810() throws CFException {
      return (  compareChars( getStatCd810() , statLogicalDelete8881088Value)  == 0  );
   }


	/**
	*  set values "T"
	*/
   	public void setStatLogicalDelete88810True() {  			
    	setStatCd810( statLogicalDelete8881088Value);
   	}
	char[] statFileUploading8881088Value = "U".toCharArray();
	/**
	 *	Test condition "U" for isStatFileUploading88810()
	 *	@return  Returns true if isStatFileUploading88810() is "U"
	 */
   public boolean isStatFileUploading88810() throws CFException {
      return (  compareChars( getStatCd810() , statFileUploading8881088Value)  == 0  );
   }


	/**
	*  set values "U"
	*/
   	public void setStatFileUploading88810True() {  			
    	setStatCd810( statFileUploading8881088Value);
   	}
	char[] statExitProcessing8881088Value = "X".toCharArray();
	/**
	 *	Test condition "X" for isStatExitProcessing88810()
	 *	@return  Returns true if isStatExitProcessing88810() is "X"
	 */
   public boolean isStatExitProcessing88810() throws CFException {
      return (  compareChars( getStatCd810() , statExitProcessing8881088Value)  == 0  );
   }


	/**
	*  set values "X"
	*/
   	public void setStatExitProcessing88810True() {  			
    	setStatCd810( statExitProcessing8881088Value);
   	}
	/**
	 *	Returns the value of xferMthdCd810
	 *	@return xferMthdCd810
	 */
   public char[] getXferMthdCd810() throws CFException{
     if (isXferMthdCd810Modified()) { 
        xferMthdCd810 = refreshXferMthdCd810();
     }
   		return xferMthdCd810;
   }

  
	/**
	*  set variable xferMthdCd810
	*  Corresponding COBOL Variable is 810-XFER-MTHD-CD
	*  @param value
	**/
   public void setXferMthdCd810(char[] value) {
      xferMthdCd810 = checkXferMthdCd810Constraints(value);
      serializeXferMthdCd810(xferMthdCd810);
   } 

     /**
	 * 	Update XferMthdCd810 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXferMthdCd810(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXferMthdCd810,xferMthdCd810.length);
   	
   }
   
   public void setXferMthdCd810(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXferMthdCd810,xferMthdCd810.length);
   	
   }
   
     /**
	 * 	Update XferMthdCd810 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXferMthdCd810(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXferMthdCd810+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XferMthdCd810 with another Field
	 *	@param value
	 */
   public void setXferMthdCd810(Field source) {
       replace(source,0,source.length(),beginXferMthdCd810,XFER_MTHD_CD_810_LEN);
   	
   }  
   
     /**
	 * 	Update XferMthdCd810 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXferMthdCd810(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXferMthdCd810,XFER_MTHD_CD_810_LEN);
   	
   }
   
     /**
	 * 	Update XferMthdCd810 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXferMthdCd810(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXferMthdCd810+targetIndex,targetLen);
    
   }
	char[] xferMthdBroadcast8881088Value = "B".toCharArray();
	/**
	 *	Test condition "B" for isXferMthdBroadcast88810()
	 *	@return  Returns true if isXferMthdBroadcast88810() is "B"
	 */
   public boolean isXferMthdBroadcast88810() throws CFException {
      return (  compareChars( getXferMthdCd810() , xferMthdBroadcast8881088Value)  == 0  );
   }


	/**
	*  set values "B"
	*/
   	public void setXferMthdBroadcast88810True() {  			
    	setXferMthdCd810( xferMthdBroadcast8881088Value);
   	}
	char[] xferMthdConnectDir8881088Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isXferMthdConnectDir88810()
	 *	@return  Returns true if isXferMthdConnectDir88810() is "C"
	 */
   public boolean isXferMthdConnectDir88810() throws CFException {
      return (  compareChars( getXferMthdCd810() , xferMthdConnectDir8881088Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setXferMthdConnectDir88810True() {  			
    	setXferMthdCd810( xferMthdConnectDir8881088Value);
   	}
	char[] xferMthdFtss8881088Value1 = "F".toCharArray();
char[] xferMthdFtss8881088Value2 = "G".toCharArray();

	/**
	 *	Test condition "F" "G" for isXferMthdFtss88810()
	 *	@return  Returns true if isXferMthdFtss88810() is "F" "G"
	 */
   public boolean isXferMthdFtss88810() throws CFException {
      return (  compareChars( getXferMthdCd810() , xferMthdFtss8881088Value1)  == 0  ||  compareChars( getXferMthdCd810() , xferMthdFtss8881088Value2)  == 0  );
   }


	/**
	*  set values "F" "G"
	*/
   	public void setXferMthdFtss88810True() {  			
    	setXferMthdCd810( xferMthdFtss8881088Value1);
   	}
	char[] xferMthdInternal8881088Value = "I".toCharArray();
	/**
	 *	Test condition "I" for isXferMthdInternal88810()
	 *	@return  Returns true if isXferMthdInternal88810() is "I"
	 */
   public boolean isXferMthdInternal88810() throws CFException {
      return (  compareChars( getXferMthdCd810() , xferMthdInternal8881088Value)  == 0  );
   }


	/**
	*  set values "I"
	*/
   	public void setXferMthdInternal88810True() {  			
    	setXferMthdCd810( xferMthdInternal8881088Value);
   	}
	char[] xferMthdMfe8881088Value = "M".toCharArray();
	/**
	 *	Test condition "M" for isXferMthdMfe88810()
	 *	@return  Returns true if isXferMthdMfe88810() is "M"
	 */
   public boolean isXferMthdMfe88810() throws CFException {
      return (  compareChars( getXferMthdCd810() , xferMthdMfe8881088Value)  == 0  );
   }


	/**
	*  set values "M"
	*/
   	public void setXferMthdMfe88810True() {  			
    	setXferMthdCd810( xferMthdMfe8881088Value);
   	}
	char[] xferMthdConnectEnt8881088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isXferMthdConnectEnt88810()
	 *	@return  Returns true if isXferMthdConnectEnt88810() is "N"
	 */
   public boolean isXferMthdConnectEnt88810() throws CFException {
      return (  compareChars( getXferMthdCd810() , xferMthdConnectEnt8881088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setXferMthdConnectEnt88810True() {  			
    	setXferMthdCd810( xferMthdConnectEnt8881088Value);
   	}
	char[] xferMthdInterpel8881088Value1 = "P".toCharArray();
char[] xferMthdInterpel8881088Value2 = "Y".toCharArray();

	/**
	 *	Test condition "P" "Y" for isXferMthdInterpel88810()
	 *	@return  Returns true if isXferMthdInterpel88810() is "P" "Y"
	 */
   public boolean isXferMthdInterpel88810() throws CFException {
      return (  compareChars( getXferMthdCd810() , xferMthdInterpel8881088Value1)  == 0  ||  compareChars( getXferMthdCd810() , xferMthdInterpel8881088Value2)  == 0  );
   }


	/**
	*  set values "P" "Y"
	*/
   	public void setXferMthdInterpel88810True() {  			
    	setXferMthdCd810( xferMthdInterpel8881088Value1);
   	}
	char[] xferMthdXcom8881088Value = "X".toCharArray();
	/**
	 *	Test condition "X" for isXferMthdXcom88810()
	 *	@return  Returns true if isXferMthdXcom88810() is "X"
	 */
   public boolean isXferMthdXcom88810() throws CFException {
      return (  compareChars( getXferMthdCd810() , xferMthdXcom8881088Value)  == 0  );
   }


	/**
	*  set values "X"
	*/
   	public void setXferMthdXcom88810True() {  			
    	setXferMthdCd810( xferMthdXcom8881088Value);
   	}
	char[] xferMthdMfePush8881088Value = "S".toCharArray();
	/**
	 *	Test condition "S" for isXferMthdMfePush88810()
	 *	@return  Returns true if isXferMthdMfePush88810() is "S"
	 */
   public boolean isXferMthdMfePush88810() throws CFException {
      return (  compareChars( getXferMthdCd810() , xferMthdMfePush8881088Value)  == 0  );
   }


	/**
	*  set values "S"
	*/
   	public void setXferMthdMfePush88810True() {  			
    	setXferMthdCd810( xferMthdMfePush8881088Value);
   	}
	char[] xferMthdUnknown8881088Value = "U".toCharArray();
	/**
	 *	Test condition "U" for isXferMthdUnknown88810()
	 *	@return  Returns true if isXferMthdUnknown88810() is "U"
	 */
   public boolean isXferMthdUnknown88810() throws CFException {
      return (  compareChars( getXferMthdCd810() , xferMthdUnknown8881088Value)  == 0  );
   }


	/**
	*  set values "U"
	*/
   	public void setXferMthdUnknown88810True() {  			
    	setXferMthdCd810( xferMthdUnknown8881088Value);
   	}
	/**
	 *	Returns the value of xferTypeCd810
	 *	@return xferTypeCd810
	 */
   public char[] getXferTypeCd810() throws CFException{
     if (isXferTypeCd810Modified()) { 
        xferTypeCd810 = refreshXferTypeCd810();
     }
   		return xferTypeCd810;
   }

  
	/**
	*  set variable xferTypeCd810
	*  Corresponding COBOL Variable is 810-XFER-TYPE-CD
	*  @param value
	**/
   public void setXferTypeCd810(char[] value) {
      xferTypeCd810 = checkXferTypeCd810Constraints(value);
      serializeXferTypeCd810(xferTypeCd810);
   } 

     /**
	 * 	Update XferTypeCd810 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXferTypeCd810(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXferTypeCd810,xferTypeCd810.length);
   	
   }
   
   public void setXferTypeCd810(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXferTypeCd810,xferTypeCd810.length);
   	
   }
   
     /**
	 * 	Update XferTypeCd810 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXferTypeCd810(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXferTypeCd810+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update XferTypeCd810 with another Field
	 *	@param value
	 */
   public void setXferTypeCd810(Field source) {
       replace(source,0,source.length(),beginXferTypeCd810,XFER_TYPE_CD_810_LEN);
   	
   }  
   
     /**
	 * 	Update XferTypeCd810 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXferTypeCd810(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXferTypeCd810,XFER_TYPE_CD_810_LEN);
   	
   }
   
     /**
	 * 	Update XferTypeCd810 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXferTypeCd810(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXferTypeCd810+targetIndex,targetLen);
    
   }
	char[] xferTypeAscii8881088Value = "A".toCharArray();
	/**
	 *	Test condition "A" for isXferTypeAscii88810()
	 *	@return  Returns true if isXferTypeAscii88810() is "A"
	 */
   public boolean isXferTypeAscii88810() throws CFException {
      return (  compareChars( getXferTypeCd810() , xferTypeAscii8881088Value)  == 0  );
   }


	/**
	*  set values "A"
	*/
   	public void setXferTypeAscii88810True() {  			
    	setXferTypeCd810( xferTypeAscii8881088Value);
   	}
	char[] xferTypeBinary8881088Value = "B".toCharArray();
	/**
	 *	Test condition "B" for isXferTypeBinary88810()
	 *	@return  Returns true if isXferTypeBinary88810() is "B"
	 */
   public boolean isXferTypeBinary88810() throws CFException {
      return (  compareChars( getXferTypeCd810() , xferTypeBinary8881088Value)  == 0  );
   }


	/**
	*  set values "B"
	*/
   	public void setXferTypeBinary88810True() {  			
    	setXferTypeCd810( xferTypeBinary8881088Value);
   	}
	char[] xferTypeEbcdic8881088Value = "E".toCharArray();
	/**
	 *	Test condition "E" for isXferTypeEbcdic88810()
	 *	@return  Returns true if isXferTypeEbcdic88810() is "E"
	 */
   public boolean isXferTypeEbcdic88810() throws CFException {
      return (  compareChars( getXferTypeCd810() , xferTypeEbcdic8881088Value)  == 0  );
   }


	/**
	*  set values "E"
	*/
   	public void setXferTypeEbcdic88810True() {  			
    	setXferTypeCd810( xferTypeEbcdic8881088Value);
   	}
	/**
	 *	Returns the value of sndRcvPrmsnCd810
	 *	@return sndRcvPrmsnCd810
	 */
   public char[] getSndRcvPrmsnCd810() throws CFException{
     if (isSndRcvPrmsnCd810Modified()) { 
        sndRcvPrmsnCd810 = refreshSndRcvPrmsnCd810();
     }
   		return sndRcvPrmsnCd810;
   }

  
	/**
	*  set variable sndRcvPrmsnCd810
	*  Corresponding COBOL Variable is 810-SND-RCV-PRMSN-CD
	*  @param value
	**/
   public void setSndRcvPrmsnCd810(char[] value) {
      sndRcvPrmsnCd810 = checkSndRcvPrmsnCd810Constraints(value);
      serializeSndRcvPrmsnCd810(sndRcvPrmsnCd810);
   } 

     /**
	 * 	Update SndRcvPrmsnCd810 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSndRcvPrmsnCd810(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSndRcvPrmsnCd810,sndRcvPrmsnCd810.length);
   	
   }
   
   public void setSndRcvPrmsnCd810(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSndRcvPrmsnCd810,sndRcvPrmsnCd810.length);
   	
   }
   
     /**
	 * 	Update SndRcvPrmsnCd810 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSndRcvPrmsnCd810(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSndRcvPrmsnCd810+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SndRcvPrmsnCd810 with another Field
	 *	@param value
	 */
   public void setSndRcvPrmsnCd810(Field source) {
       replace(source,0,source.length(),beginSndRcvPrmsnCd810,SND_RCV_PRMSN_CD_810_LEN);
   	
   }  
   
     /**
	 * 	Update SndRcvPrmsnCd810 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSndRcvPrmsnCd810(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSndRcvPrmsnCd810,SND_RCV_PRMSN_CD_810_LEN);
   	
   }
   
     /**
	 * 	Update SndRcvPrmsnCd810 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSndRcvPrmsnCd810(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSndRcvPrmsnCd810+targetIndex,targetLen);
    
   }
	char[] sndRcvPrmsnRecv8881088Value = "R".toCharArray();
	/**
	 *	Test condition "R" for isSndRcvPrmsnRecv88810()
	 *	@return  Returns true if isSndRcvPrmsnRecv88810() is "R"
	 */
   public boolean isSndRcvPrmsnRecv88810() throws CFException {
      return (  compareChars( getSndRcvPrmsnCd810() , sndRcvPrmsnRecv8881088Value)  == 0  );
   }


	/**
	*  set values "R"
	*/
   	public void setSndRcvPrmsnRecv88810True() {  			
    	setSndRcvPrmsnCd810( sndRcvPrmsnRecv8881088Value);
   	}
	char[] sndRcvPrmsnSend8881088Value = "S".toCharArray();
	/**
	 *	Test condition "S" for isSndRcvPrmsnSend88810()
	 *	@return  Returns true if isSndRcvPrmsnSend88810() is "S"
	 */
   public boolean isSndRcvPrmsnSend88810() throws CFException {
      return (  compareChars( getSndRcvPrmsnCd810() , sndRcvPrmsnSend8881088Value)  == 0  );
   }


	/**
	*  set values "S"
	*/
   	public void setSndRcvPrmsnSend88810True() {  			
    	setSndRcvPrmsnCd810( sndRcvPrmsnSend8881088Value);
   	}
	/**
	 *	Returns the value of renameHlq810
	 *	@return renameHlq810
	 */
   public char[] getRenameHlq810() throws CFException{
     if (isRenameHlq810Modified()) { 
        renameHlq810 = refreshRenameHlq810();
     }
   		return renameHlq810;
   }

  
	/**
	*  set variable renameHlq810
	*  Corresponding COBOL Variable is 810-RENAME-HLQ
	*  @param value
	**/
   public void setRenameHlq810(char[] value) {
      renameHlq810 = checkRenameHlq810Constraints(value);
      serializeRenameHlq810(renameHlq810);
   } 

     /**
	 * 	Update RenameHlq810 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRenameHlq810(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRenameHlq810,renameHlq810.length);
   	
   }
   
   public void setRenameHlq810(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRenameHlq810,renameHlq810.length);
   	
   }
   
     /**
	 * 	Update RenameHlq810 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRenameHlq810(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRenameHlq810+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RenameHlq810 with another Field
	 *	@param value
	 */
   public void setRenameHlq810(Field source) {
       replace(source,0,source.length(),beginRenameHlq810,RENAME_HLQ_810_LEN);
   	
   }  
   
     /**
	 * 	Update RenameHlq810 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRenameHlq810(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRenameHlq810,RENAME_HLQ_810_LEN);
   	
   }
   
     /**
	 * 	Update RenameHlq810 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRenameHlq810(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRenameHlq810+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of renameSystemId810
	 *	@return renameSystemId810
	 */
   public char[] getRenameSystemId810() throws CFException{
     if (isRenameSystemId810Modified()) { 
        renameSystemId810 = refreshRenameSystemId810();
     }
   		return renameSystemId810;
   }

  
	/**
	*  set variable renameSystemId810
	*  Corresponding COBOL Variable is 810-RENAME-SYSTEM-ID
	*  @param value
	**/
   public void setRenameSystemId810(char[] value) {
      renameSystemId810 = checkRenameSystemId810Constraints(value);
      serializeRenameSystemId810(renameSystemId810);
   } 

     /**
	 * 	Update RenameSystemId810 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRenameSystemId810(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRenameSystemId810,renameSystemId810.length);
   	
   }
   
   public void setRenameSystemId810(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRenameSystemId810,renameSystemId810.length);
   	
   }
   
     /**
	 * 	Update RenameSystemId810 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRenameSystemId810(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRenameSystemId810+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RenameSystemId810 with another Field
	 *	@param value
	 */
   public void setRenameSystemId810(Field source) {
       replace(source,0,source.length(),beginRenameSystemId810,RENAME_SYSTEM_ID_810_LEN);
   	
   }  
   
     /**
	 * 	Update RenameSystemId810 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRenameSystemId810(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRenameSystemId810,RENAME_SYSTEM_ID_810_LEN);
   	
   }
   
     /**
	 * 	Update RenameSystemId810 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRenameSystemId810(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRenameSystemId810+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of preExitDsn810
	 *	@return preExitDsn810
	 */
   public char[] getPreExitDsn810() throws CFException{
     if (isPreExitDsn810Modified()) { 
        preExitDsn810 = refreshPreExitDsn810();
     }
   		return preExitDsn810;
   }

  
	/**
	*  set variable preExitDsn810
	*  Corresponding COBOL Variable is 810-PRE-EXIT-DSN
	*  @param value
	**/
   public void setPreExitDsn810(char[] value) {
      preExitDsn810 = checkPreExitDsn810Constraints(value);
      serializePreExitDsn810(preExitDsn810);
   } 

     /**
	 * 	Update PreExitDsn810 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPreExitDsn810(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPreExitDsn810,preExitDsn810.length);
   	
   }
   
   public void setPreExitDsn810(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPreExitDsn810,preExitDsn810.length);
   	
   }
   
     /**
	 * 	Update PreExitDsn810 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPreExitDsn810(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPreExitDsn810+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PreExitDsn810 with another Field
	 *	@param value
	 */
   public void setPreExitDsn810(Field source) {
       replace(source,0,source.length(),beginPreExitDsn810,PRE_EXIT_DSN_810_LEN);
   	
   }  
   
     /**
	 * 	Update PreExitDsn810 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPreExitDsn810(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPreExitDsn810,PRE_EXIT_DSN_810_LEN);
   	
   }
   
     /**
	 * 	Update PreExitDsn810 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPreExitDsn810(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPreExitDsn810+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of applExitWork810
	 *	@return applExitWork810
	 */   
	 public ApplExitWork810 getApplExitWork810() {
   	return applExitWork810;
   }
   /**
	* 	Update ApplExitWork810 with the passed value
	*   Corresponding COBOL Variable is 810-APPL-EXIT-WORK
	*	@param value
	*/
   public void setApplExitWork810(char[] value) {
      applExitWork810.setString(value); 
   }   
    
     /**
	 * 	Update ApplExitWork810 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setApplExitWork810(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,applExitWork810.begin,applExitWork810.length());
   }
   
     /**
	 * 	Update ApplExitWork810 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setApplExitWork810(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,applExitWork810.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ApplExitWork810 with another Field
	 *	@param value
	 */
   public void setApplExitWork810(Field source) {
   	replace(source,0,source.length(),applExitWork810.begin,applExitWork810.length());
   }  
   
     /**
	 * 	Update ApplExitWork810 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setApplExitWork810(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,applExitWork810.begin,applExitWork810.length());
   }
   
     /**
	 * 	Update ApplExitWork810 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setApplExitWork810(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,applExitWork810.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of rteToHubSw810
	 *	@return rteToHubSw810
	 */
   public char[] getRteToHubSw810() throws CFException{
     if (isRteToHubSw810Modified()) { 
        rteToHubSw810 = refreshRteToHubSw810();
     }
   		return rteToHubSw810;
   }

  
	/**
	*  set variable rteToHubSw810
	*  Corresponding COBOL Variable is 810-RTE-TO-HUB-SW
	*  @param value
	**/
   public void setRteToHubSw810(char[] value) {
      rteToHubSw810 = checkRteToHubSw810Constraints(value);
      serializeRteToHubSw810(rteToHubSw810);
   } 

     /**
	 * 	Update RteToHubSw810 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRteToHubSw810(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRteToHubSw810,rteToHubSw810.length);
   	
   }
   
   public void setRteToHubSw810(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRteToHubSw810,rteToHubSw810.length);
   	
   }
   
     /**
	 * 	Update RteToHubSw810 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRteToHubSw810(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRteToHubSw810+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RteToHubSw810 with another Field
	 *	@param value
	 */
   public void setRteToHubSw810(Field source) {
       replace(source,0,source.length(),beginRteToHubSw810,RTE_TO_HUB_SW_810_LEN);
   	
   }  
   
     /**
	 * 	Update RteToHubSw810 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRteToHubSw810(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRteToHubSw810,RTE_TO_HUB_SW_810_LEN);
   	
   }
   
     /**
	 * 	Update RteToHubSw810 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRteToHubSw810(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRteToHubSw810+targetIndex,targetLen);
    
   }
	char[] rteToHubActive8881088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isRteToHubActive88810()
	 *	@return  Returns true if isRteToHubActive88810() is "Y"
	 */
   public boolean isRteToHubActive88810() throws CFException {
      return (  compareChars( getRteToHubSw810() , rteToHubActive8881088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setRteToHubActive88810True() {  			
    	setRteToHubSw810( rteToHubActive8881088Value);
   	}
	char[] rteToHubNotActive8881088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isRteToHubNotActive88810()
	 *	@return  Returns true if isRteToHubNotActive88810() is "N"
	 */
   public boolean isRteToHubNotActive88810() throws CFException {
      return (  compareChars( getRteToHubSw810() , rteToHubNotActive8881088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setRteToHubNotActive88810True() {  			
    	setRteToHubSw810( rteToHubNotActive8881088Value);
   	}

	
	
	

		public static int getReqWorkAreas810FieldLength() {
			return REQ_WORK_AREAS_810_LENGTH;
		}

}
  

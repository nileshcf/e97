package com.cloudframe.app.ar640010.dto;

/**
*  The class WorkAreas800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:11. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.utility.CFUtil;


public class WorkAreas800 extends WorkAreas800Serialized {
   

								private short idx800;
				private Psa800 psa800 = new Psa800();

								private short spaceCnt800;

								private short wrdLength800;

						private char[] tempTxt800 = new char[128];

								private short sub1800;

								private short sub2800;

								private short sub3800;

								private short sub4800;

								private short sub5800;

								private short parmCnt1800;

								private short parmCnt2800;

						private char[] parmText800 = new char[1024];

						private char[] parmText1800 = new char[15];

						private char[] parmText2800 = new char[10];

								private long parmNum800;

								private long parmNum1800;

								private long parmNum2800;

								private int sub800;
				private FunctionTs800 functionTs800 = new FunctionTs800();

								private long jan1stDate800;

						private char[] fileDsnFull800 = new char[54];
				private PgmTs800 pgmTs800 = new PgmTs800();

								private int pgmJulDay800;

						private char[] listDsn800 = new char[54];
				private ResultFill800 resultFill800 = new ResultFill800();

								private char[] numericWrk1800 = new char[13];
							

								private short numericPos1800;

								private char[] numericWrk2800 = new char[13];
							

								private short numericPos2800;

								private char[] sqlcodeDisplay800 = Field.fillLowValue(9);
	
	/**
	* Constructor for WorkAreas800
	**/
    public WorkAreas800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			psa800.setParent(this,getStartOffset() + 2);
	       			functionTs800.setParent(this,getStartOffset() + 1235);
	       			pgmTs800.setParent(this,getStartOffset() + 1318);
	       			resultFill800.setParent(this,getStartOffset() + 1401);
	   	/*  end of offset */
								setIdx800((short)0);
								setSpaceCnt800((short)0);
								setWrdLength800((short)0);
								setTempTxt800(pad(128," ".toCharArray(),' ',RIGHT_PAD));
								setSub1800((short)0);
								setSub2800((short)0);
								setSub3800((short)0);
								setSub4800((short)0);
								setSub5800((short)0);
								setParmCnt1800((short)0);
								setParmCnt2800((short)0);
								setParmText800(pad(1024," ".toCharArray(),' ',RIGHT_PAD));
								setParmText1800(fillSpace(15));
								setParmText2800(fillSpace(10));
								setParmNum800(0L);
								setParmNum1800(0L);
								setParmNum2800(0L);
								setSub800(0);
								functionTs800.setString(fillSpace(21));
								setJan1stDate800(101L);
								setFileDsnFull800(fillSpace(54));
								setPgmJulDay800(0);
								setListDsn800(fillSpace(54));
								setNumericWrk1800(fillSpace(13));
								setNumericPos1800((short)0);
								setNumericWrk2800(fillSpace(13));
								setNumericPos2800((short)0);
    }


 

	/**
	 *	Returns the value of idx800
	 *	@return idx800
	 */
	public short getIdx800() throws CFException {
        if (isIdx800Modified()) { 
           idx800 = refreshIdx800();
        }
   		return idx800;
	}
	
	/**
	 * 	Update Idx800 with the passed value
	 *  Corresponding COBOL Variable is 800-IDX
	 *	@param number
	 */
	public void setIdx800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    idx800 = checkIdx800MaxLimit(number); 
		serializeIdx800(idx800);
	}

	public void setIdx800(int number) {
	    number = checkIdx800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIdx800((short)number);
	}
	public void setIdx800(long number) {
	    number = checkIdx800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIdx800((short)number);
	}
	

	/**
	 *	Returns the value of psa800
	 *	@return psa800
	 */   
	 public Psa800 getPsa800() {
   	return psa800;
   }
   /**
	* 	Update Psa800 with the passed value
	*   Corresponding COBOL Variable is 800-PSA
	*	@param value
	*/
   public void setPsa800(char[] value) {
      psa800.setString(value); 
   }   
    
     /**
	 * 	Update Psa800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setPsa800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,psa800.begin,psa800.length());
   }
   
     /**
	 * 	Update Psa800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPsa800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,psa800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Psa800 with another Field
	 *	@param value
	 */
   public void setPsa800(Field source) {
   	replace(source,0,source.length(),psa800.begin,psa800.length());
   }  
   
     /**
	 * 	Update Psa800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setPsa800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,psa800.begin,psa800.length());
   }
   
     /**
	 * 	Update Psa800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPsa800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,psa800.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of spaceCnt800
	 *	@return spaceCnt800
	 */
	public short getSpaceCnt800() throws CFException {
        if (isSpaceCnt800Modified()) { 
           spaceCnt800 = refreshSpaceCnt800();
        }
   		return spaceCnt800;
	}
	
	/**
	 * 	Update SpaceCnt800 with the passed value
	 *  Corresponding COBOL Variable is 800-SPACE-CNT
	 *	@param number
	 */
	public void setSpaceCnt800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    spaceCnt800 = checkSpaceCnt800MaxLimit(number); 
		serializeSpaceCnt800(spaceCnt800);
	}

	public void setSpaceCnt800(int number) {
	    number = checkSpaceCnt800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSpaceCnt800((short)number);
	}
	public void setSpaceCnt800(long number) {
	    number = checkSpaceCnt800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSpaceCnt800((short)number);
	}
	

	/**
	 *	Returns the value of wrdLength800
	 *	@return wrdLength800
	 */
	public short getWrdLength800() throws CFException {
        if (isWrdLength800Modified()) { 
           wrdLength800 = refreshWrdLength800();
        }
   		return wrdLength800;
	}
	
	/**
	 * 	Update WrdLength800 with the passed value
	 *  Corresponding COBOL Variable is 800-WRD-LENGTH
	 *	@param number
	 */
	public void setWrdLength800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    wrdLength800 = checkWrdLength800MaxLimit(number); 
		serializeWrdLength800(wrdLength800);
	}

	public void setWrdLength800(int number) {
	    number = checkWrdLength800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setWrdLength800((short)number);
	}
	public void setWrdLength800(long number) {
	    number = checkWrdLength800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setWrdLength800((short)number);
	}
	

	/**
	 *	Returns the value of tempTxt800
	 *	@return tempTxt800
	 */
   public char[] getTempTxt800() throws CFException{
     if (isTempTxt800Modified()) { 
        tempTxt800 = refreshTempTxt800();
     }
   		return tempTxt800;
   }

  
	/**
	*  set variable tempTxt800
	*  Corresponding COBOL Variable is 800-TEMP-TXT
	*  @param value
	**/
   public void setTempTxt800(char[] value) {
      tempTxt800 = checkTempTxt800Constraints(value);
      serializeTempTxt800(tempTxt800);
   } 

     /**
	 * 	Update TempTxt800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTempTxt800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTempTxt800,tempTxt800.length);
   	
   }
   
   public void setTempTxt800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTempTxt800,tempTxt800.length);
   	
   }
   
     /**
	 * 	Update TempTxt800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTempTxt800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTempTxt800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TempTxt800 with another Field
	 *	@param value
	 */
   public void setTempTxt800(Field source) {
       replace(source,0,source.length(),beginTempTxt800,TEMP_TXT_800_LEN);
   	
   }  
   
     /**
	 * 	Update TempTxt800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTempTxt800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTempTxt800,TEMP_TXT_800_LEN);
   	
   }
   
     /**
	 * 	Update TempTxt800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTempTxt800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTempTxt800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sub1800
	 *	@return sub1800
	 */
	public short getSub1800() throws CFException {
        if (isSub1800Modified()) { 
           sub1800 = refreshSub1800();
        }
   		return sub1800;
	}
	
	/**
	 * 	Update Sub1800 with the passed value
	 *  Corresponding COBOL Variable is 800-SUB1
	 *	@param number
	 */
	public void setSub1800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sub1800 = checkSub1800MaxLimit(number); 
		serializeSub1800(sub1800);
	}

	public void setSub1800(int number) {
	    number = checkSub1800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSub1800((short)number);
	}
	public void setSub1800(long number) {
	    number = checkSub1800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSub1800((short)number);
	}
	

	/**
	 *	Returns the value of sub2800
	 *	@return sub2800
	 */
	public short getSub2800() throws CFException {
        if (isSub2800Modified()) { 
           sub2800 = refreshSub2800();
        }
   		return sub2800;
	}
	
	/**
	 * 	Update Sub2800 with the passed value
	 *  Corresponding COBOL Variable is 800-SUB2
	 *	@param number
	 */
	public void setSub2800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sub2800 = checkSub2800MaxLimit(number); 
		serializeSub2800(sub2800);
	}

	public void setSub2800(int number) {
	    number = checkSub2800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSub2800((short)number);
	}
	public void setSub2800(long number) {
	    number = checkSub2800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSub2800((short)number);
	}
	

	/**
	 *	Returns the value of sub3800
	 *	@return sub3800
	 */
	public short getSub3800() throws CFException {
        if (isSub3800Modified()) { 
           sub3800 = refreshSub3800();
        }
   		return sub3800;
	}
	
	/**
	 * 	Update Sub3800 with the passed value
	 *  Corresponding COBOL Variable is 800-SUB3
	 *	@param number
	 */
	public void setSub3800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sub3800 = checkSub3800MaxLimit(number); 
		serializeSub3800(sub3800);
	}

	public void setSub3800(int number) {
	    number = checkSub3800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSub3800((short)number);
	}
	public void setSub3800(long number) {
	    number = checkSub3800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSub3800((short)number);
	}
	

	/**
	 *	Returns the value of sub4800
	 *	@return sub4800
	 */
	public short getSub4800() throws CFException {
        if (isSub4800Modified()) { 
           sub4800 = refreshSub4800();
        }
   		return sub4800;
	}
	
	/**
	 * 	Update Sub4800 with the passed value
	 *  Corresponding COBOL Variable is 800-SUB4
	 *	@param number
	 */
	public void setSub4800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sub4800 = checkSub4800MaxLimit(number); 
		serializeSub4800(sub4800);
	}

	public void setSub4800(int number) {
	    number = checkSub4800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSub4800((short)number);
	}
	public void setSub4800(long number) {
	    number = checkSub4800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSub4800((short)number);
	}
	

	/**
	 *	Returns the value of sub5800
	 *	@return sub5800
	 */
	public short getSub5800() throws CFException {
        if (isSub5800Modified()) { 
           sub5800 = refreshSub5800();
        }
   		return sub5800;
	}
	
	/**
	 * 	Update Sub5800 with the passed value
	 *  Corresponding COBOL Variable is 800-SUB5
	 *	@param number
	 */
	public void setSub5800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sub5800 = checkSub5800MaxLimit(number); 
		serializeSub5800(sub5800);
	}

	public void setSub5800(int number) {
	    number = checkSub5800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSub5800((short)number);
	}
	public void setSub5800(long number) {
	    number = checkSub5800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSub5800((short)number);
	}
	

	/**
	 *	Returns the value of parmCnt1800
	 *	@return parmCnt1800
	 */
	public short getParmCnt1800() throws CFException {
        if (isParmCnt1800Modified()) { 
           parmCnt1800 = refreshParmCnt1800();
        }
   		return parmCnt1800;
	}
	
	/**
	 * 	Update ParmCnt1800 with the passed value
	 *  Corresponding COBOL Variable is 800-PARM-CNT1
	 *	@param number
	 */
	public void setParmCnt1800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    parmCnt1800 = checkParmCnt1800MaxLimit(number); 
		serializeParmCnt1800(parmCnt1800);
	}

	public void setParmCnt1800(int number) {
	    number = checkParmCnt1800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setParmCnt1800((short)number);
	}
	public void setParmCnt1800(long number) {
	    number = checkParmCnt1800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setParmCnt1800((short)number);
	}
	

	/**
	 *	Returns the value of parmCnt2800
	 *	@return parmCnt2800
	 */
	public short getParmCnt2800() throws CFException {
        if (isParmCnt2800Modified()) { 
           parmCnt2800 = refreshParmCnt2800();
        }
   		return parmCnt2800;
	}
	
	/**
	 * 	Update ParmCnt2800 with the passed value
	 *  Corresponding COBOL Variable is 800-PARM-CNT2
	 *	@param number
	 */
	public void setParmCnt2800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    parmCnt2800 = checkParmCnt2800MaxLimit(number); 
		serializeParmCnt2800(parmCnt2800);
	}

	public void setParmCnt2800(int number) {
	    number = checkParmCnt2800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setParmCnt2800((short)number);
	}
	public void setParmCnt2800(long number) {
	    number = checkParmCnt2800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setParmCnt2800((short)number);
	}
	

	/**
	 *	Returns the value of parmText800
	 *	@return parmText800
	 */
   public char[] getParmText800() throws CFException{
     if (isParmText800Modified()) { 
        parmText800 = refreshParmText800();
     }
   		return parmText800;
   }

  
	/**
	*  set variable parmText800
	*  Corresponding COBOL Variable is 800-PARM-TEXT
	*  @param value
	**/
   public void setParmText800(char[] value) {
      parmText800 = checkParmText800Constraints(value);
      serializeParmText800(parmText800);
   } 

     /**
	 * 	Update ParmText800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setParmText800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginParmText800,parmText800.length);
   	
   }
   
   public void setParmText800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginParmText800,parmText800.length);
   	
   }
   
     /**
	 * 	Update ParmText800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParmText800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParmText800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ParmText800 with another Field
	 *	@param value
	 */
   public void setParmText800(Field source) {
       replace(source,0,source.length(),beginParmText800,PARM_TEXT_800_LEN);
   	
   }  
   
     /**
	 * 	Update ParmText800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setParmText800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginParmText800,PARM_TEXT_800_LEN);
   	
   }
   
     /**
	 * 	Update ParmText800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParmText800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParmText800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of parmText1800
	 *	@return parmText1800
	 */
   public char[] getParmText1800() throws CFException{
     if (isParmText1800Modified()) { 
        parmText1800 = refreshParmText1800();
     }
   		return parmText1800;
   }

  
	/**
	*  set variable parmText1800
	*  Corresponding COBOL Variable is 800-PARM-TEXT1
	*  @param value
	**/
   public void setParmText1800(char[] value) {
      parmText1800 = checkParmText1800Constraints(value);
      serializeParmText1800(parmText1800);
   } 

     /**
	 * 	Update ParmText1800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setParmText1800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginParmText1800,parmText1800.length);
   	
   }
   
   public void setParmText1800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginParmText1800,parmText1800.length);
   	
   }
   
     /**
	 * 	Update ParmText1800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParmText1800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParmText1800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ParmText1800 with another Field
	 *	@param value
	 */
   public void setParmText1800(Field source) {
       replace(source,0,source.length(),beginParmText1800,PARM_TEXT_1800_LEN);
   	
   }  
   
     /**
	 * 	Update ParmText1800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setParmText1800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginParmText1800,PARM_TEXT_1800_LEN);
   	
   }
   
     /**
	 * 	Update ParmText1800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParmText1800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParmText1800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of parmText2800
	 *	@return parmText2800
	 */
   public char[] getParmText2800() throws CFException{
     if (isParmText2800Modified()) { 
        parmText2800 = refreshParmText2800();
     }
   		return parmText2800;
   }

  
	/**
	*  set variable parmText2800
	*  Corresponding COBOL Variable is 800-PARM-TEXT2
	*  @param value
	**/
   public void setParmText2800(char[] value) {
      parmText2800 = checkParmText2800Constraints(value);
      serializeParmText2800(parmText2800);
   } 

     /**
	 * 	Update ParmText2800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setParmText2800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginParmText2800,parmText2800.length);
   	
   }
   
   public void setParmText2800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginParmText2800,parmText2800.length);
   	
   }
   
     /**
	 * 	Update ParmText2800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParmText2800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParmText2800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ParmText2800 with another Field
	 *	@param value
	 */
   public void setParmText2800(Field source) {
       replace(source,0,source.length(),beginParmText2800,PARM_TEXT_2800_LEN);
   	
   }  
   
     /**
	 * 	Update ParmText2800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setParmText2800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginParmText2800,PARM_TEXT_2800_LEN);
   	
   }
   
     /**
	 * 	Update ParmText2800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParmText2800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParmText2800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of parmNum800
	 *	@return parmNum800
	 */
	public long getParmNum800() throws CFException {
       if (isParmNum800Modified()) { 
           parmNum800 = refreshParmNum800();
        }
   		return parmNum800;
	}
	

	
	   
	/**
	 * 	Update ParmNum800 with the passed value
	 *  Corresponding COBOL Variable is 800-PARM-NUM
	 *	@param number
	 */
	public void setParmNum800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    parmNum800 = checkParmNum800MaxLimit(number); 
		serializeParmNum800(parmNum800);
	}
	

	/**
	 * 	Update ParmNum800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setParmNum800(char[] value) throws CFException {
		 parmNum800 = serializeParmNum800(value);
	}
	/**
	 * 	Update ParmNum800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setParmNum800String(char[] value) throws CFException {
		 setParmNum800(value);
	}
	/**
	 *	Returns the value of parmNum1800
	 *	@return parmNum1800
	 */
	public long getParmNum1800() throws CFException {
       if (isParmNum1800Modified()) { 
           parmNum1800 = refreshParmNum1800();
        }
   		return parmNum1800;
	}
	

	
	   
	/**
	 * 	Update ParmNum1800 with the passed value
	 *  Corresponding COBOL Variable is 800-PARM-NUM1
	 *	@param number
	 */
	public void setParmNum1800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    parmNum1800 = checkParmNum1800MaxLimit(number); 
		serializeParmNum1800(parmNum1800);
	}
	

	/**
	 * 	Update ParmNum1800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setParmNum1800(char[] value) throws CFException {
		 parmNum1800 = serializeParmNum1800(value);
	}
	/**
	 * 	Update ParmNum1800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setParmNum1800String(char[] value) throws CFException {
		 setParmNum1800(value);
	}
	/**
	 *	Returns the value of parmNum2800
	 *	@return parmNum2800
	 */
	public long getParmNum2800() throws CFException {
       if (isParmNum2800Modified()) { 
           parmNum2800 = refreshParmNum2800();
        }
   		return parmNum2800;
	}
	

	
	   
	/**
	 * 	Update ParmNum2800 with the passed value
	 *  Corresponding COBOL Variable is 800-PARM-NUM2
	 *	@param number
	 */
	public void setParmNum2800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    parmNum2800 = checkParmNum2800MaxLimit(number); 
		serializeParmNum2800(parmNum2800);
	}
	

	/**
	 * 	Update ParmNum2800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setParmNum2800(char[] value) throws CFException {
		 parmNum2800 = serializeParmNum2800(value);
	}
	/**
	 * 	Update ParmNum2800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setParmNum2800String(char[] value) throws CFException {
		 setParmNum2800(value);
	}
	/**
	 *	Returns the value of sub800
	 *	@return sub800
	 */
	public int getSub800() throws CFException {
        if (isSub800Modified()) { 
           sub800 = refreshSub800();
        }
   		return sub800;
	}
	
	/**
	 * 	Update Sub800 with the passed value
	 *  Corresponding COBOL Variable is 800-SUB
	 *	@param number
	 */
	public void setSub800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sub800 = checkSub800MaxLimit(number); 
		serializeSub800(sub800);
	}


	public void setSub800(long number) {
	    number = checkSub800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSub800((int)number);
	}
	
	/**
	 *	Returns the value of functionTs800
	 *	@return functionTs800
	 */   
	 public FunctionTs800 getFunctionTs800() {
   	return functionTs800;
   }
   /**
	* 	Update FunctionTs800 with the passed value
	*   Corresponding COBOL Variable is 800-FUNCTION-TS
	*	@param value
	*/
   public void setFunctionTs800(char[] value) {
      functionTs800.setString(value); 
   }   
    
     /**
	 * 	Update FunctionTs800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setFunctionTs800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,functionTs800.begin,functionTs800.length());
   }
   
     /**
	 * 	Update FunctionTs800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFunctionTs800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,functionTs800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update FunctionTs800 with another Field
	 *	@param value
	 */
   public void setFunctionTs800(Field source) {
   	replace(source,0,source.length(),functionTs800.begin,functionTs800.length());
   }  
   
     /**
	 * 	Update FunctionTs800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setFunctionTs800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,functionTs800.begin,functionTs800.length());
   }
   
     /**
	 * 	Update FunctionTs800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFunctionTs800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,functionTs800.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of jan1stDate800
	 *	@return jan1stDate800
	 */
	public long getJan1stDate800() throws CFException {
       if (isJan1stDate800Modified()) { 
           jan1stDate800 = refreshJan1stDate800();
        }
   		return jan1stDate800;
	}
	

	
	   
	/**
	 * 	Update Jan1stDate800 with the passed value
	 *  Corresponding COBOL Variable is 800-JAN-1ST-DATE
	 *	@param number
	 */
	public void setJan1stDate800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    jan1stDate800 = checkJan1stDate800MaxLimit(number); 
		serializeJan1stDate800(jan1stDate800);
	}
	

	/**
	 * 	Update Jan1stDate800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setJan1stDate800(char[] value) throws CFException {
		 jan1stDate800 = serializeJan1stDate800(value);
	}
	/**
	 * 	Update Jan1stDate800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setJan1stDate800String(char[] value) throws CFException {
		 setJan1stDate800(value);
	}
	/**
	 *	Returns the value of fileDsnFull800
	 *	@return fileDsnFull800
	 */
   public char[] getFileDsnFull800() throws CFException{
     if (isFileDsnFull800Modified()) { 
        fileDsnFull800 = refreshFileDsnFull800();
     }
   		return fileDsnFull800;
   }

  
	/**
	*  set variable fileDsnFull800
	*  Corresponding COBOL Variable is 800-FILE-DSN-FULL
	*  @param value
	**/
   public void setFileDsnFull800(char[] value) {
      fileDsnFull800 = checkFileDsnFull800Constraints(value);
      serializeFileDsnFull800(fileDsnFull800);
   } 

     /**
	 * 	Update FileDsnFull800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFileDsnFull800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFileDsnFull800,fileDsnFull800.length);
   	
   }
   
   public void setFileDsnFull800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFileDsnFull800,fileDsnFull800.length);
   	
   }
   
     /**
	 * 	Update FileDsnFull800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFileDsnFull800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileDsnFull800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FileDsnFull800 with another Field
	 *	@param value
	 */
   public void setFileDsnFull800(Field source) {
       replace(source,0,source.length(),beginFileDsnFull800,FILE_DSN_FULL_800_LEN);
   	
   }  
   
     /**
	 * 	Update FileDsnFull800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFileDsnFull800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFileDsnFull800,FILE_DSN_FULL_800_LEN);
   	
   }
   
     /**
	 * 	Update FileDsnFull800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFileDsnFull800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileDsnFull800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of pgmTs800
	 *	@return pgmTs800
	 */   
	 public PgmTs800 getPgmTs800() {
   	return pgmTs800;
   }
   /**
	* 	Update PgmTs800 with the passed value
	*   Corresponding COBOL Variable is 800-PGM-TS
	*	@param value
	*/
   public void setPgmTs800(char[] value) {
      pgmTs800.setString(value); 
   }   
    
     /**
	 * 	Update PgmTs800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setPgmTs800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,pgmTs800.begin,pgmTs800.length());
   }
   
     /**
	 * 	Update PgmTs800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPgmTs800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,pgmTs800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update PgmTs800 with another Field
	 *	@param value
	 */
   public void setPgmTs800(Field source) {
   	replace(source,0,source.length(),pgmTs800.begin,pgmTs800.length());
   }  
   
     /**
	 * 	Update PgmTs800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setPgmTs800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,pgmTs800.begin,pgmTs800.length());
   }
   
     /**
	 * 	Update PgmTs800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPgmTs800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,pgmTs800.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of pgmJulDay800
	 *	@return pgmJulDay800
	 */
	public int getPgmJulDay800() throws CFException {
       if (isPgmJulDay800Modified()) { 
           pgmJulDay800 = refreshPgmJulDay800();
        }
   		return pgmJulDay800;
	}
	

	
	   
	/**
	 * 	Update PgmJulDay800 with the passed value
	 *  Corresponding COBOL Variable is 800-PGM-JUL-DAY
	 *	@param number
	 */
	public void setPgmJulDay800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    pgmJulDay800 = checkPgmJulDay800MaxLimit(number); 
		serializePgmJulDay800(pgmJulDay800);
	}
	

	public void setPgmJulDay800(long number) {
	    number = checkPgmJulDay800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setPgmJulDay800((int)number);
	}
	
	/**
	 * 	Update PgmJulDay800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPgmJulDay800(char[] value) throws CFException {
		 pgmJulDay800 = serializePgmJulDay800(value);
	}
	/**
	 * 	Update PgmJulDay800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPgmJulDay800String(char[] value) throws CFException {
		 setPgmJulDay800(value);
	}
	/**
	 *	Returns the value of listDsn800
	 *	@return listDsn800
	 */
   public char[] getListDsn800() throws CFException{
     if (isListDsn800Modified()) { 
        listDsn800 = refreshListDsn800();
     }
   		return listDsn800;
   }

  
	/**
	*  set variable listDsn800
	*  Corresponding COBOL Variable is 800-LIST-DSN
	*  @param value
	**/
   public void setListDsn800(char[] value) {
      listDsn800 = checkListDsn800Constraints(value);
      serializeListDsn800(listDsn800);
   } 

     /**
	 * 	Update ListDsn800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setListDsn800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginListDsn800,listDsn800.length);
   	
   }
   
   public void setListDsn800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginListDsn800,listDsn800.length);
   	
   }
   
     /**
	 * 	Update ListDsn800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setListDsn800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginListDsn800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ListDsn800 with another Field
	 *	@param value
	 */
   public void setListDsn800(Field source) {
       replace(source,0,source.length(),beginListDsn800,LIST_DSN_800_LEN);
   	
   }  
   
     /**
	 * 	Update ListDsn800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setListDsn800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginListDsn800,LIST_DSN_800_LEN);
   	
   }
   
     /**
	 * 	Update ListDsn800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setListDsn800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginListDsn800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of resultFill800
	 *	@return resultFill800
	 */   
	 public ResultFill800 getResultFill800() {
   	return resultFill800;
   }
   /**
	* 	Update ResultFill800 with the passed value
	*   Corresponding COBOL Variable is 800-RESULT-FILL
	*	@param value
	*/
   public void setResultFill800(char[] value) {
      resultFill800.setString(value); 
   }   
    
     /**
	 * 	Update ResultFill800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setResultFill800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,resultFill800.begin,resultFill800.length());
   }
   
     /**
	 * 	Update ResultFill800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setResultFill800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,resultFill800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ResultFill800 with another Field
	 *	@param value
	 */
   public void setResultFill800(Field source) {
   	replace(source,0,source.length(),resultFill800.begin,resultFill800.length());
   }  
   
     /**
	 * 	Update ResultFill800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setResultFill800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,resultFill800.begin,resultFill800.length());
   }
   
     /**
	 * 	Update ResultFill800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setResultFill800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,resultFill800.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of numericWrk1800
	 *	@return numericWrk1800
	 */
   public char[] getNumericWrk1800() throws CFException{
     if (isNumericWrk1800Modified()) { 
        numericWrk1800 = refreshNumericWrk1800();
     }
   		return numericWrk1800;
   }

  
	/**
	*  set variable numericWrk1800
	*  Corresponding COBOL Variable is 800-NUMERIC-WRK-1
	*  @param value
	**/
   public void setNumericWrk1800(char[] value) {
      numericWrk1800 = checkNumericWrk1800Constraints(value);
      serializeNumericWrk1800(numericWrk1800);
   } 

     /**
	 * 	Update NumericWrk1800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setNumericWrk1800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginNumericWrk1800,numericWrk1800.length);
   	
   }
   
   public void setNumericWrk1800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginNumericWrk1800,numericWrk1800.length);
   	
   }
   
     /**
	 * 	Update NumericWrk1800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setNumericWrk1800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNumericWrk1800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update NumericWrk1800 with another Field
	 *	@param value
	 */
   public void setNumericWrk1800(Field source) {
       replace(source,0,source.length(),beginNumericWrk1800,NUMERIC_WRK_1800_LEN);
   	
   }  
   
     /**
	 * 	Update NumericWrk1800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setNumericWrk1800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginNumericWrk1800,NUMERIC_WRK_1800_LEN);
   	
   }
   
     /**
	 * 	Update NumericWrk1800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setNumericWrk1800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNumericWrk1800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of numericPos1800
	 *	@return numericPos1800
	 */
	public short getNumericPos1800() throws CFException {
        if (isNumericPos1800Modified()) { 
           numericPos1800 = refreshNumericPos1800();
        }
   		return numericPos1800;
	}
	
	/**
	 * 	Update NumericPos1800 with the passed value
	 *  Corresponding COBOL Variable is 800-NUMERIC-POS-1
	 *	@param number
	 */
	public void setNumericPos1800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    numericPos1800 = checkNumericPos1800MaxLimit(number); 
		serializeNumericPos1800(numericPos1800);
	}

	public void setNumericPos1800(int number) {
	    number = checkNumericPos1800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setNumericPos1800((short)number);
	}
	public void setNumericPos1800(long number) {
	    number = checkNumericPos1800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setNumericPos1800((short)number);
	}
	

	/**
	 *	Returns the value of numericWrk2800
	 *	@return numericWrk2800
	 */
   public char[] getNumericWrk2800() throws CFException{
     if (isNumericWrk2800Modified()) { 
        numericWrk2800 = refreshNumericWrk2800();
     }
   		return numericWrk2800;
   }

  
	/**
	*  set variable numericWrk2800
	*  Corresponding COBOL Variable is 800-NUMERIC-WRK-2
	*  @param value
	**/
   public void setNumericWrk2800(char[] value) {
      numericWrk2800 = checkNumericWrk2800Constraints(value);
      serializeNumericWrk2800(numericWrk2800);
   } 

     /**
	 * 	Update NumericWrk2800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setNumericWrk2800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginNumericWrk2800,numericWrk2800.length);
   	
   }
   
   public void setNumericWrk2800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginNumericWrk2800,numericWrk2800.length);
   	
   }
   
     /**
	 * 	Update NumericWrk2800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setNumericWrk2800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNumericWrk2800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update NumericWrk2800 with another Field
	 *	@param value
	 */
   public void setNumericWrk2800(Field source) {
       replace(source,0,source.length(),beginNumericWrk2800,NUMERIC_WRK_2800_LEN);
   	
   }  
   
     /**
	 * 	Update NumericWrk2800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setNumericWrk2800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginNumericWrk2800,NUMERIC_WRK_2800_LEN);
   	
   }
   
     /**
	 * 	Update NumericWrk2800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setNumericWrk2800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNumericWrk2800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of numericPos2800
	 *	@return numericPos2800
	 */
	public short getNumericPos2800() throws CFException {
        if (isNumericPos2800Modified()) { 
           numericPos2800 = refreshNumericPos2800();
        }
   		return numericPos2800;
	}
	
	/**
	 * 	Update NumericPos2800 with the passed value
	 *  Corresponding COBOL Variable is 800-NUMERIC-POS-2
	 *	@param number
	 */
	public void setNumericPos2800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    numericPos2800 = checkNumericPos2800MaxLimit(number); 
		serializeNumericPos2800(numericPos2800);
	}

	public void setNumericPos2800(int number) {
	    number = checkNumericPos2800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setNumericPos2800((short)number);
	}
	public void setNumericPos2800(long number) {
	    number = checkNumericPos2800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setNumericPos2800((short)number);
	}
	

	/**
	 *	Returns the value of sqlcodeDisplay800
	 *	@return sqlcodeDisplay800
	 */
   public char[] getSqlcodeDisplay800() throws CFException{
     if (isSqlcodeDisplay800Modified()) { 
        sqlcodeDisplay800 = refreshSqlcodeDisplay800();
     }
   		return sqlcodeDisplay800;
   }

  
	/**
	*  set variable sqlcodeDisplay800
	*  Corresponding COBOL Variable is 800-SQLCODE-DISPLAY
	*  @param value
	**/
   public void setSqlcodeDisplay800(char[] value) {
      sqlcodeDisplay800 = checkSqlcodeDisplay800Constraints(value);
      serializeSqlcodeDisplay800(sqlcodeDisplay800);
   } 

     /**
	 * 	Update SqlcodeDisplay800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlcodeDisplay800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSqlcodeDisplay800,sqlcodeDisplay800.length);
   	
   }
   
   public void setSqlcodeDisplay800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSqlcodeDisplay800,sqlcodeDisplay800.length);
   	
   }
   
     /**
	 * 	Update SqlcodeDisplay800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlcodeDisplay800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlcodeDisplay800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SqlcodeDisplay800 with another Field
	 *	@param value
	 */
   public void setSqlcodeDisplay800(Field source) {
       replace(source,0,source.length(),beginSqlcodeDisplay800,SQLCODE_DISPLAY_800_LEN);
   	
   }  
   
     /**
	 * 	Update SqlcodeDisplay800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlcodeDisplay800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSqlcodeDisplay800,SQLCODE_DISPLAY_800_LEN);
   	
   }
   
     /**
	 * 	Update SqlcodeDisplay800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlcodeDisplay800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlcodeDisplay800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWorkAreas800FieldLength() {
			return WORK_AREAS_800_LENGTH;
		}

}
  

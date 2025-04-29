package com.cloudframe.app.ms00d363.dto;

/**
*  The class Ms10frptMbrDetailRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ms10frptMbrDetailRec extends Ms10frptMbrDetailRecSerialized {
   
				private Ms10frptDetDelvData ms10frptDetDelvData = new Ms10frptDetDelvData();

						private char[] ms10frptDetEsrvSarData = Field.fillLowValue(74);

						private char[] ms10frptFill4 = Field.fillLowValue(19);

								private long ms10frptDetSysDte;

								private long ms10frptDetSysTime;

						private char[] ms10frptFill5 = Field.fillLowValue(14);

								private long ms10frptDetMemberIca;

						private char[] ms10frptDetEservFlag = Field.fillLowValue(1);

						private char[] ms10frptFill6 = Field.fillLowValue(10);

						private char[] ms10frptDetEarlyDlvry = Field.fillLowValue(1);

						private char[] ms10frptRptDetail = Field.fillLowValue(133);
	
	/**
	* Constructor for Ms10frptMbrDetailRec
	**/
    public Ms10frptMbrDetailRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			ms10frptDetDelvData.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ms10frptDetDelvData
	 *	@return ms10frptDetDelvData
	 */   
	 public Ms10frptDetDelvData getMs10frptDetDelvData() {
   	return ms10frptDetDelvData;
   }
   /**
	* 	Update Ms10frptDetDelvData with the passed value
	*   Corresponding COBOL Variable is MS10FRPT-DET-DELV-DATA
	*	@param value
	*/
   public void setMs10frptDetDelvData(char[] value) {
      ms10frptDetDelvData.setString(value); 
   }   
    
     /**
	 * 	Update Ms10frptDetDelvData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMs10frptDetDelvData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ms10frptDetDelvData.begin,ms10frptDetDelvData.length());
   }
   
     /**
	 * 	Update Ms10frptDetDelvData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMs10frptDetDelvData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ms10frptDetDelvData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ms10frptDetDelvData with another Field
	 *	@param value
	 */
   public void setMs10frptDetDelvData(Field source) {
   	replace(source,0,source.length(),ms10frptDetDelvData.begin,ms10frptDetDelvData.length());
   }  
   
     /**
	 * 	Update Ms10frptDetDelvData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMs10frptDetDelvData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ms10frptDetDelvData.begin,ms10frptDetDelvData.length());
   }
   
     /**
	 * 	Update Ms10frptDetDelvData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMs10frptDetDelvData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ms10frptDetDelvData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ms10frptDetEsrvSarData
	 *	@return ms10frptDetEsrvSarData
	 */
   public char[] getMs10frptDetEsrvSarData() throws CFException{
     if (isMs10frptDetEsrvSarDataModified()) { 
        ms10frptDetEsrvSarData = refreshMs10frptDetEsrvSarData();
     }
   		return ms10frptDetEsrvSarData;
   }

  
	/**
	*  set variable ms10frptDetEsrvSarData
	*  Corresponding COBOL Variable is MS10FRPT-DET-ESRV-SAR-DATA
	*  @param value
	**/
   public void setMs10frptDetEsrvSarData(char[] value) {
      ms10frptDetEsrvSarData = checkMs10frptDetEsrvSarDataConstraints(value);
      serializeMs10frptDetEsrvSarData(ms10frptDetEsrvSarData);
   } 

     /**
	 * 	Update Ms10frptDetEsrvSarData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMs10frptDetEsrvSarData(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMs10frptDetEsrvSarData,ms10frptDetEsrvSarData.length);
   	
   }
   
   public void setMs10frptDetEsrvSarData(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMs10frptDetEsrvSarData,ms10frptDetEsrvSarData.length);
   	
   }
   
     /**
	 * 	Update Ms10frptDetEsrvSarData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMs10frptDetEsrvSarData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMs10frptDetEsrvSarData+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ms10frptDetEsrvSarData with another Field
	 *	@param value
	 */
   public void setMs10frptDetEsrvSarData(Field source) {
       replace(source,0,source.length(),beginMs10frptDetEsrvSarData,MS_10FRPT_DET_ESRV_SAR_DATA_LEN);
   	
   }  
   
     /**
	 * 	Update Ms10frptDetEsrvSarData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMs10frptDetEsrvSarData(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMs10frptDetEsrvSarData,MS_10FRPT_DET_ESRV_SAR_DATA_LEN);
   	
   }
   
     /**
	 * 	Update Ms10frptDetEsrvSarData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMs10frptDetEsrvSarData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMs10frptDetEsrvSarData+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ms10frptFill4
	 *	@return ms10frptFill4
	 */
   public char[] getMs10frptFill4() throws CFException{
     if (isMs10frptFill4Modified()) { 
        ms10frptFill4 = refreshMs10frptFill4();
     }
   		return ms10frptFill4;
   }

  
	/**
	*  set variable ms10frptFill4
	*  Corresponding COBOL Variable is MS10FRPT-FILL-4
	*  @param value
	**/
   public void setMs10frptFill4(char[] value) {
      ms10frptFill4 = checkMs10frptFill4Constraints(value);
      serializeMs10frptFill4(ms10frptFill4);
   } 

     /**
	 * 	Update Ms10frptFill4 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMs10frptFill4(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMs10frptFill4,ms10frptFill4.length);
   	
   }
   
   public void setMs10frptFill4(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMs10frptFill4,ms10frptFill4.length);
   	
   }
   
     /**
	 * 	Update Ms10frptFill4 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMs10frptFill4(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMs10frptFill4+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ms10frptFill4 with another Field
	 *	@param value
	 */
   public void setMs10frptFill4(Field source) {
       replace(source,0,source.length(),beginMs10frptFill4,MS_10FRPT_FILL_4_LEN);
   	
   }  
   
     /**
	 * 	Update Ms10frptFill4 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMs10frptFill4(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMs10frptFill4,MS_10FRPT_FILL_4_LEN);
   	
   }
   
     /**
	 * 	Update Ms10frptFill4 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMs10frptFill4(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMs10frptFill4+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ms10frptDetSysDte
	 *	@return ms10frptDetSysDte
	 */
	public long getMs10frptDetSysDte() throws CFException {
       if (isMs10frptDetSysDteModified()) { 
           ms10frptDetSysDte = refreshMs10frptDetSysDte();
        }
   		return ms10frptDetSysDte;
	}
	

	
	   
	/**
	 * 	Update Ms10frptDetSysDte with the passed value
	 *  Corresponding COBOL Variable is MS10FRPT-DET-SYS-DTE
	 *	@param number
	 */
	public void setMs10frptDetSysDte(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ms10frptDetSysDte = checkMs10frptDetSysDteMaxLimit(number); 
		serializeMs10frptDetSysDte(ms10frptDetSysDte);
	}
	

	/**
	 * 	Update Ms10frptDetSysDte with the passed value
	 *	@param value (String or char[])
	 */
	public void setMs10frptDetSysDte(char[] value) throws CFException {
		 ms10frptDetSysDte = serializeMs10frptDetSysDte(value);
	}
	/**
	 * 	Update Ms10frptDetSysDte with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMs10frptDetSysDteString(char[] value) throws CFException {
		 setMs10frptDetSysDte(value);
	}
	/**
	 *	Returns the value of ms10frptDetSysTime
	 *	@return ms10frptDetSysTime
	 */
	public long getMs10frptDetSysTime() throws CFException {
       if (isMs10frptDetSysTimeModified()) { 
           ms10frptDetSysTime = refreshMs10frptDetSysTime();
        }
   		return ms10frptDetSysTime;
	}
	

	
	   
	/**
	 * 	Update Ms10frptDetSysTime with the passed value
	 *  Corresponding COBOL Variable is MS10FRPT-DET-SYS-TIME
	 *	@param number
	 */
	public void setMs10frptDetSysTime(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ms10frptDetSysTime = checkMs10frptDetSysTimeMaxLimit(number); 
		serializeMs10frptDetSysTime(ms10frptDetSysTime);
	}
	

	/**
	 * 	Update Ms10frptDetSysTime with the passed value
	 *	@param value (String or char[])
	 */
	public void setMs10frptDetSysTime(char[] value) throws CFException {
		 ms10frptDetSysTime = serializeMs10frptDetSysTime(value);
	}
	/**
	 * 	Update Ms10frptDetSysTime with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMs10frptDetSysTimeString(char[] value) throws CFException {
		 setMs10frptDetSysTime(value);
	}
	/**
	 *	Returns the value of ms10frptFill5
	 *	@return ms10frptFill5
	 */
   public char[] getMs10frptFill5() throws CFException{
     if (isMs10frptFill5Modified()) { 
        ms10frptFill5 = refreshMs10frptFill5();
     }
   		return ms10frptFill5;
   }

  
	/**
	*  set variable ms10frptFill5
	*  Corresponding COBOL Variable is MS10FRPT-FILL-5
	*  @param value
	**/
   public void setMs10frptFill5(char[] value) {
      ms10frptFill5 = checkMs10frptFill5Constraints(value);
      serializeMs10frptFill5(ms10frptFill5);
   } 

     /**
	 * 	Update Ms10frptFill5 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMs10frptFill5(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMs10frptFill5,ms10frptFill5.length);
   	
   }
   
   public void setMs10frptFill5(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMs10frptFill5,ms10frptFill5.length);
   	
   }
   
     /**
	 * 	Update Ms10frptFill5 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMs10frptFill5(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMs10frptFill5+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ms10frptFill5 with another Field
	 *	@param value
	 */
   public void setMs10frptFill5(Field source) {
       replace(source,0,source.length(),beginMs10frptFill5,MS_10FRPT_FILL_5_LEN);
   	
   }  
   
     /**
	 * 	Update Ms10frptFill5 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMs10frptFill5(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMs10frptFill5,MS_10FRPT_FILL_5_LEN);
   	
   }
   
     /**
	 * 	Update Ms10frptFill5 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMs10frptFill5(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMs10frptFill5+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ms10frptDetMemberIca
	 *	@return ms10frptDetMemberIca
	 */
	public long getMs10frptDetMemberIca() throws CFException {
       if (isMs10frptDetMemberIcaModified()) { 
           ms10frptDetMemberIca = refreshMs10frptDetMemberIca();
        }
   		return ms10frptDetMemberIca;
	}
	

	
	   
	/**
	 * 	Update Ms10frptDetMemberIca with the passed value
	 *  Corresponding COBOL Variable is MS10FRPT-DET-MEMBER-ICA
	 *	@param number
	 */
	public void setMs10frptDetMemberIca(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ms10frptDetMemberIca = checkMs10frptDetMemberIcaMaxLimit(number); 
		serializeMs10frptDetMemberIca(ms10frptDetMemberIca);
	}
	

	/**
	 * 	Update Ms10frptDetMemberIca with the passed value
	 *	@param value (String or char[])
	 */
	public void setMs10frptDetMemberIca(char[] value) throws CFException {
		 ms10frptDetMemberIca = serializeMs10frptDetMemberIca(value);
	}
	/**
	 * 	Update Ms10frptDetMemberIca with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMs10frptDetMemberIcaString(char[] value) throws CFException {
		 setMs10frptDetMemberIca(value);
	}
	/**
	 *	Returns the value of ms10frptDetEservFlag
	 *	@return ms10frptDetEservFlag
	 */
   public char[] getMs10frptDetEservFlag() throws CFException{
     if (isMs10frptDetEservFlagModified()) { 
        ms10frptDetEservFlag = refreshMs10frptDetEservFlag();
     }
   		return ms10frptDetEservFlag;
   }

  
	/**
	*  set variable ms10frptDetEservFlag
	*  Corresponding COBOL Variable is MS10FRPT-DET-ESERV-FLAG
	*  @param value
	**/
   public void setMs10frptDetEservFlag(char[] value) {
      ms10frptDetEservFlag = checkMs10frptDetEservFlagConstraints(value);
      serializeMs10frptDetEservFlag(ms10frptDetEservFlag);
   } 

     /**
	 * 	Update Ms10frptDetEservFlag 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMs10frptDetEservFlag(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMs10frptDetEservFlag,ms10frptDetEservFlag.length);
   	
   }
   
   public void setMs10frptDetEservFlag(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMs10frptDetEservFlag,ms10frptDetEservFlag.length);
   	
   }
   
     /**
	 * 	Update Ms10frptDetEservFlag 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMs10frptDetEservFlag(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMs10frptDetEservFlag+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ms10frptDetEservFlag with another Field
	 *	@param value
	 */
   public void setMs10frptDetEservFlag(Field source) {
       replace(source,0,source.length(),beginMs10frptDetEservFlag,MS_10FRPT_DET_ESERV_FLAG_LEN);
   	
   }  
   
     /**
	 * 	Update Ms10frptDetEservFlag 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMs10frptDetEservFlag(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMs10frptDetEservFlag,MS_10FRPT_DET_ESERV_FLAG_LEN);
   	
   }
   
     /**
	 * 	Update Ms10frptDetEservFlag 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMs10frptDetEservFlag(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMs10frptDetEservFlag+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ms10frptFill6
	 *	@return ms10frptFill6
	 */
   public char[] getMs10frptFill6() throws CFException{
     if (isMs10frptFill6Modified()) { 
        ms10frptFill6 = refreshMs10frptFill6();
     }
   		return ms10frptFill6;
   }

  
	/**
	*  set variable ms10frptFill6
	*  Corresponding COBOL Variable is MS10FRPT-FILL-6
	*  @param value
	**/
   public void setMs10frptFill6(char[] value) {
      ms10frptFill6 = checkMs10frptFill6Constraints(value);
      serializeMs10frptFill6(ms10frptFill6);
   } 

     /**
	 * 	Update Ms10frptFill6 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMs10frptFill6(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMs10frptFill6,ms10frptFill6.length);
   	
   }
   
   public void setMs10frptFill6(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMs10frptFill6,ms10frptFill6.length);
   	
   }
   
     /**
	 * 	Update Ms10frptFill6 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMs10frptFill6(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMs10frptFill6+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ms10frptFill6 with another Field
	 *	@param value
	 */
   public void setMs10frptFill6(Field source) {
       replace(source,0,source.length(),beginMs10frptFill6,MS_10FRPT_FILL_6_LEN);
   	
   }  
   
     /**
	 * 	Update Ms10frptFill6 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMs10frptFill6(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMs10frptFill6,MS_10FRPT_FILL_6_LEN);
   	
   }
   
     /**
	 * 	Update Ms10frptFill6 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMs10frptFill6(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMs10frptFill6+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ms10frptDetEarlyDlvry
	 *	@return ms10frptDetEarlyDlvry
	 */
   public char[] getMs10frptDetEarlyDlvry() throws CFException{
     if (isMs10frptDetEarlyDlvryModified()) { 
        ms10frptDetEarlyDlvry = refreshMs10frptDetEarlyDlvry();
     }
   		return ms10frptDetEarlyDlvry;
   }

  
	/**
	*  set variable ms10frptDetEarlyDlvry
	*  Corresponding COBOL Variable is MS10FRPT-DET-EARLY-DLVRY
	*  @param value
	**/
   public void setMs10frptDetEarlyDlvry(char[] value) {
      ms10frptDetEarlyDlvry = checkMs10frptDetEarlyDlvryConstraints(value);
      serializeMs10frptDetEarlyDlvry(ms10frptDetEarlyDlvry);
   } 

     /**
	 * 	Update Ms10frptDetEarlyDlvry 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMs10frptDetEarlyDlvry(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMs10frptDetEarlyDlvry,ms10frptDetEarlyDlvry.length);
   	
   }
   
   public void setMs10frptDetEarlyDlvry(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMs10frptDetEarlyDlvry,ms10frptDetEarlyDlvry.length);
   	
   }
   
     /**
	 * 	Update Ms10frptDetEarlyDlvry 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMs10frptDetEarlyDlvry(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMs10frptDetEarlyDlvry+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ms10frptDetEarlyDlvry with another Field
	 *	@param value
	 */
   public void setMs10frptDetEarlyDlvry(Field source) {
       replace(source,0,source.length(),beginMs10frptDetEarlyDlvry,MS_10FRPT_DET_EARLY_DLVRY_LEN);
   	
   }  
   
     /**
	 * 	Update Ms10frptDetEarlyDlvry 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMs10frptDetEarlyDlvry(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMs10frptDetEarlyDlvry,MS_10FRPT_DET_EARLY_DLVRY_LEN);
   	
   }
   
     /**
	 * 	Update Ms10frptDetEarlyDlvry 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMs10frptDetEarlyDlvry(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMs10frptDetEarlyDlvry+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ms10frptRptDetail
	 *	@return ms10frptRptDetail
	 */
   public char[] getMs10frptRptDetail() throws CFException{
     if (isMs10frptRptDetailModified()) { 
        ms10frptRptDetail = refreshMs10frptRptDetail();
     }
   		return ms10frptRptDetail;
   }

  
	/**
	*  set variable ms10frptRptDetail
	*  Corresponding COBOL Variable is MS10FRPT-RPT-DETAIL
	*  @param value
	**/
   public void setMs10frptRptDetail(char[] value) {
      ms10frptRptDetail = checkMs10frptRptDetailConstraints(value);
      serializeMs10frptRptDetail(ms10frptRptDetail);
   } 

     /**
	 * 	Update Ms10frptRptDetail 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMs10frptRptDetail(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMs10frptRptDetail,ms10frptRptDetail.length);
   	
   }
   
   public void setMs10frptRptDetail(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMs10frptRptDetail,ms10frptRptDetail.length);
   	
   }
   
     /**
	 * 	Update Ms10frptRptDetail 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMs10frptRptDetail(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMs10frptRptDetail+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ms10frptRptDetail with another Field
	 *	@param value
	 */
   public void setMs10frptRptDetail(Field source) {
       replace(source,0,source.length(),beginMs10frptRptDetail,MS_10FRPT_RPT_DETAIL_LEN);
   	
   }  
   
     /**
	 * 	Update Ms10frptRptDetail 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMs10frptRptDetail(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMs10frptRptDetail,MS_10FRPT_RPT_DETAIL_LEN);
   	
   }
   
     /**
	 * 	Update Ms10frptRptDetail 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMs10frptRptDetail(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMs10frptRptDetail+targetIndex,targetLen);
    
   }

	
	
	

		public static int getMs10frptMbrDetailRecFieldLength() {
			return MS_10FRPT_MBR_DETAIL_REC_LENGTH;
		}

}
  

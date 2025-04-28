package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip66601TipalrmEntries is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@GlobalDto
public class Ip66601TipalrmEntries extends Ip66601TipalrmEntriesSerialized { 
   

						private char[] ip66601JobGroup = Field.fillLowValue(6);

								private short ip66601JobSeqNumber;

								private short ip66601NumberOfRunning;

								private short ip66601NumberToRun;

								private short ip66601DefaultRunNumber;

								private short ip66601MaximumRunNumber;

						private char[] ip66601ShortSleep = Field.fillLowValue(8);

						private char[] ip66601LongSleep = Field.fillLowValue(8);

						private char[] ip66601TaskDesc = Field.fillLowValue(30);

						private char[] ip66601TaskTypeCd = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip66601TipalrmEntries
	**/
    public Ip66601TipalrmEntries() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip66601JobGroup
	 *	@return ip66601JobGroup
	 */
   public char[] getIp66601JobGroup() throws CFException{
     if (isIp66601JobGroupModified()) { 
        ip66601JobGroup = refreshIp66601JobGroup();
     }
   		return ip66601JobGroup;
   }

  
	/**
	*  set variable ip66601JobGroup
	*  Corresponding COBOL Variable is IP66601-JOB-GROUP
	*  @param value
	**/
   public void setIp66601JobGroup(char[] value) {
      ip66601JobGroup = checkIp66601JobGroupConstraints(value);
      serializeIp66601JobGroup(ip66601JobGroup);
   } 

     /**
	 * 	Update Ip66601JobGroup 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66601JobGroup(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp66601JobGroup,ip66601JobGroup.length);
   	
   }
   
   public void setIp66601JobGroup(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp66601JobGroup,ip66601JobGroup.length);
   	
   }
   
     /**
	 * 	Update Ip66601JobGroup 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66601JobGroup(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66601JobGroup+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip66601JobGroup with another Field
	 *	@param value
	 */
   public void setIp66601JobGroup(Field source) {
       replace(source,0,source.length(),beginIp66601JobGroup,IP_66601_JOB_GROUP_LEN);
   	
   }  
   
     /**
	 * 	Update Ip66601JobGroup 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66601JobGroup(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp66601JobGroup,IP_66601_JOB_GROUP_LEN);
   	
   }
   
     /**
	 * 	Update Ip66601JobGroup 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66601JobGroup(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66601JobGroup+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip66601JobSeqNumber
	 *	@return ip66601JobSeqNumber
	 */
	public short getIp66601JobSeqNumber() throws CFException {
        if (isIp66601JobSeqNumberModified()) { 
           ip66601JobSeqNumber = refreshIp66601JobSeqNumber();
        }
   		return ip66601JobSeqNumber;
	}
	
	/**
	 * 	Update Ip66601JobSeqNumber with the passed value
	 *  Corresponding COBOL Variable is IP66601-JOB-SEQ-NUMBER
	 *	@param number
	 */
	public void setIp66601JobSeqNumber(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip66601JobSeqNumber = checkIp66601JobSeqNumberMaxLimit(number); 
		serializeIp66601JobSeqNumber(ip66601JobSeqNumber);
	}

	public void setIp66601JobSeqNumber(int number) {
	    number = checkIp66601JobSeqNumberMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp66601JobSeqNumber((short)number);
	}
	public void setIp66601JobSeqNumber(long number) {
	    number = checkIp66601JobSeqNumberMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp66601JobSeqNumber((short)number);
	}
	

	/**
	 *	Returns the value of ip66601NumberOfRunning
	 *	@return ip66601NumberOfRunning
	 */
	public short getIp66601NumberOfRunning() throws CFException {
        if (isIp66601NumberOfRunningModified()) { 
           ip66601NumberOfRunning = refreshIp66601NumberOfRunning();
        }
   		return ip66601NumberOfRunning;
	}
	
	/**
	 * 	Update Ip66601NumberOfRunning with the passed value
	 *  Corresponding COBOL Variable is IP66601-NUMBER-OF-RUNNING
	 *	@param number
	 */
	public void setIp66601NumberOfRunning(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip66601NumberOfRunning = checkIp66601NumberOfRunningMaxLimit(number); 
		serializeIp66601NumberOfRunning(ip66601NumberOfRunning);
	}

	public void setIp66601NumberOfRunning(int number) {
	    number = checkIp66601NumberOfRunningMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp66601NumberOfRunning((short)number);
	}
	public void setIp66601NumberOfRunning(long number) {
	    number = checkIp66601NumberOfRunningMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp66601NumberOfRunning((short)number);
	}
	

	/**
	 *	Returns the value of ip66601NumberToRun
	 *	@return ip66601NumberToRun
	 */
	public short getIp66601NumberToRun() throws CFException {
        if (isIp66601NumberToRunModified()) { 
           ip66601NumberToRun = refreshIp66601NumberToRun();
        }
   		return ip66601NumberToRun;
	}
	
	/**
	 * 	Update Ip66601NumberToRun with the passed value
	 *  Corresponding COBOL Variable is IP66601-NUMBER-TO-RUN
	 *	@param number
	 */
	public void setIp66601NumberToRun(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip66601NumberToRun = checkIp66601NumberToRunMaxLimit(number); 
		serializeIp66601NumberToRun(ip66601NumberToRun);
	}

	public void setIp66601NumberToRun(int number) {
	    number = checkIp66601NumberToRunMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp66601NumberToRun((short)number);
	}
	public void setIp66601NumberToRun(long number) {
	    number = checkIp66601NumberToRunMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp66601NumberToRun((short)number);
	}
	

	/**
	 *	Returns the value of ip66601DefaultRunNumber
	 *	@return ip66601DefaultRunNumber
	 */
	public short getIp66601DefaultRunNumber() throws CFException {
        if (isIp66601DefaultRunNumberModified()) { 
           ip66601DefaultRunNumber = refreshIp66601DefaultRunNumber();
        }
   		return ip66601DefaultRunNumber;
	}
	
	/**
	 * 	Update Ip66601DefaultRunNumber with the passed value
	 *  Corresponding COBOL Variable is IP66601-DEFAULT-RUN-NUMBER
	 *	@param number
	 */
	public void setIp66601DefaultRunNumber(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip66601DefaultRunNumber = checkIp66601DefaultRunNumberMaxLimit(number); 
		serializeIp66601DefaultRunNumber(ip66601DefaultRunNumber);
	}

	public void setIp66601DefaultRunNumber(int number) {
	    number = checkIp66601DefaultRunNumberMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp66601DefaultRunNumber((short)number);
	}
	public void setIp66601DefaultRunNumber(long number) {
	    number = checkIp66601DefaultRunNumberMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp66601DefaultRunNumber((short)number);
	}
	

	/**
	 *	Returns the value of ip66601MaximumRunNumber
	 *	@return ip66601MaximumRunNumber
	 */
	public short getIp66601MaximumRunNumber() throws CFException {
        if (isIp66601MaximumRunNumberModified()) { 
           ip66601MaximumRunNumber = refreshIp66601MaximumRunNumber();
        }
   		return ip66601MaximumRunNumber;
	}
	
	/**
	 * 	Update Ip66601MaximumRunNumber with the passed value
	 *  Corresponding COBOL Variable is IP66601-MAXIMUM-RUN-NUMBER
	 *	@param number
	 */
	public void setIp66601MaximumRunNumber(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip66601MaximumRunNumber = checkIp66601MaximumRunNumberMaxLimit(number); 
		serializeIp66601MaximumRunNumber(ip66601MaximumRunNumber);
	}

	public void setIp66601MaximumRunNumber(int number) {
	    number = checkIp66601MaximumRunNumberMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp66601MaximumRunNumber((short)number);
	}
	public void setIp66601MaximumRunNumber(long number) {
	    number = checkIp66601MaximumRunNumberMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp66601MaximumRunNumber((short)number);
	}
	

	/**
	 *	Returns the value of ip66601ShortSleep
	 *	@return ip66601ShortSleep
	 */
   public char[] getIp66601ShortSleep() throws CFException{
     if (isIp66601ShortSleepModified()) { 
        ip66601ShortSleep = refreshIp66601ShortSleep();
     }
   		return ip66601ShortSleep;
   }

  
	/**
	*  set variable ip66601ShortSleep
	*  Corresponding COBOL Variable is IP66601-SHORT-SLEEP
	*  @param value
	**/
   public void setIp66601ShortSleep(char[] value) {
      ip66601ShortSleep = checkIp66601ShortSleepConstraints(value);
      serializeIp66601ShortSleep(ip66601ShortSleep);
   } 

     /**
	 * 	Update Ip66601ShortSleep 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66601ShortSleep(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp66601ShortSleep,ip66601ShortSleep.length);
   	
   }
   
   public void setIp66601ShortSleep(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp66601ShortSleep,ip66601ShortSleep.length);
   	
   }
   
     /**
	 * 	Update Ip66601ShortSleep 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66601ShortSleep(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66601ShortSleep+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip66601ShortSleep with another Field
	 *	@param value
	 */
   public void setIp66601ShortSleep(Field source) {
       replace(source,0,source.length(),beginIp66601ShortSleep,IP_66601_SHORT_SLEEP_LEN);
   	
   }  
   
     /**
	 * 	Update Ip66601ShortSleep 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66601ShortSleep(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp66601ShortSleep,IP_66601_SHORT_SLEEP_LEN);
   	
   }
   
     /**
	 * 	Update Ip66601ShortSleep 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66601ShortSleep(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66601ShortSleep+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip66601LongSleep
	 *	@return ip66601LongSleep
	 */
   public char[] getIp66601LongSleep() throws CFException{
     if (isIp66601LongSleepModified()) { 
        ip66601LongSleep = refreshIp66601LongSleep();
     }
   		return ip66601LongSleep;
   }

  
	/**
	*  set variable ip66601LongSleep
	*  Corresponding COBOL Variable is IP66601-LONG-SLEEP
	*  @param value
	**/
   public void setIp66601LongSleep(char[] value) {
      ip66601LongSleep = checkIp66601LongSleepConstraints(value);
      serializeIp66601LongSleep(ip66601LongSleep);
   } 

     /**
	 * 	Update Ip66601LongSleep 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66601LongSleep(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp66601LongSleep,ip66601LongSleep.length);
   	
   }
   
   public void setIp66601LongSleep(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp66601LongSleep,ip66601LongSleep.length);
   	
   }
   
     /**
	 * 	Update Ip66601LongSleep 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66601LongSleep(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66601LongSleep+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip66601LongSleep with another Field
	 *	@param value
	 */
   public void setIp66601LongSleep(Field source) {
       replace(source,0,source.length(),beginIp66601LongSleep,IP_66601_LONG_SLEEP_LEN);
   	
   }  
   
     /**
	 * 	Update Ip66601LongSleep 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66601LongSleep(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp66601LongSleep,IP_66601_LONG_SLEEP_LEN);
   	
   }
   
     /**
	 * 	Update Ip66601LongSleep 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66601LongSleep(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66601LongSleep+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip66601TaskDesc
	 *	@return ip66601TaskDesc
	 */
   public char[] getIp66601TaskDesc() throws CFException{
     if (isIp66601TaskDescModified()) { 
        ip66601TaskDesc = refreshIp66601TaskDesc();
     }
   		return ip66601TaskDesc;
   }

  
	/**
	*  set variable ip66601TaskDesc
	*  Corresponding COBOL Variable is IP66601-TASK-DESC
	*  @param value
	**/
   public void setIp66601TaskDesc(char[] value) {
      ip66601TaskDesc = checkIp66601TaskDescConstraints(value);
      serializeIp66601TaskDesc(ip66601TaskDesc);
   } 

     /**
	 * 	Update Ip66601TaskDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66601TaskDesc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp66601TaskDesc,ip66601TaskDesc.length);
   	
   }
   
   public void setIp66601TaskDesc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp66601TaskDesc,ip66601TaskDesc.length);
   	
   }
   
     /**
	 * 	Update Ip66601TaskDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66601TaskDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66601TaskDesc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip66601TaskDesc with another Field
	 *	@param value
	 */
   public void setIp66601TaskDesc(Field source) {
       replace(source,0,source.length(),beginIp66601TaskDesc,IP_66601_TASK_DESC_LEN);
   	
   }  
   
     /**
	 * 	Update Ip66601TaskDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66601TaskDesc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp66601TaskDesc,IP_66601_TASK_DESC_LEN);
   	
   }
   
     /**
	 * 	Update Ip66601TaskDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66601TaskDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66601TaskDesc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip66601TaskTypeCd
	 *	@return ip66601TaskTypeCd
	 */
   public char[] getIp66601TaskTypeCd() throws CFException{
     if (isIp66601TaskTypeCdModified()) { 
        ip66601TaskTypeCd = refreshIp66601TaskTypeCd();
     }
   		return ip66601TaskTypeCd;
   }

  
	/**
	*  set variable ip66601TaskTypeCd
	*  Corresponding COBOL Variable is IP66601-TASK-TYPE-CD
	*  @param value
	**/
   public void setIp66601TaskTypeCd(char[] value) {
      ip66601TaskTypeCd = checkIp66601TaskTypeCdConstraints(value);
      serializeIp66601TaskTypeCd(ip66601TaskTypeCd);
   } 

     /**
	 * 	Update Ip66601TaskTypeCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66601TaskTypeCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp66601TaskTypeCd,ip66601TaskTypeCd.length);
   	
   }
   
   public void setIp66601TaskTypeCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp66601TaskTypeCd,ip66601TaskTypeCd.length);
   	
   }
   
     /**
	 * 	Update Ip66601TaskTypeCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66601TaskTypeCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66601TaskTypeCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip66601TaskTypeCd with another Field
	 *	@param value
	 */
   public void setIp66601TaskTypeCd(Field source) {
       replace(source,0,source.length(),beginIp66601TaskTypeCd,IP_66601_TASK_TYPE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip66601TaskTypeCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66601TaskTypeCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp66601TaskTypeCd,IP_66601_TASK_TYPE_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip66601TaskTypeCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66601TaskTypeCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66601TaskTypeCd+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip66601TipalrmEntries
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp66601JobGroup(CONSTANTS.SPACE_6);
         	setIp66601JobSeqNumber((short)0);
         	setIp66601NumberOfRunning((short)0);
         	setIp66601NumberToRun((short)0);
         	setIp66601DefaultRunNumber((short)0);
         	setIp66601MaximumRunNumber((short)0);
         setIp66601ShortSleep(CONSTANTS.SPACE_8);
         setIp66601LongSleep(CONSTANTS.SPACE_8);
         setIp66601TaskDesc(CONSTANTS.SPACE_30);
         setIp66601TaskTypeCd(CONSTANTS.SPACE);
   }

		public static int getIp66601TipalrmEntriesFieldLength() {
			return IP_66601_TIPALRM_ENTRIES_LENGTH;
		}

}
  

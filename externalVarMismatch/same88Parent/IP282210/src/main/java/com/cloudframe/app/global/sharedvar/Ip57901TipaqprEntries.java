package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip57901TipaqprEntries is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:33. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip57901TipaqprEntries extends Ip57901TipaqprEntriesSerialized { 
   

						private char[] ip57901JobGroup = Field.fillLowValue(6);

								private short ip57901JobGrpNum;

								private short ip57901ProcPriorityNum;

						private char[] ip57901ServCd = Field.fillLowValue(4);

						private char[] ip57901FuncCd = Field.fillLowValue(4);

								private short ip57901QueueNum;
	
	/**
	* Constructor for Ip57901TipaqprEntries
	**/
    public Ip57901TipaqprEntries() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip57901TipaqprEntries. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip57901TipaqprEntries(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip57901JobGroup
	 *	@return ip57901JobGroup
	 */
   public char[] getIp57901JobGroup() throws CFException{
     if (isIp57901JobGroupModified()) { 
        ip57901JobGroup = refreshIp57901JobGroup();
     }
   		return ip57901JobGroup;
   }

  
	/**
	*  set variable ip57901JobGroup
	*  Corresponding COBOL Variable is IP57901-JOB-GROUP
	*  @param value
	**/
   public void setIp57901JobGroup(char[] value) {
      ip57901JobGroup = checkIp57901JobGroupConstraints(value);
      serializeIp57901JobGroup(ip57901JobGroup);
   } 

     /**
	 * 	Update Ip57901JobGroup 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp57901JobGroup(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp57901JobGroup,ip57901JobGroup.length);
   	
   }
   
   public void setIp57901JobGroup(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp57901JobGroup,ip57901JobGroup.length);
   	
   }
   
     /**
	 * 	Update Ip57901JobGroup 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp57901JobGroup(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp57901JobGroup+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip57901JobGroup with another Field
	 *	@param value
	 */
   public void setIp57901JobGroup(Field source) {
       replace(source,0,source.length(),beginIp57901JobGroup,IP_57901_JOB_GROUP_LEN);
   	
   }  
   
     /**
	 * 	Update Ip57901JobGroup 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp57901JobGroup(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp57901JobGroup,IP_57901_JOB_GROUP_LEN);
   	
   }
   
     /**
	 * 	Update Ip57901JobGroup 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp57901JobGroup(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp57901JobGroup+targetIndex,targetLen);
    
   }
	public short getIp57901JobGrpNum() throws CFException {
        if (isIp57901JobGrpNumModified()) { 
           ip57901JobGrpNum = refreshIp57901JobGrpNum();
        }
   		return ip57901JobGrpNum;
	}
	
	/**
	 * 	Update Ip57901JobGrpNum with the passed value
	 *  Corresponding COBOL Variable is IP57901-JOB-GRP-NUM
	 *	@param number
	 */
	public void setIp57901JobGrpNum(short number) {
			ip57901JobGrpNum = checkIp57901JobGrpNumMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeIp57901JobGrpNum(ip57901JobGrpNum);
	}

	public void setIp57901JobGrpNum(int number) {
	    number = checkIp57901JobGrpNumMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp57901JobGrpNum((short)number);
	}
	public void setIp57901JobGrpNum(long number) {
	    number = checkIp57901JobGrpNumMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp57901JobGrpNum((short)number);
	}
	

	public short getIp57901ProcPriorityNum() throws CFException {
        if (isIp57901ProcPriorityNumModified()) { 
           ip57901ProcPriorityNum = refreshIp57901ProcPriorityNum();
        }
   		return ip57901ProcPriorityNum;
	}
	
	/**
	 * 	Update Ip57901ProcPriorityNum with the passed value
	 *  Corresponding COBOL Variable is IP57901-PROC-PRIORITY-NUM
	 *	@param number
	 */
	public void setIp57901ProcPriorityNum(short number) {
			ip57901ProcPriorityNum = checkIp57901ProcPriorityNumMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeIp57901ProcPriorityNum(ip57901ProcPriorityNum);
	}

	public void setIp57901ProcPriorityNum(int number) {
	    number = checkIp57901ProcPriorityNumMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp57901ProcPriorityNum((short)number);
	}
	public void setIp57901ProcPriorityNum(long number) {
	    number = checkIp57901ProcPriorityNumMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp57901ProcPriorityNum((short)number);
	}
	

	/**
	 *	Returns the value of ip57901ServCd
	 *	@return ip57901ServCd
	 */
   public char[] getIp57901ServCd() throws CFException{
     if (isIp57901ServCdModified()) { 
        ip57901ServCd = refreshIp57901ServCd();
     }
   		return ip57901ServCd;
   }

  
	/**
	*  set variable ip57901ServCd
	*  Corresponding COBOL Variable is IP57901-SERV-CD
	*  @param value
	**/
   public void setIp57901ServCd(char[] value) {
      ip57901ServCd = checkIp57901ServCdConstraints(value);
      serializeIp57901ServCd(ip57901ServCd);
   } 

     /**
	 * 	Update Ip57901ServCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp57901ServCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp57901ServCd,ip57901ServCd.length);
   	
   }
   
   public void setIp57901ServCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp57901ServCd,ip57901ServCd.length);
   	
   }
   
     /**
	 * 	Update Ip57901ServCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp57901ServCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp57901ServCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip57901ServCd with another Field
	 *	@param value
	 */
   public void setIp57901ServCd(Field source) {
       replace(source,0,source.length(),beginIp57901ServCd,IP_57901_SERV_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip57901ServCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp57901ServCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp57901ServCd,IP_57901_SERV_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip57901ServCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp57901ServCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp57901ServCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip57901FuncCd
	 *	@return ip57901FuncCd
	 */
   public char[] getIp57901FuncCd() throws CFException{
     if (isIp57901FuncCdModified()) { 
        ip57901FuncCd = refreshIp57901FuncCd();
     }
   		return ip57901FuncCd;
   }

  
	/**
	*  set variable ip57901FuncCd
	*  Corresponding COBOL Variable is IP57901-FUNC-CD
	*  @param value
	**/
   public void setIp57901FuncCd(char[] value) {
      ip57901FuncCd = checkIp57901FuncCdConstraints(value);
      serializeIp57901FuncCd(ip57901FuncCd);
   } 

     /**
	 * 	Update Ip57901FuncCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp57901FuncCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp57901FuncCd,ip57901FuncCd.length);
   	
   }
   
   public void setIp57901FuncCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp57901FuncCd,ip57901FuncCd.length);
   	
   }
   
     /**
	 * 	Update Ip57901FuncCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp57901FuncCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp57901FuncCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip57901FuncCd with another Field
	 *	@param value
	 */
   public void setIp57901FuncCd(Field source) {
       replace(source,0,source.length(),beginIp57901FuncCd,IP_57901_FUNC_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip57901FuncCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp57901FuncCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp57901FuncCd,IP_57901_FUNC_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip57901FuncCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp57901FuncCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp57901FuncCd+targetIndex,targetLen);
    
   }
	public short getIp57901QueueNum() throws CFException {
        if (isIp57901QueueNumModified()) { 
           ip57901QueueNum = refreshIp57901QueueNum();
        }
   		return ip57901QueueNum;
	}
	
	/**
	 * 	Update Ip57901QueueNum with the passed value
	 *  Corresponding COBOL Variable is IP57901-QUEUE-NUM
	 *	@param number
	 */
	public void setIp57901QueueNum(short number) {
			ip57901QueueNum = checkIp57901QueueNumMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeIp57901QueueNum(ip57901QueueNum);
	}

	public void setIp57901QueueNum(int number) {
	    number = checkIp57901QueueNumMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp57901QueueNum((short)number);
	}
	public void setIp57901QueueNum(long number) {
	    number = checkIp57901QueueNumMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp57901QueueNum((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip57901TipaqprEntries
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp57901JobGroup(CONSTANTS.SPACE_6);
         	setIp57901JobGrpNum((short)0);
         	setIp57901ProcPriorityNum((short)0);
         setIp57901ServCd(CONSTANTS.SPACE_4);
         setIp57901FuncCd(CONSTANTS.SPACE_4);
         	setIp57901QueueNum((short)0);
   }

		public static int getIp57901TipaqprEntriesFieldLength() {
			return IP_57901_TIPAQPR_ENTRIES_LENGTH;
		}

}
  

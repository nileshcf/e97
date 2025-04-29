package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip16901RewardParms is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip16901RewardParms extends Ip16901RewardParmsSerialized { 
   

						private char[] ip16901ProgramId = Field.fillLowValue(11);

						private char[] ip16901ProgramEffDate = Field.fillLowValue(10);

						private char[] ip16901ProgramDesc = Field.fillLowValue(50);

						private char[] ip16901ProgramType = Field.fillLowValue(3);

						private char[] ip16901McMbrId = Field.fillLowValue(11);

								private int ip16901McPercent;

						private char[] ip16901AcqMbrId = Field.fillLowValue(11);

								private int ip16901AcqPercent;

						private char[] ip16901IssMbrId = Field.fillLowValue(11);

								private int ip16901IssPercent;

						private char[] ip16901CabCode = Field.fillLowValue(5);

								private int ip16901MrchntPaymtPct;

						private char[] ip16901ReconMthdCd = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip16901RewardParms
	**/
    public Ip16901RewardParms() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip16901RewardParms. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip16901RewardParms(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip16901ProgramId
	 *	@return ip16901ProgramId
	 */
   public char[] getIp16901ProgramId() throws CFException{
     if (isIp16901ProgramIdModified()) { 
        ip16901ProgramId = refreshIp16901ProgramId();
     }
   		return ip16901ProgramId;
   }

  
	/**
	*  set variable ip16901ProgramId
	*  Corresponding COBOL Variable is IP16901-PROGRAM-ID
	*  @param value
	**/
   public void setIp16901ProgramId(char[] value) {
      ip16901ProgramId = checkIp16901ProgramIdConstraints(value);
      serializeIp16901ProgramId(ip16901ProgramId);
   } 

     /**
	 * 	Update Ip16901ProgramId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp16901ProgramId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp16901ProgramId,ip16901ProgramId.length);
   	
   }
   
   public void setIp16901ProgramId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp16901ProgramId,ip16901ProgramId.length);
   	
   }
   
     /**
	 * 	Update Ip16901ProgramId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp16901ProgramId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp16901ProgramId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip16901ProgramId with another Field
	 *	@param value
	 */
   public void setIp16901ProgramId(Field source) {
       replace(source,0,source.length(),beginIp16901ProgramId,IP_16901_PROGRAM_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip16901ProgramId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp16901ProgramId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp16901ProgramId,IP_16901_PROGRAM_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip16901ProgramId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp16901ProgramId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp16901ProgramId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip16901ProgramEffDate
	 *	@return ip16901ProgramEffDate
	 */
   public char[] getIp16901ProgramEffDate() throws CFException{
     if (isIp16901ProgramEffDateModified()) { 
        ip16901ProgramEffDate = refreshIp16901ProgramEffDate();
     }
   		return ip16901ProgramEffDate;
   }

  
	/**
	*  set variable ip16901ProgramEffDate
	*  Corresponding COBOL Variable is IP16901-PROGRAM-EFF-DATE
	*  @param value
	**/
   public void setIp16901ProgramEffDate(char[] value) {
      ip16901ProgramEffDate = checkIp16901ProgramEffDateConstraints(value);
      serializeIp16901ProgramEffDate(ip16901ProgramEffDate);
   } 

     /**
	 * 	Update Ip16901ProgramEffDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp16901ProgramEffDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp16901ProgramEffDate,ip16901ProgramEffDate.length);
   	
   }
   
   public void setIp16901ProgramEffDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp16901ProgramEffDate,ip16901ProgramEffDate.length);
   	
   }
   
     /**
	 * 	Update Ip16901ProgramEffDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp16901ProgramEffDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp16901ProgramEffDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip16901ProgramEffDate with another Field
	 *	@param value
	 */
   public void setIp16901ProgramEffDate(Field source) {
       replace(source,0,source.length(),beginIp16901ProgramEffDate,IP_16901_PROGRAM_EFF_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip16901ProgramEffDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp16901ProgramEffDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp16901ProgramEffDate,IP_16901_PROGRAM_EFF_DATE_LEN);
   	
   }
   
     /**
	 * 	Update Ip16901ProgramEffDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp16901ProgramEffDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp16901ProgramEffDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip16901ProgramDesc
	 *	@return ip16901ProgramDesc
	 */
   public char[] getIp16901ProgramDesc() throws CFException{
     if (isIp16901ProgramDescModified()) { 
        ip16901ProgramDesc = refreshIp16901ProgramDesc();
     }
   		return ip16901ProgramDesc;
   }

  
	/**
	*  set variable ip16901ProgramDesc
	*  Corresponding COBOL Variable is IP16901-PROGRAM-DESC
	*  @param value
	**/
   public void setIp16901ProgramDesc(char[] value) {
      ip16901ProgramDesc = checkIp16901ProgramDescConstraints(value);
      serializeIp16901ProgramDesc(ip16901ProgramDesc);
   } 

     /**
	 * 	Update Ip16901ProgramDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp16901ProgramDesc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp16901ProgramDesc,ip16901ProgramDesc.length);
   	
   }
   
   public void setIp16901ProgramDesc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp16901ProgramDesc,ip16901ProgramDesc.length);
   	
   }
   
     /**
	 * 	Update Ip16901ProgramDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp16901ProgramDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp16901ProgramDesc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip16901ProgramDesc with another Field
	 *	@param value
	 */
   public void setIp16901ProgramDesc(Field source) {
       replace(source,0,source.length(),beginIp16901ProgramDesc,IP_16901_PROGRAM_DESC_LEN);
   	
   }  
   
     /**
	 * 	Update Ip16901ProgramDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp16901ProgramDesc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp16901ProgramDesc,IP_16901_PROGRAM_DESC_LEN);
   	
   }
   
     /**
	 * 	Update Ip16901ProgramDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp16901ProgramDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp16901ProgramDesc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip16901ProgramType
	 *	@return ip16901ProgramType
	 */
   public char[] getIp16901ProgramType() throws CFException{
     if (isIp16901ProgramTypeModified()) { 
        ip16901ProgramType = refreshIp16901ProgramType();
     }
   		return ip16901ProgramType;
   }

  
	/**
	*  set variable ip16901ProgramType
	*  Corresponding COBOL Variable is IP16901-PROGRAM-TYPE
	*  @param value
	**/
   public void setIp16901ProgramType(char[] value) {
      ip16901ProgramType = checkIp16901ProgramTypeConstraints(value);
      serializeIp16901ProgramType(ip16901ProgramType);
   } 

     /**
	 * 	Update Ip16901ProgramType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp16901ProgramType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp16901ProgramType,ip16901ProgramType.length);
   	
   }
   
   public void setIp16901ProgramType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp16901ProgramType,ip16901ProgramType.length);
   	
   }
   
     /**
	 * 	Update Ip16901ProgramType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp16901ProgramType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp16901ProgramType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip16901ProgramType with another Field
	 *	@param value
	 */
   public void setIp16901ProgramType(Field source) {
       replace(source,0,source.length(),beginIp16901ProgramType,IP_16901_PROGRAM_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip16901ProgramType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp16901ProgramType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp16901ProgramType,IP_16901_PROGRAM_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update Ip16901ProgramType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp16901ProgramType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp16901ProgramType+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip16901McMbrId
	 *	@return ip16901McMbrId
	 */
   public char[] getIp16901McMbrId() throws CFException{
     if (isIp16901McMbrIdModified()) { 
        ip16901McMbrId = refreshIp16901McMbrId();
     }
   		return ip16901McMbrId;
   }

  
	/**
	*  set variable ip16901McMbrId
	*  Corresponding COBOL Variable is IP16901-MC-MBR-ID
	*  @param value
	**/
   public void setIp16901McMbrId(char[] value) {
      ip16901McMbrId = checkIp16901McMbrIdConstraints(value);
      serializeIp16901McMbrId(ip16901McMbrId);
   } 

     /**
	 * 	Update Ip16901McMbrId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp16901McMbrId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp16901McMbrId,ip16901McMbrId.length);
   	
   }
   
   public void setIp16901McMbrId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp16901McMbrId,ip16901McMbrId.length);
   	
   }
   
     /**
	 * 	Update Ip16901McMbrId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp16901McMbrId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp16901McMbrId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip16901McMbrId with another Field
	 *	@param value
	 */
   public void setIp16901McMbrId(Field source) {
       replace(source,0,source.length(),beginIp16901McMbrId,IP_16901_MC_MBR_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip16901McMbrId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp16901McMbrId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp16901McMbrId,IP_16901_MC_MBR_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip16901McMbrId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp16901McMbrId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp16901McMbrId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip16901McPercent
	 *	@return ip16901McPercent
	 */
	public int getIp16901McPercent() throws CFException {
       if (isIp16901McPercentModified()) { 
           ip16901McPercent = refreshIp16901McPercent();
        }
   		return ip16901McPercent;
	}
	

	
	   
	/**
	 * 	Update Ip16901McPercent with the passed value
	 *  Corresponding COBOL Variable is IP16901-MC-PERCENT
	 *	@param number
	 */
	public void setIp16901McPercent(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip16901McPercent = checkIp16901McPercentMaxLimit(number); 
		serializeIp16901McPercent(ip16901McPercent);
	}
	

	public void setIp16901McPercent(long number) {
	    number = checkIp16901McPercentMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp16901McPercent((int)number);
	}
	
	/**
	 * 	Update Ip16901McPercent with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp16901McPercent(char[] value) throws CFException {
		 ip16901McPercent = serializeIp16901McPercent(value);
	}
	/**
	 * 	Update Ip16901McPercent with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp16901McPercentString(char[] value) throws CFException {
		 setIp16901McPercent(value);
	}
	/**
	 *	Returns the value of ip16901AcqMbrId
	 *	@return ip16901AcqMbrId
	 */
   public char[] getIp16901AcqMbrId() throws CFException{
     if (isIp16901AcqMbrIdModified()) { 
        ip16901AcqMbrId = refreshIp16901AcqMbrId();
     }
   		return ip16901AcqMbrId;
   }

  
	/**
	*  set variable ip16901AcqMbrId
	*  Corresponding COBOL Variable is IP16901-ACQ-MBR-ID
	*  @param value
	**/
   public void setIp16901AcqMbrId(char[] value) {
      ip16901AcqMbrId = checkIp16901AcqMbrIdConstraints(value);
      serializeIp16901AcqMbrId(ip16901AcqMbrId);
   } 

     /**
	 * 	Update Ip16901AcqMbrId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp16901AcqMbrId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp16901AcqMbrId,ip16901AcqMbrId.length);
   	
   }
   
   public void setIp16901AcqMbrId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp16901AcqMbrId,ip16901AcqMbrId.length);
   	
   }
   
     /**
	 * 	Update Ip16901AcqMbrId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp16901AcqMbrId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp16901AcqMbrId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip16901AcqMbrId with another Field
	 *	@param value
	 */
   public void setIp16901AcqMbrId(Field source) {
       replace(source,0,source.length(),beginIp16901AcqMbrId,IP_16901_ACQ_MBR_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip16901AcqMbrId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp16901AcqMbrId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp16901AcqMbrId,IP_16901_ACQ_MBR_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip16901AcqMbrId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp16901AcqMbrId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp16901AcqMbrId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip16901AcqPercent
	 *	@return ip16901AcqPercent
	 */
	public int getIp16901AcqPercent() throws CFException {
       if (isIp16901AcqPercentModified()) { 
           ip16901AcqPercent = refreshIp16901AcqPercent();
        }
   		return ip16901AcqPercent;
	}
	

	
	   
	/**
	 * 	Update Ip16901AcqPercent with the passed value
	 *  Corresponding COBOL Variable is IP16901-ACQ-PERCENT
	 *	@param number
	 */
	public void setIp16901AcqPercent(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip16901AcqPercent = checkIp16901AcqPercentMaxLimit(number); 
		serializeIp16901AcqPercent(ip16901AcqPercent);
	}
	

	public void setIp16901AcqPercent(long number) {
	    number = checkIp16901AcqPercentMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp16901AcqPercent((int)number);
	}
	
	/**
	 * 	Update Ip16901AcqPercent with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp16901AcqPercent(char[] value) throws CFException {
		 ip16901AcqPercent = serializeIp16901AcqPercent(value);
	}
	/**
	 * 	Update Ip16901AcqPercent with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp16901AcqPercentString(char[] value) throws CFException {
		 setIp16901AcqPercent(value);
	}
	/**
	 *	Returns the value of ip16901IssMbrId
	 *	@return ip16901IssMbrId
	 */
   public char[] getIp16901IssMbrId() throws CFException{
     if (isIp16901IssMbrIdModified()) { 
        ip16901IssMbrId = refreshIp16901IssMbrId();
     }
   		return ip16901IssMbrId;
   }

  
	/**
	*  set variable ip16901IssMbrId
	*  Corresponding COBOL Variable is IP16901-ISS-MBR-ID
	*  @param value
	**/
   public void setIp16901IssMbrId(char[] value) {
      ip16901IssMbrId = checkIp16901IssMbrIdConstraints(value);
      serializeIp16901IssMbrId(ip16901IssMbrId);
   } 

     /**
	 * 	Update Ip16901IssMbrId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp16901IssMbrId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp16901IssMbrId,ip16901IssMbrId.length);
   	
   }
   
   public void setIp16901IssMbrId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp16901IssMbrId,ip16901IssMbrId.length);
   	
   }
   
     /**
	 * 	Update Ip16901IssMbrId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp16901IssMbrId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp16901IssMbrId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip16901IssMbrId with another Field
	 *	@param value
	 */
   public void setIp16901IssMbrId(Field source) {
       replace(source,0,source.length(),beginIp16901IssMbrId,IP_16901_ISS_MBR_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip16901IssMbrId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp16901IssMbrId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp16901IssMbrId,IP_16901_ISS_MBR_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip16901IssMbrId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp16901IssMbrId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp16901IssMbrId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip16901IssPercent
	 *	@return ip16901IssPercent
	 */
	public int getIp16901IssPercent() throws CFException {
       if (isIp16901IssPercentModified()) { 
           ip16901IssPercent = refreshIp16901IssPercent();
        }
   		return ip16901IssPercent;
	}
	

	
	   
	/**
	 * 	Update Ip16901IssPercent with the passed value
	 *  Corresponding COBOL Variable is IP16901-ISS-PERCENT
	 *	@param number
	 */
	public void setIp16901IssPercent(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip16901IssPercent = checkIp16901IssPercentMaxLimit(number); 
		serializeIp16901IssPercent(ip16901IssPercent);
	}
	

	public void setIp16901IssPercent(long number) {
	    number = checkIp16901IssPercentMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp16901IssPercent((int)number);
	}
	
	/**
	 * 	Update Ip16901IssPercent with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp16901IssPercent(char[] value) throws CFException {
		 ip16901IssPercent = serializeIp16901IssPercent(value);
	}
	/**
	 * 	Update Ip16901IssPercent with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp16901IssPercentString(char[] value) throws CFException {
		 setIp16901IssPercent(value);
	}
	/**
	 *	Returns the value of ip16901CabCode
	 *	@return ip16901CabCode
	 */
   public char[] getIp16901CabCode() throws CFException{
     if (isIp16901CabCodeModified()) { 
        ip16901CabCode = refreshIp16901CabCode();
     }
   		return ip16901CabCode;
   }

  
	/**
	*  set variable ip16901CabCode
	*  Corresponding COBOL Variable is IP16901-CAB-CODE
	*  @param value
	**/
   public void setIp16901CabCode(char[] value) {
      ip16901CabCode = checkIp16901CabCodeConstraints(value);
      serializeIp16901CabCode(ip16901CabCode);
   } 

     /**
	 * 	Update Ip16901CabCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp16901CabCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp16901CabCode,ip16901CabCode.length);
   	
   }
   
   public void setIp16901CabCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp16901CabCode,ip16901CabCode.length);
   	
   }
   
     /**
	 * 	Update Ip16901CabCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp16901CabCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp16901CabCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip16901CabCode with another Field
	 *	@param value
	 */
   public void setIp16901CabCode(Field source) {
       replace(source,0,source.length(),beginIp16901CabCode,IP_16901_CAB_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip16901CabCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp16901CabCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp16901CabCode,IP_16901_CAB_CODE_LEN);
   	
   }
   
     /**
	 * 	Update Ip16901CabCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp16901CabCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp16901CabCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip16901MrchntPaymtPct
	 *	@return ip16901MrchntPaymtPct
	 */
	public int getIp16901MrchntPaymtPct() throws CFException {
       if (isIp16901MrchntPaymtPctModified()) { 
           ip16901MrchntPaymtPct = refreshIp16901MrchntPaymtPct();
        }
   		return ip16901MrchntPaymtPct;
	}
	

	
	   
	/**
	 * 	Update Ip16901MrchntPaymtPct with the passed value
	 *  Corresponding COBOL Variable is IP16901-MRCHNT-PAYMT-PCT
	 *	@param number
	 */
	public void setIp16901MrchntPaymtPct(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip16901MrchntPaymtPct = checkIp16901MrchntPaymtPctMaxLimit(number); 
		serializeIp16901MrchntPaymtPct(ip16901MrchntPaymtPct);
	}
	

	public void setIp16901MrchntPaymtPct(long number) {
	    number = checkIp16901MrchntPaymtPctMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp16901MrchntPaymtPct((int)number);
	}
	
	/**
	 * 	Update Ip16901MrchntPaymtPct with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp16901MrchntPaymtPct(char[] value) throws CFException {
		 ip16901MrchntPaymtPct = serializeIp16901MrchntPaymtPct(value);
	}
	/**
	 * 	Update Ip16901MrchntPaymtPct with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp16901MrchntPaymtPctString(char[] value) throws CFException {
		 setIp16901MrchntPaymtPct(value);
	}
	/**
	 *	Returns the value of ip16901ReconMthdCd
	 *	@return ip16901ReconMthdCd
	 */
   public char[] getIp16901ReconMthdCd() throws CFException{
     if (isIp16901ReconMthdCdModified()) { 
        ip16901ReconMthdCd = refreshIp16901ReconMthdCd();
     }
   		return ip16901ReconMthdCd;
   }

  
	/**
	*  set variable ip16901ReconMthdCd
	*  Corresponding COBOL Variable is IP16901-RECON-MTHD-CD
	*  @param value
	**/
   public void setIp16901ReconMthdCd(char[] value) {
      ip16901ReconMthdCd = checkIp16901ReconMthdCdConstraints(value);
      serializeIp16901ReconMthdCd(ip16901ReconMthdCd);
   } 

     /**
	 * 	Update Ip16901ReconMthdCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp16901ReconMthdCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp16901ReconMthdCd,ip16901ReconMthdCd.length);
   	
   }
   
   public void setIp16901ReconMthdCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp16901ReconMthdCd,ip16901ReconMthdCd.length);
   	
   }
   
     /**
	 * 	Update Ip16901ReconMthdCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp16901ReconMthdCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp16901ReconMthdCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip16901ReconMthdCd with another Field
	 *	@param value
	 */
   public void setIp16901ReconMthdCd(Field source) {
       replace(source,0,source.length(),beginIp16901ReconMthdCd,IP_16901_RECON_MTHD_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip16901ReconMthdCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp16901ReconMthdCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp16901ReconMthdCd,IP_16901_RECON_MTHD_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip16901ReconMthdCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp16901ReconMthdCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp16901ReconMthdCd+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip16901RewardParms
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp16901ProgramId(CONSTANTS.SPACE_11);
         setIp16901ProgramEffDate(CONSTANTS.SPACE_10);
         setIp16901ProgramDesc(CONSTANTS.SPACE_50);
         setIp16901ProgramType(CONSTANTS.SPACE_3);
         setIp16901McMbrId(CONSTANTS.SPACE_11);
                     setIp16901McPercent(0);
         setIp16901AcqMbrId(CONSTANTS.SPACE_11);
                     setIp16901AcqPercent(0);
         setIp16901IssMbrId(CONSTANTS.SPACE_11);
                     setIp16901IssPercent(0);
         setIp16901CabCode(CONSTANTS.SPACE_5);
                     setIp16901MrchntPaymtPct(0);
         setIp16901ReconMthdCd(CONSTANTS.SPACE);
   }

		public static int getIp16901RewardParmsFieldLength() {
			return IP_16901_REWARD_PARMS_LENGTH;
		}

}
  

package com.cloudframe.app.ar640010.dto;

/**
*  The class McinfoParms is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class McinfoParms extends McinfoParmsSerialized {
   

						private char[] mcinfoCopybookDate = new char[10];

						private char[] mcinfoDdName = new char[8];

						private char[] mcinfoJobName = new char[8];

						private char[] mcinfoProcStep = new char[8];

						private char[] mcinfoStepName = new char[8];

						private char[] mcinfoJobNumber = new char[8];

						private char[] mcinfoUserId = new char[8];

						private char[] mcinfoCpuId = new char[8];
	
	/**
	* Constructor for McinfoParms
	**/
    public McinfoParms() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setMcinfoCopybookDate(("2004-05-31").toCharArray());
								setMcinfoDdName(fillSpace(8));
								setMcinfoJobName(fillSpace(8));
								setMcinfoProcStep(fillSpace(8));
								setMcinfoStepName(fillSpace(8));
								setMcinfoJobNumber(fillSpace(8));
								setMcinfoUserId(fillSpace(8));
								setMcinfoCpuId(fillSpace(8));
    }


 

	/**
	 *	Returns the value of mcinfoCopybookDate
	 *	@return mcinfoCopybookDate
	 */
   public char[] getMcinfoCopybookDate() throws CFException{
     if (isMcinfoCopybookDateModified()) { 
        mcinfoCopybookDate = refreshMcinfoCopybookDate();
     }
   		return mcinfoCopybookDate;
   }

  
	/**
	*  set variable mcinfoCopybookDate
	*  Corresponding COBOL Variable is MCINFO-COPYBOOK-DATE
	*  @param value
	**/
   public void setMcinfoCopybookDate(char[] value) {
      mcinfoCopybookDate = checkMcinfoCopybookDateConstraints(value);
      serializeMcinfoCopybookDate(mcinfoCopybookDate);
   } 

     /**
	 * 	Update McinfoCopybookDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMcinfoCopybookDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMcinfoCopybookDate,mcinfoCopybookDate.length);
   	
   }
   
   public void setMcinfoCopybookDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMcinfoCopybookDate,mcinfoCopybookDate.length);
   	
   }
   
     /**
	 * 	Update McinfoCopybookDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMcinfoCopybookDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMcinfoCopybookDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update McinfoCopybookDate with another Field
	 *	@param value
	 */
   public void setMcinfoCopybookDate(Field source) {
       replace(source,0,source.length(),beginMcinfoCopybookDate,MCINFO_COPYBOOK_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update McinfoCopybookDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMcinfoCopybookDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMcinfoCopybookDate,MCINFO_COPYBOOK_DATE_LEN);
   	
   }
   
     /**
	 * 	Update McinfoCopybookDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMcinfoCopybookDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMcinfoCopybookDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mcinfoDdName
	 *	@return mcinfoDdName
	 */
   public char[] getMcinfoDdName() throws CFException{
     if (isMcinfoDdNameModified()) { 
        mcinfoDdName = refreshMcinfoDdName();
     }
   		return mcinfoDdName;
   }

  
	/**
	*  set variable mcinfoDdName
	*  Corresponding COBOL Variable is MCINFO-DD-NAME
	*  @param value
	**/
   public void setMcinfoDdName(char[] value) {
      mcinfoDdName = checkMcinfoDdNameConstraints(value);
      serializeMcinfoDdName(mcinfoDdName);
   } 

     /**
	 * 	Update McinfoDdName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMcinfoDdName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMcinfoDdName,mcinfoDdName.length);
   	
   }
   
   public void setMcinfoDdName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMcinfoDdName,mcinfoDdName.length);
   	
   }
   
     /**
	 * 	Update McinfoDdName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMcinfoDdName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMcinfoDdName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update McinfoDdName with another Field
	 *	@param value
	 */
   public void setMcinfoDdName(Field source) {
       replace(source,0,source.length(),beginMcinfoDdName,MCINFO_DD_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update McinfoDdName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMcinfoDdName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMcinfoDdName,MCINFO_DD_NAME_LEN);
   	
   }
   
     /**
	 * 	Update McinfoDdName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMcinfoDdName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMcinfoDdName+targetIndex,targetLen);
    
   }
	char[] mcinfoNoMoreDdNames8888Value = "<LASTDDN".toCharArray();
	/**
	 *	Test condition "<LASTDDN" for isMcinfoNoMoreDdNames88()
	 *	@return  Returns true if isMcinfoNoMoreDdNames88() is "<LASTDDN"
	 */
   public boolean isMcinfoNoMoreDdNames88() throws CFException {
      return (  compareChars( getMcinfoDdName() , mcinfoNoMoreDdNames8888Value)  == 0  );
   }


	/**
	*  set values "<LASTDDN"
	*/
   	public void setMcinfoNoMoreDdNames88True() {  			
    	setMcinfoDdName( mcinfoNoMoreDdNames8888Value);
   	}
	char[] mcinfoRestartDdNames8888Value = ">RESTART".toCharArray();
	/**
	 *	Test condition ">RESTART" for isMcinfoRestartDdNames88()
	 *	@return  Returns true if isMcinfoRestartDdNames88() is ">RESTART"
	 */
   public boolean isMcinfoRestartDdNames88() throws CFException {
      return (  compareChars( getMcinfoDdName() , mcinfoRestartDdNames8888Value)  == 0  );
   }


	/**
	*  set values ">RESTART"
	*/
   	public void setMcinfoRestartDdNames88True() {  			
    	setMcinfoDdName( mcinfoRestartDdNames8888Value);
   	}
	/**
	 *	Returns the value of mcinfoJobName
	 *	@return mcinfoJobName
	 */
   public char[] getMcinfoJobName() throws CFException{
     if (isMcinfoJobNameModified()) { 
        mcinfoJobName = refreshMcinfoJobName();
     }
   		return mcinfoJobName;
   }

  
	/**
	*  set variable mcinfoJobName
	*  Corresponding COBOL Variable is MCINFO-JOB-NAME
	*  @param value
	**/
   public void setMcinfoJobName(char[] value) {
      mcinfoJobName = checkMcinfoJobNameConstraints(value);
      serializeMcinfoJobName(mcinfoJobName);
   } 

     /**
	 * 	Update McinfoJobName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMcinfoJobName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMcinfoJobName,mcinfoJobName.length);
   	
   }
   
   public void setMcinfoJobName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMcinfoJobName,mcinfoJobName.length);
   	
   }
   
     /**
	 * 	Update McinfoJobName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMcinfoJobName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMcinfoJobName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update McinfoJobName with another Field
	 *	@param value
	 */
   public void setMcinfoJobName(Field source) {
       replace(source,0,source.length(),beginMcinfoJobName,MCINFO_JOB_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update McinfoJobName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMcinfoJobName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMcinfoJobName,MCINFO_JOB_NAME_LEN);
   	
   }
   
     /**
	 * 	Update McinfoJobName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMcinfoJobName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMcinfoJobName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mcinfoProcStep
	 *	@return mcinfoProcStep
	 */
   public char[] getMcinfoProcStep() throws CFException{
     if (isMcinfoProcStepModified()) { 
        mcinfoProcStep = refreshMcinfoProcStep();
     }
   		return mcinfoProcStep;
   }

  
	/**
	*  set variable mcinfoProcStep
	*  Corresponding COBOL Variable is MCINFO-PROC-STEP
	*  @param value
	**/
   public void setMcinfoProcStep(char[] value) {
      mcinfoProcStep = checkMcinfoProcStepConstraints(value);
      serializeMcinfoProcStep(mcinfoProcStep);
   } 

     /**
	 * 	Update McinfoProcStep 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMcinfoProcStep(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMcinfoProcStep,mcinfoProcStep.length);
   	
   }
   
   public void setMcinfoProcStep(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMcinfoProcStep,mcinfoProcStep.length);
   	
   }
   
     /**
	 * 	Update McinfoProcStep 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMcinfoProcStep(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMcinfoProcStep+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update McinfoProcStep with another Field
	 *	@param value
	 */
   public void setMcinfoProcStep(Field source) {
       replace(source,0,source.length(),beginMcinfoProcStep,MCINFO_PROC_STEP_LEN);
   	
   }  
   
     /**
	 * 	Update McinfoProcStep 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMcinfoProcStep(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMcinfoProcStep,MCINFO_PROC_STEP_LEN);
   	
   }
   
     /**
	 * 	Update McinfoProcStep 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMcinfoProcStep(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMcinfoProcStep+targetIndex,targetLen);
    
   }
	char[] mcinfoNoProcActive8888Value = "        ".toCharArray();
	/**
	 *	Test condition " " for isMcinfoNoProcActive88()
	 *	@return  Returns true if isMcinfoNoProcActive88() is " "
	 */
   public boolean isMcinfoNoProcActive88() throws CFException {
      return (  compareChars( getMcinfoProcStep() , mcinfoNoProcActive8888Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setMcinfoNoProcActive88True() {  			
    	setMcinfoProcStep( mcinfoNoProcActive8888Value);
   	}
	/**
	 *	Returns the value of mcinfoStepName
	 *	@return mcinfoStepName
	 */
   public char[] getMcinfoStepName() throws CFException{
     if (isMcinfoStepNameModified()) { 
        mcinfoStepName = refreshMcinfoStepName();
     }
   		return mcinfoStepName;
   }

  
	/**
	*  set variable mcinfoStepName
	*  Corresponding COBOL Variable is MCINFO-STEP-NAME
	*  @param value
	**/
   public void setMcinfoStepName(char[] value) {
      mcinfoStepName = checkMcinfoStepNameConstraints(value);
      serializeMcinfoStepName(mcinfoStepName);
   } 

     /**
	 * 	Update McinfoStepName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMcinfoStepName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMcinfoStepName,mcinfoStepName.length);
   	
   }
   
   public void setMcinfoStepName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMcinfoStepName,mcinfoStepName.length);
   	
   }
   
     /**
	 * 	Update McinfoStepName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMcinfoStepName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMcinfoStepName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update McinfoStepName with another Field
	 *	@param value
	 */
   public void setMcinfoStepName(Field source) {
       replace(source,0,source.length(),beginMcinfoStepName,MCINFO_STEP_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update McinfoStepName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMcinfoStepName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMcinfoStepName,MCINFO_STEP_NAME_LEN);
   	
   }
   
     /**
	 * 	Update McinfoStepName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMcinfoStepName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMcinfoStepName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mcinfoJobNumber
	 *	@return mcinfoJobNumber
	 */
   public char[] getMcinfoJobNumber() throws CFException{
     if (isMcinfoJobNumberModified()) { 
        mcinfoJobNumber = refreshMcinfoJobNumber();
     }
   		return mcinfoJobNumber;
   }

  
	/**
	*  set variable mcinfoJobNumber
	*  Corresponding COBOL Variable is MCINFO-JOB-NUMBER
	*  @param value
	**/
   public void setMcinfoJobNumber(char[] value) {
      mcinfoJobNumber = checkMcinfoJobNumberConstraints(value);
      serializeMcinfoJobNumber(mcinfoJobNumber);
   } 

     /**
	 * 	Update McinfoJobNumber 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMcinfoJobNumber(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMcinfoJobNumber,mcinfoJobNumber.length);
   	
   }
   
   public void setMcinfoJobNumber(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMcinfoJobNumber,mcinfoJobNumber.length);
   	
   }
   
     /**
	 * 	Update McinfoJobNumber 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMcinfoJobNumber(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMcinfoJobNumber+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update McinfoJobNumber with another Field
	 *	@param value
	 */
   public void setMcinfoJobNumber(Field source) {
       replace(source,0,source.length(),beginMcinfoJobNumber,MCINFO_JOB_NUMBER_LEN);
   	
   }  
   
     /**
	 * 	Update McinfoJobNumber 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMcinfoJobNumber(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMcinfoJobNumber,MCINFO_JOB_NUMBER_LEN);
   	
   }
   
     /**
	 * 	Update McinfoJobNumber 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMcinfoJobNumber(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMcinfoJobNumber+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mcinfoUserId
	 *	@return mcinfoUserId
	 */
   public char[] getMcinfoUserId() throws CFException{
     if (isMcinfoUserIdModified()) { 
        mcinfoUserId = refreshMcinfoUserId();
     }
   		return mcinfoUserId;
   }

  
	/**
	*  set variable mcinfoUserId
	*  Corresponding COBOL Variable is MCINFO-USER-ID
	*  @param value
	**/
   public void setMcinfoUserId(char[] value) {
      mcinfoUserId = checkMcinfoUserIdConstraints(value);
      serializeMcinfoUserId(mcinfoUserId);
   } 

     /**
	 * 	Update McinfoUserId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMcinfoUserId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMcinfoUserId,mcinfoUserId.length);
   	
   }
   
   public void setMcinfoUserId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMcinfoUserId,mcinfoUserId.length);
   	
   }
   
     /**
	 * 	Update McinfoUserId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMcinfoUserId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMcinfoUserId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update McinfoUserId with another Field
	 *	@param value
	 */
   public void setMcinfoUserId(Field source) {
       replace(source,0,source.length(),beginMcinfoUserId,MCINFO_USER_ID_LEN);
   	
   }  
   
     /**
	 * 	Update McinfoUserId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMcinfoUserId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMcinfoUserId,MCINFO_USER_ID_LEN);
   	
   }
   
     /**
	 * 	Update McinfoUserId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMcinfoUserId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMcinfoUserId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mcinfoCpuId
	 *	@return mcinfoCpuId
	 */
   public char[] getMcinfoCpuId() throws CFException{
     if (isMcinfoCpuIdModified()) { 
        mcinfoCpuId = refreshMcinfoCpuId();
     }
   		return mcinfoCpuId;
   }

  
	/**
	*  set variable mcinfoCpuId
	*  Corresponding COBOL Variable is MCINFO-CPU-ID
	*  @param value
	**/
   public void setMcinfoCpuId(char[] value) {
      mcinfoCpuId = checkMcinfoCpuIdConstraints(value);
      serializeMcinfoCpuId(mcinfoCpuId);
   } 

     /**
	 * 	Update McinfoCpuId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMcinfoCpuId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMcinfoCpuId,mcinfoCpuId.length);
   	
   }
   
   public void setMcinfoCpuId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMcinfoCpuId,mcinfoCpuId.length);
   	
   }
   
     /**
	 * 	Update McinfoCpuId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMcinfoCpuId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMcinfoCpuId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update McinfoCpuId with another Field
	 *	@param value
	 */
   public void setMcinfoCpuId(Field source) {
       replace(source,0,source.length(),beginMcinfoCpuId,MCINFO_CPU_ID_LEN);
   	
   }  
   
     /**
	 * 	Update McinfoCpuId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMcinfoCpuId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMcinfoCpuId,MCINFO_CPU_ID_LEN);
   	
   }
   
     /**
	 * 	Update McinfoCpuId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMcinfoCpuId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMcinfoCpuId+targetIndex,targetLen);
    
   }

	
	
	

		public static int getMcinfoParmsFieldLength() {
			return MCINFO_PARMS_LENGTH;
		}

}
  

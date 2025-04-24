package com.cloudframe.app.ar640010.dto;

/**
*  The class StatusParms820 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:49. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class StatusParms820 extends StatusParms820Serialized { 
   

						private char[] setupValue820 = new char[1];

						private char[] oldStatCdInd820 = new char[1];

						private char[] newStatCdInd820 = new char[1];

						private char[] stsMessage820 = new char[80];
	
	/**
	* Constructor for StatusParms820
	**/
    public StatusParms820() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setSetupValue820(fillSpace(1));
								setOldStatCdInd820(fillSpace(1));
								setNewStatCdInd820(fillSpace(1));
								setStsMessage820(pad(80," ".toCharArray(),' ',RIGHT_PAD));
    }


 

	/**
	 *	Returns the value of setupValue820
	 *	@return setupValue820
	 */
   public char[] getSetupValue820() throws CFException{
     if (isSetupValue820Modified()) { 
        setupValue820 = refreshSetupValue820();
     }
   		return setupValue820;
   }

  
	/**
	*  set variable setupValue820
	*  Corresponding COBOL Variable is 820-SETUP-VALUE
	*  @param value
	**/
   public void setSetupValue820(char[] value) {
      setupValue820 = checkSetupValue820Constraints(value);
      serializeSetupValue820(setupValue820);
   } 

     /**
	 * 	Update SetupValue820 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSetupValue820(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSetupValue820,setupValue820.length);
   	
   }
   
   public void setSetupValue820(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSetupValue820,setupValue820.length);
   	
   }
   
     /**
	 * 	Update SetupValue820 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSetupValue820(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSetupValue820+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SetupValue820 with another Field
	 *	@param value
	 */
   public void setSetupValue820(Field source) {
       replace(source,0,source.length(),beginSetupValue820,SETUP_VALUE_820_LEN);
   	
   }  
   
     /**
	 * 	Update SetupValue820 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSetupValue820(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSetupValue820,SETUP_VALUE_820_LEN);
   	
   }
   
     /**
	 * 	Update SetupValue820 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSetupValue820(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSetupValue820+targetIndex,targetLen);
    
   }
	char[] setupProblem8882088Value = "E".toCharArray();
	/**
	 *	Test condition "E" for isSetupProblem88820()
	 *	@return  Returns true if isSetupProblem88820() is "E"
	 */
   public boolean isSetupProblem88820() throws CFException {
      return (  compareChars( getSetupValue820() , setupProblem8882088Value)  == 0  );
   }


	/**
	*  set values "E"
	*/
   	public void setSetupProblem88820True() {  			
    	setSetupValue820( setupProblem8882088Value);
   	}
	/**
	 *	Returns the value of oldStatCdInd820
	 *	@return oldStatCdInd820
	 */
   public char[] getOldStatCdInd820() throws CFException{
     if (isOldStatCdInd820Modified()) { 
        oldStatCdInd820 = refreshOldStatCdInd820();
     }
   		return oldStatCdInd820;
   }

  
	/**
	*  set variable oldStatCdInd820
	*  Corresponding COBOL Variable is 820-OLD-STAT-CD-IND
	*  @param value
	**/
   public void setOldStatCdInd820(char[] value) {
      oldStatCdInd820 = checkOldStatCdInd820Constraints(value);
      serializeOldStatCdInd820(oldStatCdInd820);
   } 

     /**
	 * 	Update OldStatCdInd820 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOldStatCdInd820(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOldStatCdInd820,oldStatCdInd820.length);
   	
   }
   
   public void setOldStatCdInd820(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOldStatCdInd820,oldStatCdInd820.length);
   	
   }
   
     /**
	 * 	Update OldStatCdInd820 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOldStatCdInd820(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOldStatCdInd820+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update OldStatCdInd820 with another Field
	 *	@param value
	 */
   public void setOldStatCdInd820(Field source) {
       replace(source,0,source.length(),beginOldStatCdInd820,OLD_STAT_CD_IND_820_LEN);
   	
   }  
   
     /**
	 * 	Update OldStatCdInd820 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOldStatCdInd820(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOldStatCdInd820,OLD_STAT_CD_IND_820_LEN);
   	
   }
   
     /**
	 * 	Update OldStatCdInd820 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOldStatCdInd820(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOldStatCdInd820+targetIndex,targetLen);
    
   }
	char[] oldErrStatCd8882088Value = "E".toCharArray();
	/**
	 *	Test condition "E" for isOldErrStatCd88820()
	 *	@return  Returns true if isOldErrStatCd88820() is "E"
	 */
   public boolean isOldErrStatCd88820() throws CFException {
      return (  compareChars( getOldStatCdInd820() , oldErrStatCd8882088Value)  == 0  );
   }


	/**
	*  set values "E"
	*/
   	public void setOldErrStatCd88820True() {  			
    	setOldStatCdInd820( oldErrStatCd8882088Value);
   	}
	/**
	 *	Returns the value of newStatCdInd820
	 *	@return newStatCdInd820
	 */
   public char[] getNewStatCdInd820() throws CFException{
     if (isNewStatCdInd820Modified()) { 
        newStatCdInd820 = refreshNewStatCdInd820();
     }
   		return newStatCdInd820;
   }

  
	/**
	*  set variable newStatCdInd820
	*  Corresponding COBOL Variable is 820-NEW-STAT-CD-IND
	*  @param value
	**/
   public void setNewStatCdInd820(char[] value) {
      newStatCdInd820 = checkNewStatCdInd820Constraints(value);
      serializeNewStatCdInd820(newStatCdInd820);
   } 

     /**
	 * 	Update NewStatCdInd820 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setNewStatCdInd820(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginNewStatCdInd820,newStatCdInd820.length);
   	
   }
   
   public void setNewStatCdInd820(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginNewStatCdInd820,newStatCdInd820.length);
   	
   }
   
     /**
	 * 	Update NewStatCdInd820 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setNewStatCdInd820(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNewStatCdInd820+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update NewStatCdInd820 with another Field
	 *	@param value
	 */
   public void setNewStatCdInd820(Field source) {
       replace(source,0,source.length(),beginNewStatCdInd820,NEW_STAT_CD_IND_820_LEN);
   	
   }  
   
     /**
	 * 	Update NewStatCdInd820 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setNewStatCdInd820(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginNewStatCdInd820,NEW_STAT_CD_IND_820_LEN);
   	
   }
   
     /**
	 * 	Update NewStatCdInd820 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setNewStatCdInd820(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNewStatCdInd820+targetIndex,targetLen);
    
   }
	char[] newErrStatCd8882088Value = "E".toCharArray();
	/**
	 *	Test condition "E" for isNewErrStatCd88820()
	 *	@return  Returns true if isNewErrStatCd88820() is "E"
	 */
   public boolean isNewErrStatCd88820() throws CFException {
      return (  compareChars( getNewStatCdInd820() , newErrStatCd8882088Value)  == 0  );
   }


	/**
	*  set values "E"
	*/
   	public void setNewErrStatCd88820True() {  			
    	setNewStatCdInd820( newErrStatCd8882088Value);
   	}
	/**
	 *	Returns the value of stsMessage820
	 *	@return stsMessage820
	 */
   public char[] getStsMessage820() throws CFException{
     if (isStsMessage820Modified()) { 
        stsMessage820 = refreshStsMessage820();
     }
   		return stsMessage820;
   }

  
	/**
	*  set variable stsMessage820
	*  Corresponding COBOL Variable is 820-STS-MESSAGE
	*  @param value
	**/
   public void setStsMessage820(char[] value) {
      stsMessage820 = checkStsMessage820Constraints(value);
      serializeStsMessage820(stsMessage820);
   } 

     /**
	 * 	Update StsMessage820 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setStsMessage820(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginStsMessage820,stsMessage820.length);
   	
   }
   
   public void setStsMessage820(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginStsMessage820,stsMessage820.length);
   	
   }
   
     /**
	 * 	Update StsMessage820 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStsMessage820(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStsMessage820+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update StsMessage820 with another Field
	 *	@param value
	 */
   public void setStsMessage820(Field source) {
       replace(source,0,source.length(),beginStsMessage820,STS_MESSAGE_820_LEN);
   	
   }  
   
     /**
	 * 	Update StsMessage820 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setStsMessage820(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginStsMessage820,STS_MESSAGE_820_LEN);
   	
   }
   
     /**
	 * 	Update StsMessage820 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStsMessage820(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStsMessage820+targetIndex,targetLen);
    
   }
	char[] stsMsgNtReq8882088Value = "FILE NOT INSERTED. STATUS DESC NOT APPLICABLE                                   ".toCharArray();
	/**
	 *	Test condition "FILE NOT INSERTED. STATUS DESC NOT APPLICABLE" for isStsMsgNtReq88820()
	 *	@return  Returns true if isStsMsgNtReq88820() is "FILE NOT INSERTED. STATUS DESC NOT APPLICABLE"
	 */
   public boolean isStsMsgNtReq88820() throws CFException {
      return (  compareChars( getStsMessage820() , stsMsgNtReq8882088Value)  == 0  );
   }


	/**
	*  set values "FILE NOT INSERTED. STATUS DESC NOT APPLICABLE"
	*/
   	public void setStsMsgNtReq88820True() {  			
    	setStsMessage820( stsMsgNtReq8882088Value);
   	}
	char[] stsMsgNtAvail8882088Value = "STATUS DESCRIPTION NOT AVAILABLE FOR REF_ID:                                    ".toCharArray();
	/**
	 *	Test condition "STATUS DESCRIPTION NOT AVAILABLE FOR REF_ID: " for isStsMsgNtAvail88820()
	 *	@return  Returns true if isStsMsgNtAvail88820() is "STATUS DESCRIPTION NOT AVAILABLE FOR REF_ID: "
	 */
   public boolean isStsMsgNtAvail88820() throws CFException {
      return (  compareChars( getStsMessage820() , stsMsgNtAvail8882088Value)  == 0  );
   }


	/**
	*  set values "STATUS DESCRIPTION NOT AVAILABLE FOR REF_ID: "
	*/
   	public void setStsMsgNtAvail88820True() {  			
    	setStsMessage820( stsMsgNtAvail8882088Value);
   	}

	
	
	
	/**
	 * 	initializes StatusParms820
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setSetupValue820(CONSTANTS.SPACE);
         setOldStatCdInd820(CONSTANTS.SPACE);
         setNewStatCdInd820(CONSTANTS.SPACE);
         setStsMessage820(CONSTANTS.SPACE_80);
   }

		public static int getStatusParms820FieldLength() {
			return STATUS_PARMS_820_LENGTH;
		}

}
  

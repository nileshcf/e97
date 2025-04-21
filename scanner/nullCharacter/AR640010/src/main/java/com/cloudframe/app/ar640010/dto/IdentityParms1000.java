package com.cloudframe.app.ar640010.dto;

/**
*  The class IdentityParms1000 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class IdentityParms1000 extends IdentityParms1000Serialized {
   

						private char[] programId1000 = new char[8];
				private VersionId1000 versionId1000 = new VersionId1000();
				private ExecutionOptions1000 executionOptions1000 = new ExecutionOptions1000();
	
	/**
	* Constructor for IdentityParms1000
	**/
    public IdentityParms1000() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			versionId1000.setParent(this,getStartOffset() + 8);
	       			executionOptions1000.setParent(this,getStartOffset() + 20);
	   	/*  end of offset */
								setProgramId1000(("AR640010").toCharArray());
    }


 

	/**
	 *	Returns the value of programId1000
	 *	@return programId1000
	 */
   public char[] getProgramId1000() throws CFException{
     if (isProgramId1000Modified()) { 
        programId1000 = refreshProgramId1000();
     }
   		return programId1000;
   }

  
	/**
	*  set variable programId1000
	*  Corresponding COBOL Variable is 1000-PROGRAM-ID
	*  @param value
	**/
   public void setProgramId1000(char[] value) {
      programId1000 = checkProgramId1000Constraints(value);
      serializeProgramId1000(programId1000);
   } 

     /**
	 * 	Update ProgramId1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setProgramId1000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginProgramId1000,programId1000.length);
   	
   }
   
   public void setProgramId1000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginProgramId1000,programId1000.length);
   	
   }
   
     /**
	 * 	Update ProgramId1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setProgramId1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginProgramId1000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ProgramId1000 with another Field
	 *	@param value
	 */
   public void setProgramId1000(Field source) {
       replace(source,0,source.length(),beginProgramId1000,PROGRAM_ID_1000_LEN);
   	
   }  
   
     /**
	 * 	Update ProgramId1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setProgramId1000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginProgramId1000,PROGRAM_ID_1000_LEN);
   	
   }
   
     /**
	 * 	Update ProgramId1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setProgramId1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginProgramId1000+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of versionId1000
	 *	@return versionId1000
	 */   
	 public VersionId1000 getVersionId1000() {
   	return versionId1000;
   }
   /**
	* 	Update VersionId1000 with the passed value
	*   Corresponding COBOL Variable is 1000-VERSION-ID
	*	@param value
	*/
   public void setVersionId1000(char[] value) {
      versionId1000.setString(value); 
   }   
    
     /**
	 * 	Update VersionId1000 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setVersionId1000(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,versionId1000.begin,versionId1000.length());
   }
   
     /**
	 * 	Update VersionId1000 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVersionId1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,versionId1000.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update VersionId1000 with another Field
	 *	@param value
	 */
   public void setVersionId1000(Field source) {
   	replace(source,0,source.length(),versionId1000.begin,versionId1000.length());
   }  
   
     /**
	 * 	Update VersionId1000 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setVersionId1000(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,versionId1000.begin,versionId1000.length());
   }
   
     /**
	 * 	Update VersionId1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVersionId1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,versionId1000.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of executionOptions1000
	 *	@return executionOptions1000
	 */   
	 public ExecutionOptions1000 getExecutionOptions1000() {
   	return executionOptions1000;
   }
   /**
	* 	Update ExecutionOptions1000 with the passed value
	*   Corresponding COBOL Variable is 1000-EXECUTION-OPTIONS
	*	@param value
	*/
   public void setExecutionOptions1000(char[] value) {
      executionOptions1000.setString(value); 
   }   
    
     /**
	 * 	Update ExecutionOptions1000 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setExecutionOptions1000(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,executionOptions1000.begin,executionOptions1000.length());
   }
   
     /**
	 * 	Update ExecutionOptions1000 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExecutionOptions1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,executionOptions1000.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ExecutionOptions1000 with another Field
	 *	@param value
	 */
   public void setExecutionOptions1000(Field source) {
   	replace(source,0,source.length(),executionOptions1000.begin,executionOptions1000.length());
   }  
   
     /**
	 * 	Update ExecutionOptions1000 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setExecutionOptions1000(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,executionOptions1000.begin,executionOptions1000.length());
   }
   
     /**
	 * 	Update ExecutionOptions1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExecutionOptions1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,executionOptions1000.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getIdentityParms1000FieldLength() {
			return IDENTITY_PARMS_1000_LENGTH;
		}

}
  

package com.cloudframe.app.db2func.dto;

/**
*  The class MsdSpecialistAcctNo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/


import com.cloudframe.app.db2func.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MsdSpecialistAcctNo extends MsdSpecialistAcctNoSerialized { 
   

						private char[] msdSpecBranch = Field.fillLowValue(3);

						private char[] msdSpecAcct = Field.fillLowValue(5);

						private char[] msdSpecAcctType = Field.fillLowValue(1);
	
	/**
	* Constructor for MsdSpecialistAcctNo
	**/
    public MsdSpecialistAcctNo() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MsdSpecialistAcctNo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdSpecialistAcctNo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of msdSpecBranch
	 *	@return msdSpecBranch
	 */
   public char[] getMsdSpecBranch() throws CFException{
     if (isMsdSpecBranchModified()) { 
        msdSpecBranch = refreshMsdSpecBranch();
     }
   		return msdSpecBranch;
   }

  
	/**
	*  set variable msdSpecBranch
	*  Corresponding COBOL Variable is MSD-SPEC-BRANCH
	*  @param value
	**/
   public void setMsdSpecBranch(char[] value) {
      msdSpecBranch = checkMsdSpecBranchConstraints(value);
      serializeMsdSpecBranch(msdSpecBranch);
   } 

     /**
	 * 	Update MsdSpecBranch 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdSpecBranch(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdSpecBranch,msdSpecBranch.length);
   	
   }
   
   public void setMsdSpecBranch(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSpecBranch,msdSpecBranch.length);
   	
   }
   
     /**
	 * 	Update MsdSpecBranch 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdSpecBranch(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSpecBranch+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdSpecBranch with another Field
	 *	@param value
	 */
   public void setMsdSpecBranch(Field source) {
       replace(source,0,source.length(),beginMsdSpecBranch,MSD_SPEC_BRANCH_LEN);
   	
   }  
   
     /**
	 * 	Update MsdSpecBranch 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdSpecBranch(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdSpecBranch,MSD_SPEC_BRANCH_LEN);
   	
   }
   
     /**
	 * 	Update MsdSpecBranch 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdSpecBranch(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSpecBranch+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdSpecAcct
	 *	@return msdSpecAcct
	 */
   public char[] getMsdSpecAcct() throws CFException{
     if (isMsdSpecAcctModified()) { 
        msdSpecAcct = refreshMsdSpecAcct();
     }
   		return msdSpecAcct;
   }

  
	/**
	*  set variable msdSpecAcct
	*  Corresponding COBOL Variable is MSD-SPEC-ACCT
	*  @param value
	**/
   public void setMsdSpecAcct(char[] value) {
      msdSpecAcct = checkMsdSpecAcctConstraints(value);
      serializeMsdSpecAcct(msdSpecAcct);
   } 

     /**
	 * 	Update MsdSpecAcct 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdSpecAcct(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdSpecAcct,msdSpecAcct.length);
   	
   }
   
   public void setMsdSpecAcct(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSpecAcct,msdSpecAcct.length);
   	
   }
   
     /**
	 * 	Update MsdSpecAcct 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdSpecAcct(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSpecAcct+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdSpecAcct with another Field
	 *	@param value
	 */
   public void setMsdSpecAcct(Field source) {
       replace(source,0,source.length(),beginMsdSpecAcct,MSD_SPEC_ACCT_LEN);
   	
   }  
   
     /**
	 * 	Update MsdSpecAcct 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdSpecAcct(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdSpecAcct,MSD_SPEC_ACCT_LEN);
   	
   }
   
     /**
	 * 	Update MsdSpecAcct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdSpecAcct(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSpecAcct+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdSpecAcctType
	 *	@return msdSpecAcctType
	 */
   public char[] getMsdSpecAcctType() throws CFException{
     if (isMsdSpecAcctTypeModified()) { 
        msdSpecAcctType = refreshMsdSpecAcctType();
     }
   		return msdSpecAcctType;
   }

  
	/**
	*  set variable msdSpecAcctType
	*  Corresponding COBOL Variable is MSD-SPEC-ACCT-TYPE
	*  @param value
	**/
   public void setMsdSpecAcctType(char[] value) {
      msdSpecAcctType = checkMsdSpecAcctTypeConstraints(value);
      serializeMsdSpecAcctType(msdSpecAcctType);
   } 

     /**
	 * 	Update MsdSpecAcctType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdSpecAcctType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdSpecAcctType,msdSpecAcctType.length);
   	
   }
   
   public void setMsdSpecAcctType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSpecAcctType,msdSpecAcctType.length);
   	
   }
   
     /**
	 * 	Update MsdSpecAcctType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdSpecAcctType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSpecAcctType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdSpecAcctType with another Field
	 *	@param value
	 */
   public void setMsdSpecAcctType(Field source) {
       replace(source,0,source.length(),beginMsdSpecAcctType,MSD_SPEC_ACCT_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update MsdSpecAcctType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdSpecAcctType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdSpecAcctType,MSD_SPEC_ACCT_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update MsdSpecAcctType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdSpecAcctType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdSpecAcctType+targetIndex,targetLen);
    
   }

	
	
	

		public static int getMsdSpecialistAcctNoFieldLength() {
			return MSD_SPECIALIST_ACCT_NO_LENGTH;
		}

}
  

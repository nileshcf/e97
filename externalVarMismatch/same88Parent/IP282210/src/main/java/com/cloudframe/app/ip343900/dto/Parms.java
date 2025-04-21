package com.cloudframe.app.ip343900.dto;

/**
*  The class Parms is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:05. using version 5.0.0.256
**/


import com.cloudframe.app.ip343900.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Parms extends ParmsSerialized {
   

								private short parmLength800;

						private char[] parmJobgroup800 = Field.fillLowValue(6);

								private int parmJobgrpNum800;


								private int commitCnt800;


						private char[] cloneOwnerId800 = Field.fillLowValue(3);
	
	/**
	* Constructor for Parms
	**/
    public Parms() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of parmLength800
	 *	@return parmLength800
	 */
	public short getParmLength800() throws CFException {
        if (isParmLength800Modified()) { 
           parmLength800 = refreshParmLength800();
        }
   		return parmLength800;
	}
	
	/**
	 * 	Update ParmLength800 with the passed value
	 *  Corresponding COBOL Variable is 800-PARM-LENGTH
	 *	@param number
	 */
	public void setParmLength800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    parmLength800 = checkParmLength800MaxLimit(number); 
		serializeParmLength800(parmLength800);
	}

	public void setParmLength800(int number) {
	    number = checkParmLength800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setParmLength800((short)number);
	}
	public void setParmLength800(long number) {
	    number = checkParmLength800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setParmLength800((short)number);
	}
	

	/**
	 *	Returns the value of parmJobgroup800
	 *	@return parmJobgroup800
	 */
   public char[] getParmJobgroup800() throws CFException{
     if (isParmJobgroup800Modified()) { 
        parmJobgroup800 = refreshParmJobgroup800();
     }
   		return parmJobgroup800;
   }

  
	/**
	*  set variable parmJobgroup800
	*  Corresponding COBOL Variable is 800-PARM-JOBGROUP
	*  @param value
	**/
   public void setParmJobgroup800(char[] value) {
      parmJobgroup800 = checkParmJobgroup800Constraints(value);
      serializeParmJobgroup800(parmJobgroup800);
   } 

     /**
	 * 	Update ParmJobgroup800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setParmJobgroup800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginParmJobgroup800,parmJobgroup800.length);
   	
   }
   
   public void setParmJobgroup800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginParmJobgroup800,parmJobgroup800.length);
   	
   }
   
     /**
	 * 	Update ParmJobgroup800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParmJobgroup800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParmJobgroup800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ParmJobgroup800 with another Field
	 *	@param value
	 */
   public void setParmJobgroup800(Field source) {
       replace(source,0,source.length(),beginParmJobgroup800,PARM_JOBGROUP_800_LEN);
   	
   }  
   
     /**
	 * 	Update ParmJobgroup800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setParmJobgroup800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginParmJobgroup800,PARM_JOBGROUP_800_LEN);
   	
   }
   
     /**
	 * 	Update ParmJobgroup800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParmJobgroup800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParmJobgroup800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of parmJobgrpNum800
	 *	@return parmJobgrpNum800
	 */
	public int getParmJobgrpNum800() throws CFException {
       if (isParmJobgrpNum800Modified()) { 
           parmJobgrpNum800 = refreshParmJobgrpNum800();
        }
   		return parmJobgrpNum800;
	}
	

	
	   
	/**
	 * 	Update ParmJobgrpNum800 with the passed value
	 *  Corresponding COBOL Variable is 800-PARM-JOBGRP-NUM
	 *	@param number
	 */
	public void setParmJobgrpNum800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    parmJobgrpNum800 = checkParmJobgrpNum800MaxLimit(number); 
		serializeParmJobgrpNum800(parmJobgrpNum800);
	}
	

	public void setParmJobgrpNum800(long number) {
	    number = checkParmJobgrpNum800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setParmJobgrpNum800((int)number);
	}
	
	/**
	 * 	Update ParmJobgrpNum800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setParmJobgrpNum800(char[] value) throws CFException {
		 parmJobgrpNum800 = serializeParmJobgrpNum800(value);
	}
	/**
	 * 	Update ParmJobgrpNum800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setParmJobgrpNum800String(char[] value) throws CFException {
		 setParmJobgrpNum800(value);
	}
	/**
	 *	Returns the value of commitCnt800
	 *	@return commitCnt800
	 */
	public int getCommitCnt800() throws CFException {
       if (isCommitCnt800Modified()) { 
           commitCnt800 = refreshCommitCnt800();
        }
   		return commitCnt800;
	}
	

	
	   
	/**
	 * 	Update CommitCnt800 with the passed value
	 *  Corresponding COBOL Variable is 800-COMMIT-CNT
	 *	@param number
	 */
	public void setCommitCnt800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    commitCnt800 = checkCommitCnt800MaxLimit(number); 
		serializeCommitCnt800(commitCnt800);
	}
	

	public void setCommitCnt800(long number) {
	    number = checkCommitCnt800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setCommitCnt800((int)number);
	}
	
	/**
	 * 	Update CommitCnt800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCommitCnt800(char[] value) throws CFException {
		 commitCnt800 = serializeCommitCnt800(value);
	}
	/**
	 * 	Update CommitCnt800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCommitCnt800String(char[] value) throws CFException {
		 setCommitCnt800(value);
	}
	/**
	 *	Returns the value of cloneOwnerId800
	 *	@return cloneOwnerId800
	 */
   public char[] getCloneOwnerId800() throws CFException{
     if (isCloneOwnerId800Modified()) { 
        cloneOwnerId800 = refreshCloneOwnerId800();
     }
   		return cloneOwnerId800;
   }

  
	/**
	*  set variable cloneOwnerId800
	*  Corresponding COBOL Variable is 800-CLONE-OWNER-ID
	*  @param value
	**/
   public void setCloneOwnerId800(char[] value) {
      cloneOwnerId800 = checkCloneOwnerId800Constraints(value);
      serializeCloneOwnerId800(cloneOwnerId800);
   } 

     /**
	 * 	Update CloneOwnerId800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCloneOwnerId800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCloneOwnerId800,cloneOwnerId800.length);
   	
   }
   
   public void setCloneOwnerId800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCloneOwnerId800,cloneOwnerId800.length);
   	
   }
   
     /**
	 * 	Update CloneOwnerId800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCloneOwnerId800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCloneOwnerId800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CloneOwnerId800 with another Field
	 *	@param value
	 */
   public void setCloneOwnerId800(Field source) {
       replace(source,0,source.length(),beginCloneOwnerId800,CLONE_OWNER_ID_800_LEN);
   	
   }  
   
     /**
	 * 	Update CloneOwnerId800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCloneOwnerId800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCloneOwnerId800,CLONE_OWNER_ID_800_LEN);
   	
   }
   
     /**
	 * 	Update CloneOwnerId800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCloneOwnerId800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCloneOwnerId800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getParmsFieldLength() {
			return PARMS_LENGTH;
		}

}
  

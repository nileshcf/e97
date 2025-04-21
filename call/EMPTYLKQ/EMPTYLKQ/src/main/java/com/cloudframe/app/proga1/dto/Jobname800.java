package com.cloudframe.app.proga1.dto;

/**
*  The class Jobname800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/


import com.cloudframe.app.proga1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Jobname800 extends Jobname800Serialized {
   

						private char[] jobGroup800 = new char[6];

						private char[] pgmModule800 = new char[8];
	
	/**
	* Constructor for Jobname800
	**/
    public Jobname800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setJobGroup800(fillSpace(6));
								setPgmModule800(("PROGB1  ").toCharArray());
    }


 

	/**
	 *	Returns the value of jobGroup800
	 *	@return jobGroup800
	 */
   public char[] getJobGroup800() throws CFException{
     if (isJobGroup800Modified()) { 
        jobGroup800 = refreshJobGroup800();
     }
   		return jobGroup800;
   }

  
	/**
	*  set variable jobGroup800
	*  Corresponding COBOL Variable is 800-JOB-GROUP
	*  @param value
	**/
   public void setJobGroup800(char[] value) {
      jobGroup800 = checkJobGroup800Constraints(value);
      serializeJobGroup800(jobGroup800);
   } 

     /**
	 * 	Update JobGroup800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setJobGroup800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginJobGroup800,jobGroup800.length);
   	
   }
   
   public void setJobGroup800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginJobGroup800,jobGroup800.length);
   	
   }
   
     /**
	 * 	Update JobGroup800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setJobGroup800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginJobGroup800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update JobGroup800 with another Field
	 *	@param value
	 */
   public void setJobGroup800(Field source) {
       replace(source,0,source.length(),beginJobGroup800,JOB_GROUP_800_LEN);
   	
   }  
   
     /**
	 * 	Update JobGroup800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setJobGroup800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginJobGroup800,JOB_GROUP_800_LEN);
   	
   }
   
     /**
	 * 	Update JobGroup800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setJobGroup800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginJobGroup800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of pgmModule800
	 *	@return pgmModule800
	 */
   public char[] getPgmModule800() throws CFException{
     if (isPgmModule800Modified()) { 
        pgmModule800 = refreshPgmModule800();
     }
   		return pgmModule800;
   }

  
	/**
	*  set variable pgmModule800
	*  Corresponding COBOL Variable is 800-PGM-MODULE
	*  @param value
	**/
   public void setPgmModule800(char[] value) {
      pgmModule800 = checkPgmModule800Constraints(value);
      serializePgmModule800(pgmModule800);
   } 

     /**
	 * 	Update PgmModule800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPgmModule800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPgmModule800,pgmModule800.length);
   	
   }
   
   public void setPgmModule800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPgmModule800,pgmModule800.length);
   	
   }
   
     /**
	 * 	Update PgmModule800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPgmModule800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPgmModule800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PgmModule800 with another Field
	 *	@param value
	 */
   public void setPgmModule800(Field source) {
       replace(source,0,source.length(),beginPgmModule800,PGM_MODULE_800_LEN);
   	
   }  
   
     /**
	 * 	Update PgmModule800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPgmModule800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPgmModule800,PGM_MODULE_800_LEN);
   	
   }
   
     /**
	 * 	Update PgmModule800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPgmModule800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPgmModule800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getJobname800FieldLength() {
			return JOBNAME_800_LENGTH;
		}

}
  

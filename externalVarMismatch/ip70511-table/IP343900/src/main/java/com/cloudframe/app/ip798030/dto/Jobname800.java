package com.cloudframe.app.ip798030.dto;

/**
*  The class Jobname800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:15. using version 5.0.0.254
**/


import com.cloudframe.app.ip798030.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Jobname800 extends Jobname800Serialized {
   

						private char[] jobGroup800 = new char[6];

								private int jobNumber800;
	
	/**
	* Constructor for Jobname800
	**/
    public Jobname800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setJobGroup800(fillSpace(6));
								setJobNumber800(0);
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
	 *	Returns the value of jobNumber800
	 *	@return jobNumber800
	 */
	public int getJobNumber800() throws CFException {
       if (isJobNumber800Modified()) { 
           jobNumber800 = refreshJobNumber800();
        }
   		return jobNumber800;
	}
	

	
	   
	/**
	 * 	Update JobNumber800 with the passed value
	 *  Corresponding COBOL Variable is 800-JOB-NUMBER
	 *	@param number
	 */
	public void setJobNumber800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    jobNumber800 = checkJobNumber800MaxLimit(number); 
		serializeJobNumber800(jobNumber800);
	}
	

	public void setJobNumber800(long number) {
	    number = checkJobNumber800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setJobNumber800((int)number);
	}
	
	/**
	 * 	Update JobNumber800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setJobNumber800(char[] value) throws CFException {
		 jobNumber800 = serializeJobNumber800(value);
	}
	/**
	 * 	Update JobNumber800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setJobNumber800String(char[] value) throws CFException {
		 setJobNumber800(value);
	}

	
	
	

		public static int getJobname800FieldLength() {
			return JOBNAME_800_LENGTH;
		}

}
  

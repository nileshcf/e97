package com.cloudframe.app.ar640010.dto;

/**
*  The class ProcDate1000 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ProcDate1000 extends ProcDate1000Serialized { 
   

						private char[] procDateYear1000 = new char[4];

						private char[] procDateDlm11000 = new char[1];

						private char[] procDateMonth1000 = new char[2];

						private char[] procDateDlm21000 = new char[1];

						private char[] procDateDay1000 = new char[2];
	
	/**
	* Constructor for ProcDate1000
	**/
    public ProcDate1000() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ProcDate1000. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ProcDate1000(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setProcDateYear1000(fillSpace(4));
								setProcDateDlm11000(fillSpace(1));
								setProcDateMonth1000(fillSpace(2));
								setProcDateDlm21000(fillSpace(1));
								setProcDateDay1000(fillSpace(2));
    } 

	/**
	 *	Returns the value of procDateYear1000
	 *	@return procDateYear1000
	 */
   public char[] getProcDateYear1000() throws CFException{
     if (isProcDateYear1000Modified()) { 
        procDateYear1000 = refreshProcDateYear1000();
     }
   		return procDateYear1000;
   }

  
	/**
	*  set variable procDateYear1000
	*  Corresponding COBOL Variable is 1000-PROC-DATE-YEAR
	*  @param value
	**/
   public void setProcDateYear1000(char[] value) {
      procDateYear1000 = checkProcDateYear1000Constraints(value);
      serializeProcDateYear1000(procDateYear1000);
   } 

     /**
	 * 	Update ProcDateYear1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setProcDateYear1000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginProcDateYear1000,procDateYear1000.length);
   	
   }
   
   public void setProcDateYear1000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginProcDateYear1000,procDateYear1000.length);
   	
   }
   
     /**
	 * 	Update ProcDateYear1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setProcDateYear1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginProcDateYear1000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ProcDateYear1000 with another Field
	 *	@param value
	 */
   public void setProcDateYear1000(Field source) {
       replace(source,0,source.length(),beginProcDateYear1000,PROC_DATE_YEAR_1000_LEN);
   	
   }  
   
     /**
	 * 	Update ProcDateYear1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setProcDateYear1000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginProcDateYear1000,PROC_DATE_YEAR_1000_LEN);
   	
   }
   
     /**
	 * 	Update ProcDateYear1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setProcDateYear1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginProcDateYear1000+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of procDateDlm11000
	 *	@return procDateDlm11000
	 */
   public char[] getProcDateDlm11000() throws CFException{
     if (isProcDateDlm11000Modified()) { 
        procDateDlm11000 = refreshProcDateDlm11000();
     }
   		return procDateDlm11000;
   }

  
	/**
	*  set variable procDateDlm11000
	*  Corresponding COBOL Variable is 1000-PROC-DATE-DLM-1
	*  @param value
	**/
   public void setProcDateDlm11000(char[] value) {
      procDateDlm11000 = checkProcDateDlm11000Constraints(value);
      serializeProcDateDlm11000(procDateDlm11000);
   } 

     /**
	 * 	Update ProcDateDlm11000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setProcDateDlm11000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginProcDateDlm11000,procDateDlm11000.length);
   	
   }
   
   public void setProcDateDlm11000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginProcDateDlm11000,procDateDlm11000.length);
   	
   }
   
     /**
	 * 	Update ProcDateDlm11000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setProcDateDlm11000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginProcDateDlm11000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ProcDateDlm11000 with another Field
	 *	@param value
	 */
   public void setProcDateDlm11000(Field source) {
       replace(source,0,source.length(),beginProcDateDlm11000,PROC_DATE_DLM_11000_LEN);
   	
   }  
   
     /**
	 * 	Update ProcDateDlm11000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setProcDateDlm11000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginProcDateDlm11000,PROC_DATE_DLM_11000_LEN);
   	
   }
   
     /**
	 * 	Update ProcDateDlm11000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setProcDateDlm11000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginProcDateDlm11000+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of procDateMonth1000
	 *	@return procDateMonth1000
	 */
   public char[] getProcDateMonth1000() throws CFException{
     if (isProcDateMonth1000Modified()) { 
        procDateMonth1000 = refreshProcDateMonth1000();
     }
   		return procDateMonth1000;
   }

  
	/**
	*  set variable procDateMonth1000
	*  Corresponding COBOL Variable is 1000-PROC-DATE-MONTH
	*  @param value
	**/
   public void setProcDateMonth1000(char[] value) {
      procDateMonth1000 = checkProcDateMonth1000Constraints(value);
      serializeProcDateMonth1000(procDateMonth1000);
   } 

     /**
	 * 	Update ProcDateMonth1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setProcDateMonth1000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginProcDateMonth1000,procDateMonth1000.length);
   	
   }
   
   public void setProcDateMonth1000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginProcDateMonth1000,procDateMonth1000.length);
   	
   }
   
     /**
	 * 	Update ProcDateMonth1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setProcDateMonth1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginProcDateMonth1000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ProcDateMonth1000 with another Field
	 *	@param value
	 */
   public void setProcDateMonth1000(Field source) {
       replace(source,0,source.length(),beginProcDateMonth1000,PROC_DATE_MONTH_1000_LEN);
   	
   }  
   
     /**
	 * 	Update ProcDateMonth1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setProcDateMonth1000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginProcDateMonth1000,PROC_DATE_MONTH_1000_LEN);
   	
   }
   
     /**
	 * 	Update ProcDateMonth1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setProcDateMonth1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginProcDateMonth1000+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of procDateDlm21000
	 *	@return procDateDlm21000
	 */
   public char[] getProcDateDlm21000() throws CFException{
     if (isProcDateDlm21000Modified()) { 
        procDateDlm21000 = refreshProcDateDlm21000();
     }
   		return procDateDlm21000;
   }

  
	/**
	*  set variable procDateDlm21000
	*  Corresponding COBOL Variable is 1000-PROC-DATE-DLM-2
	*  @param value
	**/
   public void setProcDateDlm21000(char[] value) {
      procDateDlm21000 = checkProcDateDlm21000Constraints(value);
      serializeProcDateDlm21000(procDateDlm21000);
   } 

     /**
	 * 	Update ProcDateDlm21000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setProcDateDlm21000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginProcDateDlm21000,procDateDlm21000.length);
   	
   }
   
   public void setProcDateDlm21000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginProcDateDlm21000,procDateDlm21000.length);
   	
   }
   
     /**
	 * 	Update ProcDateDlm21000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setProcDateDlm21000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginProcDateDlm21000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ProcDateDlm21000 with another Field
	 *	@param value
	 */
   public void setProcDateDlm21000(Field source) {
       replace(source,0,source.length(),beginProcDateDlm21000,PROC_DATE_DLM_21000_LEN);
   	
   }  
   
     /**
	 * 	Update ProcDateDlm21000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setProcDateDlm21000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginProcDateDlm21000,PROC_DATE_DLM_21000_LEN);
   	
   }
   
     /**
	 * 	Update ProcDateDlm21000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setProcDateDlm21000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginProcDateDlm21000+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of procDateDay1000
	 *	@return procDateDay1000
	 */
   public char[] getProcDateDay1000() throws CFException{
     if (isProcDateDay1000Modified()) { 
        procDateDay1000 = refreshProcDateDay1000();
     }
   		return procDateDay1000;
   }

  
	/**
	*  set variable procDateDay1000
	*  Corresponding COBOL Variable is 1000-PROC-DATE-DAY
	*  @param value
	**/
   public void setProcDateDay1000(char[] value) {
      procDateDay1000 = checkProcDateDay1000Constraints(value);
      serializeProcDateDay1000(procDateDay1000);
   } 

     /**
	 * 	Update ProcDateDay1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setProcDateDay1000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginProcDateDay1000,procDateDay1000.length);
   	
   }
   
   public void setProcDateDay1000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginProcDateDay1000,procDateDay1000.length);
   	
   }
   
     /**
	 * 	Update ProcDateDay1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setProcDateDay1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginProcDateDay1000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ProcDateDay1000 with another Field
	 *	@param value
	 */
   public void setProcDateDay1000(Field source) {
       replace(source,0,source.length(),beginProcDateDay1000,PROC_DATE_DAY_1000_LEN);
   	
   }  
   
     /**
	 * 	Update ProcDateDay1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setProcDateDay1000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginProcDateDay1000,PROC_DATE_DAY_1000_LEN);
   	
   }
   
     /**
	 * 	Update ProcDateDay1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setProcDateDay1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginProcDateDay1000+targetIndex,targetLen);
    
   }

	
	
	

		public static int getProcDate1000FieldLength() {
			return PROC_DATE_1000_LENGTH;
		}

}
  

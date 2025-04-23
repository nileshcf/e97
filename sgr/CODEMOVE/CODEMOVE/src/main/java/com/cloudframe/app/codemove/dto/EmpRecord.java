package com.cloudframe.app.codemove.dto;

/**
*  The class EmpRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:08. using version 5.0.0.254
**/


import com.cloudframe.app.codemove.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


public class EmpRecord extends EmpRecordSerialized {
   

								private long empId;

						private char[] empName = Field.fillLowValue(30);

								private BigDecimal empSalary = BigDecimal.ZERO;
	
	/**
	* Constructor for EmpRecord
	**/
    public EmpRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of empId
	 *	@return empId
	 */
	public long getEmpId() throws CFException {
       if (isEmpIdModified()) { 
           empId = refreshEmpId();
        }
   		return empId;
	}
	

	
	   
	/**
	 * 	Update EmpId with the passed value
	 *  Corresponding COBOL Variable is EMP-ID
	 *	@param number
	 */
	public void setEmpId(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    empId = checkEmpIdMaxLimit(number); 
		serializeEmpId(empId);
	}
	

	/**
	 * 	Update EmpId with the passed value
	 *	@param value (String or char[])
	 */
	public void setEmpId(char[] value) throws CFException {
		 empId = serializeEmpId(value);
	}
	/**
	 * 	Update EmpId with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setEmpIdString(char[] value) throws CFException {
		 setEmpId(value);
	}
	/**
	 *	Returns the value of empName
	 *	@return empName
	 */
   public char[] getEmpName() throws CFException{
     if (isEmpNameModified()) { 
        empName = refreshEmpName();
     }
   		return empName;
   }

  
	/**
	*  set variable empName
	*  Corresponding COBOL Variable is EMP-NAME
	*  @param value
	**/
   public void setEmpName(char[] value) {
      empName = checkEmpNameConstraints(value);
      serializeEmpName(empName);
   } 

     /**
	 * 	Update EmpName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEmpName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEmpName,empName.length);
   	
   }
   
   public void setEmpName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEmpName,empName.length);
   	
   }
   
     /**
	 * 	Update EmpName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEmpName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEmpName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EmpName with another Field
	 *	@param value
	 */
   public void setEmpName(Field source) {
       replace(source,0,source.length(),beginEmpName,EMP_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update EmpName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEmpName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEmpName,EMP_NAME_LEN);
   	
   }
   
     /**
	 * 	Update EmpName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEmpName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEmpName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of empSalary
	 *	@return empSalary
	 */
	public BigDecimal getEmpSalary() throws CFException {
       if (isEmpSalaryModified()) { 
           empSalary = refreshEmpSalary();
        }
   		return empSalary;
	}
	

	
	   
	/**
	 * 	Update EmpSalary with the passed number
	 *  Corresponding COBOL Variable is EMP-SALARY
	 *	@param number
	 */
	public void setEmpSalary(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       empSalary = checkEmpSalaryMaxLimit(number);
	    serializeEmpSalary(empSalary);
   }
	/**
	 * 	Update EmpSalary with the passed value
	 *	@param value (String or char[])
	 */
	public void setEmpSalary(char[] value) throws CFException {
		 empSalary = serializeEmpSalary(value);
	}   

	
	
	

		public static int getEmpRecordFieldLength() {
			return EMP_RECORD_LENGTH;
		}

}
  

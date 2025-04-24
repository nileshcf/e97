package com.cloudframe.app.codemove.dto;

/**
*  The class EmployeeRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:41. using version 5.0.0.254
**/


import com.cloudframe.app.codemove.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


public class EmployeeRecord extends EmployeeRecordSerialized { 
   

								private long employeeId;

						private char[] employeeName = Field.fillLowValue(30);

								private BigDecimal employeeSalary = BigDecimal.ZERO;
	
	/**
	* Constructor for EmployeeRecord
	**/
    public EmployeeRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of employeeId
	 *	@return employeeId
	 */
	public long getEmployeeId() throws CFException {
       if (isEmployeeIdModified()) { 
           employeeId = refreshEmployeeId();
        }
   		return employeeId;
	}
	

	
	   
	/**
	 * 	Update EmployeeId with the passed value
	 *  Corresponding COBOL Variable is EMPLOYEE-ID
	 *	@param number
	 */
	public void setEmployeeId(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    employeeId = checkEmployeeIdMaxLimit(number); 
		serializeEmployeeId(employeeId);
	}
	

	/**
	 * 	Update EmployeeId with the passed value
	 *	@param value (String or char[])
	 */
	public void setEmployeeId(char[] value) throws CFException {
		 employeeId = serializeEmployeeId(value);
	}
	/**
	 * 	Update EmployeeId with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setEmployeeIdString(char[] value) throws CFException {
		 setEmployeeId(value);
	}
	/**
	 *	Returns the value of employeeName
	 *	@return employeeName
	 */
   public char[] getEmployeeName() throws CFException{
     if (isEmployeeNameModified()) { 
        employeeName = refreshEmployeeName();
     }
   		return employeeName;
   }

  
	/**
	*  set variable employeeName
	*  Corresponding COBOL Variable is EMPLOYEE-NAME
	*  @param value
	**/
   public void setEmployeeName(char[] value) {
      employeeName = checkEmployeeNameConstraints(value);
      serializeEmployeeName(employeeName);
   } 

     /**
	 * 	Update EmployeeName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEmployeeName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEmployeeName,employeeName.length);
   	
   }
   
   public void setEmployeeName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEmployeeName,employeeName.length);
   	
   }
   
     /**
	 * 	Update EmployeeName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEmployeeName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEmployeeName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EmployeeName with another Field
	 *	@param value
	 */
   public void setEmployeeName(Field source) {
       replace(source,0,source.length(),beginEmployeeName,EMPLOYEE_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update EmployeeName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEmployeeName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEmployeeName,EMPLOYEE_NAME_LEN);
   	
   }
   
     /**
	 * 	Update EmployeeName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEmployeeName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEmployeeName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of employeeSalary
	 *	@return employeeSalary
	 */
	public BigDecimal getEmployeeSalary() throws CFException {
       if (isEmployeeSalaryModified()) { 
           employeeSalary = refreshEmployeeSalary();
        }
   		return employeeSalary;
	}
	

	
	   
	/**
	 * 	Update EmployeeSalary with the passed number
	 *  Corresponding COBOL Variable is EMPLOYEE-SALARY
	 *	@param number
	 */
	public void setEmployeeSalary(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       employeeSalary = checkEmployeeSalaryMaxLimit(number);
	    serializeEmployeeSalary(employeeSalary);
   }
	/**
	 * 	Update EmployeeSalary with the passed value
	 *	@param value (String or char[])
	 */
	public void setEmployeeSalary(char[] value) throws CFException {
		 employeeSalary = serializeEmployeeSalary(value);
	}   

	
	
	

		public static int getEmployeeRecordFieldLength() {
			return EMPLOYEE_RECORD_LENGTH;
		}

}
  

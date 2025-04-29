package com.cloudframe.app.codemove.dto;

/**
*  The class EmployeeRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


@Data
public class EmployeeRecord extends EmployeeRecordSerialized {
   

								@Getter @Setter private long employeeId;

						@Getter @Setter private char[] employeeName = Field.fillLowValue(30);

								@Getter @Setter private BigDecimal employeeSalary = BigDecimal.ZERO;
	
	/**
	* Constructor for EmployeeRecord
	**/
    public EmployeeRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  

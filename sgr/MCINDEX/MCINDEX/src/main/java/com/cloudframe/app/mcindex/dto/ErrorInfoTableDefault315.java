package com.cloudframe.app.mcindex.dto;

/**
*  The class ErrorInfoTableDefault315 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:33. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;


@Data
public class ErrorInfoTableDefault315 extends ErrorInfoTableDefault315Serialized {
   
			@Getter @Setter private List<ErrorInfoTableEntries315> errorInfoTableEntries315 = new ArrayList<>();
    	
	
	/**
	* Constructor for ErrorInfoTableDefault315
	**/
    public ErrorInfoTableDefault315() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < ERROR_INFO_TABLE_ENTRIES_315_SIZE;arrayIndex++) {
						getErrorInfoTableEntries315().add(new ErrorInfoTableEntries315(this, beginErrorInfoTableEntries315 + 
						arrayIndex * ErrorInfoTableEntries315.getErrorInfoTableEntries315FieldLength()));
				}
	   	/*  end of offset */
			for (int arrayIndex = 0; arrayIndex < ERROR_INFO_TABLE_ENTRIES_315_SIZE;arrayIndex++) {
					getErrorInfoTableEntries315().add(new ErrorInfoTableEntries315(this, beginErrorInfoTableEntries315 + 
						arrayIndex * ErrorInfoTableEntries315.getErrorInfoTableEntries315FieldLength()));
			}
    }





}
  

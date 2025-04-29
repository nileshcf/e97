package com.cloudframe.app.cfsort10.file.records;

/**
*  The class WorkClient is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class WorkClient extends WorkClientSerialized {
   

						@Getter @Setter private char[] clientNameWk = Field.fillLowValue(20);

						@Getter @Setter private char[] clientNumberWk = Field.fillLowValue(7);

						@Getter @Setter private char[] clientPhNoWk = Field.fillLowValue(14);
	
	/**
	* Constructor for WorkClient
	**/
    public WorkClient() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  

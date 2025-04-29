package com.cloudframe.app.casecb00.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:45. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Work extends WorkSerialized {
   

								@Getter @Setter private short s1;

								@Getter @Setter private short s2;

								@Getter @Setter private short s3;

								@Getter @Setter private short s4;

								@Getter @Setter private char[] edit = Field.fillLowValue(5);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setS1((short)0);
								setS2((short)0);
								setS3((short)0);
								setS4((short)0);
    }





}
  

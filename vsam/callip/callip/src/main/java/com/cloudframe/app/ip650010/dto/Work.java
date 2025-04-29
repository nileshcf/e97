package com.cloudframe.app.ip650010.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Work extends WorkSerialized {
   

						@Getter @Setter private char[] isItTheFirstTime100 = new char[1];

						@Getter @Setter private char[] isOptParmFileClosed100 = new char[1];

						@Getter @Setter private char[] optParmFileStatus200 = new char[2];

								@Getter @Setter private int valueOne300;

						@Getter @Setter private char[] fileOpenAbendCode300 = new char[4];

						@Getter @Setter private char[] fileStartAbendCode300 = new char[4];

						@Getter @Setter private char[] fileReadAbendCode300 = new char[4];

						@Getter @Setter private char[] fileCloseAbendCode300 = new char[4];

								@Getter @Setter private long optParmRecLngth400;

								@Getter @Setter private int recordsRead400;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIsItTheFirstTime100(("Y").toCharArray());
								setIsOptParmFileClosed100(("Y").toCharArray());
								setOptParmFileStatus200(("00").toCharArray());
								setValueOne300(1);
								setFileOpenAbendCode300(("3001").toCharArray());
								setFileStartAbendCode300(("3002").toCharArray());
								setFileReadAbendCode300(("3003").toCharArray());
								setFileCloseAbendCode300(("3004").toCharArray());
								setRecordsRead400(0);
    }





}
  

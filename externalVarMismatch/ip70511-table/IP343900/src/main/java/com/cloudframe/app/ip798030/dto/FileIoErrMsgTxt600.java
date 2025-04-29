package com.cloudframe.app.ip798030.dto;

/**
*  The class FileIoErrMsgTxt600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class FileIoErrMsgTxt600 extends FileIoErrMsgTxt600Serialized {
   

							@Getter @Setter private char[] fileIoErrMsgTxt600ConditionGroup1 = new char[14];
						

						@Getter @Setter private char[] fileName600 = new char[30];


						@Getter @Setter private char[] fileStatus600 = new char[2];
	
	/**
	* Constructor for FileIoErrMsgTxt600
	**/
    public FileIoErrMsgTxt600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(14)
             , getStartOffset() + 0
             ,14
             );
								setFileName600(fillSpace(30));
       replaceValue( // serialize and save the value
             ("FILE STATUS :").toCharArray()
             , getStartOffset() + 44
             ,13
             );
								setFileStatus600(fillSpace(2));
    }





}
  

package com.cloudframe.app.ip798030.dto;

/**
*  The class McdynamErrorMsgTxt640 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class McdynamErrorMsgTxt640 extends McdynamErrorMsgTxt640Serialized {
   

						@Getter @Setter private char[] mcdynamRequest640 = new char[10];

						@Getter @Setter private char[] dsn640 = new char[39];



						@Getter @Setter private char[] mcdynamRc640 = new char[4];
	
	/**
	* Constructor for McdynamErrorMsgTxt640
	**/
    public McdynamErrorMsgTxt640() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setMcdynamRequest640(fillSpace(10));
								setDsn640(fillSpace(39));
       replaceValue( // serialize and save the value
             (" FAILED. ").toCharArray()
             , getStartOffset() + 49
             ,9
             );
       replaceValue( // serialize and save the value
             ("RC:").toCharArray()
             , getStartOffset() + 58
             ,3
             );
								setMcdynamRc640(fillSpace(4));
    }





}
  

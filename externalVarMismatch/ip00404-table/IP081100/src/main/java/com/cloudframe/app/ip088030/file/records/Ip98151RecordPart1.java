package com.cloudframe.app.ip088030.file.records;

/**
*  The class Ip98151RecordPart1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip98151RecordPart1 extends Ip98151RecordPart1Serialized { 
   

						@Getter @Setter private char[] ip98151TjfMrchAddr = Field.fillLowValue(25);

						@Getter @Setter private char[] ip98151TjfDe48se32 = Field.fillLowValue(6);

						@Getter @Setter private char[] ip98151TjfTlrMrchId = Field.fillLowValue(6);

						@Getter @Setter private char[] ip98151TjfTlrP176Id = Field.fillLowValue(6);
	
	/**
	* Constructor for Ip98151RecordPart1
	**/
    public Ip98151RecordPart1() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip98151RecordPart1. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip98151RecordPart1(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  

package com.cloudframe.app.ip088030.file.records;

/**
*  The class Sys201RecordPart3 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import com.cloudframe.app.data.Field;


@Data
public class Sys201RecordPart3 extends Sys201RecordPart3Serialized { 
   
			@Getter @Setter private List<Sys201CalcFeeInfo> sys201CalcFeeInfo = new ArrayList<>();
    	
	
	/**
	* Constructor for Sys201RecordPart3
	**/
    public Sys201RecordPart3() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sys201RecordPart3. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sys201RecordPart3(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  

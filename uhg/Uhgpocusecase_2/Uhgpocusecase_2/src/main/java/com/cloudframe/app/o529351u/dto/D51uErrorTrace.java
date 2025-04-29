package com.cloudframe.app.o529351u.dto;

/**
*  The class D51uErrorTrace is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class D51uErrorTrace extends D51uErrorTraceSerialized { 
   

								@Getter @Setter private char[] d51uSqlOrRespCd = Field.fillLowValue(10);

						@Getter @Setter private char[] d51uDebugTracer = Field.fillLowValue(8);

						@Getter @Setter private char[] d51uParagraphNum = Field.fillLowValue(5);
	
	/**
	* Constructor for D51uErrorTrace
	**/
    public D51uErrorTrace() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for D51uErrorTrace. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uErrorTrace(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  

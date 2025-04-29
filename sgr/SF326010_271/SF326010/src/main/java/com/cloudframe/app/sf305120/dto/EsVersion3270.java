package com.cloudframe.app.sf305120.dto;

/**
*  The class EsVersion3270 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class EsVersion3270 extends EsVersion3270Serialized { 
   

						@Getter @Setter private char[] esV3CorrelId270 = Field.fillLowValue(12);

						@Getter @Setter private char[] esV3SrvId270 = Field.fillLowValue(4);

						@Getter @Setter private char[] esV3SiHdrLnth270 = Field.fillLowValue(1);

						@Getter @Setter private char[] esV3SrvStatus270 = Field.fillLowValue(1);

						@Getter @Setter private char[] esV3StatusRc270 = Field.fillLowValue(1);

								@Getter @Setter private short esV3SrvDataLnth270;

						@Getter @Setter private char[] esV3SrvData270 = Field.fillLowValue(7900);
	
	/**
	* Constructor for EsVersion3270
	**/
    public EsVersion3270() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for EsVersion3270. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public EsVersion3270(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  

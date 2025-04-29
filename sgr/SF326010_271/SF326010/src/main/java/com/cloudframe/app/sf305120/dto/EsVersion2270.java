package com.cloudframe.app.sf305120.dto;

/**
*  The class EsVersion2270 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class EsVersion2270 extends EsVersion2270Serialized { 
   

						@Getter @Setter private char[] esV2CorrelId270 = Field.fillLowValue(12);

						@Getter @Setter private char[] esV2SrvId270 = Field.fillLowValue(4);

						@Getter @Setter private char[] esV2SiHdrLnth270 = Field.fillLowValue(1);

						@Getter @Setter private char[] esV2SrvStatus270 = Field.fillLowValue(1);

						@Getter @Setter private char[] esV2StatusRc270 = Field.fillLowValue(1);

								@Getter @Setter private short esV2SrvDataLnth270;

						@Getter @Setter private char[] esV2SrvData270 = Field.fillLowValue(7900);
	
	/**
	* Constructor for EsVersion2270
	**/
    public EsVersion2270() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for EsVersion2270. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public EsVersion2270(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  

package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360ExtPrecisionInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class X360ExtPrecisionInfo extends X360ExtPrecisionInfoSerialized { 
   

								@Getter @Setter private int x360FaAiEpImpDec;

								@Getter @Setter private int x360FaAiEpBaseImpDec;

								@Getter @Setter private long x360FPurchInterEp;

						@Getter @Setter private char[] x360FPurchInterIndEp = Field.fillLowValue(1);

								@Getter @Setter private long x360FCashbkInterEp;

						@Getter @Setter private char[] x360FCashbkInterIndEp = Field.fillLowValue(1);

								@Getter @Setter private long x360APurchInterEp;

						@Getter @Setter private char[] x360APurchInterIndEp = Field.fillLowValue(1);

								@Getter @Setter private long x360ACashbkInterEp;

						@Getter @Setter private char[] x360ACashbkInterIndEp = Field.fillLowValue(1);
	
	/**
	* Constructor for X360ExtPrecisionInfo
	**/
    public X360ExtPrecisionInfo() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for X360ExtPrecisionInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360ExtPrecisionInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  

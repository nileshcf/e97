package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360SrtKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class X360SrtKey extends X360SrtKeySerialized { 
   

						@Getter @Setter private char[] x360SrtRegion = Field.fillLowValue(2);

						@Getter @Setter private char[] x360SrtSubRegion = Field.fillLowValue(1);

						@Getter @Setter private char[] x360SrtProcessorId = Field.fillLowValue(10);

						@Getter @Setter private char[] x360SrtInstId = Field.fillLowValue(10);

						@Getter @Setter private char[] x360SrtBinId = Field.fillLowValue(11);

								@Getter @Setter private int x360SrtCntryN;

								@Getter @Setter private int x360SrtCurrencyCode;

						@Getter @Setter private char[] x360SrtSscServId = Field.fillLowValue(3);

								@Getter @Setter private long x360SrtIca;

						@Getter @Setter private char[] x360SrtIsisAgreeNum = Field.fillLowValue(4);

						@Getter @Setter private char[] x360SrtAcqIssId = Field.fillLowValue(1);

						@Getter @Setter private char[] x360SrtKeyProduct = Field.fillLowValue(3);

						@Getter @Setter private char[] x360SrtKeySubProduct = Field.fillLowValue(3);

						@Getter @Setter private char[] x360SrtKeyTrans = Field.fillLowValue(3);

						@Getter @Setter private char[] x360SrtInterType = Field.fillLowValue(1);

								@Getter @Setter private long x360SrtReconDte;

						@Getter @Setter private char[] x360InhProcFlag = Field.fillLowValue(1);

	
	/**
	* Constructor for X360SrtKey
	**/
    public X360SrtKey() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for X360SrtKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360SrtKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  

package com.cloudframe.app.ip088030.file.records;

/**
*  The class Ip98152RecordPart2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.util.*;


@Data
public class Ip98152RecordPart2 extends Ip98152RecordPart2Serialized { 
   

								@Getter @Setter private long ip98152ClrFxDate;

								@Getter @Setter private long ip98152ClrTxnAmt;

						@Getter @Setter private char[] ip98152ClrTxnCurrCd = Field.fillLowValue(3);
			@Getter @Setter private List<Ip98152ClrSetlInfo> ip98152ClrSetlInfo = new ArrayList<>();
    	

						@Getter @Setter private char[] ip98152FundProdId = Field.fillLowValue(3);

						@Getter @Setter private char[] ip98152FundAcctNum = Field.fillLowValue(19);

						@Getter @Setter private char[] ip98152ActualMcc = Field.fillLowValue(4);

						@Getter @Setter private char[] ip98152FundProdType = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip98152RecordPart2
	**/
    public Ip98152RecordPart2() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip98152RecordPart2. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip98152RecordPart2(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  

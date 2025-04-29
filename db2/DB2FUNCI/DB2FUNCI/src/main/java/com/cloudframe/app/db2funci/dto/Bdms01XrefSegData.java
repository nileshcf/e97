package com.cloudframe.app.db2funci.dto;

/**
*  The class Bdms01XrefSegData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.*;
import com.cloudframe.app.common.CONSTANTS;
import java.util.ArrayList;


@Data
public class Bdms01XrefSegData extends Bdms01XrefSegDataSerialized { 
   

								@Getter @Setter private int bdms01XrefSegSqlcd;

						@Getter @Setter private char[] msdCusipNo = Field.fillLowValue(12);

						@Getter @Setter private char[] msdIsinNumber = Field.fillLowValue(12);

						@Getter @Setter private char[] msdSecuritySymbol = Field.fillLowValue(12);

						@Getter @Setter private char[] msdSedolNo = Field.fillLowValue(7);

						@Getter @Setter private char[] msdEuroNo = Field.fillLowValue(6);

						@Getter @Setter private char[] msdCinNumber = Field.fillLowValue(9);

						@Getter @Setter private char[] msdCommonCode = Field.fillLowValue(9);

						@Getter @Setter private char[] msdSedEuroInd = Field.fillLowValue(1);

						@Getter @Setter private char[] msdExchangeCode = Field.fillLowValue(1);

						@Getter @Setter private char[] msdOtcExchangeCode = Field.fillLowValue(1);
				@Getter @Setter private MsdOtherExchange msdOtherExchange = new MsdOtherExchange();
      private List<char[]> bdms01SecSymbol; 


						@Getter @Setter private char[] bdms01OptionCall = Field.fillLowValue(12);

						@Getter @Setter private char[] bdms01OptionPut = Field.fillLowValue(12);

						@Getter @Setter private char[] bdms01CbCusipNo = Field.fillLowValue(12);

						@Getter @Setter private char[] bdms01PrimaryExchangeCd = Field.fillLowValue(10);
			@Getter @Setter private List<Bdms01OtherExchanges> bdms01OtherExchanges = new ArrayList<>();
    	

						@Getter @Setter private char[] bdms01PostCd = Field.fillLowValue(1);

						@Getter @Setter private char[] msdAlternateSymbol = Field.fillLowValue(12);

						@Getter @Setter private char[] bdms01DualAdpNo = Field.fillLowValue(7);

	
	/**
	* Constructor for Bdms01XrefSegData
	**/
    public Bdms01XrefSegData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Bdms01XrefSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01XrefSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getMsdOtherExchange().setParent(this,getStartOffset() + 74);
				for (int arrayIndex = 0; arrayIndex < BDMS_01_OTHER_EXCHANGES_SIZE;arrayIndex++) {
						getBdms01OtherExchanges().add(new Bdms01OtherExchanges(this, beginBdms01OtherExchanges + 
						arrayIndex * Bdms01OtherExchanges.getBdms01OtherExchangesFieldLength()));
				}
    } 

	/**
	 * 	initializes Bdms01XrefSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01XrefSegSqlcd(0);
         setMsdCusipNo(CONSTANTS.SPACE_12);
         setMsdIsinNumber(CONSTANTS.SPACE_12);
         setMsdSecuritySymbol(CONSTANTS.SPACE_12);
         setMsdSedolNo(CONSTANTS.SPACE_7);
         setMsdEuroNo(CONSTANTS.SPACE_6);
         setMsdCinNumber(CONSTANTS.SPACE_9);
         setMsdCommonCode(CONSTANTS.SPACE_9);
         setMsdSedEuroInd(CONSTANTS.SPACE);
         setMsdExchangeCode(CONSTANTS.SPACE);
         setMsdOtcExchangeCode(CONSTANTS.SPACE);
          getMsdOtherExchange().initialize();
     
         for (int index =0; index < BDMS_01_SEC_SYMBOL_SIZE;index++) {
             setBdms01SecSymbol(index, CONSTANTS.SPACE_12);
         }
         setBdms01OptionCall(CONSTANTS.SPACE_12);
         setBdms01OptionPut(CONSTANTS.SPACE_12);
         setBdms01CbCusipNo(CONSTANTS.SPACE_12);
         setBdms01PrimaryExchangeCd(CONSTANTS.SPACE_10);
     if (bdms01OtherExchanges.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  BDMS_01_OTHER_EXCHANGES_SIZE;index++) {
              Bdms01OtherExchanges  newElement = new Bdms01OtherExchanges(this,beginBdms01OtherExchanges + index * Bdms01OtherExchanges.getBdms01OtherExchangesFieldLength());
              newElement.initialize();
              getBdms01OtherExchanges().add(newElement);
          }
     } else {
        if (bdms01OtherExchanges.size() < BDMS_01_OTHER_EXCHANGES_SIZE) {
          // prefill it first
          for (int index = bdms01OtherExchanges.size();index <  BDMS_01_OTHER_EXCHANGES_SIZE;index++) {
              Bdms01OtherExchanges  newElement = new Bdms01OtherExchanges(this,beginBdms01OtherExchanges + index * Bdms01OtherExchanges.getBdms01OtherExchangesFieldLength());
              getBdms01OtherExchanges().add(newElement);
          }
        }
        
     	for (int index = 0;index <  BDMS_01_OTHER_EXCHANGES_SIZE;index++) {
     		Bdms01OtherExchanges bdms01OtherExchangesVar = bdms01OtherExchanges.get(index);
 			if (bdms01OtherExchangesVar == null) {
                bdms01OtherExchangesVar = new Bdms01OtherExchanges(this,beginBdms01OtherExchanges + index * Bdms01OtherExchanges.getBdms01OtherExchangesFieldLength());
                  getBdms01OtherExchanges().set(index, bdms01OtherExchangesVar);
			} 
			bdms01OtherExchangesVar.initialize();
		}
     }
         setBdms01PostCd(CONSTANTS.SPACE);
         setMsdAlternateSymbol(CONSTANTS.SPACE_12);
         setBdms01DualAdpNo(CONSTANTS.SPACE_7);
   }


}
  

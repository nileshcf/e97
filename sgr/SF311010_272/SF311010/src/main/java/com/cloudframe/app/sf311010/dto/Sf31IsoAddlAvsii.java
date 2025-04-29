package com.cloudframe.app.sf311010.dto;

/**
*  The class Sf31IsoAddlAvsii is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sf31IsoAddlAvsii extends Sf31IsoAddlAvsiiSerialized { 
   

						@Getter @Setter private char[] sf31IsoAvs2Ship2Name = new char[27];

						@Getter @Setter private char[] sf31IsoAvs2Ship2CoName = new char[27];

						@Getter @Setter private char[] sf31IsoAvs2Ship2Add1 = new char[32];

						@Getter @Setter private char[] sf31IsoAvs2Ship2Add2 = new char[32];

						@Getter @Setter private char[] sf31IsoAvs2Ship2City = new char[15];

						@Getter @Setter private char[] sf31IsoAvs2Ship2State = new char[2];

						@Getter @Setter private char[] sf31IsoAvs2Ship2Postal = new char[9];

						@Getter @Setter private char[] sf31IsoAvs2Ship2Country = new char[3];

						@Getter @Setter private char[] sf31IsoAvs2CurrencyCode = new char[3];

						@Getter @Setter private char[] sf31IsoAvs2RespCode = new char[2];

						@Getter @Setter private char[] sf31IsoAvs2PhoneNum = new char[10];

						@Getter @Setter private char[] sf31IsoAvs2FraudAlert = new char[1];

						@Getter @Setter private char[] sf31IsoAvs2RushOrder = new char[1];

	
	/**
	* Constructor for Sf31IsoAddlAvsii
	**/
    public Sf31IsoAddlAvsii() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sf31IsoAddlAvsii. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf31IsoAddlAvsii(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setSf31IsoAvs2Ship2Name(fillSpace(27));
								setSf31IsoAvs2Ship2CoName(fillSpace(27));
								setSf31IsoAvs2Ship2Add1(fillSpace(32));
								setSf31IsoAvs2Ship2Add2(fillSpace(32));
								setSf31IsoAvs2Ship2City(fillSpace(15));
								setSf31IsoAvs2Ship2State(fillSpace(2));
								setSf31IsoAvs2Ship2Postal(fillSpace(9));
								setSf31IsoAvs2Ship2Country(fillSpace(3));
								setSf31IsoAvs2CurrencyCode(fillSpace(3));
								setSf31IsoAvs2RespCode(fillSpace(2));
								setSf31IsoAvs2PhoneNum(fillSpace(10));
								setSf31IsoAvs2FraudAlert(fillSpace(1));
								setSf31IsoAvs2RushOrder(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(11)
             , getStartOffset() + 164
             ,11
             );
    } 



}
  

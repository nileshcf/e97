package com.cloudframe.app.unstrng0.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Work extends WorkSerialized {
   

								@Getter @Setter private short data0Len;

						@Getter @Setter private char[] data0 = new char[98];

						@Getter @Setter private char[] data = new char[150];

						@Getter @Setter private char[] delim1 = Field.fillLowValue(4);

						@Getter @Setter private char[] delim3 = Field.fillLowValue(4);

						@Getter @Setter private char[] delim4 = Field.fillLowValue(4);

								@Getter @Setter private int count;

								@Getter @Setter private int count1;

								@Getter @Setter private long count2;

								@Getter @Setter private int count3;

								@Getter @Setter private long count4;

								@Getter @Setter private int count5;

								@Getter @Setter private long tally;

								@Getter @Setter private long pointer;

						@Getter @Setter private char[] field1 = Field.fillLowValue(35);

						@Getter @Setter private char[] field2 = Field.fillLowValue(30);

						@Getter @Setter private char[] field3 = Field.fillLowValue(35);

						@Getter @Setter private char[] field4 = Field.fillLowValue(35);

						@Getter @Setter private char[] field5 = Field.fillLowValue(60);

						@Getter @Setter private char[] inputRec = new char[100];

						@Getter @Setter private char[] inputRecOverflw1 = new char[100];

						@Getter @Setter private char[] inputRecOverflw2 = new char[100];

						@Getter @Setter private char[] inputRecOverflw3 = new char[100];

						@Getter @Setter private char[] val1 = Field.fillLowValue(30);

						@Getter @Setter private char[] val2 = Field.fillLowValue(30);

						@Getter @Setter private char[] val3 = Field.fillLowValue(30);

						@Getter @Setter private char[] val4 = Field.fillLowValue(30);

						@Getter @Setter private char[] val5 = Field.fillLowValue(30);

						@Getter @Setter private char[] val6 = Field.fillLowValue(30);

						@Getter @Setter private char[] val7 = Field.fillLowValue(30);

						@Getter @Setter private char[] val8 = Field.fillLowValue(30);

						@Getter @Setter private char[] val9 = Field.fillLowValue(30);

						@Getter @Setter private char[] vala = Field.fillLowValue(30);

						@Getter @Setter private char[] valb = Field.fillLowValue(30);

						@Getter @Setter private char[] valc = Field.fillLowValue(30);

						@Getter @Setter private char[] retain = Field.fillLowValue(100);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setData0Len((short)48);
								setData0("Q1234567891234567890,Q8888888888888888889,123456                                                  ".toCharArray());
								setData("***THIS SHOULD GO TO FIELD 1%THIS GOES TO FIELD 2%THIS SHOULD GO TO FIELD 3$$$THIS GOES TO FIELD 4 %THIS GOES TO FIELD 5 AND THIS WILL BE THE END ALL ".toCharArray());
								setInputRec("0000000002|15|2|1||||          |029045003180|4321|2121- SPLAN DESC|                                 ".toCharArray());
								setInputRecOverflw1("0000000002|15|2|1||||          |029045003180|4321|2121- SPLAN DESC                               || ".toCharArray());
								setInputRecOverflw2("0000000002|15|2|1||||          |029045003180|4321|2121- SPLAN DESC                               |  ".toCharArray());
								setInputRecOverflw3("0000000002|15|2|1||||          |029045003180|4321|2121- SPLAN DESC                                  ".toCharArray());
    }





}
  

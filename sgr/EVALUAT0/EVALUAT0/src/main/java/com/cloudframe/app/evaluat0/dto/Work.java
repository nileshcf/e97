package com.cloudframe.app.evaluat0.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:40. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Work extends WorkSerialized {
   

								@Getter @Setter private short num1;

								@Getter @Setter private short num2;

								@Getter @Setter private short age;

								@Getter @Setter private int income;

						@Getter @Setter private char[] gender = new char[1];

						@Getter @Setter private char[] crossReferenceCd = Field.fillLowValue(11);

						@Getter @Setter private char[] rgstrCd = Field.fillLowValue(2);

						@Getter @Setter private char[] msdExchangeCode = Field.fillLowValue(1);

						@Getter @Setter private char[] exchangeCd = Field.fillLowValue(10);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setNum1((short)0);
								setNum2((short)0);
								setAge((short)88);
								setIncome(77777);
								setGender(("M").toCharArray());
    }





}
  

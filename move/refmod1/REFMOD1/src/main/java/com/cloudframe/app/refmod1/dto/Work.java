package com.cloudframe.app.refmod1.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Work extends WorkSerialized {
   

								@Getter @Setter private short sLen;

								@Getter @Setter private short tLen;

						@Getter @Setter private char[] aS2 = Field.fillLowValue(70);

						@Getter @Setter private char[] bS2 = Field.fillLowValue(70);

						@Getter @Setter private char[] aS4 = Field.fillLowValue(70);

						@Getter @Setter private char[] bS4 = Field.fillLowValue(70);

						@Getter @Setter private char[] aS8 = Field.fillLowValue(70);

						@Getter @Setter private char[] bS8 = Field.fillLowValue(70);

						@Getter @Setter private char[] aS12 = Field.fillLowValue(70);

						@Getter @Setter private char[] bS12 = Field.fillLowValue(70);

						@Getter @Setter private char[] aS18 = Field.fillLowValue(70);

						@Getter @Setter private char[] bS18 = Field.fillLowValue(70);

						@Getter @Setter private char[] aS20 = Field.fillLowValue(70);

						@Getter @Setter private char[] bS20 = Field.fillLowValue(70);

						@Getter @Setter private char[] wse2aS = Field.fillLowValue(60);

						@Getter @Setter private char[] wse2bS = Field.fillLowValue(60);

						@Getter @Setter private char[] wse4aS = Field.fillLowValue(60);

						@Getter @Setter private char[] wse4bS = Field.fillLowValue(60);

						@Getter @Setter private char[] wse8aS = Field.fillLowValue(60);

						@Getter @Setter private char[] wse8bS = Field.fillLowValue(60);

						@Getter @Setter private char[] wse12aS = Field.fillLowValue(60);

						@Getter @Setter private char[] wse12bS = Field.fillLowValue(60);

						@Getter @Setter private char[] wse18aS = Field.fillLowValue(60);

						@Getter @Setter private char[] wse18bS = Field.fillLowValue(60);

						@Getter @Setter private char[] wse20aS = Field.fillLowValue(60);

						@Getter @Setter private char[] wse20bS = Field.fillLowValue(60);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  

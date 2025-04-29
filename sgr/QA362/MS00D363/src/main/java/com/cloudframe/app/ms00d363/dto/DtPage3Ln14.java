package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage3Ln14 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class DtPage3Ln14 extends DtPage3Ln14Serialized {
   

						@Getter @Setter private char[] dt314Cc = new char[1];

								@Getter @Setter private char[] dt314NetvatFicnt = Field.fillLowValue(11);


						@Getter @Setter private char[] dt314NetvatFiamt = Field.fillLowValue(16);

						@Getter @Setter private char[] dt314NetvatFiind = new char[2];

						@Getter @Setter private char[] dt314NetvatFvamt = Field.fillLowValue(11);

						@Getter @Setter private char[] dt314NetvatFvind = new char[2];


								@Getter @Setter private char[] dt314NetvatNicnt = Field.fillLowValue(11);

						@Getter @Setter private char[] dt314NetvatNiamt = Field.fillLowValue(16);

						@Getter @Setter private char[] dt314NetvatNiind = new char[2];

						@Getter @Setter private char[] dt314NetvatNvamt = Field.fillLowValue(11);

						@Getter @Setter private char[] dt314NetvatNvind = new char[2];


								@Getter @Setter private char[] dt314NetvatTicnt = Field.fillLowValue(11);

						@Getter @Setter private char[] dt314NetvatTiamt = Field.fillLowValue(16);

						@Getter @Setter private char[] dt314NetvatTiind = new char[2];

						@Getter @Setter private char[] dt314NetvatTvamt = Field.fillLowValue(11);

						@Getter @Setter private char[] dt314NetvatTvind = new char[2];

	
	/**
	* Constructor for DtPage3Ln14
	**/
    public DtPage3Ln14() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt314Cc(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 12
             ,1
             );
								setDt314NetvatFiind(fillSpace(2));
								setDt314NetvatFvind(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 44
             ,2
             );
								setDt314NetvatNiind(fillSpace(2));
								setDt314NetvatNvind(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 88
             ,2
             );
								setDt314NetvatTiind(fillSpace(2));
								setDt314NetvatTvind(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 132
             ,1
             );
    }





}
  

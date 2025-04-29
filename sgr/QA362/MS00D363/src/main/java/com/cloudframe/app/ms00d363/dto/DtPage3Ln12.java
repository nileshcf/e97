package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage3Ln12 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class DtPage3Ln12 extends DtPage3Ln12Serialized {
   

						@Getter @Setter private char[] dt312Cc = new char[1];

								@Getter @Setter private char[] dt312AcqvatFicnt = Field.fillLowValue(11);


						@Getter @Setter private char[] dt312AcqvatFiamt = Field.fillLowValue(16);

						@Getter @Setter private char[] dt312AcqvatFiind = new char[2];

						@Getter @Setter private char[] dt312AcqvatFvamt = Field.fillLowValue(11);

						@Getter @Setter private char[] dt312AcqvatFvind = new char[2];


								@Getter @Setter private char[] dt312AcqvatNicnt = Field.fillLowValue(11);

						@Getter @Setter private char[] dt312AcqvatNiamt = Field.fillLowValue(16);

						@Getter @Setter private char[] dt312AcqvatNiind = new char[2];

						@Getter @Setter private char[] dt312AcqvatNvamt = Field.fillLowValue(11);

						@Getter @Setter private char[] dt312AcqvatNvind = new char[2];


								@Getter @Setter private char[] dt312AcqvatTicnt = Field.fillLowValue(11);

						@Getter @Setter private char[] dt312AcqvatTiamt = Field.fillLowValue(16);

						@Getter @Setter private char[] dt312AcqvatTiind = new char[2];

						@Getter @Setter private char[] dt312AcqvatTvamt = Field.fillLowValue(11);

						@Getter @Setter private char[] dt312AcqvatTvind = new char[2];

	
	/**
	* Constructor for DtPage3Ln12
	**/
    public DtPage3Ln12() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt312Cc(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 12
             ,1
             );
								setDt312AcqvatFiind(fillSpace(2));
								setDt312AcqvatFvind(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 44
             ,2
             );
								setDt312AcqvatNiind(fillSpace(2));
								setDt312AcqvatNvind(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 88
             ,2
             );
								setDt312AcqvatTiind(fillSpace(2));
								setDt312AcqvatTvind(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 132
             ,1
             );
    }





}
  

package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage3Ln13 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class DtPage3Ln13 extends DtPage3Ln13Serialized {
   

						@Getter @Setter private char[] dt313Cc = new char[1];

								@Getter @Setter private char[] dt313IssvatFicnt = Field.fillLowValue(11);


						@Getter @Setter private char[] dt313IssvatFiamt = Field.fillLowValue(16);

						@Getter @Setter private char[] dt313IssvatFiind = new char[2];

						@Getter @Setter private char[] dt313IssvatFvamt = Field.fillLowValue(11);

						@Getter @Setter private char[] dt313IssvatFvind = new char[2];


								@Getter @Setter private char[] dt313IssvatNicnt = Field.fillLowValue(11);

						@Getter @Setter private char[] dt313IssvatNiamt = Field.fillLowValue(16);

						@Getter @Setter private char[] dt313IssvatNiind = new char[2];

						@Getter @Setter private char[] dt313IssvatNvamt = Field.fillLowValue(11);

						@Getter @Setter private char[] dt313IssvatNvind = new char[2];


								@Getter @Setter private char[] dt313IssvatTicnt = Field.fillLowValue(11);

						@Getter @Setter private char[] dt313IssvatTiamt = Field.fillLowValue(16);

						@Getter @Setter private char[] dt313IssvatTiind = new char[2];

						@Getter @Setter private char[] dt313IssvatTvamt = Field.fillLowValue(11);

						@Getter @Setter private char[] dt313IssvatTvind = new char[2];

	
	/**
	* Constructor for DtPage3Ln13
	**/
    public DtPage3Ln13() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt313Cc(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 12
             ,1
             );
								setDt313IssvatFiind(fillSpace(2));
								setDt313IssvatFvind(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 44
             ,2
             );
								setDt313IssvatNiind(fillSpace(2));
								setDt313IssvatNvind(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 88
             ,2
             );
								setDt313IssvatTiind(fillSpace(2));
								setDt313IssvatTvind(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 132
             ,1
             );
    }





}
  

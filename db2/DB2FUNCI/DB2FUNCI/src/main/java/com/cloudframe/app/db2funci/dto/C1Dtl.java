package com.cloudframe.app.db2funci.dto;

/**
*  The class C1Dtl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class C1Dtl extends C1DtlSerialized {
   


						@Getter @Setter private char[] isin = Field.fillLowValue(12);


						@Getter @Setter private char[] sedol = Field.fillLowValue(8);


						@Getter @Setter private char[] ric = Field.fillLowValue(10);


						@Getter @Setter private char[] intlkey = Field.fillLowValue(8);


						@Getter @Setter private char[] company = Field.fillLowValue(40);


						@Getter @Setter private char[] country = Field.fillLowValue(2);


						@Getter @Setter private char[] currency = Field.fillLowValue(3);
	
	/**
	* Constructor for C1Dtl
	**/
    public C1Dtl() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 0
             ,2
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 14
             ,2
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 24
             ,2
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 36
             ,2
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 46
             ,2
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 88
             ,2
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 92
             ,2
             );
    }





}
  

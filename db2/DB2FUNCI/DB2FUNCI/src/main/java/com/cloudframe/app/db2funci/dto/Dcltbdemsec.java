package com.cloudframe.app.db2funci.dto;

/**
*  The class Dcltbdemsec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Dcltbdemsec extends DcltbdemsecSerialized {
   

						@Getter @Setter private char[] isin01 = Field.fillLowValue(12);

						@Getter @Setter private char[] sedol01 = Field.fillLowValue(8);

						@Getter @Setter private char[] ric01 = Field.fillLowValue(10);

						@Getter @Setter private char[] intlkey01 = Field.fillLowValue(8);

						@Getter @Setter private char[] company01 = Field.fillLowValue(40);

						@Getter @Setter private char[] country01 = Field.fillLowValue(2);

						@Getter @Setter private char[] currency1 = Field.fillLowValue(3);

						@Getter @Setter private char[] industry = Field.fillLowValue(40);

						@Getter @Setter private char[] sector = Field.fillLowValue(40);

								@Getter @Setter private int ffmcapmilusd;

						@Getter @Setter private char[] sectorweight = Field.fillLowValue(8);
	
	/**
	* Constructor for Dcltbdemsec
	**/
    public Dcltbdemsec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  

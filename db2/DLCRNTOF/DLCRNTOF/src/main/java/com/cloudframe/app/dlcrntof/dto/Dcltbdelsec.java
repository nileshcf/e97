package com.cloudframe.app.dlcrntof.dto;

/**
*  The class Dcltbdelsec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Dcltbdelsec extends DcltbdelsecSerialized {
   

						@Getter @Setter private char[] isin = Field.fillLowValue(12);

						@Getter @Setter private char[] sedol = Field.fillLowValue(8);

						@Getter @Setter private char[] ric = Field.fillLowValue(10);

						@Getter @Setter private char[] intlkey = Field.fillLowValue(8);

						@Getter @Setter private char[] company = Field.fillLowValue(40);

						@Getter @Setter private char[] country = Field.fillLowValue(2);
	
	/**
	* Constructor for Dcltbdelsec
	**/
    public Dcltbdelsec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  

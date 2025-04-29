package com.cloudframe.app.ar640010.dto;

/**
*  The class Tarafpl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Tarafpl extends TarafplSerialized {
   

						@Getter @Setter private char[] tarafplBulkId = Field.fillLowValue(4);

						@Getter @Setter private char[] tarafplTtlNam = Field.fillLowValue(50);

								@Getter @Setter private short tarafplPrtyNum;

						@Getter @Setter private char[] tarafplAlctnSpcTypeCd = Field.fillLowValue(1);

								@Getter @Setter private int tarafplAlctnSpcPrimNum;

						@Getter @Setter private char[] tarafplSndRcvPrmsnCd = Field.fillLowValue(1);

								@Getter @Setter private int tarafplRecLenNum;

						@Getter @Setter private char[] tarafplRecFrmtCd = Field.fillLowValue(2);

								@Getter @Setter private int tarafplBulkFileSzNum;

						@Getter @Setter private char[] tarafplSystemId = Field.fillLowValue(2);

						@Getter @Setter private char[] tarafplAppEndptId = Field.fillLowValue(7);
	
	/**
	* Constructor for Tarafpl
	**/
    public Tarafpl() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  

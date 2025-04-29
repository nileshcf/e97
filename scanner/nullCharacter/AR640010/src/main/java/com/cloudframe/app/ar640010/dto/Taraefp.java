package com.cloudframe.app.ar640010.dto;

/**
*  The class Taraefp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Taraefp extends TaraefpSerialized {
   

						@Getter @Setter private char[] taraefpEndptId = Field.fillLowValue(7);

						@Getter @Setter private char[] taraefpBulkId = Field.fillLowValue(4);

								@Getter @Setter private short taraefpCyclNum;

								@Getter @Setter private short taraefpAppFileRtnNum;

								@Getter @Setter private short taraefpPrtyNum;

						@Getter @Setter private char[] taraefpTrnsltnSw = Field.fillLowValue(1);

						@Getter @Setter private char[] taraefpTrnsltnRtnNam = Field.fillLowValue(50);

						@Getter @Setter private char[] taraefpXferTypeCd = Field.fillLowValue(1);

						@Getter @Setter private char[] taraefpStatusCd = Field.fillLowValue(1);
	
	/**
	* Constructor for Taraefp
	**/
    public Taraefp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  

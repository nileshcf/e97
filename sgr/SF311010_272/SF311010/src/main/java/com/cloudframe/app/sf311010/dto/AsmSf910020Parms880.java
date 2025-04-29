package com.cloudframe.app.sf311010.dto;

/**
*  The class AsmSf910020Parms880 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class AsmSf910020Parms880 extends AsmSf910020Parms880Serialized {
   

						@Getter @Setter private char[] asmTranByte880 = Field.fillLowValue(1);
				@Getter @Setter private AsmBitSw880 asmBitSw880 = new AsmBitSw880();
	
	/**
	* Constructor for AsmSf910020Parms880
	**/
    public AsmSf910020Parms880() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getAsmBitSw880().setParent(this,getStartOffset() + 1);
	   	/*  end of offset */
    }





}
  

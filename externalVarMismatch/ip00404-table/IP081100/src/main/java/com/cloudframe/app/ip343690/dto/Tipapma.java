package com.cloudframe.app.ip343690.dto;

/**
*  The class Tipapma is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Tipapma extends TipapmaSerialized {
   

						@Getter @Setter private char[] tipapmaVrtlAcctNum = Field.fillLowValue(19);

						@Getter @Setter private char[] tipapmaCrteUpdtTs = Field.fillLowValue(26);

						@Getter @Setter private char[] tipapmaPrimAcctNum = Field.fillLowValue(19);

						@Getter @Setter private char[] tipapmaPrimAcctSeqNum = Field.fillLowValue(3);
	
	/**
	* Constructor for Tipapma
	**/
    public Tipapma() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  

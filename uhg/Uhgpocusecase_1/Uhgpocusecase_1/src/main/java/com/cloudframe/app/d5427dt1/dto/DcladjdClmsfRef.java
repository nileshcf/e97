package com.cloudframe.app.d5427dt1.dto;

/**
*  The class DcladjdClmsfRef is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class DcladjdClmsfRef extends DcladjdClmsfRefSerialized {
   

						@Getter @Setter private char[] drefInvnCtlNbr = Field.fillLowValue(10);

						@Getter @Setter private char[] drefPolNbr = Field.fillLowValue(6);

						@Getter @Setter private char[] drefEeId = Field.fillLowValue(10);

						@Getter @Setter private char[] drefDepnNbr = Field.fillLowValue(2);
	
	/**
	* Constructor for DcladjdClmsfRef
	**/
    public DcladjdClmsfRef() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  

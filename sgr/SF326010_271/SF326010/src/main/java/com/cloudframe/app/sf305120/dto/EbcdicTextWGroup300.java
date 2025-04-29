package com.cloudframe.app.sf305120.dto;

/**
*  The class EbcdicTextWGroup300 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class EbcdicTextWGroup300 extends EbcdicTextWGroup300Serialized {
   
					@Getter @Setter private EbcdicTextW300 ebcdicTextW300 = new EbcdicTextW300();

						@Getter @Setter private char[] ebcdicText300 = Field.fillLowValue(86);
	
	/**
	* Constructor for EbcdicTextWGroup300
	**/
    public EbcdicTextWGroup300() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getEbcdicTextW300().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  

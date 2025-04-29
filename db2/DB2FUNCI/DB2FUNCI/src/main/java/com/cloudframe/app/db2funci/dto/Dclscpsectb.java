package com.cloudframe.app.db2funci.dto;

/**
*  The class Dclscpsectb is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Dclscpsectb extends DclscpsectbSerialized {
   

						@Getter @Setter private char[] scpsecAdpSecurityNo = Field.fillLowValue(8);

						@Getter @Setter private char[] scpsecPriceCd = Field.fillLowValue(3);

						@Getter @Setter private char[] scpsecSourceCd = Field.fillLowValue(3);
	
	/**
	* Constructor for Dclscpsectb
	**/
    public Dclscpsectb() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  

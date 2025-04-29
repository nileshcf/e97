package com.cloudframe.app.sf326010.dto;

/**
*  The class BinDecoderGroup800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class BinDecoderGroup800 extends BinDecoderGroup800Serialized {
   

								@Getter @Setter private short binDecoder800;
					@Getter @Setter private BinDecoder800Redefined binDecoder800Redefined = new BinDecoder800Redefined();
	
	/**
	* Constructor for BinDecoderGroup800
	**/
    public BinDecoderGroup800() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getBinDecoder800Redefined().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setBinDecoder800((short)0);
    }





}
  

package com.cloudframe.app.bm8090m.dto;

/**
*  The class WRespuestaGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class WRespuestaGroup extends WRespuestaGroupSerialized {
   

						@Getter @Setter private char[] wRespuesta = new char[63];
					@Getter @Setter private WRespu wRespu = new WRespu();
	
	/**
	* Constructor for WRespuestaGroup
	**/
    public WRespuestaGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWRespu().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setWRespuesta(pad(63," ".toCharArray(),' ',RIGHT_PAD));
    }





}
  

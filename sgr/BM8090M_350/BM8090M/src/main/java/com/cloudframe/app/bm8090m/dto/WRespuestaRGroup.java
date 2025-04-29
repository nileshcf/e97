package com.cloudframe.app.bm8090m.dto;

/**
*  The class WRespuestaRGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class WRespuestaRGroup extends WRespuestaRGroupSerialized {
   

						@Getter @Setter private char[] wRespuestaR = new char[42];
					@Getter @Setter private WRespuR wRespuR = new WRespuR();
	
	/**
	* Constructor for WRespuestaRGroup
	**/
    public WRespuestaRGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWRespuR().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setWRespuestaR(fillSpace(42));
    }





}
  

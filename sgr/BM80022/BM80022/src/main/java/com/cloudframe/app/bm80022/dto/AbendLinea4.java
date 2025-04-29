package com.cloudframe.app.bm80022.dto;

/**
*  The class AbendLinea4 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class AbendLinea4 extends AbendLinea4Serialized {
   

						@Getter @Setter private char[] filler6 = new char[1];

						@Getter @Setter private char[] filler7 = new char[10];

						@Getter @Setter private char[] abendMensaje = new char[68];

						@Getter @Setter private char[] filler8 = new char[1];
	
	/**
	* Constructor for AbendLinea4
	**/
    public AbendLinea4() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setFiller6(("*").toCharArray());
								setFiller7(("DESCRIP.: ").toCharArray());
								setAbendMensaje(pad(68," ".toCharArray(),' ',RIGHT_PAD));
								setFiller8(("*").toCharArray());
    }





}
  

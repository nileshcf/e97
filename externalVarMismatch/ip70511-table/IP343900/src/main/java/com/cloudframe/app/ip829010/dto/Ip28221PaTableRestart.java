package com.cloudframe.app.ip829010.dto;

/**
*  The class Ip28221PaTableRestart is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip28221PaTableRestart extends Ip28221PaTableRestartSerialized {
   

								@Getter @Setter private short ip28221PaTableLength;

						@Getter @Setter private char[] ip28221Restart = Field.fillLowValue(1);

						@Getter @Setter private char[] ip28221Filler = Field.fillLowValue(79);
	
	/**
	* Constructor for Ip28221PaTableRestart
	**/
    public Ip28221PaTableRestart() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
